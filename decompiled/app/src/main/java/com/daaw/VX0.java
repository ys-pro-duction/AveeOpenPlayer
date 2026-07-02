package com.daaw;

import com.daaw.CO0;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public abstract class VX0 {
    public final C0885Fp0 a = new C0885Fp0();
    public Z41 b;
    public InterfaceC9838yJ c;
    public InterfaceC1093Hp0 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public b j;
    public long k;
    public boolean l;
    public boolean m;

    public static class b {
        public Format a;
        public InterfaceC1093Hp0 b;
    }

    public static final class c implements InterfaceC1093Hp0 {
        public c() {
        }

        @Override // com.daaw.InterfaceC1093Hp0
        public long a(InterfaceC9001vJ interfaceC9001vJ) {
            return -1L;
        }

        @Override // com.daaw.InterfaceC1093Hp0
        public CO0 c() {
            return new CO0.b(-9223372036854775807L);
        }

        @Override // com.daaw.InterfaceC1093Hp0
        public long d(long j) {
            return 0L;
        }
    }

    public long a(long j) {
        return (j * 1000000) / ((long) this.i);
    }

    public long b(long j) {
        return (((long) this.i) * j) / 1000000;
    }

    public void c(InterfaceC9838yJ interfaceC9838yJ, Z41 z41) {
        this.c = interfaceC9838yJ;
        this.b = z41;
        j(true);
    }

    public void d(long j) {
        this.g = j;
    }

    public abstract long e(C2584Vs0 c2584Vs0);

    public final int f(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        int i = this.h;
        if (i == 0) {
            return g(interfaceC9001vJ);
        }
        if (i != 1) {
            if (i == 2) {
                return i(interfaceC9001vJ, c2082Qx0);
            }
            throw new IllegalStateException();
        }
        interfaceC9001vJ.j((int) this.f);
        this.h = 2;
        return 0;
    }

    public final int g(InterfaceC9001vJ interfaceC9001vJ) {
        VX0 vx0;
        boolean zH = true;
        while (zH) {
            if (!this.a.d(interfaceC9001vJ)) {
                this.h = 3;
                return -1;
            }
            this.k = interfaceC9001vJ.getPosition() - this.f;
            zH = h(this.a.c(), this.f, this.j);
            if (zH) {
                this.f = interfaceC9001vJ.getPosition();
            }
        }
        Format format = this.j.a;
        this.i = format.T;
        if (!this.m) {
            this.b.d(format);
            this.m = true;
        }
        InterfaceC1093Hp0 interfaceC1093Hp0 = this.j.b;
        if (interfaceC1093Hp0 != null) {
            this.d = interfaceC1093Hp0;
        } else {
            if (interfaceC9001vJ.b() != -1) {
                C0989Gp0 c0989Gp0B = this.a.b();
                vx0 = this;
                vx0.d = new C1228Ix(this.f, interfaceC9001vJ.b(), vx0, c0989Gp0B.h + c0989Gp0B.i, c0989Gp0B.c);
                vx0.j = null;
                vx0.h = 2;
                vx0.a.f();
                return 0;
            }
            this.d = new c();
        }
        vx0 = this;
        vx0.j = null;
        vx0.h = 2;
        vx0.a.f();
        return 0;
    }

    public abstract boolean h(C2584Vs0 c2584Vs0, long j, b bVar);

    public final int i(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        long jA = this.d.a(interfaceC9001vJ);
        if (jA >= 0) {
            c2082Qx0.a = jA;
            return 1;
        }
        if (jA < -1) {
            d(-(jA + 2));
        }
        if (!this.l) {
            this.c.b(this.d.c());
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(interfaceC9001vJ)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        C2584Vs0 c2584Vs0C = this.a.c();
        long jE = e(c2584Vs0C);
        if (jE >= 0) {
            long j = this.g;
            if (j + jE >= this.e) {
                long jA2 = a(j);
                this.b.c(c2584Vs0C, c2584Vs0C.d());
                this.b.a(jA2, 1, c2584Vs0C.d(), 0, null);
                this.e = -1L;
            }
        }
        this.g += jE;
        return 0;
    }

    public void j(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public final void k(long j, long j2) {
        this.a.e();
        if (j == 0) {
            j(!this.l);
        } else if (this.h != 0) {
            this.e = this.d.d(j2);
            this.h = 2;
        }
    }
}
