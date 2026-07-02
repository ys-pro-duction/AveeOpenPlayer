package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1351Kb2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ MR1 I;
    public final /* synthetic */ C3831cr2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351Kb2(C3831cr2 c3831cr2, String str, String str2, boolean z, MR1 mr1) {
        super(c3831cr2, true);
        this.J = c3831cr2;
        this.F = str;
        this.G = str2;
        this.H = z;
        this.I = mr1;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.J.i)).getUserProperties(this.F, this.G, this.H, this.I);
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void b() {
        this.I.J0(null);
    }
}
