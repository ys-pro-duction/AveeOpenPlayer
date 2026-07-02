package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzz;

/* JADX INFO: renamed from: com.daaw.gh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4906gh2 {
    public final P62 a;
    public final C72 b;
    public final U72 c;
    public final C4757g82 d;
    public final C3746ca2 e;
    public final C4498fF2 f;
    public final C5622jF2 g;

    public C4906gh2(P62 p62, C72 c72, U72 u72, C4757g82 c4757g82, C3746ca2 c3746ca2, C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        this.a = p62;
        this.b = c72;
        this.c = u72;
        this.d = c4757g82;
        this.e = c3746ca2;
        this.f = c4498fF2;
        this.g = c5622jF2;
    }

    public final void a(C6023kh2 c6023kh2) {
        final C72 c72 = this.b;
        C2330Tg2 c2330Tg2 = c6023kh2.a;
        c72.getClass();
        c2330Tg2.d(this.a, this.c, this.d, this.e, new zzz() { // from class: com.daaw.fh2
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                c72.zzb();
            }
        });
        c6023kh2.e(this.f, this.g);
    }
}
