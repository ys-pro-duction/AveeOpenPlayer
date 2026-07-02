package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.daaw.AbstractC2633We1;
import com.daaw.AbstractC3779ch0;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC4336eh0;
import com.daaw.AbstractC5338iE;
import com.daaw.AbstractC6338ln;
import com.daaw.AbstractC6597mj;
import com.daaw.C4904gh0;
import com.daaw.C6856nf;
import com.daaw.C9683xl0;
import com.daaw.G9;
import com.daaw.L11;
import com.daaw.NJ0;
import com.daaw.SD;
import com.daaw.V31;
import com.daaw.WD0;
import com.daaw.Z11;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class a extends C4904gh0 implements V31, Drawable.Callback, Z11.b {
    public static final int[] j1 = {R.attr.state_enabled};
    public static final ShapeDrawable k1 = new ShapeDrawable(new OvalShape());
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public final Context G0;
    public final Paint H0;
    public final Paint I0;
    public final Paint.FontMetrics J0;
    public final RectF K0;
    public final PointF L0;
    public final Path M0;
    public final Z11 N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public boolean U0;
    public int V0;
    public int W0;
    public ColorFilter X0;
    public PorterDuffColorFilter Y0;
    public ColorStateList Z;
    public ColorStateList Z0;
    public ColorStateList a0;
    public PorterDuff.Mode a1;
    public float b0;
    public int[] b1;
    public float c0;
    public boolean c1;
    public ColorStateList d0;
    public ColorStateList d1;
    public float e0;
    public WeakReference e1;
    public ColorStateList f0;
    public TextUtils.TruncateAt f1;
    public CharSequence g0;
    public boolean g1;
    public boolean h0;
    public int h1;
    public Drawable i0;
    public boolean i1;
    public ColorStateList j0;
    public float k0;
    public boolean l0;
    public boolean m0;
    public Drawable n0;
    public Drawable o0;
    public ColorStateList p0;
    public float q0;
    public CharSequence r0;
    public boolean s0;
    public boolean t0;
    public Drawable u0;
    public ColorStateList v0;
    public C9683xl0 w0;
    public C9683xl0 x0;
    public float y0;
    public float z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0264a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c0 = -1.0f;
        this.H0 = new Paint(1);
        this.J0 = new Paint.FontMetrics();
        this.K0 = new RectF();
        this.L0 = new PointF();
        this.M0 = new Path();
        this.W0 = 255;
        this.a1 = PorterDuff.Mode.SRC_IN;
        this.e1 = new WeakReference(null);
        I(context);
        this.G0 = context;
        Z11 z11 = new Z11(this);
        this.N0 = z11;
        this.g0 = "";
        z11.e().density = context.getResources().getDisplayMetrics().density;
        this.I0 = null;
        int[] iArr = j1;
        setState(iArr);
        e2(iArr);
        this.g1 = true;
        if (NJ0.a) {
            k1.setTint(-1);
        }
    }

    public static boolean g1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean k1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean l1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean m1(L11 l11) {
        return (l11 == null || l11.i() == null || !l11.i().isStateful()) ? false : true;
    }

    public static a o0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.n1(attributeSet, i, i2);
        return aVar;
    }

    public ColorStateList A0() {
        return this.a0;
    }

    public void A1(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            setShapeAppearanceModel(A().w(f));
        }
    }

    public void A2(int i) {
        z2(this.G0.getResources().getDimension(i));
    }

    public float B0() {
        return this.i1 ? C() : this.c0;
    }

    public void B1(int i) {
        A1(this.G0.getResources().getDimension(i));
    }

    public void B2(float f) {
        L11 l11B1 = b1();
        if (l11B1 != null) {
            l11B1.l(f);
            this.N0.e().setTextSize(f);
            a();
        }
    }

    public float C0() {
        return this.F0;
    }

    public void C1(float f) {
        if (this.F0 != f) {
            this.F0 = f;
            invalidateSelf();
            o1();
        }
    }

    public void C2(float f) {
        if (this.B0 != f) {
            this.B0 = f;
            invalidateSelf();
            o1();
        }
    }

    public Drawable D0() {
        Drawable drawable = this.i0;
        if (drawable != null) {
            return SD.q(drawable);
        }
        return null;
    }

    public void D1(int i) {
        C1(this.G0.getResources().getDimension(i));
    }

    public void D2(int i) {
        C2(this.G0.getResources().getDimension(i));
    }

    public float E0() {
        return this.k0;
    }

    public void E1(Drawable drawable) {
        Drawable drawableD0 = D0();
        if (drawableD0 != drawable) {
            float fF0 = f0();
            this.i0 = drawable != null ? SD.r(drawable).mutate() : null;
            float fF02 = f0();
            J2(drawableD0);
            if (H2()) {
                d0(this.i0);
            }
            invalidateSelf();
            if (fF0 != fF02) {
                o1();
            }
        }
    }

    public void E2(boolean z) {
        if (this.c1 != z) {
            this.c1 = z;
            K2();
            onStateChange(getState());
        }
    }

    public ColorStateList F0() {
        return this.j0;
    }

    public void F1(int i) {
        E1(G9.b(this.G0, i));
    }

    public boolean F2() {
        return this.g1;
    }

    public float G0() {
        return this.b0;
    }

    public void G1(float f) {
        if (this.k0 != f) {
            float fF0 = f0();
            this.k0 = f;
            float fF02 = f0();
            invalidateSelf();
            if (fF0 != fF02) {
                o1();
            }
        }
    }

    public final boolean G2() {
        return this.t0 && this.u0 != null && this.U0;
    }

    public float H0() {
        return this.y0;
    }

    public void H1(int i) {
        G1(this.G0.getResources().getDimension(i));
    }

    public final boolean H2() {
        return this.h0 && this.i0 != null;
    }

    public ColorStateList I0() {
        return this.d0;
    }

    public void I1(ColorStateList colorStateList) {
        this.l0 = true;
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            if (H2()) {
                SD.o(this.i0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean I2() {
        return this.m0 && this.n0 != null;
    }

    public float J0() {
        return this.e0;
    }

    public void J1(int i) {
        I1(G9.a(this.G0, i));
    }

    public final void J2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public Drawable K0() {
        Drawable drawable = this.n0;
        if (drawable != null) {
            return SD.q(drawable);
        }
        return null;
    }

    public void K1(int i) {
        L1(this.G0.getResources().getBoolean(i));
    }

    public final void K2() {
        this.d1 = this.c1 ? NJ0.b(this.f0) : null;
    }

    public CharSequence L0() {
        return this.r0;
    }

    public void L1(boolean z) {
        if (this.h0 != z) {
            boolean zH2 = H2();
            this.h0 = z;
            boolean zH22 = H2();
            if (zH2 != zH22) {
                if (zH22) {
                    d0(this.i0);
                } else {
                    J2(this.i0);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public final void L2() {
        this.o0 = new RippleDrawable(NJ0.b(Y0()), this.n0, k1);
    }

    public float M0() {
        return this.E0;
    }

    public void M1(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            o1();
        }
    }

    public float N0() {
        return this.q0;
    }

    public void N1(int i) {
        M1(this.G0.getResources().getDimension(i));
    }

    public float O0() {
        return this.D0;
    }

    public void O1(float f) {
        if (this.y0 != f) {
            this.y0 = f;
            invalidateSelf();
            o1();
        }
    }

    public int[] P0() {
        return this.b1;
    }

    public void P1(int i) {
        O1(this.G0.getResources().getDimension(i));
    }

    public ColorStateList Q0() {
        return this.p0;
    }

    public void Q1(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (this.i1) {
                Y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void R0(RectF rectF) {
        i0(getBounds(), rectF);
    }

    public void R1(int i) {
        Q1(G9.a(this.G0, i));
    }

    public final float S0() {
        Drawable drawable = this.U0 ? this.u0 : this.i0;
        float fCeil = this.k0;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(AbstractC2633We1.b(this.G0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void S1(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            this.H0.setStrokeWidth(f);
            if (this.i1) {
                super.Z(f);
            }
            invalidateSelf();
        }
    }

    public final float T0() {
        Drawable drawable = this.U0 ? this.u0 : this.i0;
        float f = this.k0;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void T1(int i) {
        S1(this.G0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt U0() {
        return this.f1;
    }

    public final void U1(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            onStateChange(getState());
        }
    }

    public C9683xl0 V0() {
        return this.x0;
    }

    public void V1(Drawable drawable) {
        Drawable drawableK0 = K0();
        if (drawableK0 != drawable) {
            float fJ0 = j0();
            this.n0 = drawable != null ? SD.r(drawable).mutate() : null;
            if (NJ0.a) {
                L2();
            }
            float fJ02 = j0();
            J2(drawableK0);
            if (I2()) {
                d0(this.n0);
            }
            invalidateSelf();
            if (fJ0 != fJ02) {
                o1();
            }
        }
    }

    public float W0() {
        return this.A0;
    }

    public void W1(CharSequence charSequence) {
        if (this.r0 != charSequence) {
            this.r0 = C6856nf.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float X0() {
        return this.z0;
    }

    public void X1(float f) {
        if (this.E0 != f) {
            this.E0 = f;
            invalidateSelf();
            if (I2()) {
                o1();
            }
        }
    }

    public ColorStateList Y0() {
        return this.f0;
    }

    public void Y1(int i) {
        X1(this.G0.getResources().getDimension(i));
    }

    public C9683xl0 Z0() {
        return this.w0;
    }

    public void Z1(int i) {
        V1(G9.b(this.G0, i));
    }

    @Override // com.daaw.Z11.b
    public void a() {
        o1();
        invalidateSelf();
    }

    public CharSequence a1() {
        return this.g0;
    }

    public void a2(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            invalidateSelf();
            if (I2()) {
                o1();
            }
        }
    }

    public L11 b1() {
        return this.N0.d();
    }

    public void b2(int i) {
        a2(this.G0.getResources().getDimension(i));
    }

    public float c1() {
        return this.C0;
    }

    public void c2(float f) {
        if (this.D0 != f) {
            this.D0 = f;
            invalidateSelf();
            if (I2()) {
                o1();
            }
        }
    }

    public final void d0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        SD.m(drawable, SD.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.n0) {
            if (drawable.isStateful()) {
                drawable.setState(P0());
            }
            SD.o(drawable, this.p0);
            return;
        }
        Drawable drawable2 = this.i0;
        if (drawable == drawable2 && this.l0) {
            SD.o(drawable2, this.j0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float d1() {
        return this.B0;
    }

    public void d2(int i) {
        c2(this.G0.getResources().getDimension(i));
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.W0;
        if (i < 255) {
            canvas2 = canvas;
            iA = AbstractC6597mj.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        t0(canvas2, bounds);
        q0(canvas2, bounds);
        if (this.i1) {
            super.draw(canvas2);
        }
        s0(canvas2, bounds);
        v0(canvas2, bounds);
        r0(canvas2, bounds);
        p0(canvas2, bounds);
        if (this.g1) {
            x0(canvas2, bounds);
        }
        u0(canvas2, bounds);
        w0(canvas2, bounds);
        if (this.W0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public final void e0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (H2() || G2()) {
            float f = this.y0 + this.z0;
            float fT0 = T0();
            if (SD.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + fT0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - fT0;
            }
            float fS0 = S0();
            float fExactCenterY = rect.exactCenterY() - (fS0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fS0;
        }
    }

    public final ColorFilter e1() {
        ColorFilter colorFilter = this.X0;
        return colorFilter != null ? colorFilter : this.Y0;
    }

    public boolean e2(int[] iArr) {
        if (Arrays.equals(this.b1, iArr)) {
            return false;
        }
        this.b1 = iArr;
        if (I2()) {
            return p1(getState(), iArr);
        }
        return false;
    }

    public float f0() {
        if (H2() || G2()) {
            return this.z0 + T0() + this.A0;
        }
        return 0.0f;
    }

    public boolean f1() {
        return this.c1;
    }

    public void f2(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            if (I2()) {
                SD.o(this.n0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void g0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (I2()) {
            float f = this.F0 + this.E0 + this.q0 + this.D0 + this.C0;
            if (SD.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public void g2(int i) {
        f2(G9.a(this.G0, i));
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.W0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.X0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.b0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.y0 + f0() + this.B0 + this.N0.f(a1().toString()) + this.C0 + j0() + this.F0), this.h1);
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.i1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.c0);
        } else {
            outline.setRoundRect(bounds, this.c0);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public final void h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2()) {
            float f = this.F0 + this.E0;
            if (SD.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.q0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.q0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.q0;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public boolean h1() {
        return this.s0;
    }

    public void h2(boolean z) {
        if (this.m0 != z) {
            boolean zI2 = I2();
            this.m0 = z;
            boolean zI22 = I2();
            if (zI2 != zI22) {
                if (zI22) {
                    d0(this.n0);
                } else {
                    J2(this.n0);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public final void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2()) {
            float f = this.F0 + this.E0 + this.q0 + this.D0 + this.C0;
            if (SD.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean i1() {
        return l1(this.n0);
    }

    public void i2(InterfaceC0264a interfaceC0264a) {
        this.e1 = new WeakReference(interfaceC0264a);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (k1(this.Z) || k1(this.a0) || k1(this.d0)) {
            return true;
        }
        return (this.c1 && k1(this.d1)) || m1(this.N0.d()) || n0() || l1(this.i0) || l1(this.u0) || k1(this.Z0);
    }

    public float j0() {
        if (I2()) {
            return this.D0 + this.q0 + this.E0;
        }
        return 0.0f;
    }

    public boolean j1() {
        return this.m0;
    }

    public void j2(TextUtils.TruncateAt truncateAt) {
        this.f1 = truncateAt;
    }

    public final void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.g0 != null) {
            float fF0 = this.y0 + f0() + this.B0;
            float fJ0 = this.F0 + j0() + this.C0;
            if (SD.f(this) == 0) {
                rectF.left = rect.left + fF0;
                rectF.right = rect.right - fJ0;
            } else {
                rectF.left = rect.left + fJ0;
                rectF.right = rect.right - fF0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void k2(C9683xl0 c9683xl0) {
        this.x0 = c9683xl0;
    }

    public final float l0() {
        this.N0.e().getFontMetrics(this.J0);
        Paint.FontMetrics fontMetrics = this.J0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void l2(int i) {
        k2(C9683xl0.c(this.G0, i));
    }

    public Paint.Align m0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.g0 != null) {
            float fF0 = this.y0 + f0() + this.B0;
            if (SD.f(this) == 0) {
                pointF.x = rect.left + fF0;
            } else {
                pointF.x = rect.right - fF0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - l0();
        }
        return align;
    }

    public void m2(float f) {
        if (this.A0 != f) {
            float fF0 = f0();
            this.A0 = f;
            float fF02 = f0();
            invalidateSelf();
            if (fF0 != fF02) {
                o1();
            }
        }
    }

    public final boolean n0() {
        return this.t0 && this.u0 != null && this.s0;
    }

    public final void n1(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayI = AbstractC3885d31.i(this.G0, attributeSet, WD0.Z, i, i2, new int[0]);
        this.i1 = typedArrayI.hasValue(WD0.L0);
        U1(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.y0));
        y1(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.l0));
        M1(typedArrayI.getDimension(WD0.t0, 0.0f));
        if (typedArrayI.hasValue(WD0.m0)) {
            A1(typedArrayI.getDimension(WD0.m0, 0.0f));
        }
        Q1(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.w0));
        S1(typedArrayI.getDimension(WD0.x0, 0.0f));
        r2(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.K0));
        w2(typedArrayI.getText(WD0.f0));
        L11 l11F = AbstractC4336eh0.f(this.G0, typedArrayI, WD0.a0);
        l11F.l(typedArrayI.getDimension(WD0.b0, l11F.j()));
        if (Build.VERSION.SDK_INT < 23) {
            l11F.k(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.c0));
        }
        x2(l11F);
        int i3 = typedArrayI.getInt(WD0.d0, 0);
        if (i3 == 1) {
            j2(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            j2(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            j2(TextUtils.TruncateAt.END);
        }
        L1(typedArrayI.getBoolean(WD0.s0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            L1(typedArrayI.getBoolean(WD0.p0, false));
        }
        E1(AbstractC4336eh0.d(this.G0, typedArrayI, WD0.o0));
        if (typedArrayI.hasValue(WD0.r0)) {
            I1(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.r0));
        }
        G1(typedArrayI.getDimension(WD0.q0, -1.0f));
        h2(typedArrayI.getBoolean(WD0.F0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            h2(typedArrayI.getBoolean(WD0.A0, false));
        }
        V1(AbstractC4336eh0.d(this.G0, typedArrayI, WD0.z0));
        f2(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.E0));
        a2(typedArrayI.getDimension(WD0.C0, 0.0f));
        q1(typedArrayI.getBoolean(WD0.g0, false));
        x1(typedArrayI.getBoolean(WD0.k0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            x1(typedArrayI.getBoolean(WD0.i0, false));
        }
        s1(AbstractC4336eh0.d(this.G0, typedArrayI, WD0.h0));
        if (typedArrayI.hasValue(WD0.j0)) {
            u1(AbstractC4336eh0.a(this.G0, typedArrayI, WD0.j0));
        }
        u2(C9683xl0.b(this.G0, typedArrayI, WD0.M0));
        k2(C9683xl0.b(this.G0, typedArrayI, WD0.H0));
        O1(typedArrayI.getDimension(WD0.v0, 0.0f));
        o2(typedArrayI.getDimension(WD0.J0, 0.0f));
        m2(typedArrayI.getDimension(WD0.I0, 0.0f));
        C2(typedArrayI.getDimension(WD0.O0, 0.0f));
        z2(typedArrayI.getDimension(WD0.N0, 0.0f));
        c2(typedArrayI.getDimension(WD0.D0, 0.0f));
        X1(typedArrayI.getDimension(WD0.B0, 0.0f));
        C1(typedArrayI.getDimension(WD0.n0, 0.0f));
        q2(typedArrayI.getDimensionPixelSize(WD0.e0, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public void n2(int i) {
        m2(this.G0.getResources().getDimension(i));
    }

    public void o1() {
        InterfaceC0264a interfaceC0264a = (InterfaceC0264a) this.e1.get();
        if (interfaceC0264a != null) {
            interfaceC0264a.a();
        }
    }

    public void o2(float f) {
        if (this.z0 != f) {
            float fF0 = f0();
            this.z0 = f;
            float fF02 = f0();
            invalidateSelf();
            if (fF0 != fF02) {
                o1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (H2()) {
            zOnLayoutDirectionChanged |= SD.m(this.i0, i);
        }
        if (G2()) {
            zOnLayoutDirectionChanged |= SD.m(this.u0, i);
        }
        if (I2()) {
            zOnLayoutDirectionChanged |= SD.m(this.n0, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (H2()) {
            zOnLevelChange |= this.i0.setLevel(i);
        }
        if (G2()) {
            zOnLevelChange |= this.u0.setLevel(i);
        }
        if (I2()) {
            zOnLevelChange |= this.n0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.i1) {
            super.onStateChange(iArr);
        }
        return p1(iArr, P0());
    }

    public final void p0(Canvas canvas, Rect rect) {
        if (G2()) {
            e0(rect, this.K0);
            RectF rectF = this.K0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.u0.setBounds(0, 0, (int) this.K0.width(), (int) this.K0.height());
            this.u0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public final boolean p1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.Z;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.O0) : 0);
        boolean state = true;
        if (this.O0 != iL) {
            this.O0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.a0;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.P0) : 0);
        if (this.P0 != iL2) {
            this.P0 = iL2;
            zOnStateChange = true;
        }
        int i = AbstractC3779ch0.i(iL, iL2);
        if ((this.Q0 != i) | (v() == null)) {
            this.Q0 = i;
            S(ColorStateList.valueOf(i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.d0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.R0) : 0;
        if (this.R0 != colorForState) {
            this.R0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.d1 == null || !NJ0.c(iArr)) ? 0 : this.d1.getColorForState(iArr, this.S0);
        if (this.S0 != colorForState2) {
            this.S0 = colorForState2;
            if (this.c1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.N0.d() == null || this.N0.d().i() == null) ? 0 : this.N0.d().i().getColorForState(iArr, this.T0);
        if (this.T0 != colorForState3) {
            this.T0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = g1(getState(), R.attr.state_checked) && this.s0;
        if (this.U0 == z2 || this.u0 == null) {
            z = false;
        } else {
            float fF0 = f0();
            this.U0 = z2;
            if (fF0 != f0()) {
                zOnStateChange = true;
                z = true;
            } else {
                zOnStateChange = true;
                z = false;
            }
        }
        ColorStateList colorStateList4 = this.Z0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.V0) : 0;
        if (this.V0 != colorForState4) {
            this.V0 = colorForState4;
            this.Y0 = AbstractC5338iE.f(this, this.Z0, this.a1);
        } else {
            state = zOnStateChange;
        }
        if (l1(this.i0)) {
            state |= this.i0.setState(iArr);
        }
        if (l1(this.u0)) {
            state |= this.u0.setState(iArr);
        }
        if (l1(this.n0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.n0.setState(iArr3);
        }
        if (NJ0.a && l1(this.o0)) {
            state |= this.o0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            o1();
        }
        return state;
    }

    public void p2(int i) {
        o2(this.G0.getResources().getDimension(i));
    }

    public final void q0(Canvas canvas, Rect rect) {
        if (this.i1) {
            return;
        }
        this.H0.setColor(this.P0);
        this.H0.setStyle(Paint.Style.FILL);
        this.H0.setColorFilter(e1());
        this.K0.set(rect);
        canvas.drawRoundRect(this.K0, B0(), B0(), this.H0);
    }

    public void q1(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            float fF0 = f0();
            if (!z && this.U0) {
                this.U0 = false;
            }
            float fF02 = f0();
            invalidateSelf();
            if (fF0 != fF02) {
                o1();
            }
        }
    }

    public void q2(int i) {
        this.h1 = i;
    }

    public final void r0(Canvas canvas, Rect rect) {
        if (H2()) {
            e0(rect, this.K0);
            RectF rectF = this.K0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.i0.setBounds(0, 0, (int) this.K0.width(), (int) this.K0.height());
            this.i0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void r1(int i) {
        q1(this.G0.getResources().getBoolean(i));
    }

    public void r2(ColorStateList colorStateList) {
        if (this.f0 != colorStateList) {
            this.f0 = colorStateList;
            K2();
            onStateChange(getState());
        }
    }

    public final void s0(Canvas canvas, Rect rect) {
        if (this.e0 <= 0.0f || this.i1) {
            return;
        }
        this.H0.setColor(this.R0);
        this.H0.setStyle(Paint.Style.STROKE);
        if (!this.i1) {
            this.H0.setColorFilter(e1());
        }
        RectF rectF = this.K0;
        float f = rect.left;
        float f2 = this.e0;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.c0 - (this.e0 / 2.0f);
        canvas.drawRoundRect(this.K0, f3, f3, this.H0);
    }

    public void s1(Drawable drawable) {
        if (this.u0 != drawable) {
            float fF0 = f0();
            this.u0 = drawable;
            float fF02 = f0();
            J2(this.u0);
            d0(this.u0);
            invalidateSelf();
            if (fF0 != fF02) {
                o1();
            }
        }
    }

    public void s2(int i) {
        r2(G9.a(this.G0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.W0 != i) {
            this.W0 = i;
            invalidateSelf();
        }
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.X0 != colorFilter) {
            this.X0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.daaw.C4904gh0, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.a1 != mode) {
            this.a1 = mode;
            this.Y0 = AbstractC5338iE.f(this, this.Z0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (H2()) {
            visible |= this.i0.setVisible(z, z2);
        }
        if (G2()) {
            visible |= this.u0.setVisible(z, z2);
        }
        if (I2()) {
            visible |= this.n0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Canvas canvas, Rect rect) {
        if (this.i1) {
            return;
        }
        this.H0.setColor(this.O0);
        this.H0.setStyle(Paint.Style.FILL);
        this.K0.set(rect);
        canvas.drawRoundRect(this.K0, B0(), B0(), this.H0);
    }

    public void t1(int i) {
        s1(G9.b(this.G0, i));
    }

    public void t2(boolean z) {
        this.g1 = z;
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (I2()) {
            h0(rect, this.K0);
            RectF rectF = this.K0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.n0.setBounds(0, 0, (int) this.K0.width(), (int) this.K0.height());
            if (NJ0.a) {
                this.o0.setBounds(this.n0.getBounds());
                this.o0.jumpToCurrentState();
                this.o0.draw(canvas);
            } else {
                this.n0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    public void u1(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            if (n0()) {
                SD.o(this.u0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void u2(C9683xl0 c9683xl0) {
        this.w0 = c9683xl0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        this.H0.setColor(this.S0);
        this.H0.setStyle(Paint.Style.FILL);
        this.K0.set(rect);
        if (!this.i1) {
            canvas.drawRoundRect(this.K0, B0(), B0(), this.H0);
        } else {
            h(new RectF(rect), this.M0);
            super.p(canvas, this.H0, this.M0, s());
        }
    }

    public void v1(int i) {
        u1(G9.a(this.G0, i));
    }

    public void v2(int i) {
        u2(C9683xl0.c(this.G0, i));
    }

    public final void w0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.I0;
        if (paint != null) {
            paint.setColor(AbstractC6338ln.o(-16777216, 127));
            canvas.drawRect(rect, this.I0);
            if (H2() || G2()) {
                e0(rect, this.K0);
                canvas.drawRect(this.K0, this.I0);
            }
            if (this.g0 != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.I0);
            } else {
                canvas2 = canvas;
            }
            if (I2()) {
                h0(rect, this.K0);
                canvas2.drawRect(this.K0, this.I0);
            }
            this.I0.setColor(AbstractC6338ln.o(-65536, 127));
            g0(rect, this.K0);
            canvas2.drawRect(this.K0, this.I0);
            this.I0.setColor(AbstractC6338ln.o(-16711936, 127));
            i0(rect, this.K0);
            canvas2.drawRect(this.K0, this.I0);
        }
    }

    public void w1(int i) {
        x1(this.G0.getResources().getBoolean(i));
    }

    public void w2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.g0, charSequence)) {
            return;
        }
        this.g0 = charSequence;
        this.N0.i(true);
        invalidateSelf();
        o1();
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (this.g0 != null) {
            Paint.Align alignM0 = m0(rect, this.L0);
            k0(rect, this.K0);
            if (this.N0.d() != null) {
                this.N0.e().drawableState = getState();
                this.N0.j(this.G0);
            }
            this.N0.e().setTextAlign(alignM0);
            int iSave = 0;
            boolean z = Math.round(this.N0.f(a1().toString())) > Math.round(this.K0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.K0);
            }
            CharSequence charSequenceEllipsize = this.g0;
            if (z && this.f1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.N0.e(), this.K0.width(), this.f1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.L0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.N0.e());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void x1(boolean z) {
        if (this.t0 != z) {
            boolean zG2 = G2();
            this.t0 = z;
            boolean zG22 = G2();
            if (zG2 != zG22) {
                if (zG22) {
                    d0(this.u0);
                } else {
                    J2(this.u0);
                }
                invalidateSelf();
                o1();
            }
        }
    }

    public void x2(L11 l11) {
        this.N0.h(l11, this.G0);
    }

    public Drawable y0() {
        return this.u0;
    }

    public void y1(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void y2(int i) {
        x2(new L11(this.G0, i));
    }

    public ColorStateList z0() {
        return this.v0;
    }

    public void z1(int i) {
        y1(G9.a(this.G0, i));
    }

    public void z2(float f) {
        if (this.C0 != f) {
            this.C0 = f;
            invalidateSelf();
            o1();
        }
    }
}
