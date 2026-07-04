package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class H90 {
    public final K90 B;
    public final InterfaceC1073Hk0 C;
    public H90 D;
    public boolean E;

    public H90(K90 k90, InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(k90, "layoutNodeWrapper");
        G10.g(interfaceC1073Hk0, "modifier");
        this.B = k90;
        this.C = interfaceC1073Hk0;
    }

    public final E90 a() {
        return this.B.X0();
    }

    public final K90 b() {
        return this.B;
    }

    public final InterfaceC1073Hk0 c() {
        return this.C;
    }

    public final H90 d() {
        return this.D;
    }

    public final long e() {
        return this.B.d();
    }

    public final boolean f() {
        return this.E;
    }

    public void g() {
        this.E = true;
    }

    public void h() {
        this.E = false;
    }

    public final void i(H90 h90) {
        this.D = h90;
    }
}
