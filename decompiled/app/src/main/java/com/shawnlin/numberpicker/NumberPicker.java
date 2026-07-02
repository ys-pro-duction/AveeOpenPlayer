package com.shawnlin.numberpicker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.daaw.AbstractC6182lD0;
import com.daaw.AbstractC9438ws;
import com.daaw.C3696cO0;
import com.daaw.CD0;
import com.daaw.XD0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class NumberPicker extends LinearLayout {
    public static final f f1 = new f();
    public static final char[] g1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785, 2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415, 2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543, 3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311, '-'};
    public VelocityTracker A0;
    public final EditText B;
    public int B0;
    public float C;
    public int C0;
    public float D;
    public int D0;
    public int E;
    public boolean E0;
    public int F;
    public boolean F0;
    public int G;
    public Drawable G0;
    public int H;
    public int H0;
    public final boolean I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public float L;
    public int L0;
    public boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public Typeface O;
    public int O0;
    public int P;
    public int P0;
    public int Q;
    public int Q0;
    public float R;
    public int R0;
    public boolean S;
    public boolean S0;
    public boolean T;
    public int T0;
    public Typeface U;
    public int U0;
    public int V;
    public boolean V0;
    public int W;
    public float W0;
    public boolean X0;
    public float Y0;
    public int Z0;
    public String[] a0;
    public boolean a1;
    public int b0;
    public Context b1;
    public int c0;
    public NumberFormat c1;
    public int d0;
    public ViewConfiguration d1;
    public View.OnClickListener e0;
    public int e1;
    public e f0;
    public c g0;
    public long h0;
    public final SparseArray i0;
    public int j0;
    public int k0;
    public int l0;
    public int[] m0;
    public final Paint n0;
    public int o0;
    public int p0;
    public int q0;
    public final C3696cO0 r0;
    public final C3696cO0 s0;
    public int t0;
    public int u0;
    public b v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.c
        public String a(int i) {
            return String.format(Locale.getDefault(), this.a, Integer.valueOf(i));
        }
    }

    public class b implements Runnable {
        public boolean B;

        public b() {
        }

        public final void b(boolean z) {
            this.B = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            NumberPicker.this.c(this.B);
            NumberPicker numberPicker = NumberPicker.this;
            numberPicker.postDelayed(this, numberPicker.h0);
        }
    }

    public interface c {
        String a(int i);
    }

    public interface d {
    }

    public interface e {
        void a(NumberPicker numberPicker, int i, int i2);
    }

    public static class f implements c {
        public char b;
        public Formatter c;
        public final StringBuilder a = new StringBuilder();
        public final Object[] d = new Object[1];

        public f() {
            d(Locale.getDefault());
        }

        public static char c(Locale locale) {
            return new DecimalFormatSymbols(locale).getZeroDigit();
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.c
        public String a(int i) {
            Locale locale = Locale.getDefault();
            if (this.b != c(locale)) {
                d(locale);
            }
            this.d[0] = Integer.valueOf(i);
            StringBuilder sb = this.a;
            sb.delete(0, sb.length());
            this.c.format("%02d", this.d);
            return this.c.toString();
        }

        public final Formatter b(Locale locale) {
            return new Formatter(this.a, locale);
        }

        public final void d(Locale locale) {
            this.c = b(locale);
            this.b = c(locale);
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float getMaxTextSize() {
        return Math.max(this.R, this.L);
    }

    private int[] getSelectorIndices() {
        return this.m0;
    }

    public static c getTwoDigitFormatter() {
        return f1;
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i = size;
            }
        } else if (size < i) {
            i = 16777216 | size;
        }
        return i | ((-16777216) & i3);
    }

    public final boolean A() {
        return this.c0 - this.b0 >= this.m0.length - 1;
    }

    public final int B(int i, int i2) {
        if (i2 != -1) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException("Unknown measure mode: " + mode);
            }
        }
        return i;
    }

    public final boolean C(C3696cO0 c3696cO0) {
        c3696cO0.d(true);
        if (y()) {
            int iH = c3696cO0.h() - c3696cO0.f();
            int i = this.p0 - ((this.q0 + iH) % this.o0);
            if (i != 0) {
                int iAbs = Math.abs(i);
                int i2 = this.o0;
                if (iAbs > i2 / 2) {
                    i = i > 0 ? i - i2 : i + i2;
                }
                scrollBy(iH + i, 0);
                return true;
            }
        } else {
            int i3 = c3696cO0.i() - c3696cO0.g();
            int i4 = this.p0 - ((this.q0 + i3) % this.o0);
            if (i4 != 0) {
                int iAbs2 = Math.abs(i4);
                int i5 = this.o0;
                if (iAbs2 > i5 / 2) {
                    i4 = i4 > 0 ? i4 - i5 : i4 + i5;
                }
                scrollBy(0, i3 + i4);
                return true;
            }
        }
        return false;
    }

    public final void D(int i, int i2) {
        e eVar = this.f0;
        if (eVar != null) {
            eVar.a(this, i, i2);
        }
    }

    public final void E(int i) {
        if (this.Q0 == i) {
            return;
        }
        this.Q0 = i;
    }

    public final void F(C3696cO0 c3696cO0) {
        if (c3696cO0 == this.r0) {
            m();
            Y();
            E(0);
        } else if (this.Q0 != 1) {
            Y();
        }
    }

    public final void G(boolean z) {
        H(z, ViewConfiguration.getLongPressTimeout());
    }

    public final void H(boolean z, long j) {
        b bVar = this.v0;
        if (bVar == null) {
            this.v0 = new b();
        } else {
            removeCallbacks(bVar);
        }
        this.v0.b(z);
        postDelayed(this.v0, j);
    }

    public final float I(float f2) {
        return f2 / getResources().getDisplayMetrics().density;
    }

    public final float J(float f2) {
        return f2 / getResources().getDisplayMetrics().scaledDensity;
    }

    public final void K() {
        b bVar = this.v0;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public final void L() {
        b bVar = this.v0;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public final int M(int i, int i2, int i3) {
        return i != -1 ? resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    public void N(int i, int i2) {
        O(getResources().getString(i), i2);
    }

    public void O(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setSelectedTypeface(Typeface.create(str, i));
    }

    public void P(int i, int i2) {
        Q(getResources().getString(i), i2);
    }

    public void Q(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTypeface(Typeface.create(str, i));
    }

    public final void R(int i, boolean z) {
        if (this.d0 == i) {
            return;
        }
        int iS = this.E0 ? s(i) : Math.min(Math.max(i, this.b0), this.c0);
        int i2 = this.d0;
        this.d0 = iS;
        if (this.Q0 != 2) {
            Y();
        }
        if (z) {
            D(i2, iS);
        }
        w();
        X();
        invalidate();
    }

    public final void S() {
        if (y()) {
            this.E = -1;
            this.F = (int) h(64.0f);
            this.G = (int) h(180.0f);
            this.H = -1;
            return;
        }
        this.E = -1;
        this.F = (int) h(180.0f);
        this.G = (int) h(64.0f);
        this.H = -1;
    }

    public void T(boolean z, int i) {
        int i2 = (z ? -this.o0 : this.o0) * i;
        if (y()) {
            this.t0 = 0;
            this.r0.p(0, 0, i2, 0, RCHTTPStatusCodes.UNSUCCESSFUL);
        } else {
            this.u0 = 0;
            this.r0.p(0, 0, 0, i2, RCHTTPStatusCodes.UNSUCCESSFUL);
        }
        invalidate();
    }

    public final float U(float f2) {
        return TypedValue.applyDimension(2, f2, getResources().getDisplayMetrics());
    }

    public final c V(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new a(str);
    }

    public final void W() {
        int i;
        if (this.I) {
            this.n0.setTextSize(getMaxTextSize());
            String[] strArr = this.a0;
            int i2 = 0;
            if (strArr == null) {
                float f2 = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float fMeasureText = this.n0.measureText(o(i3));
                    if (fMeasureText > f2) {
                        f2 = fMeasureText;
                    }
                }
                for (int i4 = this.c0; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f2);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    float fMeasureText2 = this.n0.measureText(strArr[i2]);
                    if (fMeasureText2 > i5) {
                        i5 = (int) fMeasureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            int paddingLeft = i + this.B.getPaddingLeft() + this.B.getPaddingRight();
            if (this.H != paddingLeft) {
                this.H = Math.max(paddingLeft, this.G);
                invalidate();
            }
        }
    }

    public final void X() {
        if (this.a1) {
            setContentDescription(String.valueOf(getValue()));
        }
    }

    public final void Y() {
        String[] strArr = this.a0;
        String strO = strArr == null ? o(this.d0) : strArr[this.d0 - this.b0];
        if (TextUtils.isEmpty(strO) || strO.equals(this.B.getText().toString())) {
            return;
        }
        this.B.setText(strO);
    }

    public final void Z() {
        this.E0 = A() && this.F0;
    }

    public final void c(boolean z) {
        if (!C(this.r0)) {
            C(this.s0);
        }
        T(z, 1);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return d(y());
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return e(y());
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return f(y());
    }

    @Override // android.view.View
    public void computeScroll() {
        if (z()) {
            C3696cO0 c3696cO0 = this.r0;
            if (c3696cO0.o()) {
                c3696cO0 = this.s0;
                if (c3696cO0.o()) {
                    return;
                }
            }
            c3696cO0.b();
            if (y()) {
                int iF = c3696cO0.f();
                if (this.t0 == 0) {
                    this.t0 = c3696cO0.m();
                }
                scrollBy(iF - this.t0, 0);
                this.t0 = iF;
            } else {
                int iG = c3696cO0.g();
                if (this.u0 == 0) {
                    this.u0 = c3696cO0.n();
                }
                scrollBy(0, iG - this.u0);
                this.u0 = iG;
            }
            if (c3696cO0.o()) {
                F(c3696cO0);
            } else {
                postInvalidate();
            }
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return d(y());
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return e(!y());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return f(!y());
    }

    public final int d(boolean z) {
        return z ? getWidth() : getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            int action = keyEvent.getAction();
            if (action == 0) {
                if (!this.E0) {
                    if (keyCode == 20) {
                    }
                }
                requestFocus();
                this.R0 = keyCode;
                K();
                if (this.r0.o()) {
                    c(keyCode == 20);
                }
                return true;
            }
            if (action == 1 && this.R0 == keyCode) {
                this.R0 = -1;
                return true;
            }
        } else if (keyCode == 23 || keyCode == 66) {
            K();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            K();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            K();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.G0;
        if (drawable != null && drawable.isStateful() && this.G0.setState(getDrawableState())) {
            invalidateDrawable(this.G0);
        }
    }

    public final int e(boolean z) {
        if (z) {
            return this.q0;
        }
        return 0;
    }

    public final int f(boolean z) {
        if (z) {
            return ((this.c0 - this.b0) + 1) * this.o0;
        }
        return 0;
    }

    public final void g(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i = iArr[1] - 1;
        if (this.E0 && i < this.b0) {
            i = this.c0;
        }
        iArr[0] = i;
        l(i);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return q(!y());
    }

    public String[] getDisplayedValues() {
        return this.a0;
    }

    public int getDividerColor() {
        return this.H0;
    }

    public float getDividerDistance() {
        return I(this.I0);
    }

    public float getDividerThickness() {
        return I(this.K0);
    }

    public float getFadingEdgeStrength() {
        return this.W0;
    }

    public c getFormatter() {
        return this.g0;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return q(y());
    }

    public float getLineSpacingMultiplier() {
        return this.Y0;
    }

    public int getMaxFlingVelocityCoefficient() {
        return this.Z0;
    }

    public int getMaxValue() {
        return this.c0;
    }

    public int getMinValue() {
        return this.b0;
    }

    public int getOrder() {
        return this.U0;
    }

    @Override // android.widget.LinearLayout
    public int getOrientation() {
        return this.T0;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return q(y());
    }

    public int getSelectedTextAlign() {
        return this.J;
    }

    public int getSelectedTextColor() {
        return this.K;
    }

    public float getSelectedTextSize() {
        return this.L;
    }

    public boolean getSelectedTextStrikeThru() {
        return this.M;
    }

    public boolean getSelectedTextUnderline() {
        return this.N;
    }

    public int getTextAlign() {
        return this.P;
    }

    public int getTextColor() {
        return this.Q;
    }

    public float getTextSize() {
        return U(this.R);
    }

    public boolean getTextStrikeThru() {
        return this.S;
    }

    public boolean getTextUnderline() {
        return this.T;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return q(!y());
    }

    public Typeface getTypeface() {
        return this.U;
    }

    public int getValue() {
        return this.d0;
    }

    public int getWheelItemCount() {
        return this.j0;
    }

    public boolean getWrapSelectorWheel() {
        return this.E0;
    }

    public final float h(float f2) {
        return f2 * getResources().getDisplayMetrics().density;
    }

    public final void i(Canvas canvas) {
        int bottom;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.P0;
        if (i6 != 0) {
            if (i6 != 1) {
                return;
            }
            int i7 = this.J0;
            if (i7 <= 0 || i7 > (i5 = this.H)) {
                i3 = this.N0;
                i4 = this.O0;
            } else {
                i3 = (i5 - i7) / 2;
                i4 = i7 + i3;
            }
            int i8 = this.M0;
            this.G0.setBounds(i3, i8 - this.K0, i4, i8);
            this.G0.draw(canvas);
            return;
        }
        int i9 = this.J0;
        if (i9 <= 0 || i9 > (i2 = this.F)) {
            bottom = getBottom();
            i = 0;
        } else {
            i = (i2 - i9) / 2;
            bottom = i9 + i;
        }
        int i10 = this.N0;
        this.G0.setBounds(i10, i, this.K0 + i10, bottom);
        this.G0.draw(canvas);
        int i11 = this.O0;
        this.G0.setBounds(i11 - this.K0, i, i11, bottom);
        this.G0.draw(canvas);
    }

    public final void j(String str, float f2, float f3, Paint paint, Canvas canvas) {
        if (!str.contains("\n")) {
            canvas.drawText(str, f2, f3, paint);
            return;
        }
        String[] strArrSplit = str.split("\n");
        float fAbs = Math.abs(paint.descent() + paint.ascent()) * this.Y0;
        float length = f3 - (((strArrSplit.length - 1) * fAbs) / 2.0f);
        for (String str2 : strArrSplit) {
            canvas.drawText(str2, f2, length, paint);
            length += fAbs;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.G0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(Canvas canvas) {
        int right;
        int i;
        int i2;
        int i3 = this.J0;
        if (i3 <= 0 || i3 > (i2 = this.H)) {
            right = getRight();
            i = 0;
        } else {
            i = (i2 - i3) / 2;
            right = i3 + i;
        }
        int i4 = this.P0;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            int i5 = this.M0;
            this.G0.setBounds(i, i5 - this.K0, right, i5);
            this.G0.draw(canvas);
            return;
        }
        int i6 = this.L0;
        this.G0.setBounds(i, i6, right, this.K0 + i6);
        this.G0.draw(canvas);
        int i7 = this.M0;
        this.G0.setBounds(i, i7 - this.K0, right, i7);
        this.G0.draw(canvas);
    }

    public final void l(int i) {
        String strO;
        SparseArray sparseArray = this.i0;
        if (((String) sparseArray.get(i)) != null) {
            return;
        }
        int i2 = this.b0;
        if (i < i2 || i > this.c0) {
            strO = "";
        } else {
            String[] strArr = this.a0;
            if (strArr != null) {
                int i3 = i - i2;
                if (i3 >= strArr.length) {
                    sparseArray.remove(i);
                    return;
                }
                strO = strArr[i3];
            } else {
                strO = o(i);
            }
        }
        sparseArray.put(i, strO);
    }

    public final void m() {
        int i = this.p0 - this.q0;
        if (i == 0) {
            return;
        }
        int iAbs = Math.abs(i);
        int i2 = this.o0;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        int i3 = i;
        if (y()) {
            this.t0 = 0;
            this.s0.p(0, 0, i3, 0, 800);
        } else {
            this.u0 = 0;
            this.s0.p(0, 0, 0, i3, 800);
        }
        invalidate();
    }

    public final void n(int i) {
        if (y()) {
            this.t0 = 0;
            if (i > 0) {
                this.r0.c(0, 0, i, 0, 0, Integer.MAX_VALUE, 0, 0);
            } else {
                this.r0.c(Integer.MAX_VALUE, 0, i, 0, 0, Integer.MAX_VALUE, 0, 0);
            }
        } else {
            this.u0 = 0;
            if (i > 0) {
                this.r0.c(0, 0, 0, i, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                this.r0.c(0, Integer.MAX_VALUE, 0, i, 0, 0, 0, Integer.MAX_VALUE);
            }
        }
        invalidate();
    }

    public final String o(int i) {
        c cVar = this.g0;
        return cVar != null ? cVar.a(i) : p(i);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c1 = NumberFormat.getInstance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float right;
        float baseline;
        NumberPicker numberPicker;
        Canvas canvas2;
        int i;
        int i2;
        canvas.save();
        boolean z = !this.S0 || hasFocus();
        if (y()) {
            right = this.q0;
            baseline = this.B.getBaseline() + this.B.getTop();
            if (this.k0 < 3) {
                canvas.clipRect(this.N0, 0, this.O0, getBottom());
            }
        } else {
            right = (getRight() - getLeft()) / 2.0f;
            baseline = this.q0;
            if (this.k0 < 3) {
                canvas.clipRect(0, this.L0, getRight(), this.M0);
            }
        }
        int[] selectorIndices = getSelectorIndices();
        int i3 = 0;
        while (i3 < selectorIndices.length) {
            if (i3 == this.l0) {
                this.n0.setTextAlign(Paint.Align.values()[this.J]);
                this.n0.setTextSize(this.L);
                this.n0.setColor(this.K);
                this.n0.setStrikeThruText(this.M);
                this.n0.setUnderlineText(this.N);
                this.n0.setTypeface(this.O);
            } else {
                this.n0.setTextAlign(Paint.Align.values()[this.P]);
                this.n0.setTextSize(this.R);
                this.n0.setColor(this.Q);
                this.n0.setStrikeThruText(this.S);
                this.n0.setUnderlineText(this.T);
                this.n0.setTypeface(this.U);
            }
            String str = (String) this.i0.get(selectorIndices[x() ? i3 : (selectorIndices.length - i3) - 1]);
            if (str == null) {
                canvas2 = canvas;
            } else {
                if ((!z || i3 == this.l0) && (i3 != this.l0 || this.B.getVisibility() == 0)) {
                    numberPicker = this;
                    canvas2 = canvas;
                } else {
                    float fR = !y() ? r(this.n0.getFontMetrics()) + baseline : baseline;
                    if (i3 == this.l0 || this.e1 == 0) {
                        i = 0;
                    } else if (y()) {
                        i = i3 > this.l0 ? this.e1 : -this.e1;
                    } else {
                        i2 = i3 > this.l0 ? this.e1 : -this.e1;
                        i = 0;
                        canvas2 = canvas;
                        numberPicker = this;
                        numberPicker.j(str, i + right, fR + i2, this.n0, canvas2);
                    }
                    i2 = 0;
                    canvas2 = canvas;
                    numberPicker = this;
                    numberPicker.j(str, i + right, fR + i2, this.n0, canvas2);
                }
                if (y()) {
                    right += numberPicker.o0;
                } else {
                    baseline += numberPicker.o0;
                }
            }
            i3++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        canvas3.restore();
        if (!z || this.G0 == null) {
            return;
        }
        if (y()) {
            i(canvas3);
        } else {
            k(canvas3);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(NumberPicker.class.getName());
        accessibilityEvent.setScrollable(z());
        int i = this.b0;
        int i2 = this.d0 + i;
        int i3 = this.o0;
        int i4 = i2 * i3;
        int i5 = (this.c0 - i) * i3;
        if (y()) {
            accessibilityEvent.setScrollX(i4);
            accessibilityEvent.setMaxScrollX(i5);
        } else {
            accessibilityEvent.setScrollY(i4);
            accessibilityEvent.setMaxScrollY(i5);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        K();
        getParent().requestDisallowInterceptTouchEvent(true);
        if (y()) {
            float x = motionEvent.getX();
            this.w0 = x;
            this.y0 = x;
            if (!this.r0.o()) {
                this.r0.d(true);
                this.s0.d(true);
                F(this.r0);
                E(0);
            } else if (this.s0.o()) {
                float f2 = this.w0;
                int i = this.N0;
                if (f2 >= i && f2 <= this.O0) {
                    View.OnClickListener onClickListener = this.e0;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                } else if (f2 < i) {
                    G(false);
                } else if (f2 > this.O0) {
                    G(true);
                }
            } else {
                this.r0.d(true);
                this.s0.d(true);
                F(this.s0);
            }
        } else {
            float y = motionEvent.getY();
            this.x0 = y;
            this.z0 = y;
            if (!this.r0.o()) {
                this.r0.d(true);
                this.s0.d(true);
                E(0);
            } else if (this.s0.o()) {
                float f3 = this.x0;
                int i2 = this.L0;
                if (f3 >= i2 && f3 <= this.M0) {
                    View.OnClickListener onClickListener2 = this.e0;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this);
                    }
                } else if (f3 < i2) {
                    G(false);
                } else if (f3 > this.M0) {
                    G(true);
                }
            } else {
                this.r0.d(true);
                this.s0.d(true);
            }
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.B.getMeasuredWidth();
        int measuredHeight2 = this.B.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.B.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        this.C = (this.B.getX() + (this.B.getMeasuredWidth() / 2.0f)) - 2.0f;
        this.D = (this.B.getY() + (this.B.getMeasuredHeight() / 2.0f)) - 5.0f;
        if (z) {
            v();
            u();
            int i7 = (this.K0 * 2) + this.I0;
            if (!y()) {
                int height = ((getHeight() - this.I0) / 2) - this.K0;
                this.L0 = height;
                this.M0 = height + i7;
            } else {
                int width = ((getWidth() - this.I0) / 2) - this.K0;
                this.N0 = width;
                this.O0 = width + i7;
                this.M0 = getHeight();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(B(i, this.H), B(i2, this.F));
        setMeasuredDimension(M(this.G, getMeasuredWidth(), i), M(this.E, getMeasuredHeight(), i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !z()) {
            return false;
        }
        if (this.A0 == null) {
            this.A0 = VelocityTracker.obtain();
        }
        this.A0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1) {
            L();
            VelocityTracker velocityTracker = this.A0;
            velocityTracker.computeCurrentVelocity(1000, this.D0);
            if (y()) {
                int xVelocity = (int) velocityTracker.getXVelocity();
                if (Math.abs(xVelocity) > this.C0) {
                    n(xVelocity);
                    E(2);
                } else {
                    int x = (int) motionEvent.getX();
                    if (((int) Math.abs(x - this.w0)) <= this.B0) {
                        int i = (x / this.o0) - this.l0;
                        if (i > 0) {
                            c(true);
                        } else if (i < 0) {
                            c(false);
                        } else {
                            m();
                        }
                    } else {
                        m();
                    }
                    E(0);
                }
            } else {
                int yVelocity = (int) velocityTracker.getYVelocity();
                if (Math.abs(yVelocity) > this.C0) {
                    n(yVelocity);
                    E(2);
                } else {
                    int y = (int) motionEvent.getY();
                    if (((int) Math.abs(y - this.x0)) <= this.B0) {
                        int i2 = (y / this.o0) - this.l0;
                        if (i2 > 0) {
                            c(true);
                        } else if (i2 < 0) {
                            c(false);
                        } else {
                            m();
                        }
                    } else {
                        m();
                    }
                    E(0);
                }
            }
            this.A0.recycle();
            this.A0 = null;
        } else if (action == 2) {
            if (y()) {
                float x2 = motionEvent.getX();
                if (this.Q0 == 1) {
                    scrollBy((int) (x2 - this.y0), 0);
                    invalidate();
                } else if (((int) Math.abs(x2 - this.w0)) > this.B0) {
                    K();
                    E(1);
                }
                this.y0 = x2;
            } else {
                float y2 = motionEvent.getY();
                if (this.Q0 == 1) {
                    scrollBy(0, (int) (y2 - this.z0));
                    invalidate();
                } else if (((int) Math.abs(y2 - this.x0)) > this.B0) {
                    K();
                    E(1);
                }
                this.z0 = y2;
            }
        }
        return true;
    }

    public final String p(int i) {
        return this.c1.format(i);
    }

    public final float q(boolean z) {
        if (z && this.V0) {
            return this.W0;
        }
        return 0.0f;
    }

    public final float r(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    public final int s(int i) {
        int i2 = this.c0;
        if (i > i2) {
            int i3 = this.b0;
            return (i3 + ((i - i2) % (i2 - i3))) - 1;
        }
        int i4 = this.b0;
        return i < i4 ? (i2 - ((i4 - i) % (i2 - i4))) + 1 : i;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        int i3;
        if (z()) {
            int[] selectorIndices = getSelectorIndices();
            int i4 = this.q0;
            int maxTextSize = (int) getMaxTextSize();
            if (y()) {
                if (x()) {
                    boolean z = this.E0;
                    if (!z && i > 0 && selectorIndices[this.l0] <= this.b0) {
                        this.q0 = this.p0;
                        return;
                    } else if (!z && i < 0 && selectorIndices[this.l0] >= this.c0) {
                        this.q0 = this.p0;
                        return;
                    }
                } else {
                    boolean z2 = this.E0;
                    if (!z2 && i > 0 && selectorIndices[this.l0] >= this.c0) {
                        this.q0 = this.p0;
                        return;
                    } else if (!z2 && i < 0 && selectorIndices[this.l0] <= this.b0) {
                        this.q0 = this.p0;
                        return;
                    }
                }
                this.q0 += i;
            } else {
                if (x()) {
                    boolean z3 = this.E0;
                    if (!z3 && i2 > 0 && selectorIndices[this.l0] <= this.b0) {
                        this.q0 = this.p0;
                        return;
                    } else if (!z3 && i2 < 0 && selectorIndices[this.l0] >= this.c0) {
                        this.q0 = this.p0;
                        return;
                    }
                } else {
                    boolean z4 = this.E0;
                    if (!z4 && i2 > 0 && selectorIndices[this.l0] >= this.c0) {
                        this.q0 = this.p0;
                        return;
                    } else if (!z4 && i2 < 0 && selectorIndices[this.l0] <= this.b0) {
                        this.q0 = this.p0;
                        return;
                    }
                }
                this.q0 += i2;
            }
            while (true) {
                int i5 = this.q0;
                if (i5 - this.p0 <= maxTextSize) {
                    break;
                }
                this.q0 = i5 - this.o0;
                if (x()) {
                    g(selectorIndices);
                } else {
                    t(selectorIndices);
                }
                R(selectorIndices[this.l0], true);
                if (!this.E0 && selectorIndices[this.l0] < this.b0) {
                    this.q0 = this.p0;
                }
            }
            while (true) {
                i3 = this.q0;
                if (i3 - this.p0 >= (-maxTextSize)) {
                    break;
                }
                this.q0 = i3 + this.o0;
                if (x()) {
                    t(selectorIndices);
                } else {
                    g(selectorIndices);
                }
                R(selectorIndices[this.l0], true);
                if (!this.E0 && selectorIndices[this.l0] > this.c0) {
                    this.q0 = this.p0;
                }
            }
            if (i4 != i3) {
                if (y()) {
                    onScrollChanged(this.q0, 0, i4, 0);
                } else {
                    onScrollChanged(0, this.q0, 0, i4);
                }
            }
        }
    }

    public void setAccessibilityDescriptionEnabled(boolean z) {
        this.a1 = z;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.a0 == strArr) {
            return;
        }
        this.a0 = strArr;
        if (strArr != null) {
            this.B.setRawInputType(655360);
        } else {
            this.B.setRawInputType(2);
        }
        Y();
        w();
        W();
    }

    public void setDividerColor(int i) {
        this.H0 = i;
        this.G0 = new ColorDrawable(i);
    }

    public void setDividerColorResource(int i) {
        setDividerColor(AbstractC9438ws.c(this.b1, i));
    }

    public void setDividerDistance(int i) {
        this.I0 = i;
    }

    public void setDividerDistanceResource(int i) {
        setDividerDistance(getResources().getDimensionPixelSize(i));
    }

    public void setDividerThickness(int i) {
        this.K0 = i;
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getResources().getDimensionPixelSize(i));
    }

    public void setDividerType(int i) {
        this.P0 = i;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.B.setEnabled(z);
    }

    public void setFadingEdgeEnabled(boolean z) {
        this.V0 = z;
    }

    public void setFadingEdgeStrength(float f2) {
        this.W0 = f2;
    }

    public void setFormatter(c cVar) {
        if (cVar == this.g0) {
            return;
        }
        this.g0 = cVar;
        w();
        Y();
    }

    public void setItemSpacing(int i) {
        this.e1 = i;
    }

    public void setLineSpacingMultiplier(float f2) {
        this.Y0 = f2;
    }

    public void setMaxFlingVelocityCoefficient(int i) {
        this.Z0 = i;
        this.D0 = this.d1.getScaledMaximumFlingVelocity() / this.Z0;
    }

    public void setMaxValue(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maxValue must be >= 0");
        }
        this.c0 = i;
        if (i < this.d0) {
            this.d0 = i;
        }
        Z();
        w();
        Y();
        W();
        invalidate();
    }

    public void setMinValue(int i) {
        this.b0 = i;
        if (i > this.d0) {
            this.d0 = i;
        }
        Z();
        w();
        Y();
        W();
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.h0 = j;
    }

    public void setOnScrollListener(d dVar) {
    }

    public void setOnValueChangedListener(e eVar) {
        this.f0 = eVar;
    }

    public void setOrder(int i) {
        this.U0 = i;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.T0 = i;
        S();
        requestLayout();
    }

    public void setScrollerEnabled(boolean z) {
        this.X0 = z;
    }

    public void setSelectedTextAlign(int i) {
        this.J = i;
    }

    public void setSelectedTextColor(int i) {
        this.K = i;
        this.B.setTextColor(i);
    }

    public void setSelectedTextColorResource(int i) {
        setSelectedTextColor(AbstractC9438ws.c(this.b1, i));
    }

    public void setSelectedTextSize(float f2) {
        this.L = f2;
        this.B.setTextSize(J(f2));
    }

    public void setSelectedTextStrikeThru(boolean z) {
        this.M = z;
    }

    public void setSelectedTextUnderline(boolean z) {
        this.N = z;
    }

    public void setSelectedTypeface(Typeface typeface) {
        this.O = typeface;
        if (typeface != null) {
            this.n0.setTypeface(typeface);
            return;
        }
        Typeface typeface2 = this.U;
        if (typeface2 != null) {
            this.n0.setTypeface(typeface2);
        } else {
            this.n0.setTypeface(Typeface.MONOSPACE);
        }
    }

    public void setTextAlign(int i) {
        this.P = i;
    }

    public void setTextColor(int i) {
        this.Q = i;
        this.n0.setColor(i);
    }

    public void setTextColorResource(int i) {
        setTextColor(AbstractC9438ws.c(this.b1, i));
    }

    public void setTextSize(float f2) {
        this.R = f2;
        this.n0.setTextSize(f2);
    }

    public void setTextStrikeThru(boolean z) {
        this.S = z;
    }

    public void setTextUnderline(boolean z) {
        this.T = z;
    }

    public void setTypeface(Typeface typeface) {
        this.U = typeface;
        if (typeface == null) {
            this.B.setTypeface(Typeface.MONOSPACE);
        } else {
            this.B.setTypeface(typeface);
            setSelectedTypeface(this.O);
        }
    }

    public void setValue(int i) {
        R(i, false);
    }

    public void setWheelItemCount(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Wheel item count must be >= 1");
        }
        this.k0 = i;
        int iMax = Math.max(i, 3);
        this.j0 = iMax;
        this.l0 = iMax / 2;
        this.m0 = new int[iMax];
    }

    public void setWrapSelectorWheel(boolean z) {
        this.F0 = z;
        Z();
    }

    public final void t(int[] iArr) {
        int i = 0;
        while (i < iArr.length - 1) {
            int i2 = i + 1;
            iArr[i] = iArr[i2];
            i = i2;
        }
        int i3 = iArr[iArr.length - 2] + 1;
        if (this.E0 && i3 > this.c0) {
            i3 = this.b0;
        }
        iArr[iArr.length - 1] = i3;
        l(i3);
    }

    public final void u() {
        if (y()) {
            setHorizontalFadingEdgeEnabled(true);
            setVerticalFadingEdgeEnabled(false);
            setFadingEdgeLength(((getRight() - getLeft()) - ((int) this.R)) / 2);
        } else {
            setHorizontalFadingEdgeEnabled(false);
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - ((int) this.R)) / 2);
        }
    }

    public final void v() {
        w();
        int[] selectorIndices = getSelectorIndices();
        int length = (int) (((selectorIndices.length - 1) * this.R) + this.L);
        float length2 = selectorIndices.length;
        if (y()) {
            this.V = (int) (((getRight() - getLeft()) - length) / length2);
            this.o0 = ((int) getMaxTextSize()) + this.V;
            this.p0 = (int) (this.C - (r0 * this.l0));
        } else {
            this.W = (int) (((getBottom() - getTop()) - length) / length2);
            this.o0 = ((int) getMaxTextSize()) + this.W;
            this.p0 = (int) (this.D - (r0 * this.l0));
        }
        this.q0 = this.p0;
        Y();
    }

    public final void w() {
        this.i0.clear();
        int[] selectorIndices = getSelectorIndices();
        int value = getValue();
        for (int i = 0; i < selectorIndices.length; i++) {
            int iS = (i - this.l0) + value;
            if (this.E0) {
                iS = s(iS);
            }
            selectorIndices[i] = iS;
            l(iS);
        }
    }

    public boolean x() {
        return getOrder() == 0;
    }

    public boolean y() {
        return getOrientation() == 0;
    }

    public boolean z() {
        return this.X0;
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.J = 1;
        this.K = -16777216;
        this.L = 25.0f;
        this.P = 1;
        this.Q = -16777216;
        this.R = 25.0f;
        this.b0 = 1;
        this.c0 = 100;
        this.h0 = 300L;
        this.i0 = new SparseArray();
        this.j0 = 3;
        this.k0 = 3;
        this.l0 = 3 / 2;
        this.m0 = new int[3];
        this.p0 = Integer.MIN_VALUE;
        this.F0 = true;
        this.H0 = -16777216;
        this.Q0 = 0;
        this.R0 = -1;
        this.V0 = true;
        this.W0 = 0.9f;
        this.X0 = true;
        this.Y0 = 1.0f;
        this.Z0 = 8;
        this.a1 = true;
        this.e1 = 0;
        this.b1 = context;
        this.c1 = NumberFormat.getInstance();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XD0.F, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(XD0.H);
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            this.G0 = drawable;
        } else {
            int color = typedArrayObtainStyledAttributes.getColor(XD0.I, this.H0);
            this.H0 = color;
            setDividerColor(color);
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 48.0f, displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.I0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(XD0.J, iApplyDimension);
        this.J0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(XD0.K, 0);
        this.K0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(XD0.L, iApplyDimension2);
        this.P0 = typedArrayObtainStyledAttributes.getInt(XD0.M, 0);
        this.U0 = typedArrayObtainStyledAttributes.getInt(XD0.X, 0);
        this.T0 = typedArrayObtainStyledAttributes.getInt(XD0.Y, 1);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(XD0.o0, -1);
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(XD0.Q, -1);
        S();
        this.I = true;
        this.d0 = typedArrayObtainStyledAttributes.getInt(XD0.m0, this.d0);
        this.c0 = typedArrayObtainStyledAttributes.getInt(XD0.U, this.c0);
        this.b0 = typedArrayObtainStyledAttributes.getInt(XD0.W, this.b0);
        this.J = typedArrayObtainStyledAttributes.getInt(XD0.a0, this.J);
        this.K = typedArrayObtainStyledAttributes.getColor(XD0.b0, this.K);
        this.L = typedArrayObtainStyledAttributes.getDimension(XD0.c0, U(this.L));
        this.M = typedArrayObtainStyledAttributes.getBoolean(XD0.d0, this.M);
        this.N = typedArrayObtainStyledAttributes.getBoolean(XD0.e0, this.N);
        this.O = Typeface.create(typedArrayObtainStyledAttributes.getString(XD0.f0), 0);
        this.P = typedArrayObtainStyledAttributes.getInt(XD0.g0, this.P);
        this.Q = typedArrayObtainStyledAttributes.getColor(XD0.h0, this.Q);
        this.R = typedArrayObtainStyledAttributes.getDimension(XD0.i0, U(this.R));
        this.S = typedArrayObtainStyledAttributes.getBoolean(XD0.j0, this.S);
        this.T = typedArrayObtainStyledAttributes.getBoolean(XD0.k0, this.T);
        this.U = Typeface.create(typedArrayObtainStyledAttributes.getString(XD0.l0), 0);
        this.g0 = V(typedArrayObtainStyledAttributes.getString(XD0.P));
        this.V0 = typedArrayObtainStyledAttributes.getBoolean(XD0.N, this.V0);
        this.W0 = typedArrayObtainStyledAttributes.getFloat(XD0.O, this.W0);
        this.X0 = typedArrayObtainStyledAttributes.getBoolean(XD0.Z, this.X0);
        this.j0 = typedArrayObtainStyledAttributes.getInt(XD0.n0, this.j0);
        this.Y0 = typedArrayObtainStyledAttributes.getFloat(XD0.T, this.Y0);
        this.Z0 = typedArrayObtainStyledAttributes.getInt(XD0.V, this.Z0);
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(XD0.R, false);
        this.a1 = typedArrayObtainStyledAttributes.getBoolean(XD0.G, true);
        this.e1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(XD0.S, 0);
        setWillNotDraw(false);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(CD0.a, (ViewGroup) this, true);
        EditText editText = (EditText) findViewById(AbstractC6182lD0.a);
        this.B = editText;
        editText.setEnabled(false);
        editText.setFocusable(false);
        editText.setImeOptions(1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.n0 = paint;
        setSelectedTextColor(this.K);
        setTextColor(this.Q);
        setTextSize(this.R);
        setSelectedTextSize(this.L);
        setTypeface(this.U);
        setSelectedTypeface(this.O);
        setFormatter(this.g0);
        Y();
        setValue(this.d0);
        setMaxValue(this.c0);
        setMinValue(this.b0);
        setWheelItemCount(this.j0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(XD0.p0, this.E0);
        this.E0 = z;
        setWrapSelectorWheel(z);
        if (dimensionPixelSize != -1.0f && dimensionPixelSize2 != -1.0f) {
            setScaleX(dimensionPixelSize / this.G);
            setScaleY(dimensionPixelSize2 / this.F);
        } else if (dimensionPixelSize != -1.0f) {
            float f2 = dimensionPixelSize / this.G;
            setScaleX(f2);
            setScaleY(f2);
        } else if (dimensionPixelSize2 != -1.0f) {
            float f3 = dimensionPixelSize2 / this.F;
            setScaleX(f3);
            setScaleY(f3);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.d1 = viewConfiguration;
        this.B0 = viewConfiguration.getScaledTouchSlop();
        this.C0 = this.d1.getScaledMinimumFlingVelocity();
        this.D0 = this.d1.getScaledMaximumFlingVelocity() / this.Z0;
        this.r0 = new C3696cO0(context, null, true);
        this.s0 = new C3696cO0(context, new DecelerateInterpolator(2.5f));
        int i2 = Build.VERSION.SDK_INT;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (i2 >= 26 && getFocusable() == 16) {
            setFocusable(1);
            setFocusableInTouchMode(true);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setSelectedTextSize(int i) {
        setSelectedTextSize(getResources().getDimension(i));
    }

    public void setTextSize(int i) {
        setTextSize(getResources().getDimension(i));
    }

    public void setFormatter(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setFormatter(V(str));
    }

    public void setTypeface(String str) {
        Q(str, 0);
    }

    public void setSelectedTypeface(String str) {
        O(str, 0);
    }

    public void setTypeface(int i) {
        P(i, 0);
    }

    public void setFormatter(int i) {
        setFormatter(getResources().getString(i));
    }

    public void setSelectedTypeface(int i) {
        N(i, 0);
    }
}
