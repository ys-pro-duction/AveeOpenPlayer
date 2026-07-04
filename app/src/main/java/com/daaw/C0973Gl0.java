package com.daaw;

import com.daaw.AbstractC1244Jb;
import com.daaw.CO0;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.daaw.Gl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973Gl0 implements InterfaceC8715uJ, CO0 {
    public static final InterfaceC10117zJ t = new a();
    public static final int u = AbstractC6280lb1.v("qt  ");
    public final int a;
    public final C2584Vs0 b;
    public final C2584Vs0 c;
    public final C2584Vs0 d;
    public final ArrayDeque e;
    public int f;
    public int g;
    public long h;
    public int i;
    public C2584Vs0 j;
    public int k;
    public int l;
    public int m;
    public InterfaceC9838yJ n;
    public b[] o;
    public long[][] p;
    public int q;
    public long r;
    public boolean s;

    /* JADX INFO: renamed from: com.daaw.Gl0$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C0973Gl0()};
        }
    }

    /* JADX INFO: renamed from: com.daaw.Gl0$b */
    public static final class b {
        public final U41 a;
        public final C3059a51 b;
        public final Z41 c;
        public int d;

        public b(U41 u41, C3059a51 c3059a51, Z41 z41) {
            this.a = u41;
            this.b = c3059a51;
            this.c = z41;
        }
    }

    public C0973Gl0() {
        this(0);
    }

    public static long[][] j(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            jArr[i] = new long[bVarArr[i].b.a];
            jArr2[i] = bVarArr[i].b.e[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < bVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            C3059a51 c3059a51 = bVarArr[i3].b;
            j += (long) c3059a51.c[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = c3059a51.e[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    public static int l(C3059a51 c3059a51, long j) {
        int iA = c3059a51.a(j);
        return iA == -1 ? c3059a51.b(j) : iA;
    }

    public static long n(C3059a51 c3059a51, long j, long j2) {
        int iL = l(c3059a51, j);
        return iL == -1 ? j2 : Math.min(c3059a51.b[iL], j2);
    }

    public static boolean p(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(8);
        if (c2584Vs0.i() == u) {
            return true;
        }
        c2584Vs0.K(4);
        while (c2584Vs0.a() > 0) {
            if (c2584Vs0.i() == u) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(int i) {
        return i == AbstractC1244Jb.C || i == AbstractC1244Jb.E || i == AbstractC1244Jb.F || i == AbstractC1244Jb.G || i == AbstractC1244Jb.H || i == AbstractC1244Jb.Q;
    }

    public static boolean v(int i) {
        return i == AbstractC1244Jb.S || i == AbstractC1244Jb.D || i == AbstractC1244Jb.T || i == AbstractC1244Jb.U || i == AbstractC1244Jb.n0 || i == AbstractC1244Jb.o0 || i == AbstractC1244Jb.p0 || i == AbstractC1244Jb.R || i == AbstractC1244Jb.q0 || i == AbstractC1244Jb.r0 || i == AbstractC1244Jb.s0 || i == AbstractC1244Jb.t0 || i == AbstractC1244Jb.u0 || i == AbstractC1244Jb.P || i == AbstractC1244Jb.b || i == AbstractC1244Jb.B0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        return DU0.d(interfaceC9001vJ);
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        while (true) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return t(interfaceC9001vJ, c2082Qx0);
                    }
                    throw new IllegalStateException();
                }
                if (s(interfaceC9001vJ, c2082Qx0)) {
                    return 1;
                }
            } else if (!r(interfaceC9001vJ)) {
                return -1;
            }
        }
    }

    @Override // com.daaw.CO0
    public boolean e() {
        return true;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.e.clear();
        this.i = 0;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        if (j == 0) {
            k();
        } else if (this.o != null) {
            w(j2);
        }
    }

    @Override // com.daaw.CO0
    public CO0.a g(long j) {
        long j2;
        long j3;
        int iB;
        b[] bVarArr = this.o;
        if (bVarArr.length == 0) {
            return new CO0.a(EO0.c);
        }
        int i = this.q;
        long jN = -1;
        if (i != -1) {
            C3059a51 c3059a51 = bVarArr[i].b;
            int iL = l(c3059a51, j);
            if (iL == -1) {
                return new CO0.a(EO0.c);
            }
            long j4 = c3059a51.e[iL];
            j2 = c3059a51.b[iL];
            if (j4 >= j || iL >= c3059a51.a - 1 || (iB = c3059a51.b(j)) == -1 || iB == iL) {
                j3 = -9223372036854775807L;
            } else {
                j3 = c3059a51.e[iB];
                jN = c3059a51.b[iB];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            b[] bVarArr2 = this.o;
            if (i2 >= bVarArr2.length) {
                break;
            }
            if (i2 != this.q) {
                C3059a51 c3059a512 = bVarArr2[i2].b;
                long jN2 = n(c3059a512, j, j2);
                if (j3 != -9223372036854775807L) {
                    jN = n(c3059a512, j3, jN);
                }
                j2 = jN2;
            }
            i2++;
        }
        EO0 eo0 = new EO0(j, j2);
        return j3 == -9223372036854775807L ? new CO0.a(eo0) : new CO0.a(eo0, new EO0(j3, jN));
    }

    @Override // com.daaw.CO0
    public long h() {
        return this.r;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.n = interfaceC9838yJ;
    }

    public final void k() {
        this.f = 0;
        this.i = 0;
    }

    public final int m(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.o;
            if (i3 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i3];
            int i4 = bVar.d;
            C3059a51 c3059a51 = bVar.b;
            if (i4 != c3059a51.a) {
                long j5 = c3059a51.b[i4];
                long j6 = this.p[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j3 = j6;
                    i2 = i3;
                    j4 = j7;
                }
                if (j6 < j2) {
                    z = z3;
                    j2 = j6;
                    i = i3;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    public final void o(long j) throws C3000Zs0 {
        while (!this.e.isEmpty() && ((AbstractC1244Jb.a) this.e.peek()).Q0 == j) {
            AbstractC1244Jb.a aVar = (AbstractC1244Jb.a) this.e.pop();
            if (aVar.a == AbstractC1244Jb.C) {
                q(aVar);
                this.e.clear();
                this.f = 2;
            } else if (!this.e.isEmpty()) {
                ((AbstractC1244Jb.a) this.e.peek()).d(aVar);
            }
        }
        if (this.f != 2) {
            k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.daaw.AbstractC1244Jb.a r22) throws com.daaw.C3000Zs0 {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0973Gl0.q(com.daaw.Jb$a):void");
    }

    public final boolean r(InterfaceC9001vJ interfaceC9001vJ) throws C3000Zs0 {
        if (this.i == 0) {
            if (!interfaceC9001vJ.d(this.d.a, 0, 8, true)) {
                return false;
            }
            this.i = 8;
            this.d.J(0);
            this.h = this.d.z();
            this.g = this.d.i();
        }
        long j = this.h;
        if (j == 1) {
            interfaceC9001vJ.g(this.d.a, 8, 8);
            this.i += 8;
            this.h = this.d.C();
        } else if (j == 0) {
            long jB = interfaceC9001vJ.b();
            if (jB == -1 && !this.e.isEmpty()) {
                jB = ((AbstractC1244Jb.a) this.e.peek()).Q0;
            }
            if (jB != -1) {
                this.h = (jB - interfaceC9001vJ.getPosition()) + ((long) this.i);
            }
        }
        if (this.h < this.i) {
            throw new C3000Zs0("Atom size less than header length (unsupported).");
        }
        if (u(this.g)) {
            long position = (interfaceC9001vJ.getPosition() + this.h) - ((long) this.i);
            this.e.push(new AbstractC1244Jb.a(this.g, position));
            if (this.h == this.i) {
                o(position);
            } else {
                k();
            }
        } else if (v(this.g)) {
            AbstractC7115ob.f(this.i == 8);
            AbstractC7115ob.f(this.h <= 2147483647L);
            C2584Vs0 c2584Vs0 = new C2584Vs0((int) this.h);
            this.j = c2584Vs0;
            System.arraycopy(this.d.a, 0, c2584Vs0.a, 0, 8);
            this.f = 1;
        } else {
            this.j = null;
            this.f = 1;
        }
        return true;
    }

    public final boolean s(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        boolean z;
        long j = this.h - ((long) this.i);
        long position = interfaceC9001vJ.getPosition() + j;
        C2584Vs0 c2584Vs0 = this.j;
        if (c2584Vs0 != null) {
            interfaceC9001vJ.g(c2584Vs0.a, this.i, (int) j);
            if (this.g == AbstractC1244Jb.b) {
                this.s = p(this.j);
            } else if (!this.e.isEmpty()) {
                ((AbstractC1244Jb.a) this.e.peek()).e(new AbstractC1244Jb.b(this.g, this.j));
            }
        } else {
            if (j >= 262144) {
                c2082Qx0.a = interfaceC9001vJ.getPosition() + j;
                z = true;
                o(position);
                return (z || this.f == 2) ? false : true;
            }
            interfaceC9001vJ.j((int) j);
        }
        z = false;
        o(position);
        if (z) {
        }
    }

    public final int t(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        long position = interfaceC9001vJ.getPosition();
        if (this.k == -1) {
            int iM = m(position);
            this.k = iM;
            if (iM == -1) {
                return -1;
            }
        }
        b bVar = this.o[this.k];
        Z41 z41 = bVar.c;
        int i = bVar.d;
        C3059a51 c3059a51 = bVar.b;
        long j = c3059a51.b[i];
        int i2 = c3059a51.c[i];
        long j2 = (j - position) + ((long) this.l);
        if (j2 < 0 || j2 >= 262144) {
            c2082Qx0.a = j;
            return 1;
        }
        if (bVar.a.g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        interfaceC9001vJ.j((int) j2);
        int i3 = bVar.a.j;
        if (i3 == 0) {
            while (true) {
                int i4 = this.l;
                if (i4 >= i2) {
                    break;
                }
                int iB = z41.b(interfaceC9001vJ, i2 - i4, false);
                this.l += iB;
                this.m -= iB;
            }
        } else {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = 4 - i3;
            while (this.l < i2) {
                int i6 = this.m;
                if (i6 == 0) {
                    interfaceC9001vJ.g(this.c.a, i5, i3);
                    this.c.J(0);
                    this.m = this.c.B();
                    this.b.J(0);
                    z41.c(this.b, 4);
                    this.l += 4;
                    i2 += i5;
                } else {
                    int iB2 = z41.b(interfaceC9001vJ, i6, false);
                    this.l += iB2;
                    this.m -= iB2;
                }
            }
        }
        int i7 = i2;
        C3059a51 c3059a512 = bVar.b;
        z41.a(c3059a512.e[i], c3059a512.f[i], i7, 0, null);
        bVar.d++;
        this.k = -1;
        this.l = 0;
        this.m = 0;
        return 0;
    }

    public final void w(long j) {
        for (b bVar : this.o) {
            C3059a51 c3059a51 = bVar.b;
            int iA = c3059a51.a(j);
            if (iA == -1) {
                iA = c3059a51.b(j);
            }
            bVar.d = iA;
        }
    }

    public C0973Gl0(int i) {
        this.a = i;
        this.d = new C2584Vs0(16);
        this.e = new ArrayDeque();
        this.b = new C2584Vs0(AbstractC2248Sm0.a);
        this.c = new C2584Vs0(4);
        this.k = -1;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
