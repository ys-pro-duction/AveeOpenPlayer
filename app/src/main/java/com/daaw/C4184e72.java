package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.e72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4184e72 extends AbstractC9351wa2 implements V62 {
    public final ScheduledExecutorService C;
    public ScheduledFuture D;
    public boolean E;

    public C4184e72(C3906d72 c3906d72, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.E = false;
        this.C = scheduledExecutorService;
        x0(c3906d72, executor);
    }

    public final /* synthetic */ void B0() {
        synchronized (this) {
            AbstractC4274eT1.zzg("Timeout waiting for show call succeed to be called.");
            U(new C3483bd2("Timeout for show call succeed."));
            this.E = true;
        }
    }

    @Override // com.daaw.V62
    public final void U(final C3483bd2 c3483bd2) {
        if (this.E) {
            return;
        }
        ScheduledFuture scheduledFuture = this.D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        A0(new InterfaceC9072va2() { // from class: com.daaw.Z62
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((V62) obj).U(c3483bd2);
            }
        });
    }

    @Override // com.daaw.V62
    public final void d(final zze zzeVar) {
        A0(new InterfaceC9072va2() { // from class: com.daaw.W62
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((V62) obj).d(zzeVar);
            }
        });
    }

    @Override // com.daaw.V62
    public final void zzb() {
        A0(new InterfaceC9072va2() { // from class: com.daaw.X62
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((V62) obj).zzb();
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.D = this.C.schedule(new Runnable() { // from class: com.daaw.Y62
            @Override // java.lang.Runnable
            public final void run() {
                this.B.B0();
            }
        }, ((Integer) zzba.zzc().b(AbstractC9820yE1.R9)).intValue(), TimeUnit.MILLISECONDS);
    }
}
