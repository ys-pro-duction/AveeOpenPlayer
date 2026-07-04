package com.daaw;

import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.x53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9502x53 {
    public static final C9502x53 f = new C9502x53(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C9502x53(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static C9502x53 c() {
        return f;
    }

    public static C9502x53 e(C9502x53 c9502x53, C9502x53 c9502x532) {
        int i = c9502x53.a + c9502x532.a;
        int[] iArrCopyOf = Arrays.copyOf(c9502x53.b, i);
        System.arraycopy(c9502x532.b, 0, iArrCopyOf, c9502x53.a, c9502x532.a);
        Object[] objArrCopyOf = Arrays.copyOf(c9502x53.c, i);
        System.arraycopy(c9502x532.c, 0, objArrCopyOf, c9502x53.a, c9502x532.a);
        return new C9502x53(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static C9502x53 f() {
        return new C9502x53(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iC;
        int iB;
        int iB2;
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
                    iB2 = P33.b(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    AbstractC9213w33 abstractC9213w33 = (AbstractC9213w33) this.c[i3];
                    Logger logger = P33.b;
                    int iY = abstractC9213w33.y();
                    iB2 = P33.b(i7) + P33.b(iY) + iY;
                } else if (i6 == 3) {
                    int i8 = i5 << 3;
                    Logger logger2 = P33.b;
                    iC = ((C9502x53) this.c[i3]).a();
                    int iB3 = P33.b(i8);
                    iB = iB3 + iB3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C8939v43.a());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iB2 = P33.b(i5 << 3) + 4;
                }
                i2 += iB2;
            } else {
                int i9 = i5 << 3;
                iC = P33.c(((Long) this.c[i3]).longValue());
                iB = P33.b(i9);
            }
            iB2 = iB + iC;
            i2 += iB2;
        }
        this.d = i2;
        return i2;
    }

    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2] >>> 3;
            AbstractC9213w33 abstractC9213w33 = (AbstractC9213w33) this.c[i2];
            Logger logger = P33.b;
            int iY = abstractC9213w33.y();
            int iB2 = P33.b(iY) + iY;
            int iB3 = P33.b(16);
            int iB4 = P33.b(i3);
            int iB5 = P33.b(8);
            iB += iB5 + iB5 + iB3 + iB4 + P33.b(24) + iB2;
        }
        this.d = iB;
        return iB;
    }

    public final C9502x53 d(C9502x53 c9502x53) {
        if (c9502x53.equals(f)) {
            return this;
        }
        g();
        int i = this.a + c9502x53.a;
        l(i);
        System.arraycopy(c9502x53.b, 0, this.b, this.a, c9502x53.a);
        System.arraycopy(c9502x53.c, 0, this.c, this.a, c9502x53.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9502x53)) {
            return false;
        }
        C9502x53 c9502x53 = (C9502x53) obj;
        int i = this.a;
        if (i == c9502x53.a) {
            int[] iArr = this.b;
            int[] iArr2 = c9502x53.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c9502x53.c;
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
            W43.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void j(int i, Object obj) {
        g();
        l(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void k(Q33 q33) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    q33.E(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    q33.x(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    q33.o(i4, (AbstractC9213w33) obj);
                } else if (i3 == 3) {
                    q33.e(i4);
                    ((C9502x53) obj).k(q33);
                    q33.s(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(C8939v43.a());
                    }
                    q33.v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void l(int i) {
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
