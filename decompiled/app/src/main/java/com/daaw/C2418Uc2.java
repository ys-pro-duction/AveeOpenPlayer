package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Uc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2418Uc2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Bundle F;
    public final /* synthetic */ MR1 G;
    public final /* synthetic */ C3831cr2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2418Uc2(C3831cr2 c3831cr2, Bundle bundle, MR1 mr1) {
        super(c3831cr2, true);
        this.H = c3831cr2;
        this.F = bundle;
        this.G = mr1;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.H.i)).performAction(this.F, this.G, this.B);
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void b() {
        this.G.J0(null);
    }
}
