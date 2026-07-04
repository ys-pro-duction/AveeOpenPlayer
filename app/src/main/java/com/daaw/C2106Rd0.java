package com.daaw;

import android.util.Log;

/* JADX INFO: renamed from: com.daaw.Rd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2106Rd0 {
    public static final C2106Rd0 c = new C2106Rd0("FirebaseCrashlytics");
    public final String a;
    public int b = 4;

    public C2106Rd0(String str) {
        this.a = str;
    }

    public static C2106Rd0 f() {
        return c;
    }

    public final boolean a(int i) {
        return this.b <= i || Log.isLoggable(this.a, i);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        a(3);
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        a(6);
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        a(4);
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        a(2);
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        a(5);
    }
}
