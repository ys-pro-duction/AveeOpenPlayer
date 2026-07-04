package com.daaw;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.daaw.InterfaceC5418iY;

/* JADX INFO: renamed from: com.daaw.rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7938rY {
    public static final InterfaceC5418iY a(InterfaceC5418iY.a aVar, Resources resources, int i) {
        G10.g(aVar, "<this>");
        G10.g(resources, "res");
        Drawable drawable = resources.getDrawable(i, null);
        if (drawable == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        G10.f(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return S5.c(bitmap);
    }
}
