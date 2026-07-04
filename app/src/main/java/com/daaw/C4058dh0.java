package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: com.daaw.dh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4058dh0 extends D9 {
    public static final int H = SD0.m;
    public static final int[][] I = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList F;
    public boolean G;

    public C4058dh0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.G);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.F == null) {
            int iD = AbstractC3779ch0.d(this, JC0.e);
            int iD2 = AbstractC3779ch0.d(this, JC0.h);
            int iD3 = AbstractC3779ch0.d(this, JC0.k);
            int[][] iArr = I;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC3779ch0.j(iD3, iD, 1.0f);
            iArr2[1] = AbstractC3779ch0.j(iD3, iD2, 0.54f);
            iArr2[2] = AbstractC3779ch0.j(iD3, iD2, 0.38f);
            iArr2[3] = AbstractC3779ch0.j(iD3, iD2, 0.38f);
            this.F = new ColorStateList(iArr, iArr2);
        }
        return this.F;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G && AbstractC2467Up.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.G = z;
        if (z) {
            AbstractC2467Up.d(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC2467Up.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4058dh0(Context context, AttributeSet attributeSet, int i) {
        int i2 = H;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC3885d31.i(context2, attributeSet, WD0.g3, i, i2, new int[0]);
        if (typedArrayI.hasValue(WD0.h3)) {
            AbstractC2467Up.d(this, AbstractC4336eh0.a(context2, typedArrayI, WD0.h3));
        }
        this.G = typedArrayI.getBoolean(WD0.i3, false);
        typedArrayI.recycle();
    }
}
