package com.daaw;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K93 extends AbstractC8657u52 {
    public final int f;
    public final C4957gr3 g;

    public K93(boolean z, C4957gr3 c4957gr3) {
        this.g = c4957gr3;
        this.f = c4957gr3.c();
    }

    @Override // com.daaw.AbstractC8657u52
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        if (iP == -1 || (iA = u(iP).a(obj3)) == -1) {
            return -1;
        }
        return s(iP) + iA;
    }

    @Override // com.daaw.AbstractC8657u52
    public final H32 d(int i, H32 h32, boolean z) {
        int iQ = q(i);
        int iT = t(iQ);
        u(iQ).d(i - s(iQ), h32, z);
        h32.c += iT;
        if (z) {
            Object objV = v(iQ);
            Object obj = h32.b;
            obj.getClass();
            h32.b = Pair.create(objV, obj);
        }
        return h32;
    }

    @Override // com.daaw.AbstractC8657u52
    public final Q42 e(int i, Q42 q42, long j) {
        int iR = r(i);
        int iT = t(iR);
        int iS = s(iR);
        u(iR).e(i - iT, q42, j);
        Object objV = v(iR);
        if (!Q42.p.equals(q42.a)) {
            objV = Pair.create(objV, q42.a);
        }
        q42.a = objV;
        q42.n += iS;
        q42.o += iS;
        return q42;
    }

    @Override // com.daaw.AbstractC8657u52
    public final Object f(int i) {
        int iQ = q(i);
        return Pair.create(v(iQ), u(iQ).f(i - s(iQ)));
    }

    @Override // com.daaw.AbstractC8657u52
    public final int g(boolean z) {
        if (this.f == 0) {
            return -1;
        }
        int iA = z ? this.g.a() : 0;
        while (u(iA).o()) {
            iA = w(iA, z);
            if (iA == -1) {
                return -1;
            }
        }
        return t(iA) + u(iA).g(z);
    }

    @Override // com.daaw.AbstractC8657u52
    public final int h(boolean z) {
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        int iB = z ? this.g.b() : i - 1;
        while (u(iB).o()) {
            iB = x(iB, z);
            if (iB == -1) {
                return -1;
            }
        }
        return t(iB) + u(iB).h(z);
    }

    @Override // com.daaw.AbstractC8657u52
    public final int j(int i, int i2, boolean z) {
        int iR = r(i);
        int iT = t(iR);
        int iJ = u(iR).j(i - iT, i2 == 2 ? 0 : i2, z);
        if (iJ != -1) {
            return iT + iJ;
        }
        int iW = w(iR, z);
        while (iW != -1 && u(iW).o()) {
            iW = w(iW, z);
        }
        if (iW != -1) {
            return t(iW) + u(iW).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // com.daaw.AbstractC8657u52
    public final int k(int i, int i2, boolean z) {
        int iR = r(i);
        int iT = t(iR);
        int iK = u(iR).k(i - iT, 0, false);
        if (iK != -1) {
            return iT + iK;
        }
        int iX = x(iR, false);
        while (iX != -1 && u(iX).o()) {
            iX = x(iX, false);
        }
        if (iX != -1) {
            return t(iX) + u(iX).h(false);
        }
        return -1;
    }

    @Override // com.daaw.AbstractC8657u52
    public final H32 n(Object obj, H32 h32) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        int iT = t(iP);
        u(iP).n(obj3, h32);
        h32.c += iT;
        h32.b = obj;
        return h32;
    }

    public abstract int p(Object obj);

    public abstract int q(int i);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract int t(int i);

    public abstract AbstractC8657u52 u(int i);

    public abstract Object v(int i);

    public final int w(int i, boolean z) {
        if (z) {
            return this.g.d(i);
        }
        if (i >= this.f - 1) {
            return -1;
        }
        return i + 1;
    }

    public final int x(int i, boolean z) {
        if (z) {
            return this.g.e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }
}
