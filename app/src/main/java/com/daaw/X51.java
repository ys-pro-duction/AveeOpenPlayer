package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class X51 {
    public static final a e = new a(null);
    public static final X51 f = new X51(0, 0, new Object[0]);
    public int a;
    public int b;
    public final C2972Zl0 c;
    public Object[] d;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final X51 a() {
            return X51.f;
        }

        public a() {
        }
    }

    public static final class b {
        public X51 a;
        public final int b;

        public b(X51 x51, int i) {
            G10.g(x51, "node");
            this.a = x51;
            this.b = i;
        }

        public final X51 a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(X51 x51) {
            G10.g(x51, "<set-?>");
            this.a = x51;
        }
    }

    public X51(int i, int i2, Object[] objArr, C2972Zl0 c2972Zl0) {
        G10.g(objArr, "buffer");
        this.a = i;
        this.b = i2;
        this.c = c2972Zl0;
        this.d = objArr;
    }

    public final X51 A(int i, C2276St0 c2276St0) {
        c2276St0.m(c2276St0.size() - 1);
        c2276St0.l(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c != c2276St0.j()) {
            return new X51(0, 0, AbstractC3343b61.h(this.d, i), c2276St0.j());
        }
        this.d = AbstractC3343b61.h(this.d, i);
        return this;
    }

    public final X51 B(int i, Object obj, Object obj2, C2972Zl0 c2972Zl0) {
        int iN = n(i);
        if (this.c != c2972Zl0) {
            return new X51(i | this.a, this.b, AbstractC3343b61.g(this.d, iN, obj, obj2), c2972Zl0);
        }
        this.d = AbstractC3343b61.g(this.d, iN, obj, obj2);
        this.a = i | this.a;
        return this;
    }

    public final X51 C(int i, int i2, int i3, Object obj, Object obj2, int i4, C2972Zl0 c2972Zl0) {
        if (this.c != c2972Zl0) {
            return new X51(this.a ^ i2, i2 | this.b, d(i, i2, i3, obj, obj2, i4, c2972Zl0), c2972Zl0);
        }
        this.d = d(i, i2, i3, obj, obj2, i4, c2972Zl0);
        this.a ^= i2;
        this.b |= i2;
        return this;
    }

    public final X51 D(int i, Object obj, Object obj2, int i2, C2276St0 c2276St0) {
        C2276St0 c2276St02;
        X51 x51D;
        G10.g(c2276St0, "mutator");
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            int iN = n(iF);
            if (G10.c(obj, t(iN))) {
                c2276St0.l(W(iN));
                return W(iN) == obj2 ? this : M(iN, obj2, c2276St0);
            }
            c2276St0.m(c2276St0.size() + 1);
            return C(iN, iF, i, obj, obj2, i2, c2276St0.j());
        }
        if (!r(iF)) {
            c2276St0.m(c2276St0.size() + 1);
            return B(iF, obj, obj2, c2276St0.j());
        }
        int iO = O(iF);
        X51 x51N = N(iO);
        if (i2 == 30) {
            x51D = x51N.w(obj, obj2, c2276St0);
            c2276St02 = c2276St0;
        } else {
            c2276St02 = c2276St0;
            x51D = x51N.D(i, obj, obj2, i2 + 5, c2276St02);
        }
        return x51N == x51D ? this : L(iO, x51D, c2276St02.j());
    }

    public final X51 E(X51 x51, int i, C4420ez c4420ez, C2276St0 c2276St0) {
        G10.g(x51, "otherNode");
        G10.g(c4420ez, "intersectionCounter");
        C2276St0 c2276St02 = c2276St0;
        G10.g(c2276St02, "mutator");
        if (this == x51) {
            c4420ez.b(e());
            return this;
        }
        int i2 = i;
        if (i2 > 30) {
            return x(x51, c4420ez, c2276St02.j());
        }
        int i3 = this.b | x51.b;
        int i4 = this.a;
        int i5 = x51.a;
        int i6 = (i4 ^ i5) & (~i3);
        int i7 = i4 & i5;
        while (i7 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i7);
            if (G10.c(t(n(iLowestOneBit)), x51.t(x51.n(iLowestOneBit)))) {
                i6 |= iLowestOneBit;
            } else {
                i3 |= iLowestOneBit;
            }
            i7 ^= iLowestOneBit;
        }
        if ((i3 & i6) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        X51 x512 = (G10.c(this.c, c2276St02.j()) && this.a == i6 && this.b == i3) ? this : new X51(i6, i3, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i3)]);
        int i8 = 0;
        int i9 = i3;
        int i10 = 0;
        while (i9 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i9);
            x512.d[(r11.length - 1) - i10] = F(x51, iLowestOneBit2, i2, c4420ez, c2276St02);
            i10++;
            i9 ^= iLowestOneBit2;
            i2 = i;
            c2276St02 = c2276St0;
        }
        while (i6 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i6);
            int i11 = i8 * 2;
            if (x51.q(iLowestOneBit3)) {
                int iN = x51.n(iLowestOneBit3);
                x512.d[i11] = x51.t(iN);
                x512.d[i11 + 1] = x51.W(iN);
                if (q(iLowestOneBit3)) {
                    c4420ez.c(c4420ez.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                x512.d[i11] = t(iN2);
                x512.d[i11 + 1] = W(iN2);
            }
            i8++;
            i6 ^= iLowestOneBit3;
        }
        return l(x512) ? this : x51.l(x512) ? x51 : x512;
    }

    public final X51 F(X51 x51, int i, int i2, C4420ez c4420ez, C2276St0 c2276St0) {
        if (r(i)) {
            X51 x51N = N(O(i));
            if (x51.r(i)) {
                return x51N.E(x51.N(x51.O(i)), i2 + 5, c4420ez, c2276St0);
            }
            if (!x51.q(i)) {
                return x51N;
            }
            int iN = x51.n(i);
            Object objT = x51.t(iN);
            Object objW = x51.W(iN);
            int size = c2276St0.size();
            X51 x51D = x51N.D(objT != null ? objT.hashCode() : 0, objT, objW, i2 + 5, c2276St0);
            if (c2276St0.size() == size) {
                c4420ez.c(c4420ez.a() + 1);
            }
            return x51D;
        }
        if (!x51.r(i)) {
            int iN2 = n(i);
            Object objT2 = t(iN2);
            Object objW2 = W(iN2);
            int iN3 = x51.n(i);
            Object objT3 = x51.t(iN3);
            return u(objT2 != null ? objT2.hashCode() : 0, objT2, objW2, objT3 != null ? objT3.hashCode() : 0, objT3, x51.W(iN3), i2 + 5, c2276St0.j());
        }
        X51 x51N2 = x51.N(x51.O(i));
        if (!q(i)) {
            return x51N2;
        }
        int iN4 = n(i);
        Object objT4 = t(iN4);
        int i3 = i2 + 5;
        if (x51N2.k(objT4 != null ? objT4.hashCode() : 0, objT4, i3)) {
            c4420ez.c(c4420ez.a() + 1);
            return x51N2;
        }
        return x51N2.D(objT4 != null ? objT4.hashCode() : 0, objT4, W(iN4), i3, c2276St0);
    }

    public final X51 G(int i, Object obj, int i2, C2276St0 c2276St0) {
        G10.g(c2276St0, "mutator");
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            int iN = n(iF);
            if (G10.c(obj, t(iN))) {
                return I(iN, iF, c2276St0);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            X51 x51N = N(iO);
            return K(x51N, i2 == 30 ? x51N.y(obj, c2276St0) : x51N.G(i, obj, i2 + 5, c2276St0), iO, iF, c2276St0.j());
        }
        return this;
    }

    public final X51 H(int i, Object obj, Object obj2, int i2, C2276St0 c2276St0) {
        G10.g(c2276St0, "mutator");
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            int iN = n(iF);
            if (G10.c(obj, t(iN)) && G10.c(obj2, W(iN))) {
                return I(iN, iF, c2276St0);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            X51 x51N = N(iO);
            return K(x51N, i2 == 30 ? x51N.z(obj, obj2, c2276St0) : x51N.H(i, obj, obj2, i2 + 5, c2276St0), iO, iF, c2276St0.j());
        }
        return this;
    }

    public final X51 I(int i, int i2, C2276St0 c2276St0) {
        c2276St0.m(c2276St0.size() - 1);
        c2276St0.l(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c != c2276St0.j()) {
            return new X51(i2 ^ this.a, this.b, AbstractC3343b61.h(this.d, i), c2276St0.j());
        }
        this.d = AbstractC3343b61.h(this.d, i);
        this.a ^= i2;
        return this;
    }

    public final X51 J(int i, int i2, C2972Zl0 c2972Zl0) {
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != c2972Zl0) {
            return new X51(this.a, i2 ^ this.b, AbstractC3343b61.i(objArr, i), c2972Zl0);
        }
        this.d = AbstractC3343b61.i(objArr, i);
        this.b ^= i2;
        return this;
    }

    public final X51 K(X51 x51, X51 x512, int i, int i2, C2972Zl0 c2972Zl0) {
        return x512 == null ? J(i, i2, c2972Zl0) : (this.c == c2972Zl0 || x51 != x512) ? L(i, x512, c2972Zl0) : this;
    }

    public final X51 L(int i, X51 x51, C2972Zl0 c2972Zl0) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && x51.d.length == 2 && x51.b == 0) {
            x51.a = this.b;
            return x51;
        }
        if (this.c == c2972Zl0) {
            objArr[i] = x51;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G10.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = x51;
        return new X51(this.a, this.b, objArrCopyOf, c2972Zl0);
    }

    public final X51 M(int i, Object obj, C2276St0 c2276St0) {
        if (this.c == c2276St0.j()) {
            this.d[i + 1] = obj;
            return this;
        }
        c2276St0.k(c2276St0.g() + 1);
        Object[] objArr = this.d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G10.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i + 1] = obj;
        return new X51(this.a, this.b, objArrCopyOf, c2276St0.j());
    }

    public final X51 N(int i) {
        Object obj = this.d[i];
        if (obj != null) {
            return (X51) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int O(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    public final b P(int i, Object obj, Object obj2, int i2) {
        b bVarP;
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            int iN = n(iF);
            if (!G10.c(obj, t(iN))) {
                return v(iN, iF, i, obj, obj2, i2).b();
            }
            if (W(iN) == obj2) {
                return null;
            }
            return V(iN, obj2).c();
        }
        if (!r(iF)) {
            return s(iF, obj, obj2).b();
        }
        int iO = O(iF);
        X51 x51N = N(iO);
        if (i2 == 30) {
            bVarP = x51N.h(obj, obj2);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = x51N.P(i, obj, obj2, i2 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final X51 Q(int i, Object obj, int i2) {
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            int iN = n(iF);
            if (G10.c(obj, t(iN))) {
                return R(iN, iF);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            X51 x51N = N(iO);
            return T(x51N, i2 == 30 ? x51N.i(obj) : x51N.Q(i, obj, i2 + 5), iO, iF);
        }
        return this;
    }

    public final X51 R(int i, int i2) {
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        return new X51(i2 ^ this.a, this.b, AbstractC3343b61.h(objArr, i));
    }

    public final X51 S(int i, int i2) {
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        return new X51(this.a, i2 ^ this.b, AbstractC3343b61.i(objArr, i));
    }

    public final X51 T(X51 x51, X51 x512, int i, int i2) {
        return x512 == null ? S(i, i2) : x51 != x512 ? U(i, i2, x512) : this;
    }

    public final X51 U(int i, int i2, X51 x51) {
        Object[] objArr = x51.d;
        if (objArr.length != 2 || x51.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            G10.f(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i] = x51;
            return new X51(this.a, this.b, objArrCopyOf);
        }
        if (this.d.length == 1) {
            x51.a = this.b;
            return x51;
        }
        return new X51(this.a ^ i2, i2 ^ this.b, AbstractC3343b61.k(this.d, i, n(i2), objArr[0], objArr[1]));
    }

    public final X51 V(int i, Object obj) {
        Object[] objArr = this.d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G10.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i + 1] = obj;
        return new X51(this.a, this.b, objArrCopyOf);
    }

    public final Object W(int i) {
        return this.d[i + 1];
    }

    public final b b() {
        return new b(this, 1);
    }

    public final b c() {
        return new b(this, 0);
    }

    public final Object[] d(int i, int i2, int i3, Object obj, Object obj2, int i4, C2972Zl0 c2972Zl0) {
        Object objT = t(i);
        return AbstractC3343b61.j(this.d, i, O(i2) + 1, u(objT != null ? objT.hashCode() : 0, objT, W(i), i3, obj, obj2, i4 + 5, c2972Zl0));
    }

    public final int e() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += N(i).e();
        }
        return iBitCount;
    }

    public final boolean f(Object obj) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (!G10.c(obj, this.d[iP])) {
                if (iP != iS) {
                    iP += iV;
                }
            }
            return true;
        }
        return false;
    }

    public final Object g(Object obj) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV <= 0 || iP > iS) && (iV >= 0 || iS > iP)) {
            return null;
        }
        while (!G10.c(obj, t(iP))) {
            if (iP == iS) {
                return null;
            }
            iP += iV;
        }
        return W(iP);
    }

    public final b h(Object obj, Object obj2) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (!G10.c(obj, t(iP))) {
                if (iP != iS) {
                    iP += iV;
                }
            }
            if (obj2 == W(iP)) {
                return null;
            }
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            G10.f(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iP + 1] = obj2;
            return new X51(0, 0, objArrCopyOf).c();
        }
        return new X51(0, 0, AbstractC3343b61.g(this.d, 0, obj, obj2)).b();
    }

    public final X51 i(Object obj) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (!G10.c(obj, t(iP))) {
                if (iP != iS) {
                    iP += iV;
                }
            }
            return j(iP);
        }
        return this;
    }

    public final X51 j(int i) {
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        return new X51(0, 0, AbstractC3343b61.h(objArr, i));
    }

    public final boolean k(int i, Object obj, int i2) {
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            return G10.c(obj, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        X51 x51N = N(O(iF));
        return i2 == 30 ? x51N.f(obj) : x51N.k(i, obj, i2 + 5);
    }

    public final boolean l(X51 x51) {
        if (this == x51) {
            return true;
        }
        if (this.b != x51.b || this.a != x51.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != x51.d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return Integer.bitCount(this.a);
    }

    public final int n(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object o(int i, Object obj, int i2) {
        int iF = 1 << AbstractC3343b61.f(i, i2);
        if (q(iF)) {
            int iN = n(iF);
            if (G10.c(obj, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        X51 x51N = N(O(iF));
        return i2 == 30 ? x51N.g(obj) : x51N.o(i, obj, i2 + 5);
    }

    public final Object[] p() {
        return this.d;
    }

    public final boolean q(int i) {
        return (i & this.a) != 0;
    }

    public final boolean r(int i) {
        return (i & this.b) != 0;
    }

    public final X51 s(int i, Object obj, Object obj2) {
        return new X51(i | this.a, this.b, AbstractC3343b61.g(this.d, n(i), obj, obj2));
    }

    public final Object t(int i) {
        return this.d[i];
    }

    public final X51 u(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C2972Zl0 c2972Zl0) {
        if (i3 > 30) {
            return new X51(0, 0, new Object[]{obj, obj2, obj3, obj4}, c2972Zl0);
        }
        int iF = AbstractC3343b61.f(i, i3);
        int iF2 = AbstractC3343b61.f(i2, i3);
        if (iF != iF2) {
            return new X51((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c2972Zl0);
        }
        return new X51(0, 1 << iF, new Object[]{u(i, obj, obj2, i2, obj3, obj4, i3 + 5, c2972Zl0)}, c2972Zl0);
    }

    public final X51 v(int i, int i2, int i3, Object obj, Object obj2, int i4) {
        return new X51(this.a ^ i2, this.b | i2, d(i, i2, i3, obj, obj2, i4, null));
    }

    public final X51 w(Object obj, Object obj2, C2276St0 c2276St0) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (!G10.c(obj, t(iP))) {
                if (iP != iS) {
                    iP += iV;
                }
            }
            c2276St0.l(W(iP));
            if (this.c == c2276St0.j()) {
                this.d[iP + 1] = obj2;
                return this;
            }
            c2276St0.k(c2276St0.g() + 1);
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            G10.f(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iP + 1] = obj2;
            return new X51(0, 0, objArrCopyOf, c2276St0.j());
        }
        c2276St0.m(c2276St0.size() + 1);
        return new X51(0, 0, AbstractC3343b61.g(this.d, 0, obj, obj2), c2276St0.j());
    }

    public final X51 x(X51 x51, C4420ez c4420ez, C2972Zl0 c2972Zl0) {
        AbstractC9971yn.a(this.b == 0);
        AbstractC9971yn.a(this.a == 0);
        AbstractC9971yn.a(x51.b == 0);
        AbstractC9971yn.a(x51.a == 0);
        Object[] objArr = this.d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + x51.d.length);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.d.length;
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, x51.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (true) {
                if (f(x51.d[iP])) {
                    c4420ez.c(c4420ez.a() + 1);
                } else {
                    Object[] objArr2 = x51.d;
                    objArrCopyOf[length] = objArr2[iP];
                    objArrCopyOf[length + 1] = objArr2[iP + 1];
                    length += 2;
                }
                if (iP == iS) {
                    break;
                }
                iP += iV;
            }
        }
        if (length == this.d.length) {
            return this;
        }
        if (length == x51.d.length) {
            return x51;
        }
        if (length == objArrCopyOf.length) {
            return new X51(0, 0, objArrCopyOf, c2972Zl0);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        G10.f(objArrCopyOf2, "copyOf(this, newSize)");
        return new X51(0, 0, objArrCopyOf2, c2972Zl0);
    }

    public final X51 y(Object obj, C2276St0 c2276St0) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (!G10.c(obj, t(iP))) {
                if (iP != iS) {
                    iP += iV;
                }
            }
            return A(iP, c2276St0);
        }
        return this;
    }

    public final X51 z(Object obj, Object obj2, C2276St0 c2276St0) {
        F00 f00P = AbstractC8417tE0.p(AbstractC8417tE0.q(0, this.d.length), 2);
        int iP = f00P.p();
        int iS = f00P.s();
        int iV = f00P.v();
        if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
            while (true) {
                if (!G10.c(obj, t(iP)) || !G10.c(obj2, W(iP))) {
                    if (iP == iS) {
                        break;
                    }
                    iP += iV;
                } else {
                    return A(iP, c2276St0);
                }
            }
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X51(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
        G10.g(objArr, "buffer");
    }
}
