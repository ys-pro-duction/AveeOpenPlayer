package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.pj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7437pj2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Long F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ Bundle I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ C3831cr2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7437pj2(C3831cr2 c3831cr2, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(c3831cr2, true);
        this.L = c3831cr2;
        this.F = l;
        this.G = str;
        this.H = str2;
        this.I = bundle;
        this.J = z;
        this.K = z2;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        Long l = this.F;
        ((ST1) AbstractC7506py0.l(this.L.i)).logEvent(this.G, this.H, this.I, this.J, this.K, l == null ? this.B : l.longValue());
    }
}
