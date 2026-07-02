package com.daaw;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7797r1 extends AbstractC6124l1 {
    public static final a d = new a(null);
    public static final int e = 8;
    public static C7797r1 f;
    public BreakIterator c;

    /* JADX INFO: renamed from: com.daaw.r1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C7797r1 a(Locale locale) {
            G10.g(locale, "locale");
            if (C7797r1.f == null) {
                C7797r1.f = new C7797r1(locale, null);
            }
            C7797r1 c7797r1 = C7797r1.f;
            if (c7797r1 != null) {
                return c7797r1;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
        }

        public a() {
        }
    }

    public /* synthetic */ C7797r1(Locale locale, AbstractC2911Yw abstractC2911Yw) {
        this(locale);
    }

    private final boolean i(int i) {
        if (i <= 0 || !j(i - 1)) {
            return false;
        }
        return i == d().length() || !j(i);
    }

    private final boolean k(int i) {
        if (j(i)) {
            return i == 0 || !j(i - 1);
        }
        return false;
    }

    private final void l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        G10.f(wordInstance, "getWordInstance(locale)");
        this.c = wordInstance;
    }

    @Override // com.daaw.InterfaceC7519q1
    public int[] a(int i) {
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!j(i) && !k(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                G10.u("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            G10.u("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i, iFollowing);
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
        while (i > 0 && !j(i - 1) && !i(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                G10.u("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            G10.u("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i);
    }

    @Override // com.daaw.AbstractC6124l1
    public void e(String str) {
        G10.g(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.c;
        if (breakIterator == null) {
            G10.u("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    public final boolean j(int i) {
        if (i < 0 || i >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i));
    }

    public C7797r1(Locale locale) {
        l(locale);
    }
}
