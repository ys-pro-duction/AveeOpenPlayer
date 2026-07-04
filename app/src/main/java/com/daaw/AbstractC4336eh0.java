package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: renamed from: com.daaw.eh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4336eh0 {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListA = G9.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListA;
    }

    public static ColorStateList b(Context context, Z31 z31, int i) {
        int iN;
        ColorStateList colorStateListA;
        return (!z31.s(i) || (iN = z31.n(i, 0)) == 0 || (colorStateListA = G9.a(context, iN)) == null) ? z31.c(i) : colorStateListA;
    }

    public static int c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableB = G9.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableB;
    }

    public static int e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static L11 f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new L11(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
