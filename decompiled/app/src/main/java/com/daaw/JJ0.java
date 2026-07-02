package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class JJ0 implements InterfaceC9623xZ {
    public final C7653qW0 a;

    public JJ0(boolean z, InterfaceC6258lW0 interfaceC6258lW0) {
        G10.g(interfaceC6258lW0, "rippleAlpha");
        this.a = new C7653qW0(z, interfaceC6258lW0);
    }

    public abstract void e(C6115kz0 c6115kz0, InterfaceC7484pt interfaceC7484pt);

    public final void f(OD od, float f, long j) {
        G10.g(od, "$this$drawStateLayer");
        this.a.b(od, f, j);
    }

    public abstract void g(C6115kz0 c6115kz0);

    public final void h(Y00 y00, InterfaceC7484pt interfaceC7484pt) {
        G10.g(y00, "interaction");
        G10.g(interfaceC7484pt, "scope");
        this.a.c(y00, interfaceC7484pt);
    }
}
