package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.sx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8340sx2 implements InterfaceC1447Kz2 {
    public final AtomicReference a = new AtomicReference();
    public final InterfaceC5485im b;
    public final InterfaceC1447Kz2 c;
    public final long d;

    public C8340sx2(InterfaceC1447Kz2 interfaceC1447Kz2, long j, InterfaceC5485im interfaceC5485im) {
        this.b = interfaceC5485im;
        this.c = interfaceC1447Kz2;
        this.d = j;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 16;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        C8061rx2 c8061rx2 = (C8061rx2) this.a.get();
        if (c8061rx2 == null || c8061rx2.a()) {
            InterfaceC1447Kz2 interfaceC1447Kz2 = this.c;
            C8061rx2 c8061rx22 = new C8061rx2(interfaceC1447Kz2.zzb(), this.d, this.b);
            this.a.set(c8061rx22);
            c8061rx2 = c8061rx22;
        }
        return c8061rx2.a;
    }
}
