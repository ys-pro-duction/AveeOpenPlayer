package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ny1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1753Ny1 extends AbstractCallableC3025Zy1 {
    public final ViewOnAttachStateChangeListenerC4418ey1 i;
    public long j;

    public C1753Ny1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, ViewOnAttachStateChangeListenerC4418ey1 viewOnAttachStateChangeListenerC4418ey1) {
        super(c2813Xx1, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", c9733xv1, i, 53);
        this.i = viewOnAttachStateChangeListenerC4418ey1;
        if (viewOnAttachStateChangeListenerC4418ey1 != null) {
            this.j = viewOnAttachStateChangeListenerC4418ey1.a();
        }
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        if (this.i != null) {
            this.e.E(((Long) this.f.invoke(null, Long.valueOf(this.j))).longValue());
        }
    }
}
