package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.daaw.Iq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1201Iq0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View B;
    public ViewTreeObserver C;
    public final Runnable D;

    public ViewTreeObserverOnPreDrawListenerC1201Iq0(View view, Runnable runnable) {
        this.B = view;
        this.C = view.getViewTreeObserver();
        this.D = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC1201Iq0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC1201Iq0 viewTreeObserverOnPreDrawListenerC1201Iq0 = new ViewTreeObserverOnPreDrawListenerC1201Iq0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1201Iq0);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1201Iq0);
        return viewTreeObserverOnPreDrawListenerC1201Iq0;
    }

    public void b() {
        if (this.C.isAlive()) {
            this.C.removeOnPreDrawListener(this);
        } else {
            this.B.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.B.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.D.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.C = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
