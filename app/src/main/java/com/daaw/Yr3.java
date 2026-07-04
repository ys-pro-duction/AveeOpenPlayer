package com.daaw;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class Yr3 {
    public static final Yr3 e = new Yr3(true, 3, 1, null, null);
    public final boolean a;
    public final String b;
    public final Throwable c;
    public final int d;

    public Yr3(boolean z, int i, int i2, String str, Throwable th) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    public static Yr3 b() {
        return e;
    }

    public static Yr3 c(String str) {
        return new Yr3(false, 1, 5, str, null);
    }

    public static Yr3 d(String str, Throwable th) {
        return new Yr3(false, 1, 5, str, th);
    }

    public static Yr3 f(int i) {
        return new Yr3(true, i, 1, null, null);
    }

    public static Yr3 g(int i, int i2, String str, Throwable th) {
        return new Yr3(false, i, i2, str, th);
    }

    public String a() {
        return this.b;
    }

    public final void e() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.c != null) {
            a();
        } else {
            a();
        }
    }
}
