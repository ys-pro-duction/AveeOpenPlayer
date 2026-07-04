package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: com.daaw.kh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6021kh0 extends N9 {
    public C6021kh0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean u(Context context) {
        return AbstractC2744Xg0.b(context, JC0.K, true);
    }

    public static int v(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, WD0.r3, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(WD0.s3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int x(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i = 0; i < iArr.length && iC < 0; i++) {
            iC = AbstractC4336eh0.c(context, typedArray, iArr[i], -1);
        }
        return iC;
    }

    public static boolean y(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, WD0.r3, i, i2);
        int iX = x(context, typedArrayObtainStyledAttributes, WD0.t3, WD0.u3);
        typedArrayObtainStyledAttributes.recycle();
        return iX != -1;
    }

    public final void s(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, WD0.n3);
        int iX = x(getContext(), typedArrayObtainStyledAttributes, WD0.p3, WD0.q3);
        typedArrayObtainStyledAttributes.recycle();
        if (iX >= 0) {
            setLineHeight(iX);
        }
    }

    @Override // com.daaw.N9, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (u(context)) {
            s(context.getTheme(), i);
        }
    }

    public final void w(AttributeSet attributeSet, int i, int i2) {
        int iV;
        Context context = getContext();
        if (u(context)) {
            Resources.Theme theme = context.getTheme();
            if (y(context, theme, attributeSet, i, i2) || (iV = v(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            s(theme, iV);
        }
    }

    public C6021kh0(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC6867nh0.c(context, attributeSet, i, 0), attributeSet, i);
        w(attributeSet, i, 0);
    }
}
