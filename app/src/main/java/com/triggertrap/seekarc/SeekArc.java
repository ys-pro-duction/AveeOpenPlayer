package com.triggertrap.seekarc;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.AbstractC3374bD0;
import com.daaw.AbstractC4781gE0;
import com.daaw.IC0;
import com.daaw.PC0;

/* JADX INFO: loaded from: classes3.dex */
public class SeekArc extends View {
    public static int c0 = -1;
    public final int B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public float O;
    public RectF P;
    public Paint Q;
    public Paint R;
    public int S;
    public int T;
    public int U;
    public int V;
    public double W;
    public float a0;
    public a b0;

    public interface a {
        void a(SeekArc seekArc);

        void b(SeekArc seekArc);

        void c(SeekArc seekArc, int i, boolean z);
    }

    public SeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = -90;
        this.D = 100;
        this.E = 0;
        this.F = 4;
        this.G = 2;
        this.H = 0;
        this.I = 360;
        this.J = 0;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = 0;
        this.O = 0.0f;
        this.P = new RectF();
        d(context, attributeSet, IC0.j);
    }

    public final int a(double d) {
        int iRound = (int) Math.round(((double) k()) * d);
        if (iRound < 0) {
            iRound = c0;
        }
        return iRound > this.D ? c0 : iRound;
    }

    public final double b(float f, float f2) {
        float f3 = f - this.S;
        float f4 = f2 - this.T;
        if (!this.M) {
            f3 = -f3;
        }
        double degrees = Math.toDegrees((Math.atan2(f4, f3) + 1.5707963267948966d) - Math.toRadians(this.J));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        return degrees - ((double) this.H);
    }

    public final boolean c(float f, float f2) {
        float f3 = f - this.S;
        float f4 = f2 - this.T;
        return ((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) < this.a0;
    }

    public final void d(Context context, AttributeSet attributeSet, int i) {
        Resources resources = getResources();
        float f = context.getResources().getDisplayMetrics().density;
        int color = resources.getColor(PC0.c);
        int color2 = resources.getColor(R.color.holo_blue_light);
        this.C = resources.getDrawable(AbstractC3374bD0.w0);
        this.F = (int) (this.F * f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4781gE0.h, i, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(AbstractC4781gE0.t);
            if (drawable != null) {
                this.C = drawable;
            }
            int intrinsicHeight = this.C.getIntrinsicHeight() / 2;
            int intrinsicWidth = this.C.getIntrinsicWidth() / 2;
            this.C.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
            this.D = typedArrayObtainStyledAttributes.getInteger(AbstractC4781gE0.l, this.D);
            this.E = typedArrayObtainStyledAttributes.getInteger(AbstractC4781gE0.m, this.E);
            this.F = (int) typedArrayObtainStyledAttributes.getDimension(AbstractC4781gE0.o, this.F);
            this.G = (int) typedArrayObtainStyledAttributes.getDimension(AbstractC4781gE0.j, this.G);
            this.H = typedArrayObtainStyledAttributes.getInt(AbstractC4781gE0.r, this.H);
            this.I = typedArrayObtainStyledAttributes.getInt(AbstractC4781gE0.s, this.I);
            this.J = typedArrayObtainStyledAttributes.getInt(AbstractC4781gE0.p, this.J);
            this.K = typedArrayObtainStyledAttributes.getBoolean(AbstractC4781gE0.q, this.K);
            this.L = typedArrayObtainStyledAttributes.getBoolean(AbstractC4781gE0.u, this.L);
            this.M = typedArrayObtainStyledAttributes.getBoolean(AbstractC4781gE0.k, this.M);
            color = typedArrayObtainStyledAttributes.getColor(AbstractC4781gE0.i, color);
            color2 = typedArrayObtainStyledAttributes.getColor(AbstractC4781gE0.n, color2);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.E;
        int i3 = this.D;
        if (i2 > i3) {
            i2 = i3;
        }
        this.E = i2;
        if (i2 < 0) {
            i2 = 0;
        }
        this.E = i2;
        int i4 = this.I;
        if (i4 > 360) {
            i4 = 360;
        }
        this.I = i4;
        if (i4 < 0) {
            i4 = 0;
        }
        this.I = i4;
        int i5 = this.H;
        if (i5 > 360) {
            i5 = 0;
        }
        this.H = i5;
        this.H = i5 >= 0 ? i5 : 0;
        Paint paint = new Paint();
        this.Q = paint;
        paint.setColor(color);
        this.Q.setAntiAlias(true);
        Paint paint2 = this.Q;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.Q.setStrokeWidth(this.G);
        Paint paint3 = new Paint();
        this.R = paint3;
        paint3.setColor(color2);
        this.R.setAntiAlias(true);
        this.R.setStyle(style);
        this.R.setStrokeWidth(this.F);
        if (this.K) {
            Paint paint4 = this.Q;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint4.setStrokeCap(cap);
            this.R.setStrokeCap(cap);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.C;
        if (drawable != null && drawable.isStateful()) {
            this.C.setState(getDrawableState());
        }
        invalidate();
    }

    public final void e(int i, boolean z) {
        i(i, z);
    }

    public final void f() {
        a aVar = this.b0;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void g() {
        a aVar = this.b0;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public int getArcRotation() {
        return this.J;
    }

    public int getArcWidth() {
        return this.G;
    }

    public int getProgressWidth() {
        return this.F;
    }

    public int getStartAngle() {
        return this.H;
    }

    public int getSweepAngle() {
        return this.I;
    }

    public final void h(MotionEvent motionEvent) {
        if (c(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        double dB = b(motionEvent.getX(), motionEvent.getY());
        this.W = dB;
        e(a(dB), true);
    }

    public final void i(int i, boolean z) {
        if (i == c0) {
            return;
        }
        a aVar = this.b0;
        if (aVar != null) {
            aVar.c(this, i, z);
        }
        int i2 = this.D;
        if (i > i2) {
            i = i2;
        }
        if (this.E < 0) {
            i = 0;
        }
        this.E = i;
        this.O = (i / i2) * this.I;
        j();
        invalidate();
    }

    public final void j() {
        double d = (int) (this.H + this.O + this.J + 90.0f);
        this.U = (int) (((double) this.N) * Math.cos(Math.toRadians(d)));
        this.V = (int) (((double) this.N) * Math.sin(Math.toRadians(d)));
    }

    public final float k() {
        return this.D / this.I;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.M) {
            canvas.scale(-1.0f, 1.0f, this.P.centerX(), this.P.centerY());
        }
        float f = (this.H - 90) + this.J;
        canvas.drawArc(this.P, f, this.I, false, this.Q);
        canvas.drawArc(this.P, f, this.O, false, this.R);
        canvas.translate(this.S - this.U, this.T - this.V);
        this.C.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int iMin = Math.min(defaultSize2, defaultSize);
        this.S = (int) (defaultSize2 * 0.5f);
        this.T = (int) (defaultSize * 0.5f);
        int paddingLeft = iMin - getPaddingLeft();
        int i3 = paddingLeft / 2;
        this.N = i3;
        float f = (defaultSize / 2) - i3;
        float f2 = (defaultSize2 / 2) - i3;
        float f3 = paddingLeft;
        this.P.set(f2, f, f2 + f3, f3 + f);
        double d = ((int) this.O) + this.H + this.J + 90;
        this.U = (int) (((double) this.N) * Math.cos(Math.toRadians(d)));
        this.V = (int) (((double) this.N) * Math.sin(Math.toRadians(d)));
        setTouchInSide(this.L);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            f();
            h(motionEvent);
        } else if (action == 1) {
            g();
            setPressed(false);
        } else if (action == 2) {
            h(motionEvent);
        } else if (action == 3) {
            g();
            setPressed(false);
        }
        return true;
    }

    public void setArcRotation(int i) {
        this.J = i;
        j();
    }

    public void setArcWidth(int i) {
        this.G = i;
        this.Q.setStrokeWidth(i);
    }

    public void setClockwise(boolean z) {
        this.M = z;
    }

    public void setOnSeekArcChangeListener(a aVar) {
        this.b0 = aVar;
    }

    public void setProgress(int i) {
        i(i, false);
    }

    public void setProgressWidth(int i) {
        this.F = i;
        this.R.setStrokeWidth(i);
    }

    public void setRoundedEdges(boolean z) {
        this.K = z;
        if (z) {
            Paint paint = this.Q;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            this.R.setStrokeCap(cap);
            return;
        }
        Paint paint2 = this.Q;
        Paint.Cap cap2 = Paint.Cap.SQUARE;
        paint2.setStrokeCap(cap2);
        this.R.setStrokeCap(cap2);
    }

    public void setStartAngle(int i) {
        this.H = i;
        j();
    }

    public void setSweepAngle(int i) {
        this.I = i;
        j();
    }

    public void setTouchInSide(boolean z) {
        int intrinsicHeight = this.C.getIntrinsicHeight() / 2;
        int intrinsicWidth = this.C.getIntrinsicWidth() / 2;
        this.L = z;
        if (z) {
            this.a0 = this.N / 4.0f;
        } else {
            this.a0 = this.N - Math.min(intrinsicWidth, intrinsicHeight);
        }
    }
}
