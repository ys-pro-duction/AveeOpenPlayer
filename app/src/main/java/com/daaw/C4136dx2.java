package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.dx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4136dx2 implements InterfaceC1447Kz2 {
    public final PS2 a;

    public C4136dx2(PS2 ps2) {
        this.a = ps2;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 54;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.a.S0(new Callable() { // from class: com.daaw.cx2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4415ex2.b();
            }
        });
    }
}
