package com.revenuecat.purchases;

import android.content.Context;
import com.daaw.G10;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration;", "", "builder", "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "appUserID", "getAppUserID", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "diagnosticsEnabled", "", "getDiagnosticsEnabled", "()Z", "observerMode", "getObserverMode", "service", "Ljava/util/concurrent/ExecutorService;", "getService", "()Ljava/util/concurrent/ExecutorService;", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "Builder", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean observerMode;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\b\u00104\u001a\u000205H\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u00106\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.J\u0010\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0016H\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR*\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR&\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020(8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R&\u0010/\u001a\u00020.2\u0006\u0010\t\u001a\u00020.8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "", "context", "Landroid/content/Context;", "apiKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApiKey$purchases_defaultsRelease", "()Ljava/lang/String;", "<set-?>", "appUserID", "getAppUserID$purchases_defaultsRelease", "setAppUserID$purchases_defaultsRelease", "(Ljava/lang/String;)V", "getContext$purchases_defaultsRelease", "()Landroid/content/Context;", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "getDangerousSettings$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/DangerousSettings;", "setDangerousSettings$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/DangerousSettings;)V", "", "diagnosticsEnabled", "getDiagnosticsEnabled$purchases_defaultsRelease", "()Z", "setDiagnosticsEnabled$purchases_defaultsRelease", "(Z)V", "observerMode", "getObserverMode$purchases_defaultsRelease", "setObserverMode$purchases_defaultsRelease", "Ljava/util/concurrent/ExecutorService;", "service", "getService$purchases_defaultsRelease", "()Ljava/util/concurrent/ExecutorService;", "setService$purchases_defaultsRelease", "(Ljava/util/concurrent/ExecutorService;)V", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically$purchases_defaultsRelease", "setShowInAppMessagesAutomatically$purchases_defaultsRelease", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getStore$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Store;", "setStore$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "getVerificationMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "setVerificationMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V", "build", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "entitlementVerificationMode", "informationalVerificationModeAndDiagnosticsEnabled", "enabled", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private DangerousSettings dangerousSettings;
        private boolean diagnosticsEnabled;
        private boolean observerMode;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically;
        private Store store;
        private EntitlementVerificationMode verificationMode;

        public Builder(Context context, String str) {
            G10.g(context, "context");
            G10.g(str, "apiKey");
            this.context = context;
            this.apiKey = str;
            this.showInAppMessagesAutomatically = true;
            this.store = Store.PLAY_STORE;
            this.verificationMode = EntitlementVerificationMode.INSTANCE.getDefault();
            this.dangerousSettings = new DangerousSettings(false, 1, null);
        }

        public final Builder appUserID(String appUserID) {
            this.appUserID = appUserID;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            G10.g(dangerousSettings, "dangerousSettings");
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean diagnosticsEnabled) {
            this.diagnosticsEnabled = diagnosticsEnabled;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode verificationMode) {
            G10.g(verificationMode, "verificationMode");
            this.verificationMode = verificationMode;
            return this;
        }

        /* JADX INFO: renamed from: getApiKey$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: getAppUserID$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: getContext$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: getDangerousSettings$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ DangerousSettings getDangerousSettings() {
            return this.dangerousSettings;
        }

        /* JADX INFO: renamed from: getDiagnosticsEnabled$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getDiagnosticsEnabled() {
            return this.diagnosticsEnabled;
        }

        /* JADX INFO: renamed from: getObserverMode$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getObserverMode() {
            return this.observerMode;
        }

        /* JADX INFO: renamed from: getService$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ ExecutorService getService() {
            return this.service;
        }

        /* JADX INFO: renamed from: getShowInAppMessagesAutomatically$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getShowInAppMessagesAutomatically() {
            return this.showInAppMessagesAutomatically;
        }

        /* JADX INFO: renamed from: getStore$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ Store getStore() {
            return this.store;
        }

        /* JADX INFO: renamed from: getVerificationMode$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ EntitlementVerificationMode getVerificationMode() {
            return this.verificationMode;
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public final /* synthetic */ Builder informationalVerificationModeAndDiagnosticsEnabled(boolean enabled) {
            if (enabled) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                this.diagnosticsEnabled = true;
                return this;
            }
            this.verificationMode = EntitlementVerificationMode.DISABLED;
            this.diagnosticsEnabled = false;
            return this;
        }

        public final Builder observerMode(boolean observerMode) {
            this.observerMode = observerMode;
            return this;
        }

        public final Builder service(ExecutorService service) {
            G10.g(service, "service");
            this.service = service;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_defaultsRelease(String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_defaultsRelease(DangerousSettings dangerousSettings) {
            G10.g(dangerousSettings, "<set-?>");
            this.dangerousSettings = dangerousSettings;
        }

        public final /* synthetic */ void setDiagnosticsEnabled$purchases_defaultsRelease(boolean z) {
            this.diagnosticsEnabled = z;
        }

        public final /* synthetic */ void setObserverMode$purchases_defaultsRelease(boolean z) {
            this.observerMode = z;
        }

        public final /* synthetic */ void setService$purchases_defaultsRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setShowInAppMessagesAutomatically$purchases_defaultsRelease(boolean z) {
            this.showInAppMessagesAutomatically = z;
        }

        public final /* synthetic */ void setStore$purchases_defaultsRelease(Store store) {
            G10.g(store, "<set-?>");
            this.store = store;
        }

        public final /* synthetic */ void setVerificationMode$purchases_defaultsRelease(EntitlementVerificationMode entitlementVerificationMode) {
            G10.g(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean showInAppMessagesAutomatically) {
            this.showInAppMessagesAutomatically = showInAppMessagesAutomatically;
            return this;
        }

        public final Builder store(Store store) {
            G10.g(store, ProductResponseJsonKeys.STORE);
            this.store = store;
            return this;
        }
    }

    public PurchasesConfiguration(Builder builder) {
        G10.g(builder, "builder");
        this.context = builder.getContext();
        this.apiKey = builder.getApiKey();
        this.appUserID = builder.getAppUserID();
        this.observerMode = builder.getObserverMode();
        this.service = builder.getService();
        this.store = builder.getStore();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled();
        this.verificationMode = builder.getVerificationMode();
        this.dangerousSettings = builder.getDangerousSettings();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically();
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getObserverMode() {
        return this.observerMode;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }
}
