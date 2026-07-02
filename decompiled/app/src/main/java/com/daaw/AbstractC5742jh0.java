package com.daaw;

/* JADX INFO: renamed from: com.daaw.jh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5742jh0 {
    public static final float a(long j, long j2, long j3) {
        int i = 0;
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        while (i < 7) {
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float fC = (c(j4, f2, j5, j6) / 4.5f) - 1.0f;
            if (0.0f <= fC && fC <= 0.01f) {
                return f2;
            }
            if (fC < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
            i++;
            j = j4;
            j2 = j5;
            j3 = j6;
        }
        return f2;
    }

    public static final float b(long j, long j2) {
        float fG = AbstractC3530bn.g(j) + 0.05f;
        float fG2 = AbstractC3530bn.g(j2) + 0.05f;
        return Math.max(fG, fG2) / Math.min(fG, fG2);
    }

    public static final float c(long j, float f, long j2, long j3) {
        long jE = AbstractC3530bn.e(C2559Vm.m(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return b(AbstractC3530bn.e(j2, jE), jE);
    }

    public static final long d(long j, long j2, long j3) {
        return C2559Vm.m(j, c(j, 0.4f, j2, j3) >= 4.5f ? 0.4f : c(j, 0.2f, j2, j3) < 4.5f ? 0.2f : a(j, j2, j3), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final J21 e(C7454pn c7454pn, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(c7454pn, "colors");
        interfaceC5781jp.e(-721696685);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j = c7454pn.j();
        long jC = c7454pn.c();
        interfaceC5781jp.e(35572910);
        long jA = AbstractC7733qn.a(c7454pn, jC);
        if (jA == C2559Vm.b.g()) {
            jA = ((C2559Vm) interfaceC5781jp.O(AbstractC2787Xr.a())).w();
        }
        long j2 = jA;
        interfaceC5781jp.L();
        long jM = C2559Vm.m(j2, C2475Ur.a.d(interfaceC5781jp, 6), 0.0f, 0.0f, 0.0f, 14, null);
        C2559Vm c2559VmI = C2559Vm.i(j);
        C2559Vm c2559VmI2 = C2559Vm.i(jC);
        C2559Vm c2559VmI3 = C2559Vm.i(jM);
        interfaceC5781jp.e(1618982084);
        boolean zP = interfaceC5781jp.P(c2559VmI) | interfaceC5781jp.P(c2559VmI2) | interfaceC5781jp.P(c2559VmI3);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            J21 j21 = new J21(c7454pn.j(), d(j, jM, jC), null);
            interfaceC5781jp.H(j21);
            objF = j21;
        }
        interfaceC5781jp.L();
        J21 j212 = (J21) objF;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return j212;
    }
}
