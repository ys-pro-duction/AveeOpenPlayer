package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class OF {
    public static final Y61 a = new Y61(120, 0, AbstractC4495fF.a(), 2, null);
    public static final Y61 b = new Y61(150, 0, new C1424Ku(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    public static final Y61 c = new Y61(120, 0, new C1424Ku(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(F6 f6, float f, Y00 y00, Y00 y002, InterfaceC1416Ks interfaceC1416Ks) {
        InterfaceC5866k7 interfaceC5866k7A = y002 != null ? NF.a.a(y002) : y00 != null ? NF.a.b(y00) : null;
        if (interfaceC5866k7A != null) {
            Object objF = F6.f(f6, C6460mD.g(f), interfaceC5866k7A, null, null, interfaceC1416Ks, 12, null);
            return objF == I10.c() ? objF : G91.a;
        }
        Object objU = f6.u(C6460mD.g(f), interfaceC1416Ks);
        return objU == I10.c() ? objU : G91.a;
    }
}
