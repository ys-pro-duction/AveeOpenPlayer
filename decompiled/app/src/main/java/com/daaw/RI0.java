package com.daaw;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class RI0 {
    public static final RI0 a = new RI0();

    public final Typeface a(Context context, PI0 pi0) {
        G10.g(context, "context");
        G10.g(pi0, "font");
        Typeface font = context.getResources().getFont(pi0.d());
        G10.f(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
