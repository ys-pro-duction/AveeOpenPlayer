package com.daaw;

/* JADX INFO: renamed from: com.daaw.sb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8234sb3 implements Runnable {
    public final /* synthetic */ C5715jb3 B;
    public final /* synthetic */ C5715jb3 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Hb3 F;

    public RunnableC8234sb3(Hb3 hb3, C5715jb3 c5715jb3, C5715jb3 c5715jb32, long j, boolean z) {
        this.F = hb3;
        this.B = c5715jb3;
        this.C = c5715jb32;
        this.D = j;
        this.E = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.k(this.B, this.C, this.D, this.E, null);
    }
}
