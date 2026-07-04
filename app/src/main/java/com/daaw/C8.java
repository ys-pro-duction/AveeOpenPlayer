package com.daaw;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes.dex */
public final class C8 {
    public static final C8 a = new C8();

    public final TypefaceSpan a(Typeface typeface) {
        G10.g(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
