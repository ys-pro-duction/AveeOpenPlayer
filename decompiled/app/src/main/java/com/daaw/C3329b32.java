package com.daaw;

import android.app.Activity;

/* JADX INFO: renamed from: com.daaw.b32, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3329b32 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Activity F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ C3831cr2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3329b32(C3831cr2 c3831cr2, Activity activity, String str, String str2) {
        super(c3831cr2, true);
        this.I = c3831cr2;
        this.F = activity;
        this.G = str;
        this.H = str2;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.I.i)).setCurrentScreen(BinderC7744qp0.Z2(this.F), this.G, this.H, this.B);
    }
}
