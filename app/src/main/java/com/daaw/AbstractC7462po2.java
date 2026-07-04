package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.po2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7462po2 implements AbstractC8245se.a, AbstractC8245se.b {
    public final BT1 a = new BT1();
    public boolean b = false;
    public boolean c = false;
    public C5105hP1 d;
    public Context e;
    public Looper f;
    public ScheduledExecutorService g;

    @Override // com.daaw.AbstractC8245se.a
    public void B(int i) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        AbstractC4274eT1.zze(str);
        this.a.c(new C4090dn2(1, str));
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.e()));
        AbstractC4274eT1.zze(str);
        this.a.c(new C4090dn2(1, str));
    }

    public final synchronized void a() {
        try {
            if (this.d == null) {
                this.d = new C5105hP1(this.e, this.f, this, this);
            }
            this.d.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.c = true;
            C5105hP1 c5105hP1 = this.d;
            if (c5105hP1 == null) {
                return;
            }
            if (c5105hP1.isConnected() || this.d.isConnecting()) {
                this.d.disconnect();
            }
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }
}
