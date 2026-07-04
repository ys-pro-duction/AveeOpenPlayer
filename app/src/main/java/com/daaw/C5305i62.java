package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.i62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5305i62 implements R62, InterfaceC8791ub2, InterfaceC3189aa2, InterfaceC6157l72, InterfaceC9191vz1 {
    public final C6715n72 B;
    public final C4498fF2 C;
    public final ScheduledExecutorService D;
    public final Executor E;
    public ScheduledFuture G;
    public final String I;
    public final XS2 F = XS2.C();
    public final AtomicBoolean H = new AtomicBoolean();

    public C5305i62(C6715n72 c6715n72, C4498fF2 c4498fF2, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.B = c6715n72;
        this.C = c4498fF2;
        this.D = scheduledExecutorService;
        this.E = executor;
        this.I = str;
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ua)).booleanValue() && l() && c8912uz1.j && this.H.compareAndSet(false, true) && this.C.f != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.B.zza();
        }
    }

    @Override // com.daaw.InterfaceC6157l72
    public final synchronized void d(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.F.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.G;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.F.f(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void e() {
        synchronized (this) {
            try {
                if (this.F.isDone()) {
                    return;
                }
                this.F.e(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        return this.I.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.daaw.R62
    public final void zzc() {
        C4498fF2 c4498fF2 = this.C;
        if (c4498fF2.f == 3) {
            return;
        }
        int i = c4498fF2.a0;
        if (i == 0 || i == 1) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ua)).booleanValue() && l()) {
                return;
            }
            this.B.zza();
        }
    }

    @Override // com.daaw.InterfaceC3189aa2
    public final synchronized void zzj() {
        try {
            if (this.F.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.G;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.F.e(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC8791ub2
    public final void zzk() {
        if (this.C.f == 3) {
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.u1)).booleanValue()) {
            C4498fF2 c4498fF2 = this.C;
            if (c4498fF2.a0 == 2) {
                if (c4498fF2.s == 0) {
                    this.B.zza();
                } else {
                    AbstractC7360pS2.r(this.F, new C5026h62(this), this.E);
                    this.G = this.D.schedule(new Runnable() { // from class: com.daaw.g62
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e();
                        }
                    }, this.C.s, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.daaw.R62
    public final void zza() {
    }

    @Override // com.daaw.R62
    public final void zzb() {
    }

    @Override // com.daaw.R62
    public final void zze() {
    }

    @Override // com.daaw.R62
    public final void zzf() {
    }

    @Override // com.daaw.InterfaceC3189aa2
    public final void zzi() {
    }

    @Override // com.daaw.InterfaceC8791ub2
    public final void zzl() {
    }

    @Override // com.daaw.R62
    public final void t(VP1 vp1, String str, String str2) {
    }
}
