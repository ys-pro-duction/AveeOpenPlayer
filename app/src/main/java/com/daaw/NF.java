package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class NF {
    public static final NF a = new NF();

    public final InterfaceC5866k7 a(Y00 y00) {
        G10.g(y00, "interaction");
        if ((y00 instanceof C6115kz0) || (y00 instanceof C8691uD) || (y00 instanceof C7094oW) || (y00 instanceof LN)) {
            return OF.a;
        }
        return null;
    }

    public final InterfaceC5866k7 b(Y00 y00) {
        G10.g(y00, "interaction");
        if (!(y00 instanceof C6115kz0) && !(y00 instanceof C8691uD)) {
            if (y00 instanceof C7094oW) {
                return OF.c;
            }
            if (y00 instanceof LN) {
                return OF.b;
            }
            return null;
        }
        return OF.b;
    }
}
