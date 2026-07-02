package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F53 extends AbstractC6706n53 {
    public boolean b;

    public F53(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.a.e();
    }

    public abstract boolean f();

    public final void g() {
        if (!j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.a.c();
        this.b = true;
    }

    public final void i() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        e();
        this.a.c();
        this.b = true;
    }

    public final boolean j() {
        return this.b;
    }

    public void e() {
    }
}
