package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.y33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9771y33 extends E33 {
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public int j;
    public int k;

    public /* synthetic */ C9771y33(byte[] bArr, int i, int i2, boolean z, AbstractC9492x33 abstractC9492x33) {
        super(null);
        this.k = Integer.MAX_VALUE;
        this.e = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
    }

    @Override // com.daaw.E33
    public final String A() throws C8939v43 {
        int iG = G();
        if (iG > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iG <= i - i2) {
                String strH = P53.h(this.e, i2, iG);
                this.h += iG;
                return strH;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw C8939v43.f();
        }
        throw C8939v43.j();
    }

    @Override // com.daaw.E33
    public final void B(int i) throws C8939v43 {
        if (this.j != i) {
            throw C8939v43.b();
        }
    }

    public final void C(int i) throws C8939v43 {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw C8939v43.j();
        }
        throw C8939v43.f();
    }

    public final void D() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final byte E() throws C8939v43 {
        int i = this.h;
        if (i == this.f) {
            throw C8939v43.j();
        }
        byte[] bArr = this.e;
        this.h = i + 1;
        return bArr[i];
    }

    public final int F() throws C8939v43 {
        int i = this.h;
        if (this.f - i < 4) {
            throw C8939v43.j();
        }
        byte[] bArr = this.e;
        this.h = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final int G() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            byte[] bArr = this.e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) J();
    }

    public final long H() throws C8939v43 {
        int i = this.h;
        if (this.f - i < 8) {
            throw C8939v43.j();
        }
        byte[] bArr = this.e;
        this.h = i + 8;
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
    public final long I() {
        /*
            r13 = this;
            int r0 = r13.h
            int r1 = r13.f
            if (r1 != r0) goto L8
            goto Lbf
        L8:
            byte[] r2 = r13.e
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r13.h = r3
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
            r13.h = r1
            return r2
        Lbf:
            long r0 = r13.J()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9771y33.I():long");
    }

    public final long J() throws C8939v43 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bE = E();
            j |= ((long) (bE & 127)) << i;
            if ((bE & 128) == 0) {
                return j;
            }
        }
        throw C8939v43.e();
    }

    @Override // com.daaw.E33
    public final void a(int i) {
        this.k = i;
        D();
    }

    @Override // com.daaw.E33
    public final boolean b() {
        return this.h == this.f;
    }

    @Override // com.daaw.E33
    public final boolean c() {
        return I() != 0;
    }

    @Override // com.daaw.E33
    public final boolean d(int i) throws C8939v43 {
        int iR;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f - this.h < 10) {
                while (i3 < 10) {
                    if (E() < 0) {
                        i3++;
                    }
                }
                throw C8939v43.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.e;
                int i4 = this.h;
                this.h = i4 + 1;
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
            C(G());
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
        return Double.longBitsToDouble(H());
    }

    @Override // com.daaw.E33
    public final float j() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.daaw.E33
    public final int k() {
        return this.h - this.i;
    }

    @Override // com.daaw.E33
    public final int l(int i) {
        if (i < 0) {
            throw C8939v43.f();
        }
        int i2 = i + (this.h - this.i);
        if (i2 < 0) {
            throw C8939v43.g();
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw C8939v43.j();
        }
        this.k = i2;
        D();
        return i3;
    }

    @Override // com.daaw.E33
    public final int m() {
        return G();
    }

    @Override // com.daaw.E33
    public final int n() {
        return F();
    }

    @Override // com.daaw.E33
    public final int o() {
        return G();
    }

    @Override // com.daaw.E33
    public final int p() {
        return F();
    }

    @Override // com.daaw.E33
    public final int q() {
        return E33.e(G());
    }

    @Override // com.daaw.E33
    public final int r() throws C8939v43 {
        if (b()) {
            this.j = 0;
            return 0;
        }
        int iG = G();
        this.j = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw C8939v43.c();
    }

    @Override // com.daaw.E33
    public final int s() {
        return G();
    }

    @Override // com.daaw.E33
    public final long t() {
        return H();
    }

    @Override // com.daaw.E33
    public final long u() {
        return I();
    }

    @Override // com.daaw.E33
    public final long v() {
        return H();
    }

    @Override // com.daaw.E33
    public final long w() {
        return E33.f(I());
    }

    @Override // com.daaw.E33
    public final long x() {
        return I();
    }

    @Override // com.daaw.E33
    public final AbstractC9213w33 y() throws C8939v43 {
        int iG = G();
        if (iG > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iG <= i - i2) {
                AbstractC9213w33 abstractC9213w33T = AbstractC9213w33.T(this.e, i2, iG);
                this.h += iG;
                return abstractC9213w33T;
            }
        }
        if (iG == 0) {
            return AbstractC9213w33.C;
        }
        if (iG > 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (iG <= i3 - i4) {
                int i5 = iG + i4;
                this.h = i5;
                return new C8090s33(Arrays.copyOfRange(this.e, i4, i5));
            }
        }
        if (iG <= 0) {
            throw C8939v43.f();
        }
        throw C8939v43.j();
    }

    @Override // com.daaw.E33
    public final String z() throws C8939v43 {
        int iG = G();
        if (iG > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iG <= i - i2) {
                String str = new String(this.e, i2, iG, AbstractC8374t43.b);
                this.h += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw C8939v43.f();
        }
        throw C8939v43.j();
    }
}
