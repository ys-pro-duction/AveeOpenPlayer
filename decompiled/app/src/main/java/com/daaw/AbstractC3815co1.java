package com.daaw;

/* JADX INFO: renamed from: com.daaw.co1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3815co1 implements InterfaceC6903no1 {
    public final InterfaceC6903no1 a;

    public AbstractC3815co1(InterfaceC6903no1 interfaceC6903no1) {
        this.a = interfaceC6903no1;
    }

    @Override // com.daaw.InterfaceC6903no1
    public C6345lo1 a(long j) {
        return this.a.a(j);
    }

    @Override // com.daaw.InterfaceC6903no1
    public long zza() {
        return this.a.zza();
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return this.a.zzh();
    }
}
