package com.daaw;

import com.daaw.Z41;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public final class NM0 {
    public int i;
    public int j;
    public int k;
    public int l;
    public Format q;
    public int r;
    public int a = 1000;
    public int[] b = new int[1000];
    public long[] c = new long[1000];
    public long[] f = new long[1000];
    public int[] e = new int[1000];
    public int[] d = new int[1000];
    public Z41.a[] g = new Z41.a[1000];
    public Format[] h = new Format[1000];
    public long m = Long.MIN_VALUE;
    public long n = Long.MIN_VALUE;
    public boolean p = true;
    public boolean o = true;

    public static final class a {
        public int a;
        public long b;
        public Z41.a c;
    }

    public void A(int i) {
        this.r = i;
    }

    public synchronized int a(long j, boolean z, boolean z2) throws Throwable {
        try {
            try {
                int iR = r(this.l);
                if (!u() || j < this.f[iR] || (j > this.n && !z2)) {
                    return -1;
                }
                int iK = k(iR, this.i - this.l, j, z);
                if (iK == -1) {
                    return -1;
                }
                this.l += iK;
                return iK;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public synchronized int b() {
        int i;
        int i2 = this.i;
        i = i2 - this.l;
        this.l = i2;
        return i;
    }

    public synchronized boolean c(long j) {
        if (this.i == 0) {
            return j > this.m;
        }
        if (Math.max(this.m, p(this.l)) >= j) {
            return false;
        }
        int i = this.i;
        int iR = r(i - 1);
        while (i > this.l && this.f[iR] >= j) {
            i--;
            iR--;
            if (iR == -1) {
                iR = this.a - 1;
            }
        }
        j(this.j + i);
        return true;
    }

    public synchronized void d(long j, int i, long j2, int i2, Z41.a aVar) {
        try {
            if (this.o) {
                if ((i & 1) == 0) {
                    return;
                } else {
                    this.o = false;
                }
            }
            AbstractC7115ob.f(!this.p);
            e(j);
            int iR = r(this.i);
            this.f[iR] = j;
            long[] jArr = this.c;
            jArr[iR] = j2;
            this.d[iR] = i2;
            this.e[iR] = i;
            this.g[iR] = aVar;
            this.h[iR] = this.q;
            this.b[iR] = this.r;
            int i3 = this.i + 1;
            this.i = i3;
            int i4 = this.a;
            if (i3 == i4) {
                int i5 = i4 + 1000;
                int[] iArr = new int[i5];
                long[] jArr2 = new long[i5];
                long[] jArr3 = new long[i5];
                int[] iArr2 = new int[i5];
                int[] iArr3 = new int[i5];
                Z41.a[] aVarArr = new Z41.a[i5];
                Format[] formatArr = new Format[i5];
                int i6 = this.k;
                int i7 = i4 - i6;
                System.arraycopy(jArr, i6, jArr2, 0, i7);
                System.arraycopy(this.f, this.k, jArr3, 0, i7);
                System.arraycopy(this.e, this.k, iArr2, 0, i7);
                System.arraycopy(this.d, this.k, iArr3, 0, i7);
                System.arraycopy(this.g, this.k, aVarArr, 0, i7);
                System.arraycopy(this.h, this.k, formatArr, 0, i7);
                System.arraycopy(this.b, this.k, iArr, 0, i7);
                int i8 = this.k;
                System.arraycopy(this.c, 0, jArr2, i7, i8);
                System.arraycopy(this.f, 0, jArr3, i7, i8);
                System.arraycopy(this.e, 0, iArr2, i7, i8);
                System.arraycopy(this.d, 0, iArr3, i7, i8);
                System.arraycopy(this.g, 0, aVarArr, i7, i8);
                System.arraycopy(this.h, 0, formatArr, i7, i8);
                System.arraycopy(this.b, 0, iArr, i7, i8);
                this.c = jArr2;
                this.f = jArr3;
                this.e = iArr2;
                this.d = iArr3;
                this.g = aVarArr;
                this.h = formatArr;
                this.b = iArr;
                this.k = 0;
                this.i = this.a;
                this.a = i5;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(long j) {
        this.n = Math.max(this.n, j);
    }

    public final long f(int i) {
        this.m = Math.max(this.m, p(i));
        int i2 = this.i - i;
        this.i = i2;
        this.j += i;
        int i3 = this.k + i;
        this.k = i3;
        int i4 = this.a;
        if (i3 >= i4) {
            this.k = i3 - i4;
        }
        int i5 = this.l - i;
        this.l = i5;
        if (i5 < 0) {
            this.l = 0;
        }
        if (i2 != 0) {
            return this.c[this.k];
        }
        int i6 = this.k;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.c[i7] + ((long) this.d[i7]);
    }

    public synchronized long g(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.i;
                if (i != 0) {
                    long[] jArr = this.f;
                    int i2 = this.k;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.l;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iK = k(i2, i, j, z);
                        if (iK == -1) {
                            return -1L;
                        }
                        return f(iK);
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

    public synchronized long h() {
        int i = this.i;
        if (i == 0) {
            return -1L;
        }
        return f(i);
    }

    public synchronized long i() {
        int i = this.l;
        if (i == 0) {
            return -1L;
        }
        return f(i);
    }

    public long j(int i) {
        int iT = t() - i;
        AbstractC7115ob.a(iT >= 0 && iT <= this.i - this.l);
        int i2 = this.i - iT;
        this.i = i2;
        this.n = Math.max(this.m, p(i2));
        int i3 = this.i;
        if (i3 == 0) {
            return 0L;
        }
        int iR = r(i3 - 1);
        return this.c[iR] + ((long) this.d[iR]);
    }

    public final int k(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f[i] <= j; i4++) {
            if (!z || (this.e[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.a) {
                i = 0;
            }
        }
        return i3;
    }

    public synchronized boolean l(Format format) {
        if (format == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (AbstractC6280lb1.b(format, this.q)) {
            return false;
        }
        this.q = format;
        return true;
    }

    public int m() {
        return this.j;
    }

    public synchronized long n() {
        return this.i == 0 ? Long.MIN_VALUE : this.f[this.k];
    }

    public synchronized long o() {
        return this.n;
    }

    public final long p(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iR = r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f[iR]);
            if ((this.e[iR] & 1) != 0) {
                return jMax;
            }
            iR--;
            if (iR == -1) {
                iR = this.a - 1;
            }
        }
        return jMax;
    }

    public int q() {
        return this.j + this.l;
    }

    public final int r(int i) {
        int i2 = this.k + i;
        int i3 = this.a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public synchronized Format s() {
        return this.p ? null : this.q;
    }

    public int t() {
        return this.j + this.i;
    }

    public synchronized boolean u() {
        return this.l != this.i;
    }

    public int v() {
        return u() ? this.b[r(this.l)] : this.r;
    }

    public synchronized int w(C5103hP c5103hP, C1016Gw c1016Gw, boolean z, boolean z2, Format format, a aVar) {
        if (!u()) {
            if (z2) {
                c1016Gw.r(4);
                return -4;
            }
            Format format2 = this.q;
            if (format2 == null || (!z && format2 == format)) {
                return -3;
            }
            c5103hP.a = format2;
            return -5;
        }
        int iR = r(this.l);
        if (!z && this.h[iR] == format) {
            if (c1016Gw.w()) {
                return -3;
            }
            c1016Gw.E = this.f[iR];
            c1016Gw.r(this.e[iR]);
            aVar.a = this.d[iR];
            aVar.b = this.c[iR];
            aVar.c = this.g[iR];
            this.l++;
            return -4;
        }
        c5103hP.a = this.h[iR];
        return -5;
    }

    public void x(boolean z) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.o = true;
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        if (z) {
            this.q = null;
            this.p = true;
        }
    }

    public synchronized void y() {
        this.l = 0;
    }

    public synchronized boolean z(int i) {
        int i2 = this.j;
        if (i2 > i || i > this.i + i2) {
            return false;
        }
        this.l = i - i2;
        return true;
    }
}
