package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class YO0 {
    public static FO0 a;
    public static long b;

    public static void a(FO0 fo0) {
        if (fo0.f != null || fo0.g != null) {
            throw new IllegalArgumentException();
        }
        if (fo0.d) {
            return;
        }
        synchronized (YO0.class) {
            try {
                long j = b;
                if (j + 8192 > 65536) {
                    return;
                }
                b = j + 8192;
                fo0.f = a;
                fo0.c = 0;
                fo0.b = 0;
                a = fo0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FO0 b() {
        synchronized (YO0.class) {
            try {
                FO0 fo0 = a;
                if (fo0 == null) {
                    return new FO0();
                }
                a = fo0.f;
                fo0.f = null;
                b -= 8192;
                return fo0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
