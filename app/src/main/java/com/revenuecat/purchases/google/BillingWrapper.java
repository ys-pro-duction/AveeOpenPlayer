package com.revenuecat.purchases.google;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.c;
import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC8417tE0;
import com.daaw.C0576Cs0;
import com.daaw.C3461bZ;
import com.daaw.C5620jF0;
import com.daaw.C6902no0;
import com.daaw.C7015oC0;
import com.daaw.C7294pC0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC1548Lz0;
import com.daaw.InterfaceC3182aZ;
import com.daaw.InterfaceC3370bC0;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC3648cC0;
import com.daaw.InterfaceC7135of;
import com.daaw.InterfaceC9807yB0;
import com.daaw.LE;
import com.daaw.LQ;
import com.daaw.NQ;
import com.daaw.ZY;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.PurchaseHistoryRecordExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u00ad\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020#0\"*\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0012J#\u0010)\u001a\u00020\u00102\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020 H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u001f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b.\u0010/J+\u00103\u001a\u00020\u0010*\u00020'2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u0002002\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J#\u00106\u001a\u00020\u0010*\u00020'2\u0006\u0010!\u001a\u00020 2\u0006\u00102\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J+\u0010;\u001a\u00020\u0010*\u00020'2\u0006\u0010!\u001a\u00020 2\u0006\u00109\u001a\u0002082\u0006\u00102\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J'\u0010A\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010C\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bC\u0010BJ'\u0010D\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bD\u0010BJ\u000f\u0010E\u001a\u00020\u0010H\u0002¢\u0006\u0004\bE\u0010\u0012J?\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140M2\u0006\u0010G\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010J\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bN\u0010OJ5\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140M2\u0006\u0010G\u001a\u00020P2\u0006\u0010J\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bQ\u0010RJ?\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140M2\u0006\u0010G\u001a\u00020S2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010J\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u0014H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0010H\u0016¢\u0006\u0004\b]\u0010\u0012J\u000f\u0010^\u001a\u00020\u0010H\u0014¢\u0006\u0004\b^\u0010\u0012J[\u0010g\u001a\u00020\u00102\u0006\u0010!\u001a\u00020_2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020 0`2\u001c\u0010d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\u001e\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`c2\u0016\u0010f\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`eH\u0016¢\u0006\u0004\bg\u0010hJE\u0010l\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010J\u001a\u00020 2\u0006\u0010j\u001a\u00020i2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010k\u001a\u0004\u0018\u00010 2\b\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bl\u0010mJC\u0010q\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0018\u0010o\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0\u001e\u0012\u0004\u0012\u00020\u00100\u00132\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013¢\u0006\u0004\bq\u0010rJE\u0010s\u001a\u00020\u00102\u0006\u0010J\u001a\u00020 2\u0018\u0010o\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001e\u0012\u0004\u0012\u00020\u00100\u00132\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0004\bs\u0010rJ\u001f\u0010u\u001a\u00020\u00102\u0006\u0010t\u001a\u00020K2\u0006\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\bu\u0010vJ1\u0010|\u001a\u00020\u00102\u0006\u0010w\u001a\u00020 2\u0018\u0010y\u001a\u0014\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100xH\u0000¢\u0006\u0004\bz\u0010{J1\u0010\u007f\u001a\u00020\u00102\u0006\u0010w\u001a\u00020 2\u0018\u0010}\u001a\u0014\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100xH\u0000¢\u0006\u0004\b~\u0010{JN\u0010\u0081\u0001\u001a\u00020\u00102\u0006\u0010J\u001a\u00020 2\u001f\u0010\u0080\u0001\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u00100\u00132\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0005\b\u0081\u0001\u0010rJT\u0010\u0084\u0001\u001a\u00020\u00102\u0006\u0010J\u001a\u00020 2\u0006\u0010!\u001a\u00020_2\u0007\u0010\u0082\u0001\u001a\u00020 2\u0013\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\u00132\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J/\u0010\u0089\u0001\u001a\u00020\u00102\u0007\u0010\u0086\u0001\u001a\u00020 2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00100\u0013H\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J+\u0010\u008b\u0001\u001a\u00020\u00102\u0006\u0010>\u001a\u00020=2\u000f\u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u00102\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u008f\u0001\u0010\u0012J\u0012\u0010\u0090\u0001\u001a\u00020KH\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J:\u0010\u0096\u0001\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010\u001e2\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0094\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0098\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0099\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u009a\u0001R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u009b\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u009c\u0001R6\u0010\u009e\u0001\u001a\u0004\u0018\u00010'2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R%\u0010¦\u0001\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0005\u0012\u00030¥\u00010¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R,\u0010©\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00100\u00130¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010«\u0001\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001¨\u0006®\u0001"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/daaw/cC0;", "Lcom/daaw/of;", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "clientFactory", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/daaw/G91;", "executePendingRequests", "()V", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "request", "executeRequestOnUIThread", "(Lcom/daaw/NQ;)V", "Landroid/app/Activity;", "activity", "Lcom/android/billingclient/api/c;", "params", "launchBillingFlow", "(Landroid/app/Activity;Lcom/android/billingclient/api/c;)V", "", "Lcom/android/billingclient/api/Purchase;", "", "productType", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "toMapOfGooglePurchaseWrapper", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "retryBillingServiceConnectionWithExponentialBackoff", "Lcom/android/billingclient/api/a;", "receivingFunction", "withConnectedClient", "getStackTrace", "()Ljava/lang/String;", "purchase", "completion", "getStoreTransaction", "(Lcom/android/billingclient/api/Purchase;Lcom/daaw/NQ;)V", "Lcom/android/billingclient/api/g;", "Lcom/daaw/Lz0;", "listener", "queryProductDetailsAsyncEnsuringOneResponse", "(Lcom/android/billingclient/api/a;Ljava/lang/String;Lcom/android/billingclient/api/g;Lcom/daaw/Lz0;)V", "Lcom/daaw/yB0;", "queryPurchaseHistoryAsyncEnsuringOneResponse", "(Lcom/android/billingclient/api/a;Ljava/lang/String;Lcom/daaw/yB0;)V", "Lcom/daaw/pC0;", "queryParams", "Lcom/daaw/bC0;", "queryPurchasesAsyncWithTracking", "(Lcom/android/billingclient/api/a;Ljava/lang/String;Lcom/daaw/pC0;Lcom/daaw/bC0;)V", "Lcom/android/billingclient/api/d;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryProductDetailsRequestIfNeeded", "(Ljava/lang/String;Lcom/android/billingclient/api/d;Ljava/util/Date;)V", "trackGoogleQueryPurchasesRequestIfNeeded", "trackGoogleQueryPurchaseHistoryRequestIfNeeded", "trackProductDetailsNotSupportedIfNeeded", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "purchaseInfo", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "appUserID", "", "isPersonalizedPrice", "Lcom/revenuecat/purchases/utils/Result;", "buildPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "buildOneTimePurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "buildSubscriptionPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "error", "sendErrorsToAllPendingRequests", "(Lcom/revenuecat/purchases/PurchasesError;)V", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "startConnection", "endConnection", "Lcom/revenuecat/purchases/ProductType;", "", "productIds", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "presentedOfferingIdentifier", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onReceivePurchaseHistory", "onReceivePurchaseHistoryError", "queryPurchaseHistoryAsync", "(Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "queryAllPurchases", "shouldTryToConsume", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;)V", "token", "Lkotlin/Function2;", "onConsumed", "consumePurchase$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/daaw/bR;)V", "consumePurchase", "onAcknowledged", "acknowledge$purchases_defaultsRelease", "acknowledge", "onSuccess", "queryPurchases", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "purchaseToken", "getPurchaseType$purchases_defaultsRelease", "(Ljava/lang/String;Lcom/daaw/NQ;)V", "getPurchaseType", "purchases", "onPurchasesUpdated", "(Lcom/android/billingclient/api/d;Ljava/util/List;)V", "onBillingSetupFinished", "(Lcom/android/billingclient/api/d;)V", "onBillingServiceDisconnected", "isConnected", "()Z", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lcom/daaw/LQ;)V", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "<set-?>", "billingClient", "Lcom/android/billingclient/api/a;", "getBillingClient", "()Lcom/android/billingclient/api/a;", "setBillingClient", "(Lcom/android/billingclient/api/a;)V", "", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchaseContext", "Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "reconnectMilliseconds", "J", "ClientFactory", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BillingWrapper extends BillingAbstract implements InterfaceC3648cC0, InterfaceC7135of {
    private volatile com.android.billingclient.api.a billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private final ConcurrentLinkedQueue<NQ> serviceRequests;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/daaw/cC0;", "listener", "Lcom/android/billingclient/api/a;", "buildClient", "(Lcom/daaw/cC0;)Lcom/android/billingclient/api/a;", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ClientFactory {
        private final Context context;

        public ClientFactory(Context context) {
            G10.g(context, "context");
            this.context = context;
        }

        public final com.android.billingclient.api.a buildClient(InterfaceC3648cC0 listener) {
            G10.g(listener, "listener");
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.g(this.context).b().d(listener).a();
            G10.f(aVarA, "newBuilder(context).enab…\n                .build()");
            return aVarA;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/android/billingclient/api/d;", "billingResult", "", "purchaseToken", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/d;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements InterfaceC3429bR {
        public AnonymousClass1() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.android.billingclient.api.d) obj, (String) obj2);
            return G91.a;
        }

        public final void invoke(com.android.billingclient.api.d dVar, String str) {
            G10.g(dVar, "billingResult");
            G10.g(str, "purchaseToken");
            if (dVar.b() == 0) {
                BillingWrapper.this.deviceCache.addSuccessfullyPostedToken(str);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(PurchaseStrings.CONSUMING_PURCHASE_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
            G10.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/android/billingclient/api/d;", "billingResult", "", "purchaseToken", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/d;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements InterfaceC3429bR {
        public AnonymousClass2() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.android.billingclient.api.d) obj, (String) obj2);
            return G91.a;
        }

        public final void invoke(com.android.billingclient.api.d dVar, String str) {
            G10.g(dVar, "billingResult");
            G10.g(str, "purchaseToken");
            if (dVar.b() == 0) {
                BillingWrapper.this.deviceCache.addSuccessfullyPostedToken(str);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
            G10.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$findPurchaseInPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103611 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onCompletion;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ String $productId;
        final /* synthetic */ ProductType $productType;
        final /* synthetic */ BillingWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103611(String str, ProductType productType, NQ nq, BillingWrapper billingWrapper, NQ nq2) {
            super(1);
            this.$productId = str;
            this.$productType = productType;
            this.$onError = nq;
            this.this$0 = billingWrapper;
            this.$onCompletion = nq2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2$lambda$1(ProductType productType, NQ nq, String str, NQ nq2, com.android.billingclient.api.d dVar, List list) {
            Object next;
            G10.g(productType, "$productType");
            G10.g(nq, "$onCompletion");
            G10.g(str, "$productId");
            G10.g(nq2, "$onError");
            G10.g(dVar, "result");
            if (!BillingResultExtensionsKt.isSuccessful(dVar)) {
                String str2 = String.format(PurchaseStrings.ERROR_FINDING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1));
                G10.f(str2, "format(this, *args)");
                nq2.invoke(ErrorsKt.billingResponseToPurchasesError(dVar.b(), str2));
                return;
            }
            StoreTransaction storeTransaction = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((PurchaseHistoryRecord) next).b().contains(str)) {
                            break;
                        }
                    }
                }
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) next;
                if (purchaseHistoryRecord != null) {
                    storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord, productType);
                }
            }
            if (storeTransaction != null) {
                nq.invoke(storeTransaction);
                return;
            }
            String str3 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1));
            G10.f(str3, "format(this, *args)");
            nq2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str3));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G91.a;
        }

        public final void invoke(com.android.billingclient.api.a aVar) {
            G91 g91;
            G10.g(aVar, "$this$withConnectedClient");
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{this.$productId, this.$productType.name()}, 2));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(this.$productType);
            if (googleProductType != null) {
                BillingWrapper billingWrapper = this.this$0;
                final ProductType productType = this.$productType;
                final NQ nq = this.$onCompletion;
                final String str2 = this.$productId;
                final NQ nq2 = this.$onError;
                billingWrapper.queryPurchaseHistoryAsyncEnsuringOneResponse(aVar, googleProductType, new InterfaceC9807yB0() { // from class: com.revenuecat.purchases.google.c
                    @Override // com.daaw.InterfaceC9807yB0
                    public final void c(com.android.billingclient.api.d dVar, List list) {
                        BillingWrapper.C103611.invoke$lambda$2$lambda$1(productType, nq, str2, nq2, dVar, list);
                    }
                });
                g91 = G91.a;
            } else {
                g91 = null;
            }
            if (g91 == null) {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103621 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ com.android.billingclient.api.c $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103621(Activity activity, com.android.billingclient.api.c cVar) {
            super(1);
            this.$activity = activity;
            this.$params = cVar;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G91.a;
        }

        public final void invoke(com.android.billingclient.api.a aVar) {
            G10.g(aVar, "$this$withConnectedClient");
            com.android.billingclient.api.d dVarF = aVar.f(this.$activity, this.$params);
            if (dVarF.b() == 0) {
                dVarF = null;
            }
            if (dVarF != null) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(BillingStrings.BILLING_INTENT_FAILED, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVarF)}, 1));
                G10.f(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103632 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplaceProductInfo $replaceProductInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103632(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$activity = activity;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            Result resultBuildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (resultBuildPurchaseParams instanceof Result.Success) {
                BillingWrapper.this.launchBillingFlow(this.$activity, (com.android.billingclient.api.c) ((Result.Success) resultBuildPurchaseParams).getValue());
            } else {
                if (!(resultBuildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) resultBuildPurchaseParams).getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "subsPurchasesList", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103641 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onReceivePurchaseHistory;
        final /* synthetic */ NQ $onReceivePurchaseHistoryError;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "inAppPurchasesList", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02861 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onReceivePurchaseHistory;
            final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02861(NQ nq, List<? extends PurchaseHistoryRecord> list) {
                super(1);
                this.$onReceivePurchaseHistory = nq;
                this.$subsPurchasesList = list;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends PurchaseHistoryRecord>) obj);
                return G91.a;
            }

            public final void invoke(List<? extends PurchaseHistoryRecord> list) {
                G10.g(list, "inAppPurchasesList");
                NQ nq = this.$onReceivePurchaseHistory;
                List<PurchaseHistoryRecord> list2 = this.$subsPurchasesList;
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it.next(), ProductType.SUBS));
                }
                List<? extends PurchaseHistoryRecord> list3 = list;
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it2.next(), ProductType.INAPP));
                }
                nq.invoke(AbstractC2455Um.z0(arrayList, arrayList2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103641(NQ nq, NQ nq2) {
            super(1);
            this.$onReceivePurchaseHistoryError = nq;
            this.$onReceivePurchaseHistory = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends PurchaseHistoryRecord>) obj);
            return G91.a;
        }

        public final void invoke(List<? extends PurchaseHistoryRecord> list) {
            G10.g(list, "subsPurchasesList");
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new C02861(this.$onReceivePurchaseHistory, list), this.$onReceivePurchaseHistoryError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103651 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ Set<String> $nonEmptyProductIds;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onReceive;
        final /* synthetic */ Set<String> $productIds;
        final /* synthetic */ ProductType $productType;
        final /* synthetic */ BillingWrapper this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryProductDetailsAsync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02871 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ String $googleType;
            final /* synthetic */ NQ $onError;
            final /* synthetic */ NQ $onReceive;
            final /* synthetic */ com.android.billingclient.api.g $params;
            final /* synthetic */ Set<String> $productIds;
            final /* synthetic */ BillingWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02871(BillingWrapper billingWrapper, String str, com.android.billingclient.api.g gVar, Set<String> set, NQ nq, NQ nq2) {
                super(1);
                this.this$0 = billingWrapper;
                this.$googleType = str;
                this.$params = gVar;
                this.$productIds = set;
                this.$onReceive = nq;
                this.$onError = nq2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$3(Set set, NQ nq, NQ nq2, com.android.billingclient.api.d dVar, List list) {
                G10.g(set, "$productIds");
                G10.g(nq, "$onReceive");
                G10.g(nq2, "$onError");
                G10.g(dVar, "billingResult");
                G10.g(list, "productDetailsList");
                if (dVar.b() != 0) {
                    LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                    String str = String.format(OfferingStrings.FETCHING_PRODUCTS_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
                    G10.f(str, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str);
                    PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(dVar.b(), "Error when fetching products. " + BillingResultExtensionsKt.toHumanReadableDescription(dVar));
                    LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                    nq2.invoke(purchasesErrorBillingResponseToPurchasesError);
                    return;
                }
                LogIntent logIntent2 = LogIntent.DEBUG;
                String str2 = String.format(OfferingStrings.FETCHING_PRODUCTS_FINISHED, Arrays.copyOf(new Object[]{AbstractC2455Um.n0(set, null, null, null, 0, null, null, 63, null)}, 1));
                G10.f(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent2, str2);
                LogIntent logIntent3 = LogIntent.PURCHASE;
                String str3 = String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{AbstractC2455Um.n0(list, null, null, null, 0, null, BillingWrapper$queryProductDetailsAsync$1$1$1$1.INSTANCE, 31, null)}, 1));
                G10.f(str3, "format(this, *args)");
                LogWrapperKt.log(logIntent3, str3);
                List<com.android.billingclient.api.f> list2 = !list.isEmpty() ? list : null;
                if (list2 != null) {
                    for (com.android.billingclient.api.f fVar : list2) {
                        LogIntent logIntent4 = LogIntent.PURCHASE;
                        String str4 = String.format(OfferingStrings.LIST_PRODUCTS, Arrays.copyOf(new Object[]{fVar.c(), fVar}, 2));
                        G10.f(str4, "format(this, *args)");
                        LogWrapperKt.log(logIntent4, str4);
                    }
                }
                nq.invoke(StoreProductConversionsKt.toStoreProducts(list));
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.android.billingclient.api.a) obj);
                return G91.a;
            }

            public final void invoke(com.android.billingclient.api.a aVar) {
                G10.g(aVar, "$this$withConnectedClient");
                BillingWrapper billingWrapper = this.this$0;
                String str = this.$googleType;
                com.android.billingclient.api.g gVar = this.$params;
                final Set<String> set = this.$productIds;
                final NQ nq = this.$onReceive;
                final NQ nq2 = this.$onError;
                billingWrapper.queryProductDetailsAsyncEnsuringOneResponse(aVar, str, gVar, new InterfaceC1548Lz0() { // from class: com.revenuecat.purchases.google.d
                    @Override // com.daaw.InterfaceC1548Lz0
                    public final void a(com.android.billingclient.api.d dVar, List list) {
                        BillingWrapper.C103651.C02871.invoke$lambda$3(set, nq, nq2, dVar, list);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103651(ProductType productType, Set<String> set, BillingWrapper billingWrapper, NQ nq, Set<String> set2, NQ nq2) {
            super(1);
            this.$productType = productType;
            this.$nonEmptyProductIds = set;
            this.this$0 = billingWrapper;
            this.$onError = nq;
            this.$productIds = set2;
            this.$onReceive = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
                return;
            }
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(this.$productType);
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            String str = googleProductType;
            com.android.billingclient.api.g gVarBuildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(str, this.$nonEmptyProductIds);
            BillingWrapper billingWrapper = this.this$0;
            billingWrapper.withConnectedClient(new C02871(billingWrapper, str, gVarBuildQueryProductDetailsParams, this.$productIds, this.$onReceive, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103661 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onReceivePurchaseHistory;
        final /* synthetic */ NQ $onReceivePurchaseHistoryError;
        final /* synthetic */ String $productType;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02881 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onReceivePurchaseHistory;
            final /* synthetic */ NQ $onReceivePurchaseHistoryError;
            final /* synthetic */ String $productType;
            final /* synthetic */ BillingWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02881(BillingWrapper billingWrapper, String str, NQ nq, NQ nq2) {
                super(1);
                this.this$0 = billingWrapper;
                this.$productType = str;
                this.$onReceivePurchaseHistory = nq;
                this.$onReceivePurchaseHistoryError = nq2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$3(NQ nq, NQ nq2, com.android.billingclient.api.d dVar, List list) {
                G10.g(nq, "$onReceivePurchaseHistory");
                G10.g(nq2, "$onReceivePurchaseHistoryError");
                G10.g(dVar, "billingResult");
                if (dVar.b() != 0) {
                    PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(dVar.b(), "Error receiving purchase history. " + BillingResultExtensionsKt.toHumanReadableDescription(dVar));
                    LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                    nq2.invoke(purchasesErrorBillingResponseToPurchasesError);
                    return;
                }
                List list2 = list;
                G91 g91 = null;
                List<PurchaseHistoryRecord> list3 = (list2 == null || list2.isEmpty()) ? null : list;
                if (list3 != null) {
                    for (PurchaseHistoryRecord purchaseHistoryRecord : list3) {
                        LogIntent logIntent = LogIntent.RC_PURCHASE_SUCCESS;
                        G10.f(purchaseHistoryRecord, "it");
                        String str = String.format(RestoreStrings.PURCHASE_HISTORY_RETRIEVED, Arrays.copyOf(new Object[]{PurchaseHistoryRecordExtensionsKt.toHumanReadableDescription(purchaseHistoryRecord)}, 1));
                        G10.f(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                    }
                    g91 = G91.a;
                }
                if (g91 == null) {
                    LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.PURCHASE_HISTORY_EMPTY);
                }
                if (list == null) {
                    list = AbstractC1599Mm.k();
                }
                nq.invoke(list);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.android.billingclient.api.a) obj);
                return G91.a;
            }

            public final void invoke(com.android.billingclient.api.a aVar) {
                G10.g(aVar, "$this$withConnectedClient");
                BillingWrapper billingWrapper = this.this$0;
                String str = this.$productType;
                final NQ nq = this.$onReceivePurchaseHistory;
                final NQ nq2 = this.$onReceivePurchaseHistoryError;
                billingWrapper.queryPurchaseHistoryAsyncEnsuringOneResponse(aVar, str, new InterfaceC9807yB0() { // from class: com.revenuecat.purchases.google.e
                    @Override // com.daaw.InterfaceC9807yB0
                    public final void c(com.android.billingclient.api.d dVar, List list) {
                        BillingWrapper.C103661.C02881.invoke$lambda$3(nq, nq2, dVar, list);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103661(NQ nq, String str, NQ nq2) {
            super(1);
            this.$onReceivePurchaseHistoryError = nq;
            this.$productType = str;
            this.$onReceivePurchaseHistory = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onReceivePurchaseHistoryError.invoke(purchasesError);
            } else {
                BillingWrapper billingWrapper = BillingWrapper.this;
                billingWrapper.withConnectedClient(new C02881(billingWrapper, this.$productType, this.$onReceivePurchaseHistory, this.$onReceivePurchaseHistoryError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103671 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;
        final /* synthetic */ BillingWrapper this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02891 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onError;
            final /* synthetic */ NQ $onSuccess;
            final /* synthetic */ BillingWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02891(NQ nq, BillingWrapper billingWrapper, NQ nq2) {
                super(1);
                this.$onError = nq;
                this.this$0 = billingWrapper;
                this.$onSuccess = nq2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1(final NQ nq, final BillingWrapper billingWrapper, com.android.billingclient.api.a aVar, final NQ nq2, com.android.billingclient.api.d dVar, List list) {
                G10.g(nq, "$onError");
                G10.g(billingWrapper, "this$0");
                G10.g(aVar, "$this_withConnectedClient");
                G10.g(nq2, "$onSuccess");
                G10.g(dVar, "activeSubsResult");
                G10.g(list, "activeSubsPurchases");
                if (!BillingResultExtensionsKt.isSuccessful(dVar)) {
                    int iB = dVar.b();
                    String str = String.format(RestoreStrings.QUERYING_SUBS_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
                    G10.f(str, "format(this, *args)");
                    nq.invoke(ErrorsKt.billingResponseToPurchasesError(iB, str));
                    return;
                }
                final Map mapOfGooglePurchaseWrapper = billingWrapper.toMapOfGooglePurchaseWrapper(list, "subs");
                C7294pC0 c7294pC0BuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams("inapp");
                if (c7294pC0BuildQueryPurchasesParams != null) {
                    billingWrapper.queryPurchasesAsyncWithTracking(aVar, "inapp", c7294pC0BuildQueryPurchasesParams, new InterfaceC3370bC0() { // from class: com.revenuecat.purchases.google.f
                        @Override // com.daaw.InterfaceC3370bC0
                        public final void a(com.android.billingclient.api.d dVar2, List list2) {
                            BillingWrapper.C103671.C02891.invoke$lambda$1$lambda$0(nq, billingWrapper, nq2, mapOfGooglePurchaseWrapper, dVar2, list2);
                        }
                    });
                    return;
                }
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchases"}, 1));
                G10.f(str2, "format(this, *args)");
                nq.invoke(new PurchasesError(purchasesErrorCode, str2));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1$lambda$0(NQ nq, BillingWrapper billingWrapper, NQ nq2, Map map, com.android.billingclient.api.d dVar, List list) {
                G10.g(nq, "$onError");
                G10.g(billingWrapper, "this$0");
                G10.g(nq2, "$onSuccess");
                G10.g(map, "$mapOfActiveSubscriptions");
                G10.g(dVar, "unconsumedInAppsResult");
                G10.g(list, "unconsumedInAppsPurchases");
                if (BillingResultExtensionsKt.isSuccessful(dVar)) {
                    nq2.invoke(AbstractC1473Lg0.n(map, billingWrapper.toMapOfGooglePurchaseWrapper(list, "inapp")));
                    return;
                }
                int iB = dVar.b();
                String str = String.format(RestoreStrings.QUERYING_INAPP_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
                G10.f(str, "format(this, *args)");
                nq.invoke(ErrorsKt.billingResponseToPurchasesError(iB, str));
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.android.billingclient.api.a) obj);
                return G91.a;
            }

            public final void invoke(final com.android.billingclient.api.a aVar) {
                G10.g(aVar, "$this$withConnectedClient");
                LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
                C7294pC0 c7294pC0BuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams("subs");
                if (c7294pC0BuildQueryPurchasesParams != null) {
                    final BillingWrapper billingWrapper = this.this$0;
                    final NQ nq = this.$onError;
                    final NQ nq2 = this.$onSuccess;
                    billingWrapper.queryPurchasesAsyncWithTracking(aVar, "subs", c7294pC0BuildQueryPurchasesParams, new InterfaceC3370bC0() { // from class: com.revenuecat.purchases.google.g
                        @Override // com.daaw.InterfaceC3370bC0
                        public final void a(com.android.billingclient.api.d dVar, List list) {
                            BillingWrapper.C103671.C02891.invoke$lambda$1(nq, billingWrapper, aVar, nq2, dVar, list);
                        }
                    });
                    return;
                }
                NQ nq3 = this.$onError;
                PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchases"}, 1));
                G10.f(str, "format(this, *args)");
                nq3.invoke(new PurchasesError(purchasesErrorCode, str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103671(NQ nq, BillingWrapper billingWrapper, NQ nq2) {
            super(1);
            this.$onError = nq;
            this.this$0 = billingWrapper;
            this.$onSuccess = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                this.$onError.invoke(purchasesError);
            } else {
                BillingWrapper billingWrapper = this.this$0;
                billingWrapper.withConnectedClient(new C02891(this.$onError, billingWrapper, this.$onSuccess));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103681 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ ZY $inAppMessageParams;
        final /* synthetic */ LQ $subscriptionStatusChange;
        final /* synthetic */ WeakReference<Activity> $weakActivity;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02901 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ ZY $inAppMessageParams;
            final /* synthetic */ LQ $subscriptionStatusChange;
            final /* synthetic */ WeakReference<Activity> $weakActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02901(WeakReference<Activity> weakReference, ZY zy, LQ lq) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = zy;
                this.$subscriptionStatusChange = lq;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1(LQ lq, C3461bZ c3461bZ) {
                G10.g(lq, "$subscriptionStatusChange");
                G10.g(c3461bZ, "inAppMessageResult");
                int iA = c3461bZ.a();
                if (iA == 0) {
                    LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                    return;
                }
                if (iA == 1) {
                    LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                    lq.invoke();
                } else {
                    String str = String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(iA)}, 1));
                    G10.f(str, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str, null, 2, null);
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.android.billingclient.api.a) obj);
                return G91.a;
            }

            public final void invoke(com.android.billingclient.api.a aVar) {
                G10.g(aVar, "$this$withConnectedClient");
                Activity activity = this.$weakActivity.get();
                if (activity == null) {
                    LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                    return;
                }
                ZY zy = this.$inAppMessageParams;
                final LQ lq = this.$subscriptionStatusChange;
                aVar.k(activity, zy, new InterfaceC3182aZ() { // from class: com.revenuecat.purchases.google.h
                    @Override // com.daaw.InterfaceC3182aZ
                    public final void a(C3461bZ c3461bZ) {
                        BillingWrapper.C103681.C02901.invoke$lambda$1(lq, c3461bZ);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103681(WeakReference<Activity> weakReference, ZY zy, LQ lq) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = zy;
            this.$subscriptionStatusChange = lq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError == null) {
                BillingWrapper.this.withConnectedClient(new C02901(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1));
            G10.f(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
        }
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i, AbstractC2911Yw abstractC2911Yw) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, (i & 16) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final Result<com.android.billingclient.api.c, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct purchaseInfo, String appUserID, Boolean isPersonalizedPrice) {
        c.b.a aVarA = c.b.a();
        aVarA.c(purchaseInfo.getProductDetails());
        c.b bVarA = aVarA.a();
        G10.f(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        c.a aVarC = com.android.billingclient.api.c.a().d(AbstractC1496Lm.e(bVarA)).c(UtilsKt.sha256(appUserID));
        if (isPersonalizedPrice != null) {
            aVarC.b(isPersonalizedPrice.booleanValue());
        }
        com.android.billingclient.api.c cVarA = aVarC.a();
        G10.f(cVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<com.android.billingclient.api.c, PurchasesError> buildPurchaseParams(GooglePurchasingData purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
        if (purchaseInfo instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) purchaseInfo, appUserID, isPersonalizedPrice);
        }
        if (purchaseInfo instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) purchaseInfo, replaceProductInfo, appUserID, isPersonalizedPrice);
        }
        throw new C6902no0();
    }

    private final Result<com.android.billingclient.api.c, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
        c.b.a aVarA = c.b.a();
        aVarA.b(purchaseInfo.getToken());
        aVarA.c(purchaseInfo.getProductDetails());
        c.b bVarA = aVarA.a();
        G10.f(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        c.a aVarD = com.android.billingclient.api.c.a().d(AbstractC1496Lm.e(bVarA));
        if (replaceProductInfo != null) {
            G10.f(aVarD, "buildSubscriptionPurchas…arams$lambda$41$lambda$39");
            BillingFlowParamsExtensionsKt.setUpgradeInfo(aVarD, replaceProductInfo);
            G91 g91 = G91.a;
        } else {
            G10.f(aVarD.c(UtilsKt.sha256(appUserID)), "setObfuscatedAccountId(appUserID.sha256())");
        }
        if (isPersonalizedPrice != null) {
            aVarD.b(isPersonalizedPrice.booleanValue());
        }
        com.android.billingclient.api.c cVarA = aVarD.a();
        G10.f(cVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(cVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endConnection$lambda$8(BillingWrapper billingWrapper) {
        G10.g(billingWrapper, "this$0");
        synchronized (billingWrapper) {
            try {
                com.android.billingclient.api.a aVar = billingWrapper.billingClient;
                if (aVar != null) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    String str = String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{aVar}, 1));
                    G10.f(str, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str);
                    aVar.c();
                }
                billingWrapper.billingClient = null;
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void executePendingRequests() {
        final NQ nqPoll;
        synchronized (this) {
            while (true) {
                try {
                    com.android.billingclient.api.a aVar = this.billingClient;
                    if (aVar == null || !aVar.e() || (nqPoll = this.serviceRequests.poll()) == null) {
                        break;
                    }
                    G10.f(nqPoll, "poll()");
                    this.mainHandler.post(new Runnable() { // from class: com.daaw.zf
                        @Override // java.lang.Runnable
                        public final void run() {
                            BillingWrapper.executePendingRequests$lambda$2$lambda$1$lambda$0(nqPoll);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            G91 g91 = G91.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$2$lambda$1$lambda$0(NQ nq) {
        G10.g(nq, "$it");
        nq.invoke(null);
    }

    private final synchronized void executeRequestOnUIThread(NQ request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(request);
                com.android.billingclient.api.a aVar = this.billingClient;
                if (aVar == null || aVar.e()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            } else {
                request.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchaseType$lambda$16$lambda$15(final NQ nq, BillingWrapper billingWrapper, com.android.billingclient.api.a aVar, final String str, com.android.billingclient.api.d dVar, List list) {
        boolean z;
        G10.g(nq, "$listener");
        G10.g(billingWrapper, "this$0");
        G10.g(aVar, "$client");
        G10.g(str, "$purchaseToken");
        G10.g(dVar, "querySubsResult");
        G10.g(list, "subsPurchasesList");
        boolean z2 = dVar.b() == 0;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (G10.c(((Purchase) it.next()).f(), str)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (z2 && z) {
            nq.invoke(ProductType.SUBS);
            return;
        }
        C7294pC0 c7294pC0BuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams("inapp");
        if (c7294pC0BuildQueryPurchasesParams != null) {
            billingWrapper.queryPurchasesAsyncWithTracking(aVar, "inapp", c7294pC0BuildQueryPurchasesParams, new InterfaceC3370bC0() { // from class: com.daaw.Bf
                @Override // com.daaw.InterfaceC3370bC0
                public final void a(com.android.billingclient.api.d dVar2, List list3) {
                    BillingWrapper.getPurchaseType$lambda$16$lambda$15$lambda$14(nq, str, dVar2, list3);
                }
            });
            return;
        }
        String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"getPurchaseType"}, 1));
        G10.f(str2, "format(this, *args)");
        LogUtilsKt.errorLog$default(str2, null, 2, null);
        nq.invoke(ProductType.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPurchaseType$lambda$16$lambda$15$lambda$14(NQ nq, String str, com.android.billingclient.api.d dVar, List list) {
        G10.g(nq, "$listener");
        G10.g(str, "$purchaseToken");
        G10.g(dVar, "queryInAppsResult");
        G10.g(list, "inAppPurchasesList");
        boolean z = true;
        boolean z2 = dVar.b() == 0;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (G10.c(((Purchase) it.next()).f(), str)) {
                    break;
                }
            }
            z = false;
        }
        if (z2 && z) {
            nq.invoke(ProductType.INAPP);
        } else {
            nq.invoke(ProductType.UNKNOWN);
        }
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        G10.f(string, "stringWriter.toString()");
        return string;
    }

    private final void getStoreTransaction(Purchase purchase, NQ completion) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                completion.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String strF = purchase.f();
            G10.f(strF, "purchase.purchaseToken");
            getPurchaseType$purchases_defaultsRelease(strF, new BillingWrapper$getStoreTransaction$1$2(completion, purchase, purchaseContext));
            G91 g91 = G91.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, com.android.billingclient.api.c params) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new C103621(activity, params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingServiceDisconnected$lambda$23(BillingWrapper billingWrapper) {
        G10.g(billingWrapper, "this$0");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(BillingStrings.BILLING_SERVICE_DISCONNECTED, Arrays.copyOf(new Object[]{String.valueOf(billingWrapper.billingClient)}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$22(com.android.billingclient.api.d dVar, BillingWrapper billingWrapper) {
        G10.g(dVar, "$billingResult");
        G10.g(billingWrapper, "this$0");
        switch (dVar.b()) {
            case -3:
            case -1:
            case 1:
            case 2:
            case 6:
                LogIntent logIntent = LogIntent.GOOGLE_WARNING;
                String str = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
                G10.f(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
                billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
                break;
            case -2:
            case 3:
                String str2 = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
                G10.f(str2, "format(this, *args)");
                LogWrapperKt.log(LogIntent.GOOGLE_WARNING, str2);
                PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(dVar.b(), str2);
                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                billingWrapper.sendErrorsToAllPendingRequests(purchasesErrorBillingResponseToPurchasesError);
                break;
            case 0:
                LogIntent logIntent2 = LogIntent.DEBUG;
                com.android.billingclient.api.a aVar = billingWrapper.billingClient;
                String str3 = String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(new Object[]{aVar != null ? aVar.toString() : null}, 1));
                G10.f(str3, "format(this, *args)");
                LogWrapperKt.log(logIntent2, str3);
                BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                if (stateListener != null) {
                    stateListener.onConnected();
                }
                billingWrapper.executePendingRequests();
                billingWrapper.reconnectMilliseconds = 1000L;
                billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                break;
            case 4:
            case 7:
            case 8:
                LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
                String str4 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(dVar)}, 1));
                G10.f(str4, "format(this, *args)");
                LogWrapperKt.log(logIntent3, str4);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryProductDetailsAsyncEnsuringOneResponse(com.android.billingclient.api.a aVar, final String str, com.android.billingclient.api.g gVar, final InterfaceC1548Lz0 interfaceC1548Lz0) {
        final C5620jF0 c5620jF0 = new C5620jF0();
        final Date now = this.dateProvider.getNow();
        aVar.h(gVar, new InterfaceC1548Lz0() { // from class: com.daaw.Df
            @Override // com.daaw.InterfaceC1548Lz0
            public final void a(com.android.billingclient.api.d dVar, List list) {
                BillingWrapper.queryProductDetailsAsyncEnsuringOneResponse$lambda$29(this.a, str, now, interfaceC1548Lz0, c5620jF0, dVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$29(BillingWrapper billingWrapper, String str, Date date, InterfaceC1548Lz0 interfaceC1548Lz0, C5620jF0 c5620jF0, com.android.billingclient.api.d dVar, List list) {
        G10.g(billingWrapper, "this$0");
        G10.g(str, "$productType");
        G10.g(date, "$requestStartTime");
        G10.g(interfaceC1548Lz0, "$listener");
        G10.g(c5620jF0, "$hasResponded");
        G10.g(dVar, "billingResult");
        G10.g(list, "productDetailsList");
        synchronized (billingWrapper) {
            if (c5620jF0.B) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str2 = String.format(OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.b())}, 1));
                G10.f(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent, str2);
                return;
            }
            c5620jF0.B = true;
            G91 g91 = G91.a;
            billingWrapper.trackGoogleQueryProductDetailsRequestIfNeeded(str, dVar, date);
            interfaceC1548Lz0.a(dVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseHistoryAsyncEnsuringOneResponse(com.android.billingclient.api.a aVar, final String str, InterfaceC9807yB0 interfaceC9807yB0) {
        final InterfaceC9807yB0 interfaceC9807yB02;
        G91 g91;
        final C5620jF0 c5620jF0 = new C5620jF0();
        final Date now = this.dateProvider.getNow();
        C7015oC0 c7015oC0BuildQueryPurchaseHistoryParams = BillingClientParamBuildersKt.buildQueryPurchaseHistoryParams(str);
        if (c7015oC0BuildQueryPurchaseHistoryParams != null) {
            interfaceC9807yB02 = interfaceC9807yB0;
            aVar.i(c7015oC0BuildQueryPurchaseHistoryParams, new InterfaceC9807yB0() { // from class: com.daaw.Ef
                @Override // com.daaw.InterfaceC9807yB0
                public final void c(com.android.billingclient.api.d dVar, List list) {
                    BillingWrapper.queryPurchaseHistoryAsyncEnsuringOneResponse$lambda$32$lambda$31(this.a, str, now, interfaceC9807yB02, c5620jF0, dVar, list);
                }
            });
            g91 = G91.a;
        } else {
            interfaceC9807yB02 = interfaceC9807yB0;
            g91 = null;
        }
        if (g91 == null) {
            String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"getPurchaseType"}, 1));
            G10.f(str2, "format(this, *args)");
            LogUtilsKt.errorLog$default(str2, null, 2, null);
            com.android.billingclient.api.d dVarA = com.android.billingclient.api.d.c().c(5).a();
            G10.f(dVarA, "newBuilder().setResponse….DEVELOPER_ERROR).build()");
            interfaceC9807yB02.c(dVarA, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchaseHistoryAsyncEnsuringOneResponse$lambda$32$lambda$31(BillingWrapper billingWrapper, String str, Date date, InterfaceC9807yB0 interfaceC9807yB0, C5620jF0 c5620jF0, com.android.billingclient.api.d dVar, List list) {
        G10.g(billingWrapper, "this$0");
        G10.g(str, "$productType");
        G10.g(date, "$requestStartTime");
        G10.g(interfaceC9807yB0, "$listener");
        G10.g(c5620jF0, "$hasResponded");
        G10.g(dVar, "billingResult");
        synchronized (billingWrapper) {
            if (c5620jF0.B) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str2 = String.format(RestoreStrings.EXTRA_QUERY_PURCHASE_HISTORY_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.b())}, 1));
                G10.f(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent, str2);
                return;
            }
            c5620jF0.B = true;
            G91 g91 = G91.a;
            billingWrapper.trackGoogleQueryPurchaseHistoryRequestIfNeeded(str, dVar, date);
            interfaceC9807yB0.c(dVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchasesAsyncWithTracking(com.android.billingclient.api.a aVar, final String str, C7294pC0 c7294pC0, final InterfaceC3370bC0 interfaceC3370bC0) {
        final Date now = this.dateProvider.getNow();
        aVar.j(c7294pC0, new InterfaceC3370bC0() { // from class: com.daaw.xf
            @Override // com.daaw.InterfaceC3370bC0
            public final void a(com.android.billingclient.api.d dVar, List list) {
                BillingWrapper.queryPurchasesAsyncWithTracking$lambda$34(this.a, str, now, interfaceC3370bC0, dVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesAsyncWithTracking$lambda$34(BillingWrapper billingWrapper, String str, Date date, InterfaceC3370bC0 interfaceC3370bC0, com.android.billingclient.api.d dVar, List list) {
        G10.g(billingWrapper, "this$0");
        G10.g(str, "$productType");
        G10.g(date, "$requestStartTime");
        G10.g(interfaceC3370bC0, "$listener");
        G10.g(dVar, "billingResult");
        G10.g(list, "purchases");
        billingWrapper.trackGoogleQueryPurchasesRequestIfNeeded(str, dVar, date);
        interfaceC3370bC0.a(dVar, list);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(BillingStrings.BILLING_CLIENT_RETRY, Arrays.copyOf(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000L);
    }

    private final synchronized void sendErrorsToAllPendingRequests(final PurchasesError error) {
        while (true) {
            final NQ nqPoll = this.serviceRequests.poll();
            if (nqPoll != null) {
                this.mainHandler.post(new Runnable() { // from class: com.daaw.Ff
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingWrapper.sendErrorsToAllPendingRequests$lambda$43$lambda$42(nqPoll, error);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorsToAllPendingRequests$lambda$43$lambda$42(NQ nq, PurchasesError purchasesError) {
        G10.g(nq, "$serviceRequest");
        G10.g(purchasesError, "$error");
        nq.invoke(purchasesError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$3(BillingWrapper billingWrapper) {
        G10.g(billingWrapper, "this$0");
        billingWrapper.startConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        List<? extends Purchase> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(list2, 10)), 16));
        for (Purchase purchase : list2) {
            String strF = purchase.f();
            G10.f(strF, "purchase.purchaseToken");
            C0576Cs0 c0576Cs0A = D61.a(UtilsKt.sha1(strF), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, 14, null));
            linkedHashMap.put(c0576Cs0A.c(), c0576Cs0A.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String productType, com.android.billingclient.api.d billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            int iB = billingResult.b();
            String strA = billingResult.a();
            G10.f(strA, "billingResult.debugMessage");
            diagnosticsTracker.m101trackGoogleQueryProductDetailsRequestWn2Vu4Y(productType, iB, strA, DurationExtensionsKt.between(LE.B, requestStartTime, this.dateProvider.getNow()));
        }
    }

    private final void trackGoogleQueryPurchaseHistoryRequestIfNeeded(String productType, com.android.billingclient.api.d billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            int iB = billingResult.b();
            String strA = billingResult.a();
            G10.f(strA, "billingResult.debugMessage");
            diagnosticsTracker.m102trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(productType, iB, strA, DurationExtensionsKt.between(LE.B, requestStartTime, this.dateProvider.getNow()));
        }
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String productType, com.android.billingclient.api.d billingResult, Date requestStartTime) {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            int iB = billingResult.b();
            String strA = billingResult.a();
            G10.f(strA, "billingResult.debugMessage");
            diagnosticsTracker.m103trackGoogleQueryPurchasesRequestWn2Vu4Y(productType, iB, strA, DurationExtensionsKt.between(LE.B, requestStartTime, this.dateProvider.getNow()));
        }
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        com.android.billingclient.api.a aVar = this.billingClient;
        com.android.billingclient.api.d dVarD = aVar != null ? aVar.d("fff") : null;
        if (dVarD == null || dVarD.b() != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iB = dVarD.b();
        String strA = dVarD.a();
        G10.f(strA, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(iB, strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withConnectedClient(NQ receivingFunction) {
        com.android.billingclient.api.a aVar = this.billingClient;
        G91 g91 = null;
        if (aVar != null) {
            if (!aVar.e()) {
                aVar = null;
            }
            if (aVar != null) {
                receivingFunction.invoke(aVar);
                g91 = G91.a;
            }
        }
        if (g91 == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    public final void acknowledge$purchases_defaultsRelease(String token, InterfaceC3429bR onAcknowledged) {
        G10.g(token, "token");
        G10.g(onAcknowledged, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        executeRequestOnUIThread(new BillingWrapper$acknowledge$1(this, token, onAcknowledged));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean shouldTryToConsume, StoreTransaction purchase) {
        G10.g(purchase, "purchase");
        if (purchase.getType() == ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(purchase);
        boolean zH = originalGooglePurchase != null ? originalGooglePurchase.h() : false;
        if (shouldTryToConsume && purchase.getType() == ProductType.INAPP) {
            consumePurchase$purchases_defaultsRelease(purchase.getPurchaseToken(), new AnonymousClass1());
        } else if (!shouldTryToConsume || zH) {
            this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
        } else {
            acknowledge$purchases_defaultsRelease(purchase.getPurchaseToken(), new AnonymousClass2());
        }
    }

    public final void consumePurchase$purchases_defaultsRelease(String token, InterfaceC3429bR onConsumed) {
        G10.g(token, "token");
        G10.g(onConsumed, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        executeRequestOnUIThread(new BillingWrapper$consumePurchase$1(this, token, onConsumed));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
        this.mainHandler.post(new Runnable() { // from class: com.daaw.Cf
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.endConnection$lambda$8(this.B);
            }
        });
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, NQ onCompletion, NQ onError) {
        G10.g(appUserID, "appUserID");
        G10.g(productType, "productType");
        G10.g(productId, "productId");
        G10.g(onCompletion, "onCompletion");
        G10.g(onError, "onError");
        withConnectedClient(new C103611(productId, productType, onError, this, onCompletion));
    }

    public final synchronized com.android.billingclient.api.a getBillingClient() {
        return this.billingClient;
    }

    public final void getPurchaseType$purchases_defaultsRelease(final String purchaseToken, final NQ listener) {
        G10.g(purchaseToken, "purchaseToken");
        G10.g(listener, "listener");
        final com.android.billingclient.api.a aVar = this.billingClient;
        G91 g91 = null;
        if (aVar != null) {
            C7294pC0 c7294pC0BuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams("subs");
            if (c7294pC0BuildQueryPurchasesParams == null) {
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"getPurchaseType"}, 1));
                G10.f(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                listener.invoke(ProductType.UNKNOWN);
                return;
            }
            queryPurchasesAsyncWithTracking(aVar, "subs", c7294pC0BuildQueryPurchasesParams, new InterfaceC3370bC0() { // from class: com.daaw.Af
                @Override // com.daaw.InterfaceC3370bC0
                public final void a(com.android.billingclient.api.d dVar, List list) {
                    BillingWrapper.getPurchaseType$lambda$16$lambda$15(listener, this, aVar, purchaseToken, dVar, list);
                }
            });
            g91 = G91.a;
        }
        if (g91 == null) {
            listener.invoke(ProductType.UNKNOWN);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        com.android.billingclient.api.a aVar = this.billingClient;
        if (aVar != null) {
            return aVar.e();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String presentedOfferingIdentifier, Boolean isPersonalizedPrice) {
        String optionId;
        G10.g(activity, "activity");
        G10.g(appUserID, "appUserID");
        G10.g(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String str = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            G10.f(str, "format(this, *args)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new C6902no0();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            String str2 = String.format(PurchaseStrings.UPGRADING_SKU, Arrays.copyOf(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2));
            G10.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            String str3 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{googlePurchasingData.getProductId()}, 1));
            G10.f(str3, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str3);
        }
        synchronized (this) {
            try {
                String productId = googlePurchasingData.getProductId();
                Map<String, PurchaseContext> map = this.purchaseContext;
                ProductType productType = googlePurchasingData.getProductType();
                ReplacementMode replacementMode = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
                map.put(productId, new PurchaseContext(productType, presentedOfferingIdentifier, optionId, replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null));
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        executeRequestOnUIThread(new C103632(purchasingData, replaceProductInfo, appUserID, isPersonalizedPrice, activity));
    }

    @Override // com.daaw.InterfaceC7135of
    public void onBillingServiceDisconnected() {
        this.mainHandler.post(new Runnable() { // from class: com.daaw.yf
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.onBillingServiceDisconnected$lambda$23(this.B);
            }
        });
        retryBillingServiceConnectionWithExponentialBackoff();
    }

    @Override // com.daaw.InterfaceC7135of
    public void onBillingSetupFinished(final com.android.billingclient.api.d billingResult) {
        G10.g(billingResult, "billingResult");
        this.mainHandler.post(new Runnable() { // from class: com.daaw.vf
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.onBillingSetupFinished$lambda$22(billingResult, this);
            }
        });
    }

    @Override // com.daaw.InterfaceC3648cC0
    public void onPurchasesUpdated(com.android.billingclient.api.d billingResult, List<? extends Purchase> purchases) {
        G10.g(billingResult, "billingResult");
        List<? extends Purchase> listK = purchases == null ? AbstractC1599Mm.k() : purchases;
        if (billingResult.b() == 0 && !listK.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listK.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, listK, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb = new StringBuilder();
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
        G10.f(str, "format(this, *args)");
        sb.append(str);
        String str2 = null;
        if (listK.isEmpty()) {
            listK = null;
        }
        if (listK != null) {
            str2 = "Purchases:" + AbstractC2455Um.n0(listK, ", ", null, null, 0, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30, null);
        }
        sb.append(str2);
        LogWrapperKt.log(logIntent, sb.toString());
        String str3 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
        int iB = billingResult.b();
        if (purchases == null && billingResult.b() == 0) {
            str3 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            iB = 6;
        }
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(iB, str3);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, NQ onReceivePurchaseHistory, NQ onReceivePurchaseHistoryError) {
        G10.g(appUserID, "appUserID");
        G10.g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        G10.g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new C103641(onReceivePurchaseHistoryError, onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> productIds, NQ onReceive, NQ onError) {
        G10.g(productType, "productType");
        G10.g(productIds, "productIds");
        G10.g(onReceive, "onReceive");
        G10.g(onError, "onError");
        Set<String> set = productIds;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setQ0 = AbstractC2455Um.Q0(arrayList);
        if (setQ0.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_PRODUCT_ID_LIST);
            onReceive.invoke(AbstractC1599Mm.k());
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{AbstractC2455Um.n0(set, null, null, null, 0, null, null, 63, null)}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        executeRequestOnUIThread(new C103651(productType, setQ0, this, onError, productIds, onReceive));
    }

    public final void queryPurchaseHistoryAsync(String productType, NQ onReceivePurchaseHistory, NQ onReceivePurchaseHistoryError) {
        G10.g(productType, "productType");
        G10.g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        G10.g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{productType}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        executeRequestOnUIThread(new C103661(onReceivePurchaseHistoryError, productType, onReceivePurchaseHistory));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, NQ onSuccess, NQ onError) {
        G10.g(appUserID, "appUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        executeRequestOnUIThread(new C103671(onError, this, onSuccess));
    }

    public final synchronized void setBillingClient(com.android.billingclient.api.a aVar) {
        this.billingClient = aVar;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, LQ subscriptionStatusChange) {
        G10.g(activity, "activity");
        G10.g(inAppMessageTypes, "inAppMessageTypes");
        G10.g(subscriptionStatusChange, "subscriptionStatusChange");
        if (inAppMessageTypes.isEmpty()) {
            LogUtilsKt.errorLog$default(BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null, 2, null);
            return;
        }
        ZY.a aVarA = ZY.a();
        G10.f(aVarA, "newBuilder()");
        Iterator<? extends InAppMessageType> it = inAppMessageTypes.iterator();
        while (it.hasNext()) {
            aVarA.a(it.next().getInAppMessageCategoryId());
        }
        ZY zyB = aVarA.b();
        G10.f(zyB, "inAppMessageParamsBuilder.build()");
        executeRequestOnUIThread(new C103681(new WeakReference(activity), zyB, subscriptionStatusChange));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                com.android.billingclient.api.a aVar = this.billingClient;
                if (aVar != null) {
                    if (!aVar.e()) {
                        LogIntent logIntent = LogIntent.DEBUG;
                        String str = String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{aVar}, 1));
                        G10.f(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                        try {
                            aVar.l(this);
                        } catch (IllegalStateException e) {
                            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                            String str2 = String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e}, 1));
                            G10.f(str2, "format(this, *args)");
                            LogWrapperKt.log(logIntent2, str2);
                            sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e.getMessage()));
                        }
                    }
                    G91 g91 = G91.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.daaw.wf
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.startConnectionOnMainThread$lambda$3(this.B);
            }
        }, delayMilliseconds);
    }

    public BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        G10.g(clientFactory, "clientFactory");
        G10.g(handler, "mainHandler");
        G10.g(deviceCache, "deviceCache");
        G10.g(dateProvider, "dateProvider");
        this.clientFactory = clientFactory;
        this.mainHandler = handler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }
}
