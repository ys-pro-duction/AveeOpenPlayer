package com.daaw;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class YD implements KI0 {
    public final Drawable a;

    public YD(Drawable drawable) {
        if (drawable == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.a = drawable;
    }

    @Override // com.daaw.KI0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        return this.a.getConstantState().newDrawable();
    }
}
