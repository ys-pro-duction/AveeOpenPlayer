package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.o12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6964o12 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ Bundle H;
    public final /* synthetic */ C3831cr2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6964o12(C3831cr2 c3831cr2, String str, String str2, Bundle bundle) {
        super(c3831cr2, true);
        this.I = c3831cr2;
        this.F = str;
        this.G = str2;
        this.H = bundle;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        ((ST1) AbstractC7506py0.l(this.I.i)).clearConditionalUserProperty(this.F, this.G, this.H);
    }
}
