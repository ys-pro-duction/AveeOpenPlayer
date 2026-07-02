package com.daaw;

import com.daaw.InterfaceC2026Qj0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9687xm {
    public int d;
    public final InputStream f;
    public int g;
    public int k;
    public boolean h = false;
    public int j = Integer.MAX_VALUE;
    public int l = 64;
    public int m = 67108864;
    public final byte[] a = new byte[4096];
    public int c = 0;
    public int e = 0;
    public int i = 0;
    public final boolean b = false;

    public C9687xm(InputStream inputStream) {
        this.f = inputStream;
    }

    public static int A(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw Q10.k();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw Q10.k();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw Q10.f();
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C9687xm g(InputStream inputStream) {
        return new C9687xm(inputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r7] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long B() {
        /*
            r10 = this;
            int r0 = r10.e
            int r1 = r10.c
            if (r1 != r0) goto L8
            goto Lb6
        L8:
            byte[] r2 = r10.a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r10.e = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb6
        L1b:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r3 = r3 ^ r5
            goto Lbb
        L2e:
            int r7 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L40
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r3 = r3 ^ r0
        L3d:
            r1 = r7
            goto Lbb
        L40:
            int r1 = r0 + 4
            r7 = r2[r7]
            int r7 = r7 << 21
            long r7 = (long) r7
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L50
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L50:
            int r7 = r0 + 5
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L61
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L61:
            int r1 = r0 + 6
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 35
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L74:
            int r7 = r0 + 7
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L87
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L87:
            int r1 = r0 + 8
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 49
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L9a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9a:
            int r7 = r0 + 9
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3d
            int r1 = r0 + 10
            r0 = r2[r7]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbb
        Lb6:
            long r0 = r10.C()
            return r0
        Lbb:
            r10.e = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9687xm.B():long");
    }

    public long C() throws Q10 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bV = v();
            j |= ((long) (bV & 127)) << i;
            if ((bV & 128) == 0) {
                return j;
            }
        }
        throw Q10.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int iZ = z();
        int i = this.c;
        int i2 = this.e;
        if (iZ > i - i2 || iZ <= 0) {
            return iZ == 0 ? "" : new String(w(iZ), "UTF-8");
        }
        String str = new String(this.a, i2, iZ, "UTF-8");
        this.e += iZ;
        return str;
    }

    public String I() throws Q10 {
        byte[] bArrW;
        int iZ = z();
        int i = this.e;
        if (iZ <= this.c - i && iZ > 0) {
            bArrW = this.a;
            this.e = i + iZ;
        } else {
            if (iZ == 0) {
                return "";
            }
            bArrW = w(iZ);
            i = 0;
        }
        if (AbstractC3750cb1.f(bArrW, i, i + iZ)) {
            return new String(bArrW, i, iZ, "UTF-8");
        }
        throw Q10.d();
    }

    public int J() throws Q10 {
        if (f()) {
            this.g = 0;
            return 0;
        }
        int iZ = z();
        this.g = iZ;
        if (AbstractC6315li1.a(iZ) != 0) {
            return this.g;
        }
        throw Q10.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public final void M() {
        int i = this.c + this.d;
        this.c = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.d = 0;
            return;
        }
        int i4 = i2 - i3;
        this.d = i4;
        this.c = i - i4;
    }

    public final void N(int i) throws Q10 {
        if (!S(i)) {
            throw Q10.k();
        }
    }

    public boolean O(int i, C0343Am c0343Am) throws IOException {
        int iB = AbstractC6315li1.b(i);
        if (iB == 0) {
            long jS = s();
            c0343Am.n0(i);
            c0343Am.y0(jS);
            return true;
        }
        if (iB == 1) {
            long jY = y();
            c0343Am.n0(i);
            c0343Am.U(jY);
            return true;
        }
        if (iB == 2) {
            AbstractC4629fi abstractC4629fiK = k();
            c0343Am.n0(i);
            c0343Am.O(abstractC4629fiK);
            return true;
        }
        if (iB == 3) {
            c0343Am.n0(i);
            P(c0343Am);
            int iC = AbstractC6315li1.c(AbstractC6315li1.a(i), 4);
            a(iC);
            c0343Am.n0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw Q10.e();
        }
        int iX = x();
        c0343Am.n0(i);
        c0343Am.T(iX);
        return true;
    }

    public void P(C0343Am c0343Am) throws Q10 {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
        } while (O(iJ, c0343Am));
    }

    public void Q(int i) throws Q10 {
        int i2 = this.c;
        int i3 = this.e;
        if (i > i2 - i3 || i < 0) {
            R(i);
        } else {
            this.e = i3 + i;
        }
    }

    public final void R(int i) throws Q10 {
        if (i < 0) {
            throw Q10.g();
        }
        int i2 = this.i;
        int i3 = this.e;
        int i4 = i2 + i3 + i;
        int i5 = this.j;
        if (i4 > i5) {
            Q((i5 - i2) - i3);
            throw Q10.k();
        }
        int i6 = this.c;
        int i7 = i6 - i3;
        this.e = i6;
        N(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.c;
            if (i8 <= i9) {
                this.e = i8;
                return;
            } else {
                i7 += i9;
                this.e = i9;
                N(1);
            }
        }
    }

    public final boolean S(int i) throws IOException {
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.c;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.i + i2 + i <= this.j && this.f != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.a;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.i += i2;
                this.c -= i2;
                this.e = 0;
            }
            InputStream inputStream = this.f;
            byte[] bArr2 = this.a;
            int i5 = this.c;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.a.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.c += i6;
                if ((this.i + i) - this.m > 0) {
                    throw Q10.j();
                }
                M();
                if (this.c >= i) {
                    return true;
                }
                return S(i);
            }
        }
        return false;
    }

    public void a(int i) throws Q10 {
        if (this.g != i) {
            throw Q10.b();
        }
    }

    public final void d(int i) throws Q10 {
        if (this.c - this.e < i) {
            N(i);
        }
    }

    public int e() {
        int i = this.j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.i + this.e);
    }

    public boolean f() {
        return this.e == this.c && !S(1);
    }

    public void h(int i) {
        this.j = i;
        M();
    }

    public int i(int i) throws Q10 {
        if (i < 0) {
            throw Q10.g();
        }
        int i2 = i + this.i + this.e;
        int i3 = this.j;
        if (i2 > i3) {
            throw Q10.k();
        }
        this.j = i2;
        M();
        return i3;
    }

    public boolean j() {
        return B() != 0;
    }

    public AbstractC4629fi k() {
        int iZ = z();
        int i = this.c;
        int i2 = this.e;
        if (iZ > i - i2 || iZ <= 0) {
            return iZ == 0 ? AbstractC4629fi.B : new C9917yc0(w(iZ));
        }
        AbstractC4629fi c8534tg = (this.b && this.h) ? new C8534tg(this.a, this.e, iZ) : AbstractC4629fi.s(this.a, i2, iZ);
        this.e += iZ;
        return c8534tg;
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i, InterfaceC2026Qj0.a aVar, C6763nJ c6763nJ) throws Q10 {
        int i2 = this.k;
        if (i2 >= this.l) {
            throw Q10.h();
        }
        this.k = i2 + 1;
        aVar.N(this, c6763nJ);
        a(AbstractC6315li1.c(i, 4));
        this.k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public InterfaceC2026Qj0 t(InterfaceC2792Xs0 interfaceC2792Xs0, C6763nJ c6763nJ) throws Q10 {
        int iZ = z();
        if (this.k >= this.l) {
            throw Q10.h();
        }
        int i = i(iZ);
        this.k++;
        InterfaceC2026Qj0 interfaceC2026Qj0 = (InterfaceC2026Qj0) interfaceC2792Xs0.c(this, c6763nJ);
        a(0);
        this.k--;
        h(i);
        return interfaceC2026Qj0;
    }

    public void u(InterfaceC2026Qj0.a aVar, C6763nJ c6763nJ) throws Q10 {
        int iZ = z();
        if (this.k >= this.l) {
            throw Q10.h();
        }
        int i = i(iZ);
        this.k++;
        aVar.N(this, c6763nJ);
        a(0);
        this.k--;
        h(i);
    }

    public byte v() throws Q10 {
        if (this.e == this.c) {
            N(1);
        }
        byte[] bArr = this.a;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }

    public final byte[] w(int i) throws Q10 {
        if (i <= 0) {
            if (i == 0) {
                return AbstractC3595c10.a;
            }
            throw Q10.g();
        }
        int i2 = this.i;
        int i3 = this.e;
        int i4 = i2 + i3 + i;
        int i5 = this.j;
        if (i4 > i5) {
            Q((i5 - i2) - i3);
            throw Q10.k();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i6 = this.c - i3;
            System.arraycopy(this.a, i3, bArr, 0, i6);
            this.e = this.c;
            int i7 = i - i6;
            d(i7);
            System.arraycopy(this.a, 0, bArr, i6, i7);
            this.e = i7;
            return bArr;
        }
        int i8 = this.c;
        this.i = i2 + i8;
        this.e = 0;
        this.c = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw Q10.k();
                }
                this.i += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.a, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public int x() throws Q10 {
        int i = this.e;
        if (this.c - i < 4) {
            N(4);
            i = this.e;
        }
        byte[] bArr = this.a;
        this.e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public long y() throws Q10 {
        int i = this.e;
        if (this.c - i < 8) {
            N(8);
            i = this.e;
        }
        byte[] bArr = this.a;
        this.e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public int z() {
        int i;
        int i2 = this.e;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.e = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
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
                this.e = i5;
                return i;
            }
        }
        return (int) C();
    }
}
