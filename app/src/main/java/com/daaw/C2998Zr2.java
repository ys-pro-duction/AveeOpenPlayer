package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.Zr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2998Zr2 implements InterfaceC2682Wq2 {
    public final AbstractC9212w32 a;
    public final C0470Br2 b;
    public final PS2 c;
    public final T62 d;
    public final ScheduledExecutorService e;

    public C2998Zr2(AbstractC9212w32 abstractC9212w32, C0470Br2 c0470Br2, T62 t62, ScheduledExecutorService scheduledExecutorService, PS2 ps2) {
        this.a = abstractC9212w32;
        this.b = c0470Br2;
        this.d = t62;
        this.e = scheduledExecutorService;
        this.c = ps2;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        return this.c.S0(new Callable() { // from class: com.daaw.Xr2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(c9267wF2, c4498fF2);
            }
        });
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        return c9267wF2.a.a.a() != null && this.b.b(c9267wF2, c4498fF2);
    }

    public final /* synthetic */ V22 c(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        return this.a.b(new C10054z42(c9267wF2, c4498fF2, null), new N32(c9267wF2.a.a.a(), new Runnable() { // from class: com.daaw.Wr2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.f(c9267wF2, c4498fF2);
            }
        })).zza();
    }

    public final /* synthetic */ void f(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        AbstractC7360pS2.r(AbstractC7360pS2.o(this.b.a(c9267wF2, c4498fF2), c4498fF2.T, TimeUnit.SECONDS, this.e), new C2894Yr2(this), this.c);
    }
}
