package com.daaw;

import android.os.Binder;
import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzbvg;

/* JADX INFO: renamed from: com.daaw.Km2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1395Km2 implements AbstractC8245se.a, AbstractC8245se.b {
    public final BT1 a = new BT1();
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    public zzbvg e;
    public C4547fP1 f;

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
        AbstractC4274eT1.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public void G(ConnectionResult connectionResult) {
        AbstractC4274eT1.zze("Disconnected from remote ad request service.");
        this.a.c(new C4090dn2(1));
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.d = true;
                if (this.f.isConnected() || this.f.isConnecting()) {
                    this.f.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
