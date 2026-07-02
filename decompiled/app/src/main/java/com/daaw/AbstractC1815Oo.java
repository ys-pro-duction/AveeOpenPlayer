package com.daaw;

/* JADX INFO: renamed from: com.daaw.Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1815Oo {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final InterfaceC1607Mo b(InterfaceC5781jp interfaceC5781jp, int i, boolean z, Object obj) {
        C1711No c1711No;
        G10.g(interfaceC5781jp, "composer");
        G10.g(obj, "block");
        interfaceC5781jp.e(i);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            c1711No = new C1711No(i, z);
            interfaceC5781jp.H(c1711No);
        } else {
            if (objF == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            }
            c1711No = (C1711No) objF;
        }
        c1711No.k(obj);
        interfaceC5781jp.L();
        return c1711No;
    }

    public static final InterfaceC1607Mo c(int i, boolean z, Object obj) {
        G10.g(obj, "block");
        C1711No c1711No = new C1711No(i, z);
        c1711No.k(obj);
        return c1711No;
    }

    public static final int d(int i) {
        return a(2, i);
    }

    public static final boolean e(UE0 ue0, UE0 ue02) {
        G10.g(ue02, "other");
        if (ue0 == null) {
            return true;
        }
        if (!(ue0 instanceof VE0) || !(ue02 instanceof VE0)) {
            return false;
        }
        VE0 ve0 = (VE0) ue0;
        return !ve0.s() || G10.c(ue0, ue02) || G10.c(ve0.j(), ((VE0) ue02).j());
    }

    public static final int f(int i) {
        return a(1, i);
    }
}
