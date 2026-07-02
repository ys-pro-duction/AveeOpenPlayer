package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2342Tj2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ C3831cr2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2342Tj2(C3831cr2 c3831cr2, String str, String str2, Object obj, boolean z) {
        super(c3831cr2, true);
        this.J = c3831cr2;
        this.F = str;
        this.G = str2;
        this.H = obj;
        this.I = z;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.J.i)).setUserProperty(this.F, this.G, BinderC7744qp0.Z2(this.H), this.I, this.B);
    }
}
