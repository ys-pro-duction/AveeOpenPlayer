package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzfnv;

/* JADX INFO: renamed from: com.daaw.iL2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5369iL2 implements AbstractC8245se.a, AbstractC8245se.b {
    public final CL2 a;
    public final C9570xL2 b;
    public final Object c = new Object();
    public boolean d = false;
    public boolean e = false;

    public C5369iL2(Context context, Looper looper, C9570xL2 c9570xL2) {
        this.b = c9570xL2;
        this.a = new CL2(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.c) {
            try {
                if (this.a.isConnected() || this.a.isConnecting()) {
                    this.a.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                try {
                    this.a.J().c3(new zzfnv(this.b.h()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.d = true;
                    this.a.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
    }
}
