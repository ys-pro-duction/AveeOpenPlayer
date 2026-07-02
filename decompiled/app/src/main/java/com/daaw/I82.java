package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class I82 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ MR1 F;
    public final /* synthetic */ C3831cr2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I82(C3831cr2 c3831cr2, MR1 mr1) {
        super(c3831cr2, true);
        this.G = c3831cr2;
        this.F = mr1;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.G.i)).getGmpAppId(this.F);
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void b() {
        this.F.J0(null);
    }
}
