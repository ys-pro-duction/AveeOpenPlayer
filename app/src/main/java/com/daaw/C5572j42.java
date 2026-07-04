package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.j42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5572j42 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Bundle F;
    public final /* synthetic */ C3831cr2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5572j42(C3831cr2 c3831cr2, Bundle bundle) {
        super(c3831cr2, true);
        this.G = c3831cr2;
        this.F = bundle;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.G.i)).setConsent(this.F, this.B);
    }
}
