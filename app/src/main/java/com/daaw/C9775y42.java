package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.y42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9775y42 {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final InterfaceFutureC8236sc0 c;
    public volatile boolean d = true;

    public C9775y42(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceFutureC8236sc0 interfaceFutureC8236sc0) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = interfaceFutureC8236sc0;
    }

    public static /* bridge */ /* synthetic */ void b(final C9775y42 c9775y42, List list, final InterfaceC6244lS2 interfaceC6244lS2) {
        if (list == null || list.isEmpty()) {
            c9775y42.a.execute(new Runnable() { // from class: com.daaw.t42
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6244lS2.b(new C2350Tl2(3));
                }
            });
            return;
        }
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0H = AbstractC7360pS2.h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = (InterfaceFutureC8236sc0) it.next();
            interfaceFutureC8236sc0H = AbstractC7360pS2.n(AbstractC7360pS2.f(interfaceFutureC8236sc0H, Throwable.class, new WR2() { // from class: com.daaw.u42
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    interfaceC6244lS2.b((Throwable) obj);
                    return AbstractC7360pS2.h(null);
                }
            }, c9775y42.a), new WR2() { // from class: com.daaw.v42
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return this.a.a(interfaceC6244lS2, interfaceFutureC8236sc0, (AbstractC4448f42) obj);
                }
            }, c9775y42.a);
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0H, new C9496x42(c9775y42, interfaceC6244lS2), c9775y42.a);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(InterfaceC6244lS2 interfaceC6244lS2, InterfaceFutureC8236sc0 interfaceFutureC8236sc0, AbstractC4448f42 abstractC4448f42) {
        if (abstractC4448f42 != null) {
            interfaceC6244lS2.a(abstractC4448f42);
        }
        return AbstractC7360pS2.o(interfaceFutureC8236sc0, ((Long) OF1.b.e()).longValue(), TimeUnit.MILLISECONDS, this.b);
    }

    public final /* synthetic */ void d() {
        this.d = false;
    }

    public final void e(InterfaceC6244lS2 interfaceC6244lS2) {
        AbstractC7360pS2.r(this.c, new C9217w42(this, interfaceC6244lS2), this.a);
    }

    public final boolean f() {
        return this.d;
    }
}
