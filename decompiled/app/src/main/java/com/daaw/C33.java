package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class C33 extends E33 {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public /* synthetic */ C33(InputStream inputStream, int i, B33 b33) {
        super(null);
        this.l = Integer.MAX_VALUE;
        Charset charset = AbstractC8374t43.a;
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    private final void E() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    @Override // com.daaw.E33
    public final String A() throws IOException {
        byte[] bArrH;
        int iL = L();
        int i = this.i;
        int i2 = this.g;
        if (iL <= i2 - i && iL > 0) {
            bArrH = this.f;
            this.i = i + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            i = 0;
            if (iL <= i2) {
                F(iL);
                bArrH = this.f;
                this.i = iL;
            } else {
                bArrH = H(iL, false);
            }
        }
        return P53.h(bArrH, i, iL);
    }

    @Override // com.daaw.E33
    public final void B(int i) throws C8939v43 {
        if (this.j != i) {
            throw C8939v43.b();
        }
    }

    public final void C(int i) throws C8939v43 {
        int i2 = this.g;
        int i3 = this.i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        if (i < 0) {
            throw C8939v43.f();
        }
        int i5 = this.k;
        int i6 = i5 + i3;
        int i7 = this.l;
        if (i6 + i > i7) {
            C((i7 - i5) - i3);
            throw C8939v43.j();
        }
        this.k = i6;
        this.g = 0;
        this.i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.e.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.e.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (C8939v43 e) {
                    e.k();
                    throw e;
                }
            } catch (Throwable th) {
                this.k += i4;
                E();
                throw th;
            }
        }
        this.k += i4;
        E();
        if (i4 >= i) {
            return;
        }
        int i8 = this.g;
        int i9 = i8 - this.i;
        this.i = i8;
        F(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.g;
            if (i10 <= i11) {
                this.i = i10;
                return;
            } else {
                i9 += i11;
                this.i = i11;
                F(1);
            }
        }
    }

    public final List D(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C8939v43.j();
                }
                this.k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void F(int i) throws C8939v43 {
        if (G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.k) - this.i) {
            throw C8939v43.j();
        }
        throw C8939v43.i();
    }

    public final boolean G(int i) throws IOException {
        int i2 = this.i;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.k;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.f;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.k + i2;
            this.k = i5;
            i4 = this.g - i2;
            this.g = i4;
            this.i = 0;
        }
        try {
            int i6 = this.e.read(this.f, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (i6 == 0 || i6 < -1 || i6 > 4096) {
                throw new IllegalStateException(String.valueOf(this.e.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 <= 0) {
                return false;
            }
            this.g += i6;
            E();
            if (this.g >= i) {
                return true;
            }
            return G(i);
        } catch (C8939v43 e) {
            e.k();
            throw e;
        }
    }

    public final byte[] H(int i, boolean z) throws IOException {
        byte[] bArrI = I(i);
        if (bArrI != null) {
            return bArrI;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        List<byte[]> listD = D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        for (byte[] bArr2 : listD) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return AbstractC8374t43.d;
        }
        if (i < 0) {
            throw C8939v43.f();
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw C8939v43.i();
        }
        int i5 = this.l;
        if (i4 > i5) {
            C((i5 - i2) - i3);
            throw C8939v43.j();
        }
        int i6 = this.g - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.e.available()) {
                    return null;
                }
            } catch (C8939v43 e) {
                e.k();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i6);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i6 < i) {
            try {
                int i8 = this.e.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C8939v43.j();
                }
                this.k += i8;
                i6 += i8;
            } catch (C8939v43 e2) {
                e2.k();
                throw e2;
            }
        }
        return bArr;
    }

    public final byte J() throws C8939v43 {
        if (this.i == this.g) {
            F(1);
        }
        byte[] bArr = this.f;
        int i = this.i;
        this.i = i + 1;
        return bArr[i];
    }

    public final int K() throws C8939v43 {
        int i = this.i;
        if (this.g - i < 4) {
            F(4);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final int L() {
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.i = i5;
                return i;
            }
        }
        return (int) O();
    }

    public final long M() throws C8939v43 {
        int i = this.i;
        if (this.g - i < 8) {
            F(8);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long N() {
        /*
            r13 = this;
            int r0 = r13.i
            int r1 = r13.g
            if (r1 != r0) goto L8
            goto Lbf
        L8:
            byte[] r2 = r13.f
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r13.i = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto Lbf
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L27
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            long r2 = (long) r0
            goto Lbc
        L27:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            if (r1 < 0) goto L36
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r2 = (long) r0
        L33:
            r1 = r4
            goto Lbc
        L36:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L49
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            r11 = r0
            r1 = r3
            r2 = r11
            goto Lbc
        L49:
            int r4 = r0 + 5
            r3 = r2[r3]
            long r5 = (long) r3
            long r7 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r5 = r5 ^ r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L5f
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r2 = r5 ^ r0
            goto L33
        L5f:
            int r1 = r0 + 6
            r3 = r2[r4]
            long r3 = (long) r3
            r9 = 35
            long r3 = r3 << r9
            long r3 = r3 ^ r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L71:
            long r3 = r3 ^ r5
        L72:
            r2 = r3
            goto Lbc
        L74:
            int r5 = r0 + 7
            r1 = r2[r1]
            long r9 = (long) r1
            r1 = 42
            long r9 = r9 << r1
            long r3 = r3 ^ r9
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L8a
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r0 = r0 ^ r3
            r2 = r0
        L88:
            r1 = r5
            goto Lbc
        L8a:
            int r1 = r0 + 8
            r5 = r2[r5]
            long r5 = (long) r5
            r9 = 49
            long r5 = r5 << r9
            long r3 = r3 ^ r5
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L9d
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L71
        L9d:
            int r5 = r0 + 9
            r1 = r2[r1]
            long r9 = (long) r1
            r1 = 56
            long r9 = r9 << r1
            long r3 = r3 ^ r9
            r9 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r9
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto Lba
            int r1 = r0 + 10
            r0 = r2[r5]
            long r5 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto Lbf
            goto L72
        Lba:
            r2 = r3
            goto L88
        Lbc:
            r13.i = r1
            return r2
        Lbf:
            long r0 = r13.O()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C33.N():long");
    }

    public final long O() throws C8939v43 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bJ = J();
            j |= ((long) (bJ & 127)) << i;
            if ((bJ & 128) == 0) {
                return j;
            }
        }
        throw C8939v43.e();
    }

    @Override // com.daaw.E33
    public final void a(int i) {
        this.l = i;
        E();
    }

    @Override // com.daaw.E33
    public final boolean b() {
        return this.i == this.g && !G(1);
    }

    @Override // com.daaw.E33
    public final boolean c() {
        return N() != 0;
    }

    @Override // com.daaw.E33
    public final boolean d(int i) throws C8939v43 {
        int iR;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.g - this.i < 10) {
                while (i3 < 10) {
                    if (J() < 0) {
                        i3++;
                    }
                }
                throw C8939v43.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.f;
                int i4 = this.i;
                this.i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw C8939v43.e();
            return true;
        }
        if (i2 == 1) {
            C(8);
            return true;
        }
        if (i2 == 2) {
            C(L());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw C8939v43.a();
            }
            C(4);
            return true;
        }
        do {
            iR = r();
            if (iR == 0) {
                break;
            }
        } while (d(iR));
        B(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.daaw.E33
    public final double i() {
        return Double.longBitsToDouble(M());
    }

    @Override // com.daaw.E33
    public final float j() {
        return Float.intBitsToFloat(K());
    }

    @Override // com.daaw.E33
    public final int k() {
        return this.k + this.i;
    }

    @Override // com.daaw.E33
    public final int l(int i) throws C8939v43 {
        if (i < 0) {
            throw C8939v43.f();
        }
        int i2 = this.k + this.i;
        int i3 = this.l;
        int i4 = i + i2;
        if (i4 > i3) {
            throw C8939v43.j();
        }
        this.l = i4;
        E();
        return i3;
    }

    @Override // com.daaw.E33
    public final int m() {
        return L();
    }

    @Override // com.daaw.E33
    public final int n() {
        return K();
    }

    @Override // com.daaw.E33
    public final int o() {
        return L();
    }

    @Override // com.daaw.E33
    public final int p() {
        return K();
    }

    @Override // com.daaw.E33
    public final int q() {
        return E33.e(L());
    }

    @Override // com.daaw.E33
    public final int r() throws C8939v43 {
        if (b()) {
            this.j = 0;
            return 0;
        }
        int iL = L();
        this.j = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw C8939v43.c();
    }

    @Override // com.daaw.E33
    public final int s() {
        return L();
    }

    @Override // com.daaw.E33
    public final long t() {
        return M();
    }

    @Override // com.daaw.E33
    public final long u() {
        return N();
    }

    @Override // com.daaw.E33
    public final long v() {
        return M();
    }

    @Override // com.daaw.E33
    public final long w() {
        return E33.f(N());
    }

    @Override // com.daaw.E33
    public final long x() {
        return N();
    }

    @Override // com.daaw.E33
    public final AbstractC9213w33 y() throws IOException {
        int iL = L();
        int i = this.g;
        int i2 = this.i;
        if (iL <= i - i2 && iL > 0) {
            AbstractC9213w33 abstractC9213w33T = AbstractC9213w33.T(this.f, i2, iL);
            this.i += iL;
            return abstractC9213w33T;
        }
        if (iL == 0) {
            return AbstractC9213w33.C;
        }
        byte[] bArrI = I(iL);
        if (bArrI != null) {
            return AbstractC9213w33.T(bArrI, 0, bArrI.length);
        }
        int i3 = this.i;
        int i4 = this.g;
        int i5 = i4 - i3;
        this.k += i4;
        this.i = 0;
        this.g = 0;
        List<byte[]> listD = D(iL - i5);
        byte[] bArr = new byte[iL];
        System.arraycopy(this.f, i3, bArr, 0, i5);
        for (byte[] bArr2 : listD) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new C8090s33(bArr);
    }

    @Override // com.daaw.E33
    public final String z() throws C8939v43 {
        int iL = L();
        if (iL > 0) {
            int i = this.g;
            int i2 = this.i;
            if (iL <= i - i2) {
                String str = new String(this.f, i2, iL, AbstractC8374t43.b);
                this.i += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL > this.g) {
            return new String(H(iL, false), AbstractC8374t43.b);
        }
        F(iL);
        String str2 = new String(this.f, this.i, iL, AbstractC8374t43.b);
        this.i += iL;
        return str2;
    }
}
