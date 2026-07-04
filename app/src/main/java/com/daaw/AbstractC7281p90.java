package com.daaw;

/* JADX INFO: renamed from: com.daaw.p90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7281p90 {
    public static final C3103aF0 a(InterfaceC7002o90 interfaceC7002o90) {
        C3103aF0 c3103aF0A;
        G10.g(interfaceC7002o90, "<this>");
        InterfaceC7002o90 interfaceC7002o90M = interfaceC7002o90.M();
        return (interfaceC7002o90M == null || (c3103aF0A = AbstractC6723n90.a(interfaceC7002o90M, interfaceC7002o90, false, 2, null)) == null) ? new C3103aF0(0.0f, 0.0f, I00.g(interfaceC7002o90.d()), I00.f(interfaceC7002o90.d())) : c3103aF0A;
    }

    public static final C3103aF0 b(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "<this>");
        return AbstractC6723n90.a(c(interfaceC7002o90), interfaceC7002o90, false, 2, null);
    }

    public static final InterfaceC7002o90 c(InterfaceC7002o90 interfaceC7002o90) {
        InterfaceC7002o90 interfaceC7002o902;
        G10.g(interfaceC7002o90, "<this>");
        InterfaceC7002o90 interfaceC7002o90M = interfaceC7002o90.M();
        while (true) {
            InterfaceC7002o90 interfaceC7002o903 = interfaceC7002o90M;
            interfaceC7002o902 = interfaceC7002o90;
            interfaceC7002o90 = interfaceC7002o903;
            if (interfaceC7002o90 == null) {
                break;
            }
            interfaceC7002o90M = interfaceC7002o90.M();
        }
        K90 k90 = interfaceC7002o902 instanceof K90 ? (K90) interfaceC7002o902 : null;
        if (k90 == null) {
            return interfaceC7002o902;
        }
        K90 k90G1 = k90.g1();
        while (true) {
            K90 k902 = k90G1;
            K90 k903 = k90;
            k90 = k902;
            if (k90 == null) {
                return k903;
            }
            k90G1 = k90.g1();
        }
    }

    public static final long d(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "<this>");
        return interfaceC7002o90.f0(C9982yp0.b.c());
    }

    public static final long e(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "<this>");
        return interfaceC7002o90.o(C9982yp0.b.c());
    }
}
