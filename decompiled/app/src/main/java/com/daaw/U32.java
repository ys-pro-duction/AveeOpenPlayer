package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class U32 implements J72, InterfaceC9191vz1 {
    public final C4498fF2 B;
    public final C6715n72 C;
    public final X72 D;
    public final AtomicBoolean E = new AtomicBoolean();
    public final AtomicBoolean F = new AtomicBoolean();

    public U32(C4498fF2 c4498fF2, C6715n72 c6715n72, X72 x72) {
        this.B = c4498fF2;
        this.C = c6715n72;
        this.D = x72;
    }

    private final void a() {
        if (this.E.compareAndSet(false, true)) {
            this.C.zza();
        }
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        if (this.B.f == 1 && c8912uz1.j) {
            a();
        }
        if (c8912uz1.j && this.F.compareAndSet(false, true)) {
            this.D.zza();
        }
    }

    @Override // com.daaw.J72
    public final synchronized void zzr() {
        if (this.B.f != 1) {
            a();
        }
    }
}
