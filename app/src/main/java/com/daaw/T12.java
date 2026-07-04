package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class T12 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ MR1 H;
    public final /* synthetic */ C3831cr2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T12(C3831cr2 c3831cr2, String str, String str2, MR1 mr1) {
        super(c3831cr2, true);
        this.I = c3831cr2;
        this.F = str;
        this.G = str2;
        this.H = mr1;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.I.i)).getConditionalUserProperties(this.F, this.G, this.H);
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void b() {
        this.H.J0(null);
    }
}
