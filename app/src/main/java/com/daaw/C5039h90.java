package com.daaw;

import android.util.Pair;
import com.daaw.InterfaceC8103s61;
import com.google.android.exoplayer2.Format;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.h90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5039h90 implements InterfaceC9543xF {
    public final String a;
    public final C2584Vs0 b;
    public final C2480Us0 c;
    public Z41 d;
    public Format e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;

    public C5039h90(String str) {
        this.a = str;
        C2584Vs0 c2584Vs0 = new C2584Vs0(1024);
        this.b = c2584Vs0;
        this.c = new C2480Us0(c2584Vs0.a);
    }

    public static long f(C2480Us0 c2480Us0) {
        return c2480Us0.h((c2480Us0.h(2) + 1) * 8);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void a(C2584Vs0 c2584Vs0) throws C3000Zs0 {
        while (c2584Vs0.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int iX = c2584Vs0.x();
                    if ((iX & 224) == 224) {
                        this.j = iX;
                        this.g = 2;
                    } else if (iX != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int iX2 = ((this.j & (-225)) << 8) | c2584Vs0.x();
                    this.i = iX2;
                    if (iX2 > this.b.a.length) {
                        m(iX2);
                    }
                    this.h = 0;
                    this.g = 3;
                } else if (i == 3) {
                    int iMin = Math.min(c2584Vs0.a(), this.i - this.h);
                    c2584Vs0.g(this.c.a, this.h, iMin);
                    int i2 = this.h + iMin;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.m(0);
                        g(this.c);
                        this.g = 0;
                    }
                }
            } else if (c2584Vs0.x() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // com.daaw.InterfaceC9543xF
    public void b() {
        this.g = 0;
        this.l = false;
    }

    @Override // com.daaw.InterfaceC9543xF
    public void d(InterfaceC9838yJ interfaceC9838yJ, InterfaceC8103s61.d dVar) {
        dVar.a();
        this.d = interfaceC9838yJ.a(dVar.c(), 1);
        this.f = dVar.b();
    }

    @Override // com.daaw.InterfaceC9543xF
    public void e(long j, boolean z) {
        this.k = j;
    }

    public final void g(C2480Us0 c2480Us0) throws C3000Zs0 {
        if (!c2480Us0.g()) {
            this.l = true;
            l(c2480Us0);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw new C3000Zs0();
        }
        if (this.n != 0) {
            throw new C3000Zs0();
        }
        k(c2480Us0, j(c2480Us0));
        if (this.p) {
            c2480Us0.o((int) this.q);
        }
    }

    public final int h(C2480Us0 c2480Us0) throws C3000Zs0 {
        int iB = c2480Us0.b();
        Pair pairH = AbstractC9129vm.h(c2480Us0, true);
        this.r = ((Integer) pairH.first).intValue();
        this.t = ((Integer) pairH.second).intValue();
        return iB - c2480Us0.b();
    }

    public final void i(C2480Us0 c2480Us0) {
        int iH = c2480Us0.h(3);
        this.o = iH;
        if (iH == 0) {
            c2480Us0.o(8);
            return;
        }
        if (iH == 1) {
            c2480Us0.o(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            c2480Us0.o(6);
        } else if (iH == 6 || iH == 7) {
            c2480Us0.o(1);
        }
    }

    public final int j(C2480Us0 c2480Us0) throws C3000Zs0 {
        int iH;
        if (this.o != 0) {
            throw new C3000Zs0();
        }
        int i = 0;
        do {
            iH = c2480Us0.h(8);
            i += iH;
        } while (iH == 255);
        return i;
    }

    public final void k(C2480Us0 c2480Us0, int i) {
        int iE = c2480Us0.e();
        if ((iE & 7) == 0) {
            this.b.J(iE >> 3);
        } else {
            c2480Us0.i(this.b.a, 0, i * 8);
            this.b.J(0);
        }
        this.d.c(this.b, i);
        this.d.a(this.k, 1, i, 0, null);
        this.k += this.s;
    }

    public final void l(C2480Us0 c2480Us0) throws C3000Zs0 {
        boolean zG;
        int iH = c2480Us0.h(1);
        int iH2 = iH == 1 ? c2480Us0.h(1) : 0;
        this.m = iH2;
        if (iH2 != 0) {
            throw new C3000Zs0();
        }
        if (iH == 1) {
            f(c2480Us0);
        }
        if (!c2480Us0.g()) {
            throw new C3000Zs0();
        }
        this.n = c2480Us0.h(6);
        int iH3 = c2480Us0.h(4);
        int iH4 = c2480Us0.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw new C3000Zs0();
        }
        if (iH == 0) {
            int iE = c2480Us0.e();
            int iH5 = h(c2480Us0);
            c2480Us0.m(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            c2480Us0.i(bArr, 0, iH5);
            Format formatK = Format.k(this.f, "audio/mp4a-latm", null, -1, -1, this.t, this.r, Collections.singletonList(bArr), null, 0, this.a);
            if (!formatK.equals(this.e)) {
                this.e = formatK;
                this.s = 1024000000 / ((long) formatK.T);
                this.d.d(formatK);
            }
        } else {
            c2480Us0.o(((int) f(c2480Us0)) - h(c2480Us0));
        }
        i(c2480Us0);
        boolean zG2 = c2480Us0.g();
        this.p = zG2;
        this.q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.q = f(c2480Us0);
            } else {
                do {
                    zG = c2480Us0.g();
                    this.q = (this.q << 8) + ((long) c2480Us0.h(8));
                } while (zG);
            }
        }
        if (c2480Us0.g()) {
            c2480Us0.o(8);
        }
    }

    public final void m(int i) {
        this.b.G(i);
        this.c.k(this.b.a);
    }

    @Override // com.daaw.InterfaceC9543xF
    public void c() {
    }
}
