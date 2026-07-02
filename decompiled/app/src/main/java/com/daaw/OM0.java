package com.daaw;

import com.daaw.NM0;
import com.daaw.Z41;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class OM0 implements Z41 {
    public final O3 a;
    public final int b;
    public final NM0 c;
    public final NM0.a d;
    public final C2584Vs0 e;
    public a f;
    public a g;
    public a h;
    public Format i;
    public boolean j;
    public Format k;
    public long l;
    public long m;
    public boolean n;
    public b o;

    public static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public N3 d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void b(N3 n3, a aVar) {
            this.d = n3;
            this.e = aVar;
            this.c = true;
        }

        public int c(long j) {
            return ((int) (j - this.a)) + this.d.b;
        }
    }

    public interface b {
        void j(Format format);
    }

    public OM0(O3 o3) {
        this.a = o3;
        int iE = o3.e();
        this.b = iE;
        this.c = new NM0();
        this.d = new NM0.a();
        this.e = new C2584Vs0(32);
        a aVar = new a(0L, iE);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
    }

    public static Format n(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j == 0) {
            return format;
        }
        long j2 = format.X;
        return j2 != Long.MAX_VALUE ? format.g(j2 + j) : format;
    }

    public final void A(long j, byte[] bArr, int i) {
        e(j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.g.b - j));
            a aVar = this.g;
            System.arraycopy(aVar.d.a, aVar.c(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            a aVar2 = this.g;
            if (j == aVar2.b) {
                this.g = aVar2.e;
            }
        }
    }

    public final void B(C1016Gw c1016Gw, NM0.a aVar) {
        int iD;
        long j = aVar.b;
        this.e.G(1);
        A(j, this.e.a, 1);
        long j2 = j + 1;
        byte b2 = this.e.a[0];
        boolean z = (b2 & 128) != 0;
        int i = b2 & 127;
        C0904Fu c0904Fu = c1016Gw.C;
        if (c0904Fu.a == null) {
            c0904Fu.a = new byte[16];
        }
        A(j2, c0904Fu.a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            this.e.G(2);
            A(j3, this.e.a, 2);
            j3 += 2;
            iD = this.e.D();
        } else {
            iD = 1;
        }
        C0904Fu c0904Fu2 = c1016Gw.C;
        int[] iArr = c0904Fu2.d;
        if (iArr == null || iArr.length < iD) {
            iArr = new int[iD];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c0904Fu2.e;
        if (iArr3 == null || iArr3.length < iD) {
            iArr3 = new int[iD];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = iD * 6;
            this.e.G(i2);
            A(j3, this.e.a, i2);
            j3 += (long) i2;
            this.e.J(0);
            for (int i3 = 0; i3 < iD; i3++) {
                iArr2[i3] = this.e.D();
                iArr4[i3] = this.e.B();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.a - ((int) (j3 - aVar.b));
        }
        Z41.a aVar2 = aVar.c;
        C0904Fu c0904Fu3 = c1016Gw.C;
        c0904Fu3.c(iD, iArr2, iArr4, aVar2.b, c0904Fu3.a, aVar2.a, aVar2.c, aVar2.d);
        long j4 = aVar.b;
        int i4 = (int) (j3 - j4);
        aVar.b = j4 + ((long) i4);
        aVar.a -= i4;
    }

    public void C() {
        D(false);
    }

    public void D(boolean z) {
        this.c.x(z);
        h(this.f);
        a aVar = new a(0L, this.b);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.m = 0L;
        this.a.b();
    }

    public void E() {
        this.c.y();
        this.g = this.f;
    }

    public boolean F(int i) {
        return this.c.z(i);
    }

    public void G(long j) {
        if (this.l != j) {
            this.l = j;
            this.j = true;
        }
    }

    public void H(b bVar) {
        this.o = bVar;
    }

    public void I(int i) {
        this.c.A(i);
    }

    public void J() {
        this.n = true;
    }

    @Override // com.daaw.Z41
    public void a(long j, int i, int i2, int i3, Z41.a aVar) {
        if (this.j) {
            d(this.k);
        }
        if (this.n) {
            if ((i & 1) == 0 || !this.c.c(j)) {
                return;
            } else {
                this.n = false;
            }
        }
        this.c.d(j + this.l, i, (this.m - ((long) i2)) - ((long) i3), i2, aVar);
    }

    @Override // com.daaw.Z41
    public int b(InterfaceC9001vJ interfaceC9001vJ, int i, boolean z) throws EOFException {
        int iX = x(i);
        a aVar = this.h;
        int iC = interfaceC9001vJ.c(aVar.d.a, aVar.c(this.m), iX);
        if (iC != -1) {
            w(iC);
            return iC;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.daaw.Z41
    public void c(C2584Vs0 c2584Vs0, int i) {
        while (i > 0) {
            int iX = x(i);
            a aVar = this.h;
            c2584Vs0.g(aVar.d.a, aVar.c(this.m), iX);
            i -= iX;
            w(iX);
        }
    }

    @Override // com.daaw.Z41
    public void d(Format format) {
        Format formatN = n(format, this.l);
        boolean zL = this.c.l(formatN);
        this.k = format;
        this.j = false;
        b bVar = this.o;
        if (bVar == null || !zL) {
            return;
        }
        bVar.j(formatN);
    }

    public final void e(long j) {
        while (true) {
            a aVar = this.g;
            if (j < aVar.b) {
                return;
            } else {
                this.g = aVar.e;
            }
        }
    }

    public int f(long j, boolean z, boolean z2) {
        return this.c.a(j, z, z2);
    }

    public int g() {
        return this.c.b();
    }

    public final void h(a aVar) {
        if (aVar.c) {
            a aVar2 = this.h;
            boolean z = aVar2.c;
            int i = (z ? 1 : 0) + (((int) (aVar2.a - aVar.a)) / this.b);
            N3[] n3Arr = new N3[i];
            for (int i2 = 0; i2 < i; i2++) {
                n3Arr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.a.d(n3Arr);
        }
    }

    public final void i(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f;
            if (j < aVar.b) {
                break;
            }
            this.a.c(aVar.d);
            this.f = this.f.a();
        }
        if (this.g.a < aVar.a) {
            this.g = aVar;
        }
    }

    public void j(long j, boolean z, boolean z2) {
        i(this.c.g(j, z, z2));
    }

    public void k() {
        i(this.c.h());
    }

    public void l() {
        i(this.c.i());
    }

    public void m(int i) {
        long j = this.c.j(i);
        this.m = j;
        if (j != 0) {
            a aVar = this.f;
            if (j != aVar.a) {
                while (this.m > aVar.b) {
                    aVar = aVar.e;
                }
                a aVar2 = aVar.e;
                h(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.e = aVar3;
                if (this.m == aVar.b) {
                    aVar = aVar3;
                }
                this.h = aVar;
                if (this.g == aVar2) {
                    this.g = aVar3;
                    return;
                }
                return;
            }
        }
        h(this.f);
        a aVar4 = new a(this.m, this.b);
        this.f = aVar4;
        this.g = aVar4;
        this.h = aVar4;
    }

    public int o() {
        return this.c.m();
    }

    public long p() {
        return this.c.n();
    }

    public long q() {
        return this.c.o();
    }

    public int r() {
        return this.c.q();
    }

    public Format s() {
        return this.c.s();
    }

    public int t() {
        return this.c.t();
    }

    public boolean u() {
        return this.c.u();
    }

    public int v() {
        return this.c.v();
    }

    public final void w(int i) {
        long j = this.m + ((long) i);
        this.m = j;
        a aVar = this.h;
        if (j == aVar.b) {
            this.h = aVar.e;
        }
    }

    public final int x(int i) {
        a aVar = this.h;
        if (!aVar.c) {
            aVar.b(this.a.a(), new a(this.h.b, this.b));
        }
        return Math.min(i, (int) (this.h.b - this.m));
    }

    public int y(C5103hP c5103hP, C1016Gw c1016Gw, boolean z, boolean z2, long j) {
        int iW = this.c.w(c5103hP, c1016Gw, z, z2, this.i, this.d);
        if (iW == -5) {
            this.i = c5103hP.a;
            return -5;
        }
        if (iW != -4) {
            if (iW == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!c1016Gw.p()) {
            if (c1016Gw.E < j) {
                c1016Gw.k(Integer.MIN_VALUE);
            }
            if (c1016Gw.v()) {
                B(c1016Gw, this.d);
            }
            c1016Gw.t(this.d.a);
            NM0.a aVar = this.d;
            z(aVar.b, c1016Gw.D, aVar.a);
        }
        return -4;
    }

    public final void z(long j, ByteBuffer byteBuffer, int i) {
        e(j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (this.g.b - j));
            a aVar = this.g;
            byteBuffer.put(aVar.d.a, aVar.c(j), iMin);
            i -= iMin;
            j += (long) iMin;
            a aVar2 = this.g;
            if (j == aVar2.b) {
                this.g = aVar2.e;
            }
        }
    }
}
