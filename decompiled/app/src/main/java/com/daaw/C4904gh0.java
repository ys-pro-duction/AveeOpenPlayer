package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.daaw.C5671jR0;
import com.daaw.C5950kR0;
import com.daaw.C9313wR0;
import java.util.BitSet;

/* JADX INFO: renamed from: com.daaw.gh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4904gh0 extends Drawable implements V31, DR0 {
    public static final Paint Y;
    public c B;
    public final C9313wR0.g[] C;
    public final C9313wR0.g[] D;
    public final BitSet E;
    public boolean F;
    public final Matrix G;
    public final Path H;
    public final Path I;
    public final RectF J;
    public final RectF K;
    public final Region L;
    public final Region M;
    public C5671jR0 N;
    public final Paint O;
    public final Paint P;
    public final C4833gR0 Q;
    public final C5950kR0.b R;
    public final C5950kR0 S;
    public PorterDuffColorFilter T;
    public PorterDuffColorFilter U;
    public int V;
    public final RectF W;
    public boolean X;

    /* JADX INFO: renamed from: com.daaw.gh0$a */
    public class a implements C5950kR0.b {
        public a() {
        }

        @Override // com.daaw.C5950kR0.b
        public void a(C9313wR0 c9313wR0, Matrix matrix, int i) {
            C4904gh0.this.E.set(i + 4, c9313wR0.e());
            C4904gh0.this.D[i] = c9313wR0.f(matrix);
        }

        @Override // com.daaw.C5950kR0.b
        public void b(C9313wR0 c9313wR0, Matrix matrix, int i) {
            C4904gh0.this.E.set(i, c9313wR0.e());
            C4904gh0.this.C[i] = c9313wR0.f(matrix);
        }
    }

    /* JADX INFO: renamed from: com.daaw.gh0$b */
    public class b implements C5671jR0.c {
        public final /* synthetic */ float a;

        public b(float f) {
            this.a = f;
        }

        @Override // com.daaw.C5671jR0.c
        public InterfaceC2999Zs a(InterfaceC2999Zs interfaceC2999Zs) {
            return interfaceC2999Zs instanceof C9548xG0 ? interfaceC2999Zs : new C3047a3(this.a, interfaceC2999Zs);
        }
    }

    static {
        Paint paint = new Paint(1);
        Y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C4904gh0() {
        this(new C5671jR0());
    }

    public static int N(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public static C4904gh0 m(Context context, float f) {
        int iC = AbstractC3779ch0.c(context, JC0.k, C4904gh0.class.getSimpleName());
        C4904gh0 c4904gh0 = new C4904gh0();
        c4904gh0.I(context);
        c4904gh0.S(ColorStateList.valueOf(iC));
        c4904gh0.R(f);
        return c4904gh0;
    }

    public C5671jR0 A() {
        return this.B.a;
    }

    public final float B() {
        if (H()) {
            return this.P.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float C() {
        return this.B.a.r().a(s());
    }

    public float D() {
        return this.B.p;
    }

    public float E() {
        return u() + D();
    }

    public final boolean F() {
        c cVar = this.B;
        int i = cVar.q;
        if (i == 1 || cVar.r <= 0) {
            return false;
        }
        return i == 2 || P();
    }

    public final boolean G() {
        Paint.Style style = this.B.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean H() {
        Paint.Style style = this.B.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.P.getStrokeWidth() > 0.0f;
    }

    public void I(Context context) {
        this.B.b = new RF(context);
        c0();
    }

    public final void J() {
        super.invalidateSelf();
    }

    public boolean K() {
        RF rf = this.B.b;
        return rf != null && rf.d();
    }

    public boolean L() {
        return this.B.a.u(s());
    }

    public final void M(Canvas canvas) {
        if (F()) {
            canvas.save();
            O(canvas);
            if (!this.X) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.W.width() - getBounds().width());
            int iHeight = (int) (this.W.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.W.width()) + (this.B.r * 2) + iWidth, ((int) this.W.height()) + (this.B.r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.B.r) - iWidth;
            float f2 = (getBounds().top - this.B.r) - iHeight;
            canvas2.translate(-f, -f2);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void O(Canvas canvas) {
        canvas.translate(y(), z());
    }

    public boolean P() {
        return (L() || this.H.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Q(InterfaceC2999Zs interfaceC2999Zs) {
        setShapeAppearanceModel(this.B.a.x(interfaceC2999Zs));
    }

    public void R(float f) {
        c cVar = this.B;
        if (cVar.o != f) {
            cVar.o = f;
            c0();
        }
    }

    public void S(ColorStateList colorStateList) {
        c cVar = this.B;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void T(float f) {
        c cVar = this.B;
        if (cVar.k != f) {
            cVar.k = f;
            this.F = true;
            invalidateSelf();
        }
    }

    public void U(int i, int i2, int i3, int i4) {
        c cVar = this.B;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.B.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void V(float f) {
        c cVar = this.B;
        if (cVar.n != f) {
            cVar.n = f;
            c0();
        }
    }

    public void W(float f, int i) {
        Z(f);
        Y(ColorStateList.valueOf(i));
    }

    public void X(float f, ColorStateList colorStateList) {
        Z(f);
        Y(colorStateList);
    }

    public void Y(ColorStateList colorStateList) {
        c cVar = this.B;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void Z(float f) {
        this.B.l = f;
        invalidateSelf();
    }

    public final boolean a0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.B.d == null || color2 == (colorForState2 = this.B.d.getColorForState(iArr, (color2 = this.O.getColor())))) {
            z = false;
        } else {
            this.O.setColor(colorForState2);
            z = true;
        }
        if (this.B.e == null || color == (colorForState = this.B.e.getColorForState(iArr, (color = this.P.getColor())))) {
            return z;
        }
        this.P.setColor(colorForState);
        return true;
    }

    public final boolean b0() {
        PorterDuffColorFilter porterDuffColorFilter = this.T;
        PorterDuffColorFilter porterDuffColorFilter2 = this.U;
        c cVar = this.B;
        this.T = k(cVar.g, cVar.h, this.O, true);
        c cVar2 = this.B;
        this.U = k(cVar2.f, cVar2.h, this.P, false);
        c cVar3 = this.B;
        if (cVar3.u) {
            this.Q.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (AbstractC8580tp0.a(porterDuffColorFilter, this.T) && AbstractC8580tp0.a(porterDuffColorFilter2, this.U)) ? false : true;
    }

    public final void c0() {
        float fE = E();
        this.B.r = (int) Math.ceil(0.75f * fE);
        this.B.s = (int) Math.ceil(fE * 0.25f);
        b0();
        J();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.O.setColorFilter(this.T);
        int alpha = this.O.getAlpha();
        this.O.setAlpha(N(alpha, this.B.m));
        this.P.setColorFilter(this.U);
        this.P.setStrokeWidth(this.B.l);
        int alpha2 = this.P.getAlpha();
        this.P.setAlpha(N(alpha2, this.B.m));
        if (this.F) {
            i();
            g(s(), this.H);
            this.F = false;
        }
        M(canvas);
        if (G()) {
            o(canvas);
        }
        if (H()) {
            r(canvas);
        }
        this.O.setAlpha(alpha);
        this.P.setAlpha(alpha2);
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.V = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.B.j != 1.0f) {
            this.G.reset();
            Matrix matrix = this.G;
            float f = this.B.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.G);
        }
        path.computeBounds(this.W, true);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.B.q == 2) {
            return;
        }
        if (L()) {
            outline.setRoundRect(getBounds(), C() * this.B.k);
        } else {
            g(s(), this.H);
            AbstractC5338iE.e(outline, this.H);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.B.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.L.set(getBounds());
        g(s(), this.H);
        this.M.setPath(this.H, this.L);
        this.L.op(this.M, Region.Op.DIFFERENCE);
        return this.L;
    }

    public final void h(RectF rectF, Path path) {
        C5950kR0 c5950kR0 = this.S;
        c cVar = this.B;
        c5950kR0.e(cVar.a, cVar.k, rectF, this.R, path);
    }

    public final void i() {
        C5671jR0 c5671jR0Y = A().y(new b(-B()));
        this.N = c5671jR0Y;
        this.S.d(c5671jR0Y, this.B.k, t(), this.I);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.F = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.B.g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.B.f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.B.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.B.d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        this.V = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public int l(int i) {
        float fE = E() + x();
        RF rf = this.B.b;
        return rf != null ? rf.c(i, fE) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.B = new c(this.B);
        return this;
    }

    public final void n(Canvas canvas) {
        this.E.cardinality();
        if (this.B.s != 0) {
            canvas.drawPath(this.H, this.Q.c());
        }
        for (int i = 0; i < 4; i++) {
            this.C[i].b(this.Q, this.B.r, canvas);
            this.D[i].b(this.Q, this.B.r, canvas);
        }
        if (this.X) {
            int iY = y();
            int iZ = z();
            canvas.translate(-iY, -iZ);
            canvas.drawPath(this.H, Y);
            canvas.translate(iY, iZ);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.O, this.H, this.B.a, s());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.F = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = a0(iArr) || b0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.B.a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, C5671jR0 c5671jR0, RectF rectF) {
        if (!c5671jR0.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = c5671jR0.t().a(rectF) * this.B.k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void r(Canvas canvas) {
        q(canvas, this.P, this.I, this.N, t());
    }

    public RectF s() {
        this.J.set(getBounds());
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.B;
        if (cVar.m != i) {
            cVar.m = i;
            J();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.B.c = colorFilter;
        J();
    }

    @Override // com.daaw.DR0
    public void setShapeAppearanceModel(C5671jR0 c5671jR0) {
        this.B.a = c5671jR0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.B.g = colorStateList;
        b0();
        J();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.B;
        if (cVar.h != mode) {
            cVar.h = mode;
            b0();
            J();
        }
    }

    public final RectF t() {
        this.K.set(s());
        float fB = B();
        this.K.inset(fB, fB);
        return this.K;
    }

    public float u() {
        return this.B.o;
    }

    public ColorStateList v() {
        return this.B.d;
    }

    public float w() {
        return this.B.k;
    }

    public float x() {
        return this.B.n;
    }

    public int y() {
        return (int) (((double) this.B.s) * Math.sin(Math.toRadians(r0.t)));
    }

    public int z() {
        return (int) (((double) this.B.s) * Math.cos(Math.toRadians(r0.t)));
    }

    public C4904gh0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C5671jR0.e(context, attributeSet, i, i2).m());
    }

    public C4904gh0(C5671jR0 c5671jR0) {
        this(new c(c5671jR0, null));
    }

    public C4904gh0(c cVar) {
        C5950kR0 c5950kR0;
        this.C = new C9313wR0.g[4];
        this.D = new C9313wR0.g[4];
        this.E = new BitSet(8);
        this.G = new Matrix();
        this.H = new Path();
        this.I = new Path();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Region();
        this.M = new Region();
        Paint paint = new Paint(1);
        this.O = paint;
        Paint paint2 = new Paint(1);
        this.P = paint2;
        this.Q = new C4833gR0();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c5950kR0 = C5950kR0.k();
        } else {
            c5950kR0 = new C5950kR0();
        }
        this.S = c5950kR0;
        this.W = new RectF();
        this.X = true;
        this.B = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        b0();
        a0(getState());
        this.R = new a();
    }

    /* JADX INFO: renamed from: com.daaw.gh0$c */
    public static class c extends Drawable.ConstantState {
        public C5671jR0 a;
        public RF b;
        public ColorFilter c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(C5671jR0 c5671jR0, RF rf) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = c5671jR0;
            this.b = rf;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C4904gh0 c4904gh0 = new C4904gh0(this);
            c4904gh0.F = true;
            return c4904gh0;
        }

        public c(c cVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }
}
