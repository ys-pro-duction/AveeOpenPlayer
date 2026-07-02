package com.daaw;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.daaw.AbstractC8245se;

/* JADX INFO: loaded from: classes3.dex */
public final class PJ1 implements AbstractC8245se.a {
    public final /* synthetic */ BT1 a;
    public final /* synthetic */ RJ1 b;

    public PJ1(RJ1 rj1, BT1 bt1) {
        this.b = rj1;
        this.a = bt1;
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
        this.a.c(new RuntimeException("onConnectionSuspended: " + i));
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        try {
            this.a.b(this.b.a.J());
        } catch (DeadObjectException e) {
            this.a.c(e);
        }
    }
}
