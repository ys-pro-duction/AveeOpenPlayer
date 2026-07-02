package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: com.daaw.Pl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1908Pl0 implements Closeable, AutoCloseable {
    public final File B;
    public final long C;
    public final File D;
    public final RandomAccessFile E;
    public final FileChannel F;
    public final FileLock G;

    /* JADX INFO: renamed from: com.daaw.Pl0$a */
    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pl0$b */
    public static class b extends File {
        public long B;

        public b(File file, String str) {
            super(file, str);
            this.B = -1L;
        }
    }

    public C1908Pl0(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.B = file;
        this.D = file2;
        this.C = o(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.E = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.F = channel;
            try {
                file3.getPath();
                this.G = channel.lock();
                file3.getPath();
            } catch (IOException e) {
                e = e;
                c(this.F);
                throw e;
            } catch (Error e2) {
                e = e2;
                c(this.F);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                c(this.F);
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            c(this.E);
            throw e;
        } catch (Error e5) {
            e = e5;
            c(this.E);
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c(this.E);
            throw e;
        }
    }

    public static void R(Context context, String str, long j, long j2, List list) {
        SharedPreferences.Editor editorEdit = j(context).edit();
        editorEdit.putLong(str + DiagnosticsEntry.Event.TIMESTAMP_KEY, j);
        editorEdit.putLong(str + "crc", j2);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            editorEdit.putLong(str + "dex.crc." + i, bVar.B);
            editorEdit.putLong(str + "dex.time." + i, bVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    public static void c(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                file.getPath();
                if (fileCreateTempFile.renameTo(file)) {
                    c(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            c(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static SharedPreferences j(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static long l(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long o(File file) throws IOException {
        long jC = AbstractC1070Hj1.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean s(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferencesJ = j(context);
        if (sharedPreferencesJ.getLong(str + DiagnosticsEntry.Event.TIMESTAMP_KEY, -1L) != l(file)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("crc");
        return sharedPreferencesJ.getLong(sb.toString(), -1L) != j;
    }

    public List F(Context context, String str, boolean z) {
        List listN;
        List listI;
        this.B.getPath();
        if (!this.G.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !s(context, this.B, this.C, str)) {
            try {
                listI = I(context, str);
            } catch (IOException unused) {
                listN = N();
                R(context, str, l(this.B), this.C, listN);
                listI = listN;
            }
            listI.size();
            return listI;
        }
        listN = N();
        R(context, str, l(this.B), this.C, listN);
        listI = listN;
        listI.size();
        return listI;
    }

    public final List I(Context context, String str) throws IOException {
        String str2 = this.B.getName() + ".classes";
        SharedPreferences sharedPreferencesJ = j(context);
        int i = sharedPreferencesJ.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.D, str2 + i2 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.B = o(bVar);
            long j = sharedPreferencesJ.getLong(str + "dex.crc." + i2, -1L);
            long j2 = sharedPreferencesJ.getLong(str + "dex.time." + i2, -1L);
            long jLastModified = bVar.lastModified();
            if (j2 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesJ;
                if (j == bVar.B) {
                    arrayList.add(bVar);
                    i2++;
                    sharedPreferencesJ = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + bVar.B);
        }
        return arrayList;
    }

    public final List N() {
        String str = this.B.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.B);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("classes");
            int i = 2;
            sb.append(2);
            sb.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb.toString());
            while (entry != null) {
                b bVar = new b(this.D, str + i + ".zip");
                arrayList.add(bVar);
                bVar.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    d(zipFile, entry, bVar, str);
                    try {
                        bVar.B = o(bVar);
                        z = true;
                    } catch (IOException unused) {
                        bVar.getAbsolutePath();
                        z = false;
                    }
                    bVar.getAbsolutePath();
                    bVar.length();
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            bVar.getPath();
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final void a() {
        File[] fileArrListFiles = this.D.listFiles(new a());
        if (fileArrListFiles == null) {
            this.D.getPath();
            return;
        }
        for (File file : fileArrListFiles) {
            file.getPath();
            file.length();
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.G.release();
        this.F.close();
        this.E.close();
    }
}
