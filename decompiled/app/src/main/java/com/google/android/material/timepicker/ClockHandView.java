package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.daaw.AbstractC10241zl0;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC6991o7;
import com.daaw.AbstractC8819uh0;
import com.daaw.JC0;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.YC0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {
    public final int B;
    public final TimeInterpolator C;
    public final ValueAnimator D;
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public final int I;
    public boolean J;
    public final List K;
    public final int L;
    public final float M;
    public final Paint N;
    public final RectF O;
    public final int P;
    public float Q;
    public boolean R;
    public double S;
    public int T;
    public int U;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.u);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(b bVar) {
        this.K.add(bVar);
    }

    public final void c(float f, float f2) {
        this.U = AbstractC8819uh0.a((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) h(2)) + AbstractC2633We1.b(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fH = h(this.U);
        float fCos = (((float) Math.cos(this.S)) * fH) + f;
        float f2 = height;
        float fSin = (fH * ((float) Math.sin(this.S))) + f2;
        this.N.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.L, this.N);
        double dSin = Math.sin(this.S);
        double dCos = Math.cos(this.S);
        this.N.setStrokeWidth(this.P);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.N);
        canvas.drawCircle(f, f2, this.M, this.N);
    }

    public RectF e() {
        return this.O;
    }

    public final int f(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public float g() {
        return this.Q;
    }

    public final int h(int i) {
        return i == 2 ? Math.round(this.T * 0.66f) : this.T;
    }

    public int i() {
        return this.L;
    }

    public final Pair j(float f) {
        float fG = g();
        if (Math.abs(fG - f) > 180.0f) {
            if (fG > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (fG < 180.0f && f > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f));
    }

    public final boolean k(float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3 = f(f, f2);
        boolean z4 = false;
        boolean z5 = g() != f3;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.E) {
            z4 = true;
        }
        n(f3, z4);
        return true;
    }

    public void l(int i) {
        this.T = i;
        invalidate();
    }

    public void m(float f) {
        n(f, false);
    }

    public void n(float f, boolean z) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            o(f, false);
            return;
        }
        Pair pairJ = j(f);
        this.D.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.D.setDuration(this.B);
        this.D.setInterpolator(this.C);
        this.D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.a, valueAnimator2);
            }
        });
        this.D.addListener(new a());
        this.D.start();
    }

    public final void o(float f, boolean z) {
        float f2 = f % 360.0f;
        this.Q = f2;
        this.S = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.U);
        float fCos = width + (((float) Math.cos(this.S)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.S)));
        RectF rectF = this.O;
        int i = this.L;
        rectF.set(fCos - i, fSin - i, fCos + i, fSin + i);
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.D.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.F = x;
            this.G = y;
            this.H = true;
            this.R = false;
            z = false;
            z2 = true;
        } else {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.F);
                int i2 = (int) (y - this.G);
                this.H = (i * i) + (i2 * i2) > this.I;
                z = this.R;
                boolean z4 = actionMasked == 1;
                if (this.J) {
                    c(x, y);
                }
                z3 = z4;
                z2 = false;
                this.R |= k(x, y, z, z2, z3);
                return true;
            }
            z = false;
            z2 = false;
        }
        z3 = false;
        this.R |= k(x, y, z, z2, z3);
        return true;
    }

    public void p(boolean z) {
        if (this.J && !z) {
            this.U = 1;
        }
        this.J = z;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = new ValueAnimator();
        this.K = new ArrayList();
        Paint paint = new Paint();
        this.N = paint;
        this.O = new RectF();
        this.U = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WD0.U0, i, SD0.p);
        this.B = AbstractC10241zl0.f(context, JC0.w, RCHTTPStatusCodes.SUCCESS);
        this.C = AbstractC10241zl0.g(context, JC0.C, AbstractC6991o7.b);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.W0, 0);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.X0, 0);
        this.P = getResources().getDimensionPixelSize(YC0.n);
        this.M = r7.getDimensionPixelSize(YC0.l);
        int color = typedArrayObtainStyledAttributes.getColor(WD0.V0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.I = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC2317Td1.z0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
