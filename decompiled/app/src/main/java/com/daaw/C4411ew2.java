package com.daaw;

/* JADX INFO: renamed from: com.daaw.ew2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4411ew2 implements InterfaceC1447Kz2 {
    public final InterfaceC5485im a;
    public final FF2 b;

    public C4411ew2(InterfaceC5485im interfaceC5485im, FF2 ff2) {
        this.a = interfaceC5485im;
        this.b = ff2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 4;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.h(new C4700fw2(this.b, this.a.a()));
    }
}
