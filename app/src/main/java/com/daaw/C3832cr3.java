package com.daaw;

import com.google.android.gms.internal.ads.zzad;

/* JADX INFO: renamed from: com.daaw.cr3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832cr3 implements InterfaceC8576to1 {
    public boolean B;
    public Rn3 C;
    public final Wq3 a;
    public final Pn3 d;
    public final C8015rn3 e;
    public InterfaceC3554br3 f;
    public C2485Ut1 g;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean v;
    public C2485Ut1 y;
    public C2485Ut1 z;
    public final Yq3 b = new Yq3();
    public int h = 1000;
    public long[] i = new long[1000];
    public long[] j = new long[1000];
    public long[] m = new long[1000];
    public int[] l = new int[1000];
    public int[] k = new int[1000];
    public C8297so1[] n = new C8297so1[1000];
    public final C5514ir3 c = new C5514ir3(new InterfaceC1714No2() { // from class: com.daaw.Xq3
    });
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public boolean x = true;
    public boolean w = true;
    public boolean A = true;

    public C3832cr3(Ls3 ls3, Pn3 pn3, C8015rn3 c8015rn3) {
        this.d = pn3;
        this.e = c8015rn3;
        this.a = new Wq3(ls3);
    }

    public static /* synthetic */ void D(C3275ar3 c3275ar3) {
        Nn3 nn3 = c3275ar3.b;
        int i = Ln3.a;
    }

    public final synchronized C2485Ut1 A() {
        if (this.x) {
            return null;
        }
        return this.z;
    }

    public final void B(long j, boolean z, boolean z2) {
        this.a.c(k(j, false, z2));
    }

    public final void C() {
        this.a.c(l());
    }

    public final void E() throws C6900nn3 {
        Rn3 rn3 = this.C;
        if (rn3 != null) {
            throw rn3.a();
        }
    }

    public final void F() {
        C();
        p();
    }

    public final void G() {
        H(true);
        p();
    }

    public final void H(boolean z) {
        this.a.f();
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.w = true;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        this.c.d();
        if (z) {
            this.y = null;
            this.z = null;
            this.x = true;
            this.A = true;
        }
    }

    public final void I(long j) {
        this.s = j;
    }

    public final void J(InterfaceC3554br3 interfaceC3554br3) {
        this.f = interfaceC3554br3;
    }

    public final synchronized void K(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.r + i <= this.o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC6048km2.d(z);
        this.r += i;
    }

    public final synchronized boolean L() {
        return this.v;
    }

    public final synchronized boolean M(boolean z) {
        boolean z2 = true;
        if (r()) {
            if (((C3275ar3) this.c.a(this.p + this.r)).a != this.g) {
                return true;
            }
            return s(i(this.r));
        }
        if (!z && !this.v) {
            C2485Ut1 c2485Ut1 = this.z;
            if (c2485Ut1 == null) {
                z2 = false;
            } else if (c2485Ut1 == this.g) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean N(int i) {
        q();
        int i2 = this.p;
        if (i >= i2 && i <= this.o + i2) {
            this.s = Long.MIN_VALUE;
            this.r = i - i2;
            return true;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC8576to1
    public final void a(C5900kE2 c5900kE2, int i, int i2) {
        this.a.h(c5900kE2, i);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final /* synthetic */ void b(C5900kE2 c5900kE2, int i) {
        AbstractC8018ro1.b(this, c5900kE2, i);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final void c(long j, int i, int i2, int i3, C8297so1 c8297so1) {
        if (this.w) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.w = false;
            }
        }
        if (this.A) {
            if (j < this.s) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.B) {
                    AbstractC3305ay2.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.z)));
                    this.B = true;
                }
                i |= 1;
            }
        }
        n(j, i, (this.a.b() - ((long) i2)) - ((long) i3), i2, c8297so1);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final int d(InterfaceC8304sp3 interfaceC8304sp3, int i, boolean z, int i2) {
        return this.a.a(interfaceC8304sp3, i, z);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final void e(C2485Ut1 c2485Ut1) {
        this.y = c2485Ut1;
        boolean zT = t(c2485Ut1);
        InterfaceC3554br3 interfaceC3554br3 = this.f;
        if (interfaceC3554br3 == null || !zT) {
            return;
        }
        interfaceC3554br3.l(c2485Ut1);
    }

    @Override // com.daaw.InterfaceC8576to1
    public final /* synthetic */ int f(InterfaceC8304sp3 interfaceC8304sp3, int i, boolean z) {
        return AbstractC8018ro1.a(this, interfaceC8304sp3, i, z);
    }

    public final synchronized boolean g(long j, boolean z) throws Throwable {
        Throwable th;
        C3832cr3 c3832cr3;
        long j2;
        int iH;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            q();
            int i = this.r;
            int i2 = i(i);
            if (r() && j >= this.m[i2]) {
                if (j > this.u) {
                    if (z) {
                        z = true;
                    }
                }
                if (this.A) {
                    try {
                        int i3 = this.o - i;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (this.m[i2] >= j) {
                                    c3832cr3 = this;
                                    j2 = j;
                                    iH = i4;
                                    break;
                                }
                                i2++;
                                if (i2 == this.h) {
                                    i2 = 0;
                                }
                                i4++;
                            } else if (z) {
                                j2 = j;
                                iH = i3;
                                c3832cr3 = this;
                            } else {
                                c3832cr3 = this;
                                j2 = j;
                                iH = -1;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    c3832cr3 = this;
                    j2 = j;
                    iH = c3832cr3.h(i2, this.o - i, j2, true);
                }
                if (iH == -1) {
                    return false;
                }
                c3832cr3.s = j2;
                c3832cr3.r += iH;
                return true;
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.m[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.l[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.h) {
                i = 0;
            }
        }
        return i3;
    }

    public final int i(int i) {
        int i2 = this.q + i;
        int i3 = this.h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int j(C5730je3 c5730je3, H93 h93, boolean z, boolean z2, Yq3 yq3) {
        try {
            h93.e = false;
            if (!r()) {
                if (!z2 && !this.v) {
                    C2485Ut1 c2485Ut1 = this.z;
                    if (c2485Ut1 == null || (!z && c2485Ut1 == this.g)) {
                        return -3;
                    }
                    o(c2485Ut1, c5730je3);
                    return -5;
                }
                h93.c(4);
                h93.f = Long.MIN_VALUE;
                return -4;
            }
            C2485Ut1 c2485Ut12 = ((C3275ar3) this.c.a(this.p + this.r)).a;
            if (!z && c2485Ut12 == this.g) {
                int i = i(this.r);
                if (!s(i)) {
                    h93.e = true;
                    return -3;
                }
                h93.c(this.l[i]);
                if (this.r == this.o - 1 && (z2 || this.v)) {
                    h93.a(536870912);
                }
                long j = this.m[i];
                h93.f = j;
                if (j < this.s) {
                    h93.a(Integer.MIN_VALUE);
                }
                yq3.a = this.k[i];
                yq3.b = this.j[i];
                yq3.c = this.n[i];
                return -4;
            }
            o(c2485Ut12, c5730je3);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long k(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.o;
                if (i != 0) {
                    long[] jArr = this.m;
                    int i2 = this.q;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.r;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iH = h(i2, i, j, false);
                        if (iH == -1) {
                            return -1L;
                        }
                        return m(iH);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized long l() {
        int i = this.o;
        if (i == 0) {
            return -1L;
        }
        return m(i);
    }

    public final long m(int i) {
        long j = this.t;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = i(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.m[i2]);
                if ((this.l[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = this.h - 1;
                }
            }
        }
        this.t = Math.max(j, jMax);
        this.o -= i;
        int i4 = this.p + i;
        this.p = i4;
        int i5 = this.q + i;
        this.q = i5;
        int i6 = this.h;
        if (i5 >= i6) {
            this.q = i5 - i6;
        }
        int i7 = this.r - i;
        this.r = i7;
        if (i7 < 0) {
            this.r = 0;
        }
        this.c.e(i4);
        if (this.o != 0) {
            return this.j[this.q];
        }
        int i8 = this.q;
        if (i8 == 0) {
            i8 = this.h;
        }
        int i9 = i8 - 1;
        return this.j[i9] + ((long) this.k[i9]);
    }

    public final synchronized void n(long j, int i, long j2, int i2, C8297so1 c8297so1) {
        try {
            int i3 = this.o;
            if (i3 > 0) {
                int i4 = i(i3 - 1);
                AbstractC6048km2.d(this.j[i4] + ((long) this.k[i4]) <= j2);
            }
            this.v = (536870912 & i) != 0;
            this.u = Math.max(this.u, j);
            int i5 = i(this.o);
            this.m[i5] = j;
            this.j[i5] = j2;
            this.k[i5] = i2;
            this.l[i5] = i;
            this.n[i5] = c8297so1;
            this.i[i5] = 0;
            if (this.c.f() || !((C3275ar3) this.c.b()).a.equals(this.z)) {
                C2485Ut1 c2485Ut1 = this.z;
                if (c2485Ut1 == null) {
                    throw null;
                }
                this.c.c(this.p + this.o, new C3275ar3(c2485Ut1, Nn3.a, null));
            }
            int i6 = this.o + 1;
            this.o = i6;
            int i7 = this.h;
            if (i6 == i7) {
                int i8 = i7 + 1000;
                long[] jArr = new long[i8];
                long[] jArr2 = new long[i8];
                long[] jArr3 = new long[i8];
                int[] iArr = new int[i8];
                int[] iArr2 = new int[i8];
                C8297so1[] c8297so1Arr = new C8297so1[i8];
                int i9 = this.q;
                int i10 = i7 - i9;
                System.arraycopy(this.j, i9, jArr2, 0, i10);
                System.arraycopy(this.m, this.q, jArr3, 0, i10);
                System.arraycopy(this.l, this.q, iArr, 0, i10);
                System.arraycopy(this.k, this.q, iArr2, 0, i10);
                System.arraycopy(this.n, this.q, c8297so1Arr, 0, i10);
                System.arraycopy(this.i, this.q, jArr, 0, i10);
                int i11 = this.q;
                System.arraycopy(this.j, 0, jArr2, i10, i11);
                System.arraycopy(this.m, 0, jArr3, i10, i11);
                System.arraycopy(this.l, 0, iArr, i10, i11);
                System.arraycopy(this.k, 0, iArr2, i10, i11);
                System.arraycopy(this.n, 0, c8297so1Arr, i10, i11);
                System.arraycopy(this.i, 0, jArr, i10, i11);
                this.j = jArr2;
                this.m = jArr3;
                this.l = iArr;
                this.k = iArr2;
                this.n = c8297so1Arr;
                this.i = jArr;
                this.q = 0;
                this.h = i8;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(C2485Ut1 c2485Ut1, C5730je3 c5730je3) {
        C2485Ut1 c2485Ut12 = this.g;
        zzad zzadVar = c2485Ut12 == null ? null : c2485Ut12.o;
        this.g = c2485Ut1;
        zzad zzadVar2 = c2485Ut1.o;
        c5730je3.a = c2485Ut1.c(this.d.c(c2485Ut1));
        c5730je3.b = this.C;
        if (c2485Ut12 == null || !AbstractC9004vJ2.e(zzadVar, zzadVar2)) {
            Rn3 rn3 = c2485Ut1.o != null ? new Rn3(new C6900nn3(new Vn3(1), 6001)) : null;
            this.C = rn3;
            c5730je3.b = rn3;
        }
    }

    public final void p() {
        if (this.C != null) {
            this.C = null;
            this.g = null;
        }
    }

    public final synchronized void q() {
        this.r = 0;
        this.a.g();
    }

    public final boolean r() {
        return this.r != this.o;
    }

    public final boolean s(int i) {
        if (this.C == null) {
            return true;
        }
        int i2 = this.l[i];
        return false;
    }

    public final synchronized boolean t(C2485Ut1 c2485Ut1) {
        try {
            this.x = false;
            if (AbstractC9004vJ2.e(c2485Ut1, this.z)) {
                return false;
            }
            if (this.c.f() || !((C3275ar3) this.c.b()).a.equals(c2485Ut1)) {
                this.z = c2485Ut1;
            } else {
                this.z = ((C3275ar3) this.c.b()).a;
            }
            boolean z = this.A;
            C2485Ut1 c2485Ut12 = this.z;
            this.A = z & AbstractC5959kT1.e(c2485Ut12.l, c2485Ut12.i);
            this.B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int u() {
        return this.p;
    }

    public final int v() {
        return this.p + this.r;
    }

    public final synchronized int w(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.r;
                int i2 = i(i);
                if (!r() || j < this.m[i2]) {
                    return 0;
                }
                if (j <= this.u || !z) {
                    int iH = h(i2, this.o - i, j, true);
                    if (iH == -1) {
                        return 0;
                    }
                    return iH;
                }
                try {
                    return this.o - i;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public final int x() {
        return this.p + this.o;
    }

    public final int y(C5730je3 c5730je3, H93 h93, int i, boolean z) {
        int iJ = j(c5730je3, h93, (i & 2) != 0, z, this.b);
        if (iJ != -4) {
            return iJ;
        }
        if (!h93.f()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 != 0) {
                    this.a.d(h93, this.b);
                    return -4;
                }
                this.a.e(h93, this.b);
            } else if (i2 != 0) {
                return -4;
            }
            this.r++;
        }
        return -4;
    }

    public final synchronized long z() {
        return this.u;
    }
}
