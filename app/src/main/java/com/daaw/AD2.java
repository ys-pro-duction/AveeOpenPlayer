package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AD2 extends AbstractC4373eo2 {
    public boolean b;

    public AD2(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.a.e();
    }

    public final void e() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.a.c();
        this.b = true;
    }

    public final void g() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.a.c();
        this.b = true;
    }

    public final boolean i() {
        return this.b;
    }

    public abstract boolean j();

    public void h() {
    }
}
