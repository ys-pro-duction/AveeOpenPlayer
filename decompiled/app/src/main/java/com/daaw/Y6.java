package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y6 {
    public static List a(AbstractC6977o40 abstractC6977o40, float f, C0737Ee0 c0737Ee0, InterfaceC0409Bc1 interfaceC0409Bc1) {
        return AbstractC3352b80.a(abstractC6977o40, c0737Ee0, f, interfaceC0409Bc1, false);
    }

    public static List b(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, InterfaceC0409Bc1 interfaceC0409Bc1) {
        return AbstractC3352b80.a(abstractC6977o40, c0737Ee0, 1.0f, interfaceC0409Bc1, false);
    }

    public static H6 c(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return new H6(b(abstractC6977o40, c0737Ee0, C4365en.a));
    }

    public static S6 d(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return new S6(b(abstractC6977o40, c0737Ee0, PC.a));
    }

    public static I6 e(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return f(abstractC6977o40, c0737Ee0, true);
    }

    public static I6 f(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, boolean z) {
        return new I6(a(abstractC6977o40, z ? AbstractC0301Ab1.e() : 1.0f, c0737Ee0, C4527fN.a));
    }

    public static J6 g(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, int i) {
        return new J6(b(abstractC6977o40, c0737Ee0, new KT(i)));
    }

    public static K6 h(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return new K6(b(abstractC6977o40, c0737Ee0, R00.a));
    }

    public static O6 i(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return new O6(AbstractC3352b80.a(abstractC6977o40, c0737Ee0, AbstractC0301Ab1.e(), C2912Yw0.a, true));
    }

    public static P6 j(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return new P6(b(abstractC6977o40, c0737Ee0, C7059oN0.a));
    }

    public static Q6 k(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        return new Q6(a(abstractC6977o40, AbstractC0301Ab1.e(), c0737Ee0, C7075oR0.a));
    }
}
