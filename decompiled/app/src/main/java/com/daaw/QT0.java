package com.daaw;

import com.daaw.InterfaceC5781jp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QT0 {
    public static final a v = new a(null);
    public final OT0 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final K00 o;
    public final K00 p;
    public final K00 q;
    public int r;
    public int s;
    public boolean t;
    public C10027yz0 u;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final List b(QT0 qt0, int i, QT0 qt02, boolean z, boolean z2) {
            List listK;
            boolean zE0;
            int i2;
            int i3;
            int i4;
            int iC0 = qt0.c0(i);
            int i5 = i + iC0;
            int iJ = qt0.J(i);
            int iJ2 = qt0.J(i5);
            int i6 = iJ2 - iJ;
            boolean zG = qt0.G(i);
            qt02.h0(iC0);
            qt02.i0(i6, qt02.U());
            if (qt0.e < i5) {
                qt0.q0(i5);
            }
            if (qt0.j < iJ2) {
                qt0.s0(iJ2, i5);
            }
            int[] iArr = qt02.b;
            int iU = qt02.U();
            AbstractC5152hb.f(qt0.b, iArr, iU * 5, i * 5, i5 * 5);
            Object[] objArr = qt02.c;
            int i7 = qt02.h;
            AbstractC5152hb.h(qt0.c, objArr, i7, iJ, iJ2);
            int iV = qt02.V();
            PT0.Z(iArr, iU, iV);
            int i8 = iU - i;
            int i9 = iU + iC0;
            int iK = i7 - qt02.K(iArr, iU);
            int i10 = qt02.l;
            int i11 = qt02.k;
            int length = objArr.length;
            int i12 = i10;
            int i13 = iU;
            while (true) {
                if (i13 >= i9) {
                    break;
                }
                if (i13 != iU) {
                    i2 = iK;
                    PT0.Z(iArr, i13, PT0.R(iArr, i13) + i8);
                } else {
                    i2 = iK;
                }
                int iK2 = qt02.K(iArr, i13) + i2;
                if (i12 < i13) {
                    i3 = iV;
                    i4 = 0;
                } else {
                    i3 = iV;
                    i4 = qt02.j;
                }
                PT0.V(iArr, i13, qt02.M(iK2, i4, i11, length));
                if (i13 == i12) {
                    i12++;
                }
                i13++;
                iV = i3;
                iK = i2;
            }
            int i14 = iV;
            qt02.l = i12;
            int iN = PT0.N(qt0.d, i, qt0.W());
            int iN2 = PT0.N(qt0.d, i5, qt0.W());
            if (iN < iN2) {
                ArrayList arrayList = qt0.d;
                ArrayList arrayList2 = new ArrayList(iN2 - iN);
                for (int i15 = iN; i15 < iN2; i15++) {
                    Object obj = arrayList.get(i15);
                    G10.f(obj, "sourceAnchors[anchorIndex]");
                    C4445f4 c4445f4 = (C4445f4) obj;
                    c4445f4.c(c4445f4.a() + i8);
                    arrayList2.add(c4445f4);
                }
                qt02.d.addAll(PT0.N(qt02.d, qt02.U(), qt02.W()), arrayList2);
                arrayList.subList(iN, iN2).clear();
                listK = arrayList2;
            } else {
                listK = AbstractC1599Mm.k();
            }
            int iY0 = qt0.y0(i);
            if (z) {
                boolean z3 = iY0 >= 0;
                if (z3) {
                    qt0.T0();
                    qt0.z(iY0 - qt0.U());
                    qt0.T0();
                }
                qt0.z(i - qt0.U());
                zE0 = qt0.E0();
                if (z3) {
                    qt0.O0();
                    qt0.N();
                    qt0.O0();
                    qt0.N();
                }
            } else {
                boolean zF0 = qt0.F0(i, iC0);
                qt0.G0(iJ, i6, i - 1);
                zE0 = zF0;
            }
            if (zE0) {
                AbstractC6348lp.x("Unexpectedly removed anchors");
                throw new D80();
            }
            qt02.n += PT0.L(iArr, iU) ? 1 : PT0.O(iArr, iU);
            if (z2) {
                qt02.r = i9;
                qt02.h = i7 + i6;
            }
            if (zG) {
                qt02.a1(i14);
            }
            return listK;
        }

        public a() {
        }
    }

    public static final class b implements Iterator, InterfaceC9783y60 {
        public int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ QT0 D;

        public b(int i, int i2, QT0 qt0) {
            this.C = i2;
            this.D = qt0;
            this.B = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B < this.C;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.D.c;
            QT0 qt0 = this.D;
            int i = this.B;
            this.B = i + 1;
            return objArr[qt0.L(i)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public QT0(OT0 ot0) {
        G10.g(ot0, "table");
        this.a = ot0;
        this.b = ot0.v();
        this.c = ot0.y();
        this.d = ot0.s();
        this.e = ot0.w();
        this.f = (this.b.length / 5) - ot0.w();
        this.g = ot0.w();
        this.j = ot0.D();
        this.k = this.c.length - ot0.D();
        this.l = ot0.w();
        this.o = new K00();
        this.p = new K00();
        this.q = new K00();
        this.s = -1;
    }

    public static /* synthetic */ void m0(QT0 qt0, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = qt0.s;
        }
        qt0.l0(i);
    }

    public final C4445f4 A(int i) {
        ArrayList arrayList = this.d;
        int iS = PT0.S(arrayList, i, W());
        if (iS >= 0) {
            Object obj = arrayList.get(iS);
            G10.f(obj, "get(location)");
            return (C4445f4) obj;
        }
        if (i > this.e) {
            i = -(W() - i);
        }
        C4445f4 c4445f4 = new C4445f4(i);
        arrayList.add(-(iS + 1), c4445f4);
        return c4445f4;
    }

    public final int A0(int i) {
        return i > -2 ? i : (W() + i) - (-2);
    }

    public final int B(C4445f4 c4445f4) {
        G10.g(c4445f4, "anchor");
        int iA = c4445f4.a();
        return iA < 0 ? W() + iA : iA;
    }

    public final int B0(int i, int i2) {
        return i < i2 ? i : -((W() - i) + 2);
    }

    public final int C(int[] iArr, int i) {
        return K(iArr, i) + PT0.D(PT0.F(iArr, i) >> 29);
    }

    public final void C0() {
        C10027yz0 c10027yz0 = this.u;
        if (c10027yz0 != null) {
            while (c10027yz0.b()) {
                b1(c10027yz0.d(), c10027yz0);
            }
        }
    }

    public final void D() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            J0();
        }
    }

    public final boolean D0(int i, int i2) {
        int i3 = i2 + i;
        int iN = PT0.N(this.d, i3, S() - this.f);
        if (iN >= this.d.size()) {
            iN--;
        }
        int i4 = iN + 1;
        int i5 = 0;
        while (iN >= 0) {
            Object obj = this.d.get(iN);
            G10.f(obj, "anchors[index]");
            C4445f4 c4445f4 = (C4445f4) obj;
            int iB = B(c4445f4);
            if (iB < i) {
                break;
            }
            if (iB < i3) {
                c4445f4.c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = iN + 1;
                }
                i4 = iN;
            }
            iN--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.d.subList(i4, i5).clear();
        }
        return z;
    }

    public final boolean E(int i) {
        int iC0 = i + 1;
        int iC02 = i + c0(i);
        while (iC0 < iC02) {
            if (PT0.B(this.b, Z(iC0))) {
                return true;
            }
            iC0 += c0(iC0);
        }
        return false;
    }

    public final boolean E0() {
        if (this.m != 0) {
            throw new IllegalArgumentException("Cannot remove group while inserting");
        }
        int i = this.r;
        int i2 = this.h;
        int iN0 = N0();
        C10027yz0 c10027yz0 = this.u;
        if (c10027yz0 != null) {
            while (c10027yz0.b() && c10027yz0.c() >= i) {
                c10027yz0.d();
            }
        }
        boolean zF0 = F0(i, this.r - i);
        G0(i2, this.h - i2, i - 1);
        this.r = i;
        this.h = i2;
        this.n -= iN0;
        return zF0;
    }

    public final void F() {
        this.t = true;
        if (this.o.d()) {
            q0(W());
            s0(this.c.length - this.k, this.e);
            C0();
        }
        this.a.p(this, this.b, this.e, this.c, this.j, this.d);
    }

    public final boolean F0(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            q0(i);
            zD0 = arrayList.isEmpty() ? false : D0(i, i2);
            this.e = i;
            this.f += i2;
            int i3 = this.l;
            if (i3 > i) {
                this.l = Math.max(i, i3 - i2);
            }
            int i4 = this.g;
            if (i4 >= this.e) {
                this.g = i4 - i2;
            }
            if (H(this.s)) {
                a1(this.s);
            }
        }
        return zD0;
    }

    public final boolean G(int i) {
        return i >= 0 && PT0.B(this.b, Z(i));
    }

    public final void G0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            s0(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            AbstractC5152hb.p(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final boolean H(int i) {
        return i >= 0 && PT0.C(this.b, Z(i));
    }

    public final void H0() {
        if (!(this.m == 0)) {
            AbstractC6348lp.x("Cannot reset when inserting");
            throw new D80();
        }
        C0();
        this.r = 0;
        this.g = S() - this.f;
        this.h = 0;
        this.i = 0;
        this.n = 0;
    }

    public final int I(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    public final int I0() {
        int iS = (S() - this.f) - this.p.h();
        this.g = iS;
        return iS;
    }

    public final int J(int i) {
        return K(this.b, Z(i));
    }

    public final void J0() {
        this.p.i((S() - this.f) - this.g);
    }

    public final int K(int[] iArr, int i) {
        return i >= S() ? this.c.length - this.k : I(PT0.E(iArr, i), this.k, this.c.length);
    }

    public final Object K0(int i, Object obj) {
        int iR0 = R0(this.b, Z(this.r));
        int i2 = iR0 + i;
        if (i2 >= iR0 && i2 < K(this.b, Z(this.r + 1))) {
            int iL = L(i2);
            Object[] objArr = this.c;
            Object obj2 = objArr[iL];
            objArr[iL] = obj;
            return obj2;
        }
        AbstractC6348lp.x(("Write to an invalid slot index " + i + " for group " + this.r).toString());
        throw new D80();
    }

    public final int L(int i) {
        return i < this.j ? i : i + this.k;
    }

    public final void L0(Object obj) {
        int i = this.h;
        if (i <= this.i) {
            this.c[L(i - 1)] = obj;
        } else {
            AbstractC6348lp.x("Writing to an invalid slot");
            throw new D80();
        }
    }

    public final int M(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final Object M0() {
        if (this.m > 0) {
            i0(1, this.s);
        }
        Object[] objArr = this.c;
        int i = this.h;
        this.h = i + 1;
        return objArr[L(i)];
    }

    public final int N() {
        boolean z = this.m > 0;
        int i = this.r;
        int i2 = this.g;
        int i3 = this.s;
        int iZ = Z(i3);
        int i4 = this.n;
        int i5 = i - i3;
        boolean zL = PT0.L(this.b, iZ);
        if (z) {
            PT0.W(this.b, iZ, i5);
            PT0.Y(this.b, iZ, i4);
            this.n = this.q.h() + (zL ? 1 : i4);
            this.s = z0(this.b, i3);
            return i4;
        }
        if (i != i2) {
            throw new IllegalArgumentException("Expected to be at the end of a group");
        }
        int iG = PT0.G(this.b, iZ);
        int iO = PT0.O(this.b, iZ);
        PT0.W(this.b, iZ, i5);
        PT0.Y(this.b, iZ, i4);
        int iH = this.o.h();
        I0();
        this.s = iH;
        int iZ0 = z0(this.b, i3);
        int iH2 = this.q.h();
        this.n = iH2;
        if (iZ0 == iH) {
            this.n = iH2 + (zL ? 0 : i4 - iO);
            return i4;
        }
        int i6 = i5 - iG;
        int i7 = zL ? 0 : i4 - iO;
        if (i6 != 0 || i7 != 0) {
            while (iZ0 != 0 && iZ0 != iH && (i7 != 0 || i6 != 0)) {
                int iZ2 = Z(iZ0);
                if (i6 != 0) {
                    PT0.W(this.b, iZ2, PT0.G(this.b, iZ2) + i6);
                }
                if (i7 != 0) {
                    int[] iArr = this.b;
                    PT0.Y(iArr, iZ2, PT0.O(iArr, iZ2) + i7);
                }
                if (PT0.L(this.b, iZ2)) {
                    i7 = 0;
                }
                iZ0 = z0(this.b, iZ0);
            }
        }
        this.n += i7;
        return i4;
    }

    public final int N0() {
        int iZ = Z(this.r);
        int iG = this.r + PT0.G(this.b, iZ);
        this.r = iG;
        this.h = K(this.b, Z(iG));
        if (PT0.L(this.b, iZ)) {
            return 1;
        }
        return PT0.O(this.b, iZ);
    }

    public final void O() {
        int i = this.m;
        if (i <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        int i2 = i - 1;
        this.m = i2;
        if (i2 == 0) {
            if (this.q.b() == this.o.b()) {
                I0();
            } else {
                AbstractC6348lp.x("startGroup/endGroup mismatch while inserting");
                throw new D80();
            }
        }
    }

    public final void O0() {
        int i = this.g;
        this.r = i;
        this.h = K(this.b, Z(i));
    }

    public final void P(int i) {
        if (this.m > 0) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.s;
        if (i2 != i) {
            if (i < i2 || i >= this.g) {
                throw new IllegalArgumentException(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
            }
            int i3 = this.r;
            int i4 = this.h;
            int i5 = this.i;
            this.r = i;
            T0();
            this.r = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final Object P0(int i, int i2) {
        int iR0 = R0(this.b, Z(i));
        int iK = K(this.b, Z(i + 1));
        int i3 = i2 + iR0;
        if (iR0 > i3 || i3 >= iK) {
            return InterfaceC5781jp.a.a();
        }
        return this.c[L(i3)];
    }

    public final void Q(C4445f4 c4445f4) {
        G10.g(c4445f4, "anchor");
        P(c4445f4.e(this));
    }

    public final Object Q0(C4445f4 c4445f4, int i) {
        G10.g(c4445f4, "anchor");
        return P0(B(c4445f4), i);
    }

    public final void R(int i, int i2, int i3) {
        int iB0 = B0(i, this.e);
        while (i3 < i2) {
            PT0.Z(this.b, Z(i3), iB0);
            int iG = PT0.G(this.b, Z(i3)) + i3;
            R(i3, iG, i3 + 1);
            i3 = iG;
        }
    }

    public final int R0(int[] iArr, int i) {
        return i >= S() ? this.c.length - this.k : I(PT0.T(iArr, i), this.k, this.c.length);
    }

    public final int S() {
        return this.b.length / 5;
    }

    public final void S0(int i, Object obj, Object obj2) {
        V0(i, obj, false, obj2);
    }

    public final boolean T() {
        return this.t;
    }

    public final void T0() {
        if (this.m != 0) {
            throw new IllegalArgumentException("Key must be supplied when inserting");
        }
        InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
        V0(0, aVar.a(), false, aVar.a());
    }

    public final int U() {
        return this.r;
    }

    public final void U0(int i, Object obj) {
        V0(i, obj, false, InterfaceC5781jp.a.a());
    }

    public final int V() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final void V0(int i, Object obj, boolean z, Object obj2) {
        int iG;
        boolean z2 = this.m > 0;
        this.q.i(this.n);
        if (z2) {
            h0(1);
            int i2 = this.r;
            int iZ = Z(i2);
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            ?? r7 = obj != aVar.a() ? 1 : 0;
            ?? r8 = (z || obj2 == aVar.a()) ? 0 : 1;
            PT0.K(this.b, iZ, i, z, r7, r8, this.s, this.h);
            this.i = this.h;
            int i3 = (z ? 1 : 0) + r7 + r8;
            if (i3 > 0) {
                i0(i3, i2);
                Object[] objArr = this.c;
                int i4 = this.h;
                if (z) {
                    objArr[i4] = obj2;
                    i4++;
                }
                if (r7 != 0) {
                    objArr[i4] = obj;
                    i4++;
                }
                if (r8 != 0) {
                    objArr[i4] = obj2;
                    i4++;
                }
                this.h = i4;
            }
            this.n = 0;
            iG = i2 + 1;
            this.s = i2;
            this.r = iG;
        } else {
            this.o.i(this.s);
            J0();
            int i5 = this.r;
            int iZ2 = Z(i5);
            if (!G10.c(obj2, InterfaceC5781jp.a.a())) {
                if (z) {
                    e1(obj2);
                } else {
                    Z0(obj2);
                }
            }
            this.h = R0(this.b, iZ2);
            this.i = K(this.b, Z(this.r + 1));
            this.n = PT0.O(this.b, iZ2);
            this.s = i5;
            this.r = i5 + 1;
            iG = i5 + PT0.G(this.b, iZ2);
        }
        this.g = iG;
    }

    public final int W() {
        return S() - this.f;
    }

    public final void W0(Object obj) {
        V0(125, obj, true, InterfaceC5781jp.a.a());
    }

    public final OT0 X() {
        return this.a;
    }

    public final Object X0(Object obj) {
        Object objM0 = M0();
        L0(obj);
        return objM0;
    }

    public final Object Y(int i) {
        int iZ = Z(i);
        return PT0.H(this.b, iZ) ? this.c[C(this.b, iZ)] : InterfaceC5781jp.a.a();
    }

    public final void Y0(int i, int i2) {
        int i3;
        int iS = S() - this.f;
        if (i >= i2) {
            for (int iN = PT0.N(this.d, i2, iS); iN < this.d.size(); iN++) {
                Object obj = this.d.get(iN);
                G10.f(obj, "anchors[index]");
                C4445f4 c4445f4 = (C4445f4) obj;
                int iA = c4445f4.a();
                if (iA < 0) {
                    return;
                }
                c4445f4.c(-(iS - iA));
            }
            return;
        }
        for (int iN2 = PT0.N(this.d, i, iS); iN2 < this.d.size(); iN2++) {
            Object obj2 = this.d.get(iN2);
            G10.f(obj2, "anchors[index]");
            C4445f4 c4445f42 = (C4445f4) obj2;
            int iA2 = c4445f42.a();
            if (iA2 >= 0 || (i3 = iA2 + iS) >= i2) {
                return;
            }
            c4445f42.c(i3);
        }
    }

    public final int Z(int i) {
        return i < this.e ? i : i + this.f;
    }

    public final void Z0(Object obj) {
        int iZ = Z(this.r);
        if (PT0.H(this.b, iZ)) {
            this.c[L(C(this.b, iZ))] = obj;
        } else {
            AbstractC6348lp.x("Updating the data of a group that was not created with a data slot");
            throw new D80();
        }
    }

    public final int a0(int i) {
        return PT0.M(this.b, Z(i));
    }

    public final void a1(int i) {
        if (i >= 0) {
            C10027yz0 c10027yz0 = this.u;
            if (c10027yz0 == null) {
                c10027yz0 = new C10027yz0(null, 1, 0 == true ? 1 : 0);
                this.u = c10027yz0;
            }
            c10027yz0.a(i);
        }
    }

    public final Object b0(int i) {
        int iZ = Z(i);
        if (PT0.J(this.b, iZ)) {
            return this.c[PT0.Q(this.b, iZ)];
        }
        return null;
    }

    public final void b1(int i, C10027yz0 c10027yz0) {
        int iZ = Z(i);
        boolean zE = E(i);
        if (PT0.C(this.b, iZ) != zE) {
            PT0.U(this.b, iZ, zE);
            int iY0 = y0(i);
            if (iY0 >= 0) {
                c10027yz0.a(iY0);
            }
        }
    }

    public final int c0(int i) {
        return PT0.G(this.b, Z(i));
    }

    public final void c1(int[] iArr, int i, int i2) {
        PT0.V(iArr, i, M(i2, this.j, this.k, this.c.length));
    }

    public final Iterator d0() {
        int iK = K(this.b, Z(this.r));
        int[] iArr = this.b;
        int i = this.r;
        return new b(iK, K(iArr, Z(i + c0(i))), this);
    }

    public final void d1(C4445f4 c4445f4, Object obj) {
        G10.g(c4445f4, "anchor");
        f1(c4445f4.e(this), obj);
    }

    public final boolean e0(int i) {
        return f0(i, this.r);
    }

    public final void e1(Object obj) {
        f1(this.r, obj);
    }

    public final boolean f0(int i, int i2) {
        int iC;
        int iS;
        if (i2 == this.s) {
            iS = this.g;
        } else if (i2 <= this.o.g(0) && (iC = this.o.c(i2)) >= 0) {
            iS = (S() - this.f) - this.p.f(iC);
        } else {
            int iC0 = c0(i2);
            iS = iC0 + i2;
        }
        return i > i2 && i < iS;
    }

    public final void f1(int i, Object obj) {
        int iZ = Z(i);
        int[] iArr = this.b;
        if (iZ < iArr.length && PT0.L(iArr, iZ)) {
            this.c[L(x0(this.b, iZ))] = obj;
            return;
        }
        AbstractC6348lp.x(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new D80();
    }

    public final boolean g0(int i) {
        int i2 = this.s;
        if (i <= i2 || i >= this.g) {
            return i2 == 0 && i == 0;
        }
        return true;
    }

    public final void h0(int i) {
        if (i > 0) {
            int i2 = this.r;
            q0(i2);
            int i3 = this.e;
            int i4 = this.f;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC5152hb.f(iArr, iArr2, 0, 0, i3 * 5);
                AbstractC5152hb.f(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.g;
            if (i7 >= i3) {
                this.g = i7 + i;
            }
            int i8 = i3 + i;
            this.e = i8;
            this.f = i4 - i;
            int iM = M(i5 > 0 ? J(i2 + i) : 0, this.l >= i3 ? this.j : 0, this.k, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                PT0.V(this.b, i9, iM);
            }
            int i10 = this.l;
            if (i10 >= i3) {
                this.l = i10 + i;
            }
        }
    }

    public final void i0(int i, int i2) {
        if (i > 0) {
            s0(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                AbstractC5152hb.h(objArr, objArr2, 0, 0, i3);
                AbstractC5152hb.h(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i8 = this.i;
            if (i8 >= i3) {
                this.i = i8 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final boolean j0() {
        int i = this.r;
        return i < this.g && PT0.L(this.b, Z(i));
    }

    public final boolean k0(int i) {
        return PT0.L(this.b, Z(i));
    }

    public final void l0(int i) {
        int iZ = Z(i);
        if (PT0.I(this.b, iZ)) {
            return;
        }
        PT0.X(this.b, iZ, true);
        if (PT0.C(this.b, iZ)) {
            return;
        }
        a1(y0(i));
    }

    public final void n0(int i, int i2, int i3) {
        int i4 = i3 + i;
        int iW = W();
        int iN = PT0.N(this.d, i, iW);
        ArrayList arrayList = new ArrayList();
        if (iN >= 0) {
            while (iN < this.d.size()) {
                Object obj = this.d.get(iN);
                G10.f(obj, "anchors[index]");
                C4445f4 c4445f4 = (C4445f4) obj;
                int iB = B(c4445f4);
                if (iB < i || iB >= i4) {
                    break;
                }
                arrayList.add(c4445f4);
                this.d.remove(iN);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C4445f4 c4445f42 = (C4445f4) arrayList.get(i6);
            int iB2 = B(c4445f42) + i5;
            if (iB2 >= this.e) {
                c4445f42.c(-(iW - iB2));
            } else {
                c4445f42.c(iB2);
            }
            this.d.add(PT0.N(this.d, iB2, iW), c4445f42);
        }
    }

    public final List o0(OT0 ot0, int i) {
        G10.g(ot0, "table");
        if (this.m <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i != 0 || this.r != 0 || this.a.w() != 0) {
            QT0 qt0I = ot0.I();
            try {
                return v.b(qt0I, i, this, true, true);
            } finally {
                qt0I.F();
            }
        }
        int[] iArr = this.b;
        Object[] objArr = this.c;
        ArrayList arrayList = this.d;
        int[] iArrV = ot0.v();
        int iW = ot0.w();
        Object[] objArrY = ot0.y();
        int iD = ot0.D();
        this.b = iArrV;
        this.c = objArrY;
        this.d = ot0.s();
        this.e = iW;
        this.f = (iArrV.length / 5) - iW;
        this.j = iD;
        this.k = objArrY.length - iD;
        this.l = iW;
        ot0.K(iArr, 0, objArr, 0, arrayList);
        return this.d;
    }

    public final void p0(int i) {
        if (this.m != 0) {
            throw new IllegalArgumentException("Cannot move a group while inserting");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Parameter offset is out of bounds");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.r;
        int i3 = this.s;
        int i4 = this.g;
        int iG = i2;
        for (int i5 = i; i5 > 0; i5--) {
            iG += PT0.G(this.b, Z(iG));
            if (iG > i4) {
                throw new IllegalArgumentException("Parameter offset is out of bounds");
            }
        }
        int iG2 = PT0.G(this.b, Z(iG));
        int i6 = this.h;
        int iK = K(this.b, Z(iG));
        int i7 = iG + iG2;
        int iK2 = K(this.b, Z(i7));
        int i8 = iK2 - iK;
        i0(i8, Math.max(this.r - 1, 0));
        h0(iG2);
        int[] iArr = this.b;
        int iZ = Z(i7) * 5;
        AbstractC5152hb.f(iArr, iArr, Z(i2) * 5, iZ, (iG2 * 5) + iZ);
        if (i8 > 0) {
            Object[] objArr = this.c;
            AbstractC5152hb.h(objArr, objArr, i6, L(iK + i8), L(iK2 + i8));
        }
        int i9 = iK + i8;
        int i10 = i9 - i6;
        int i11 = this.j;
        int i12 = this.k;
        int length = this.c.length;
        int i13 = this.l;
        int i14 = i2 + iG2;
        int i15 = i2;
        while (i15 < i14) {
            int iZ2 = Z(i15);
            int i16 = i10;
            int iK3 = K(iArr, iZ2) - i16;
            int i17 = i11;
            if (i13 < iZ2) {
                i11 = 0;
            }
            c1(iArr, iZ2, M(iK3, i11, i12, length));
            i15++;
            i11 = i17;
            i10 = i16;
        }
        n0(i7, i2, iG2);
        if (F0(i7, iG2)) {
            AbstractC6348lp.x("Unexpectedly removed anchors");
            throw new D80();
        }
        R(i3, this.g, i2);
        if (i8 > 0) {
            G0(i9, i8, i7 - 1);
        }
    }

    public final void q0(int i) {
        int i2 = this.f;
        int i3 = this.e;
        if (i3 != i) {
            if (!this.d.isEmpty()) {
                Y0(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    AbstractC5152hb.f(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    AbstractC5152hb.f(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int iS = S();
            AbstractC6348lp.X(i3 < iS);
            while (i3 < iS) {
                int iR = PT0.R(this.b, i3);
                int iB0 = B0(A0(iR), i);
                if (iB0 != iR) {
                    PT0.Z(this.b, i3, iB0);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List r0(int r10, com.daaw.OT0 r11, int r12) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            com.daaw.G10.g(r11, r0)
            int r0 = r9.m
            if (r0 > 0) goto L14
            int r0 = r9.r
            int r0 = r0 + r10
            int r0 = r9.c0(r0)
            r1 = 1
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            com.daaw.AbstractC6348lp.X(r1)
            int r0 = r9.r
            int r1 = r9.h
            int r2 = r9.i
            r9.z(r10)
            r9.T0()
            r9.D()
            com.daaw.QT0 r4 = r11.I()
            com.daaw.QT0$a r3 = com.daaw.QT0.v     // Catch: java.lang.Throwable -> L48
            r7 = 0
            r8 = 1
            r6 = r9
            r5 = r12
            java.util.List r10 = com.daaw.QT0.a.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L45
            r4.F()
            r9.O()
            r9.N()
            r6.r = r0
            r6.h = r1
            r6.i = r2
            return r10
        L45:
            r0 = move-exception
        L46:
            r10 = r0
            goto L4b
        L48:
            r0 = move-exception
            r6 = r9
            goto L46
        L4b:
            r4.F()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.QT0.r0(int, com.daaw.OT0, int):java.util.List");
    }

    public final void s0(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                AbstractC5152hb.h(objArr, objArr, i + i3, i, i4);
            } else {
                AbstractC5152hb.h(objArr, objArr, i4, i4 + i3, i + i3);
            }
            AbstractC5152hb.p(objArr, null, i, i + i3);
        }
        int iMin = Math.min(i2 + 1, W());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iZ = Z(iMin);
                int iZ2 = Z(i5);
                int i6 = this.e;
                while (iZ < iZ2) {
                    int iE = PT0.E(this.b, iZ);
                    if (!(iE >= 0)) {
                        AbstractC6348lp.x("Unexpected anchor value, expected a positive anchor");
                        throw new D80();
                    }
                    PT0.V(this.b, iZ, -((length - iE) + 1));
                    iZ++;
                    if (iZ == i6) {
                        iZ += this.f;
                    }
                }
            } else {
                int iZ3 = Z(i5);
                int iZ4 = Z(iMin);
                while (iZ3 < iZ4) {
                    int iE2 = PT0.E(this.b, iZ3);
                    if (!(iE2 < 0)) {
                        AbstractC6348lp.x("Unexpected anchor value, expected a negative anchor");
                        throw new D80();
                    }
                    PT0.V(this.b, iZ3, iE2 + length + 1);
                    iZ3++;
                    if (iZ3 == this.e) {
                        iZ3 += this.f;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final List t0(C4445f4 c4445f4, int i, QT0 qt0) {
        G10.g(c4445f4, "anchor");
        G10.g(qt0, "writer");
        if (qt0.m <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.m != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!c4445f4.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iB = B(c4445f4) + i;
        int i2 = this.r;
        if (i2 > iB || iB >= this.g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iY0 = y0(iB);
        int iC0 = c0(iB);
        int iW0 = k0(iB) ? 1 : w0(iB);
        List listB = v.b(this, iB, qt0, false, false);
        a1(iY0);
        boolean z = iW0 > 0;
        while (iY0 >= i2) {
            int iZ = Z(iY0);
            int[] iArr = this.b;
            PT0.W(iArr, iZ, PT0.G(iArr, iZ) - iC0);
            if (z) {
                if (PT0.L(this.b, iZ)) {
                    z = false;
                } else {
                    int[] iArr2 = this.b;
                    PT0.Y(iArr2, iZ, PT0.O(iArr2, iZ) - iW0);
                }
            }
            iY0 = y0(iY0);
        }
        if (z) {
            AbstractC6348lp.X(this.n >= iW0);
            this.n -= iW0;
        }
        return listB;
    }

    public String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.g + " size = " + W() + " gap=" + this.e + '-' + (this.e + this.f) + ')';
    }

    public final Object u0(int i) {
        int iZ = Z(i);
        if (PT0.L(this.b, iZ)) {
            return this.c[L(x0(this.b, iZ))];
        }
        return null;
    }

    public final Object v0(C4445f4 c4445f4) {
        G10.g(c4445f4, "anchor");
        return u0(c4445f4.e(this));
    }

    public final int w0(int i) {
        return PT0.O(this.b, Z(i));
    }

    public final int x0(int[] iArr, int i) {
        return K(iArr, i);
    }

    public final int y0(int i) {
        return z0(this.b, i);
    }

    public final void z(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Cannot seek backwards");
        }
        if (this.m > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.r + i;
        if (i2 >= this.s && i2 <= this.g) {
            this.r = i2;
            int iK = K(this.b, Z(i2));
            this.h = iK;
            this.i = iK;
            return;
        }
        AbstractC6348lp.x(("Cannot seek outside the current group (" + this.s + '-' + this.g + ')').toString());
        throw new D80();
    }

    public final int z0(int[] iArr, int i) {
        return A0(PT0.R(iArr, Z(i)));
    }
}
