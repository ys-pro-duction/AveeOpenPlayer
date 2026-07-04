package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: com.daaw.nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6867nh0 {
    public static final int[] a = {R.attr.theme, JC0.M};
    public static final int[] b = {JC0.v};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int iB = b(context, attributeSet, i, i2);
        boolean z = (context instanceof C0688Ds) && ((C0688Ds) context).c() == iB;
        if (iB == 0 || z) {
            return context;
        }
        C0688Ds c0688Ds = new C0688Ds(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            c0688Ds.getTheme().applyStyle(iA, true);
        }
        return c0688Ds;
    }
}
