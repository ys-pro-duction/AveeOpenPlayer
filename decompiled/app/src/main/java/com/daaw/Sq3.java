package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Sq3 implements Up3 {
    public final NW2 a;
    public int b;
    public final Rq3 c;
    public final C3842ct3 d;
    public final C6342ln3 e;

    public Sq3(NW2 nw2, Rq3 rq3) {
        C6342ln3 c6342ln3 = new C6342ln3();
        C3842ct3 c3842ct3 = new C3842ct3();
        this.a = nw2;
        this.c = rq3;
        this.e = c6342ln3;
        this.d = c3842ct3;
        this.b = 1048576;
    }

    public final Sq3 a(int i) {
        this.b = i;
        return this;
    }

    public final Uq3 b(YL1 yl1) {
        yl1.b.getClass();
        return new Uq3(yl1, this.a, this.c, Pn3.a, this.d, this.b, null);
    }
}
