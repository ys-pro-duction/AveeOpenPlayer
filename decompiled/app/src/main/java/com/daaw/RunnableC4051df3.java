package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: renamed from: com.daaw.df3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4051df3 implements Runnable {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C = "_err";
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ C4897gf3 E;

    public RunnableC4051df3(C4897gf3 c4897gf3, String str, String str2, Bundle bundle) {
        this.E = c4897gf3;
        this.B = str;
        this.D = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.a.g((zzau) AbstractC7506py0.l(this.E.a.h0().y0(this.B, this.C, this.D, "auto", this.E.a.p().a(), false, true)), this.B);
    }
}
