package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class L72 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ C3831cr2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L72(C3831cr2 c3831cr2, String str) {
        super(c3831cr2, true);
        this.G = c3831cr2;
        this.F = str;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.G.i)).endAdUnitExposure(this.F, this.C);
    }
}
