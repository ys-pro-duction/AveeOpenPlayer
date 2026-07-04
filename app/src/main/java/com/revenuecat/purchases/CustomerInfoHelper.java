package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.CustomerInfoHelper;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ3\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140%H\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Landroid/os/Handler;)V", "", "appUserID", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "callback", "Lcom/daaw/G91;", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "Lkotlin/Function0;", "action", "dispatch", "(Lcom/daaw/LQ;)V", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Landroid/os/Handler;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CustomerInfoHelper {
    private final Backend backend;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheFetchPolicy.values().length];
            try {
                iArr[CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m67invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m67invoke() {
            this.$callback.onReceived(this.$cachedCustomerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m68invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m68invoke() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103091 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103091(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m69invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m69invoke() {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onReceived(this.$cachedCustomerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "info", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103101 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02721 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02721(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$info = customerInfo;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m70invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m70invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$info);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103101(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "info");
            LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_NETWORK);
            CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(customerInfo);
            CustomerInfoHelper.this.dispatch(new C02721(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103112 extends AbstractC4192e90 implements InterfaceC3429bR {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "offlineComputedCustomerInfo", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class C02731 extends AbstractC4192e90 implements LQ {
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;
                final /* synthetic */ CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02731(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m71invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m71invoke() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onReceived(this.$offlineComputedCustomerInfo);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return G91.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                G10.g(customerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(customerInfo);
                this.this$0.dispatch(new C02731(this.$callback, customerInfo));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02742 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
                final /* synthetic */ PurchasesError $backendError;
                final /* synthetic */ ReceiveCustomerInfoCallback $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                    super(0);
                    this.$callback = receiveCustomerInfoCallback;
                    this.$backendError = purchasesError;
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m72invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m72invoke() {
                    ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                    if (receiveCustomerInfoCallback != null) {
                        receiveCustomerInfoCallback.onError(this.$backendError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02742(CustomerInfoHelper customerInfoHelper, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return G91.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                G10.g(purchasesError, "it");
                this.this$0.dispatch(new AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass3 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$backendError = purchasesError;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m73invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m73invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103112(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(2);
            this.$appUserID = str;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError, boolean z) {
            G10.g(purchasesError, "backendError");
            String str = String.format(CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{purchasesError}, 1));
            G10.f(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp(this.$appUserID);
            if (CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z, this.$appUserID)) {
                CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new AnonymousClass1(CustomerInfoHelper.this, this.$callback), new C02742(CustomerInfoHelper.this, this.$callback, purchasesError));
            } else {
                CustomerInfoHelper.this.dispatch(new AnonymousClass3(this.$callback, purchasesError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103121 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103121(String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "it");
            CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103132 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m74invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m74invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(this.$customerInfo);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103132(String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z;
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            if (customerInfo == null) {
                CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES);
                CustomerInfoHelper.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
            }
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler) {
        G10.g(deviceCache, "deviceCache");
        G10.g(backend, "backend");
        G10.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        G10.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        G10.g(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        G10.g(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final LQ action) {
        if (G10.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.daaw.mv
                @Override // java.lang.Runnable
                public final void run() {
                    CustomerInfoHelper.dispatch$lambda$0(action);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$0(LQ lq) {
        G10.g(lq, "$tmp0");
        lq.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String appUserID) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.get_offlineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo(appUserID) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String appUserID, ReceiveCustomerInfoCallback callback) {
        if (callback == null) {
            return;
        }
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new AnonymousClass1(callback, cachedCustomerInfo));
        } else {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new AnonymousClass2(callback, purchasesError));
        }
    }

    public static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new C103091(callback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(appUserID, appInBackground, allowSharingPlayStoreAccount);
        }
    }

    public static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z, z2, receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCustomerInfoFetchOnly(String appUserID, boolean appInBackground, ReceiveCustomerInfoCallback callback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(appUserID);
        this.backend.getCustomerInfo(appUserID, appInBackground, new C103101(callback), new C103112(appUserID, callback));
    }

    public static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        if (this.deviceCache.isCustomerInfoCacheStale(appUserID, appInBackground)) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    public static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z, z2, receiveCustomerInfoCallback);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(allowSharingPlayStoreAccount, new C103121(appUserID, appInBackground, callback), new C103132(appUserID, appInBackground, callback));
    }

    public static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z, boolean z2, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z, z2, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z, boolean z2, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 16) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z, z2, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount) {
        if (this.deviceCache.isCustomerInfoCacheStale(appUserID, appInBackground)) {
            LogWrapperKt.log(LogIntent.DEBUG, appInBackground ? CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND : CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            postPendingPurchasesAndFetchCustomerInfo$default(this, appUserID, appInBackground, allowSharingPlayStoreAccount, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(String appUserID, CacheFetchPolicy fetchPolicy, boolean appInBackground, boolean allowSharingPlayStoreAccount, ReceiveCustomerInfoCallback callback) {
        G10.g(appUserID, "appUserID");
        G10.g(fetchPolicy, "fetchPolicy");
        String str = String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{fetchPolicy}, 1));
        G10.f(str, "format(this, *args)");
        LogUtilsKt.debugLog(str);
        int i = WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i == 1) {
            getCustomerInfoCacheOnly(appUserID, callback);
            return;
        }
        if (i == 2) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else if (i == 3) {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            if (i != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfoUpdateHandler customerInfoUpdateHandler, PostPendingTransactionsHelper postPendingTransactionsHelper, Handler handler, int i, AbstractC2911Yw abstractC2911Yw) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, (i & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
