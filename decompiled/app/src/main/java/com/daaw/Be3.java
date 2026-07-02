package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Be3 extends AbstractC10209ze3 {
    public boolean c;

    public Be3(C8812uf3 c8812uf3) {
        super(c8812uf3);
        this.b.n();
    }

    public final void e() {
        if (!g()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.b.i();
        this.c = true;
    }

    public final boolean g() {
        return this.c;
    }

    public abstract boolean h();
}
