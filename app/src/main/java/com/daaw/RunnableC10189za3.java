package com.daaw;

/* JADX INFO: renamed from: com.daaw.za3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10189za3 implements Runnable {
    public final /* synthetic */ C3633c83 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ C3633c83 F;
    public final /* synthetic */ Oa3 G;

    public RunnableC10189za3(Oa3 oa3, C3633c83 c3633c83, long j, long j2, boolean z, C3633c83 c3633c832) {
        this.G = oa3;
        this.B = c3633c83;
        this.C = j;
        this.D = j2;
        this.E = z;
        this.F = c3633c832;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.G.J(this.B);
        this.G.z(this.C, false);
        Oa3.c0(this.G, this.B, this.D, true, this.E);
        C6054kn3.b();
        if (this.G.a.z().B(null, AbstractC1311Jr2.p0)) {
            Oa3.b0(this.G, this.B, this.F);
        }
    }
}
