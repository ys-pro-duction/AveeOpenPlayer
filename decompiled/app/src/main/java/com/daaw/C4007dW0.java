package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: com.daaw.dW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4007dW0 extends LinearLayout {
    public final TextInputLayout B;
    public final TextView C;
    public CharSequence D;
    public final CheckableImageButton E;
    public ColorStateList F;
    public PorterDuff.Mode G;
    public int H;
    public ImageView.ScaleType I;
    public View.OnLongClickListener J;
    public boolean K;

    public C4007dW0(TextInputLayout textInputLayout, Z31 z31) {
        super(textInputLayout.getContext());
        this.B = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(BD0.h, (ViewGroup) this, false);
        this.E = checkableImageButton;
        MX.e(checkableImageButton);
        N9 n9 = new N9(getContext());
        this.C = n9;
        i(z31);
        h(z31);
        addView(checkableImageButton);
        addView(n9);
    }

    public void A() {
        EditText editText = this.B.E;
        if (editText == null) {
            return;
        }
        AbstractC2317Td1.E0(this.C, j() ? 0 : AbstractC2317Td1.I(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(YC0.y), editText.getCompoundPaddingBottom());
    }

    public final void B() {
        int i = (this.D == null || this.K) ? 8 : 0;
        setVisibility((this.E.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.C.setVisibility(i);
        this.B.k0();
    }

    public CharSequence a() {
        return this.D;
    }

    public ColorStateList b() {
        return this.C.getTextColors();
    }

    public TextView c() {
        return this.C;
    }

    public CharSequence d() {
        return this.E.getContentDescription();
    }

    public Drawable e() {
        return this.E.getDrawable();
    }

    public int f() {
        return this.H;
    }

    public ImageView.ScaleType g() {
        return this.I;
    }

    public final void h(Z31 z31) {
        this.C.setVisibility(8);
        this.C.setId(AbstractC5894kD0.N);
        this.C.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        AbstractC2317Td1.r0(this.C, 1);
        n(z31.n(WD0.X6, 0));
        if (z31.s(WD0.Y6)) {
            o(z31.c(WD0.Y6));
        }
        m(z31.p(WD0.W6));
    }

    public final void i(Z31 z31) {
        if (AbstractC4336eh0.g(getContext())) {
            AbstractC1576Mg0.b((ViewGroup.MarginLayoutParams) this.E.getLayoutParams(), 0);
        }
        t(null);
        u(null);
        if (z31.s(WD0.e7)) {
            this.F = AbstractC4336eh0.b(getContext(), z31, WD0.e7);
        }
        if (z31.s(WD0.f7)) {
            this.G = AbstractC2633We1.f(z31.k(WD0.f7, -1), null);
        }
        if (z31.s(WD0.b7)) {
            r(z31.g(WD0.b7));
            if (z31.s(WD0.a7)) {
                q(z31.p(WD0.a7));
            }
            p(z31.a(WD0.Z6, true));
        }
        s(z31.f(WD0.c7, getResources().getDimensionPixelSize(YC0.O)));
        if (z31.s(WD0.d7)) {
            v(MX.b(z31.k(WD0.d7, -1)));
        }
    }

    public boolean j() {
        return this.E.getVisibility() == 0;
    }

    public void k(boolean z) {
        this.K = z;
        B();
    }

    public void l() {
        MX.d(this.B, this.E, this.F);
    }

    public void m(CharSequence charSequence) {
        this.D = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.C.setText(charSequence);
        B();
    }

    public void n(int i) {
        X21.o(this.C, i);
    }

    public void o(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        A();
    }

    public void p(boolean z) {
        this.E.setCheckable(z);
    }

    public void q(CharSequence charSequence) {
        if (d() != charSequence) {
            this.E.setContentDescription(charSequence);
        }
    }

    public void r(Drawable drawable) {
        this.E.setImageDrawable(drawable);
        if (drawable != null) {
            MX.a(this.B, this.E, this.F, this.G);
            y(true);
            l();
        } else {
            y(false);
            t(null);
            u(null);
            q(null);
        }
    }

    public void s(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.H) {
            this.H = i;
            MX.g(this.E, i);
        }
    }

    public void t(View.OnClickListener onClickListener) {
        MX.h(this.E, onClickListener, this.J);
    }

    public void u(View.OnLongClickListener onLongClickListener) {
        this.J = onLongClickListener;
        MX.i(this.E, onLongClickListener);
    }

    public void v(ImageView.ScaleType scaleType) {
        this.I = scaleType;
        MX.j(this.E, scaleType);
    }

    public void w(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            MX.a(this.B, this.E, colorStateList, this.G);
        }
    }

    public void x(PorterDuff.Mode mode) {
        if (this.G != mode) {
            this.G = mode;
            MX.a(this.B, this.E, this.F, mode);
        }
    }

    public void y(boolean z) {
        if (j() != z) {
            this.E.setVisibility(z ? 0 : 8);
            A();
            B();
        }
    }

    public void z(Z1 z1) {
        if (this.C.getVisibility() != 0) {
            z1.V0(this.E);
        } else {
            z1.A0(this.C);
            z1.V0(this.C);
        }
    }
}
