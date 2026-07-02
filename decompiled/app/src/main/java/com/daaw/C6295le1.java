package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.le1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6295le1 extends View implements InterfaceC1205Ir0 {
    public static final c N = new c(null);
    public static final InterfaceC3429bR O = b.B;
    public static final ViewOutlineProvider P = new a();
    public static Method Q;
    public static Field R;
    public static boolean S;
    public static boolean T;
    public final C6423m5 B;
    public final GD C;
    public NQ D;
    public LQ E;
    public final C9434wr0 F;
    public boolean G;
    public Rect H;
    public boolean I;
    public boolean J;
    public final C7434pj K;
    public final C5877k90 L;
    public long M;

    /* JADX INFO: renamed from: com.daaw.le1$a */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            G10.g(view, "view");
            G10.g(outline, "outline");
            Outline outlineC = ((C6295le1) view).F.c();
            G10.d(outlineC);
            outline.set(outlineC);
        }
    }

    /* JADX INFO: renamed from: com.daaw.le1$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            G10.g(view, "view");
            G10.g(matrix, "matrix");
            matrix.set(view.getMatrix());
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.le1$c */
    public static final class c {
        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final boolean a() {
            return C6295le1.S;
        }

        public final boolean b() {
            return C6295le1.T;
        }

        public final void c(boolean z) {
            C6295le1.T = z;
        }

        public final void d(View view) {
            G10.g(view, "view");
            try {
                if (!a()) {
                    C6295le1.S = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        C6295le1.Q = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        C6295le1.R = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        C6295le1.Q = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        C6295le1.R = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = C6295le1.Q;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = C6295le1.R;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = C6295le1.R;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = C6295le1.Q;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.le1$d */
    public static final class d {
        public static final d a = new d();

        public static final long a(View view) {
            G10.g(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295le1(C6423m5 c6423m5, GD gd, NQ nq, LQ lq) {
        super(c6423m5.getContext());
        G10.g(c6423m5, "ownerView");
        G10.g(gd, "container");
        G10.g(nq, "drawBlock");
        G10.g(lq, "invalidateParentLayer");
        this.B = c6423m5;
        this.C = gd;
        this.D = nq;
        this.E = lq;
        this.F = new C9434wr0(c6423m5.getDensity());
        this.K = new C7434pj();
        this.L = new C5877k90(O);
        this.M = AbstractC6425m51.a.a();
        setWillNotDraw(false);
        setId(View.generateViewId());
        gd.addView(this);
    }

    private final InterfaceC6090kt0 getManualClipPath() {
        if (!getClipToOutline() || this.F.d()) {
            return null;
        }
        return this.F.b();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.I) {
            this.I = z;
            this.B.X(this, z);
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void a(C6892nm0 c6892nm0, boolean z) {
        G10.g(c6892nm0, "rect");
        if (!z) {
            C9384wh0.g(this.L.b(this), c6892nm0);
            return;
        }
        float[] fArrA = this.L.a(this);
        if (fArrA != null) {
            C9384wh0.g(fArrA, c6892nm0);
        } else {
            c6892nm0.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC5391iR0 interfaceC5391iR0, boolean z, UG0 ug0, long j2, long j3, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz) {
        LQ lq;
        G10.g(interfaceC5391iR0, "shape");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(interfaceC4988gz, "density");
        this.M = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(AbstractC6425m51.d(this.M) * getWidth());
        setPivotY(AbstractC6425m51.e(this.M) * getHeight());
        setCameraDistancePx(f10);
        this.G = z && interfaceC5391iR0 == AbstractC4785gF0.a();
        t();
        boolean z2 = getManualClipPath() != null;
        setClipToOutline(z && interfaceC5391iR0 != AbstractC4785gF0.a());
        boolean zG = this.F.g(interfaceC5391iR0, getAlpha(), getClipToOutline(), getElevation(), enumC7560q90, interfaceC4988gz);
        u();
        boolean z3 = getManualClipPath() != null;
        if (z2 != z3 || (z3 && zG)) {
            invalidate();
        }
        if (!this.J && getElevation() > 0.0f && (lq = this.E) != null) {
            lq.invoke();
        }
        this.L.c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            C7690qe1 c7690qe1 = C7690qe1.a;
            c7690qe1.a(this, AbstractC3530bn.i(j2));
            c7690qe1.b(this, AbstractC3530bn.i(j3));
        }
        if (i >= 31) {
            C8247se1.a.a(this, ug0);
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public boolean c(long j) {
        float fL = C9982yp0.l(j);
        float fM = C9982yp0.m(j);
        if (this.G) {
            return 0.0f <= fL && fL < ((float) getWidth()) && 0.0f <= fM && fM < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.F.e(j);
        }
        return true;
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public long d(long j, boolean z) {
        if (!z) {
            return C9384wh0.f(this.L.b(this), j);
        }
        float[] fArrA = this.L.a(this);
        return fArrA != null ? C9384wh0.f(fArrA, j) : C9982yp0.b.a();
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void destroy() {
        setInvalidated(false);
        this.B.c0();
        this.D = null;
        this.E = null;
        boolean zB0 = this.B.b0(this);
        if (Build.VERSION.SDK_INT >= 23 || T || !zB0) {
            this.C.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        G10.g(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C7434pj c7434pj = this.K;
        Canvas canvasR = c7434pj.a().r();
        c7434pj.a().s(canvas);
        C3336b5 c3336b5A = c7434pj.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            c3336b5A.i();
            this.F.a(c3336b5A);
            z = true;
        }
        NQ nq = this.D;
        if (nq != null) {
            nq.invoke(c3336b5A);
        }
        if (z) {
            c3336b5A.o();
        }
        c7434pj.a().s(canvasR);
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void e(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "canvas");
        boolean z = getElevation() > 0.0f;
        this.J = z;
        if (z) {
            interfaceC6318lj.q();
        }
        this.C.a(interfaceC6318lj, this, getDrawingTime());
        if (this.J) {
            interfaceC6318lj.j();
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void f(long j) {
        int iG = I00.g(j);
        int iF = I00.f(j);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        float f = iG;
        setPivotX(AbstractC6425m51.d(this.M) * f);
        float f2 = iF;
        setPivotY(AbstractC6425m51.e(this.M) * f2);
        this.F.h(BT0.a(f, f2));
        u();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        t();
        this.L.c();
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void g(NQ nq, LQ lq) {
        G10.g(nq, "drawBlock");
        G10.g(lq, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT >= 23 || T) {
            this.C.addView(this);
        } else {
            setVisibility(0);
        }
        this.G = false;
        this.J = false;
        this.M = AbstractC6425m51.a.a();
        this.D = nq;
        this.E = lq;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final GD getContainer() {
        return this.C;
    }

    public long getLayerId() {
        return getId();
    }

    public final C6423m5 getOwnerView() {
        return this.B;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.B);
        }
        return -1L;
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void h(long j) {
        int iF = D00.f(j);
        if (iF != getLeft()) {
            offsetLeftAndRight(iF - getLeft());
            this.L.c();
        }
        int iG = D00.g(j);
        if (iG != getTop()) {
            offsetTopAndBottom(iG - getTop());
            this.L.c();
        }
    }

    @Override // com.daaw.InterfaceC1205Ir0
    public void i() {
        if (!this.I || T) {
            return;
        }
        setInvalidated(false);
        N.d(this);
    }

    @Override // android.view.View, com.daaw.InterfaceC1205Ir0
    public void invalidate() {
        if (this.I) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.B.invalidate();
    }

    public final boolean s() {
        return this.I;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    public final void t() {
        Rect rect;
        if (this.G) {
            Rect rect2 = this.H;
            if (rect2 == null) {
                this.H = new Rect(0, 0, getWidth(), getHeight());
            } else {
                G10.d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.H;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void u() {
        setOutlineProvider(this.F.c() != null ? P : null);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
