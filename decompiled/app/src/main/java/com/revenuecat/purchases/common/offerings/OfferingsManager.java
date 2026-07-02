package com.revenuecat.purchases.common.offerings;

import android.os.Handler;
import android.os.Looper;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC9867yQ0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$JM\u0010%\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b%\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Landroid/os/Handler;", "mainHandler", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Landroid/os/Handler;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/daaw/G91;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/daaw/NQ;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lcom/daaw/LQ;)V", "", "appUserID", "", "appInBackground", "getOfferings", "(Ljava/lang/String;ZLcom/daaw/NQ;Lcom/daaw/NQ;)V", "onAppForeground", "(Ljava/lang/String;)V", "fetchAndCacheOfferings", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Landroid/os/Handler;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NQ nq) {
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
            OfferingsManager.this.handleErrorFetchingOfferings(purchasesError, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ NQ $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ Offerings $offerings;
            final /* synthetic */ NQ $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NQ nq, Offerings offerings) {
                super(0);
                this.$onSuccess = nq;
                this.$offerings = offerings;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m105invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m105invoke() {
                NQ nq = this.$onSuccess;
                if (nq != null) {
                    nq.invoke(this.$offerings);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JSONObject jSONObject, NQ nq) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return G91.a;
        }

        public final void invoke(Offerings offerings) {
            G10.g(offerings, "offerings");
            OfferingsManager.this.offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
            OfferingsManager.this.dispatch(new AnonymousClass1(this.$onSuccess, offerings));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/daaw/G91;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103561 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103561(NQ nq, NQ nq2) {
            super(1);
            this.$onError = nq;
            this.$onSuccess = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return G91.a;
        }

        public final void invoke(JSONObject jSONObject) {
            G10.g(jSONObject, "it");
            OfferingsManager.this.createAndCacheOfferings(jSONObject, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103572 extends AbstractC4192e90 implements InterfaceC3429bR {
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103572(NQ nq, NQ nq2) {
            super(2);
            this.$onError = nq;
            this.$onSuccess = nq2;
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z) {
            G10.g(purchasesError, "backendError");
            if (!z) {
                OfferingsManager.this.handleErrorFetchingOfferings(purchasesError, this.$onError);
                return;
            }
            JSONObject cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(purchasesError, this.$onError);
            } else {
                LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
                OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103581 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ NQ $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103581(NQ nq, Offerings offerings) {
            super(0);
            this.$onSuccess = nq;
            this.$cachedOfferings = offerings;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m106invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m106invoke() {
            NQ nq = this.$onSuccess;
            if (nq != null) {
                nq.invoke(this.$cachedOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103591 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ NQ $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103591(NQ nq, PurchasesError purchasesError) {
            super(0);
            this.$onError = nq;
            this.$error = purchasesError;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m107invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m107invoke() {
            NQ nq = this.$onError;
            if (nq != null) {
                nq.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, Handler handler) {
        G10.g(offeringsCache, "offeringsCache");
        G10.g(backend, "backend");
        G10.g(offeringsFactory, "offeringsFactory");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.mainHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(JSONObject offeringsJSON, NQ onError, NQ onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, new AnonymousClass1(onError), new AnonymousClass2(offeringsJSON, onSuccess));
    }

    public static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 2) != 0) {
            nq = null;
        }
        if ((i & 4) != 0) {
            nq2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, nq, nq2);
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
        handler.post(new Runnable() { // from class: com.daaw.xp0
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsManager.dispatch$lambda$0(action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(LQ lq) {
        G10.g(lq, "$tmp0");
        lq.invoke();
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z, NQ nq, NQ nq2, int i, Object obj) throws Throwable {
        if ((i & 4) != 0) {
            nq = null;
        }
        if ((i & 8) != 0) {
            nq2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z, nq, nq2);
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z, NQ nq, NQ nq2, int i, Object obj) throws Throwable {
        if ((i & 4) != 0) {
            nq = null;
        }
        if ((i & 8) != 0) {
            nq2 = null;
        }
        offeringsManager.getOfferings(str, z, nq, nq2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(PurchasesError error, NQ onError) {
        LogIntent logIntent = AbstractC9867yQ0.g(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(error.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        String str = String.format(OfferingStrings.FETCHING_OFFERINGS_ERROR, Arrays.copyOf(new Object[]{error}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new C103591(onError, error));
    }

    public final void fetchAndCacheOfferings(String appUserID, boolean appInBackground, NQ onError, NQ onSuccess) throws Throwable {
        G10.g(appUserID, "appUserID");
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(appUserID, appInBackground, new C103561(onError, onSuccess), new C103572(onError, onSuccess));
    }

    public final void getOfferings(String appUserID, boolean appInBackground, NQ onError, NQ onSuccess) throws Throwable {
        G10.g(appUserID, "appUserID");
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(appUserID, appInBackground, onError, onSuccess);
            return;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
        dispatch(new C103581(onSuccess, cachedOfferings));
        if (this.offeringsCache.isOfferingsCacheStale(appInBackground)) {
            LogWrapperKt.log(logIntent, appInBackground ? OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND : OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, appInBackground, null, null, 12, null);
        }
    }

    public final void onAppForeground(String appUserID) throws Throwable {
        G10.g(appUserID, "appUserID");
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, Handler handler, int i, AbstractC2911Yw abstractC2911Yw) {
        this(offeringsCache, backend, offeringsFactory, (i & 8) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
