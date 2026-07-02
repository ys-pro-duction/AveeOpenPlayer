package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class KJ0 {
    public static final Y61 a = new Y61(15, 0, AbstractC4495fF.b(), 2, null);

    public static final InterfaceC5866k7 c(Y00 y00) {
        return y00 instanceof C7094oW ? a : y00 instanceof LN ? new Y61(45, 0, AbstractC4495fF.b(), 2, null) : y00 instanceof C8691uD ? new Y61(45, 0, AbstractC4495fF.b(), 2, null) : a;
    }

    public static final InterfaceC5866k7 d(Y00 y00) {
        return y00 instanceof C7094oW ? a : y00 instanceof LN ? a : y00 instanceof C8691uD ? new Y61(150, 0, AbstractC4495fF.b(), 2, null) : a;
    }

    public static final InterfaceC9344wZ e(boolean z, float f, long j, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        interfaceC5781jp.e(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = C6460mD.C.b();
        }
        if ((i2 & 4) != 0) {
            j = C2559Vm.b.g();
        }
        InterfaceC6258lW0 interfaceC6258lW0I = AbstractC7923rU0.i(C2559Vm.i(j), interfaceC5781jp, (i >> 6) & 14);
        Boolean boolValueOf = Boolean.valueOf(z);
        C6460mD c6460mDG = C6460mD.g(f);
        interfaceC5781jp.e(-3686552);
        boolean zP = interfaceC5781jp.P(boolValueOf) | interfaceC5781jp.P(c6460mDG);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            objF = new C4694fv0(z, f, interfaceC6258lW0I, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        C4694fv0 c4694fv0 = (C4694fv0) objF;
        interfaceC5781jp.L();
        return c4694fv0;
    }
}
