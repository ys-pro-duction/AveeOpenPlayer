package com.daaw;

import android.graphics.Rect;

/* JADX INFO: renamed from: com.daaw.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6961o1 extends AbstractC6124l1 {
    public static C6961o1 h;
    public A21 c;
    public C8461tP0 d;
    public Rect e;
    public static final a f = new a(null);
    public static final int g = 8;
    public static final II0 i = II0.Rtl;
    public static final II0 j = II0.Ltr;

    /* JADX INFO: renamed from: com.daaw.o1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C6961o1 a() {
            if (C6961o1.h == null) {
                C6961o1.h = new C6961o1(null);
            }
            C6961o1 c6961o1 = C6961o1.h;
            if (c6961o1 != null) {
                return c6961o1;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
        }

        public a() {
        }
    }

    public /* synthetic */ C6961o1(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    private final int i(int i2, II0 ii0) {
        A21 a21 = this.c;
        A21 a212 = null;
        if (a21 == null) {
            G10.u("layoutResult");
            a21 = null;
        }
        int iN = a21.n(i2);
        A21 a213 = this.c;
        if (a213 == null) {
            G10.u("layoutResult");
            a213 = null;
        }
        if (ii0 != a213.r(iN)) {
            A21 a214 = this.c;
            if (a214 == null) {
                G10.u("layoutResult");
            } else {
                a212 = a214;
            }
            return a212.n(i2);
        }
        A21 a215 = this.c;
        if (a215 == null) {
            G10.u("layoutResult");
            a215 = null;
        }
        return A21.k(a215, i2, false, 2, null) - 1;
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] a(int i2) {
        int i3;
        A21 a21 = null;
        if (d().length() <= 0 || i2 >= d().length()) {
            return null;
        }
        try {
            C8461tP0 c8461tP0 = this.d;
            if (c8461tP0 == null) {
                G10.u("node");
                c8461tP0 = null;
            }
            int iB = AbstractC8261sh0.b(c8461tP0.f().e());
            int iD = AbstractC8417tE0.d(0, i2);
            A21 a212 = this.c;
            if (a212 == null) {
                G10.u("layoutResult");
                a212 = null;
            }
            int iL = a212.l(iD);
            A21 a213 = this.c;
            if (a213 == null) {
                G10.u("layoutResult");
                a213 = null;
            }
            float fO = a213.o(iL) + iB;
            A21 a214 = this.c;
            if (a214 == null) {
                G10.u("layoutResult");
                a214 = null;
            }
            A21 a215 = this.c;
            if (a215 == null) {
                G10.u("layoutResult");
                a215 = null;
            }
            if (fO < a214.o(a215.i() - 1)) {
                A21 a216 = this.c;
                if (a216 == null) {
                    G10.u("layoutResult");
                } else {
                    a21 = a216;
                }
                i3 = a21.m(fO);
            } else {
                A21 a217 = this.c;
                if (a217 == null) {
                    G10.u("layoutResult");
                } else {
                    a21 = a217;
                }
                i3 = a21.i();
            }
            return c(iD, i(i3 - 1, j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] b(int i2) {
        int iM;
        A21 a21 = null;
        if (d().length() <= 0 || i2 <= 0) {
            return null;
        }
        try {
            C8461tP0 c8461tP0 = this.d;
            if (c8461tP0 == null) {
                G10.u("node");
                c8461tP0 = null;
            }
            int iB = AbstractC8261sh0.b(c8461tP0.f().e());
            int iH = AbstractC8417tE0.h(d().length(), i2);
            A21 a212 = this.c;
            if (a212 == null) {
                G10.u("layoutResult");
                a212 = null;
            }
            int iL = a212.l(iH);
            A21 a213 = this.c;
            if (a213 == null) {
                G10.u("layoutResult");
                a213 = null;
            }
            float fO = a213.o(iL) - iB;
            if (fO > 0.0f) {
                A21 a214 = this.c;
                if (a214 == null) {
                    G10.u("layoutResult");
                } else {
                    a21 = a214;
                }
                iM = a21.m(fO);
            } else {
                iM = 0;
            }
            if (iH == d().length() && iM < iL) {
                iM++;
            }
            return c(i(iM, i), iH);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, A21 a21, C8461tP0 c8461tP0) {
        G10.g(str, "text");
        G10.g(a21, "layoutResult");
        G10.g(c8461tP0, "node");
        f(str);
        this.c = a21;
        this.d = c8461tP0;
    }

    public C6961o1() {
        this.e = new Rect();
    }
}
