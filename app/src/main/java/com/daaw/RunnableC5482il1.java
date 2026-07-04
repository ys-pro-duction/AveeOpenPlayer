package com.daaw;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.il1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5482il1 implements Runnable {
    public final /* synthetic */ ConnectionResult B;
    public final /* synthetic */ C5763jl1 C;

    public RunnableC5482il1(C5763jl1 c5763jl1, ConnectionResult connectionResult) {
        this.C = c5763jl1;
        this.B = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5763jl1 c5763jl1 = this.C;
        C4646fl1 c4646fl1 = (C4646fl1) c5763jl1.f.K.get(c5763jl1.b);
        if (c4646fl1 == null) {
            return;
        }
        if (!this.B.v()) {
            c4646fl1.F(this.B, null);
            return;
        }
        this.C.e = true;
        if (this.C.a.requiresSignIn()) {
            this.C.i();
            return;
        }
        try {
            C5763jl1 c5763jl12 = this.C;
            c5763jl12.a.getRemoteService(null, c5763jl12.a.a());
        } catch (SecurityException unused) {
            this.C.a.disconnect("Failed to get service from broker.");
            c4646fl1.F(new ConnectionResult(10), null);
        }
    }
}
