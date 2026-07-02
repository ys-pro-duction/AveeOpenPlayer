package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.daaw.AbstractC8245se;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxh;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class WA1 {
    public ScheduledFuture a = null;
    public final Runnable b = new LA1(this);
    public final Object c = new Object();
    public YA1 d;
    public Context e;
    public C3088aB1 f;

    public static /* bridge */ /* synthetic */ void h(WA1 wa1) {
        synchronized (wa1.c) {
            try {
                YA1 ya1 = wa1.d;
                if (ya1 == null) {
                    return;
                }
                if (ya1.isConnected() || wa1.d.isConnecting()) {
                    wa1.d.disconnect();
                }
                wa1.d = null;
                wa1.f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long a(zzaxh zzaxhVar) {
        synchronized (this.c) {
            try {
                if (this.f == null) {
                    return -2L;
                }
                if (this.d.J()) {
                    try {
                        return this.f.a3(zzaxhVar);
                    } catch (RemoteException e) {
                        AbstractC4274eT1.zzh("Unable to call into cache service.", e);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzaxe b(zzaxh zzaxhVar) {
        synchronized (this.c) {
            if (this.f == null) {
                return new zzaxe();
            }
            try {
                if (this.d.J()) {
                    return this.f.c3(zzaxhVar);
                }
                return this.f.b3(zzaxhVar);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call into cache service.", e);
                return new zzaxe();
            }
        }
    }

    public final synchronized YA1 d(AbstractC8245se.a aVar, AbstractC8245se.b bVar) {
        return new YA1(this.e, zzt.zzt().zzb(), aVar, bVar);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.c) {
            try {
                if (this.e != null) {
                    return;
                }
                this.e = context.getApplicationContext();
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.b4)).booleanValue()) {
                    l();
                } else {
                    if (((Boolean) zzba.zzc().b(AbstractC9820yE1.a4)).booleanValue()) {
                        zzt.zzb().c(new TA1(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.c4)).booleanValue()) {
            synchronized (this.c) {
                try {
                    l();
                    ScheduledFuture scheduledFuture = this.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.a = AbstractC9322wT1.d.schedule(this.b, ((Long) zzba.zzc().b(AbstractC9820yE1.d4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        synchronized (this.c) {
            try {
                if (this.e != null && this.d == null) {
                    YA1 ya1D = d(new UA1(this), new VA1(this));
                    this.d = ya1D;
                    ya1D.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }
}
