package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import com.daaw.AbstractC2911Yw;
import com.daaw.BY0;
import com.daaw.G10;
import com.revenuecat.purchases.PurchasesFactory;
import com.revenuecat.purchases.common.Anonymizer;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsAnonymizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011JQ\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory;", "", "Lcom/revenuecat/purchases/APIKeyValidator;", "apiKeyValidator", "<init>", "(Lcom/revenuecat/purchases/APIKeyValidator;)V", "Landroid/content/Context;", "Landroid/app/Application;", "getApplication", "(Landroid/content/Context;)Landroid/app/Application;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/util/concurrent/ExecutorService;", "createDefaultExecutor", "()Ljava/util/concurrent/ExecutorService;", "createDiagnosticsExecutor", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Ljava/net/URL;", "proxyURL", "Lcom/revenuecat/purchases/common/BillingAbstract;", "overrideBillingAbstract", "forceServerErrors", "forceSigningError", "runningIntegrationTests", "Lcom/revenuecat/purchases/Purchases;", "createPurchases", "(Lcom/revenuecat/purchases/PurchasesConfiguration;Lcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/common/BillingAbstract;ZZZ)Lcom/revenuecat/purchases/Purchases;", "Lcom/daaw/G91;", "validateConfiguration", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)V", "Lcom/revenuecat/purchases/APIKeyValidator;", "LowPriorityThreadFactory", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$LowPriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadName", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String str) {
            G10.g(str, "threadName");
            this.threadName = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable r) {
            return new Thread(new Runnable() { // from class: com.revenuecat.purchases.a
                @Override // java.lang.Runnable
                public final void run() {
                    PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1(r);
                }
            }, this.threadName);
        }
    }

    public PurchasesFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        G10.f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final ExecutorService createDiagnosticsExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-diagnostics-thread"));
        G10.f(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…cat-diagnostics-thread\"))");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static /* synthetic */ Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            billingAbstract = null;
        }
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, billingAbstract, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3);
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        G10.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public final Purchases createPurchases(PurchasesConfiguration configuration, PlatformInfo platformInfo, URL proxyURL, BillingAbstract overrideBillingAbstract, boolean forceServerErrors, boolean forceSigningError, boolean runningIntegrationTests) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        DiagnosticsTracker diagnosticsTracker;
        DiagnosticsFileHelper diagnosticsFileHelper;
        DeviceCache deviceCache;
        BillingAbstract billingAbstractCreateBilling;
        char c;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        G10.g(configuration, "configuration");
        G10.g(platformInfo, "platformInfo");
        validateConfiguration(configuration);
        Application application = getApplication(configuration.getContext());
        AppConfig appConfig = new AppConfig(configuration.getContext(), configuration.getObserverMode(), configuration.getShowInAppMessagesAutomatically(), platformInfo, proxyURL, configuration.getStore(), configuration.getDangerousSettings(), runningIntegrationTests, forceServerErrors, forceSigningError);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(ETagManager.INSTANCE.initializeSharedPreferences(configuration.getContext()), null, 2, null);
        ExecutorService service = configuration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher = new Dispatcher(service, runningIntegrationTests);
        Dispatcher dispatcher2 = new Dispatcher(createDiagnosticsExecutor(), runningIntegrationTests);
        if (configuration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(configuration.getContext()));
            diagnosticsFileHelper = diagnosticsFileHelper2;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper2, new DiagnosticsAnonymizer(new Anonymizer()), dispatcher2);
        } else {
            if (configuration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsTracker = null;
            diagnosticsFileHelper = null;
        }
        DiagnosticsTracker diagnosticsTracker2 = diagnosticsTracker;
        HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker2, new SigningManager(SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.INSTANCE, configuration.getVerificationMode(), null, 2, null), appConfig, configuration.getApiKey()), null, null, 48, null);
        BackendHelper backendHelper = new BackendHelper(configuration.getApiKey(), dispatcher, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig, dispatcher, dispatcher2, hTTPClient, backendHelper);
        G10.f(defaultSharedPreferences, "prefs");
        DeviceCache deviceCache2 = new DeviceCache(defaultSharedPreferences, configuration.getApiKey(), null, 4, null);
        if (overrideBillingAbstract == null) {
            deviceCache = deviceCache2;
            billingAbstractCreateBilling = BillingFactory.INSTANCE.createBilling(configuration.getStore(), application, backendHelper, deviceCache2, configuration.getObserverMode(), diagnosticsTracker2);
        } else {
            deviceCache = deviceCache2;
            billingAbstractCreateBilling = overrideBillingAbstract;
        }
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(configuration.getStore(), dispatcher);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher);
        BillingAbstract billingAbstract = billingAbstractCreateBilling;
        AbstractC2911Yw abstractC2911Yw = null;
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache, billingAbstract, null, 4, null), appConfig, null, 4, abstractC2911Yw), deviceCache, appConfig);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache, null, null, 6, null);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager);
        DeviceCache deviceCache3 = deviceCache;
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache3, identityManager, offlineEntitlementsManager, appConfig, null, 16, abstractC2911Yw);
        PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig, backend, billingAbstract, customerInfoUpdateHandler, deviceCache3, subscriberAttributesManager, offlineEntitlementsManager);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstract, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig, deviceCache3, billingAbstract, dispatcher, identityManager, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache3, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, null, 32, null);
        OfferingParser offeringParserCreateOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(configuration.getStore());
        if (diagnosticsFileHelper == null || diagnosticsTracker2 == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            c = 0;
            diagnosticsSynchronizer = null;
        } else {
            c = 0;
            diagnosticsSynchronizer = new DiagnosticsSynchronizer(diagnosticsFileHelper, diagnosticsTracker2, backend, dispatcher2, DiagnosticsSynchronizer.INSTANCE.initializeSharedPreferences(configuration.getContext()));
        }
        SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstract, identityManager, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend, new OfferingsFactory(billingAbstract, offeringParserCreateOfferingParser), null, 8, null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        Object[] objArr = new Object[1];
        objArr[c] = Purchases.INSTANCE.getFrameworkVersion();
        String str = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(objArr, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Object[] objArr2 = new Object[1];
        objArr2[c] = appConfig.getPackageName();
        String str2 = String.format(ConfigureStrings.PACKAGE_NAME, Arrays.copyOf(objArr2, 1));
        G10.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        LogIntent logIntent2 = LogIntent.USER;
        Object[] objArr3 = new Object[1];
        objArr3[c] = configuration.getAppUserID();
        String str3 = String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(objArr3, 1));
        G10.f(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str3);
        Object[] objArr4 = new Object[1];
        objArr4[c] = configuration.getVerificationMode().name();
        String str4 = String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(objArr4, 1));
        G10.f(str4, "format(this, *args)");
        LogWrapperKt.log(logIntent, str4);
        return new Purchases(new PurchasesOrchestrator(application, configuration.getAppUserID(), backend, billingAbstract, deviceCache3, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, null, 131072, null));
    }

    public final void validateConfiguration(PurchasesConfiguration configuration) {
        G10.g(configuration, "configuration");
        if (!hasPermission(configuration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.");
        }
        if (BY0.O(configuration.getApiKey())) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app");
        }
        if (!(configuration.getContext().getApplicationContext() instanceof Application)) {
            throw new IllegalArgumentException("Needs an application context.");
        }
        this.apiKeyValidator.validateAndLog(configuration.getApiKey(), configuration.getStore());
    }

    public PurchasesFactory(APIKeyValidator aPIKeyValidator) {
        G10.g(aPIKeyValidator, "apiKeyValidator");
        this.apiKeyValidator = aPIKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(APIKeyValidator aPIKeyValidator, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}
