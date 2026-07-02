package com.daaw;

import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.hB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5049hB1 implements AbstractC8245se.b {
    public final /* synthetic */ BT1 a;
    public final /* synthetic */ C5328iB1 b;

    public C5049hB1(C5328iB1 c5328iB1, BT1 bt1) {
        this.b = c5328iB1;
        this.a = bt1;
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        synchronized (this.b.d) {
            this.a.c(new RuntimeException("Connection failed."));
        }
    }
}
