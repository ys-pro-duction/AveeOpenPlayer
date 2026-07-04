package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2643Wh {
    public static final C2643Wh a = new C2643Wh();
    public static final float b;
    public static final float c;
    public static final InterfaceC6643ms0 d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final InterfaceC6643ms0 k;
    public static final int l = 0;

    static {
        float fL = C6460mD.l(16);
        b = fL;
        float f2 = 8;
        float fL2 = C6460mD.l(f2);
        c = fL2;
        InterfaceC6643ms0 interfaceC6643ms0A = AbstractC6085ks0.a(fL, fL2, fL, fL2);
        d = interfaceC6643ms0A;
        e = C6460mD.l(64);
        f = C6460mD.l(36);
        g = C6460mD.l(18);
        h = C6460mD.l(f2);
        i = C6460mD.l(1);
        float fL3 = C6460mD.l(f2);
        j = fL3;
        k = AbstractC6085ks0.a(fL3, interfaceC6643ms0A.d(), fL3, interfaceC6643ms0A.c());
    }

    public final InterfaceC2539Vh a(long j2, long j3, long j4, long j5, InterfaceC5781jp interfaceC5781jp, int i2, int i3) {
        long jE;
        interfaceC5781jp.e(1870371134);
        long j6 = (i3 & 1) != 0 ? C6309lh0.a.a(interfaceC5781jp, 6).j() : j2;
        long jB = (i3 & 2) != 0 ? AbstractC7733qn.b(j6, interfaceC5781jp, i2 & 14) : j3;
        if ((i3 & 4) != 0) {
            C6309lh0 c6309lh0 = C6309lh0.a;
            jE = AbstractC3530bn.e(C2559Vm.m(c6309lh0.a(interfaceC5781jp, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), c6309lh0.a(interfaceC5781jp, 6).n());
        } else {
            jE = j4;
        }
        long jM = (i3 & 8) != 0 ? C2559Vm.m(C6309lh0.a.a(interfaceC5781jp, 6).i(), C2475Ur.a.b(interfaceC5781jp, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(1870371134, i2, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:402)");
        }
        C2287Sw c2287Sw = new C2287Sw(j6, jB, jE, jM, null);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return c2287Sw;
    }

    public final InterfaceC2747Xh b(float f2, float f3, float f4, float f5, float f6, InterfaceC5781jp interfaceC5781jp, int i2, int i3) {
        interfaceC5781jp.e(-737170518);
        float fL = (i3 & 1) != 0 ? C6460mD.l(2) : f2;
        float fL2 = (i3 & 2) != 0 ? C6460mD.l(8) : f3;
        float fL3 = (i3 & 4) != 0 ? C6460mD.l(0) : f4;
        float fL4 = (i3 & 8) != 0 ? C6460mD.l(4) : f5;
        float fL5 = (i3 & 16) != 0 ? C6460mD.l(4) : f6;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-737170518, i2, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:368)");
        }
        boolean zP = false;
        Object[] objArr = {C6460mD.g(fL), C6460mD.g(fL2), C6460mD.g(fL3), C6460mD.g(fL4), C6460mD.g(fL5)};
        interfaceC5781jp.e(-568225417);
        for (int i4 = 0; i4 < 5; i4++) {
            zP |= interfaceC5781jp.P(objArr[i4]);
        }
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            C2391Tw c2391Tw = new C2391Tw(fL, fL2, fL3, fL4, fL5, null);
            interfaceC5781jp.H(c2391Tw);
            objF = c2391Tw;
        }
        interfaceC5781jp.L();
        C2391Tw c2391Tw2 = (C2391Tw) objF;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return c2391Tw2;
    }

    public final InterfaceC6643ms0 c() {
        return d;
    }

    public final float d() {
        return f;
    }

    public final float e() {
        return e;
    }

    public final InterfaceC6643ms0 f() {
        return k;
    }

    public final InterfaceC2539Vh g(long j2, long j3, long j4, InterfaceC5781jp interfaceC5781jp, int i2, int i3) {
        interfaceC5781jp.e(182742216);
        long jF = (i3 & 1) != 0 ? C2559Vm.b.f() : j2;
        long j5 = (i3 & 2) != 0 ? C6309lh0.a.a(interfaceC5781jp, 6).j() : j3;
        long jM = (i3 & 4) != 0 ? C2559Vm.m(C6309lh0.a.a(interfaceC5781jp, 6).i(), C2475Ur.a.b(interfaceC5781jp, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(182742216, i2, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:446)");
        }
        C2287Sw c2287Sw = new C2287Sw(jF, j5, jF, jM, null);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return c2287Sw;
    }
}
