package com.daaw;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.ni1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6873ni1 {
    public static final a e = new a(null);
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    /* JADX INFO: renamed from: com.daaw.ni1$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C6873ni1(CharSequence charSequence, int i, int i2, Locale locale) {
        G10.g(charSequence, "charSequence");
        this.a = charSequence;
        if (i < 0 || i > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        G10.f(wordInstance, "getWordInstance(locale)");
        this.d = wordInstance;
        this.b = Math.max(0, i - 50);
        this.c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new C9119vk(charSequence, i, i2));
    }
}
