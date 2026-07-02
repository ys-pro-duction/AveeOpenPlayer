package com.daaw;

import android.app.Activity;

/* JADX INFO: renamed from: com.daaw.op2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7188op2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Activity F;
    public final /* synthetic */ MR1 G;
    public final /* synthetic */ C9989yq2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7188op2(C9989yq2 c9989yq2, Activity activity, MR1 mr1) {
        super(c9989yq2.B, true);
        this.H = c9989yq2;
        this.F = activity;
        this.G = mr1;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.H.B.i)).onActivitySaveInstanceState(BinderC7744qp0.Z2(this.F), this.G, this.C);
    }
}
