package com.daaw;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.daaw.in0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5491in0 {
    public static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC0555Cn.f(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC0555Cn.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5213hn0 interfaceC5213hn0 = (InterfaceC5213hn0) it.next();
            InputStream inputStreamF = null;
            try {
                inputStreamF = interfaceC5213hn0.f();
                if (inputStreamF != null) {
                    a(inputStreamF, new File(file, interfaceC5213hn0.g()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC0555Cn.f(null);
                throw th;
            }
            AbstractC0555Cn.f(inputStreamF);
        }
    }
}
