package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Ny2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1754Ny2 implements InterfaceC1447Kz2 {
    public final InterfaceC1447Kz2 a;
    public final long b;
    public final ScheduledExecutorService c;

    public C1754Ny2(InterfaceC1447Kz2 interfaceC1447Kz2, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = interfaceC1447Kz2;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return this.a.zza();
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzb = this.a.zzb();
        long j = this.b;
        if (j > 0) {
            interfaceFutureC8236sc0Zzb = AbstractC7360pS2.o(interfaceFutureC8236sc0Zzb, j, TimeUnit.MILLISECONDS, this.c);
        }
        return AbstractC7360pS2.f(interfaceFutureC8236sc0Zzb, Throwable.class, new WR2() { // from class: com.daaw.My2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(null);
            }
        }, AbstractC9322wT1.f);
    }
}
