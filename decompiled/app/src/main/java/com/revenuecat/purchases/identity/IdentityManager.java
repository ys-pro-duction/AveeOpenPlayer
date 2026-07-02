package com.revenuecat.purchases.identity;

import com.daaw.AY0;
import com.daaw.AbstractC4192e90;
import com.daaw.BY0;
import com.daaw.C8146sG0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u0018J\u0017\u0010$\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b$\u0010\u0018JC\u0010+\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00102\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00130(¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b-\u0010\u0018J#\u0010/\u001a\u00020\u00132\u0014\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u00130(¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u001b¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b<\u0010!¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;)V", "", "oldAppUserId", "newAppUserId", "Lcom/daaw/G91;", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "(Ljava/lang/String;Ljava/lang/String;)V", "appUserID", "invalidateCustomerInfoAndETagCacheIfNeeded", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "shouldInvalidateCustomerInfoAndETagCache", "(Lcom/revenuecat/purchases/CustomerInfo;)Z", "isUserIDAnonymous", "(Ljava/lang/String;)Z", "generateRandomID", "()Ljava/lang/String;", "newUserID", "resetAndSaveUserID", "configure", "newAppUserID", "Lkotlin/Function2;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "logIn", "(Ljava/lang/String;Lcom/daaw/bR;Lcom/daaw/NQ;)V", "switchUser", "completion", "logOut", "(Lcom/daaw/NQ;)V", "currentUserIsAnonymous", "()Z", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/daaw/sG0;", "anonymousIdRegex", "Lcom/daaw/sG0;", "getCurrentAppUserID", "currentAppUserID", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IdentityManager {
    private final C8146sG0 anonymousIdRegex;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final OfferingsCache offeringsCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ InterfaceC3429bR $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements InterfaceC3429bR {
            final /* synthetic */ String $newAppUserID;
            final /* synthetic */ String $oldAppUserID;
            final /* synthetic */ InterfaceC3429bR $onSuccess;
            final /* synthetic */ IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IdentityManager identityManager, InterfaceC3429bR interfaceC3429bR, String str, String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = interfaceC3429bR;
                this.$newAppUserID = str;
                this.$oldAppUserID = str2;
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
                return G91.a;
            }

            public final void invoke(CustomerInfo customerInfo, boolean z) {
                G10.g(customerInfo, "customerInfo");
                IdentityManager identityManager = this.this$0;
                String str = this.$newAppUserID;
                String str2 = this.$oldAppUserID;
                synchronized (identityManager) {
                    LogIntent logIntent = LogIntent.USER;
                    String str3 = String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z)}, 2));
                    G10.f(str3, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str3);
                    identityManager.deviceCache.clearCachesForAppUserID(str2);
                    identityManager.offeringsCache.clearCache();
                    identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                    identityManager.deviceCache.cacheAppUserID(str);
                    identityManager.deviceCache.cacheCustomerInfo(str, customerInfo);
                    identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str2, str);
                    identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                    G91 g91 = G91.a;
                }
                this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, NQ nq, InterfaceC3429bR interfaceC3429bR) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = nq;
            this.$onSuccess = interfaceC3429bR;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m108invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m108invoke() {
            Backend backend = IdentityManager.this.backend;
            String str = this.$oldAppUserID;
            String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new AnonymousClass1(IdentityManager.this, this.$onSuccess, str2, str), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ NQ $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NQ nq) {
            super(0);
            this.$completion = nq;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m109invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m109invoke() {
            IdentityManager identityManager = IdentityManager.this;
            identityManager.resetAndSaveUserID(identityManager.generateRandomID());
            LogWrapperKt.log(LogIntent.USER, IdentityStrings.LOG_OUT_SUCCESSFUL);
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(DeviceCache deviceCache, SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesManager subscriberAttributesManager, OfferingsCache offeringsCache, Backend backend, OfflineEntitlementsManager offlineEntitlementsManager) {
        G10.g(deviceCache, "deviceCache");
        G10.g(subscriberAttributesCache, "subscriberAttributesCache");
        G10.g(subscriberAttributesManager, "subscriberAttributesManager");
        G10.g(offeringsCache, "offeringsCache");
        G10.g(backend, "backend");
        G10.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.anonymousIdRegex = new C8146sG0("^\\$RCAnonymousID:([a-f0-9]{32})$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String oldAppUserId, String newAppUserId) {
        if (isUserIDAnonymous(oldAppUserId)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(oldAppUserId, newAppUserId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRandomID() {
        StringBuilder sb = new StringBuilder();
        sb.append("$RCAnonymousID:");
        String string = UUID.randomUUID().toString();
        G10.f(string, "randomUUID().toString()");
        Locale locale = Locale.ROOT;
        G10.f(locale, "ROOT");
        String lowerCase = string.toLowerCase(locale);
        G10.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strS = AY0.s(lowerCase, "-", "", false, 4, null);
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        sb.append(strS);
        return sb.toString();
    }

    private final void invalidateCustomerInfoAndETagCacheIfNeeded(String appUserID) {
        if (shouldInvalidateCustomerInfoAndETagCache(this.deviceCache.getCachedCustomerInfo(appUserID))) {
            LogUtilsKt.infoLog(IdentityStrings.INVALIDATING_CACHED_CUSTOMER_INFO);
            this.deviceCache.clearCustomerInfoCache(appUserID);
            this.backend.clearCaches();
        }
    }

    private final boolean isUserIDAnonymous(String appUserID) {
        return this.anonymousIdRegex.b(appUserID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String newUserID) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(newUserID);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateCustomerInfoAndETagCache(CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || G10.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x0004, B:7:0x000a, B:11:0x0016, B:22:0x0035, B:17:0x0021, B:19:0x0029, B:21:0x0031), top: B:27:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void configure(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            monitor-enter(r5)
            if (r6 == 0) goto L14
            boolean r1 = com.daaw.BY0.O(r6)     // Catch: java.lang.Throwable -> L12
            if (r1 != r0) goto L14
            com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.WARNING     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "Identifying with empty App User ID will be treated as anonymous."
            com.revenuecat.purchases.common.LogWrapperKt.log(r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r6 = move-exception
            goto L62
        L14:
            if (r6 == 0) goto L21
            boolean r1 = com.daaw.BY0.O(r6)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1d
            goto L1e
        L1d:
            r6 = 0
        L1e:
            if (r6 == 0) goto L21
            goto L35
        L21:
            com.revenuecat.purchases.common.caching.DeviceCache r6 = r5.deviceCache     // Catch: java.lang.Throwable -> L12
            java.lang.String r6 = r6.getCachedAppUserID()     // Catch: java.lang.Throwable -> L12
            if (r6 != 0) goto L35
            com.revenuecat.purchases.common.caching.DeviceCache r6 = r5.deviceCache     // Catch: java.lang.Throwable -> L12
            java.lang.String r6 = r6.getLegacyCachedAppUserID()     // Catch: java.lang.Throwable -> L12
            if (r6 != 0) goto L35
            java.lang.String r6 = r5.generateRandomID()     // Catch: java.lang.Throwable -> L12
        L35:
            com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.USER     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "Identifying App User ID: %s"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L12
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "format(this, *args)"
            com.daaw.G10.f(r0, r2)     // Catch: java.lang.Throwable -> L12
            com.revenuecat.purchases.common.LogWrapperKt.log(r1, r0)     // Catch: java.lang.Throwable -> L12
            com.revenuecat.purchases.common.caching.DeviceCache r0 = r5.deviceCache     // Catch: java.lang.Throwable -> L12
            r0.cacheAppUserID(r6)     // Catch: java.lang.Throwable -> L12
            com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache r0 = r5.subscriberAttributesCache     // Catch: java.lang.Throwable -> L12
            r0.cleanUpSubscriberAttributeCache(r6)     // Catch: java.lang.Throwable -> L12
            com.revenuecat.purchases.common.caching.DeviceCache r0 = r5.deviceCache     // Catch: java.lang.Throwable -> L12
            r0.cleanupOldAttributionData()     // Catch: java.lang.Throwable -> L12
            r5.invalidateCustomerInfoAndETagCacheIfNeeded(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)
            return
        L62:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.identity.IdentityManager.configure(java.lang.String):void");
    }

    public final synchronized boolean currentUserIsAnonymous() {
        String cachedAppUserID;
        try {
            cachedAppUserID = this.deviceCache.getCachedAppUserID();
            if (cachedAppUserID == null) {
                cachedAppUserID = "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return isUserIDAnonymous(cachedAppUserID) || G10.c(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        return cachedAppUserID == null ? "" : cachedAppUserID;
    }

    public final void logIn(String newAppUserID, InterfaceC3429bR onSuccess, NQ onError) {
        G10.g(newAppUserID, "newAppUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        if (BY0.O(newAppUserID)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            onError.invoke(purchasesError);
        } else {
            LogIntent logIntent = LogIntent.USER;
            String str = String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), newAppUserID}, 2));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(newAppUserID, new AnonymousClass2(getCurrentAppUserID(), newAppUserID, onError, onSuccess));
        }
    }

    public final synchronized void logOut(NQ completion) {
        G10.g(completion, "completion");
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new AnonymousClass1(completion));
        } else {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            completion.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
        }
    }

    public final void switchUser(String newAppUserID) {
        G10.g(newAppUserID, "newAppUserID");
        String str = String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{newAppUserID}, 1));
        G10.f(str, "format(this, *args)");
        LogUtilsKt.debugLog(str);
        resetAndSaveUserID(newAppUserID);
    }
}
