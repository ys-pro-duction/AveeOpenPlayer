package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daaw.AbstractC1576Mg0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3049a31;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC8355t1;
import com.daaw.BD0;
import com.daaw.C1076Hl;
import com.daaw.C2383Tu;
import com.daaw.C4939go0;
import com.daaw.C5243ht0;
import com.daaw.EE;
import com.daaw.G9;
import com.daaw.IG;
import com.daaw.MX;
import com.daaw.N9;
import com.daaw.ND0;
import com.daaw.SD;
import com.daaw.WD0;
import com.daaw.X21;
import com.daaw.YC0;
import com.daaw.Z31;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class a extends LinearLayout {
    public final TextInputLayout B;
    public final FrameLayout C;
    public final CheckableImageButton D;
    public ColorStateList E;
    public PorterDuff.Mode F;
    public View.OnLongClickListener G;
    public final CheckableImageButton H;
    public final d I;
    public int J;
    public final LinkedHashSet K;
    public ColorStateList L;
    public PorterDuff.Mode M;
    public int N;
    public ImageView.ScaleType O;
    public View.OnLongClickListener P;
    public CharSequence Q;
    public final TextView R;
    public boolean S;
    public EditText T;
    public final AccessibilityManager U;
    public AbstractC8355t1.a V;
    public final TextWatcher W;
    public final TextInputLayout.g a0;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0268a extends AbstractC3049a31 {
        public C0268a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // com.daaw.AbstractC3049a31, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.m().b(charSequence, i, i2, i3);
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (a.this.T == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.T != null) {
                a.this.T.removeTextChangedListener(a.this.W);
                if (a.this.T.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.T.setOnFocusChangeListener(null);
                }
            }
            a.this.T = textInputLayout.getEditText();
            if (a.this.T != null) {
                a.this.T.addTextChangedListener(a.this.W);
            }
            a.this.m().n(a.this.T);
            a aVar = a.this;
            aVar.g0(aVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.L();
        }
    }

    public static class d {
        public final SparseArray a = new SparseArray();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, Z31 z31) {
            this.b = aVar;
            this.c = z31.n(WD0.r6, 0);
            this.d = z31.n(WD0.P6, 0);
        }

        public final IG b(int i) {
            if (i == -1) {
                return new C2383Tu(this.b);
            }
            if (i == 0) {
                return new C4939go0(this.b);
            }
            if (i == 1) {
                return new C5243ht0(this.b, this.d);
            }
            if (i == 2) {
                return new C1076Hl(this.b);
            }
            if (i == 3) {
                return new EE(this.b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        public IG c(int i) {
            IG ig = (IG) this.a.get(i);
            if (ig != null) {
                return ig;
            }
            IG igB = b(i);
            this.a.append(i, igB);
            return igB;
        }
    }

    public a(TextInputLayout textInputLayout, Z31 z31) {
        super(textInputLayout.getContext());
        this.J = 0;
        this.K = new LinkedHashSet();
        this.W = new C0268a();
        b bVar = new b();
        this.a0 = bVar;
        this.U = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.B = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.C = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, AbstractC5894kD0.I);
        this.D = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, AbstractC5894kD0.H);
        this.H = checkableImageButtonI2;
        this.I = new d(this, z31);
        N9 n9 = new N9(getContext());
        this.R = n9;
        B(z31);
        A(z31);
        C(z31);
        frameLayout.addView(checkableImageButtonI2);
        addView(n9);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.h(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public final void A(Z31 z31) {
        if (!z31.s(WD0.Q6)) {
            if (z31.s(WD0.v6)) {
                this.L = AbstractC4336eh0.b(getContext(), z31, WD0.v6);
            }
            if (z31.s(WD0.w6)) {
                this.M = AbstractC2633We1.f(z31.k(WD0.w6, -1), null);
            }
        }
        if (z31.s(WD0.t6)) {
            T(z31.k(WD0.t6, 0));
            if (z31.s(WD0.q6)) {
                P(z31.p(WD0.q6));
            }
            N(z31.a(WD0.p6, true));
        } else if (z31.s(WD0.Q6)) {
            if (z31.s(WD0.R6)) {
                this.L = AbstractC4336eh0.b(getContext(), z31, WD0.R6);
            }
            if (z31.s(WD0.S6)) {
                this.M = AbstractC2633We1.f(z31.k(WD0.S6, -1), null);
            }
            T(z31.a(WD0.Q6, false) ? 1 : 0);
            P(z31.p(WD0.O6));
        }
        S(z31.f(WD0.s6, getResources().getDimensionPixelSize(YC0.O)));
        if (z31.s(WD0.u6)) {
            W(MX.b(z31.k(WD0.u6, -1)));
        }
    }

    public final void B(Z31 z31) {
        if (z31.s(WD0.B6)) {
            this.E = AbstractC4336eh0.b(getContext(), z31, WD0.B6);
        }
        if (z31.s(WD0.C6)) {
            this.F = AbstractC2633We1.f(z31.k(WD0.C6, -1), null);
        }
        if (z31.s(WD0.A6)) {
            b0(z31.g(WD0.A6));
        }
        this.D.setContentDescription(getResources().getText(ND0.f));
        AbstractC2317Td1.z0(this.D, 2);
        this.D.setClickable(false);
        this.D.setPressable(false);
        this.D.setFocusable(false);
    }

    public final void C(Z31 z31) {
        this.R.setVisibility(8);
        this.R.setId(AbstractC5894kD0.O);
        this.R.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        AbstractC2317Td1.r0(this.R, 1);
        p0(z31.n(WD0.h7, 0));
        if (z31.s(WD0.i7)) {
            q0(z31.c(WD0.i7));
        }
        o0(z31.p(WD0.g7));
    }

    public boolean D() {
        return z() && this.H.isChecked();
    }

    public boolean E() {
        return this.C.getVisibility() == 0 && this.H.getVisibility() == 0;
    }

    public boolean F() {
        return this.D.getVisibility() == 0;
    }

    public void G(boolean z) {
        this.S = z;
        x0();
    }

    public void H() {
        v0();
        J();
        I();
        if (m().t()) {
            t0(this.B.Z());
        }
    }

    public void I() {
        MX.d(this.B, this.H, this.L);
    }

    public void J() {
        MX.d(this.B, this.D, this.E);
    }

    public void K(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean zIsChecked;
        IG igM = m();
        boolean z3 = true;
        if (!igM.l() || (zIsChecked = this.H.isChecked()) == igM.m()) {
            z2 = false;
        } else {
            this.H.setChecked(!zIsChecked);
            z2 = true;
        }
        if (!igM.j() || (zIsActivated = this.H.isActivated()) == igM.k()) {
            z3 = z2;
        } else {
            M(!zIsActivated);
        }
        if (z || z3) {
            I();
        }
    }

    public final void L() {
        AccessibilityManager accessibilityManager;
        AbstractC8355t1.a aVar = this.V;
        if (aVar == null || (accessibilityManager = this.U) == null) {
            return;
        }
        AbstractC8355t1.b(accessibilityManager, aVar);
    }

    public void M(boolean z) {
        this.H.setActivated(z);
    }

    public void N(boolean z) {
        this.H.setCheckable(z);
    }

    public void O(int i) {
        P(i != 0 ? getResources().getText(i) : null);
    }

    public void P(CharSequence charSequence) {
        if (l() != charSequence) {
            this.H.setContentDescription(charSequence);
        }
    }

    public void Q(int i) {
        R(i != 0 ? G9.b(getContext(), i) : null);
    }

    public void R(Drawable drawable) {
        this.H.setImageDrawable(drawable);
        if (drawable != null) {
            MX.a(this.B, this.H, this.L, this.M);
            I();
        }
    }

    public void S(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.N) {
            this.N = i;
            MX.g(this.H, i);
            MX.g(this.D, i);
        }
    }

    public void T(int i) {
        if (this.J == i) {
            return;
        }
        s0(m());
        int i2 = this.J;
        this.J = i;
        j(i2);
        Z(i != 0);
        IG igM = m();
        Q(t(igM));
        O(igM.c());
        N(igM.l());
        if (!igM.i(this.B.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.B.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        r0(igM);
        U(igM.f());
        EditText editText = this.T;
        if (editText != null) {
            igM.n(editText);
            g0(igM);
        }
        MX.a(this.B, this.H, this.L, this.M);
        K(true);
    }

    public void U(View.OnClickListener onClickListener) {
        MX.h(this.H, onClickListener, this.P);
    }

    public void V(View.OnLongClickListener onLongClickListener) {
        this.P = onLongClickListener;
        MX.i(this.H, onLongClickListener);
    }

    public void W(ImageView.ScaleType scaleType) {
        this.O = scaleType;
        MX.j(this.H, scaleType);
        MX.j(this.D, scaleType);
    }

    public void X(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            MX.a(this.B, this.H, colorStateList, this.M);
        }
    }

    public void Y(PorterDuff.Mode mode) {
        if (this.M != mode) {
            this.M = mode;
            MX.a(this.B, this.H, this.L, mode);
        }
    }

    public void Z(boolean z) {
        if (E() != z) {
            this.H.setVisibility(z ? 0 : 8);
            u0();
            w0();
            this.B.k0();
        }
    }

    public void a0(int i) {
        b0(i != 0 ? G9.b(getContext(), i) : null);
        J();
    }

    public void b0(Drawable drawable) {
        this.D.setImageDrawable(drawable);
        v0();
        MX.a(this.B, this.D, this.E, this.F);
    }

    public void c0(View.OnClickListener onClickListener) {
        MX.h(this.D, onClickListener, this.G);
    }

    public void d0(View.OnLongClickListener onLongClickListener) {
        this.G = onLongClickListener;
        MX.i(this.D, onLongClickListener);
    }

    public void e0(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            MX.a(this.B, this.D, colorStateList, this.F);
        }
    }

    public void f0(PorterDuff.Mode mode) {
        if (this.F != mode) {
            this.F = mode;
            MX.a(this.B, this.D, this.E, mode);
        }
    }

    public final void g() {
        if (this.V == null || this.U == null || !AbstractC2317Td1.T(this)) {
            return;
        }
        AbstractC8355t1.a(this.U, this.V);
    }

    public final void g0(IG ig) {
        if (this.T == null) {
            return;
        }
        if (ig.e() != null) {
            this.T.setOnFocusChangeListener(ig.e());
        }
        if (ig.g() != null) {
            this.H.setOnFocusChangeListener(ig.g());
        }
    }

    public void h() {
        this.H.performClick();
        this.H.jumpDrawablesToCurrentState();
    }

    public void h0(int i) {
        i0(i != 0 ? getResources().getText(i) : null);
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(BD0.g, viewGroup, false);
        checkableImageButton.setId(i);
        MX.e(checkableImageButton);
        if (AbstractC4336eh0.g(getContext())) {
            AbstractC1576Mg0.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(CharSequence charSequence) {
        this.H.setContentDescription(charSequence);
    }

    public final void j(int i) {
        Iterator it = this.K.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    public void j0(int i) {
        k0(i != 0 ? G9.b(getContext(), i) : null);
    }

    public CheckableImageButton k() {
        if (F()) {
            return this.D;
        }
        if (z() && E()) {
            return this.H;
        }
        return null;
    }

    public void k0(Drawable drawable) {
        this.H.setImageDrawable(drawable);
    }

    public CharSequence l() {
        return this.H.getContentDescription();
    }

    public void l0(boolean z) {
        if (z && this.J != 1) {
            T(1);
        } else {
            if (z) {
                return;
            }
            T(0);
        }
    }

    public IG m() {
        return this.I.c(this.J);
    }

    public void m0(ColorStateList colorStateList) {
        this.L = colorStateList;
        MX.a(this.B, this.H, colorStateList, this.M);
    }

    public Drawable n() {
        return this.H.getDrawable();
    }

    public void n0(PorterDuff.Mode mode) {
        this.M = mode;
        MX.a(this.B, this.H, this.L, mode);
    }

    public int o() {
        return this.N;
    }

    public void o0(CharSequence charSequence) {
        this.Q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.R.setText(charSequence);
        x0();
    }

    public int p() {
        return this.J;
    }

    public void p0(int i) {
        X21.o(this.R, i);
    }

    public ImageView.ScaleType q() {
        return this.O;
    }

    public void q0(ColorStateList colorStateList) {
        this.R.setTextColor(colorStateList);
    }

    public CheckableImageButton r() {
        return this.H;
    }

    public final void r0(IG ig) {
        ig.s();
        this.V = ig.h();
        g();
    }

    public Drawable s() {
        return this.D.getDrawable();
    }

    public final void s0(IG ig) {
        L();
        this.V = null;
        ig.u();
    }

    public final int t(IG ig) {
        int i = this.I.c;
        return i == 0 ? ig.d() : i;
    }

    public final void t0(boolean z) {
        if (!z || n() == null) {
            MX.a(this.B, this.H, this.L, this.M);
            return;
        }
        Drawable drawableMutate = SD.r(n()).mutate();
        SD.n(drawableMutate, this.B.getErrorCurrentTextColors());
        this.H.setImageDrawable(drawableMutate);
    }

    public CharSequence u() {
        return this.H.getContentDescription();
    }

    public final void u0() {
        this.C.setVisibility((this.H.getVisibility() != 0 || F()) ? 8 : 0);
        setVisibility((E() || F() || ((this.Q == null || this.S) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public Drawable v() {
        return this.H.getDrawable();
    }

    public final void v0() {
        this.D.setVisibility(s() != null && this.B.M() && this.B.Z() ? 0 : 8);
        u0();
        w0();
        if (z()) {
            return;
        }
        this.B.k0();
    }

    public CharSequence w() {
        return this.Q;
    }

    public void w0() {
        if (this.B.E == null) {
            return;
        }
        AbstractC2317Td1.E0(this.R, getContext().getResources().getDimensionPixelSize(YC0.y), this.B.E.getPaddingTop(), (E() || F()) ? 0 : AbstractC2317Td1.H(this.B.E), this.B.E.getPaddingBottom());
    }

    public ColorStateList x() {
        return this.R.getTextColors();
    }

    public final void x0() {
        int visibility = this.R.getVisibility();
        int i = (this.Q == null || this.S) ? 8 : 0;
        if (visibility != i) {
            m().q(i == 0);
        }
        u0();
        this.R.setVisibility(i);
        this.B.k0();
    }

    public TextView y() {
        return this.R;
    }

    public boolean z() {
        return this.J != 0;
    }
}
