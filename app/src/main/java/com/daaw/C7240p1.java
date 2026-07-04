package com.daaw;

/* JADX INFO: renamed from: com.daaw.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7240p1 extends AbstractC6124l1 {
    public static final a c = new a(null);
    public static C7240p1 d;

    /* JADX INFO: renamed from: com.daaw.p1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C7240p1 a() {
            if (C7240p1.d == null) {
                C7240p1.d = new C7240p1(null);
            }
            C7240p1 c7240p1 = C7240p1.d;
            if (c7240p1 != null) {
                return c7240p1;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
        }

        public a() {
        }
    }

    public /* synthetic */ C7240p1(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && d().charAt(i) == '\n' && !j(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !i(i2)) {
            i2++;
        }
        return c(i, i2);
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && d().charAt(i - 1) == '\n' && !i(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !j(i2)) {
            i2--;
        }
        return c(i2, i);
    }

    public final boolean i(int i) {
        if (i <= 0 || d().charAt(i - 1) == '\n') {
            return false;
        }
        return i == d().length() || d().charAt(i) == '\n';
    }

    public final boolean j(int i) {
        if (d().charAt(i) != '\n') {
            return i == 0 || d().charAt(i - 1) == '\n';
        }
        return false;
    }

    public C7240p1() {
    }
}
