package com.daaw;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public final class IJ0 extends View {
    public static final a G = new a(null);
    public static final int[] H = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] I = new int[0];
    public W91 B;
    public Boolean C;
    public Long D;
    public Runnable E;
    public LQ F;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IJ0(Context context) {
        super(context);
        G10.g(context, "context");
    }

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.E;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.D;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? H : I;
            W91 w91 = this.B;
            if (w91 != null) {
                w91.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: com.daaw.HJ0
                @Override // java.lang.Runnable
                public final void run() {
                    IJ0.m8setRippleState$lambda2(this.B);
                }
            };
            this.E = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.D = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m8setRippleState$lambda2(IJ0 ij0) {
        G10.g(ij0, "this$0");
        W91 w91 = ij0.B;
        if (w91 != null) {
            w91.setState(I);
        }
        ij0.E = null;
    }

    public final void b(C6115kz0 c6115kz0, boolean z, long j, int i, long j2, float f, LQ lq) {
        G10.g(c6115kz0, "interaction");
        G10.g(lq, "onInvalidateRipple");
        if (this.B == null || !G10.c(Boolean.valueOf(z), this.C)) {
            c(z);
            this.C = Boolean.valueOf(z);
        }
        W91 w91 = this.B;
        G10.d(w91);
        this.F = lq;
        f(j, i, j2, f);
        if (z) {
            w91.setHotspot(C9982yp0.l(c6115kz0.a()), C9982yp0.m(c6115kz0.a()));
        } else {
            w91.setHotspot(w91.getBounds().centerX(), w91.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c(boolean z) {
        W91 w91 = new W91(z);
        setBackground(w91);
        this.B = w91;
    }

    public final void d() {
        this.F = null;
        Runnable runnable = this.E;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.E;
            G10.d(runnable2);
            runnable2.run();
        } else {
            W91 w91 = this.B;
            if (w91 != null) {
                w91.setState(I);
            }
        }
        W91 w912 = this.B;
        if (w912 == null) {
            return;
        }
        w912.setVisible(false, false);
        unscheduleDrawable(w912);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j, int i, long j2, float f) {
        W91 w91 = this.B;
        if (w91 == null) {
            return;
        }
        w91.c(i);
        w91.b(j2, f);
        Rect rectA = AbstractC3660cF0.a(BT0.c(j));
        setLeft(rectA.left);
        setTop(rectA.top);
        setRight(rectA.right);
        setBottom(rectA.bottom);
        w91.setBounds(rectA);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        G10.g(drawable, "who");
        LQ lq = this.F;
        if (lq != null) {
            lq.invoke();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
