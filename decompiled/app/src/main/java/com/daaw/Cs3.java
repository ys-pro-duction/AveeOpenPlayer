package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Cs3 {
    public Bs3 a;
    public Ks3 b;

    public abstract Wf3 a();

    public void b() {
        this.a = null;
        this.b = null;
    }

    public abstract void c(C7965rd3 c7965rd3);

    public abstract boolean d();

    public abstract Ds3 e(Yf3[] yf3Arr, C6362lr3 c6362lr3, Vp3 vp3, AbstractC8657u52 abstractC8657u52);

    public abstract void f(Object obj);

    public final Ks3 g() {
        Ks3 ks3 = this.b;
        AbstractC6048km2.b(ks3);
        return ks3;
    }

    public final void h(Bs3 bs3, Ks3 ks3) {
        this.a = bs3;
        this.b = ks3;
    }

    public final void i() {
        Bs3 bs3 = this.a;
        if (bs3 != null) {
            bs3.zzj();
        }
    }
}
