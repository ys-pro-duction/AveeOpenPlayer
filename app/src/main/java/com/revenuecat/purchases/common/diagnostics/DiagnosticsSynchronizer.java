package com.revenuecat.purchases.common.diagnostics;

import android.content.Context;
import android.content.SharedPreferences;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4192e90;
import com.daaw.C6748nF0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/Dispatcher;Landroid/content/SharedPreferences;)V", "", "Lorg/json/JSONObject;", "getEventsToSync", "()Ljava/util/List;", "Lkotlin/Function0;", "Lcom/daaw/G91;", "command", "enqueue", "(Lcom/daaw/LQ;)V", "clearConsecutiveNumberOfErrors", "()V", "", "increaseConsecutiveNumberOfErrors", "()I", "resetDiagnosticsStatus", "clearDiagnosticsFileIfTooBig", "syncDiagnosticsFileIfNeeded", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Landroid/content/SharedPreferences;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsSynchronizer {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsTracker diagnosticsTracker;
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer$Companion;", "", "()V", "CONSECUTIVE_FAILURES_COUNT_KEY", "", "getCONSECUTIVE_FAILURES_COUNT_KEY$annotations", "MAX_EVENTS_TO_SYNC_PER_REQUEST", "", "getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations", "MAX_NUMBER_POST_RETRIES", "", "getMAX_NUMBER_POST_RETRIES$annotations", "initializeSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            G10.g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            G10.f(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$getEventsToSync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"j$/util/stream/Stream", "Lorg/json/JSONObject;", "stream", "Lcom/daaw/G91;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ C6748nF0 $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6748nF0 c6748nF0) {
            super(1);
            this.$eventsToSync = c6748nF0;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<JSONObject>) obj);
            return G91.a;
        }

        public final void invoke(Stream<JSONObject> stream) {
            G10.g(stream, "stream");
            C6748nF0 c6748nF0 = this.$eventsToSync;
            Object objCollect = stream.limit(200L).collect(Collectors.toList());
            G10.f(objCollect, "stream.limit(MAX_EVENTS_…lect(Collectors.toList())");
            c6748nF0.B = objCollect;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103531 extends AbstractC4192e90 implements LQ {

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/daaw/G91;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02841 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ int $diagnosticsCount;
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02841(DiagnosticsSynchronizer diagnosticsSynchronizer, int i) {
                super(1);
                this.this$0 = diagnosticsSynchronizer;
                this.$diagnosticsCount = i;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return G91.a;
            }

            public final void invoke(JSONObject jSONObject) {
                G10.g(jSONObject, "it");
                LogUtilsKt.verboseLog("Synced diagnostics file successfully.");
                this.this$0.clearConsecutiveNumberOfErrors();
                this.this$0.diagnosticsFileHelper.deleteOlderDiagnostics(this.$diagnosticsCount);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "shouldRetry", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass2 extends AbstractC4192e90 implements InterfaceC3429bR {
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DiagnosticsSynchronizer diagnosticsSynchronizer) {
                super(2);
                this.this$0 = diagnosticsSynchronizer;
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return G91.a;
            }

            public final void invoke(PurchasesError purchasesError, boolean z) {
                G10.g(purchasesError, "error");
                if (!z) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Deleting diagnostics file without retrying.");
                    this.this$0.resetDiagnosticsStatus();
                    return;
                }
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". Will retry the next time the SDK is initialized");
                if (this.this$0.increaseConsecutiveNumberOfErrors() >= 3) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + purchasesError + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                    this.this$0.resetDiagnosticsStatus();
                }
            }
        }

        public C103531() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m100invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m100invoke() throws Throwable {
            try {
                List<? extends JSONObject> eventsToSync = DiagnosticsSynchronizer.this.getEventsToSync();
                int size = eventsToSync.size();
                if (size == 0) {
                    LogUtilsKt.verboseLog("No diagnostics to sync.");
                } else {
                    DiagnosticsSynchronizer.this.backend.postDiagnostics(eventsToSync, new C02841(DiagnosticsSynchronizer.this, size), new AnonymousClass2(DiagnosticsSynchronizer.this));
                }
            } catch (Exception e) {
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + e);
                try {
                    DiagnosticsSynchronizer.this.resetDiagnosticsStatus();
                } catch (IOException e2) {
                    LogUtilsKt.verboseLog("Error deleting diagnostics file: " + e2);
                }
            }
        }
    }

    public DiagnosticsSynchronizer(DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher dispatcher, SharedPreferences sharedPreferences) {
        G10.g(diagnosticsFileHelper, "diagnosticsFileHelper");
        G10.g(diagnosticsTracker, "diagnosticsTracker");
        G10.g(backend, "backend");
        G10.g(dispatcher, "diagnosticsDispatcher");
        G10.g(sharedPreferences, "sharedPreferences");
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = dispatcher;
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearConsecutiveNumberOfErrors() {
        this.sharedPreferences.edit().remove(CONSECUTIVE_FAILURES_COUNT_KEY).apply();
    }

    private final void enqueue(final LQ command) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: com.daaw.LB
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsSynchronizer.enqueue$lambda$0(command);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(LQ lq) {
        G10.g(lq, "$tmp0");
        lq.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<JSONObject> getEventsToSync() {
        C6748nF0 c6748nF0 = new C6748nF0();
        c6748nF0.B = AbstractC1599Mm.k();
        this.diagnosticsFileHelper.readDiagnosticsFile(new AnonymousClass1(c6748nF0));
        return (List) c6748nF0.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int increaseConsecutiveNumberOfErrors() {
        int i = this.sharedPreferences.getInt(CONSECUTIVE_FAILURES_COUNT_KEY, 0) + 1;
        this.sharedPreferences.edit().putInt(CONSECUTIVE_FAILURES_COUNT_KEY, i).apply();
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteDiagnosticsFile();
    }

    public final void clearDiagnosticsFileIfTooBig() {
        if (this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
            LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
            DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(this.diagnosticsTracker, false, 1, null);
            resetDiagnosticsStatus();
        }
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new C103531());
    }
}
