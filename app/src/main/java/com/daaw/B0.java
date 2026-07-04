package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 {
    public static final B0 a = new B0();

    public final boolean a(InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        if (interfaceC9515x81.I(interfaceC3159aT0) == interfaceC9515x81.I(interfaceC3159aT02) && interfaceC9515x81.u(interfaceC3159aT0) == interfaceC9515x81.u(interfaceC3159aT02)) {
            if ((interfaceC9515x81.Z(interfaceC3159aT0) == null) == (interfaceC9515x81.Z(interfaceC3159aT02) == null) && interfaceC9515x81.g0(interfaceC9515x81.f(interfaceC3159aT0), interfaceC9515x81.f(interfaceC3159aT02))) {
                if (interfaceC9515x81.c0(interfaceC3159aT0, interfaceC3159aT02)) {
                    return true;
                }
                int I = interfaceC9515x81.I(interfaceC3159aT0);
                for (int i = 0; i < I; i++) {
                    InterfaceC7272p71 interfaceC7272p71P0 = interfaceC9515x81.p0(interfaceC3159aT0, i);
                    InterfaceC7272p71 interfaceC7272p71P02 = interfaceC9515x81.p0(interfaceC3159aT02, i);
                    if (interfaceC9515x81.z0(interfaceC7272p71P0) != interfaceC9515x81.z0(interfaceC7272p71P02)) {
                        return false;
                    }
                    if (!interfaceC9515x81.z0(interfaceC7272p71P0) && (interfaceC9515x81.Y(interfaceC7272p71P0) != interfaceC9515x81.Y(interfaceC7272p71P02) || !c(interfaceC9515x81, interfaceC9515x81.h0(interfaceC7272p71P0), interfaceC9515x81.h0(interfaceC7272p71P02)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(InterfaceC9515x81 interfaceC9515x81, O80 o80, O80 o802) {
        G10.g(interfaceC9515x81, "context");
        G10.g(o80, "a");
        G10.g(o802, "b");
        return c(interfaceC9515x81, o80, o802);
    }

    public final boolean c(InterfaceC9515x81 interfaceC9515x81, O80 o80, O80 o802) {
        if (o80 == o802) {
            return true;
        }
        InterfaceC3159aT0 interfaceC3159aT0B = interfaceC9515x81.b(o80);
        InterfaceC3159aT0 interfaceC3159aT0B2 = interfaceC9515x81.b(o802);
        if (interfaceC3159aT0B != null && interfaceC3159aT0B2 != null) {
            return a(interfaceC9515x81, interfaceC3159aT0B, interfaceC3159aT0B2);
        }
        XM xmP = interfaceC9515x81.p(o80);
        XM xmP2 = interfaceC9515x81.p(o802);
        return xmP != null && xmP2 != null && a(interfaceC9515x81, interfaceC9515x81.a(xmP), interfaceC9515x81.a(xmP2)) && a(interfaceC9515x81, interfaceC9515x81.e(xmP), interfaceC9515x81.e(xmP2));
    }
}
