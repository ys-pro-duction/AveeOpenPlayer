package com.daaw;

import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final class QJ1 implements AbstractC8245se.b {
    public final /* synthetic */ BT1 a;

    public QJ1(RJ1 rj1, BT1 bt1) {
        this.a = bt1;
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        this.a.c(new RuntimeException("Connection failed."));
    }
}
