package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.a;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC3931dD0;
import com.daaw.AbstractC3978dP;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6978o41;
import com.daaw.BD0;
import com.daaw.C5554j1;
import com.daaw.KC0;
import com.daaw.SD;
import com.daaw.X21;
import com.daaw.XI0;
import com.daaw.YC0;
import com.daaw.Z1;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends AbstractC3978dP implements j.a {
    public static final int[] j0 = {R.attr.state_checked};
    public int W;
    public boolean a0;
    public boolean b0;
    public final CheckedTextView c0;
    public FrameLayout d0;
    public g e0;
    public ColorStateList f0;
    public boolean g0;
    public Drawable h0;
    public final C5554j1 i0;

    public class a extends C5554j1 {
        public a() {
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            z1.l0(NavigationMenuItemView.this.b0);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.d0 == null) {
                this.d0 = (FrameLayout) ((ViewStub) findViewById(AbstractC5894kD0.e)).inflate();
            }
            this.d0.removeAllViews();
            this.d0.addView(view);
        }
    }

    public final void B() {
        if (E()) {
            this.c0.setVisibility(8);
            FrameLayout frameLayout = this.d0;
            if (frameLayout != null) {
                a.C0005a c0005a = (a.C0005a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0005a).width = -1;
                this.d0.setLayoutParams(c0005a);
                return;
            }
            return;
        }
        this.c0.setVisibility(0);
        FrameLayout frameLayout2 = this.d0;
        if (frameLayout2 != null) {
            a.C0005a c0005a2 = (a.C0005a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0005a2).width = -2;
            this.d0.setLayoutParams(c0005a2);
        }
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(KC0.t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(j0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void D() {
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.c0.setCompoundDrawables(null, null, null, null);
    }

    public final boolean E() {
        return this.e0.getTitle() == null && this.e0.getIcon() == null && this.e0.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void e(g gVar, int i) {
        this.e0 = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            AbstractC2317Td1.t0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        AbstractC6978o41.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.e0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.e0;
        if (gVar != null && gVar.isCheckable() && this.e0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, j0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.b0 != z) {
            this.b0 = z;
            this.i0.l(this.c0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.c0.setChecked(z);
        CheckedTextView checkedTextView = this.c0;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.g0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = SD.r(drawable).mutate();
                SD.o(drawable, this.f0);
            }
            int i = this.W;
            drawable.setBounds(0, 0, i, i);
        } else if (this.a0) {
            if (this.h0 == null) {
                Drawable drawableE = XI0.e(getResources(), AbstractC3931dD0.j, getContext().getTheme());
                this.h0 = drawableE;
                if (drawableE != null) {
                    int i2 = this.W;
                    drawableE.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.h0;
        }
        X21.i(this.c0, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.c0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.W = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f0 = colorStateList;
        this.g0 = colorStateList != null;
        g gVar = this.e0;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.c0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.a0 = z;
    }

    public void setTextAppearance(int i) {
        X21.o(this.c0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.c0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.c0.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.i0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(BD0.f, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(YC0.b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(AbstractC5894kD0.f);
        this.c0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC2317Td1.p0(checkedTextView, aVar);
    }
}
