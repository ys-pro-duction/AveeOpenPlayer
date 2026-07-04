package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.Vs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2584Vs0 {
    public byte[] a;
    public int b;
    public int c;

    public C2584Vs0() {
    }

    public int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int B() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    public long C() {
        long jQ = q();
        if (jQ >= 0) {
            return jQ;
        }
        throw new IllegalStateException("Top bit not zero: " + jQ);
    }

    public int D() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long E() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            byte b = this.a[this.b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i2;
        return j;
    }

    public void F() {
        this.b = 0;
        this.c = 0;
    }

    public void G(int i) {
        H(b() < i ? new byte[i] : this.a, i);
    }

    public void H(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void I(int i) {
        AbstractC7115ob.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void J(int i) {
        AbstractC7115ob.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void K(int i) {
        J(this.b + i);
    }

    public int a() {
        return this.c - this.b;
    }

    public int b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public char e() {
        byte[] bArr = this.a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public void f(C2480Us0 c2480Us0, int i) {
        g(c2480Us0.a, 0, i);
        c2480Us0.m(0);
    }

    public void g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public double h() {
        return Double.longBitsToDouble(q());
    }

    public int i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String k() {
        /*
            r6 = this;
            int r0 = r6.a()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r6.b
        La:
            int r1 = r6.c
            if (r0 >= r1) goto L1b
            byte[] r1 = r6.a
            r1 = r1[r0]
            boolean r1 = com.daaw.AbstractC6280lb1.J(r1)
            if (r1 != 0) goto L1b
            int r0 = r0 + 1
            goto La
        L1b:
            int r1 = r6.b
            int r2 = r0 - r1
            r3 = 3
            if (r2 < r3) goto L3d
            byte[] r2 = r6.a
            r4 = r2[r1]
            r5 = -17
            if (r4 != r5) goto L3d
            int r4 = r1 + 1
            r4 = r2[r4]
            r5 = -69
            if (r4 != r5) goto L3d
            int r4 = r1 + 2
            r2 = r2[r4]
            r4 = -65
            if (r2 != r4) goto L3d
            int r1 = r1 + r3
            r6.b = r1
        L3d:
            byte[] r1 = r6.a
            int r2 = r6.b
            int r3 = r0 - r2
            java.lang.String r1 = com.daaw.AbstractC6280lb1.q(r1, r2, r3)
            r6.b = r0
            int r2 = r6.c
            if (r0 != r2) goto L4e
            goto L69
        L4e:
            byte[] r3 = r6.a
            r4 = r3[r0]
            r5 = 13
            if (r4 != r5) goto L5d
            int r0 = r0 + 1
            r6.b = r0
            if (r0 != r2) goto L5d
            goto L69
        L5d:
            int r0 = r6.b
            r2 = r3[r0]
            r3 = 10
            if (r2 != r3) goto L69
            int r0 = r0 + 1
            r6.b = r0
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2584Vs0.k():java.lang.String");
    }

    public int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public long n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public int o() {
        int iL = l();
        if (iL >= 0) {
            return iL;
        }
        throw new IllegalStateException("Top bit not zero: " + iL);
    }

    public int p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public String r() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String strQ = AbstractC6280lb1.q(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return strQ;
    }

    public String s(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String strQ = AbstractC6280lb1.q(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return strQ;
    }

    public short t() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String u(int i) {
        return v(i, Charset.forName("UTF-8"));
    }

    public String v(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int w() {
        return (x() << 21) | (x() << 14) | (x() << 7) | x();
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int y() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public long z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public C2584Vs0(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public C2584Vs0(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public C2584Vs0(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
