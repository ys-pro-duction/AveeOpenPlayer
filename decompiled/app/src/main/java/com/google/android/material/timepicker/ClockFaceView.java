package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5894kD0;
import com.daaw.AbstractC6186lE0;
import com.daaw.BD0;
import com.daaw.C5554j1;
import com.daaw.G9;
import com.daaw.JC0;
import com.daaw.RC0;
import com.daaw.SD0;
import com.daaw.WD0;
import com.daaw.YC0;
import com.daaw.Z1;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends AbstractC6186lE0 implements ClockHandView.b {
    public final ClockHandView e0;
    public final Rect f0;
    public final RectF g0;
    public final Rect h0;
    public final SparseArray i0;
    public final C5554j1 j0;
    public final int[] k0;
    public final float[] l0;
    public final int m0;
    public final int n0;
    public final int o0;
    public final int p0;
    public String[] q0;
    public float r0;
    public final ColorStateList s0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.x(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.e0.i()) - ClockFaceView.this.m0);
            return true;
        }
    }

    public class b extends C5554j1 {
        public b() {
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            int iIntValue = ((Integer) view.getTag(AbstractC5894kD0.p)).intValue();
            if (iIntValue > 0) {
                z1.V0((View) ClockFaceView.this.i0.get(iIntValue - 1));
            }
            z1.q0(Z1.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            z1.o0(true);
            z1.b(Z1.a.i);
        }

        @Override // com.daaw.C5554j1
        public boolean j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.j(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f0);
            float fCenterX = ClockFaceView.this.f0.centerX();
            float fCenterY = ClockFaceView.this.f0.centerY();
            ClockFaceView.this.e0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.e0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.u);
    }

    public static float I(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    public final void F() {
        RectF rectFE = this.e0.e();
        TextView textViewH = H(rectFE);
        for (int i = 0; i < this.i0.size(); i++) {
            TextView textView = (TextView) this.i0.get(i);
            if (textView != null) {
                textView.setSelected(textView == textViewH);
                textView.getPaint().setShader(G(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient G(RectF rectF, TextView textView) {
        textView.getHitRect(this.f0);
        this.g0.set(this.f0);
        textView.getLineBounds(0, this.h0);
        RectF rectF2 = this.g0;
        Rect rect = this.h0;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.g0)) {
            return new RadialGradient(rectF.centerX() - this.g0.left, rectF.centerY() - this.g0.top, rectF.width() * 0.5f, this.k0, this.l0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView H(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.i0.size(); i++) {
            TextView textView2 = (TextView) this.i0.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.f0);
                this.g0.set(this.f0);
                this.g0.union(rectF);
                float fWidth = this.g0.width() * this.g0.height();
                if (fWidth < f) {
                    textView = textView2;
                    f = fWidth;
                }
            }
        }
        return textView;
    }

    public void J(String[] strArr, int i) {
        this.q0 = strArr;
        K(i);
    }

    public final void K(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.i0.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.q0.length, size); i2++) {
            TextView textView = (TextView) this.i0.get(i2);
            if (i2 >= this.q0.length) {
                removeView(textView);
                this.i0.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(BD0.i, (ViewGroup) this, false);
                    this.i0.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.q0[i2]);
                textView.setTag(AbstractC5894kD0.p, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(AbstractC5894kD0.k, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                AbstractC2317Td1.p0(textView, this.j0);
                textView.setTextColor(this.s0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.q0[i2]));
                }
            }
        }
        this.e0.p(z);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f, boolean z) {
        if (Math.abs(this.r0 - f) > 0.001f) {
            this.r0 = f;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Z1.Z0(accessibilityNodeInfo).p0(Z1.e.b(1, this.q0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I = (int) (this.p0 / I(this.n0 / displayMetrics.heightPixels, this.o0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I, 1073741824);
        setMeasuredDimension(I, I);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.daaw.AbstractC6186lE0
    public void x(int i) {
        if (i != w()) {
            super.x(i);
            this.e0.l(w());
        }
    }

    @Override // com.daaw.AbstractC6186lE0
    public void z() {
        super.z();
        for (int i = 0; i < this.i0.size(); i++) {
            ((TextView) this.i0.get(i)).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.h0 = new Rect();
        this.i0 = new SparseArray();
        this.l0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WD0.R0, i, SD0.p);
        Resources resources = getResources();
        ColorStateList colorStateListA = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.T0);
        this.s0 = colorStateListA;
        LayoutInflater.from(context).inflate(BD0.j, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC5894kD0.j);
        this.e0 = clockHandView;
        this.m0 = resources.getDimensionPixelSize(YC0.m);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.k0 = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = G9.a(context, RC0.b).getDefaultColor();
        ColorStateList colorStateListA2 = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.S0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.j0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        J(strArr, 0);
        this.n0 = resources.getDimensionPixelSize(YC0.z);
        this.o0 = resources.getDimensionPixelSize(YC0.A);
        this.p0 = resources.getDimensionPixelSize(YC0.o);
    }
}
