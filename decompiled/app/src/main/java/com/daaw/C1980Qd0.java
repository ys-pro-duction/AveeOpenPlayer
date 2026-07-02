package com.daaw;

import android.util.Log;

/* JADX INFO: renamed from: com.daaw.Qd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1980Qd0 {
    public static final C1980Qd0 c = new C1980Qd0("FirebaseAppCheck");
    public final String a;
    public int b = 4;

    public C1980Qd0(String str) {
        this.a = str;
    }

    public static C1980Qd0 f() {
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
}
