package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbuk;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.mo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6625mo2 extends AbstractC7462po2 {
    public zzbuk h;

    public C6625mo2(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = context;
        this.f = zzt.zzt().zzb();
        this.g = scheduledExecutorService;
    }

    @Override // com.daaw.AbstractC7462po2, com.daaw.AbstractC8245se.a
    public final void B(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        AbstractC4274eT1.zze(str);
        this.a.c(new C4090dn2(1, str));
    }

    @Override // com.daaw.AbstractC8245se.a
    public final synchronized void I(Bundle bundle) {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.d.J().c1(this.h, new BinderC7183oo2(this));
        } catch (RemoteException unused) {
            this.a.c(new C4090dn2(1));
        } catch (Throwable th) {
            zzt.zzo().u(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.a.c(th);
        }
    }

    public final synchronized InterfaceFutureC8236sc0 c(zzbuk zzbukVar, long j) {
        if (this.b) {
            return AbstractC7360pS2.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        }
        this.b = true;
        this.h = zzbukVar;
        a();
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0O = AbstractC7360pS2.o(this.a, j, TimeUnit.MILLISECONDS, this.g);
        interfaceFutureC8236sc0O.g(new Runnable() { // from class: com.daaw.lo2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b();
            }
        }, AbstractC9322wT1.f);
        return interfaceFutureC8236sc0O;
    }
}
