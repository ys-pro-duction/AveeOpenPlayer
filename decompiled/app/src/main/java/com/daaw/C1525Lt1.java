package com.daaw;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.daaw.Lt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1525Lt1 extends Thread {
    public static final boolean H = AbstractC7770qu1.a;
    public final BlockingQueue B;
    public final BlockingQueue C;
    public final InterfaceC1318Jt1 D;
    public volatile boolean E = false;
    public final C8048ru1 F;
    public final C2067Qt1 G;

    public C1525Lt1(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, InterfaceC1318Jt1 interfaceC1318Jt1, C2067Qt1 c2067Qt1) {
        this.B = blockingQueue;
        this.C = blockingQueue2;
        this.D = interfaceC1318Jt1;
        this.G = c2067Qt1;
        this.F = new C8048ru1(this, blockingQueue2, c2067Qt1);
    }

    public final void b() {
        this.E = true;
        interrupt();
    }

    public final void c() {
        AbstractC4970gu1 abstractC4970gu1 = (AbstractC4970gu1) this.B.take();
        abstractC4970gu1.zzm("cache-queue-take");
        abstractC4970gu1.m(1);
        try {
            abstractC4970gu1.zzw();
            C1214It1 c1214It1Zza = this.D.zza(abstractC4970gu1.zzj());
            if (c1214It1Zza == null) {
                abstractC4970gu1.zzm("cache-miss");
                if (!this.F.b(abstractC4970gu1)) {
                    this.C.put(abstractC4970gu1);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1214It1Zza.a(jCurrentTimeMillis)) {
                abstractC4970gu1.zzm("cache-hit-expired");
                abstractC4970gu1.zze(c1214It1Zza);
                if (!this.F.b(abstractC4970gu1)) {
                    this.C.put(abstractC4970gu1);
                }
                return;
            }
            abstractC4970gu1.zzm("cache-hit");
            C6096ku1 c6096ku1A = abstractC4970gu1.a(new C3845cu1(c1214It1Zza.a, c1214It1Zza.g));
            abstractC4970gu1.zzm("cache-hit-parsed");
            if (!c6096ku1A.c()) {
                abstractC4970gu1.zzm("cache-parsing-failed");
                this.D.a(abstractC4970gu1.zzj(), true);
                abstractC4970gu1.zze(null);
                if (!this.F.b(abstractC4970gu1)) {
                    this.C.put(abstractC4970gu1);
                }
                return;
            }
            if (c1214It1Zza.f < jCurrentTimeMillis) {
                abstractC4970gu1.zzm("cache-hit-refresh-needed");
                abstractC4970gu1.zze(c1214It1Zza);
                c6096ku1A.d = true;
                if (this.F.b(abstractC4970gu1)) {
                    this.G.b(abstractC4970gu1, c6096ku1A, null);
                } else {
                    this.G.b(abstractC4970gu1, c6096ku1A, new RunnableC1422Kt1(this, abstractC4970gu1));
                }
            } else {
                this.G.b(abstractC4970gu1, c6096ku1A, null);
            }
        } finally {
            abstractC4970gu1.m(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (H) {
            AbstractC7770qu1.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.D.zzb();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.E) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC7770qu1.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
