package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9408wm {
    public static volatile int f = 100;
    public int a;
    public int b;
    public int c;
    public C9966ym d;
    public boolean e;

    /* JADX INFO: renamed from: com.daaw.wm$b */
    public static final class b extends AbstractC9408wm {
        public final byte[] g;
        public final boolean h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;
        public int o;

        @Override // com.daaw.AbstractC9408wm
        public long A() {
            return AbstractC9408wm.c(N());
        }

        @Override // com.daaw.AbstractC9408wm
        public String B() throws P10 {
            int iM = M();
            if (iM > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iM <= i - i2) {
                    String str = new String(this.g, i2, iM, AbstractC3317b10.b);
                    this.k += iM;
                    return str;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw P10.g();
            }
            throw P10.n();
        }

        @Override // com.daaw.AbstractC9408wm
        public String C() throws P10 {
            int iM = M();
            if (iM > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iM <= i - i2) {
                    String strH = AbstractC3472bb1.h(this.g, i2, iM);
                    this.k += iM;
                    return strH;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM <= 0) {
                throw P10.g();
            }
            throw P10.n();
        }

        @Override // com.daaw.AbstractC9408wm
        public int D() throws P10 {
            if (e()) {
                this.m = 0;
                return 0;
            }
            int iM = M();
            this.m = iM;
            if (AbstractC6027ki1.a(iM) != 0) {
                return this.m;
            }
            throw P10.c();
        }

        @Override // com.daaw.AbstractC9408wm
        public int E() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public long F() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean H(int i) throws P10 {
            int iB = AbstractC6027ki1.b(i);
            if (iB == 0) {
                S();
                return true;
            }
            if (iB == 1) {
                R(8);
                return true;
            }
            if (iB == 2) {
                R(M());
                return true;
            }
            if (iB == 3) {
                Q();
                a(AbstractC6027ki1.c(AbstractC6027ki1.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw P10.e();
            }
            R(4);
            return true;
        }

        public byte I() throws P10 {
            int i = this.k;
            if (i == this.i) {
                throw P10.n();
            }
            byte[] bArr = this.g;
            this.k = i + 1;
            return bArr[i];
        }

        public byte[] J(int i) throws P10 {
            if (i > 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.k = i4;
                    return Arrays.copyOfRange(this.g, i3, i4);
                }
            }
            if (i > 0) {
                throw P10.n();
            }
            if (i == 0) {
                return AbstractC3317b10.d;
            }
            throw P10.g();
        }

        public int K() throws P10 {
            int i = this.k;
            if (this.i - i < 4) {
                throw P10.n();
            }
            byte[] bArr = this.g;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long L() throws P10 {
            int i = this.k;
            if (this.i - i < 8) {
                throw P10.n();
            }
            byte[] bArr = this.g;
            this.k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int M() {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
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
                    this.k = i5;
                    return i;
                }
            }
            return (int) O();
        }

        public long N() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return O();
        }

        public long O() throws P10 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bI = I();
                j |= ((long) (bI & 127)) << i;
                if ((bI & 128) == 0) {
                    return j;
                }
            }
            throw P10.f();
        }

        public final void P() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = i - this.l;
            int i3 = this.o;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        public void Q() throws P10 {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (H(iD));
        }

        public void R(int i) throws P10 {
            if (i >= 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    this.k = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw P10.n();
            }
            throw P10.g();
        }

        public final void S() throws P10 {
            if (this.i - this.k >= 10) {
                T();
            } else {
                U();
            }
        }

        public final void T() throws P10 {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        public final void U() throws P10 {
            for (int i = 0; i < 10; i++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        @Override // com.daaw.AbstractC9408wm
        public void a(int i) throws P10 {
            if (this.m != i) {
                throw P10.b();
            }
        }

        @Override // com.daaw.AbstractC9408wm
        public int d() {
            return this.k - this.l;
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean e() {
            return this.k == this.i;
        }

        @Override // com.daaw.AbstractC9408wm
        public void m(int i) {
            this.o = i;
            P();
        }

        @Override // com.daaw.AbstractC9408wm
        public int n(int i) throws P10 {
            if (i < 0) {
                throw P10.g();
            }
            int iD = i + d();
            if (iD < 0) {
                throw P10.h();
            }
            int i2 = this.o;
            if (iD > i2) {
                throw P10.n();
            }
            this.o = iD;
            P();
            return i2;
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean o() {
            return N() != 0;
        }

        @Override // com.daaw.AbstractC9408wm
        public AbstractC4340ei p() {
            int iM = M();
            if (iM > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iM <= i - i2) {
                    AbstractC4340ei abstractC4340eiE0 = (this.h && this.n) ? AbstractC4340ei.e0(this.g, i2, iM) : AbstractC4340ei.H(this.g, i2, iM);
                    this.k += iM;
                    return abstractC4340eiE0;
                }
            }
            return iM == 0 ? AbstractC4340ei.C : AbstractC4340ei.d0(J(iM));
        }

        @Override // com.daaw.AbstractC9408wm
        public double q() {
            return Double.longBitsToDouble(L());
        }

        @Override // com.daaw.AbstractC9408wm
        public int r() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public int s() {
            return K();
        }

        @Override // com.daaw.AbstractC9408wm
        public long t() {
            return L();
        }

        @Override // com.daaw.AbstractC9408wm
        public float u() {
            return Float.intBitsToFloat(K());
        }

        @Override // com.daaw.AbstractC9408wm
        public int v() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public long w() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public int x() {
            return K();
        }

        @Override // com.daaw.AbstractC9408wm
        public long y() {
            return L();
        }

        @Override // com.daaw.AbstractC9408wm
        public int z() {
            return AbstractC9408wm.b(M());
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.o = Integer.MAX_VALUE;
            this.g = bArr;
            this.i = i2 + i;
            this.k = i;
            this.l = i;
            this.h = z;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wm$c */
    public static final class c extends AbstractC9408wm {
        public final Iterable g;
        public final Iterator h;
        public ByteBuffer i;
        public final boolean j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public long r;
        public long s;
        public long t;
        public long u;

        private void R() {
            int i = this.l + this.m;
            this.l = i;
            int i2 = i - this.q;
            int i3 = this.n;
            if (i2 <= i3) {
                this.m = 0;
                return;
            }
            int i4 = i2 - i3;
            this.m = i4;
            this.l = i - i4;
        }

        private void V() throws P10 {
            for (int i = 0; i < 10; i++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        @Override // com.daaw.AbstractC9408wm
        public long A() {
            return AbstractC9408wm.c(P());
        }

        @Override // com.daaw.AbstractC9408wm
        public String B() throws P10 {
            int iO = O();
            if (iO > 0) {
                long j = iO;
                long j2 = this.u;
                long j3 = this.r;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[iO];
                    AbstractC3188aa1.p(j3, bArr, 0L, j);
                    String str = new String(bArr, AbstractC3317b10.b);
                    this.r += j;
                    return str;
                }
            }
            if (iO > 0 && iO <= S()) {
                byte[] bArr2 = new byte[iO];
                L(bArr2, 0, iO);
                return new String(bArr2, AbstractC3317b10.b);
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw P10.g();
            }
            throw P10.n();
        }

        @Override // com.daaw.AbstractC9408wm
        public String C() throws P10 {
            int iO = O();
            if (iO > 0) {
                long j = iO;
                long j2 = this.u;
                long j3 = this.r;
                if (j <= j2 - j3) {
                    String strG = AbstractC3472bb1.g(this.i, (int) (j3 - this.s), iO);
                    this.r += j;
                    return strG;
                }
            }
            if (iO >= 0 && iO <= S()) {
                byte[] bArr = new byte[iO];
                L(bArr, 0, iO);
                return AbstractC3472bb1.h(bArr, 0, iO);
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw P10.g();
            }
            throw P10.n();
        }

        @Override // com.daaw.AbstractC9408wm
        public int D() throws P10 {
            if (e()) {
                this.o = 0;
                return 0;
            }
            int iO = O();
            this.o = iO;
            if (AbstractC6027ki1.a(iO) != 0) {
                return this.o;
            }
            throw P10.c();
        }

        @Override // com.daaw.AbstractC9408wm
        public int E() {
            return O();
        }

        @Override // com.daaw.AbstractC9408wm
        public long F() {
            return P();
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean H(int i) throws P10 {
            int iB = AbstractC6027ki1.b(i);
            if (iB == 0) {
                V();
                return true;
            }
            if (iB == 1) {
                U(8);
                return true;
            }
            if (iB == 2) {
                U(O());
                return true;
            }
            if (iB == 3) {
                T();
                a(AbstractC6027ki1.c(AbstractC6027ki1.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw P10.e();
            }
            U(4);
            return true;
        }

        public final long I() {
            return this.u - this.r;
        }

        public final void J() throws P10 {
            if (!this.h.hasNext()) {
                throw P10.n();
            }
            X();
        }

        public byte K() throws P10 {
            if (I() == 0) {
                J();
            }
            long j = this.r;
            this.r = 1 + j;
            return AbstractC3188aa1.w(j);
        }

        public final void L(byte[] bArr, int i, int i2) throws P10 {
            if (i2 < 0 || i2 > S()) {
                if (i2 > 0) {
                    throw P10.n();
                }
                if (i2 != 0) {
                    throw P10.g();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (I() == 0) {
                    J();
                }
                int iMin = Math.min(i3, (int) I());
                long j = iMin;
                AbstractC3188aa1.p(this.r, bArr, (i2 - i3) + i, j);
                i3 -= iMin;
                this.r += j;
            }
        }

        public int M() {
            if (I() < 4) {
                return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24);
            }
            long j = this.r;
            this.r = 4 + j;
            return ((AbstractC3188aa1.w(j + 3) & 255) << 24) | (AbstractC3188aa1.w(j) & 255) | ((AbstractC3188aa1.w(1 + j) & 255) << 8) | ((AbstractC3188aa1.w(2 + j) & 255) << 16);
        }

        public long N() {
            if (I() < 8) {
                return (((long) K()) & 255) | ((((long) K()) & 255) << 8) | ((((long) K()) & 255) << 16) | ((((long) K()) & 255) << 24) | ((((long) K()) & 255) << 32) | ((((long) K()) & 255) << 40) | ((((long) K()) & 255) << 48) | ((((long) K()) & 255) << 56);
            }
            long j = this.r;
            this.r = 8 + j;
            return ((((long) AbstractC3188aa1.w(j + 7)) & 255) << 56) | ((((long) AbstractC3188aa1.w(6 + j)) & 255) << 48) | ((((long) AbstractC3188aa1.w(4 + j)) & 255) << 32) | ((((long) AbstractC3188aa1.w(2 + j)) & 255) << 16) | (((long) AbstractC3188aa1.w(j)) & 255) | ((((long) AbstractC3188aa1.w(1 + j)) & 255) << 8) | ((((long) AbstractC3188aa1.w(3 + j)) & 255) << 24) | ((((long) AbstractC3188aa1.w(5 + j)) & 255) << 40);
        }

        public int O() {
            int i;
            long j = this.r;
            if (this.u != j) {
                long j2 = j + 1;
                byte bW = AbstractC3188aa1.w(j);
                if (bW >= 0) {
                    this.r++;
                    return bW;
                }
                if (this.u - this.r >= 10) {
                    long j3 = 2 + j;
                    int iW = (AbstractC3188aa1.w(j2) << 7) ^ bW;
                    if (iW < 0) {
                        i = iW ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iW2 = (AbstractC3188aa1.w(j3) << 14) ^ iW;
                        if (iW2 >= 0) {
                            i = iW2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iW3 = iW2 ^ (AbstractC3188aa1.w(j4) << 21);
                            if (iW3 < 0) {
                                i = (-2080896) ^ iW3;
                            } else {
                                j4 = 5 + j;
                                byte bW2 = AbstractC3188aa1.w(j5);
                                int i2 = (iW3 ^ (bW2 << 28)) ^ 266354560;
                                if (bW2 < 0) {
                                    j5 = 6 + j;
                                    if (AbstractC3188aa1.w(j4) < 0) {
                                        j4 = 7 + j;
                                        if (AbstractC3188aa1.w(j5) < 0) {
                                            j5 = 8 + j;
                                            if (AbstractC3188aa1.w(j4) < 0) {
                                                j4 = 9 + j;
                                                if (AbstractC3188aa1.w(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (AbstractC3188aa1.w(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.r = j3;
                    return i;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j;
            long j2;
            long j3;
            long j4 = this.r;
            if (this.u != j4) {
                long j5 = j4 + 1;
                byte bW = AbstractC3188aa1.w(j4);
                if (bW >= 0) {
                    this.r++;
                    return bW;
                }
                if (this.u - this.r >= 10) {
                    long j6 = 2 + j4;
                    int iW = (AbstractC3188aa1.w(j5) << 7) ^ bW;
                    if (iW < 0) {
                        j = iW ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int iW2 = (AbstractC3188aa1.w(j6) << 14) ^ iW;
                        if (iW2 >= 0) {
                            j = iW2 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int iW3 = iW2 ^ (AbstractC3188aa1.w(j7) << 21);
                            if (iW3 < 0) {
                                j = (-2080896) ^ iW3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jW = (((long) AbstractC3188aa1.w(j8)) << 28) ^ ((long) iW3);
                                if (jW >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long jW2 = jW ^ (((long) AbstractC3188aa1.w(j9)) << 35);
                                    if (jW2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jW = jW2 ^ (((long) AbstractC3188aa1.w(j10)) << 42);
                                        if (jW >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            jW2 = jW ^ (((long) AbstractC3188aa1.w(j9)) << 49);
                                            if (jW2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jW3 = (jW2 ^ (((long) AbstractC3188aa1.w(j10)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (AbstractC3188aa1.w(j9) >= 0) {
                                                        j6 = j11;
                                                        j = jW3;
                                                    }
                                                } else {
                                                    j = jW3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jW2;
                                    j6 = j10;
                                }
                                j = j3 ^ jW;
                                j6 = j9;
                            }
                        }
                    }
                    this.r = j6;
                    return j;
                }
            }
            return Q();
        }

        public long Q() throws P10 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bK = K();
                j |= ((long) (bK & 127)) << i;
                if ((bK & 128) == 0) {
                    return j;
                }
            }
            throw P10.f();
        }

        public final int S() {
            return (int) ((((long) (this.l - this.p)) - this.r) + this.s);
        }

        public void T() throws P10 {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (H(iD));
        }

        public void U(int i) throws P10 {
            if (i < 0 || i > (((long) (this.l - this.p)) - this.r) + this.s) {
                if (i >= 0) {
                    throw P10.n();
                }
                throw P10.g();
            }
            while (i > 0) {
                if (I() == 0) {
                    J();
                }
                int iMin = Math.min(i, (int) I());
                i -= iMin;
                this.r += (long) iMin;
            }
        }

        public final ByteBuffer W(int i, int i2) {
            int iPosition = this.i.position();
            int iLimit = this.i.limit();
            ByteBuffer byteBuffer = this.i;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    return this.i.slice();
                } catch (IllegalArgumentException unused) {
                    throw P10.n();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        public final void X() {
            ByteBuffer byteBuffer = (ByteBuffer) this.h.next();
            this.i = byteBuffer;
            this.p += (int) (this.r - this.s);
            long jPosition = byteBuffer.position();
            this.r = jPosition;
            this.s = jPosition;
            this.u = this.i.limit();
            long jK = AbstractC3188aa1.k(this.i);
            this.t = jK;
            this.r += jK;
            this.s += jK;
            this.u += jK;
        }

        @Override // com.daaw.AbstractC9408wm
        public void a(int i) throws P10 {
            if (this.o != i) {
                throw P10.b();
            }
        }

        @Override // com.daaw.AbstractC9408wm
        public int d() {
            return (int) ((((long) (this.p - this.q)) + this.r) - this.s);
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean e() {
            return (((long) this.p) + this.r) - this.s == ((long) this.l);
        }

        @Override // com.daaw.AbstractC9408wm
        public void m(int i) {
            this.n = i;
            R();
        }

        @Override // com.daaw.AbstractC9408wm
        public int n(int i) throws P10 {
            if (i < 0) {
                throw P10.g();
            }
            int iD = i + d();
            int i2 = this.n;
            if (iD > i2) {
                throw P10.n();
            }
            this.n = iD;
            R();
            return i2;
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean o() {
            return P() != 0;
        }

        @Override // com.daaw.AbstractC9408wm
        public AbstractC4340ei p() throws P10 {
            int iO = O();
            if (iO > 0) {
                long j = iO;
                long j2 = this.u;
                long j3 = this.r;
                if (j <= j2 - j3) {
                    if (this.j && this.k) {
                        int i = (int) (j3 - this.t);
                        AbstractC4340ei abstractC4340eiC0 = AbstractC4340ei.c0(W(i, iO + i));
                        this.r += j;
                        return abstractC4340eiC0;
                    }
                    byte[] bArr = new byte[iO];
                    AbstractC3188aa1.p(j3, bArr, 0L, j);
                    this.r += j;
                    return AbstractC4340ei.d0(bArr);
                }
            }
            if (iO <= 0 || iO > S()) {
                if (iO == 0) {
                    return AbstractC4340ei.C;
                }
                if (iO < 0) {
                    throw P10.g();
                }
                throw P10.n();
            }
            if (!this.j || !this.k) {
                byte[] bArr2 = new byte[iO];
                L(bArr2, 0, iO);
                return AbstractC4340ei.d0(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iO > 0) {
                if (I() == 0) {
                    J();
                }
                int iMin = Math.min(iO, (int) I());
                int i2 = (int) (this.r - this.t);
                arrayList.add(AbstractC4340ei.c0(W(i2, i2 + iMin)));
                iO -= iMin;
                this.r += (long) iMin;
            }
            return AbstractC4340ei.F(arrayList);
        }

        @Override // com.daaw.AbstractC9408wm
        public double q() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.daaw.AbstractC9408wm
        public int r() {
            return O();
        }

        @Override // com.daaw.AbstractC9408wm
        public int s() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public long t() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public float u() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.daaw.AbstractC9408wm
        public int v() {
            return O();
        }

        @Override // com.daaw.AbstractC9408wm
        public long w() {
            return P();
        }

        @Override // com.daaw.AbstractC9408wm
        public int x() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public long y() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public int z() {
            return AbstractC9408wm.b(O());
        }

        public c(Iterable iterable, int i, boolean z) {
            super();
            this.n = Integer.MAX_VALUE;
            this.l = i;
            this.g = iterable;
            this.h = iterable.iterator();
            this.j = z;
            this.p = 0;
            this.q = 0;
            if (i != 0) {
                X();
                return;
            }
            this.i = AbstractC3317b10.e;
            this.r = 0L;
            this.s = 0L;
            this.u = 0L;
            this.t = 0L;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wm$d */
    public static final class d extends AbstractC9408wm {
        public final InputStream g;
        public final byte[] h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;

        public static int I(InputStream inputStream) throws P10 {
            try {
                return inputStream.available();
            } catch (P10 e) {
                e.j();
                throw e;
            }
        }

        public static int J(InputStream inputStream, byte[] bArr, int i, int i2) throws P10 {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (P10 e) {
                e.j();
                throw e;
            }
        }

        private void U() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = this.m + i;
            int i3 = this.n;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        public static long W(InputStream inputStream, long j) throws P10 {
            try {
                return inputStream.skip(j);
            } catch (P10 e) {
                e.j();
                throw e;
            }
        }

        private void a0() throws P10 {
            if (this.i - this.k >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() throws P10 {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.h;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        private void c0() throws P10 {
            for (int i = 0; i < 10; i++) {
                if (L() >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        @Override // com.daaw.AbstractC9408wm
        public long A() {
            return AbstractC9408wm.c(S());
        }

        @Override // com.daaw.AbstractC9408wm
        public String B() throws P10 {
            int iR = R();
            if (iR > 0) {
                int i = this.i;
                int i2 = this.k;
                if (iR <= i - i2) {
                    String str = new String(this.h, i2, iR, AbstractC3317b10.b);
                    this.k += iR;
                    return str;
                }
            }
            if (iR == 0) {
                return "";
            }
            if (iR > this.i) {
                return new String(M(iR, false), AbstractC3317b10.b);
            }
            V(iR);
            String str2 = new String(this.h, this.k, iR, AbstractC3317b10.b);
            this.k += iR;
            return str2;
        }

        @Override // com.daaw.AbstractC9408wm
        public String C() throws IOException {
            byte[] bArrM;
            int iR = R();
            int i = this.k;
            int i2 = this.i;
            if (iR <= i2 - i && iR > 0) {
                bArrM = this.h;
                this.k = i + iR;
            } else {
                if (iR == 0) {
                    return "";
                }
                i = 0;
                if (iR <= i2) {
                    V(iR);
                    bArrM = this.h;
                    this.k = iR;
                } else {
                    bArrM = M(iR, false);
                }
            }
            return AbstractC3472bb1.h(bArrM, i, iR);
        }

        @Override // com.daaw.AbstractC9408wm
        public int D() throws P10 {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int iR = R();
            this.l = iR;
            if (AbstractC6027ki1.a(iR) != 0) {
                return this.l;
            }
            throw P10.c();
        }

        @Override // com.daaw.AbstractC9408wm
        public int E() {
            return R();
        }

        @Override // com.daaw.AbstractC9408wm
        public long F() {
            return S();
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean H(int i) throws P10 {
            int iB = AbstractC6027ki1.b(i);
            if (iB == 0) {
                a0();
                return true;
            }
            if (iB == 1) {
                Y(8);
                return true;
            }
            if (iB == 2) {
                Y(R());
                return true;
            }
            if (iB == 3) {
                X();
                a(AbstractC6027ki1.c(AbstractC6027ki1.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw P10.e();
            }
            Y(4);
            return true;
        }

        public final AbstractC4340ei K(int i) throws IOException {
            byte[] bArrN = N(i);
            if (bArrN != null) {
                return AbstractC4340ei.G(bArrN);
            }
            int i2 = this.k;
            int i3 = this.i;
            int length = i3 - i2;
            this.m += i3;
            this.k = 0;
            this.i = 0;
            List<byte[]> listO = O(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, length);
            for (byte[] bArr2 : listO) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC4340ei.d0(bArr);
        }

        public byte L() throws P10 {
            if (this.k == this.i) {
                V(1);
            }
            byte[] bArr = this.h;
            int i = this.k;
            this.k = i + 1;
            return bArr[i];
        }

        public final byte[] M(int i, boolean z) throws IOException {
            byte[] bArrN = N(i);
            if (bArrN != null) {
                return z ? (byte[]) bArrN.clone() : bArrN;
            }
            int i2 = this.k;
            int i3 = this.i;
            int length = i3 - i2;
            this.m += i3;
            this.k = 0;
            this.i = 0;
            List<byte[]> listO = O(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, length);
            for (byte[] bArr2 : listO) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] N(int i) throws P10 {
            if (i == 0) {
                return AbstractC3317b10.d;
            }
            if (i < 0) {
                throw P10.g();
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw P10.l();
            }
            int i5 = this.n;
            if (i4 > i5) {
                Y((i5 - i2) - i3);
                throw P10.n();
            }
            int i6 = this.i - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > I(this.g)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, this.k, bArr, 0, i6);
            this.m += this.i;
            this.k = 0;
            this.i = 0;
            while (i6 < i) {
                int iJ = J(this.g, bArr, i6, i - i6);
                if (iJ == -1) {
                    throw P10.n();
                }
                this.m += iJ;
                i6 += iJ;
            }
            return bArr;
        }

        public final List O(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.g.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw P10.n();
                    }
                    this.m += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int P() throws P10 {
            int i = this.k;
            if (this.i - i < 4) {
                V(4);
                i = this.k;
            }
            byte[] bArr = this.h;
            this.k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long Q() throws P10 {
            int i = this.k;
            if (this.i - i < 8) {
                V(8);
                i = this.k;
            }
            byte[] bArr = this.h;
            this.k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int R() {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.h;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
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
                    this.k = i5;
                    return i;
                }
            }
            return (int) T();
        }

        public long S() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.h;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return T();
        }

        public long T() throws P10 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bL = L();
                j |= ((long) (bL & 127)) << i;
                if ((bL & 128) == 0) {
                    return j;
                }
            }
            throw P10.f();
        }

        public final void V(int i) throws P10 {
            if (d0(i)) {
                return;
            }
            if (i <= (this.c - this.m) - this.k) {
                throw P10.n();
            }
            throw P10.l();
        }

        public void X() throws P10 {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (H(iD));
        }

        public void Y(int i) throws P10 {
            int i2 = this.i;
            int i3 = this.k;
            if (i > i2 - i3 || i < 0) {
                Z(i);
            } else {
                this.k = i3 + i;
            }
        }

        public final void Z(int i) throws P10 {
            if (i < 0) {
                throw P10.g();
            }
            int i2 = this.m;
            int i3 = this.k;
            int i4 = i2 + i3 + i;
            int i5 = this.n;
            if (i4 > i5) {
                Y((i5 - i2) - i3);
                throw P10.n();
            }
            this.m = i2 + i3;
            int i6 = this.i - i3;
            this.i = 0;
            this.k = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jW = W(this.g, j);
                    if (jW < 0 || jW > j) {
                        throw new IllegalStateException(this.g.getClass() + "#skip returned invalid result: " + jW + "\nThe InputStream implementation is buggy.");
                    }
                    if (jW == 0) {
                        break;
                    } else {
                        i6 += (int) jW;
                    }
                } finally {
                    this.m += i6;
                    U();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i7 = this.i;
            int i8 = i7 - this.k;
            this.k = i7;
            V(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.i;
                if (i9 <= i10) {
                    this.k = i9;
                    return;
                } else {
                    i8 += i10;
                    this.k = i10;
                    V(1);
                }
            }
        }

        @Override // com.daaw.AbstractC9408wm
        public void a(int i) throws P10 {
            if (this.l != i) {
                throw P10.b();
            }
        }

        @Override // com.daaw.AbstractC9408wm
        public int d() {
            return this.m + this.k;
        }

        public final boolean d0(int i) throws P10 {
            int i2 = this.k;
            int i3 = i2 + i;
            int i4 = this.i;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.m;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.n) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.h;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.m += i2;
                this.i -= i2;
                this.k = 0;
            }
            InputStream inputStream = this.g;
            byte[] bArr2 = this.h;
            int i7 = this.i;
            int iJ = J(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.m) - i7));
            if (iJ == 0 || iJ < -1 || iJ > this.h.length) {
                throw new IllegalStateException(this.g.getClass() + "#read(byte[]) returned invalid result: " + iJ + "\nThe InputStream implementation is buggy.");
            }
            if (iJ <= 0) {
                return false;
            }
            this.i += iJ;
            U();
            if (this.i >= i) {
                return true;
            }
            return d0(i);
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean e() {
            return this.k == this.i && !d0(1);
        }

        @Override // com.daaw.AbstractC9408wm
        public void m(int i) {
            this.n = i;
            U();
        }

        @Override // com.daaw.AbstractC9408wm
        public int n(int i) throws P10 {
            if (i < 0) {
                throw P10.g();
            }
            int i2 = i + this.m + this.k;
            int i3 = this.n;
            if (i2 > i3) {
                throw P10.n();
            }
            this.n = i2;
            U();
            return i3;
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean o() {
            return S() != 0;
        }

        @Override // com.daaw.AbstractC9408wm
        public AbstractC4340ei p() {
            int iR = R();
            int i = this.i;
            int i2 = this.k;
            if (iR > i - i2 || iR <= 0) {
                return iR == 0 ? AbstractC4340ei.C : K(iR);
            }
            AbstractC4340ei abstractC4340eiH = AbstractC4340ei.H(this.h, i2, iR);
            this.k += iR;
            return abstractC4340eiH;
        }

        @Override // com.daaw.AbstractC9408wm
        public double q() {
            return Double.longBitsToDouble(Q());
        }

        @Override // com.daaw.AbstractC9408wm
        public int r() {
            return R();
        }

        @Override // com.daaw.AbstractC9408wm
        public int s() {
            return P();
        }

        @Override // com.daaw.AbstractC9408wm
        public long t() {
            return Q();
        }

        @Override // com.daaw.AbstractC9408wm
        public float u() {
            return Float.intBitsToFloat(P());
        }

        @Override // com.daaw.AbstractC9408wm
        public int v() {
            return R();
        }

        @Override // com.daaw.AbstractC9408wm
        public long w() {
            return S();
        }

        @Override // com.daaw.AbstractC9408wm
        public int x() {
            return P();
        }

        @Override // com.daaw.AbstractC9408wm
        public long y() {
            return Q();
        }

        @Override // com.daaw.AbstractC9408wm
        public int z() {
            return AbstractC9408wm.b(R());
        }

        public d(InputStream inputStream, int i) {
            super();
            this.n = Integer.MAX_VALUE;
            AbstractC3317b10.b(inputStream, "input");
            this.g = inputStream;
            this.h = new byte[i];
            this.i = 0;
            this.k = 0;
            this.m = 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wm$e */
    public static final class e extends AbstractC9408wm {
        public final ByteBuffer g;
        public final boolean h;
        public final long i;
        public long j;
        public long k;
        public long l;
        public int m;
        public int n;
        public boolean o;
        public int p;

        public static boolean J() {
            return AbstractC3188aa1.J();
        }

        private void Q() {
            long j = this.j + ((long) this.m);
            this.j = j;
            int i = (int) (j - this.l);
            int i2 = this.p;
            if (i <= i2) {
                this.m = 0;
                return;
            }
            int i3 = i - i2;
            this.m = i3;
            this.j = j - ((long) i3);
        }

        private int R() {
            return (int) (this.j - this.k);
        }

        private void U() throws P10 {
            if (R() >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws P10 {
            for (int i = 0; i < 10; i++) {
                long j = this.k;
                this.k = 1 + j;
                if (AbstractC3188aa1.w(j) >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        private void W() throws P10 {
            for (int i = 0; i < 10; i++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw P10.f();
        }

        @Override // com.daaw.AbstractC9408wm
        public long A() {
            return AbstractC9408wm.c(O());
        }

        @Override // com.daaw.AbstractC9408wm
        public String B() throws P10 {
            int iN = N();
            if (iN <= 0 || iN > R()) {
                if (iN == 0) {
                    return "";
                }
                if (iN < 0) {
                    throw P10.g();
                }
                throw P10.n();
            }
            byte[] bArr = new byte[iN];
            long j = iN;
            AbstractC3188aa1.p(this.k, bArr, 0L, j);
            String str = new String(bArr, AbstractC3317b10.b);
            this.k += j;
            return str;
        }

        @Override // com.daaw.AbstractC9408wm
        public String C() throws P10 {
            int iN = N();
            if (iN > 0 && iN <= R()) {
                String strG = AbstractC3472bb1.g(this.g, I(this.k), iN);
                this.k += (long) iN;
                return strG;
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw P10.g();
            }
            throw P10.n();
        }

        @Override // com.daaw.AbstractC9408wm
        public int D() throws P10 {
            if (e()) {
                this.n = 0;
                return 0;
            }
            int iN = N();
            this.n = iN;
            if (AbstractC6027ki1.a(iN) != 0) {
                return this.n;
            }
            throw P10.c();
        }

        @Override // com.daaw.AbstractC9408wm
        public int E() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public long F() {
            return O();
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean H(int i) throws P10 {
            int iB = AbstractC6027ki1.b(i);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                T(8);
                return true;
            }
            if (iB == 2) {
                T(N());
                return true;
            }
            if (iB == 3) {
                S();
                a(AbstractC6027ki1.c(AbstractC6027ki1.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw P10.e();
            }
            T(4);
            return true;
        }

        public final int I(long j) {
            return (int) (j - this.i);
        }

        public byte K() throws P10 {
            long j = this.k;
            if (j == this.j) {
                throw P10.n();
            }
            this.k = 1 + j;
            return AbstractC3188aa1.w(j);
        }

        public int L() throws P10 {
            long j = this.k;
            if (this.j - j < 4) {
                throw P10.n();
            }
            this.k = 4 + j;
            return ((AbstractC3188aa1.w(j + 3) & 255) << 24) | (AbstractC3188aa1.w(j) & 255) | ((AbstractC3188aa1.w(1 + j) & 255) << 8) | ((AbstractC3188aa1.w(2 + j) & 255) << 16);
        }

        public long M() throws P10 {
            long j = this.k;
            if (this.j - j < 8) {
                throw P10.n();
            }
            this.k = 8 + j;
            return ((((long) AbstractC3188aa1.w(j + 7)) & 255) << 56) | (((long) AbstractC3188aa1.w(j)) & 255) | ((((long) AbstractC3188aa1.w(1 + j)) & 255) << 8) | ((((long) AbstractC3188aa1.w(2 + j)) & 255) << 16) | ((((long) AbstractC3188aa1.w(3 + j)) & 255) << 24) | ((((long) AbstractC3188aa1.w(4 + j)) & 255) << 32) | ((((long) AbstractC3188aa1.w(5 + j)) & 255) << 40) | ((((long) AbstractC3188aa1.w(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.daaw.AbstractC3188aa1.w(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int N() {
            /*
                r10 = this;
                long r0 = r10.k
                long r2 = r10.j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.daaw.AbstractC3188aa1.w(r0)
                if (r4 < 0) goto L16
                r10.k = r2
                return r4
            L16:
                long r5 = r10.j
                long r5 = r5 - r2
                r7 = 9
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.daaw.AbstractC3188aa1.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.daaw.AbstractC3188aa1.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.daaw.AbstractC3188aa1.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.daaw.AbstractC3188aa1.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.daaw.AbstractC3188aa1.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.daaw.AbstractC3188aa1.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.daaw.AbstractC3188aa1.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.daaw.AbstractC3188aa1.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.daaw.AbstractC3188aa1.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r10.P()
                int r1 = (int) r0
                return r1
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r10.k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9408wm.e.N():int");
        }

        public long O() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.k;
            if (this.j != j4) {
                long j5 = 1 + j4;
                byte bW = AbstractC3188aa1.w(j4);
                if (bW >= 0) {
                    this.k = j5;
                    return bW;
                }
                if (this.j - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iW = (AbstractC3188aa1.w(j5) << 7) ^ bW;
                    if (iW >= 0) {
                        long j7 = 3 + j4;
                        int iW2 = iW ^ (AbstractC3188aa1.w(j6) << 14);
                        if (iW2 >= 0) {
                            j = iW2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iW3 = iW2 ^ (AbstractC3188aa1.w(j7) << 21);
                            if (iW3 < 0) {
                                i = (-2080896) ^ iW3;
                            } else {
                                long j8 = 5 + j4;
                                long jW = ((long) iW3) ^ (((long) AbstractC3188aa1.w(j6)) << 28);
                                if (jW >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jW2 = jW ^ (((long) AbstractC3188aa1.w(j8)) << 35);
                                    if (jW2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jW = jW2 ^ (((long) AbstractC3188aa1.w(j9)) << 42);
                                        if (jW >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jW2 = jW ^ (((long) AbstractC3188aa1.w(j8)) << 49);
                                            if (jW2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = 9 + j4;
                                                long jW3 = (jW2 ^ (((long) AbstractC3188aa1.w(j9)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (AbstractC3188aa1.w(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jW3;
                                                    }
                                                } else {
                                                    j = jW3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jW2;
                                    j6 = j9;
                                }
                                j = j3 ^ jW;
                                j6 = j8;
                            }
                        }
                        this.k = j6;
                        return j;
                    }
                    i = iW ^ (-128);
                    j = i;
                    this.k = j6;
                    return j;
                }
            }
            return P();
        }

        public long P() throws P10 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bK = K();
                j |= ((long) (bK & 127)) << i;
                if ((bK & 128) == 0) {
                    return j;
                }
            }
            throw P10.f();
        }

        public void S() throws P10 {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (H(iD));
        }

        public void T(int i) throws P10 {
            if (i >= 0 && i <= R()) {
                this.k += (long) i;
            } else {
                if (i >= 0) {
                    throw P10.n();
                }
                throw P10.g();
            }
        }

        public final ByteBuffer X(long j, long j2) {
            int iPosition = this.g.position();
            int iLimit = this.g.limit();
            ByteBuffer byteBuffer = this.g;
            try {
                try {
                    byteBuffer.position(I(j));
                    byteBuffer.limit(I(j2));
                    return this.g.slice();
                } catch (IllegalArgumentException e) {
                    P10 p10N = P10.n();
                    p10N.initCause(e);
                    throw p10N;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.daaw.AbstractC9408wm
        public void a(int i) throws P10 {
            if (this.n != i) {
                throw P10.b();
            }
        }

        @Override // com.daaw.AbstractC9408wm
        public int d() {
            return (int) (this.k - this.l);
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean e() {
            return this.k == this.j;
        }

        @Override // com.daaw.AbstractC9408wm
        public void m(int i) {
            this.p = i;
            Q();
        }

        @Override // com.daaw.AbstractC9408wm
        public int n(int i) throws P10 {
            if (i < 0) {
                throw P10.g();
            }
            int iD = i + d();
            int i2 = this.p;
            if (iD > i2) {
                throw P10.n();
            }
            this.p = iD;
            Q();
            return i2;
        }

        @Override // com.daaw.AbstractC9408wm
        public boolean o() {
            return O() != 0;
        }

        @Override // com.daaw.AbstractC9408wm
        public AbstractC4340ei p() throws P10 {
            int iN = N();
            if (iN <= 0 || iN > R()) {
                if (iN == 0) {
                    return AbstractC4340ei.C;
                }
                if (iN < 0) {
                    throw P10.g();
                }
                throw P10.n();
            }
            if (this.h && this.o) {
                long j = this.k;
                long j2 = iN;
                ByteBuffer byteBufferX = X(j, j + j2);
                this.k += j2;
                return AbstractC4340ei.c0(byteBufferX);
            }
            byte[] bArr = new byte[iN];
            long j3 = iN;
            AbstractC3188aa1.p(this.k, bArr, 0L, j3);
            this.k += j3;
            return AbstractC4340ei.d0(bArr);
        }

        @Override // com.daaw.AbstractC9408wm
        public double q() {
            return Double.longBitsToDouble(M());
        }

        @Override // com.daaw.AbstractC9408wm
        public int r() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public int s() {
            return L();
        }

        @Override // com.daaw.AbstractC9408wm
        public long t() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public float u() {
            return Float.intBitsToFloat(L());
        }

        @Override // com.daaw.AbstractC9408wm
        public int v() {
            return N();
        }

        @Override // com.daaw.AbstractC9408wm
        public long w() {
            return O();
        }

        @Override // com.daaw.AbstractC9408wm
        public int x() {
            return L();
        }

        @Override // com.daaw.AbstractC9408wm
        public long y() {
            return M();
        }

        @Override // com.daaw.AbstractC9408wm
        public int z() {
            return AbstractC9408wm.b(N());
        }

        public e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.p = Integer.MAX_VALUE;
            this.g = byteBuffer;
            long jK = AbstractC3188aa1.k(byteBuffer);
            this.i = jK;
            this.j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.k = jPosition;
            this.l = jPosition;
            this.h = z;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static AbstractC9408wm f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC9408wm g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? j(AbstractC3317b10.d) : new d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC9408wm h(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        int i = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new c(iterable, iRemaining, z) : f(new C5283i20(iterable));
    }

    public static AbstractC9408wm i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && e.J()) {
            return new e(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, iRemaining, true);
    }

    public static AbstractC9408wm j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC9408wm k(byte[] bArr, int i, int i2) {
        return l(bArr, i, i2, false);
    }

    public static AbstractC9408wm l(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.n(i2);
            return bVar;
        } catch (P10 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public final int G(int i) {
        if (i >= 0) {
            int i2 = this.c;
            this.c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public abstract boolean H(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void m(int i);

    public abstract int n(int i);

    public abstract boolean o();

    public abstract AbstractC4340ei p();

    public abstract double q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract int z();

    public AbstractC9408wm() {
        this.b = f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
