package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.daaw.Hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1076Hl extends IG {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final View.OnClickListener j;
    public final View.OnFocusChangeListener k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* JADX INFO: renamed from: com.daaw.Hl$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1076Hl.this.b.Z(true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hl$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1076Hl.this.b.Z(false);
        }
    }

    public C1076Hl(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.j = new View.OnClickListener() { // from class: com.daaw.Cl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1076Hl.v(this.B, view);
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: com.daaw.Dl
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C1076Hl c1076Hl = this.a;
                c1076Hl.A(c1076Hl.E());
            }
        };
        this.e = AbstractC10241zl0.f(aVar.getContext(), JC0.z, 100);
        this.f = AbstractC10241zl0.f(aVar.getContext(), JC0.z, 150);
        this.g = AbstractC10241zl0.g(aVar.getContext(), JC0.D, AbstractC6991o7.a);
        this.h = AbstractC10241zl0.g(aVar.getContext(), JC0.C, AbstractC6991o7.d);
    }

    public static /* synthetic */ void v(C1076Hl c1076Hl, View view) {
        EditText editText = c1076Hl.i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c1076Hl.r();
    }

    public static /* synthetic */ void x(C1076Hl c1076Hl, ValueAnimator valueAnimator) {
        c1076Hl.getClass();
        c1076Hl.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(C1076Hl c1076Hl, ValueAnimator valueAnimator) {
        c1076Hl.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1076Hl.d.setScaleX(fFloatValue);
        c1076Hl.d.setScaleY(fFloatValue);
    }

    public final void A(boolean z) {
        boolean z2 = this.b.E() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.setDuration(this.e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.El
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1076Hl.x(this.a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.Gl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1076Hl.y(this.a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }

    @Override // com.daaw.IG
    public void a(Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.daaw.IG
    public int c() {
        return ND0.e;
    }

    @Override // com.daaw.IG
    public int d() {
        return AbstractC3931dD0.i;
    }

    @Override // com.daaw.IG
    public View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.daaw.IG
    public View.OnClickListener f() {
        return this.j;
    }

    @Override // com.daaw.IG
    public View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.daaw.IG
    public void n(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(E());
    }

    @Override // com.daaw.IG
    public void q(boolean z) {
        if (this.b.w() == null) {
            return;
        }
        A(z);
    }

    @Override // com.daaw.IG
    public void s() {
        D();
    }

    @Override // com.daaw.IG
    public void u() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.daaw.Fl
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.A(true);
                }
            });
        }
    }
}
