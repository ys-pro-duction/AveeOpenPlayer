package com.daaw;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.xn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9693xn0 {
    public final InterfaceC6578mf0 a;

    public C9693xn0(InterfaceC6578mf0 interfaceC6578mf0) {
        this.a = interfaceC6578mf0;
    }

    public static String b(String str, LK lk, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? lk.a() : lk.B);
        return sb.toString();
    }

    public Pair a(String str) {
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileC);
            LK lk = fileC.getAbsolutePath().endsWith(".zip") ? LK.ZIP : LK.JSON;
            AbstractC1876Pd0.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair(lk, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final File c(String str) {
        File file = new File(d(), b(str, LK.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(d(), b(str, LK.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final File d() {
        File fileA = this.a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public void e(String str, LK lk) {
        File file = new File(d(), b(str, lk, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        AbstractC1876Pd0.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        AbstractC1876Pd0.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    public File f(String str, InputStream inputStream, LK lk) throws IOException {
        File file = new File(d(), b(str, lk, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
