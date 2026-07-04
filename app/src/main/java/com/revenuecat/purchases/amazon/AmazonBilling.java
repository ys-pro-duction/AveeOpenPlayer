package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC9591xR;
import com.daaw.C0576Cs0;
import com.daaw.C6190lF0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.google.android.gms.ads.AdRequest;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005Bk\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u001a\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0018\u0010\u001dJA\u0010&\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020%0 *\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u0004\u0018\u00010!2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020.2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020,0 H\u0002¢\u0006\u0004\b/\u00100JK\u00105\u001a\u00020.2\u0006\u00101\u001a\u00020\f2\u001e\u00103\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020%0 \u0012\u0004\u0012\u00020.022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0002¢\u0006\u0004\b5\u00106JW\u0010;\u001a\u00020.2\u0006\u00107\u001a\u00020!2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e20\u0010:\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020,0 \u0012\u0004\u0012\u00020.09H\u0002¢\u0006\u0004\b;\u0010<J1\u0010A\u001a\u00020.2\u0006\u0010=\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020.2\u0006\u0010C\u001a\u00020,H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u00020.2\u0014\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020.02H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020.H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020.2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJT\u0010U\u001a\u00020.2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020!0Q2\u0006\u0010S\u001a\u00020!2\u0018\u0010T\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u001e\u0012\u0004\u0012\u00020.022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0096\u0001¢\u0006\u0004\bU\u0010VJh\u0010Z\u001a\u00020.2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020!2\u0006\u0010?\u001a\u00020>2\b\u0010@\u001a\u0004\u0018\u00010!2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020.092\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0096\u0001¢\u0006\u0004\bZ\u0010[JD\u00105\u001a\u00020.2\u001e\u00103\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020.092\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0096\u0001¢\u0006\u0004\b5\u0010\\J8\u0010]\u001a\u00020.2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020.022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0096\u0001¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020.H\u0016¢\u0006\u0004\b_\u0010LJ\u0017\u0010b\u001a\u00020.2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020.H\u0014¢\u0006\u0004\bd\u0010LJI\u0010h\u001a\u00020.2\u0006\u0010Y\u001a\u00020!2\u0018\u0010e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001e\u0012\u0004\u0012\u00020.022\u0016\u0010g\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02j\u0002`fH\u0016¢\u0006\u0004\bh\u0010iJO\u0010m\u001a\u00020.2\u0006\u0010j\u001a\u00020!2\u0006\u0010k\u001a\u00020!2\u0006\u0010l\u001a\u00020!2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020.022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0016¢\u0006\u0004\bm\u0010nJ[\u0010s\u001a\u00020.2\u0006\u0010p\u001a\u00020o2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020!0Q2\u001c\u0010T\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u001e\u0012\u0004\u0012\u00020.02j\u0002`r2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02j\u0002`fH\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010v\u001a\u00020.2\u0006\u0010u\u001a\u00020\f2\u0006\u0010Z\u001a\u00020%H\u0016¢\u0006\u0004\bv\u0010wJO\u0010y\u001a\u00020.2\u0006\u0010Y\u001a\u00020!2\u0006\u0010p\u001a\u00020o2\u0006\u0010x\u001a\u00020!2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020.022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0016¢\u0006\u0004\by\u0010zJH\u0010\u0080\u0001\u001a\u00020.2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020!2\u0006\u0010|\u001a\u00020{2\b\u0010~\u001a\u0004\u0018\u00010}2\b\u0010@\u001a\u0004\u0018\u00010!2\b\u0010\u007f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0082\u0001\u0010GJK\u00105\u001a\u00020.2\u0006\u0010Y\u001a\u00020!2\u001e\u00103\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020%0 \u0012\u0004\u0012\u00020.022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.02H\u0016¢\u0006\u0004\b5\u0010iJ:\u0010\u0087\u0001\u001a\u00020.2\u0006\u0010X\u001a\u00020W2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u001e2\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020.0\u0085\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020.2\u0007\u0010)\u001a\u00030\u0089\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001b\u0010\u008d\u0001\u001a\u00020.2\u0007\u0010)\u001a\u00030\u008c\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001b\u0010\u0090\u0001\u001a\u00020.2\u0007\u0010)\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020.2\u0007\u0010)\u001a\u00030\u0092\u0001H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0095\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0096\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0097\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0098\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0099\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u009a\u0001R\u0015\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u009b\u0001R\u0015\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u009c\u0001R\u0015\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u009d\u0001R\u0015\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u009e\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u009f\u0001R(\u0010 \u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010\u0098\u0001\u001a\u0005\b¡\u0001\u0010G\"\u0006\b¢\u0001\u0010£\u0001R,\u0010¥\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020.020¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001¨\u0006§\u0001"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBilling;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Landroid/content/Context;", "applicationContext", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "amazonBackend", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "cache", "", "observerMode", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "productDataHandler", "purchaseHandler", "purchaseUpdatesHandler", "userDataHandler", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/amazon/AmazonBackend;Lcom/revenuecat/purchases/amazon/AmazonCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "Lcom/amazon/device/iap/model/Receipt;", "", "", "tokensToSkusMap", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lcom/revenuecat/purchases/models/StoreTransaction;", "toMapOfReceiptHashesToRestoredPurchases", "(Ljava/util/List;Ljava/util/Map;Lcom/amazon/device/iap/model/UserData;)Ljava/util/Map;", "Lorg/json/JSONObject;", "response", "getTermSkuFromJSON", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "Lcom/daaw/G91;", "logErrorsIfAny", "(Ljava/util/Map;)V", "filterOnlyActivePurchases", "Lkotlin/Function1;", "onSuccess", "onError", "queryPurchases", "(ZLcom/daaw/NQ;Lcom/daaw/NQ;)V", "amazonUserID", "receipts", "Lkotlin/Function2;", "onCompletion", "getMissingSkusForReceipts", "(Ljava/lang/String;Ljava/util/List;Lcom/daaw/bR;)V", "receipt", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "presentedOfferingIdentifier", "handleReceipt", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;)V", "error", "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "checkObserverMode", "()Z", "request", "executeRequestOnUIThread", "(Lcom/daaw/NQ;)V", "executePendingRequests", "()V", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "", "skus", "marketplace", "onReceive", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Landroid/app/Activity;", "activity", "appUserID", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;Lcom/daaw/bR;Lcom/daaw/NQ;)V", "(Lcom/daaw/bR;Lcom/daaw/NQ;)V", "getUserData", "(Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "startConnection", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "endConnection", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "shouldTryToConsume", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;)V", ProxyAmazonBillingActivity.EXTRAS_SKU, "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)V", "isConnected", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lcom/daaw/LQ;)V", "Lcom/amazon/device/iap/model/UserDataResponse;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Landroid/content/Context;", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "Z", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/common/DateProvider;", "connected", "getConnected", "setConnected", "(Z)V", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final Handler mainHandler;
    private final boolean observerMode;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<NQ> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$consumeAndSave$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$findPurchaseInPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103421 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onCompletion;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ String $sku;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103421(NQ nq, String str, NQ nq2) {
            super(1);
            this.$onCompletion = nq;
            this.$sku = str;
            this.$onError = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return G91.a;
        }

        public final void invoke(List<StoreTransaction> list) {
            Object next;
            G10.g(list, "it");
            String str = this.$sku;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (G10.c(str, ((StoreTransaction) next).getProductIds().get(0))) {
                        break;
                    }
                }
            }
            StoreTransaction storeTransaction = (StoreTransaction) next;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
                return;
            }
            String str2 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$sku}, 1));
            G10.f(str2, "format(this, *args)");
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str2));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Lcom/daaw/G91;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103431 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ Receipt $receipt;
        final /* synthetic */ UserData $userData;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103431(Receipt receipt, String str, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingIdentifier = str;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return G91.a;
        }

        public final void invoke(JSONObject jSONObject) throws JSONException {
            G10.g(jSONObject, "response");
            Object obj = jSONObject.get("termSku");
            G10.e(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingIdentifier, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC1496Lm.e(storeTransaction));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends AbstractC9591xR implements NQ {
        public AnonymousClass2(Object obj) {
            super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "p0");
            ((AmazonBilling) this.receiver).onPurchaseError(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103441 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ AmazonStoreProduct $storeProduct;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/amazon/device/iap/model/Receipt;", "receipt", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lcom/daaw/G91;", "invoke", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02781 extends AbstractC4192e90 implements InterfaceC3429bR {
            final /* synthetic */ String $presentedOfferingIdentifier;
            final /* synthetic */ AmazonStoreProduct $storeProduct;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02781(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, String str) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingIdentifier = str;
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Receipt) obj, (UserData) obj2);
                return G91.a;
            }

            public final void invoke(Receipt receipt, UserData userData) {
                G10.g(receipt, "receipt");
                G10.g(userData, "userData");
                this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingIdentifier);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass2 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return G91.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                G10.g(purchasesError, "it");
                this.this$0.onPurchaseError(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103441(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, String str2) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingIdentifier = str2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.this.onPurchaseError(purchasesError);
                return;
            }
            PurchaseResponseListener purchaseResponseListener = AmazonBilling.this.purchaseHandler;
            Handler handler = AmazonBilling.this.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            String str2 = this.$presentedOfferingIdentifier;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, str2, new C02781(AmazonBilling.this, amazonStoreProduct, str2), new AnonymousClass2(AmazonBilling.this));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Lcom/daaw/G91;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103452 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103452(NQ nq, String str, NQ nq2) {
            super(1);
            this.$onError = nq;
            this.$purchaseToken = str;
            this.$onSuccess = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return G91.a;
        }

        public final void invoke(JSONObject jSONObject) {
            G10.g(jSONObject, "response");
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{jSONObject.toString()}, 1));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            String termSkuFromJSON = AmazonBilling.this.getTermSkuFromJSON(jSONObject);
            if (termSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(jSONObject));
            } else {
                AmazonBilling.this.cache.cacheSkusByToken(AbstractC1369Kg0.e(D61.a(this.$purchaseToken, termSkuFromJSON)));
                this.$onSuccess.invoke(termSkuFromJSON);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass3 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NQ nq) {
            super(1);
            this.$onError = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Lcom/daaw/G91;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103461 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onReceivePurchaseHistory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103461(NQ nq) {
            super(1);
            this.$onReceivePurchaseHistory = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return G91.a;
        }

        public final void invoke(Map<String, StoreTransaction> map) {
            G10.g(map, "it");
            this.$onReceivePurchaseHistory.invoke(AbstractC2455Um.M0(map.values()));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103471 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onReceive;
        final /* synthetic */ Set<String> $productIds;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/amazon/device/iap/model/UserData;", "userData", "Lcom/daaw/G91;", "invoke", "(Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02791 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onError;
            final /* synthetic */ NQ $onReceive;
            final /* synthetic */ Set<String> $productIds;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02791(AmazonBilling amazonBilling, Set<String> set, NQ nq, NQ nq2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = nq;
                this.$onError = nq2;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserData) obj);
                return G91.a;
            }

            public final void invoke(UserData userData) {
                G10.g(userData, "userData");
                ProductDataResponseListener productDataResponseListener = this.this$0.productDataHandler;
                Set<String> set = this.$productIds;
                String marketplace = userData.getMarketplace();
                G10.f(marketplace, "userData.marketplace");
                productDataResponseListener.getProductData(set, marketplace, this.$onReceive, this.$onError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103471(NQ nq, Set<String> set, NQ nq2) {
            super(1);
            this.$onError = nq;
            this.$productIds = set;
            this.$onReceive = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C02791(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103481 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/amazon/device/iap/model/Receipt;", "receipts", "Lcom/amazon/device/iap/model/UserData;", "userData", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;Lcom/amazon/device/iap/model/UserData;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02801 extends AbstractC4192e90 implements InterfaceC3429bR {
            final /* synthetic */ boolean $filterOnlyActivePurchases;
            final /* synthetic */ NQ $onError;
            final /* synthetic */ NQ $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "tokensToSkusMap", "Lcom/revenuecat/purchases/PurchasesError;", "errors", "Lcom/daaw/G91;", "invoke", "(Ljava/util/Map;Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class C02811 extends AbstractC4192e90 implements InterfaceC3429bR {
                final /* synthetic */ List<Receipt> $filteredReceipts;
                final /* synthetic */ NQ $onError;
                final /* synthetic */ NQ $onSuccess;
                final /* synthetic */ UserData $userData;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02811(AmazonBilling amazonBilling, NQ nq, List<Receipt> list, UserData userData, NQ nq2) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = nq;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = nq2;
                }

                @Override // com.daaw.InterfaceC3429bR
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Map<String, String>) obj, (Map<String, PurchasesError>) obj2);
                    return G91.a;
                }

                public final void invoke(Map<String, String> map, Map<String, PurchasesError> map2) {
                    G10.g(map, "tokensToSkusMap");
                    G10.g(map2, "errors");
                    this.this$0.logErrorsIfAny(map2);
                    if (map.isEmpty()) {
                        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID));
                    } else {
                        this.$onSuccess.invoke(this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, map, this.$userData));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02801(boolean z, NQ nq, AmazonBilling amazonBilling, NQ nq2) {
                super(2);
                this.$filterOnlyActivePurchases = z;
                this.$onSuccess = nq;
                this.this$0 = amazonBilling;
                this.$onError = nq2;
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((List<Receipt>) obj, (UserData) obj2);
                return G91.a;
            }

            public final void invoke(List<Receipt> list, UserData userData) {
                List list2;
                G10.g(list, "receipts");
                G10.g(userData, "userData");
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    list2 = arrayList;
                } else {
                    list2 = list;
                }
                if (list2.isEmpty()) {
                    this.$onSuccess.invoke(AbstractC1473Lg0.h());
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                G10.f(userId, "userData.userId");
                amazonBilling2.getMissingSkusForReceipts(userId, list2, new C02811(this.this$0, this.$onError, list2, userData, this.$onSuccess));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103481(NQ nq, boolean z, NQ nq2) {
            super(1);
            this.$onError = nq;
            this.$filterOnlyActivePurchases = z;
            this.$onSuccess = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchaseUpdatesHandler.queryPurchases(new C02801(this.$filterOnlyActivePurchases, this.$onSuccess, AmazonBilling.this, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z, Handler handler, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i, AbstractC2911Yw abstractC2911Yw) {
        Handler handler2;
        ProductDataResponseListener productDataHandler;
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i & 32) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        if ((i & 64) != 0) {
            handler2 = handler;
            productDataHandler = new ProductDataHandler(defaultPurchasingServiceProvider, handler2);
        } else {
            handler2 = handler;
            productDataHandler = productDataResponseListener;
        }
        this(context, amazonBackend, amazonCache, z, handler, defaultPurchasingServiceProvider, productDataHandler, (i & 128) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context) : purchaseResponseListener, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new UserDataHandler(defaultPurchasingServiceProvider, handler2, null, 4, null) : userDataResponseListener, (i & 1024) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final boolean checkObserverMode() {
        if (!this.observerMode) {
            return false;
        }
        LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.WARNING_AMAZON_OBSERVER_MODE);
        return true;
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (isConnected() && !this.serviceRequests.isEmpty()) {
                try {
                    final NQ nqRemove = this.serviceRequests.remove();
                    runOnUIThread(new Runnable() { // from class: com.daaw.S3
                        @Override // java.lang.Runnable
                        public final void run() {
                            nqRemove.invoke(null);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            G91 g91 = G91.a;
        }
    }

    private final synchronized void executeRequestOnUIThread(NQ request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(request);
                if (isConnected()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getMissingSkusForReceipts(String amazonUserID, List<Receipt> receipts, InterfaceC3429bR onCompletion) {
        Map<String, String> receiptSkus = this.cache.getReceiptSkus();
        Map mapX = AbstractC1473Lg0.x(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Receipt> list = receipts;
        ArrayList<Receipt> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Receipt) obj).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(D61.a(receipt.getReceiptId(), receipt.getSku()));
        }
        AbstractC1473Lg0.p(mapX, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((Receipt) obj2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj3).getReceiptId())) {
                arrayList4.add(obj3);
            }
        }
        if (arrayList4.isEmpty()) {
            onCompletion.invoke(mapX, linkedHashMap);
            return;
        }
        C6190lF0 c6190lF0 = new C6190lF0();
        c6190lF0.B = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = this.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            G10.f(receiptId, "receipt.receiptId");
            InterfaceC3429bR interfaceC3429bR = onCompletion;
            AmazonBilling$getMissingSkusForReceipts$1$1 amazonBilling$getMissingSkusForReceipts$1$1 = new AmazonBilling$getMissingSkusForReceipts$1$1(mapX, receipt2, c6190lF0, this, interfaceC3429bR, linkedHashMap);
            Map map = mapX;
            mapX = map;
            amazonBackend.getAmazonReceiptData(receiptId, amazonUserID, amazonBilling$getMissingSkusForReceipts$1$1, new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, c6190lF0, interfaceC3429bR, map));
            onCompletion = interfaceC3429bR;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTermSkuFromJSON(JSONObject response) {
        try {
            return response.getString("termSku");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, String presentedOfferingIdentifier) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingIdentifier, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC1496Lm.e(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        G10.f(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        G10.f(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new C103431(receipt, presentedOfferingIdentifier, userData, this), new AnonymousClass2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logErrorsIfAny(Map<String, PurchasesError> errors) {
        if (errors.isEmpty()) {
            return;
        }
        String strN0 = AbstractC2455Um.n0(errors.keySet(), "\n", null, null, 0, null, null, 62, null);
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPTS, Arrays.copyOf(new Object[]{strN0}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseError(PurchasesError error) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(error);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (G10.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$0(AmazonBilling amazonBilling) {
        G10.g(amazonBilling, "this$0");
        amazonBilling.startConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str = map.get(receipt.getReceiptId());
            C0576Cs0 c0576Cs0A = null;
            if (str == null) {
                LogWrapperKt.log(LogIntent.AMAZON_ERROR, AmazonStrings.ERROR_FINDING_RECEIPT_SKU);
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                G10.f(receiptId, "receipt.receiptId");
                c0576Cs0A = D61.a(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (c0576Cs0A != null) {
                arrayList.add(c0576Cs0A);
            }
        }
        return AbstractC1473Lg0.t(arrayList);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean shouldTryToConsume, StoreTransaction purchase) {
        G10.g(purchase, "purchase");
        if (checkObserverMode() || purchase.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (shouldTryToConsume) {
            executeRequestOnUIThread(new AnonymousClass1(purchase));
        }
        this.cache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, com.revenuecat.purchases.ProductType productType, String sku, NQ onCompletion, NQ onError) {
        G10.g(appUserID, "appUserID");
        G10.g(productType, "productType");
        G10.g(sku, ProxyAmazonBillingActivity.EXTRAS_SKU);
        G10.g(onCompletion, "onCompletion");
        G10.g(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{sku, productType.name()}, 2));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        queryAllPurchases(appUserID, new C103421(onCompletion, sku, onError), onError);
    }

    public final boolean getConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> skus, String marketplace, NQ onReceive, NQ onError) {
        G10.g(skus, "skus");
        G10.g(marketplace, "marketplace");
        G10.g(onReceive, "onReceive");
        G10.g(onError, "onError");
        this.productDataHandler.getProductData(skus, marketplace, onReceive, onError);
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(NQ onSuccess, NQ onError) {
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        this.userDataHandler.getUserData(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String presentedOfferingIdentifier, Boolean isPersonalizedPrice) {
        G10.g(activity, "activity");
        G10.g(appUserID, "appUserID");
        G10.g(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product != null) {
            AmazonStoreProduct storeProduct = product.getStoreProduct();
            if (checkObserverMode()) {
                return;
            }
            if (replaceProductInfo != null) {
                LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.PRODUCT_CHANGES_NOT_SUPPORTED);
                return;
            } else {
                executeRequestOnUIThread(new C103441(activity, appUserID, storeProduct, presentedOfferingIdentifier));
                return;
            }
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
        String str = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2));
        G10.f(str, "format(this, *args)");
        PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str);
        LogUtilsKt.errorLog(purchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, NQ onSuccess, NQ onError) {
        G10.g(productID, "productID");
        G10.g(purchaseToken, "purchaseToken");
        G10.g(storeUserID, "storeUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        String str = this.cache.getReceiptSkus().get(purchaseToken);
        if (str != null) {
            onSuccess.invoke(str);
        } else {
            this.amazonBackend.getAmazonReceiptData(purchaseToken, storeUserID, new C103452(onError, purchaseToken, onSuccess), new AnonymousClass3(onError));
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse response) {
        G10.g(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.productDataHandler.onProductDataResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse response) {
        G10.g(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.purchaseHandler.onPurchaseResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        G10.g(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse response) {
        G10.g(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.userDataHandler.onUserDataResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, String presentedOfferingIdentifier, InterfaceC3429bR onSuccess, NQ onError) {
        G10.g(mainHandler, "mainHandler");
        G10.g(activity, "activity");
        G10.g(appUserID, "appUserID");
        G10.g(storeProduct, "storeProduct");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        this.purchaseHandler.purchase(mainHandler, activity, appUserID, storeProduct, presentedOfferingIdentifier, onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, NQ onReceivePurchaseHistory, NQ onReceivePurchaseHistoryError) {
        G10.g(appUserID, "appUserID");
        G10.g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        G10.g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchases(false, (NQ) new C103461(onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> productIds, NQ onReceive, NQ onError) {
        G10.g(productType, "productType");
        G10.g(productIds, "productIds");
        G10.g(onReceive, "onReceive");
        G10.g(onError, "onError");
        if (checkObserverMode()) {
            return;
        }
        executeRequestOnUIThread(new C103471(onError, productIds, onReceive));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(InterfaceC3429bR onSuccess, NQ onError) {
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        this.purchaseUpdatesHandler.queryPurchases(onSuccess, onError);
    }

    public final void setConnected(boolean z) {
        this.connected = z;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, LQ subscriptionStatusChange) {
        G10.g(activity, "activity");
        G10.g(inAppMessageTypes, "inAppMessageTypes");
        G10.g(subscriptionStatusChange, "subscriptionStatusChange");
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        if (checkObserverMode()) {
            return;
        }
        this.purchasingServiceProvider.registerListener(this.applicationContext, this);
        this.connected = true;
        executePendingRequests();
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        runOnUIThread(new Runnable() { // from class: com.daaw.T3
            @Override // java.lang.Runnable
            public final void run() {
                AmazonBilling.startConnectionOnMainThread$lambda$0(this.B);
            }
        });
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, NQ onSuccess, NQ onError) {
        G10.g(appUserID, "appUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        if (checkObserverMode()) {
            return;
        }
        queryPurchases(true, onSuccess, onError);
    }

    private final void queryPurchases(boolean filterOnlyActivePurchases, NQ onSuccess, NQ onError) {
        executeRequestOnUIThread(new C103481(onError, filterOnlyActivePurchases, onSuccess));
    }

    public AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z, Handler handler, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider) {
        G10.g(context, "applicationContext");
        G10.g(amazonBackend, "amazonBackend");
        G10.g(amazonCache, "cache");
        G10.g(handler, "mainHandler");
        G10.g(purchasingServiceProvider, "purchasingServiceProvider");
        G10.g(productDataResponseListener, "productDataHandler");
        G10.g(purchaseResponseListener, "purchaseHandler");
        G10.g(purchaseUpdatesResponseListener, "purchaseUpdatesHandler");
        G10.g(userDataResponseListener, "userDataHandler");
        G10.g(dateProvider, "dateProvider");
        this.applicationContext = context;
        this.amazonBackend = amazonBackend;
        this.cache = amazonCache;
        this.observerMode = z;
        this.mainHandler = handler;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataResponseListener;
        this.purchaseHandler = purchaseResponseListener;
        this.purchaseUpdatesHandler = purchaseUpdatesResponseListener;
        this.userDataHandler = userDataResponseListener;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, DeviceCache deviceCache, boolean z, Handler handler, BackendHelper backendHelper) {
        this(context, new AmazonBackend(backendHelper), new AmazonCache(deviceCache), z, handler, null, null, null, null, null, null, 2016, null);
        G10.g(context, "applicationContext");
        G10.g(deviceCache, "cache");
        G10.g(handler, "mainHandler");
        G10.g(backendHelper, "backendHelper");
    }
}
