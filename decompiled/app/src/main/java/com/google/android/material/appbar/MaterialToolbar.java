package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC5183hh0;
import com.daaw.AbstractC6699n41;
import com.daaw.AbstractC6867nh0;
import com.daaw.C4904gh0;
import com.daaw.JC0;
import com.daaw.SD;
import com.daaw.SD0;
import com.daaw.WD0;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    public static final int D0 = SD0.q;
    public static final ImageView.ScaleType[] E0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public boolean A0;
    public ImageView.ScaleType B0;
    public Boolean C0;
    public Integer y0;
    public boolean z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.N);
    }

    public final Pair U(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void V(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C4904gh0 c4904gh0 = new C4904gh0();
            c4904gh0.S(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c4904gh0.I(context);
            c4904gh0.R(AbstractC2317Td1.x(this));
            AbstractC2317Td1.t0(this, c4904gh0);
        }
    }

    public final void W(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    public final void X() {
        if (this.z0 || this.A0) {
            TextView textViewE = AbstractC6699n41.e(this);
            TextView textViewC = AbstractC6699n41.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairU = U(textViewE, textViewC);
            if (this.z0 && textViewE != null) {
                W(textViewE, pairU);
            }
            if (!this.A0 || textViewC == null) {
                return;
            }
            W(textViewC, pairU);
        }
    }

    public final Drawable Y(Drawable drawable) {
        if (drawable == null || this.y0 == null) {
            return drawable;
        }
        Drawable drawableR = SD.r(drawable.mutate());
        SD.n(drawableR, this.y0.intValue());
        return drawableR;
    }

    public final void Z() {
        ImageView imageViewB = AbstractC6699n41.b(this);
        if (imageViewB != null) {
            Boolean bool = this.C0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.B0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.B0;
    }

    public Integer getNavigationIconTint() {
        return this.y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC5183hh0.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        X();
        Z();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AbstractC5183hh0.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.C0;
        if (bool == null || bool.booleanValue() != z) {
            this.C0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.B0 != scaleType) {
            this.B0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Y(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.y0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void z(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof e;
        if (z) {
            ((e) menu).i0();
        }
        super.z(i);
        if (z) {
            ((e) menu).h0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = D0;
        super(AbstractC6867nh0.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC3885d31.i(context2, attributeSet, WD0.w3, i, i2, new int[0]);
        if (typedArrayI.hasValue(WD0.z3)) {
            setNavigationIconTint(typedArrayI.getColor(WD0.z3, -1));
        }
        this.z0 = typedArrayI.getBoolean(WD0.B3, false);
        this.A0 = typedArrayI.getBoolean(WD0.A3, false);
        int i3 = typedArrayI.getInt(WD0.y3, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = E0;
            if (i3 < scaleTypeArr.length) {
                this.B0 = scaleTypeArr[i3];
            }
        }
        if (typedArrayI.hasValue(WD0.x3)) {
            this.C0 = Boolean.valueOf(typedArrayI.getBoolean(WD0.x3, false));
        }
        typedArrayI.recycle();
        V(context2);
    }
}
