package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class D22 implements InterfaceC2717Wz1 {
    public final ScheduledExecutorService a;
    public final InterfaceC5485im b;
    public ScheduledFuture c;
    public long d = -1;
    public long e = -1;
    public Runnable f = null;
    public boolean g = false;

    public D22(ScheduledExecutorService scheduledExecutorService, InterfaceC5485im interfaceC5485im) {
        this.a = scheduledExecutorService;
        this.b = interfaceC5485im;
        zzt.zzb().c(this);
    }

    public final synchronized void a() {
        try {
            if (this.g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.e = -1L;
            } else {
                this.c.cancel(true);
                this.e = this.d - this.b.b();
            }
            this.g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.g) {
                if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                    this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                }
                this.g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(int i, Runnable runnable) {
        this.f = runnable;
        long j = i;
        this.d = this.b.b() + j;
        this.c = this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.daaw.InterfaceC2717Wz1
    public final void zza(boolean z) {
        if (z) {
            b();
        } else {
            a();
        }
    }
}
