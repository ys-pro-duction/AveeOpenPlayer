package com.daaw;

import com.daaw.InterfaceC8525te0;

/* JADX INFO: renamed from: com.daaw.ve0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9090ve0 {
    public static final InterfaceC8525te0 a() {
        return new C8804ue0();
    }

    public static final float c(C0737Ee0 c0737Ee0, AbstractC0633De0 abstractC0633De0, float f) {
        if (f >= 0.0f || c0737Ee0 != null) {
            return (c0737Ee0 != null && f < 0.0f) ? 1.0f : 0.0f;
        }
        return 1.0f;
    }

    public static final InterfaceC8525te0 d(InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-610207901);
        interfaceC5781jp.e(-3687241);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = a();
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC8525te0 interfaceC8525te0 = (InterfaceC8525te0) objF;
        interfaceC5781jp.L();
        return interfaceC8525te0;
    }

    public static final Object e(InterfaceC8525te0 interfaceC8525te0, InterfaceC1416Ks interfaceC1416Ks) {
        C0737Ee0 c0737Ee0J = interfaceC8525te0.j();
        interfaceC8525te0.l();
        Object objB = InterfaceC8525te0.a.b(interfaceC8525te0, null, c(c0737Ee0J, null, interfaceC8525te0.c()), 1, false, interfaceC1416Ks, 9, null);
        return objB == I10.c() ? objB : G91.a;
    }
}
