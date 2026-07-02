package com.daaw;

import android.util.Pair;

/* JADX INFO: renamed from: com.daaw.u52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8657u52 {
    public static final AbstractC8657u52 a = new C10044z22();
    public static final String b = Integer.toString(0, 36);
    public static final String c = Integer.toString(1, 36);
    public static final String d = Integer.toString(2, 36);
    public static final InterfaceC9666xh3 e = new InterfaceC9666xh3() { // from class: com.daaw.R12
    };

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract H32 d(int i, H32 h32, boolean z);

    public abstract Q42 e(int i, Q42 q42, long j);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC8657u52)) {
            return false;
        }
        AbstractC8657u52 abstractC8657u52 = (AbstractC8657u52) obj;
        if (abstractC8657u52.c() == c() && abstractC8657u52.b() == b()) {
            Q42 q42 = new Q42();
            H32 h32 = new H32();
            Q42 q422 = new Q42();
            H32 h322 = new H32();
            for (int i = 0; i < c(); i++) {
                if (!e(i, q42, 0L).equals(abstractC8657u52.e(i, q422, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < b(); i2++) {
                if (!d(i2, h32, true).equals(abstractC8657u52.d(i2, h322, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == abstractC8657u52.g(true) && (iH = h(true)) == abstractC8657u52.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != abstractC8657u52.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i);

    public int g(boolean z) {
        return o() ? -1 : 0;
    }

    public int h(boolean z) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        Q42 q42 = new Q42();
        H32 h32 = new H32();
        int iC = c() + 217;
        int i2 = 0;
        while (true) {
            i = iC * 31;
            if (i2 >= c()) {
                break;
            }
            iC = i + e(i2, q42, 0L).hashCode();
            i2++;
        }
        int iB = i + b();
        for (int i3 = 0; i3 < b(); i3++) {
            iB = (iB * 31) + d(i3, h32, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i, H32 h32, Q42 q42, int i2, boolean z) {
        int i3 = d(i, h32, false).c;
        if (e(i3, q42, 0L).o != i) {
            return i + 1;
        }
        int iJ = j(i3, i2, z);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, q42, 0L).n;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == h(z) ? g(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i, int i2, boolean z) {
        if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(Q42 q42, H32 h32, int i, long j) {
        Pair pairM = m(q42, h32, i, j, 0L);
        pairM.getClass();
        return pairM;
    }

    public final Pair m(Q42 q42, H32 h32, int i, long j, long j2) {
        AbstractC6048km2.a(i, 0, c());
        e(i, q42, j2);
        if (j == -9223372036854775807L) {
            long j3 = q42.l;
            j = 0;
        }
        int i2 = q42.n;
        d(i2, h32, false);
        while (i2 < q42.o) {
            long j4 = h32.e;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = d(i3, h32, false).e;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        d(i2, h32, true);
        long j6 = h32.e;
        long j7 = h32.d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = h32.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public H32 n(Object obj, H32 h32) {
        return d(a(obj), h32, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
