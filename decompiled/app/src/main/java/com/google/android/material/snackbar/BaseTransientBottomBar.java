package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3779ch0;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC6867nh0;
import com.daaw.AbstractC6991o7;
import com.daaw.C4904gh0;
import com.daaw.C5671jR0;
import com.daaw.JC0;
import com.daaw.SD;
import com.daaw.WD0;
import com.daaw.YC0;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {
    public static final TimeInterpolator a = AbstractC6991o7.b;
    public static final TimeInterpolator b = AbstractC6991o7.a;
    public static final TimeInterpolator c = AbstractC6991o7.d;
    public static final boolean e = false;
    public static final int[] f = {JC0.H};
    public static final String g = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler d = new Handler(Looper.getMainLooper(), new a());

    public static class Behavior extends SwipeDismissBehavior<View> {
        public final b k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                AbstractC6314li0.a(message.obj);
                throw null;
            }
            if (i != 1) {
                return false;
            }
            AbstractC6314li0.a(message.obj);
            throw null;
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    public static class c extends FrameLayout {
        public static final View.OnTouchListener L = new a();
        public C5671jR0 B;
        public int C;
        public final float D;
        public final float E;
        public final int F;
        public final int G;
        public ColorStateList H;
        public PorterDuff.Mode I;
        public Rect J;
        public boolean K;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(AbstractC6867nh0.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, WD0.g5);
            if (typedArrayObtainStyledAttributes.hasValue(WD0.n5)) {
                AbstractC2317Td1.x0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.n5, 0));
            }
            this.C = typedArrayObtainStyledAttributes.getInt(WD0.j5, 0);
            if (typedArrayObtainStyledAttributes.hasValue(WD0.p5) || typedArrayObtainStyledAttributes.hasValue(WD0.q5)) {
                this.B = C5671jR0.e(context2, attributeSet, 0, 0).m();
            }
            this.D = typedArrayObtainStyledAttributes.getFloat(WD0.k5, 1.0f);
            setBackgroundTintList(AbstractC4336eh0.a(context2, typedArrayObtainStyledAttributes, WD0.l5));
            setBackgroundTintMode(AbstractC2633We1.f(typedArrayObtainStyledAttributes.getInt(WD0.m5, -1), PorterDuff.Mode.SRC_IN));
            this.E = typedArrayObtainStyledAttributes.getFloat(WD0.i5, 1.0f);
            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.h5, -1);
            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.o5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(L);
            setFocusable(true);
            if (getBackground() == null) {
                AbstractC2317Td1.t0(this, a());
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public final Drawable a() {
            int iK = AbstractC3779ch0.k(this, JC0.k, JC0.h, getBackgroundOverlayColorAlpha());
            C5671jR0 c5671jR0 = this.B;
            Drawable drawableD = c5671jR0 != null ? BaseTransientBottomBar.d(iK, c5671jR0) : BaseTransientBottomBar.c(iK, getResources());
            if (this.H == null) {
                return SD.r(drawableD);
            }
            Drawable drawableR = SD.r(drawableD);
            SD.o(drawableR, this.H);
            return drawableR;
        }

        public final void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.J = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.E;
        }

        public int getAnimationMode() {
            return this.C;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.D;
        }

        public int getMaxInlineActionWidth() {
            return this.G;
        }

        public int getMaxWidth() {
            return this.F;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AbstractC2317Td1.m0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.F > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.F;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.C = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.H != null) {
                drawable = SD.r(drawable.mutate());
                SD.o(drawable, this.H);
                SD.p(drawable, this.I);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.H = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = SD.r(getBackground().mutate());
                SD.o(drawableR, colorStateList);
                SD.p(drawableR, this.I);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.I = mode;
            if (getBackground() != null) {
                Drawable drawableR = SD.r(getBackground().mutate());
                SD.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.K || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : L);
            super.setOnClickListener(onClickListener);
        }
    }

    public static GradientDrawable c(int i, Resources resources) {
        float dimension = resources.getDimension(YC0.Q);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public static C4904gh0 d(int i, C5671jR0 c5671jR0) {
        C4904gh0 c4904gh0 = new C4904gh0(c5671jR0);
        c4904gh0.S(ColorStateList.valueOf(i));
        return c4904gh0;
    }
}
