package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.f51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4452f51 {
    public static C4452f51 e;
    public C2631We a;
    public C2839Ye b;
    public C1085Hn0 c;
    public CX0 d;

    public C4452f51(Context context, InterfaceC8357t11 interfaceC8357t11) {
        Context applicationContext = context.getApplicationContext();
        this.a = new C2631We(applicationContext, interfaceC8357t11);
        this.b = new C2839Ye(applicationContext, interfaceC8357t11);
        this.c = new C1085Hn0(applicationContext, interfaceC8357t11);
        this.d = new CX0(applicationContext, interfaceC8357t11);
    }

    public static synchronized C4452f51 c(Context context, InterfaceC8357t11 interfaceC8357t11) {
        try {
            if (e == null) {
                e = new C4452f51(context, interfaceC8357t11);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public C2631We a() {
        return this.a;
    }

    public C2839Ye b() {
        return this.b;
    }

    public C1085Hn0 d() {
        return this.c;
    }

    public CX0 e() {
        return this.d;
    }
}
