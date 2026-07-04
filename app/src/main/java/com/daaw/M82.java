package com.daaw;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class M82 extends AbstractC9351wa2 {
    public final ScheduledExecutorService C;
    public final InterfaceC5485im D;
    public long E;
    public long F;
    public boolean G;
    public ScheduledFuture H;

    public M82(ScheduledExecutorService scheduledExecutorService, InterfaceC5485im interfaceC5485im) {
        super(Collections.EMPTY_SET);
        this.E = -1L;
        this.F = -1L;
        this.G = false;
        this.C = scheduledExecutorService;
        this.D = interfaceC5485im;
    }

    public final synchronized void B0(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.G) {
            long j = this.F;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.F = millis;
            return;
        }
        long jB = this.D.b();
        long j2 = this.E;
        if (jB > j2 || j2 - this.D.b() > millis) {
            C0(millis);
        }
    }

    public final synchronized void C0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.H;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.H.cancel(true);
            }
            this.E = this.D.b() + j;
            this.H = this.C.schedule(new RunnableC6999o82(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.G = false;
        C0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.G) {
                return;
            }
            ScheduledFuture scheduledFuture = this.H;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.F = -1L;
            } else {
                this.H.cancel(true);
                this.F = this.E - this.D.b();
            }
            this.G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.G) {
                if (this.F > 0 && this.H.isCancelled()) {
                    C0(this.F);
                }
                this.G = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
