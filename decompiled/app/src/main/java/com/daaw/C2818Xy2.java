package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2818Xy2 implements InterfaceC1447Kz2 {
    public final String a;
    public final String b;

    public C2818Xy2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 31;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.h(new C2922Yy2(this.a, this.b));
    }
}
