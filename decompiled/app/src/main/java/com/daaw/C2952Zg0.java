package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: com.daaw.Zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2952Zg0 {
    public static final boolean u;
    public static final boolean v;
    public final MaterialButton a;
    public C5671jR0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    static {
        int i = Build.VERSION.SDK_INT;
        u = true;
        v = i <= 22;
    }

    public C2952Zg0(MaterialButton materialButton, C5671jR0 c5671jR0) {
        this.a = materialButton;
        this.b = c5671jR0;
    }

    public void A(boolean z) {
        this.n = z;
        K();
    }

    public void B(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            K();
        }
    }

    public void C(int i) {
        if (this.h != i) {
            this.h = i;
            K();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                SD.o(f(), this.j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            SD.p(f(), this.i);
        }
    }

    public void F(boolean z) {
        this.r = z;
    }

    public final void G(int i, int i2) {
        int I = AbstractC2317Td1.I(this.a);
        int paddingTop = this.a.getPaddingTop();
        int iH = AbstractC2317Td1.H(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            H();
        }
        AbstractC2317Td1.E0(this.a, I, (paddingTop + i) - i3, iH, (paddingBottom + i2) - i4);
    }

    public final void H() {
        this.a.setInternalBackground(a());
        C4904gh0 c4904gh0F = f();
        if (c4904gh0F != null) {
            c4904gh0F.R(this.t);
            c4904gh0F.setState(this.a.getDrawableState());
        }
    }

    public final void I(C5671jR0 c5671jR0) {
        if (v && !this.o) {
            int I = AbstractC2317Td1.I(this.a);
            int paddingTop = this.a.getPaddingTop();
            int iH = AbstractC2317Td1.H(this.a);
            int paddingBottom = this.a.getPaddingBottom();
            H();
            AbstractC2317Td1.E0(this.a, I, paddingTop, iH, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(c5671jR0);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(c5671jR0);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(c5671jR0);
        }
    }

    public void J(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i2 - this.d, i - this.f);
        }
    }

    public final void K() {
        C4904gh0 c4904gh0F = f();
        C4904gh0 c4904gh0N = n();
        if (c4904gh0F != null) {
            c4904gh0F.X(this.h, this.k);
            if (c4904gh0N != null) {
                c4904gh0N.W(this.h, this.n ? AbstractC3779ch0.d(this.a, JC0.k) : 0);
            }
        }
    }

    public final InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    public final Drawable a() {
        C4904gh0 c4904gh0 = new C4904gh0(this.b);
        c4904gh0.I(this.a.getContext());
        SD.o(c4904gh0, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            SD.p(c4904gh0, mode);
        }
        c4904gh0.X(this.h, this.k);
        C4904gh0 c4904gh02 = new C4904gh0(this.b);
        c4904gh02.setTint(0);
        c4904gh02.W(this.h, this.n ? AbstractC3779ch0.d(this.a, JC0.k) : 0);
        if (u) {
            C4904gh0 c4904gh03 = new C4904gh0(this.b);
            this.m = c4904gh03;
            SD.n(c4904gh03, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(NJ0.b(this.l), L(new LayerDrawable(new Drawable[]{c4904gh02, c4904gh0})), this.m);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        FJ0 fj0 = new FJ0(this.b);
        this.m = fj0;
        SD.o(fj0, NJ0.b(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c4904gh02, c4904gh0, this.m});
        this.s = layerDrawable;
        return L(layerDrawable);
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public DR0 e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (DR0) this.s.getDrawable(2) : (DR0) this.s.getDrawable(1);
    }

    public C4904gh0 f() {
        return g(false);
    }

    public final C4904gh0 g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return u ? (C4904gh0) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (C4904gh0) this.s.getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.l;
    }

    public C5671jR0 i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.k;
    }

    public int k() {
        return this.h;
    }

    public ColorStateList l() {
        return this.j;
    }

    public PorterDuff.Mode m() {
        return this.i;
    }

    public final C4904gh0 n() {
        return g(true);
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.q;
    }

    public boolean q() {
        return this.r;
    }

    public void r(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(WD0.a2, 0);
        this.d = typedArray.getDimensionPixelOffset(WD0.b2, 0);
        this.e = typedArray.getDimensionPixelOffset(WD0.c2, 0);
        this.f = typedArray.getDimensionPixelOffset(WD0.d2, 0);
        if (typedArray.hasValue(WD0.h2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(WD0.h2, -1);
            this.g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(WD0.r2, 0);
        this.i = AbstractC2633We1.f(typedArray.getInt(WD0.g2, -1), PorterDuff.Mode.SRC_IN);
        this.j = AbstractC4336eh0.a(this.a.getContext(), typedArray, WD0.f2);
        this.k = AbstractC4336eh0.a(this.a.getContext(), typedArray, WD0.q2);
        this.l = AbstractC4336eh0.a(this.a.getContext(), typedArray, WD0.p2);
        this.q = typedArray.getBoolean(WD0.e2, false);
        this.t = typedArray.getDimensionPixelSize(WD0.i2, 0);
        this.r = typedArray.getBoolean(WD0.s2, true);
        int I = AbstractC2317Td1.I(this.a);
        int paddingTop = this.a.getPaddingTop();
        int iH = AbstractC2317Td1.H(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(WD0.Z1)) {
            t();
        } else {
            H();
        }
        AbstractC2317Td1.E0(this.a, I + this.c, paddingTop + this.e, iH + this.d, paddingBottom + this.f);
    }

    public void s(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    public void t() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    public void u(boolean z) {
        this.q = z;
    }

    public void v(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        z(this.b.w(i));
    }

    public void w(int i) {
        G(this.e, i);
    }

    public void x(int i) {
        G(i, this.f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = u;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(NJ0.b(colorStateList));
            } else {
                if (z || !(this.a.getBackground() instanceof FJ0)) {
                    return;
                }
                ((FJ0) this.a.getBackground()).setTintList(NJ0.b(colorStateList));
            }
        }
    }

    public void z(C5671jR0 c5671jR0) {
        this.b = c5671jR0;
        I(c5671jR0);
    }
}
