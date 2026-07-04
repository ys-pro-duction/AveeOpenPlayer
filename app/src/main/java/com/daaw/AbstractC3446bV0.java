package com.daaw;

import android.text.Spanned;

/* JADX INFO: renamed from: com.daaw.bV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3446bV0 {
    public static final boolean a(Spanned spanned, Class cls) {
        G10.g(spanned, "<this>");
        G10.g(cls, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(Spanned spanned, Class cls, int i, int i2) {
        G10.g(spanned, "<this>");
        G10.g(cls, "clazz");
        return spanned.nextSpanTransition(i - 1, i2, cls) != i2;
    }
}
