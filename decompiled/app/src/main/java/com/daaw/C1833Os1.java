package com.daaw;

/* JADX INFO: renamed from: com.daaw.Os1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1833Os1 {
    public final InterfaceC6365ls1 a;
    public final C5916kI2 b;
    public final GD2 c = new GD2(new byte[64], 64);
    public boolean d;
    public boolean e;
    public boolean f;

    public C1833Os1(InterfaceC6365ls1 interfaceC6365ls1, C5916kI2 c5916kI2) {
        this.a = interfaceC6365ls1;
        this.b = c5916kI2;
    }

    public final void a(C5900kE2 c5900kE2) {
        long jB;
        char c;
        c5900kE2.c(this.c.a, 0, 3);
        this.c.j(0);
        this.c.l(8);
        this.d = this.c.n();
        this.e = this.c.n();
        this.c.l(6);
        GD2 gd2 = this.c;
        c5900kE2.c(gd2.a, 0, gd2.d(8));
        this.c.j(0);
        if (this.d) {
            this.c.l(4);
            long jD = this.c.d(3);
            this.c.l(1);
            int iD = this.c.d(15) << 15;
            this.c.l(1);
            long jD2 = this.c.d(15);
            this.c.l(1);
            if (this.f || !this.e) {
                c = 30;
            } else {
                this.c.l(4);
                long jD3 = ((long) this.c.d(3)) << 30;
                this.c.l(1);
                int iD2 = this.c.d(15) << 15;
                this.c.l(1);
                long jD4 = this.c.d(15);
                this.c.l(1);
                c = 30;
                this.b.b(jD3 | ((long) iD2) | jD4);
                this.f = true;
            }
            jB = this.b.b((jD << c) | ((long) iD) | jD2);
        } else {
            jB = 0;
        }
        this.a.c(jB, 4);
        this.a.a(c5900kE2);
        this.a.b(false);
    }

    public final void b() {
        this.f = false;
        this.a.zze();
    }
}
