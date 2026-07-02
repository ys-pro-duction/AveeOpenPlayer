package com.daaw;

/* JADX INFO: renamed from: com.daaw.qq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7752qq3 implements InterfaceC4110dr3 {
    public final InterfaceC4110dr3 a;
    public final long b;

    public C7752qq3(InterfaceC4110dr3 interfaceC4110dr3, long j) {
        this.a = interfaceC4110dr3;
        this.b = j;
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final int b(C5730je3 c5730je3, H93 h93, int i) {
        int iB = this.a.b(c5730je3, h93, i);
        if (iB != -4) {
            return iB;
        }
        h93.f += this.b;
        return -4;
    }

    public final InterfaceC4110dr3 c() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.daaw.InterfaceC4110dr3
    public final boolean zze() {
        return this.a.zze();
    }
}
