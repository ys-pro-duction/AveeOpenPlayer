package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.Ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0752Ei {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final C5671jR0 f;

    public C0752Ei(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C5671jR0 c5671jR0, Rect rect) {
        AbstractC8621ty0.d(rect.left);
        AbstractC8621ty0.d(rect.top);
        AbstractC8621ty0.d(rect.right);
        AbstractC8621ty0.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = c5671jR0;
    }

    public static C0752Ei a(Context context, int i) {
        AbstractC8621ty0.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, WD0.H2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(WD0.I2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(WD0.K2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(WD0.J2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(WD0.L2, 0));
        ColorStateList colorStateListA = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.M2);
        ColorStateList colorStateListA2 = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.R2);
        ColorStateList colorStateListA3 = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.P2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.Q2, 0);
        C5671jR0 c5671jR0M = C5671jR0.b(context, typedArrayObtainStyledAttributes.getResourceId(WD0.N2, 0), typedArrayObtainStyledAttributes.getResourceId(WD0.O2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new C0752Ei(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, c5671jR0M, rect);
    }

    public void b(TextView textView) {
        c(textView, null);
    }

    public void c(TextView textView, ColorStateList colorStateList) {
        C4904gh0 c4904gh0 = new C4904gh0();
        C4904gh0 c4904gh02 = new C4904gh0();
        c4904gh0.setShapeAppearanceModel(this.f);
        c4904gh02.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        c4904gh0.S(colorStateList);
        c4904gh0.X(this.e, this.d);
        textView.setTextColor(this.b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), c4904gh0, c4904gh02);
        Rect rect = this.a;
        AbstractC2317Td1.t0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
