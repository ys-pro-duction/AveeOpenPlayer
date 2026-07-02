package com.daaw;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: com.daaw.r41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnLongClickListenerC7814r41 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC7814r41 L;
    public static ViewOnLongClickListenerC7814r41 M;
    public final View B;
    public final CharSequence C;
    public final int D;
    public final Runnable E = new Runnable() { // from class: com.daaw.p41
        @Override // java.lang.Runnable
        public final void run() {
            this.B.h(false);
        }
    };
    public final Runnable F = new Runnable() { // from class: com.daaw.q41
        @Override // java.lang.Runnable
        public final void run() {
            this.B.d();
        }
    };
    public int G;
    public int H;
    public C8093s41 I;
    public boolean J;
    public boolean K;

    public ViewOnLongClickListenerC7814r41(View view, CharSequence charSequence) {
        this.B = view;
        this.C = charSequence;
        this.D = AbstractC3208ae1.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void f(ViewOnLongClickListenerC7814r41 viewOnLongClickListenerC7814r41) {
        ViewOnLongClickListenerC7814r41 viewOnLongClickListenerC7814r412 = L;
        if (viewOnLongClickListenerC7814r412 != null) {
            viewOnLongClickListenerC7814r412.b();
        }
        L = viewOnLongClickListenerC7814r41;
        if (viewOnLongClickListenerC7814r41 != null) {
            viewOnLongClickListenerC7814r41.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC7814r41 viewOnLongClickListenerC7814r41 = L;
        if (viewOnLongClickListenerC7814r41 != null && viewOnLongClickListenerC7814r41.B == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC7814r41(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC7814r41 viewOnLongClickListenerC7814r412 = M;
        if (viewOnLongClickListenerC7814r412 != null && viewOnLongClickListenerC7814r412.B == view) {
            viewOnLongClickListenerC7814r412.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.B.removeCallbacks(this.E);
    }

    public final void c() {
        this.K = true;
    }

    public void d() {
        if (M == this) {
            M = null;
            C8093s41 c8093s41 = this.I;
            if (c8093s41 != null) {
                c8093s41.c();
                this.I = null;
                c();
                this.B.removeOnAttachStateChangeListener(this);
            }
        }
        if (L == this) {
            f(null);
        }
        this.B.removeCallbacks(this.F);
    }

    public final void e() {
        this.B.postDelayed(this.E, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (this.B.isAttachedToWindow()) {
            f(null);
            ViewOnLongClickListenerC7814r41 viewOnLongClickListenerC7814r41 = M;
            if (viewOnLongClickListenerC7814r41 != null) {
                viewOnLongClickListenerC7814r41.d();
            }
            M = this;
            this.J = z;
            C8093s41 c8093s41 = new C8093s41(this.B.getContext());
            this.I = c8093s41;
            c8093s41.e(this.B, this.G, this.H, this.J, this.C);
            this.B.addOnAttachStateChangeListener(this);
            if (this.J) {
                j2 = 2500;
            } else {
                if ((AbstractC2317Td1.N(this.B) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.B.removeCallbacks(this.F);
            this.B.postDelayed(this.F, j2);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.K && Math.abs(x - this.G) <= this.D && Math.abs(y - this.H) <= this.D) {
            return false;
        }
        this.G = x;
        this.H = y;
        this.K = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.I != null && this.J) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.B.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.B.isEnabled() && this.I == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.G = view.getWidth() / 2;
        this.H = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
