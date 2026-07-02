package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.aH2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3113aH2 {
    public static final C3113aH2 f = new C3113aH2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C3113aH2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static C3113aH2 c() {
        return f;
    }

    public static C3113aH2 e(C3113aH2 c3113aH2, C3113aH2 c3113aH22) {
        int i = c3113aH2.a + c3113aH22.a;
        int[] iArrCopyOf = Arrays.copyOf(c3113aH2.b, i);
        System.arraycopy(c3113aH22.b, 0, iArrCopyOf, c3113aH2.a, c3113aH22.a);
        Object[] objArrCopyOf = Arrays.copyOf(c3113aH2.c, i);
        System.arraycopy(c3113aH22.c, 0, objArrCopyOf, c3113aH2.a, c3113aH22.a);
        return new C3113aH2(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static C3113aH2 f() {
        return new C3113aH2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iW2 = AbstractC5392iR1.w(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    BM1 bm1 = (BM1) this.c[i3];
                    int iW3 = AbstractC5392iR1.w(i7);
                    int iS = bm1.s();
                    iW2 = iW3 + AbstractC5392iR1.w(iS) + iS;
                } else if (i6 == 3) {
                    int iW4 = AbstractC5392iR1.w(i5 << 3);
                    iW = iW4 + iW4;
                    iX = ((C3113aH2) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(U92.a());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iW2 = AbstractC5392iR1.w(i5 << 3) + 4;
                }
                i2 += iW2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((Long) this.c[i3]).longValue();
                iW = AbstractC5392iR1.w(i8);
                iX = AbstractC5392iR1.x(jLongValue);
            }
            iW2 = iW + iX;
            i2 += iW2;
        }
        this.d = i2;
        return i2;
    }

    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iW = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2] >>> 3;
            BM1 bm1 = (BM1) this.c[i2];
            int iW2 = AbstractC5392iR1.w(8);
            int iW3 = AbstractC5392iR1.w(16) + AbstractC5392iR1.w(i3);
            int iW4 = AbstractC5392iR1.w(24);
            int iS = bm1.s();
            iW += iW2 + iW2 + iW3 + iW4 + AbstractC5392iR1.w(iS) + iS;
        }
        this.d = iW;
        return iW;
    }

    public final C3113aH2 d(C3113aH2 c3113aH2) {
        if (c3113aH2.equals(f)) {
            return this;
        }
        g();
        int i = this.a + c3113aH2.a;
        m(i);
        System.arraycopy(c3113aH2.b, 0, this.b, this.a, c3113aH2.a);
        System.arraycopy(c3113aH2.c, 0, this.c, this.a, c3113aH2.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3113aH2)) {
            return false;
        }
        C3113aH2 c3113aH2 = (C3113aH2) obj;
        int i = this.a;
        if (i == c3113aH2.a) {
            int[] iArr = this.b;
            int[] iArr2 = c3113aH2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c3113aH2.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void g() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.e) {
            this.e = false;
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            AbstractC10268zq2.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void j(int i, Object obj) {
        g();
        m(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void k(InterfaceC10148zQ2 interfaceC10148zQ2) {
        for (int i = 0; i < this.a; i++) {
            interfaceC10148zQ2.F(this.b[i] >>> 3, this.c[i]);
        }
    }

    public final void l(InterfaceC10148zQ2 interfaceC10148zQ2) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    interfaceC10148zQ2.e(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    interfaceC10148zQ2.a(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    interfaceC10148zQ2.E(i4, (BM1) obj);
                } else if (i3 == 3) {
                    interfaceC10148zQ2.L(i4);
                    ((C3113aH2) obj).l(interfaceC10148zQ2);
                    interfaceC10148zQ2.g(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(U92.a());
                    }
                    interfaceC10148zQ2.c(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }
}
