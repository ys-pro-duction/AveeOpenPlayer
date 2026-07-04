package com.daaw;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: com.daaw.Bn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0452Bn0 {
    public final C9693xn0 a;
    public final InterfaceC6857nf0 b;

    public C0452Bn0(C9693xn0 c9693xn0, InterfaceC6857nf0 interfaceC6857nf0) {
        this.a = c9693xn0;
        this.b = interfaceC6857nf0;
    }

    public final C0737Ee0 a(String str, String str2) {
        Pair pairA;
        if (str2 == null || (pairA = this.a.a(str)) == null) {
            return null;
        }
        LK lk = (LK) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        C7415pf0 c7415pf0Y = lk == LK.ZIP ? AbstractC1672Ne0.y(new ZipInputStream(inputStream), str) : AbstractC1672Ne0.o(inputStream, str);
        if (c7415pf0Y.b() != null) {
            return (C0737Ee0) c7415pf0Y.b();
        }
        return null;
    }

    public final C7415pf0 b(String str, String str2) {
        AbstractC1876Pd0.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC5173hf0 interfaceC5173hf0A = this.b.a(str);
                if (!interfaceC5173hf0A.G0()) {
                    C7415pf0 c7415pf0 = new C7415pf0((Throwable) new IllegalArgumentException(interfaceC5173hf0A.g0()));
                    try {
                        interfaceC5173hf0A.close();
                        return c7415pf0;
                    } catch (IOException e) {
                        AbstractC1876Pd0.d("LottieFetchResult close failed ", e);
                        return c7415pf0;
                    }
                }
                C7415pf0 c7415pf0D = d(str, interfaceC5173hf0A.m0(), interfaceC5173hf0A.c0(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(c7415pf0D.b() != null);
                AbstractC1876Pd0.a(sb.toString());
                try {
                    interfaceC5173hf0A.close();
                    return c7415pf0D;
                } catch (IOException e2) {
                    AbstractC1876Pd0.d("LottieFetchResult close failed ", e2);
                    return c7415pf0D;
                }
            } catch (Exception e3) {
                C7415pf0 c7415pf02 = new C7415pf0((Throwable) e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        AbstractC1876Pd0.d("LottieFetchResult close failed ", e4);
                    }
                }
                return c7415pf02;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    AbstractC1876Pd0.d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    public C7415pf0 c(String str, String str2) {
        C0737Ee0 c0737Ee0A = a(str, str2);
        if (c0737Ee0A != null) {
            return new C7415pf0(c0737Ee0A);
        }
        AbstractC1876Pd0.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }

    public final C7415pf0 d(String str, InputStream inputStream, String str2, String str3) {
        LK lk;
        C7415pf0 c7415pf0F;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC1876Pd0.a("Handling zip response.");
            lk = LK.ZIP;
            c7415pf0F = f(str, inputStream, str3);
        } else {
            AbstractC1876Pd0.a("Received json response.");
            lk = LK.JSON;
            c7415pf0F = e(str, inputStream, str3);
        }
        if (str3 != null && c7415pf0F.b() != null) {
            this.a.e(str, lk);
        }
        return c7415pf0F;
    }

    public final C7415pf0 e(String str, InputStream inputStream, String str2) {
        return str2 == null ? AbstractC1672Ne0.o(inputStream, null) : AbstractC1672Ne0.o(new FileInputStream(this.a.f(str, inputStream, LK.JSON).getAbsolutePath()), str);
    }

    public final C7415pf0 f(String str, InputStream inputStream, String str2) {
        return str2 == null ? AbstractC1672Ne0.y(new ZipInputStream(inputStream), null) : AbstractC1672Ne0.y(new ZipInputStream(new FileInputStream(this.a.f(str, inputStream, LK.ZIP))), str);
    }
}
