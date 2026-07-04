package com.daaw;

import android.util.Log;
import com.daaw.AbstractC8245se;
import com.daaw.C5033h8;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.jl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5763jl1 implements AbstractC8245se.c, InterfaceC9405wl1 {
    public final C5033h8.f a;
    public final H8 b;
    public com.google.android.gms.common.internal.b c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ C10157zT f;

    public C5763jl1(C10157zT c10157zT, C5033h8.f fVar, H8 h8) {
        this.f = c10157zT;
        this.a = fVar;
        this.b = h8;
    }

    @Override // com.daaw.AbstractC8245se.c
    public final void a(ConnectionResult connectionResult) {
        this.f.O.post(new RunnableC5482il1(this, connectionResult));
    }

    @Override // com.daaw.InterfaceC9405wl1
    public final void b(ConnectionResult connectionResult) {
        C4646fl1 c4646fl1 = (C4646fl1) this.f.K.get(this.b);
        if (c4646fl1 != null) {
            c4646fl1.H(connectionResult);
        }
    }

    @Override // com.daaw.InterfaceC9405wl1
    public final void c(com.google.android.gms.common.internal.b bVar, Set set) {
        if (bVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
        } else {
            this.c = bVar;
            this.d = set;
            i();
        }
    }

    @Override // com.daaw.InterfaceC9405wl1
    public final void d(int i) {
        C4646fl1 c4646fl1 = (C4646fl1) this.f.K.get(this.b);
        if (c4646fl1 != null) {
            if (c4646fl1.J) {
                c4646fl1.H(new ConnectionResult(17));
            } else {
                c4646fl1.B(i);
            }
        }
    }

    public final void i() {
        com.google.android.gms.common.internal.b bVar;
        if (!this.e || (bVar = this.c) == null) {
            return;
        }
        this.a.getRemoteService(bVar, this.d);
    }
}
