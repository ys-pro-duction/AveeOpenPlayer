package com.daaw;

import android.graphics.Typeface;

/* JADX INFO: renamed from: com.daaw.b91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3358b91 {
    public static final C3358b91 a = new C3358b91();

    public final Typeface a(Typeface typeface, int i, boolean z) {
        G10.g(typeface, "typeface");
        Typeface typefaceCreate = Typeface.create(typeface, i, z);
        G10.f(typefaceCreate, "create(typeface, finalFontWeight, finalFontStyle)");
        return typefaceCreate;
    }
}
