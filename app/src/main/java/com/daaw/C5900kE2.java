package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.kE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5900kE2 {
    public static final TP2 d = TP2.M(UN2.a, UN2.c, UN2.f, UN2.d, UN2.e);
    public byte[] a;
    public int b;
    public int c;

    public C5900kE2(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final long A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long B() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.b = i8;
        long j7 = bArr[i7];
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long C() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long D() {
        long jB = B();
        if (jB >= 0) {
            return jB;
        }
        throw new IllegalStateException("Top bit not zero: " + jB);
    }

    public final long E() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.a[this.b + i2];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i;
        return j;
    }

    public final String F(char c) {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        String strK = AbstractC9004vJ2.K(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return strK;
    }

    public final String G(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String strK = AbstractC9004vJ2.K(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return strK;
    }

    public final String H(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final short I() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void b(GD2 gd2, int i) {
        c(gd2.a, 0, i);
        gd2.j(0);
    }

    public final void c(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void d(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        e(bArr, i);
    }

    public final void e(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        AbstractC6048km2.d(z);
        this.c = i;
    }

    public final void g(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        AbstractC6048km2.d(z);
        this.b = i;
    }

    public final void h(int i) {
        g(this.b + i);
    }

    public final byte[] i() {
        return this.a;
    }

    public final int j() {
        return this.c - this.b;
    }

    public final int k() {
        return this.a.length;
    }

    public final int l() {
        return this.b;
    }

    public final int m() {
        return this.c;
    }

    public final int n() {
        return this.a[this.b] & 255;
    }

    public final int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int r() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public final int s() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        int i4 = bArr[i2] & 255;
        this.b = i + 4;
        return i4 | (i3 << 8);
    }

    public final int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int x() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        throw new IllegalStateException("Top bit not zero: " + iO);
    }

    public final int y() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.b = i8;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48);
    }

    public C5900kE2() {
        this.a = AbstractC9004vJ2.f;
    }

    public C5900kE2(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public C5900kE2(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
