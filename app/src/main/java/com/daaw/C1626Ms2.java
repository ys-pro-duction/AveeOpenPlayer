package com.daaw;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.Ms2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1626Ms2 {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final InterfaceC6700n42 c;
    public final C5245ht2 d;
    public final C5361iJ2 e;
    public final XS2 f = XS2.C();
    public final AtomicBoolean g = new AtomicBoolean();
    public C1730Ns2 h;
    public C9267wF2 i;

    public C1626Ms2(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC6700n42 interfaceC6700n42, C5245ht2 c5245ht2, C5361iJ2 c5361iJ2) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = interfaceC6700n42;
        this.d = c5245ht2;
        this.e = c5361iJ2;
    }

    public final synchronized InterfaceFutureC8236sc0 b(C9267wF2 c9267wF2) {
        try {
            if (!this.g.getAndSet(true)) {
                if (c9267wF2.b.a.isEmpty()) {
                    this.f.f(new C6092kt2(3, C6929nt2.c(c9267wF2)));
                } else {
                    this.i = c9267wF2;
                    this.h = new C1730Ns2(c9267wF2, this.d, this.f);
                    this.d.k(c9267wF2.b.a);
                    while (this.h.e()) {
                        e(this.h.a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final synchronized InterfaceFutureC8236sc0 d(C4498fF2 c4498fF2) {
        Iterator it = c4498fF2.a.iterator();
        while (it.hasNext()) {
            InterfaceC2682Wq2 interfaceC2682Wq2A = this.c.a(c4498fF2.b, (String) it.next());
            if (interfaceC2682Wq2A != null && interfaceC2682Wq2A.b(this.i, c4498fF2)) {
                return AbstractC7360pS2.o(interfaceC2682Wq2A.a(this.i, c4498fF2), c4498fF2.T, TimeUnit.MILLISECONDS, this.b);
            }
        }
        return AbstractC7360pS2.g(new C2350Tl2(3));
    }

    public final void e(C4498fF2 c4498fF2) {
        if (c4498fF2 == null) {
            return;
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0D = d(c4498fF2);
        this.d.f(this.i, c4498fF2, interfaceFutureC8236sc0D, this.e);
        AbstractC7360pS2.r(interfaceFutureC8236sc0D, new C1522Ls2(this, c4498fF2), this.a);
    }
}
