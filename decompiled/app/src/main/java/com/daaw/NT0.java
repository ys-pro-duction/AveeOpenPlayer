package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NT0 {
    public final OT0 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public NT0(OT0 ot0) {
        G10.g(ot0, "table");
        this.a = ot0;
        this.b = ot0.v();
        int iW = ot0.w();
        this.c = iW;
        this.d = ot0.y();
        this.e = ot0.D();
        this.g = iW;
        this.h = -1;
    }

    public final Object A(int i) {
        return L(this.b, i);
    }

    public final int B(int i) {
        return PT0.G(this.b, i);
    }

    public final boolean C(int i) {
        return PT0.I(this.b, i);
    }

    public final boolean D(int i) {
        return PT0.J(this.b, i);
    }

    public final boolean E() {
        return r() || this.f == this.g;
    }

    public final boolean F() {
        return PT0.L(this.b, this.f);
    }

    public final boolean G(int i) {
        return PT0.L(this.b, i);
    }

    public final Object H() {
        int i;
        if (this.i > 0 || (i = this.j) >= this.k) {
            return InterfaceC5781jp.a.a();
        }
        Object[] objArr = this.d;
        this.j = i + 1;
        return objArr[i];
    }

    public final Object I(int i) {
        if (PT0.L(this.b, i)) {
            return J(this.b, i);
        }
        return null;
    }

    public final Object J(int[] iArr, int i) {
        return PT0.L(iArr, i) ? this.d[PT0.P(iArr, i)] : InterfaceC5781jp.a.a();
    }

    public final int K(int i) {
        return PT0.O(this.b, i);
    }

    public final Object L(int[] iArr, int i) {
        if (PT0.J(iArr, i)) {
            return this.d[PT0.Q(iArr, i)];
        }
        return null;
    }

    public final int M(int i) {
        return PT0.R(this.b, i);
    }

    public final void N(int i) {
        if (this.i != 0) {
            throw new IllegalArgumentException("Cannot reposition while in an empty region");
        }
        this.f = i;
        int iR = i < this.c ? PT0.R(this.b, i) : -1;
        this.h = iR;
        if (iR < 0) {
            this.g = this.c;
        } else {
            this.g = iR + PT0.G(this.b, iR);
        }
        this.j = 0;
        this.k = 0;
    }

    public final void O(int i) {
        int iG = PT0.G(this.b, i) + i;
        int i2 = this.f;
        if (i2 >= i && i2 <= iG) {
            this.h = i;
            this.g = iG;
            this.j = 0;
            this.k = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i + " is not a parent of " + i2).toString());
    }

    public final int P() {
        if (this.i != 0) {
            throw new IllegalArgumentException("Cannot skip while in an empty region");
        }
        int iO = PT0.L(this.b, this.f) ? 1 : PT0.O(this.b, this.f);
        int i = this.f;
        this.f = i + PT0.G(this.b, i);
        return iO;
    }

    public final void Q() {
        if (this.i != 0) {
            throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region");
        }
        this.f = this.g;
    }

    public final void R() {
        if (this.i <= 0) {
            if (PT0.R(this.b, this.f) != this.h) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            int i = this.f;
            this.h = i;
            this.g = i + PT0.G(this.b, i);
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            this.j = PT0.T(this.b, i2);
            this.k = i2 >= this.c + (-1) ? this.e : PT0.E(this.b, i3);
        }
    }

    public final void S() {
        if (this.i <= 0) {
            if (!PT0.L(this.b, this.f)) {
                throw new IllegalArgumentException("Expected a node group");
            }
            R();
        }
    }

    public final C4445f4 a(int i) {
        ArrayList arrayListS = this.a.s();
        int iS = PT0.S(arrayListS, i, this.c);
        if (iS < 0) {
            C4445f4 c4445f4 = new C4445f4(i);
            arrayListS.add(-(iS + 1), c4445f4);
            return c4445f4;
        }
        Object obj = arrayListS.get(iS);
        G10.f(obj, "get(location)");
        return (C4445f4) obj;
    }

    public final Object b(int[] iArr, int i) {
        return PT0.H(iArr, i) ? this.d[PT0.A(iArr, i)] : InterfaceC5781jp.a.a();
    }

    public final void c() {
        this.i++;
    }

    public final void d() {
        this.a.m(this);
    }

    public final boolean e(int i) {
        return PT0.C(this.b, i);
    }

    public final void f() {
        int i = this.i;
        if (i <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.i = i - 1;
    }

    public final void g() {
        if (this.i == 0) {
            if (this.f != this.g) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group");
            }
            int iR = PT0.R(this.b, this.h);
            this.h = iR;
            this.g = iR < 0 ? this.c : iR + PT0.G(this.b, iR);
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.i <= 0) {
            int iG = this.f;
            int i = 0;
            while (iG < this.g) {
                arrayList.add(new P70(PT0.M(this.b, iG), L(this.b, iG), iG, PT0.L(this.b, iG) ? 1 : PT0.O(this.b, iG), i));
                iG += PT0.G(this.b, iG);
                i++;
            }
        }
        return arrayList;
    }

    public final void i(int i, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "block");
        int iT = PT0.T(this.b, i);
        int i2 = i + 1;
        int iE = i2 < this.a.w() ? PT0.E(this.a.v(), i2) : this.a.D();
        for (int i3 = iT; i3 < iE; i3++) {
            interfaceC3429bR.invoke(Integer.valueOf(i3 - iT), this.d[i3]);
        }
    }

    public final int j() {
        return this.g;
    }

    public final int k() {
        return this.f;
    }

    public final Object l() {
        int i = this.f;
        if (i < this.g) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int m() {
        return this.g;
    }

    public final int n() {
        int i = this.f;
        if (i < this.g) {
            return PT0.M(this.b, i);
        }
        return 0;
    }

    public final Object o() {
        int i = this.f;
        if (i < this.g) {
            return L(this.b, i);
        }
        return null;
    }

    public final int p() {
        return PT0.G(this.b, this.f);
    }

    public final int q() {
        return this.j - PT0.T(this.b, this.h);
    }

    public final boolean r() {
        return this.i > 0;
    }

    public final int s() {
        return this.h;
    }

    public final int t() {
        int i = this.h;
        if (i >= 0) {
            return PT0.O(this.b, i);
        }
        return 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f + ", key=" + n() + ", parent=" + this.h + ", end=" + this.g + ')';
    }

    public final int u() {
        return this.c;
    }

    public final OT0 v() {
        return this.a;
    }

    public final Object w(int i) {
        return b(this.b, i);
    }

    public final Object x(int i) {
        return y(this.f, i);
    }

    public final Object y(int i, int i2) {
        int iT = PT0.T(this.b, i);
        int i3 = i + 1;
        int i4 = iT + i2;
        return i4 < (i3 < this.c ? PT0.E(this.b, i3) : this.e) ? this.d[i4] : InterfaceC5781jp.a.a();
    }

    public final int z(int i) {
        return PT0.M(this.b, i);
    }
}
