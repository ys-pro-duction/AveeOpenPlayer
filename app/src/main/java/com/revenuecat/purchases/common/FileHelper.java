package com.revenuecat.purchases.common;

import android.content.Context;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC6891nm;
import com.daaw.C0335Ak;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.utils.FileExtensionsKt;
import j$.io.BufferedReaderRetargetClass;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\u001e\u0010\rJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/FileHelper;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "filePath", "Lkotlin/Function1;", "Ljava/io/BufferedReader;", "Lcom/daaw/G91;", "contentBlock", "openBufferedReader", "(Ljava/lang/String;Lcom/daaw/NQ;)V", "Ljava/io/File;", "getFileInFilesDir", "(Ljava/lang/String;)Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "", "fileSizeInKB", "(Ljava/lang/String;)D", "contentToAppend", "appendToFile", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deleteFile", "(Ljava/lang/String;)Z", "j$/util/stream/Stream", "streamBlock", "readFilePerLines", "", "numberOfLinesToRemove", "removeFirstLinesFromFile", "(Ljava/lang/String;I)V", "fileIsEmpty", "Landroid/content/Context;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileHelper {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$readFilePerLines$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/BufferedReader;", "bufferedReader", "Lcom/daaw/G91;", "invoke", "(Ljava/io/BufferedReader;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $streamBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NQ nq) {
            super(1);
            this.$streamBlock = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BufferedReader) obj);
            return G91.a;
        }

        public final void invoke(BufferedReader bufferedReader) {
            G10.g(bufferedReader, "bufferedReader");
            NQ nq = this.$streamBlock;
            Stream streamLines = BufferedReaderRetargetClass.lines(bufferedReader);
            G10.f(streamLines, "bufferedReader.lines()");
            nq.invoke(streamLines);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"j$/util/stream/Stream", "", "stream", "Lcom/daaw/G91;", "invoke", "(Lj$/util/stream/Stream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103491 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ int $numberOfLinesToRemove;
        final /* synthetic */ StringBuilder $textToAppend;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.FileHelper$removeFirstLinesFromFile$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "line", "Lcom/daaw/G91;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02821 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ StringBuilder $textToAppend;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02821(StringBuilder sb) {
                super(1);
                this.$textToAppend = sb;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return G91.a;
            }

            public final void invoke(String str) {
                StringBuilder sb = this.$textToAppend;
                sb.append(str);
                sb.append("\n");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103491(int i, StringBuilder sb) {
            super(1);
            this.$numberOfLinesToRemove = i;
            this.$textToAppend = sb;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(NQ nq, Object obj) {
            G10.g(nq, "$tmp0");
            nq.invoke(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<String>) obj);
            return G91.a;
        }

        public final void invoke(Stream<String> stream) {
            G10.g(stream, "stream");
            Stream<String> streamSkip = stream.skip(this.$numberOfLinesToRemove);
            final C02821 c02821 = new C02821(this.$textToAppend);
            streamSkip.forEach(new Consumer() { // from class: com.revenuecat.purchases.common.a
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void p(Object obj) {
                    FileHelper.C103491.invoke$lambda$0(c02821, obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public FileHelper(Context context) {
        G10.g(context, "applicationContext");
        this.applicationContext = context;
    }

    private final File getFileInFilesDir(String filePath) {
        return new File(getFilesDir(), filePath);
    }

    private final File getFilesDir() {
        File filesDir = this.applicationContext.getFilesDir();
        G10.f(filesDir, "applicationContext.filesDir");
        return filesDir;
    }

    private final void openBufferedReader(String filePath, NQ contentBlock) throws IllegalAccessException, IOException, InvocationTargetException {
        FileInputStream fileInputStream = new FileInputStream(getFileInFilesDir(filePath));
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    contentBlock.invoke(bufferedReader);
                    G91 g91 = G91.a;
                    AbstractC6891nm.a(bufferedReader, null);
                    AbstractC6891nm.a(inputStreamReader, null);
                    AbstractC6891nm.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void appendToFile(String filePath, String contentToAppend) throws IllegalAccessException, IOException, InvocationTargetException {
        G10.g(filePath, "filePath");
        G10.g(contentToAppend, "contentToAppend");
        File fileInFilesDir = getFileInFilesDir(filePath);
        File parentFile = fileInFilesDir.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileInFilesDir, true);
        try {
            byte[] bytes = contentToAppend.getBytes(C0335Ak.b);
            G10.f(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            G91 g91 = G91.a;
            AbstractC6891nm.a(fileOutputStream, null);
        } finally {
        }
    }

    public final boolean deleteFile(String filePath) {
        G10.g(filePath, "filePath");
        return getFileInFilesDir(filePath).delete();
    }

    public final boolean fileIsEmpty(String filePath) {
        G10.g(filePath, "filePath");
        File fileInFilesDir = getFileInFilesDir(filePath);
        return !fileInFilesDir.exists() || fileInFilesDir.length() == 0;
    }

    public final double fileSizeInKB(String filePath) {
        G10.g(filePath, "filePath");
        return FileExtensionsKt.getSizeInKB(getFileInFilesDir(filePath));
    }

    public final void readFilePerLines(String filePath, NQ streamBlock) throws IllegalAccessException, IOException, InvocationTargetException {
        G10.g(filePath, "filePath");
        G10.g(streamBlock, "streamBlock");
        openBufferedReader(filePath, new AnonymousClass1(streamBlock));
    }

    public final void removeFirstLinesFromFile(String filePath, int numberOfLinesToRemove) throws IllegalAccessException, IOException, InvocationTargetException {
        G10.g(filePath, "filePath");
        StringBuilder sb = new StringBuilder();
        readFilePerLines(filePath, new C103491(numberOfLinesToRemove, sb));
        deleteFile(filePath);
        String string = sb.toString();
        G10.f(string, "textToAppend.toString()");
        appendToFile(filePath, string);
    }
}
