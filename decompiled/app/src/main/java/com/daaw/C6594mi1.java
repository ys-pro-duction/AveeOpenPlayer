package com.daaw;

import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.mi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6594mi1 {
    public final C6873ni1 a;

    public C6594mi1(Locale locale, CharSequence charSequence) {
        G10.g(locale, "locale");
        G10.g(charSequence, "text");
        this.a = new C6873ni1(charSequence, 0, charSequence.length(), locale);
    }
}
