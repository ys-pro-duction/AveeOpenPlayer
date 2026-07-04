package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.Ie1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1154Ie1 {
    public final WeakReference a;

    /* JADX INFO: renamed from: com.daaw.Ie1$a */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ InterfaceC1362Ke1 a;
        public final /* synthetic */ View b;

        public a(InterfaceC1362Ke1 interfaceC1362Ke1, View view) {
            this.a = interfaceC1362Ke1;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    public C1154Ie1(View view) {
        this.a = new WeakReference(view);
    }

    public C1154Ie1 b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1154Ie1 e(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public C1154Ie1 f(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1154Ie1 g(InterfaceC1362Ke1 interfaceC1362Ke1) {
        View view = (View) this.a.get();
        if (view != null) {
            h(view, interfaceC1362Ke1);
        }
        return this;
    }

    public final void h(View view, InterfaceC1362Ke1 interfaceC1362Ke1) {
        if (interfaceC1362Ke1 != null) {
            view.animate().setListener(new a(interfaceC1362Ke1, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1154Ie1 i(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public C1154Ie1 j(final InterfaceC1569Me1 interfaceC1569Me1) {
        final View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1569Me1 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: com.daaw.He1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC1569Me1.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1154Ie1 l(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
