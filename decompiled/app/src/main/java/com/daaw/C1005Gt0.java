package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005Gt0 {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final HashMap e;
    public final O90 f;

    /* JADX INFO: renamed from: com.daaw.Gt0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            HashMap mapP = AbstractC6348lp.P();
            C1005Gt0 c1005Gt0 = C1005Gt0.this;
            int size = c1005Gt0.b().size();
            for (int i = 0; i < size; i++) {
                P70 p70 = (P70) c1005Gt0.b().get(i);
                AbstractC6348lp.S(mapP, AbstractC6348lp.H(p70), p70);
            }
            return mapP;
        }
    }

    public C1005Gt0(List list, int i) {
        G10.g(list, "keyInfos");
        this.a = list;
        this.b = i;
        if (i < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.d = new ArrayList();
        HashMap map = new HashMap();
        int size = list.size();
        int iC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            P70 p70 = (P70) this.a.get(i2);
            map.put(Integer.valueOf(p70.b()), new C3162aU(i2, iC, p70.c()));
            iC += p70.c();
        }
        this.e = map;
        this.f = AbstractC3192ab0.a(new a());
    }

    public final int a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public final HashMap c() {
        return (HashMap) this.f.getValue();
    }

    public final P70 d(int i, Object obj) {
        return (P70) AbstractC6348lp.R(c(), obj != null ? new C4446f40(Integer.valueOf(i), obj) : Integer.valueOf(i));
    }

    public final int e() {
        return this.b;
    }

    public final List f() {
        return this.d;
    }

    public final int g(P70 p70) {
        G10.g(p70, "keyInfo");
        C3162aU c3162aU = (C3162aU) this.e.get(Integer.valueOf(p70.b()));
        if (c3162aU != null) {
            return c3162aU.b();
        }
        return -1;
    }

    public final boolean h(P70 p70) {
        G10.g(p70, "keyInfo");
        return this.d.add(p70);
    }

    public final void i(P70 p70, int i) {
        G10.g(p70, "keyInfo");
        this.e.put(Integer.valueOf(p70.b()), new C3162aU(-1, i, 0));
    }

    public final void j(int i, int i2, int i3) {
        if (i > i2) {
            Collection<C3162aU> collectionValues = this.e.values();
            G10.f(collectionValues, "groupInfos.values");
            for (C3162aU c3162aU : collectionValues) {
                int iB = c3162aU.b();
                if (i <= iB && iB < i + i3) {
                    c3162aU.e((iB - i) + i2);
                } else if (i2 <= iB && iB < i) {
                    c3162aU.e(iB + i3);
                }
            }
            return;
        }
        if (i2 > i) {
            Collection<C3162aU> collectionValues2 = this.e.values();
            G10.f(collectionValues2, "groupInfos.values");
            for (C3162aU c3162aU2 : collectionValues2) {
                int iB2 = c3162aU2.b();
                if (i <= iB2 && iB2 < i + i3) {
                    c3162aU2.e((iB2 - i) + i2);
                } else if (i + 1 <= iB2 && iB2 < i2) {
                    c3162aU2.e(iB2 - i3);
                }
            }
        }
    }

    public final void k(int i, int i2) {
        if (i > i2) {
            Collection<C3162aU> collectionValues = this.e.values();
            G10.f(collectionValues, "groupInfos.values");
            for (C3162aU c3162aU : collectionValues) {
                int iC = c3162aU.c();
                if (iC == i) {
                    c3162aU.f(i2);
                } else if (i2 <= iC && iC < i) {
                    c3162aU.f(iC + 1);
                }
            }
            return;
        }
        if (i2 > i) {
            Collection<C3162aU> collectionValues2 = this.e.values();
            G10.f(collectionValues2, "groupInfos.values");
            for (C3162aU c3162aU2 : collectionValues2) {
                int iC2 = c3162aU2.c();
                if (iC2 == i) {
                    c3162aU2.f(i2);
                } else if (i + 1 <= iC2 && iC2 < i2) {
                    c3162aU2.f(iC2 - 1);
                }
            }
        }
    }

    public final void l(int i) {
        this.c = i;
    }

    public final int m(P70 p70) {
        G10.g(p70, "keyInfo");
        C3162aU c3162aU = (C3162aU) this.e.get(Integer.valueOf(p70.b()));
        if (c3162aU != null) {
            return c3162aU.c();
        }
        return -1;
    }

    public final boolean n(int i, int i2) {
        int iB;
        C3162aU c3162aU = (C3162aU) this.e.get(Integer.valueOf(i));
        if (c3162aU == null) {
            return false;
        }
        int iB2 = c3162aU.b();
        int iA = i2 - c3162aU.a();
        c3162aU.d(i2);
        if (iA == 0) {
            return true;
        }
        Collection<C3162aU> collectionValues = this.e.values();
        G10.f(collectionValues, "groupInfos.values");
        for (C3162aU c3162aU2 : collectionValues) {
            if (c3162aU2.b() >= iB2 && !G10.c(c3162aU2, c3162aU) && (iB = c3162aU2.b() + iA) >= 0) {
                c3162aU2.e(iB);
            }
        }
        return true;
    }

    public final int o(P70 p70) {
        G10.g(p70, "keyInfo");
        C3162aU c3162aU = (C3162aU) this.e.get(Integer.valueOf(p70.b()));
        return c3162aU != null ? c3162aU.a() : p70.c();
    }
}
