package com.revenuecat.purchases.common.diagnostics;

import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u000b2\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;)V", "", "isDiagnosticsFileTooBig", "()Z", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "Lcom/daaw/G91;", "appendEntryToDiagnosticsFile", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "", "eventsToDeleteCount", "deleteOlderDiagnostics", "(I)V", "deleteDiagnosticsFile", "()V", "Lkotlin/Function1;", "j$/util/stream/Stream", "Lorg/json/JSONObject;", "streamBlock", "readDiagnosticsFile", "(Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/common/FileHelper;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsFileHelper {
    public static final int DIAGNOSTICS_FILE_LIMIT_IN_KB = 500;
    public static final String DIAGNOSTICS_FILE_PATH = "RevenueCat/diagnostics/diagnostic_entries.jsonl";
    private final FileHelper fileHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper$readDiagnosticsFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"j$/util/stream/Stream", "", "stream", "Lcom/daaw/G91;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $streamBlock;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper$readDiagnosticsFile$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C02831 extends AbstractC4192e90 implements NQ {
            public static final C02831 INSTANCE = new C02831();

            public C02831() {
                super(1);
            }

            @Override // com.daaw.NQ
            public final JSONObject invoke(String str) {
                return new JSONObject(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NQ nq) {
            super(1);
            this.$streamBlock = nq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final JSONObject invoke$lambda$0(NQ nq, Object obj) {
            G10.g(nq, "$tmp0");
            return (JSONObject) nq.invoke(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return G91.a;
        }

        public final void invoke(Stream<String> stream) {
            G10.g(stream, "stream");
            NQ nq = this.$streamBlock;
            final C02831 c02831 = C02831.INSTANCE;
            Object map = stream.map(new Function() { // from class: com.revenuecat.purchases.common.diagnostics.a
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DiagnosticsFileHelper.AnonymousClass1.invoke$lambda$0(c02831, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            G10.f(map, "stream.map { JSONObject(it) }");
            nq.invoke(map);
        }
    }

    public DiagnosticsFileHelper(FileHelper fileHelper) {
        G10.g(fileHelper, "fileHelper");
        this.fileHelper = fileHelper;
    }

    public final synchronized void appendEntryToDiagnosticsFile(DiagnosticsEntry diagnosticsEntry) {
        G10.g(diagnosticsEntry, "diagnosticsEntry");
        FileHelper fileHelper = this.fileHelper;
        StringBuilder sb = new StringBuilder();
        sb.append(diagnosticsEntry);
        sb.append('\n');
        fileHelper.appendToFile(DIAGNOSTICS_FILE_PATH, sb.toString());
    }

    public final synchronized void deleteDiagnosticsFile() {
        if (!this.fileHelper.deleteFile(DIAGNOSTICS_FILE_PATH)) {
            LogUtilsKt.verboseLog("Failed to delete diagnostics file.");
        }
    }

    public final synchronized void deleteOlderDiagnostics(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(DIAGNOSTICS_FILE_PATH, eventsToDeleteCount);
    }

    public final synchronized boolean isDiagnosticsFileTooBig() {
        return this.fileHelper.fileSizeInKB(DIAGNOSTICS_FILE_PATH) > 500.0d;
    }

    public final synchronized void readDiagnosticsFile(NQ streamBlock) {
        try {
            G10.g(streamBlock, "streamBlock");
            if (this.fileHelper.fileIsEmpty(DIAGNOSTICS_FILE_PATH)) {
                Stream streamEmpty = Stream.CC.empty();
                G10.f(streamEmpty, "empty()");
                streamBlock.invoke(streamEmpty);
            } else {
                this.fileHelper.readFilePerLines(DIAGNOSTICS_FILE_PATH, new AnonymousClass1(streamBlock));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
