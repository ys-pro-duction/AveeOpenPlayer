package com.daaw;

/* JADX INFO: renamed from: com.daaw.kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5933kN {
    public static final C5933kN a = new C5933kN();

    public final InterfaceC6221lN a(float f, float f2, float f3, float f4, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        interfaceC5781jp.e(380403812);
        if ((i2 & 1) != 0) {
            f = C6460mD.l(6);
        }
        float f5 = f;
        float fL = (i2 & 2) != 0 ? C6460mD.l(12) : f2;
        float fL2 = (i2 & 4) != 0 ? C6460mD.l(8) : f3;
        float fL3 = (i2 & 8) != 0 ? C6460mD.l(8) : f4;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(380403812, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:241)");
        }
        Object[] objArr = {C6460mD.g(f5), C6460mD.g(fL), C6460mD.g(fL2), C6460mD.g(fL3)};
        interfaceC5781jp.e(-568225417);
        boolean zP = false;
        for (int i3 = 0; i3 < 4; i3++) {
            zP |= interfaceC5781jp.P(objArr[i3]);
        }
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            C7780qx c7780qx = new C7780qx(f5, fL, fL2, fL3, null);
            interfaceC5781jp.H(c7780qx);
            objF = c7780qx;
        }
        interfaceC5781jp.L();
        C7780qx c7780qx2 = (C7780qx) objF;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return c7780qx2;
    }
}
