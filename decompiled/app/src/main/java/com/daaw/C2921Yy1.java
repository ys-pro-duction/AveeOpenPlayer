package com.daaw;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Yy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2921Yy1 {
    public final C2813Xx1 a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public C2921Yy1(C2813Xx1 c2813Xx1, String str, String str2, Class... clsArr) {
        this.a = c2813Xx1;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        c2813Xx1.k().submit(new RunnableC2817Xy1(this));
    }

    public static /* bridge */ /* synthetic */ void b(C2921Yy1 c2921Yy1) {
        CountDownLatch countDownLatch;
        Class<?> clsLoadClass;
        try {
            try {
                C2813Xx1 c2813Xx1 = c2921Yy1.a;
                clsLoadClass = c2813Xx1.i().loadClass(c2921Yy1.c(c2813Xx1.u(), c2921Yy1.b));
            } catch (NullPointerException unused) {
                countDownLatch = c2921Yy1.f;
            } catch (Throwable th) {
                c2921Yy1.f.countDown();
                throw th;
            }
        } catch (C9183vx1 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (clsLoadClass == null) {
            countDownLatch = c2921Yy1.f;
        } else {
            c2921Yy1.d = clsLoadClass.getMethod(c2921Yy1.c(c2921Yy1.a.u(), c2921Yy1.c), c2921Yy1.e);
            countDownLatch = c2921Yy1.d == null ? c2921Yy1.f : c2921Yy1.f;
        }
        countDownLatch.countDown();
    }

    public final Method a() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (this.f.await(2L, TimeUnit.SECONDS)) {
                return this.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final String c(byte[] bArr, String str) {
        return new String(this.a.e().b(bArr, str), "UTF-8");
    }
}
