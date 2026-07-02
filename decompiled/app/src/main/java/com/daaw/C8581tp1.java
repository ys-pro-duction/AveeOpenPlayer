package com.daaw;

/* JADX INFO: renamed from: com.daaw.tp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8581tp1 extends AbstractC3537bo1 {
    public final long b;

    public C8581tp1(InterfaceC1190In1 interfaceC1190In1, long j) {
        super(interfaceC1190In1);
        AbstractC6048km2.d(interfaceC1190In1.zzf() >= j);
        this.b = j;
    }

    @Override // com.daaw.AbstractC3537bo1, com.daaw.InterfaceC1190In1
    public final long zzd() {
        return super.zzd() - this.b;
    }

    @Override // com.daaw.AbstractC3537bo1, com.daaw.InterfaceC1190In1
    public final long zze() {
        return super.zze() - this.b;
    }

    @Override // com.daaw.AbstractC3537bo1, com.daaw.InterfaceC1190In1
    public final long zzf() {
        return super.zzf() - this.b;
    }
}
