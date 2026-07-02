package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.pb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7398pb3 implements Runnable {
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ C5715jb3 C;
    public final /* synthetic */ C5715jb3 D;
    public final /* synthetic */ long E;
    public final /* synthetic */ Hb3 F;

    public RunnableC7398pb3(Hb3 hb3, Bundle bundle, C5715jb3 c5715jb3, C5715jb3 c5715jb32, long j) {
        this.F = hb3;
        this.B = bundle;
        this.C = c5715jb3;
        this.D = c5715jb32;
        this.E = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hb3.t(this.F, this.B, this.C, this.D, this.E);
    }
}
