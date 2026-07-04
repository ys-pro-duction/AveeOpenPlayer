package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class HJ extends AbstractC0638Df1 {

    public class a extends AbstractC8942v51 {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            AbstractC2841Ye1.g(this.a, 1.0f);
            AbstractC2841Ye1.a(this.a);
            abstractC8656u51.W(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {
        public final View a;
        public boolean b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2841Ye1.g(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AbstractC2317Td1.Q(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public HJ(int i) {
        p0(i);
    }

    public static float r0(B51 b51, float f) {
        Float f2;
        return (b51 == null || (f2 = (Float) b51.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // com.daaw.AbstractC0638Df1, com.daaw.AbstractC8656u51
    public void k(B51 b51) {
        super.k(b51);
        b51.a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC2841Ye1.c(b51.b)));
    }

    @Override // com.daaw.AbstractC0638Df1
    public Animator l0(ViewGroup viewGroup, View view, B51 b51, B51 b512) {
        float fR0 = r0(b51, 0.0f);
        return q0(view, fR0 != 1.0f ? fR0 : 0.0f, 1.0f);
    }

    @Override // com.daaw.AbstractC0638Df1
    public Animator n0(ViewGroup viewGroup, View view, B51 b51, B51 b512) {
        AbstractC2841Ye1.e(view);
        return q0(view, r0(b51, 1.0f), 0.0f);
    }

    public final Animator q0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC2841Ye1.g(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) AbstractC2841Ye1.b, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        b(new a(view));
        return objectAnimatorOfFloat;
    }

    public HJ() {
    }
}
