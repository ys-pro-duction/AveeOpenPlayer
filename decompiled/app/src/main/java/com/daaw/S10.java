package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class S10 {
    public final VE0 a;
    public final int b;
    public WX c;

    public S10(VE0 ve0, int i, WX wx) {
        G10.g(ve0, "scope");
        this.a = ve0;
        this.b = i;
        this.c = wx;
    }

    public final WX a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final VE0 c() {
        return this.a;
    }

    public final boolean d() {
        return this.a.v(this.c);
    }

    public final void e(WX wx) {
        this.c = wx;
    }
}
