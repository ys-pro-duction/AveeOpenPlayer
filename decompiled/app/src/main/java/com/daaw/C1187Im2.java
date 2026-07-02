package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.Im2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1187Im2 extends AbstractC1395Km2 {
    public C1187Im2(Context context) {
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
                        try {
                            this.f.J().N1(this.e, new BinderC1291Jm2(this));
                        } catch (Throwable th) {
                            zzt.zzo().u(th, "RemoteAdRequestClientTask.onConnected");
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
}
