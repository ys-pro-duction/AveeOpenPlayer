package com.daaw;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.daaw.sY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8217sY {
    public Bitmap a;
    public InterfaceC6408m2 b;

    public C8217sY(Bitmap bitmap) {
        this.a = bitmap;
        this.b = null;
    }

    public static void c(C8217sY c8217sY) {
        if (c8217sY != null) {
            c8217sY.b();
        }
    }

    public static Bitmap g(C8217sY c8217sY) {
        if (c8217sY != null) {
            return c8217sY.f();
        }
        return null;
    }

    public void b() {
        InterfaceC6408m2 interfaceC6408m2 = this.b;
        if (interfaceC6408m2 != null) {
            interfaceC6408m2.a();
        }
    }

    public int d() {
        return 1;
    }

    public RunnableC2621Wb1 e() {
        return null;
    }

    public final Bitmap f() {
        return this.a;
    }

    public C8217sY(Bitmap bitmap, InterfaceC6408m2 interfaceC6408m2) {
        this.a = bitmap;
        this.b = interfaceC6408m2;
    }

    public void a() {
    }

    public void h() {
    }
}
