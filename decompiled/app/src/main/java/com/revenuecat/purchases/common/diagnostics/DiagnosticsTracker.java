package com.revenuecat.purchases.common.diagnostics;

import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC2911Yw;
import com.daaw.C0576Cs0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.LE;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u001b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\"\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010!J3\u0010&\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010!J\u0017\u0010(\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b0\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;", "diagnosticsAnonymizer", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "Lcom/daaw/LE;", "responseTime", "", "wasSuccessful", "", "responseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "resultOrigin", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "Lcom/daaw/G91;", "trackHttpRequestPerformed-NcHsxvU", "(Lcom/revenuecat/purchases/common/networking/Endpoint;JZILcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;)V", "trackHttpRequestPerformed", "", "productType", "billingResponseCode", "billingDebugMessage", "trackGoogleQueryProductDetailsRequest-Wn2Vu4Y", "(Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryProductDetailsRequest", "trackGoogleQueryPurchasesRequest-Wn2Vu4Y", "trackGoogleQueryPurchasesRequest", "trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y", "trackGoogleQueryPurchaseHistoryRequest", "useCurrentThread", "trackMaxEventsStoredLimitReached", "(Z)V", "trackProductDetailsNotSupported", "(ILjava/lang/String;)V", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "trackEvent", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "trackEventInCurrentThread$purchases_defaultsRelease", "trackEventInCurrentThread", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsTracker {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final DiagnosticsAnonymizer diagnosticsAnonymizer;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$Companion;", "", "()V", "ENDPOINT_NAME_KEY", "", "ETAG_HIT_KEY", "PRODUCT_TYPE_QUERIED_KEY", "RESPONSE_CODE_KEY", "RESPONSE_TIME_MILLIS_KEY", "SUCCESSFUL_KEY", "VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        private Companion() {
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsAnonymizer diagnosticsAnonymizer, Dispatcher dispatcher) {
        G10.g(appConfig, "appConfig");
        G10.g(diagnosticsFileHelper, "diagnosticsFileHelper");
        G10.g(diagnosticsAnonymizer, "diagnosticsAnonymizer");
        G10.g(dispatcher, "diagnosticsDispatcher");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsAnonymizer = diagnosticsAnonymizer;
        this.diagnosticsDispatcher = dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackEvent$lambda$0(DiagnosticsTracker diagnosticsTracker, DiagnosticsEntry diagnosticsEntry) {
        G10.g(diagnosticsTracker, "this$0");
        G10.g(diagnosticsEntry, "$diagnosticsEntry");
        diagnosticsTracker.trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z);
    }

    public final void trackEvent(final DiagnosticsEntry diagnosticsEntry) {
        G10.g(diagnosticsEntry, "diagnosticsEntry");
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: com.daaw.MB
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsTracker.trackEvent$lambda$0(this.B, diagnosticsEntry);
            }
        }, null, 2, null);
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(DiagnosticsEntry diagnosticsEntry) {
        G10.g(diagnosticsEntry, "diagnosticsEntry");
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsEntry diagnosticsEntryAnonymizeEntryIfNeeded = this.diagnosticsAnonymizer.anonymizeEntryIfNeeded(diagnosticsEntry);
            LogUtilsKt.verboseLog("Tracking diagnostics event: " + diagnosticsEntryAnonymizeEntryIfNeeded);
            try {
                this.diagnosticsFileHelper.appendEntryToDiagnosticsFile(diagnosticsEntryAnonymizeEntryIfNeeded);
            } catch (IOException e) {
                LogUtilsKt.verboseLog("Error tracking diagnostics event: " + e);
            }
        }
    }

    /* JADX INFO: renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m101trackGoogleQueryProductDetailsRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        G10.g(productType, "productType");
        G10.g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, AbstractC1473Lg0.k(D61.a(PRODUCT_TYPE_QUERIED_KEY, productType), D61.a("billing_response_code", Integer.valueOf(billingResponseCode)), D61.a("billing_debug_message", billingDebugMessage), D61.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(LE.s(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m102trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        G10.g(productType, "productType");
        G10.g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, AbstractC1473Lg0.k(D61.a(PRODUCT_TYPE_QUERIED_KEY, productType), D61.a("billing_response_code", Integer.valueOf(billingResponseCode)), D61.a("billing_debug_message", billingDebugMessage), D61.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(LE.s(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m103trackGoogleQueryPurchasesRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        G10.g(productType, "productType");
        G10.g(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PURCHASES_REQUEST, AbstractC1473Lg0.k(D61.a(PRODUCT_TYPE_QUERIED_KEY, productType), D61.a("billing_response_code", Integer.valueOf(billingResponseCode)), D61.a("billing_debug_message", billingDebugMessage), D61.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(LE.s(responseTime)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackHttpRequestPerformed-NcHsxvU, reason: not valid java name */
    public final void m104trackHttpRequestPerformedNcHsxvU(Endpoint endpoint, long responseTime, boolean wasSuccessful, int responseCode, HTTPResult.Origin resultOrigin, VerificationResult verificationResult) {
        G10.g(endpoint, "endpoint");
        G10.g(verificationResult, "verificationResult");
        boolean z = resultOrigin == HTTPResult.Origin.CACHE;
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.HTTP_REQUEST_PERFORMED, AbstractC1473Lg0.k(D61.a(ENDPOINT_NAME_KEY, endpoint.getName()), D61.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(LE.s(responseTime))), D61.a(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), D61.a(RESPONSE_CODE_KEY, Integer.valueOf(responseCode)), D61.a(ETAG_HIT_KEY, Boolean.valueOf(z)), D61.a(VERIFICATION_RESULT_KEY, verificationResult.name())), null, null, 12, null));
        trackEvent(new DiagnosticsEntry.Counter(DiagnosticsCounterName.HTTP_REQUEST_PERFORMED, AbstractC1473Lg0.k(D61.a(ENDPOINT_NAME_KEY, endpoint.getName()), D61.a(SUCCESSFUL_KEY, String.valueOf(wasSuccessful)), D61.a(RESPONSE_CODE_KEY, String.valueOf(responseCode)), D61.a(ETAG_HIT_KEY, String.valueOf(z)), D61.a(VERIFICATION_RESULT_KEY, verificationResult.name())), 1));
    }

    public final void trackMaxEventsStoredLimitReached(boolean useCurrentThread) {
        DiagnosticsEntry.Event event = new DiagnosticsEntry.Event(DiagnosticsEventName.MAX_EVENTS_STORED_LIMIT_REACHED, AbstractC1473Lg0.h(), null, null, 12, null);
        if (useCurrentThread) {
            trackEventInCurrentThread$purchases_defaultsRelease(event);
        } else {
            trackEvent(event);
        }
    }

    public final void trackProductDetailsNotSupported(int billingResponseCode, String billingDebugMessage) {
        G10.g(billingDebugMessage, "billingDebugMessage");
        DiagnosticsCounterName diagnosticsCounterName = DiagnosticsCounterName.PRODUCT_DETAILS_NOT_SUPPORTED;
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        C0576Cs0 c0576Cs0A = D61.a("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        trackEvent(new DiagnosticsEntry.Counter(diagnosticsCounterName, AbstractC1473Lg0.k(c0576Cs0A, D61.a("play_services_version", playServicesVersionName != null ? playServicesVersionName : ""), D61.a("billing_response_code", String.valueOf(billingResponseCode)), D61.a("billing_debug_message", billingDebugMessage)), 1));
    }
}
