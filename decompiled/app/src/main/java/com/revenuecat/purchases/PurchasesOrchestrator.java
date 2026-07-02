package com.revenuecat.purchases;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.o;
import com.daaw.AbstractC1188In;
import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC3192ab0;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC5431ib;
import com.daaw.AbstractC9588xQ0;
import com.daaw.AbstractC9867yQ0;
import com.daaw.BY0;
import com.daaw.C6748nF0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC3648cC0;
import com.daaw.LQ;
import com.daaw.NQ;
import com.daaw.O90;
import com.revenuecat.purchases.PurchasesOrchestrator;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0086\u00022\u00020\u00012\u00020\u0002:\u0002\u0086\u0002B\u009f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,JA\u00107\u001a\u0002062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0-2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J#\u0010<\u001a\u0002062\u0006\u00109\u001a\u00020\u00052\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u0002062\f\u0010?\u001a\b\u0012\u0004\u0012\u0002060>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010B\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0011\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020C01H\u0002¢\u0006\u0004\bL\u0010MJG\u0010U\u001a:\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u0002060Oj\u0002`R\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u0002060Oj\u0002`T0NH\u0002¢\u0006\u0004\bU\u0010VJQ\u0010X\u001a:\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u0002060Oj\u0002`R\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u0002060Oj\u0002`T0N2\b\u0010W\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bX\u0010YJ\u001b\u0010@\u001a\u000206*\u00020Z2\u0006\u0010[\u001a\u00020SH\u0002¢\u0006\u0004\b@\u0010\\JU\u0010g\u001a\u0002062\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020\u00052\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010c\u001a\u00020b2\u0006\u00109\u001a\u00020\u00052\b\u0010d\u001a\u0004\u0018\u00010\u00052\b\u0010e\u001a\u0004\u0018\u00010)2\u0006\u0010f\u001a\u00020ZH\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u000206H\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u000206H\u0016¢\u0006\u0004\bk\u0010jJ\u000f\u0010l\u001a\u000206H\u0016¢\u0006\u0004\bl\u0010jJ\u0017\u0010m\u001a\u0002062\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bm\u0010nJ\u0019\u0010p\u001a\u0002062\n\b\u0002\u0010f\u001a\u0004\u0018\u00010o¢\u0006\u0004\bp\u0010qJ9\u0010x\u001a\u0002062\u0006\u0010r\u001a\u00020\u00052\u0006\u0010s\u001a\u00020\u00052\u0006\u0010t\u001a\u00020\u00052\b\u0010u\u001a\u0004\u0018\u00010\u00052\b\u0010w\u001a\u0004\u0018\u00010v¢\u0006\u0004\bx\u0010yJ\u0015\u0010{\u001a\u0002062\u0006\u0010f\u001a\u00020z¢\u0006\u0004\b{\u0010|J/\u0010~\u001a\u0002062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u0005012\n\b\u0002\u0010}\u001a\u0004\u0018\u00010/2\u0006\u00105\u001a\u000204¢\u0006\u0004\b~\u0010\u007fJ\"\u0010\u0082\u0001\u001a\u0002062\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u00105\u001a\u00020C¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0018\u0010\u0084\u0001\u001a\u0002062\u0006\u00105\u001a\u00020:¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J&\u0010\u0088\u0001\u001a\u0002062\u0007\u0010\u0086\u0001\u001a\u00020\u00052\u000b\b\u0002\u00105\u001a\u0005\u0018\u00010\u0087\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008a\u0001\u001a\u0002062\n\b\u0002\u00105\u001a\u0004\u0018\u00010:¢\u0006\u0006\b\u008a\u0001\u0010\u0085\u0001J\u000f\u0010\u008b\u0001\u001a\u000206¢\u0006\u0005\b\u008b\u0001\u0010jJ\u0018\u0010\u008c\u0001\u001a\u0002062\u0006\u00105\u001a\u00020:¢\u0006\u0006\b\u008c\u0001\u0010\u0085\u0001J\"\u0010\u008c\u0001\u001a\u0002062\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u00105\u001a\u00020:¢\u0006\u0006\b\u008c\u0001\u0010\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u000206¢\u0006\u0005\b\u0090\u0001\u0010jJ(\u0010\u0093\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020b2\u000e\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u000101¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u000f\u0010\u0095\u0001\u001a\u000206¢\u0006\u0005\b\u0095\u0001\u0010jJ2\u00107\u001a\u0002062\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0-2\u0006\u00105\u001a\u000204¢\u0006\u0005\b7\u0010\u0096\u0001J(\u0010\u0099\u0001\u001a\u0002062\u0016\u0010\u0098\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u0002062\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009f\u0001\u001a\u0002062\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b\u009f\u0001\u0010\u009d\u0001J\u001b\u0010¡\u0001\u001a\u0002062\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¡\u0001\u0010\u009d\u0001J\u001b\u0010£\u0001\u001a\u0002062\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b£\u0001\u0010\u009d\u0001J\u001b\u0010¥\u0001\u001a\u0002062\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¥\u0001\u0010\u009d\u0001J\u001b\u0010§\u0001\u001a\u0002062\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b§\u0001\u0010\u009d\u0001J\u001b\u0010©\u0001\u001a\u0002062\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b©\u0001\u0010\u009d\u0001J\u001b\u0010«\u0001\u001a\u0002062\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b«\u0001\u0010\u009d\u0001J\u000f\u0010¬\u0001\u001a\u000206¢\u0006\u0005\b¬\u0001\u0010jJ\u001b\u0010®\u0001\u001a\u0002062\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b®\u0001\u0010\u009d\u0001J\u001b\u0010°\u0001\u001a\u0002062\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b°\u0001\u0010\u009d\u0001J\u001b\u0010²\u0001\u001a\u0002062\t\u0010±\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b²\u0001\u0010\u009d\u0001J\u001b\u0010´\u0001\u001a\u0002062\t\u0010³\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b´\u0001\u0010\u009d\u0001J\u001b\u0010¶\u0001\u001a\u0002062\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¶\u0001\u0010\u009d\u0001J\u001b\u0010¸\u0001\u001a\u0002062\t\u0010·\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¸\u0001\u0010\u009d\u0001J\u001b\u0010º\u0001\u001a\u0002062\t\u0010¹\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bº\u0001\u0010\u009d\u0001J\u001b\u0010¼\u0001\u001a\u0002062\t\u0010»\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¼\u0001\u0010\u009d\u0001J\u001b\u0010¾\u0001\u001a\u0002062\t\u0010½\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\b¾\u0001\u0010\u009d\u0001J\u001b\u0010À\u0001\u001a\u0002062\t\u0010¿\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÀ\u0001\u0010\u009d\u0001J\u001b\u0010Â\u0001\u001a\u0002062\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0006\bÂ\u0001\u0010\u009d\u0001J\u0019\u0010Ã\u0001\u001a\u0002062\u0007\u0010\u0086\u0001\u001a\u00020\u0005¢\u0006\u0006\bÃ\u0001\u0010\u009d\u0001J<\u0010Ä\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020b2\u0006\u0010^\u001a\u00020]2\b\u0010d\u001a\u0004\u0018\u00010\u00052\b\u0010e\u001a\u0004\u0018\u00010)2\u0006\u0010f\u001a\u00020C¢\u0006\u0006\bÄ\u0001\u0010Å\u0001JN\u0010È\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020b2\u0006\u0010^\u001a\u00020]2\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010_\u001a\u00020\u00052\u0006\u0010a\u001a\u00020`2\b\u0010e\u001a\u0004\u0018\u00010)2\u0007\u0010Ç\u0001\u001a\u00020C¢\u0006\u0006\bÈ\u0001\u0010É\u0001JE\u0010Ê\u0001\u001a\u0002062\u0006\u0010c\u001a\u00020b2\u0006\u0010^\u001a\u00020]2\t\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010_\u001a\u00020\u00052\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010f\u001a\u00020F¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ì\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Í\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Î\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ï\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ð\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ñ\u0001R'\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010×\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010Ø\u0001R\u001a\u0010\u001a\u001a\u00020\u00198\u0007¢\u0006\u000f\n\u0005\b\u001a\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010Ü\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010Ý\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010Þ\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010ß\u0001R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010à\u0001R\u0017\u0010&\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010á\u0001R;\u0010ä\u0001\u001a\u00030â\u00012\b\u0010ã\u0001\u001a\u00030â\u00018@@@X\u0080\u000e¢\u0006\u001f\n\u0006\bä\u0001\u0010å\u0001\u0012\u0005\bê\u0001\u0010j\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R!\u0010ð\u0001\u001a\u00030ë\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R*\u0010õ\u0001\u001a\u00020)2\u0007\u0010ã\u0001\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R\u0013\u00109\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R0\u0010ý\u0001\u001a\u0005\u0018\u00010ø\u00012\n\u0010ã\u0001\u001a\u0005\u0018\u00010ø\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R\u0014\u0010þ\u0001\u001a\u00020)8F¢\u0006\b\u001a\u0006\bþ\u0001\u0010ò\u0001R\u0015\u0010\u0082\u0002\u001a\u00030ÿ\u00018F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R*\u0010\u0085\u0002\u001a\u00020)2\u0007\u0010ã\u0001\u001a\u00020)8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0002\u0010ò\u0001\"\u0006\b\u0084\u0002\u0010ô\u0001¨\u0006\u0087\u0002"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/utils/CustomActivityLifecycleHandler;", "Landroid/app/Application;", "application", "", "backingFieldAppUserID", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "diagnosticsSynchronizer", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "syncPurchasesHelper", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "offeringsManager", "Landroid/os/Handler;", "mainHandler", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/SyncPurchasesHelper;Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Landroid/os/Handler;)V", "", "firstTimeInForeground", "shouldRefreshCustomerInfo", "(Z)Z", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "types", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "collectedStoreProducts", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "callback", "Lcom/daaw/G91;", "getProductsOfTypes", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "appUserID", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "completion", "updateAllCaches", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lcom/daaw/LQ;)V", "productId", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "getPurchaseCallback", "(Ljava/lang/String;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getAndClearProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getAndClearAllPurchaseCallbacks", "()Ljava/util/List;", "Landroid/util/Pair;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "getPurchaseCompletedCallbacks", "()Landroid/util/Pair;", "productChangeListener", "getProductChangeCompletedCallbacks", "(Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)Landroid/util/Pair;", "Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", "error", "(Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "oldProductId", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "Landroid/app/Activity;", "activity", "presentedOfferingIdentifier", "isPersonalizedPrice", "listener", "replaceOldPurchaseWithNewProduct", "(Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;)V", "synchronizeSubscriberAttributesIfNeeded", "()V", "onAppBackgrounded", "onAppForegrounded", "onActivityStarted", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncObserverModeAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V", "type", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "email", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "switchUser", "startPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "offeringIdentifier", "purchaseCallback", "startProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "startDeprecatedProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)V", "Landroid/app/Application;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "getAppConfig", "()Lcom/revenuecat/purchases/common/AppConfig;", "setAppConfig", "(Lcom/revenuecat/purchases/common/AppConfig;)V", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "getOfflineEntitlementsManager", "()Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/PurchasesState;", "value", "state", "Lcom/revenuecat/purchases/PurchasesState;", "getState$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesState;", "setState$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PurchasesState;)V", "getState$purchases_defaultsRelease$annotations", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler$delegate", "Lcom/daaw/O90;", "getLifecycleHandler", "()Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "finishTransactions", "getAppUserID", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "allowSharingPlayStoreAccount", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    public static final String frameworkVersion = "7.0.0";
    private static URL proxyURL;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final IdentityManager identityManager;

    /* JADX INFO: renamed from: lifecycleHandler$delegate, reason: from kotlin metadata */
    private final O90 lifecycleHandler;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private volatile PurchasesState state;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements LQ {
        public AnonymousClass2() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m78invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m78invoke() {
            o.m().w().a(PurchasesOrchestrator.this.getLifecycleHandler());
            PurchasesOrchestrator.this.application.registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Lcom/daaw/G91;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "value", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "logHandler", "Ljava/net/URL;", "proxyURL", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "", "frameworkVersion", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i, Object obj) {
            if ((i & 2) != 0) {
                list = AbstractC1599Mm.k();
            }
            companion.canMakePayments(context, list, callback);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            G10.g(context, "context");
            G10.g(features, "features");
            G10.g(callback, "callback");
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.g(context).b().d(new InterfaceC3648cC0() { // from class: com.daaw.YB0
                @Override // com.daaw.InterfaceC3648cC0
                public final void onPurchasesUpdated(com.android.billingclient.api.d dVar, List list) {
                    G10.g(dVar, "<anonymous parameter 0>");
                }
            }).a();
            aVarA.l(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), callback, aVarA, features));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.INSTANCE, z));
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            G10.g(logHandler, "value");
            LogWrapperKt.setCurrentLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            G10.g(logLevel, "value");
            Config.INSTANCE.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            G10.g(platformInfo, "<set-?>");
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$close$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103252 extends AbstractC4192e90 implements LQ {
        public C103252() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m79invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m79invoke() {
            o.m().w().d(PurchasesOrchestrator.this.getLifecycleHandler());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$dispatch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103261 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103261(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m80invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m80invoke() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103271 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103271(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "it");
            this.$listener.onError(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103282 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103282(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return G91.a;
        }

        public final void invoke(Offerings offerings) {
            G10.g(offerings, "it");
            this.$listener.onReceived(offerings);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass3 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m87invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m87invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "customerInfo");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass4 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m88invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m88invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logOut$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103311 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103311(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) throws Throwable {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            synchronized (purchasesOrchestrator) {
                PurchasesState state$purchases_defaultsRelease = purchasesOrchestrator.getState$purchases_defaultsRelease();
                Map map = Collections.EMPTY_MAP;
                G10.f(map, "emptyMap()");
                purchasesOrchestrator.setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, map, null, false, false, 29, null));
                G91 g91 = G91.a;
            }
            PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
            purchasesOrchestrator2.updateAllCaches(purchasesOrchestrator2.identityManager.getCurrentAppUserID(), this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "purchaseRecord", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103322 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ C6748nF0 $previousProductId;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103322(C6748nF0 c6748nF0, PurchasesOrchestrator purchasesOrchestrator, Activity activity, String str, PurchasingData purchasingData, GoogleReplacementMode googleReplacementMode, String str2, Boolean bool) {
            super(1);
            this.$previousProductId = c6748nF0;
            this.this$0 = purchasesOrchestrator;
            this.$activity = activity;
            this.$appUserID = str;
            this.$purchasingData = purchasingData;
            this.$googleReplacementMode = googleReplacementMode;
            this.$presentedOfferingIdentifier = str2;
            this.$isPersonalizedPrice = bool;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoreTransaction) obj);
            return G91.a;
        }

        public final void invoke(StoreTransaction storeTransaction) {
            G10.g(storeTransaction, "purchaseRecord");
            LogIntent logIntent = LogIntent.PURCHASE;
            String str = String.format(PurchaseStrings.FOUND_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$previousProductId.B}, 1));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(storeTransaction, this.$googleReplacementMode), this.$presentedOfferingIdentifier, this.$isPersonalizedPrice);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103333 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103333(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.toString());
            PurchasesOrchestrator.this.getAndClearProductChangeCallback();
            PurchasesOrchestrator.this.getAndClearAllPurchaseCallbacks();
            PurchasesOrchestrator.this.dispatch(this.$listener, purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103341 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103341(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.$appUserID = str;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return G91.a;
        }

        public final void invoke(List<StoreTransaction> list) {
            G10.g(list, "allPurchases");
            if (list.isEmpty()) {
                PurchasesOrchestrator.this.getCustomerInfo(this.$callback);
                return;
            }
            List<StoreTransaction> listH0 = AbstractC2455Um.H0(list, new Comparator() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC1188In.a(Long.valueOf(((StoreTransaction) t).getPurchaseTime()), Long.valueOf(((StoreTransaction) t2).getPurchaseTime()));
                }
            });
            PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
            String str = this.$appUserID;
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            for (StoreTransaction storeTransaction : listH0) {
                purchasesOrchestrator.postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, true, str, PostReceiptInitiationSource.RESTORE, new PurchasesOrchestrator$restorePurchases$1$2$1$1(storeTransaction, listH0, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$1$2$1$2(storeTransaction, listH0, purchasesOrchestrator, receiveCustomerInfoCallback));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103352 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$error = purchasesError;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m91invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m91invoke() {
                this.$callback.onError(this.$error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103352(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103361 extends AbstractC4192e90 implements LQ {
        public C103361() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m92invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m92invoke() {
            PurchasesOrchestrator.syncPurchases$default(PurchasesOrchestrator.this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "normalizedProductID", "Lcom/daaw/G91;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103373 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return G91.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                G10.g(customerInfo, "it");
                String str = String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID}, 2));
                G10.f(str, "format(this, *args)");
                LogWrapperKt.log(LogIntent.PURCHASE, str);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass2 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return G91.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                G10.g(purchasesError, "error");
                String str = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3));
                G10.f(str, "format(this, *args)");
                LogWrapperKt.log(LogIntent.RC_ERROR, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103373(Double d, String str, PurchasesOrchestrator purchasesOrchestrator, String str2, String str3, String str4) {
            super(1);
            this.$price = d;
            this.$isoCurrencyCode = str;
            this.this$0 = purchasesOrchestrator;
            this.$receiptID = str2;
            this.$amazonUserID = str3;
            this.$appUserID = str4;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G91.a;
        }

        public final void invoke(String str) {
            G10.g(str, "normalizedProductID");
            List listE = AbstractC1496Lm.e(str);
            Double d = this.$price;
            Double d2 = (d == null || d.doubleValue() == 0.0d) ? null : d;
            String str2 = this.$isoCurrencyCode;
            this.this$0.postReceiptHelper.postTokenWithoutConsuming(this.$receiptID, this.$amazonUserID, new ReceiptInfo(listE, null, null, null, d2, (str2 == null || BY0.O(str2)) ? null : str2, null, 78, null), this.this$0.getAllowSharingPlayStoreAccount(), this.$appUserID, null, PostReceiptInitiationSource.RESTORE, new AnonymousClass1(this.$receiptID, this.$amazonUserID), new AnonymousClass2(this.$receiptID, this.$amazonUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103384 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103384(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            String str = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, purchasesError}, 3));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(LogIntent.RC_ERROR, str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103391 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103391(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(customerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103402 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103402(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(purchasesError);
            }
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, Handler handler) {
        G10.g(application, "application");
        G10.g(backend, "backend");
        G10.g(billingAbstract, "billing");
        G10.g(deviceCache, "deviceCache");
        G10.g(identityManager, "identityManager");
        G10.g(subscriberAttributesManager, "subscriberAttributesManager");
        G10.g(appConfig, "appConfig");
        G10.g(customerInfoHelper, "customerInfoHelper");
        G10.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        G10.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        G10.g(postReceiptHelper, "postReceiptHelper");
        G10.g(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        G10.g(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        G10.g(syncPurchasesHelper, "syncPurchasesHelper");
        G10.g(offeringsManager, "offeringsManager");
        this.application = application;
        this.backend = backend;
        this.billing = billingAbstract;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.mainHandler = handler;
        this.state = new PurchasesState(null, null, null, false, false, 31, null);
        this.lifecycleHandler = AbstractC3192ab0.a(new PurchasesOrchestrator$lifecycleHandler$2(this));
        identityManager.configure(str);
        billingAbstract.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
            }
        });
        billingAbstract.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        dispatch(new AnonymousClass2());
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
        }
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            if (diagnosticsSynchronizer != null) {
                diagnosticsSynchronizer.clearDiagnosticsFileIfTooBig();
            }
            if (diagnosticsSynchronizer != null) {
                diagnosticsSynchronizer.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final LQ action) {
        if (G10.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: com.daaw.XB0
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator.dispatch$lambda$16(action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$16(LQ lq) {
        G10.g(lq, "$tmp0");
        lq.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> listM0;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map map = Collections.EMPTY_MAP;
            G10.f(map, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, map, null, false, false, 29, null));
            listM0 = AbstractC2455Um.M0(purchaseCallbacksByProductId.values());
        }
        return listM0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback();
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<InterfaceC3429bR, InterfaceC3429bR> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeListener) {
        return new Pair<>(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeListener, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeListener, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseCallback getPurchaseCallback(String productId) {
        PurchaseCallback purchaseCallback = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().get(productId);
        PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacksByProductId.entrySet()) {
            if (!G10.c(entry.getKey(), productId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<InterfaceC3429bR, InterfaceC3429bR> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getPurchasesUpdatedListener.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                G91 g91;
                G10.g(purchasesError, "purchasesError");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        ProductChangeCallback andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                        if (andClearProductChangeCallback != null) {
                            purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                            g91 = G91.a;
                        } else {
                            g91 = null;
                        }
                        if (g91 == null) {
                            Iterator it = purchasesOrchestrator.getAndClearAllPurchaseCallbacks().iterator();
                            while (it.hasNext()) {
                                purchasesOrchestrator.dispatch((PurchaseCallback) it.next(), purchasesError);
                            }
                        }
                        G91 g912 = G91.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> purchases) {
                Pair productChangeCompletedCallbacks;
                G10.g(purchases, "purchases");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        productChangeCompletedCallbacks = purchasesOrchestrator.getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() != null ? purchasesOrchestrator.getProductChangeCompletedCallbacks(purchasesOrchestrator.getAndClearProductChangeCallback()) : purchasesOrchestrator.getPurchaseCompletedCallbacks();
                        G91 g91 = G91.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                PurchasesOrchestrator.this.postTransactionWithProductDetailsHelper.postTransactions(purchases, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), PurchasesOrchestrator.this.getAppUserID(), PostReceiptInitiationSource.PURCHASE, (InterfaceC3429bR) productChangeCompletedCallbacks.first, (InterfaceC3429bR) productChangeCompletedCallbacks.second);
            }
        };
    }

    public static /* synthetic */ void getState$purchases_defaultsRelease$annotations() {
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String oldProductId, GoogleReplacementMode googleReplacementMode, Activity activity, String appUserID, String presentedOfferingIdentifier, Boolean isPersonalizedPrice, PurchaseErrorCallback listener) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError);
            }
            return;
        }
        C6748nF0 c6748nF0 = new C6748nF0();
        c6748nF0.B = oldProductId;
        if (BY0.z(oldProductId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            c6748nF0.B = BY0.z0(oldProductId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
            LogUtilsKt.warnLog("Using incorrect oldProductId: " + oldProductId + ". The productId should not contain the basePlanId. Using productId: " + ((String) c6748nF0.B) + '.');
        }
        this.billing.findPurchaseInPurchaseHistory(appUserID, productType2, (String) c6748nF0.B, new C103322(c6748nF0, this, activity, appUserID, purchasingData, googleReplacementMode, presentedOfferingIdentifier, isPersonalizedPrice), new C103333(listener));
    }

    private final boolean shouldRefreshCustomerInfo(boolean firstTimeInForeground) {
        return !this.appConfig.getCustomEntitlementComputation() && (firstTimeInForeground || this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false));
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    private final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAllCaches(String appUserID, ReceiveCustomerInfoCallback completion) throws Throwable {
        boolean appInBackground = getState$purchases_defaultsRelease().getAppInBackground();
        this.customerInfoHelper.retrieveCustomerInfo(appUserID, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), completion);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, appUserID, appInBackground, null, null, 12, null);
    }

    public static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map map = Collections.EMPTY_MAP;
            G10.f(map, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, map, null, false, false, 29, null));
            G91 g91 = G91.a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new C103252());
    }

    public final void collectDeviceIdentifiers() {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"collectDeviceIdentifiers"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        try {
            allowSharingPlayStoreAccount = getState$purchases_defaultsRelease().getAllowSharingPlayStoreAccount();
        } catch (Throwable th) {
            throw th;
        }
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback callback) {
        G10.g(callback, "callback");
        getCustomerInfo(CacheFetchPolicy.INSTANCE.m66default(), callback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback listener) throws Throwable {
        G10.g(listener, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_defaultsRelease().getAppInBackground(), new C103271(listener), new C103282(listener));
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final void getProducts(List<String> productIds, ProductType type, final GetStoreProductsCallback callback) {
        Set<? extends ProductType> setG;
        G10.g(productIds, "productIds");
        G10.g(callback, "callback");
        if (type == null || (setG = AbstractC9588xQ0.c(type)) == null) {
            setG = AbstractC9867yQ0.g(ProductType.SUBS, ProductType.INAPP);
        }
        getProductsOfTypes(AbstractC2455Um.Q0(productIds), setG, new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getProducts.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                G10.g(error, "error");
                callback.onError(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                G10.g(storeProducts, "storeProducts");
                callback.onReceived(storeProducts);
            }
        });
    }

    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, GetStoreProductsCallback callback) {
        G10.g(productIds, "productIds");
        G10.g(types, "types");
        G10.g(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object obj : types) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes(productIds, AbstractC2455Um.Q0(arrayList), AbstractC1599Mm.k(), callback);
    }

    public final synchronized PurchasesState getState$purchases_defaultsRelease() {
        return this.state;
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String newAppUserID, LogInCallback callback) {
        G10.g(newAppUserID, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        G91 g91 = null;
        if (G10.c(currentAppUserID, newAppUserID)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(newAppUserID, new PurchasesOrchestrator$logIn$2$1(this, newAppUserID, callback), new PurchasesOrchestrator$logIn$2$2(this, callback));
            g91 = G91.a;
        }
        if (g91 == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.INSTANCE.m66default(), getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), ListenerConversionsCommonKt.receiveCustomerInfoCallback(new AnonymousClass3(callback), new AnonymousClass4(callback)));
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback callback) {
        this.identityManager.logOut(new C103311(callback, this));
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        G10.g(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, AbstractC5431ib.h0(InAppMessageType.values()));
        }
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, true, false, 23, null));
            G91 g91 = G91.a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() throws Throwable {
        boolean firstTimeInForeground;
        synchronized (this) {
            firstTimeInForeground = getState$purchases_defaultsRelease().getFirstTimeInForeground();
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, false, false, 7, null));
            G91 g91 = G91.a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.APP_FOREGROUNDED);
        if (shouldRefreshCustomerInfo(firstTimeInForeground)) {
            LogWrapperKt.log(logIntent, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, getAllowSharingPlayStoreAccount(), null, 16, null);
        }
        this.offeringsManager.onAppForeground(this.identityManager.getCurrentAppUserID());
        PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(this.postPendingTransactionsHelper, getAllowSharingPlayStoreAccount(), null, null, 6, null);
        synchronizeSubscriberAttributesIfNeeded();
        OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(this.offlineEntitlementsManager, null, 1, null);
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        G91 g91;
        G10.g(purchaseParams, "purchaseParams");
        G10.g(callback, "callback");
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity(), purchaseParams.getPurchasingData(), purchaseParams.getPresentedOfferingIdentifier(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.getIsPersonalizedPrice(), callback);
            g91 = G91.a;
        } else {
            g91 = null;
        }
        if (g91 == null) {
            startPurchase(purchaseParams.getActivity(), purchaseParams.getPurchasingData(), purchaseParams.getPresentedOfferingIdentifier(), purchaseParams.getIsPersonalizedPrice(), callback);
        }
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback callback) {
        G10.g(callback, "callback");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C103341(callback, currentAppUserID), new C103352(callback));
    }

    public final void setAd(String ad) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAd"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, ad, getAppUserID());
    }

    public final void setAdGroup(String adGroup) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdGroup"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, adGroup, getAppUserID());
    }

    public final void setAdjustID(String adjustID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdjustID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, adjustID, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String airshipChannelID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAirshipChannelID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, airshipChannelID, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z) {
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), Boolean.valueOf(z), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        G10.g(appConfig, "<set-?>");
        this.appConfig = appConfig;
    }

    public final void setAppsflyerID(String appsflyerID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAppsflyerID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, appsflyerID, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> attributes) {
        G10.g(attributes, "attributes");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAttributes"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributes(attributes, getAppUserID());
    }

    public final void setCampaign(String campaign) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCampaign"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, campaign, getAppUserID());
    }

    public final void setCleverTapID(String cleverTapID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCleverTapID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, cleverTapID, getAppUserID(), this.application);
    }

    public final void setCreative(String creative) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCreative"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, creative, getAppUserID());
    }

    public final void setDisplayName(String displayName) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setDisplayName"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, displayName, getAppUserID());
    }

    public final void setEmail(String email) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setEmail"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, email, getAppUserID());
    }

    public final void setFBAnonymousID(String fbAnonymousID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFBAnonymousID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, fbAnonymousID, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z) {
        this.appConfig.setFinishTransactions(z);
    }

    public final void setFirebaseAppInstanceID(String firebaseAppInstanceID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFirebaseAppInstanceID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, firebaseAppInstanceID, getAppUserID());
    }

    public final void setKeyword(String keyword) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"seKeyword"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, keyword, getAppUserID());
    }

    public final void setMediaSource(String mediaSource) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMediaSource"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, mediaSource, getAppUserID());
    }

    public final void setMixpanelDistinctID(String mixpanelDistinctID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMixpanelDistinctID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, mixpanelDistinctID, getAppUserID());
    }

    public final void setMparticleID(String mparticleID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMparticleID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, mparticleID, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String onesignalID) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalID"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, onesignalID, getAppUserID());
    }

    public final void setPhoneNumber(String phoneNumber) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPhoneNumber"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, phoneNumber, getAppUserID());
    }

    public final void setPushToken(String fcmToken) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPushToken"}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, fcmToken, getAppUserID());
    }

    public final synchronized void setState$purchases_defaultsRelease(PurchasesState purchasesState) {
        G10.g(purchasesState, "value");
        this.state = purchasesState;
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        G10.g(activity, "activity");
        G10.g(inAppMessageTypes, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, inAppMessageTypes, new C103361());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.daaw.Yw, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public final void startDeprecatedProductChange(Activity activity, PurchasingData purchasingData, String offeringIdentifier, String oldProductId, GoogleReplacementMode googleReplacementMode, ProductChangeCallback listener) {
        String str;
        ?? r0;
        String currentAppUserID;
        ProductChangeCallback productChangeCallback;
        ?? r10;
        G10.g(activity, "activity");
        G10.g(purchasingData, "purchasingData");
        G10.g(oldProductId, "oldProductId");
        G10.g(listener, "listener");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            G91 g91 = G91.a;
            dispatch(listener, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(purchasingData);
        sb.append(' ');
        if (offeringIdentifier != null) {
            str = PurchaseStrings.OFFERING + offeringIdentifier;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" oldProductId: ");
        sb.append(oldProductId);
        sb.append(" googleReplacementMode ");
        sb.append(googleReplacementMode);
        String str2 = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(new Object[]{sb.toString()}, 1));
        G10.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() == null) {
                    r0 = 0;
                    setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, listener, false, false, 27, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                } else {
                    r0 = 0;
                    currentAppUserID = null;
                }
                G91 g912 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (currentAppUserID != null) {
            productChangeCallback = listener;
            replaceOldPurchaseWithNewProduct(purchasingData, oldProductId, googleReplacementMode, activity, currentAppUserID, offeringIdentifier, null, productChangeCallback);
            r10 = G91.a;
        } else {
            productChangeCallback = listener;
            r10 = r0;
        }
        if (r10 == 0) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, r0, 2, r0);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(productChangeCallback, purchasesError2);
        }
    }

    public final void startProductChange(Activity activity, PurchasingData purchasingData, String offeringIdentifier, String oldProductId, GoogleReplacementMode googleReplacementMode, Boolean isPersonalizedPrice, PurchaseCallback purchaseCallback) {
        String str;
        String currentAppUserID;
        G91 g91;
        G10.g(activity, "activity");
        G10.g(purchasingData, "purchasingData");
        G10.g(oldProductId, "oldProductId");
        G10.g(googleReplacementMode, "googleReplacementMode");
        G10.g(purchaseCallback, "purchaseCallback");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            G91 g912 = G91.a;
            dispatch(purchaseCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(purchasingData);
        sb.append(' ');
        if (offeringIdentifier != null) {
            str = PurchaseStrings.OFFERING + offeringIdentifier;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" oldProductId: ");
        sb.append(oldProductId);
        sb.append(" googleReplacementMode ");
        sb.append(googleReplacementMode);
        String str2 = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(new Object[]{sb.toString()}, 1));
        G10.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    currentAppUserID = null;
                } else {
                    setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, AbstractC1473Lg0.n(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), AbstractC1369Kg0.e(D61.a(purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                }
                G91 g913 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (currentAppUserID != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, oldProductId, googleReplacementMode, activity, currentAppUserID, offeringIdentifier, isPersonalizedPrice, purchaseCallback);
            g91 = G91.a;
        } else {
            g91 = null;
        }
        if (g91 == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError2);
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError2);
            }
        }
    }

    public final void startPurchase(Activity activity, PurchasingData purchasingData, String presentedOfferingIdentifier, Boolean isPersonalizedPrice, PurchaseCallback listener) {
        String str;
        String currentAppUserID;
        G91 g91;
        G10.g(activity, "activity");
        G10.g(purchasingData, "purchasingData");
        G10.g(listener, "listener");
        LogIntent logIntent = LogIntent.PURCHASE;
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(purchasingData);
        sb.append(' ');
        if (presentedOfferingIdentifier != null) {
            str = PurchaseStrings.OFFERING + presentedOfferingIdentifier;
        } else {
            str = null;
        }
        sb.append(str);
        String str2 = String.format(PurchaseStrings.PURCHASE_STARTED, Arrays.copyOf(new Object[]{sb.toString()}, 1));
        G10.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    currentAppUserID = null;
                } else {
                    setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, AbstractC1473Lg0.n(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), AbstractC1369Kg0.e(D61.a(purchasingData.getProductId(), listener))), null, false, false, 29, null));
                    currentAppUserID = this.identityManager.getCurrentAppUserID();
                }
                G91 g912 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (currentAppUserID != null) {
            this.billing.makePurchaseAsync(activity, currentAppUserID, purchasingData, null, presentedOfferingIdentifier, isPersonalizedPrice);
            g91 = G91.a;
        } else {
            g91 = null;
        }
        if (g91 == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(listener, purchasesError);
        }
    }

    public final void switchUser(String newAppUserID) throws Throwable {
        G10.g(newAppUserID, "newAppUserID");
        if (!G10.c(this.identityManager.getCurrentAppUserID(), newAppUserID)) {
            this.identityManager.switchUser(newAppUserID);
            OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, newAppUserID, getState$purchases_defaultsRelease().getAppInBackground(), null, null, 12, null);
        } else {
            String str = String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{newAppUserID}, 1));
            G10.f(str, "format(this, *args)");
            LogUtilsKt.warnLog(str);
        }
    }

    public final void syncObserverModeAmazonPurchase(String productID, String receiptID, String amazonUserID, String isoCurrencyCode, Double price) {
        G10.g(productID, "productID");
        G10.g(receiptID, "receiptID");
        G10.g(amazonUserID, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, Arrays.copyOf(new Object[]{receiptID, amazonUserID}, 2));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(receiptID))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens == null) {
            this.billing.normalizePurchaseData(productID, receiptID, amazonUserID, new C103373(price, isoCurrencyCode, this, receiptID, amazonUserID, this.identityManager.getCurrentAppUserID()), new C103384(receiptID, amazonUserID));
            return;
        }
        String str2 = String.format(PurchaseStrings.SYNCING_PURCHASE_SKIPPING, Arrays.copyOf(new Object[]{receiptID, amazonUserID}, 2));
        G10.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
    }

    public final void syncPurchases(SyncPurchasesCallback listener) {
        this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_defaultsRelease().getAppInBackground(), new C103391(listener), new C103402(listener));
    }

    public final void getCustomerInfo(CacheFetchPolicy fetchPolicy, ReceiveCustomerInfoCallback callback) {
        G10.g(fetchPolicy, "fetchPolicy");
        G10.g(callback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), fetchPolicy, getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new C103261(purchaseErrorCallback, purchasesError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, List<? extends StoreProduct> collectedStoreProducts, GetStoreProductsCallback callback) {
        List<? extends StoreProduct> list;
        GetStoreProductsCallback getStoreProductsCallback;
        Set setP0 = AbstractC2455Um.P0(types);
        ProductType productType = (ProductType) AbstractC2455Um.f0(setP0);
        G91 g91 = null;
        if (productType != null) {
            setP0.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            list = collectedStoreProducts;
            GetStoreProductsCallback getStoreProductsCallback2 = callback;
            this.billing.queryProductDetailsAsync(productType, productIds, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, productIds, setP0, list, getStoreProductsCallback2), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, getStoreProductsCallback2));
            g91 = G91.a;
            getStoreProductsCallback = getStoreProductsCallback2;
        } else {
            list = collectedStoreProducts;
            getStoreProductsCallback = callback;
        }
        if (g91 == null) {
            getStoreProductsCallback.onReceived(list);
        }
    }

    public /* synthetic */ PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, Handler handler, int i, AbstractC2911Yw abstractC2911Yw) {
        this(application, str, backend, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, (i & 131072) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
