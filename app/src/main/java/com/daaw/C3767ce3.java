package com.daaw;

/* JADX INFO: renamed from: com.daaw.ce3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3767ce3 {
    public Zd3 a;
    public final /* synthetic */ C7134oe3 b;

    public C3767ce3(C7134oe3 c7134oe3) {
        this.b = c7134oe3;
    }

    public final void a(long j) {
        this.a = new Zd3(this, this.b.a.p().a(), j);
        this.b.c.postDelayed(this.a, 2000L);
    }

    public final void b() {
        this.b.d();
        Zd3 zd3 = this.a;
        if (zd3 != null) {
            this.b.c.removeCallbacks(zd3);
        }
        this.b.a.F().r.a(false);
        this.b.o(false);
    }
}
