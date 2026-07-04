package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.Um2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2458Um2 extends AbstractC1395Km2 {
    public String g;
    public int h = 1;

    public C2458Um2(Context context) {
        this.f = new C4547fP1(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.AbstractC1395Km2, com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        AbstractC4274eT1.zze("Cannot connect to remote service, fallback to local instance.");
        this.a.c(new C4090dn2(1));
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        synchronized (this.b) {
            try {
                if (!this.d) {
                    this.d = true;
                    try {
                        int i = this.h;
                        if (i == 2) {
                            this.f.J().b1(this.e, new BinderC1291Jm2(this));
                        } else if (i == 3) {
                            this.f.J().N2(this.g, new BinderC1291Jm2(this));
                        } else {
                            this.a.c(new C4090dn2(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.a.c(new C4090dn2(1));
                    } catch (Throwable th) {
                        zzt.zzo().u(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i = this.h;
                if (i != 1 && i != 2) {
                    return AbstractC7360pS2.g(new C4090dn2(2));
                }
                if (this.c) {
                    return this.a;
                }
                this.h = 2;
                this.c = true;
                this.e = zzbvgVar;
                this.f.checkAvailabilityAndConnect();
                this.a.g(new Runnable() { // from class: com.daaw.Sm2
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

    public final InterfaceFutureC8236sc0 c(String str) {
        synchronized (this.b) {
            try {
                int i = this.h;
                if (i != 1 && i != 3) {
                    return AbstractC7360pS2.g(new C4090dn2(2));
                }
                if (this.c) {
                    return this.a;
                }
                this.h = 3;
                this.c = true;
                this.g = str;
                this.f.checkAvailabilityAndConnect();
                this.a.g(new Runnable() { // from class: com.daaw.Tm2
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
