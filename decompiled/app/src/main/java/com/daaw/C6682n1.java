package com.daaw;

/* JADX INFO: renamed from: com.daaw.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6682n1 extends AbstractC6124l1 {
    public static C6682n1 f;
    public A21 c;
    public static final a d = new a(null);
    public static final int e = 8;
    public static final II0 g = II0.Rtl;
    public static final II0 h = II0.Ltr;

    /* JADX INFO: renamed from: com.daaw.n1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C6682n1 a() {
            if (C6682n1.f == null) {
                C6682n1.f = new C6682n1(null);
            }
            C6682n1 c6682n1 = C6682n1.f;
            if (c6682n1 != null) {
                return c6682n1;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
        }

        public a() {
        }
    }

    public /* synthetic */ C6682n1(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] a(int i) {
        int iL;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            A21 a21 = this.c;
            if (a21 == null) {
                G10.u("layoutResult");
                a21 = null;
            }
            iL = a21.l(0);
        } else {
            A21 a212 = this.c;
            if (a212 == null) {
                G10.u("layoutResult");
                a212 = null;
            }
            int iL2 = a212.l(i);
            iL = i(iL2, g) == i ? iL2 : iL2 + 1;
        }
        A21 a213 = this.c;
        if (a213 == null) {
            G10.u("layoutResult");
            a213 = null;
        }
        if (iL >= a213.i()) {
            return null;
        }
        return c(i(iL, g), i(iL, h) + 1);
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] b(int i) {
        int iL;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > d().length()) {
            A21 a21 = this.c;
            if (a21 == null) {
                G10.u("layoutResult");
                a21 = null;
            }
            iL = a21.l(d().length());
        } else {
            A21 a212 = this.c;
            if (a212 == null) {
                G10.u("layoutResult");
                a212 = null;
            }
            int iL2 = a212.l(i);
            iL = i(iL2, h) + 1 == i ? iL2 : iL2 - 1;
        }
        if (iL < 0) {
            return null;
        }
        return c(i(iL, g), i(iL, h) + 1);
    }

    public final int i(int i, II0 ii0) {
        A21 a21 = this.c;
        A21 a212 = null;
        if (a21 == null) {
            G10.u("layoutResult");
            a21 = null;
        }
        int iN = a21.n(i);
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
            return a212.n(i);
        }
        A21 a215 = this.c;
        if (a215 == null) {
            G10.u("layoutResult");
            a215 = null;
        }
        return A21.k(a215, i, false, 2, null) - 1;
    }

    public final void j(String str, A21 a21) {
        G10.g(str, "text");
        G10.g(a21, "layoutResult");
        f(str);
        this.c = a21;
    }

    public C6682n1() {
    }
}
