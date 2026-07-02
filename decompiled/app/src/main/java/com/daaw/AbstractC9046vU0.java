package com.daaw;

/* JADX INFO: renamed from: com.daaw.vU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC9046vU0 {
    public static final C9325wU0 a() {
        return new C9325wU0();
    }

    public static final C9883yU0 b() {
        return new C9883yU0();
    }

    public static final InterfaceC8007rm0 c(Object obj, InterfaceC7645qU0 interfaceC7645qU0) {
        G10.g(interfaceC7645qU0, "policy");
        return N2.a(obj, interfaceC7645qU0);
    }

    public static /* synthetic */ InterfaceC8007rm0 d(Object obj, InterfaceC7645qU0 interfaceC7645qU0, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC7645qU0 = AbstractC7923rU0.k();
        }
        return AbstractC7923rU0.d(obj, interfaceC7645qU0);
    }

    public static final InterfaceC6258lW0 e(Object obj, InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-1058319986);
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = d(obj, null, 2, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
        interfaceC8007rm0.setValue(obj);
        interfaceC5781jp.L();
        return interfaceC8007rm0;
    }
}
