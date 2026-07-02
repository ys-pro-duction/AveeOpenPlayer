package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzz;

/* JADX INFO: renamed from: com.daaw.ph2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7427ph2 {
    public final P62 a;
    public final C72 b;
    public final U72 c;
    public final C4757g82 d;
    public final C3746ca2 e;
    public final C1766Ob2 f;

    public C7427ph2(P62 p62, C72 c72, U72 u72, C4757g82 c4757g82, C3746ca2 c3746ca2, C1766Ob2 c1766Ob2) {
        this.a = p62;
        this.b = c72;
        this.c = u72;
        this.d = c4757g82;
        this.e = c3746ca2;
        this.f = c1766Ob2;
    }

    public final void a(C7706qh2 c7706qh2) throws Throwable {
        final C72 c72 = this.b;
        C6869nh2 c6869nh2 = c7706qh2.a;
        c72.getClass();
        c6869nh2.e(this.a, this.c, this.d, this.e, new zzz() { // from class: com.daaw.oh2
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                c72.zzb();
            }
        }, this.f);
    }
}
