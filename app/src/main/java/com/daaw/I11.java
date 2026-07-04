package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class I11 {
    public final LQ a;
    public C3103aF0 b;
    public LQ c;
    public LQ d;
    public LQ e;
    public LQ f;

    public I11(LQ lq, C3103aF0 c3103aF0, LQ lq2, LQ lq3, LQ lq4, LQ lq5) {
        G10.g(c3103aF0, "rect");
        this.a = lq;
        this.b = c3103aF0;
        this.c = lq2;
        this.d = lq3;
        this.e = lq4;
        this.f = lq5;
    }

    public /* synthetic */ I11(LQ lq, C3103aF0 c3103aF0, LQ lq2, LQ lq3, LQ lq4, LQ lq5, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? null : lq, (i & 2) != 0 ? C3103aF0.e.a() : c3103aF0, (i & 4) != 0 ? null : lq2, (i & 8) != 0 ? null : lq3, (i & 16) != 0 ? null : lq4, (i & 32) != 0 ? null : lq5);
    }
}
