package com.daaw;

import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final class VA1 implements AbstractC8245se.b {
    public final /* synthetic */ WA1 a;

    public VA1(WA1 wa1) {
        this.a = wa1;
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        synchronized (this.a.c) {
            try {
                this.a.f = null;
                WA1 wa1 = this.a;
                if (wa1.d != null) {
                    wa1.d = null;
                }
                this.a.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
