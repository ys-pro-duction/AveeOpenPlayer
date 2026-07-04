package com.daaw;

import android.app.Activity;

/* JADX INFO: renamed from: com.daaw.go2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4941go2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Activity F;
    public final /* synthetic */ C9989yq2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4941go2(C9989yq2 c9989yq2, Activity activity) {
        super(c9989yq2.B, true);
        this.G = c9989yq2;
        this.F = activity;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.G.B.i)).onActivityPaused(BinderC7744qp0.Z2(this.F), this.C);
    }
}
