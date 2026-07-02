package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class DJ0 {
    public static final float a = C6460mD.l(10);

    public static final float a(InterfaceC4988gz interfaceC4988gz, boolean z, long j) {
        G10.g(interfaceC4988gz, "$this$getRippleEndRadius");
        float fJ = C9982yp0.j(AbstractC0460Bp0.a(C9879yT0.i(j), C9879yT0.g(j))) / 2.0f;
        return z ? fJ + interfaceC4988gz.O(a) : fJ;
    }

    public static final float b(long j) {
        return Math.max(C9879yT0.i(j), C9879yT0.g(j)) * 0.3f;
    }
}
