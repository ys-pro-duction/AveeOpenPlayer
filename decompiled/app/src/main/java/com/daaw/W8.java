package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class W8 {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public W8(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable drawableA = AbstractC2467Up.a(this.a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = SD.r(drawableA).mutate();
                if (this.d) {
                    SD.o(drawableMutate, this.b);
                }
                if (this.e) {
                    SD.p(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.c;
    }

    public void d(AttributeSet attributeSet, int i) {
        int iN;
        int iN2;
        Z31 z31V = Z31.v(this.a.getContext(), attributeSet, AbstractC5060hE0.U0, i, 0);
        CompoundButton compoundButton = this.a;
        AbstractC2317Td1.n0(compoundButton, compoundButton.getContext(), AbstractC5060hE0.U0, attributeSet, z31V.r(), i, 0);
        try {
            if (z31V.s(AbstractC5060hE0.W0) && (iN2 = z31V.n(AbstractC5060hE0.W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(G9.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (z31V.s(AbstractC5060hE0.V0)) {
                        CompoundButton compoundButton3 = this.a;
                        compoundButton3.setButtonDrawable(G9.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (z31V.s(AbstractC5060hE0.V0) && (iN = z31V.n(AbstractC5060hE0.V0, 0)) != 0) {
                CompoundButton compoundButton32 = this.a;
                compoundButton32.setButtonDrawable(G9.b(compoundButton32.getContext(), iN));
            }
            if (z31V.s(AbstractC5060hE0.X0)) {
                AbstractC2467Up.d(this.a, z31V.c(AbstractC5060hE0.X0));
            }
            if (z31V.s(AbstractC5060hE0.Y0)) {
                AbstractC2467Up.e(this.a, AbstractC5059hE.e(z31V.k(AbstractC5060hE0.Y0, -1), null));
            }
            z31V.x();
        } catch (Throwable th) {
            z31V.x();
            throw th;
        }
    }

    public void e() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
