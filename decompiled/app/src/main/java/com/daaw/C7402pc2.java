package com.daaw;

/* JADX INFO: renamed from: com.daaw.pc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7402pc2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ C3831cr2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7402pc2(C3831cr2 c3831cr2, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(c3831cr2, false);
        this.H = c3831cr2;
        this.F = str;
        this.G = obj;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.H.i)).logHealthData(5, this.F, BinderC7744qp0.Z2(this.G), BinderC7744qp0.Z2(null), BinderC7744qp0.Z2(null));
    }
}
