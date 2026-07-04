package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.Qm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2040Qm2 extends AbstractC1395Km2 {
    public C2040Qm2(Context context) {
        this.f = new C4547fP1(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        try {
                            this.f.J().w1(this.e, new BinderC1291Jm2(this));
                        } catch (Throwable th) {
                            zzt.zzo().u(th, "RemoteSignalsClientTask.onConnected");
                            this.a.c(new C4090dn2(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.c(new C4090dn2(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final InterfaceFutureC8236sc0 b(zzbvg zzbvgVar) {
        synchronized (this.b) {
            try {
                if (this.c) {
                    return this.a;
                }
                this.c = true;
                this.e = zzbvgVar;
                this.f.checkAvailabilityAndConnect();
                this.a.g(new Runnable() { // from class: com.daaw.Pm2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.a();
                    }
                }, AbstractC9322wT1.f);
                return this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
