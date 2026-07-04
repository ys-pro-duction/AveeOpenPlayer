package com.revenuecat.purchases.common.offlineentitlements;

import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC4192e90;
import com.daaw.C0576Cs0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\u000f2\u0018\b\u0002\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\"\u0010(\u001a\u0004\u0018\u00010\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)RN\u0010.\u001a<\u0012\u0004\u0012\u00020\u0013\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u00190,j\u0002`-0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0013\u00102\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "offlineCustomerInfoCalculator", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/AppConfig;)V", "", "isOfflineEntitlementsEnabled", "()Z", "Lcom/daaw/G91;", "resetOfflineCustomerInfoCache", "()V", "isServerError", "", "appUserId", "shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest", "(ZLjava/lang/String;)Z", "shouldCalculateOfflineCustomerInfoInPostReceipt", "(Z)Z", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "calculateAndCacheOfflineCustomerInfo", "(Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "completion", "updateProductEntitlementMappingCacheIfStale", "(Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/AppConfig;", "<set-?>", "_offlineCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "", "", "Lcom/daaw/Cs0;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCallback;", "offlineCustomerInfoCallbackCache", "Ljava/util/Map;", "getOfflineCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "offlineCustomerInfo", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<C0576Cs0>> offlineCustomerInfoCallbackCache;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    LogUtilsKt.warnLog(OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                    offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                    String cachedAppUserID = offlineEntitlementsManager.deviceCache.getCachedAppUserID();
                    if (cachedAppUserID != null) {
                        offlineEntitlementsManager.deviceCache.clearCustomerInfoCache(cachedAppUserID);
                    }
                    List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((NQ) ((C0576Cs0) it.next()).a()).invoke(customerInfo);
                        }
                    }
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass3 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((NQ) ((C0576Cs0) it.next()).b()).invoke(purchasesError);
                        }
                    }
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NQ nq) {
            super(1);
            this.$completion = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ProductEntitlementMapping) obj);
            return G91.a;
        }

        public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
            G10.g(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.this.deviceCache.cacheProductEntitlementMapping(productEntitlementMapping);
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
            NQ nq = this.$completion;
            if (nq != null) {
                nq.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "e", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103602 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103602(NQ nq) {
            super(1);
            this.$completion = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "e");
            String str = String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{purchasesError}, 1));
            G10.f(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            NQ nq = this.$completion;
            if (nq != null) {
                nq.invoke(purchasesError);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig) {
        G10.g(backend, "backend");
        G10.g(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        G10.g(deviceCache, "deviceCache");
        G10.g(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation();
    }

    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, NQ nq, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            nq = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(nq);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String appUserId, NQ onSuccess, NQ onError) {
        G10.g(appUserId, "appUserId");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            try {
                boolean zContainsKey = this.offlineCustomerInfoCallbackCache.containsKey(appUserId);
                List<C0576Cs0> listK = this.offlineCustomerInfoCallbackCache.get(appUserId);
                if (listK == null) {
                    listK = AbstractC1599Mm.k();
                }
                this.offlineCustomerInfoCallbackCache.put(appUserId, AbstractC2455Um.z0(listK, AbstractC1496Lm.e(D61.a(onSuccess, onError))));
                if (!zContainsKey) {
                    G91 g91 = G91.a;
                    this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(appUserId, new AnonymousClass2(appUserId), new AnonymousClass3(appUserId));
                } else {
                    String str = String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{appUserId}, 1));
                    G10.f(str, "format(this, *args)");
                    LogUtilsKt.debugLog(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: getOfflineCustomerInfo, reason: from getter */
    public final CustomerInfo get_offlineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        if (this._offlineCustomerInfo != null) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
            this._offlineCustomerInfo = null;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean isServerError, String appUserId) {
        G10.g(appUserId, "appUserId");
        return isServerError && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo(appUserId) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean isServerError) {
        return isServerError && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(NQ completion) throws Throwable {
        if (isOfflineEntitlementsEnabled() && this.deviceCache.isProductEntitlementMappingCacheStale()) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            this.backend.getProductEntitlementMapping(new AnonymousClass1(completion), new C103602(completion));
        } else if (completion != null) {
            completion.invoke(null);
        }
    }
}
