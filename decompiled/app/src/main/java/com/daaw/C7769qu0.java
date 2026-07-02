package com.daaw;

import com.daaw.InterfaceC8103s61;

/* JADX INFO: renamed from: com.daaw.qu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7769qu0 implements InterfaceC8103s61 {
    public final InterfaceC9543xF a;
    public final C2480Us0 b = new C2480Us0(new byte[10]);
    public int c = 0;
    public int d;
    public R31 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public C7769qu0(InterfaceC9543xF interfaceC9543xF) {
        this.a = interfaceC9543xF;
    }

    @Override // com.daaw.InterfaceC8103s61
    public final void a(C2584Vs0 c2584Vs0, boolean z) {
        if (z) {
            if (this.c == 3) {
                this.a.c();
            }
            g(1);
        }
        while (c2584Vs0.a() > 0) {
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (d(c2584Vs0, this.b.a, Math.min(10, this.i)) && d(c2584Vs0, null, this.i)) {
                            f();
                            this.a.e(this.l, this.k);
                            g(3);
                        }
                    } else if (i == 3) {
                        int iA = c2584Vs0.a();
                        int i2 = this.j;
                        int i3 = i2 != -1 ? iA - i2 : 0;
                        if (i3 > 0) {
                            iA -= i3;
                            c2584Vs0.I(c2584Vs0.c() + iA);
                        }
                        this.a.a(c2584Vs0);
                        int i4 = this.j;
                        if (i4 != -1) {
                            int i5 = i4 - iA;
                            this.j = i5;
                            if (i5 == 0) {
                                this.a.c();
                                g(1);
                            }
                        }
                    }
                } else if (d(c2584Vs0, this.b.a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                c2584Vs0.K(c2584Vs0.a());
            }
        }
    }

    @Override // com.daaw.InterfaceC8103s61
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override // com.daaw.InterfaceC8103s61
    public void c(R31 r31, InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        this.e = r31;
        this.a.d(interfaceC9838yJ, dVar);
    }

    public final boolean d(C2584Vs0 c2584Vs0, byte[] bArr, int i) {
        int iMin = Math.min(c2584Vs0.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c2584Vs0.K(iMin);
        } else {
            c2584Vs0.g(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        this.b.m(0);
        if (this.b.h(24) != 1) {
            this.j = -1;
            return false;
        }
        this.b.o(8);
        int iH = this.b.h(16);
        this.b.o(5);
        this.k = this.b.g();
        this.b.o(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.o(6);
        int iH2 = this.b.h(8);
        this.i = iH2;
        if (iH == 0) {
            this.j = -1;
        } else {
            this.j = (iH - 3) - iH2;
        }
        return true;
    }

    public final void f() {
        this.b.m(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.o(4);
            long jH = ((long) this.b.h(3)) << 30;
            this.b.o(1);
            long jH2 = jH | ((long) (this.b.h(15) << 15));
            this.b.o(1);
            long jH3 = jH2 | ((long) this.b.h(15));
            this.b.o(1);
            if (!this.h && this.g) {
                this.b.o(4);
                long jH4 = ((long) this.b.h(3)) << 30;
                this.b.o(1);
                long jH5 = jH4 | ((long) (this.b.h(15) << 15));
                this.b.o(1);
                long jH6 = jH5 | ((long) this.b.h(15));
                this.b.o(1);
                this.e.b(jH6);
                this.h = true;
            }
            this.l = this.e.b(jH3);
        }
    }

    public final void g(int i) {
        this.c = i;
        this.d = 0;
    }
}
