package com.daaw;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.daaw.au1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3288au1 extends Thread {
    public final BlockingQueue B;
    public final InterfaceC2277St1 C;
    public final InterfaceC1318Jt1 D;
    public volatile boolean E = false;
    public final C2067Qt1 F;

    public C3288au1(BlockingQueue blockingQueue, InterfaceC2277St1 interfaceC2277St1, InterfaceC1318Jt1 interfaceC1318Jt1, C2067Qt1 c2067Qt1) {
        this.B = blockingQueue;
        this.C = interfaceC2277St1;
        this.D = interfaceC1318Jt1;
        this.F = c2067Qt1;
    }

    public final void a() {
        this.E = true;
        interrupt();
    }

    public final void b() {
        AbstractC4970gu1 abstractC4970gu1 = (AbstractC4970gu1) this.B.take();
        SystemClock.elapsedRealtime();
        abstractC4970gu1.m(3);
        try {
            abstractC4970gu1.zzm("network-queue-take");
            abstractC4970gu1.zzw();
            TrafficStats.setThreadStatsTag(abstractC4970gu1.zzc());
            C3845cu1 c3845cu1Zza = this.C.zza(abstractC4970gu1);
            abstractC4970gu1.zzm("network-http-complete");
            if (c3845cu1Zza.e && abstractC4970gu1.zzv()) {
                abstractC4970gu1.h("not-modified");
                abstractC4970gu1.k();
                return;
            }
            C6096ku1 c6096ku1A = abstractC4970gu1.a(c3845cu1Zza);
            abstractC4970gu1.zzm("network-parse-complete");
            if (c6096ku1A.b != null) {
                this.D.b(abstractC4970gu1.zzj(), c6096ku1A.b);
                abstractC4970gu1.zzm("network-cache-written");
            }
            abstractC4970gu1.zzq();
            this.F.b(abstractC4970gu1, c6096ku1A, null);
            abstractC4970gu1.l(c6096ku1A);
        } catch (C6933nu1 e) {
            SystemClock.elapsedRealtime();
            this.F.a(abstractC4970gu1, e);
            abstractC4970gu1.k();
        } catch (Exception e2) {
            AbstractC7770qu1.c(e2, "Unhandled exception %s", e2.toString());
            C6933nu1 c6933nu1 = new C6933nu1(e2);
            SystemClock.elapsedRealtime();
            this.F.a(abstractC4970gu1, c6933nu1);
            abstractC4970gu1.k();
        } finally {
            abstractC4970gu1.m(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.E) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC7770qu1.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
