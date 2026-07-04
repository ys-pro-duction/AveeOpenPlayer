package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfny;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ZK2 implements AbstractC8245se.a, AbstractC8245se.b {
    public final CL2 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public ZK2(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        CL2 cl2 = new CL2(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = cl2;
        this.d = new LinkedBlockingQueue();
        cl2.checkAvailabilityAndConnect();
    }

    public static C3013Zv1 a() {
        C9733xv1 c9733xv1M0 = C3013Zv1.m0();
        c9733xv1M0.r(32768L);
        return (C3013Zv1) c9733xv1M0.j();
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        try {
            this.d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        IL2 il2D = d();
        if (il2D != null) {
            try {
                try {
                    this.d.put(il2D.a3(new zzfny(this.b, this.c)).e());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    c();
                    this.e.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.d.put(a());
            }
            c();
            this.e.quit();
        }
    }

    public final C3013Zv1 b(int i) {
        C3013Zv1 c3013Zv1;
        try {
            c3013Zv1 = (C3013Zv1) this.d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c3013Zv1 = null;
        }
        return c3013Zv1 == null ? a() : c3013Zv1;
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
}
