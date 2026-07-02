package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class P12 implements U62 {
    public final C5622jF2 B;
    public final C9267wF2 C;
    public final C5361iJ2 D;
    public final C6487mJ2 E;

    public P12(C9267wF2 c9267wF2, C6487mJ2 c6487mJ2, C5361iJ2 c5361iJ2) {
        this.C = c9267wF2;
        this.E = c6487mJ2;
        this.D = c5361iJ2;
        this.B = c9267wF2.b.b;
    }

    @Override // com.daaw.U62
    public final void P(zze zzeVar) {
        List list = this.B.a;
        this.E.d(this.D.c(this.C, null, list));
    }
}
