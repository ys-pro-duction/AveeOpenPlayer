package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Cq3 implements InterfaceC4110dr3 {
    public final int a;
    public final /* synthetic */ Pq3 b;

    public Cq3(Pq3 pq3, int i) {
        this.b = pq3;
        this.a = i;
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final int a(long j) {
        return this.b.K(this.a, j);
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final int b(C5730je3 c5730je3, H93 h93, int i) {
        return this.b.J(this.a, c5730je3, h93, i);
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final void zzd() {
        this.b.w(this.a);
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final boolean zze() {
        return this.b.y(this.a);
    }
}
