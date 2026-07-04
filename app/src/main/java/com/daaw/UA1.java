package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.daaw.AbstractC8245se;

/* JADX INFO: loaded from: classes3.dex */
public final class UA1 implements AbstractC8245se.a {
    public final /* synthetic */ WA1 a;

    public UA1(WA1 wa1) {
        this.a = wa1;
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
        synchronized (this.a.c) {
            this.a.f = null;
            this.a.c.notifyAll();
        }
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        WA1 wa1;
        synchronized (this.a.c) {
            try {
                wa1 = this.a;
            } catch (DeadObjectException e) {
                AbstractC4274eT1.zzh("Unable to obtain a cache service instance.", e);
                WA1.h(this.a);
            }
            if (wa1.d != null) {
                wa1.f = wa1.d.K();
                this.a.c.notifyAll();
            } else {
                this.a.c.notifyAll();
            }
        }
    }
}
