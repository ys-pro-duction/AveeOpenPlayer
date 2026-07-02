package com.daaw;

import com.daaw.OD;
import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ND {
    static {
        OD.a aVar = OD.g;
    }

    public static long a(OD od) {
        return BT0.b(od.R().a());
    }

    public static long b(OD od) {
        return od.R().a();
    }

    public static long c(OD od, long j, long j2) {
        return BT0.a(C9879yT0.i(j) - C9982yp0.l(j2), C9879yT0.g(j) - C9982yp0.m(j2));
    }

    public static /* synthetic */ void d(OD od, long j, float f, long j2, float f2, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i2 & 2) != 0) {
            f = C9879yT0.h(od.a()) / 2.0f;
        }
        od.T(j, f, (i2 & 4) != 0 ? od.b0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? WK.a : pd, (i2 & 32) != 0 ? null : c2871Ym, (i2 & 64) != 0 ? OD.g.a() : i);
    }

    public static /* synthetic */ void e(OD od, InterfaceC5418iY interfaceC5418iY, long j, long j2, long j3, long j4, float f, PD pd, C2871Ym c2871Ym, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i3 & 2) != 0 ? D00.b.a() : j;
        long jA2 = (i3 & 4) != 0 ? J00.a(interfaceC5418iY.getWidth(), interfaceC5418iY.getHeight()) : j2;
        od.F(interfaceC5418iY, jA, jA2, (i3 & 8) != 0 ? D00.b.a() : j3, (i3 & 16) != 0 ? jA2 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? WK.a : pd, (i3 & 128) != 0 ? null : c2871Ym, (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? OD.g.a() : i, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? OD.g.b() : i2);
    }

    public static /* synthetic */ void f(OD od, InterfaceC6090kt0 interfaceC6090kt0, AbstractC2117Rg abstractC2117Rg, float f, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        if ((i2 & 8) != 0) {
            pd = WK.a;
        }
        PD pd2 = pd;
        if ((i2 & 16) != 0) {
            c2871Ym = null;
        }
        C2871Ym c2871Ym2 = c2871Ym;
        if ((i2 & 32) != 0) {
            i = OD.g.a();
        }
        od.N(interfaceC6090kt0, abstractC2117Rg, f2, pd2, c2871Ym2, i);
    }

    public static /* synthetic */ void g(OD od, AbstractC2117Rg abstractC2117Rg, long j, long j2, float f, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i2 & 2) != 0 ? C9982yp0.b.c() : j;
        od.a0(abstractC2117Rg, jC, (i2 & 4) != 0 ? c(od, od.a(), jC) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? WK.a : pd, (i2 & 32) != 0 ? null : c2871Ym, (i2 & 64) != 0 ? OD.g.a() : i);
    }

    public static /* synthetic */ void h(OD od, long j, long j2, long j3, float f, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i2 & 2) != 0 ? C9982yp0.b.c() : j2;
        od.B(j, jC, (i2 & 4) != 0 ? c(od, od.a(), jC) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? WK.a : pd, (i2 & 32) != 0 ? null : c2871Ym, (i2 & 64) != 0 ? OD.g.a() : i);
    }

    public static /* synthetic */ void i(OD od, AbstractC2117Rg abstractC2117Rg, long j, long j2, long j3, float f, PD pd, C2871Ym c2871Ym, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i2 & 2) != 0 ? C9982yp0.b.c() : j;
        od.D(abstractC2117Rg, jC, (i2 & 4) != 0 ? c(od, od.a(), jC) : j2, (i2 & 8) != 0 ? AbstractC2791Xs.a.a() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? WK.a : pd, (i2 & 64) != 0 ? null : c2871Ym, (i2 & 128) != 0 ? OD.g.a() : i);
    }
}
