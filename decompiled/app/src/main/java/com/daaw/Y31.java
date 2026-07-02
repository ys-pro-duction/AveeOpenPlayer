package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class Y31 extends AbstractC3398bJ0 {
    public final WeakReference b;

    public Y31(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawableA = a(i);
        Context context = (Context) this.b.get();
        if (drawableA != null && context != null) {
            TI0.h().x(context, i, drawableA);
        }
        return drawableA;
    }
}
