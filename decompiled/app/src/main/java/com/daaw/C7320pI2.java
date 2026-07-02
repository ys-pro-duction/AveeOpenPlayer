package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.pI2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7320pI2 implements InterfaceC6483mI2 {
    public final InterfaceC6483mI2 a;
    public final Queue b = new LinkedBlockingQueue();
    public final int c = ((Integer) zzba.zzc().b(AbstractC9820yE1.u8)).intValue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public C7320pI2(InterfaceC6483mI2 interfaceC6483mI2, ScheduledExecutorService scheduledExecutorService) {
        this.a = interfaceC6483mI2;
        long jIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.t8)).intValue();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.Oa)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: com.daaw.oI2
                @Override // java.lang.Runnable
                public final void run() {
                    C7320pI2.c(this.B);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.daaw.oI2
                @Override // java.lang.Runnable
                public final void run() {
                    C7320pI2.c(this.B);
                }
            }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void c(C7320pI2 c7320pI2) {
        while (!c7320pI2.b.isEmpty()) {
            c7320pI2.a.a((C6204lI2) c7320pI2.b.remove());
        }
    }

    @Override // com.daaw.InterfaceC6483mI2
    public final void a(C6204lI2 c6204lI2) {
        if (this.b.size() < this.c) {
            this.b.offer(c6204lI2);
            return;
        }
        if (this.d.getAndSet(true)) {
            return;
        }
        Queue queue = this.b;
        C6204lI2 c6204lI2B = C6204lI2.b("dropped_event");
        Map mapJ = c6204lI2.j();
        if (mapJ.containsKey("action")) {
            c6204lI2B.a("dropped_action", (String) mapJ.get("action"));
        }
        queue.offer(c6204lI2B);
    }

    @Override // com.daaw.InterfaceC6483mI2
    public final String b(C6204lI2 c6204lI2) {
        return this.a.b(c6204lI2);
    }
}
