package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class V8 {
    public final CheckedTextView a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public V8(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = AbstractC0760Ek.a(this.a);
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
                this.a.setCheckMarkDrawable(drawableMutate);
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
        Z31 z31V = Z31.v(this.a.getContext(), attributeSet, AbstractC5060hE0.P0, i, 0);
        CheckedTextView checkedTextView = this.a;
        AbstractC2317Td1.n0(checkedTextView, checkedTextView.getContext(), AbstractC5060hE0.P0, attributeSet, z31V.r(), i, 0);
        try {
            if (z31V.s(AbstractC5060hE0.R0) && (iN2 = z31V.n(AbstractC5060hE0.R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.a;
                    checkedTextView2.setCheckMarkDrawable(G9.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (z31V.s(AbstractC5060hE0.Q0)) {
                        CheckedTextView checkedTextView3 = this.a;
                        checkedTextView3.setCheckMarkDrawable(G9.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (z31V.s(AbstractC5060hE0.Q0) && (iN = z31V.n(AbstractC5060hE0.Q0, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.a;
                checkedTextView32.setCheckMarkDrawable(G9.b(checkedTextView32.getContext(), iN));
            }
            if (z31V.s(AbstractC5060hE0.S0)) {
                AbstractC0760Ek.b(this.a, z31V.c(AbstractC5060hE0.S0));
            }
            if (z31V.s(AbstractC5060hE0.T0)) {
                AbstractC0760Ek.c(this.a, AbstractC5059hE.e(z31V.k(AbstractC5060hE0.T0, -1), null));
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
