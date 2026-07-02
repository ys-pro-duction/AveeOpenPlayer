package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Bb3 implements Runnable {
    public final /* synthetic */ C5715jb3 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Hb3 D;

    public Bb3(Hb3 hb3, C5715jb3 c5715jb3, long j) {
        this.D = hb3;
        this.B = c5715jb3;
        this.C = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.l(this.B, false, this.C);
        Hb3 hb3 = this.D;
        hb3.e = null;
        hb3.a.L().r(null);
    }
}
