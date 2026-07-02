package com.daaw;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6403m1 extends AbstractC6124l1 {
    public static final a d = new a(null);
    public static final int e = 8;
    public static C6403m1 f;
    public BreakIterator c;

    /* JADX INFO: renamed from: com.daaw.m1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C6403m1 a(Locale locale) {
            G10.g(locale, "locale");
            if (C6403m1.f == null) {
                C6403m1.f = new C6403m1(locale, null);
            }
            C6403m1 c6403m1 = C6403m1.f;
            if (c6403m1 != null) {
                return c6403m1;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
        }

        public a() {
        }
    }

    public /* synthetic */ C6403m1(Locale locale, AbstractC2911Yw abstractC2911Yw) {
        this(locale);
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
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                G10.u("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    G10.u("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i, iFollowing);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                G10.u("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                G10.u("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    G10.u("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                G10.u("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
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

    public final void i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        G10.f(characterInstance, "getCharacterInstance(locale)");
        this.c = characterInstance;
    }

    public C6403m1(Locale locale) {
        i(locale);
    }
}
