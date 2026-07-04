package com.daaw;

import com.daaw.InterfaceC9674xj1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class L91 {
    public static final L91 f = new L91(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public L91() {
        this(0, new int[8], new Object[8], true);
    }

    public static L91 c() {
        return f;
    }

    public static int f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int g(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static L91 j(L91 l91, L91 l912) {
        int i = l91.a + l912.a;
        int[] iArrCopyOf = Arrays.copyOf(l91.b, i);
        System.arraycopy(l912.b, 0, iArrCopyOf, l91.a, l912.a);
        Object[] objArrCopyOf = Arrays.copyOf(l91.c, i);
        System.arraycopy(l912.c, 0, objArrCopyOf, l91.a, l912.a);
        return new L91(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static L91 k() {
        return new L91();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i, Object obj, InterfaceC9674xj1 interfaceC9674xj1) {
        int iA = AbstractC6027ki1.a(i);
        int iB = AbstractC6027ki1.b(i);
        if (iB == 0) {
            interfaceC9674xj1.r(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            interfaceC9674xj1.k(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            interfaceC9674xj1.f(iA, (AbstractC4340ei) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(P10.e());
            }
            interfaceC9674xj1.e(iA, ((Integer) obj).intValue());
        } else if (interfaceC9674xj1.l() == InterfaceC9674xj1.a.ASCENDING) {
            interfaceC9674xj1.u(iA);
            ((L91) obj).r(interfaceC9674xj1);
            interfaceC9674xj1.H(iA);
        } else {
            interfaceC9674xj1.H(iA);
            ((L91) obj).r(interfaceC9674xj1);
            interfaceC9674xj1.u(iA);
        }
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i) {
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

    public int d() {
        int iT;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int iA = AbstractC6027ki1.a(i4);
            int iB = AbstractC6027ki1.b(i4);
            if (iB == 0) {
                iT = AbstractC10245zm.T(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 1) {
                iT = AbstractC10245zm.p(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 2) {
                iT = AbstractC10245zm.h(iA, (AbstractC4340ei) this.c[i3]);
            } else if (iB == 3) {
                iT = (AbstractC10245zm.Q(iA) * 2) + ((L91) this.c[i3]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(P10.e());
                }
                iT = AbstractC10245zm.n(iA, ((Integer) this.c[i3]).intValue());
            }
            i2 += iT;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            iF += AbstractC10245zm.F(AbstractC6027ki1.a(this.b[i2]), (AbstractC4340ei) this.c[i2]);
        }
        this.d = iF;
        return iF;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L91)) {
            return false;
        }
        L91 l91 = (L91) obj;
        int i = this.a;
        return i == l91.a && o(this.b, l91.b, i) && l(this.c, l91.c, this.a);
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + f(this.b, i)) * 31) + g(this.c, this.a);
    }

    public L91 i(L91 l91) {
        if (l91.equals(c())) {
            return this;
        }
        a();
        int i = this.a + l91.a;
        b(i);
        System.arraycopy(l91.b, 0, this.b, this.a, l91.a);
        System.arraycopy(l91.c, 0, this.c, this.a, l91.a);
        this.a = i;
        return this;
    }

    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            AbstractC2340Tj0.d(sb, i, String.valueOf(AbstractC6027ki1.a(this.b[i2])), this.c[i2]);
        }
    }

    public void n(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public void p(InterfaceC9674xj1 interfaceC9674xj1) {
        if (interfaceC9674xj1.l() == InterfaceC9674xj1.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                interfaceC9674xj1.d(AbstractC6027ki1.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            interfaceC9674xj1.d(AbstractC6027ki1.a(this.b[i2]), this.c[i2]);
        }
    }

    public void r(InterfaceC9674xj1 interfaceC9674xj1) {
        if (this.a == 0) {
            return;
        }
        if (interfaceC9674xj1.l() == InterfaceC9674xj1.a.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                q(this.b[i], this.c[i], interfaceC9674xj1);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            q(this.b[i2], this.c[i2], interfaceC9674xj1);
        }
    }

    public L91(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
