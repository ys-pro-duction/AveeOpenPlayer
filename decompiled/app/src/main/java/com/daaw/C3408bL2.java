package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfoj;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.bL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3408bL2 implements AbstractC8245se.a, AbstractC8245se.b {
    public final CL2 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;
    public final SK2 f;
    public final long g;
    public final int h;

    public C3408bL2(Context context, int i, int i2, String str, String str2, String str3, SK2 sk2) {
        this.b = str;
        this.h = i2;
        this.c = str2;
        this.f = sk2;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        CL2 cl2 = new CL2(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = cl2;
        this.d = new LinkedBlockingQueue();
        cl2.checkAvailabilityAndConnect();
    }

    public static zzfoj a() {
        return new zzfoj(null, 1);
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
        try {
            e(4011, this.g, null);
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        try {
            e(4012, this.g, null);
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        IL2 il2D = d();
        if (il2D != null) {
            try {
                zzfoj zzfojVarB3 = il2D.b3(new zzfoh(1, this.h, this.b, this.c));
                e(5011, this.g, null);
                this.d.put(zzfojVarB3);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final zzfoj b(int i) {
        zzfoj zzfojVar;
        try {
            zzfojVar = (zzfoj) this.d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e(2009, this.g, e);
            zzfojVar = null;
        }
        e(3004, this.g, null);
        if (zzfojVar != null) {
            if (zzfojVar.D == 7) {
                SK2.g(3);
            } else {
                SK2.g(2);
            }
        }
        return zzfojVar == null ? a() : zzfojVar;
    }

    public final void c() {
        CL2 cl2 = this.a;
        if (cl2 != null) {
            if (cl2.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
        }
    }

    public final IL2 d() {
        try {
            return this.a.J();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void e(int i, long j, Exception exc) {
        this.f.c(i, System.currentTimeMillis() - j, exc);
    }
}
