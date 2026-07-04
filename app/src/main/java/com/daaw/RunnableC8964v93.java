package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.v93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8964v93 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ long D;
    public final /* synthetic */ Bundle E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Oa3 J;

    public RunnableC8964v93(Oa3 oa3, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.J = oa3;
        this.B = str;
        this.C = str2;
        this.D = j;
        this.E = bundle;
        this.F = z;
        this.G = z2;
        this.H = z3;
        this.I = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.J.t(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }
}
