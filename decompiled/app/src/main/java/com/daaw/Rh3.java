package com.daaw;

import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Rh3 {
    public static final Rh3 f = new Rh3(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public Rh3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static Rh3 c() {
        return f;
    }

    public static Rh3 e(Rh3 rh3, Rh3 rh32) {
        int i = rh3.a + rh32.a;
        int[] iArrCopyOf = Arrays.copyOf(rh3.b, i);
        System.arraycopy(rh32.b, 0, iArrCopyOf, rh3.a, rh32.a);
        Object[] objArrCopyOf = Arrays.copyOf(rh3.c, i);
        System.arraycopy(rh32.c, 0, objArrCopyOf, rh3.a, rh32.a);
        return new Rh3(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static Rh3 f() {
        return new Rh3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iZ;
        int iY;
        int iY2;
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
                    iY2 = Vd3.y(i5 << 3) + 8;
                } else if (i6 == 2) {
                    AbstractC9646xd3 abstractC9646xd3 = (AbstractC9646xd3) this.c[i3];
                    Logger logger = Vd3.b;
                    int iS = abstractC9646xd3.s();
                    iY2 = Vd3.y(i5 << 3) + Vd3.y(iS) + iS;
                } else if (i6 == 3) {
                    int i7 = i5 << 3;
                    Logger logger2 = Vd3.b;
                    iZ = ((Rh3) this.c[i3]).a();
                    int iY3 = Vd3.y(i7);
                    iY = iY3 + iY3;
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(Ef3.a());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iY2 = Vd3.y(i5 << 3) + 4;
                }
                i2 += iY2;
            } else {
                int i8 = i5 << 3;
                iZ = Vd3.z(((Long) this.c[i3]).longValue());
                iY = Vd3.y(i8);
            }
            iY2 = iY + iZ;
            i2 += iY2;
        }
        this.d = i2;
        return i2;
    }

    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iY = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2] >>> 3;
            AbstractC9646xd3 abstractC9646xd3 = (AbstractC9646xd3) this.c[i2];
            Logger logger = Vd3.b;
            int iS = abstractC9646xd3.s();
            int iY2 = Vd3.y(iS) + iS;
            int iY3 = Vd3.y(16);
            int iY4 = Vd3.y(i3);
            int iY5 = Vd3.y(8);
            iY += iY5 + iY5 + iY3 + iY4 + Vd3.y(24) + iY2;
        }
        this.d = iY;
        return iY;
    }

    public final Rh3 d(Rh3 rh3) {
        if (rh3.equals(f)) {
            return this;
        }
        g();
        int i = this.a + rh3.a;
        l(i);
        System.arraycopy(rh3.b, 0, this.b, this.a, rh3.a);
        System.arraycopy(rh3.c, 0, this.c, this.a, rh3.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Rh3)) {
            return false;
        }
        Rh3 rh3 = (Rh3) obj;
        int i = this.a;
        if (i == rh3.a) {
            int[] iArr = this.b;
            int[] iArr2 = rh3.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = rh3.c;
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
        int i5 = (i2 * 31) + i3;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return (i5 * 31) + iHashCode;
    }

    public final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            Og3.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
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

    public final void k(Hi3 hi3) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    hi3.e(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    hi3.a(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    hi3.y(i4, (AbstractC9646xd3) obj);
                } else if (i3 == 3) {
                    hi3.zzE(i4);
                    ((Rh3) obj).k(hi3);
                    hi3.g(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(Ef3.a());
                    }
                    hi3.c(i4, ((Integer) obj).intValue());
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
