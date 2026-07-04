package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.fP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4546fP0 extends C4908gi {
    public final transient byte[][] G;
    public final transient int[] H;

    public C4546fP0(C4057dh c4057dh, int i) {
        super(null);
        AbstractC7675qb1.b(c4057dh.C, 0L, i);
        FO0 fo0 = c4057dh.B;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = fo0.c;
            int i6 = fo0.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            fo0 = fo0.f;
        }
        this.G = new byte[i4][];
        this.H = new int[i4 * 2];
        FO0 fo02 = c4057dh.B;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.G;
            bArr[i7] = fo02.a;
            int i8 = fo02.c;
            int i9 = fo02.b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.H;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            fo02.d = true;
            i7++;
            fo02 = fo02.f;
        }
    }

    public final int A(int i) {
        int iBinarySearch = Arrays.binarySearch(this.H, 0, this.G.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public final C4908gi B() {
        return new C4908gi(x());
    }

    @Override // com.daaw.C4908gi
    public String a() {
        return B().a();
    }

    @Override // com.daaw.C4908gi
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4908gi) {
            C4908gi c4908gi = (C4908gi) obj;
            if (c4908gi.s() == s() && q(0, c4908gi, 0, s())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.C4908gi
    public int hashCode() {
        int i = this.C;
        if (i != 0) {
            return i;
        }
        int length = this.G.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.G[i2];
            int[] iArr = this.H;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.C = i4;
        return i4;
    }

    @Override // com.daaw.C4908gi
    public byte k(int i) {
        AbstractC7675qb1.b(this.H[this.G.length - 1], i, 1L);
        int iA = A(i);
        int i2 = iA == 0 ? 0 : this.H[iA - 1];
        int[] iArr = this.H;
        byte[][] bArr = this.G;
        return bArr[iA][(i - i2) + iArr[bArr.length + iA]];
    }

    @Override // com.daaw.C4908gi
    public String l() {
        return B().l();
    }

    @Override // com.daaw.C4908gi
    public byte[] n() {
        return x();
    }

    @Override // com.daaw.C4908gi
    public boolean q(int i, C4908gi c4908gi, int i2, int i3) {
        if (i < 0 || i > s() - i3) {
            return false;
        }
        int iA = A(i);
        while (i3 > 0) {
            int i4 = iA == 0 ? 0 : this.H[iA - 1];
            int iMin = Math.min(i3, ((this.H[iA] - i4) + i4) - i);
            int[] iArr = this.H;
            byte[][] bArr = this.G;
            if (!c4908gi.r(i2, bArr[iA], (i - i4) + iArr[bArr.length + iA], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iA++;
        }
        return true;
    }

    @Override // com.daaw.C4908gi
    public boolean r(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > s() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iA = A(i);
        while (i3 > 0) {
            int i4 = iA == 0 ? 0 : this.H[iA - 1];
            int iMin = Math.min(i3, ((this.H[iA] - i4) + i4) - i);
            int[] iArr = this.H;
            byte[][] bArr2 = this.G;
            if (!AbstractC7675qb1.a(bArr2[iA], (i - i4) + iArr[bArr2.length + iA], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iA++;
        }
        return true;
    }

    @Override // com.daaw.C4908gi
    public int s() {
        return this.H[this.G.length - 1];
    }

    @Override // com.daaw.C4908gi
    public String toString() {
        return B().toString();
    }

    @Override // com.daaw.C4908gi
    public C4908gi u(int i, int i2) {
        return B().u(i, i2);
    }

    @Override // com.daaw.C4908gi
    public C4908gi w() {
        return B().w();
    }

    @Override // com.daaw.C4908gi
    public byte[] x() {
        int[] iArr = this.H;
        byte[][] bArr = this.G;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.H;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.G[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.daaw.C4908gi
    public String y() {
        return B().y();
    }

    @Override // com.daaw.C4908gi
    public void z(C4057dh c4057dh) {
        int length = this.G.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.H;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            FO0 fo0 = new FO0(this.G[i], i3, (i3 + i4) - i2, true, false);
            FO0 fo02 = c4057dh.B;
            if (fo02 == null) {
                fo0.g = fo0;
                fo0.f = fo0;
                c4057dh.B = fo0;
            } else {
                fo02.g.c(fo0);
            }
            i++;
            i2 = i4;
        }
        c4057dh.C += (long) i2;
    }
}
