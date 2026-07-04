package com.daaw;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ff0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4615ff0 extends Drawable implements Drawable.Callback, Animatable {
    public C0737Ee0 B;
    public final ChoreographerFrameCallbackC8251sf0 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public c G;
    public final ArrayList H;
    public final ValueAnimator.AnimatorUpdateListener I;
    public C4860gY J;
    public String K;
    public C7062oO L;
    public boolean M;
    public boolean N;
    public boolean O;
    public C1923Pp P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public WG0 U;
    public boolean V;
    public final Matrix W;
    public Bitmap X;
    public Canvas Y;
    public Rect Z;
    public RectF a0;
    public Paint b0;
    public Rect c0;
    public Rect d0;
    public RectF e0;
    public RectF f0;
    public Matrix g0;
    public Matrix h0;
    public boolean i0;

    /* JADX INFO: renamed from: com.daaw.ff0$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C4615ff0.this.P != null) {
                C4615ff0.this.P.L(C4615ff0.this.C.i());
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ff0$b */
    public interface b {
        void a(C0737Ee0 c0737Ee0);
    }

    /* JADX INFO: renamed from: com.daaw.ff0$c */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    public C4615ff0() {
        ChoreographerFrameCallbackC8251sf0 choreographerFrameCallbackC8251sf0 = new ChoreographerFrameCallbackC8251sf0();
        this.C = choreographerFrameCallbackC8251sf0;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = c.NONE;
        this.H = new ArrayList();
        a aVar = new a();
        this.I = aVar;
        this.N = false;
        this.O = true;
        this.Q = 255;
        this.U = WG0.AUTOMATIC;
        this.V = false;
        this.W = new Matrix();
        this.i0 = false;
        choreographerFrameCallbackC8251sf0.addUpdateListener(aVar);
    }

    public void A() {
        this.H.clear();
        this.C.h();
        if (isVisible()) {
            return;
        }
        this.G = c.NONE;
    }

    public void A0(final float f) {
        if (this.B == null) {
            this.H.add(new b() { // from class: com.daaw.bf0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.A0(f);
                }
            });
            return;
        }
        U80.a("Drawable#setProgress");
        this.C.y(this.B.h(f));
        U80.b("Drawable#setProgress");
    }

    public final void B(int i, int i2) {
        Bitmap bitmap = this.X;
        if (bitmap == null || bitmap.getWidth() < i || this.X.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.X = bitmapCreateBitmap;
            this.Y.setBitmap(bitmapCreateBitmap);
            this.i0 = true;
            return;
        }
        if (this.X.getWidth() > i || this.X.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.X, 0, 0, i, i2);
            this.X = bitmapCreateBitmap2;
            this.Y.setBitmap(bitmapCreateBitmap2);
            this.i0 = true;
        }
    }

    public void B0(WG0 wg0) {
        this.U = wg0;
        t();
    }

    public final void C() {
        if (this.Y != null) {
            return;
        }
        this.Y = new Canvas();
        this.f0 = new RectF();
        this.g0 = new Matrix();
        this.h0 = new Matrix();
        this.Z = new Rect();
        this.a0 = new RectF();
        this.b0 = new C3078a90();
        this.c0 = new Rect();
        this.d0 = new Rect();
        this.e0 = new RectF();
    }

    public void C0(int i) {
        this.C.setRepeatCount(i);
    }

    public Bitmap D(String str) {
        C4860gY c4860gYJ = J();
        if (c4860gYJ != null) {
            return c4860gYJ.a(str);
        }
        return null;
    }

    public void D0(int i) {
        this.C.setRepeatMode(i);
    }

    public boolean E() {
        return this.O;
    }

    public void E0(boolean z) {
        this.F = z;
    }

    public C0737Ee0 F() {
        return this.B;
    }

    public void F0(float f) {
        this.C.C(f);
    }

    public final Context G() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void G0(Boolean bool) {
        this.D = bool.booleanValue();
    }

    public final C7062oO H() {
        if (getCallback() == null) {
            return null;
        }
        if (this.L == null) {
            this.L = new C7062oO(getCallback(), null);
        }
        return this.L;
    }

    public int I() {
        return (int) this.C.j();
    }

    public boolean I0() {
        return this.B.c().m() > 0;
    }

    public final C4860gY J() {
        if (getCallback() == null) {
            return null;
        }
        C4860gY c4860gY = this.J;
        if (c4860gY != null && !c4860gY.b(G())) {
            this.J = null;
        }
        if (this.J == null) {
            this.J = new C4860gY(getCallback(), this.K, null, this.B.j());
        }
        return this.J;
    }

    public String K() {
        return this.K;
    }

    public C5732jf0 L(String str) {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            return null;
        }
        return (C5732jf0) c0737Ee0.j().get(str);
    }

    public boolean M() {
        return this.N;
    }

    public float N() {
        return this.C.l();
    }

    public float O() {
        return this.C.m();
    }

    public C1317Jt0 P() {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 != null) {
            return c0737Ee0.n();
        }
        return null;
    }

    public float Q() {
        return this.C.i();
    }

    public WG0 R() {
        return this.V ? WG0.SOFTWARE : WG0.HARDWARE;
    }

    public int S() {
        return this.C.getRepeatCount();
    }

    public int T() {
        return this.C.getRepeatMode();
    }

    public float U() {
        return this.C.n();
    }

    public S11 V() {
        return null;
    }

    public Typeface W(String str, String str2) {
        C7062oO c7062oOH = H();
        if (c7062oOH != null) {
            return c7062oOH.b(str, str2);
        }
        return null;
    }

    public final boolean X() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    public boolean Y() {
        ChoreographerFrameCallbackC8251sf0 choreographerFrameCallbackC8251sf0 = this.C;
        if (choreographerFrameCallbackC8251sf0 == null) {
            return false;
        }
        return choreographerFrameCallbackC8251sf0.isRunning();
    }

    public boolean Z() {
        if (isVisible()) {
            return this.C.isRunning();
        }
        c cVar = this.G;
        return cVar == c.PLAY || cVar == c.RESUME;
    }

    public boolean a0() {
        return this.T;
    }

    public void b0() {
        this.H.clear();
        this.C.p();
        if (isVisible()) {
            return;
        }
        this.G = c.NONE;
    }

    public void c0() {
        if (this.P == null) {
            this.H.add(new b() { // from class: com.daaw.Ze0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.c0();
                }
            });
            return;
        }
        t();
        if (q() || S() == 0) {
            if (isVisible()) {
                this.C.q();
                this.G = c.NONE;
            } else {
                this.G = c.PLAY;
            }
        }
        if (q()) {
            return;
        }
        l0((int) (U() < 0.0f ? O() : N()));
        this.C.h();
        if (isVisible()) {
            return;
        }
        this.G = c.NONE;
    }

    public final void d0(Canvas canvas, C1923Pp c1923Pp) {
        if (this.B == null || c1923Pp == null) {
            return;
        }
        C();
        canvas.getMatrix(this.g0);
        canvas.getClipBounds(this.Z);
        u(this.Z, this.a0);
        this.g0.mapRect(this.a0);
        v(this.a0, this.Z);
        if (this.O) {
            this.f0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c1923Pp.e(this.f0, null, false);
        }
        this.g0.mapRect(this.f0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        g0(this.f0, fWidth, fHeight);
        if (!X()) {
            RectF rectF = this.f0;
            Rect rect = this.Z;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f0.width());
        int iCeil2 = (int) Math.ceil(this.f0.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        B(iCeil, iCeil2);
        if (this.i0) {
            this.W.set(this.g0);
            this.W.preScale(fWidth, fHeight);
            Matrix matrix = this.W;
            RectF rectF2 = this.f0;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.X.eraseColor(0);
            c1923Pp.g(this.Y, this.W, this.Q);
            this.g0.invert(this.h0);
            this.h0.mapRect(this.e0, this.f0);
            v(this.e0, this.d0);
        }
        this.c0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.X, this.c0, this.d0, this.b0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        U80.a("Drawable#draw");
        if (this.F) {
            try {
                if (this.V) {
                    d0(canvas, this.P);
                } else {
                    x(canvas);
                }
            } catch (Throwable th) {
                AbstractC1876Pd0.b("Lottie crashed in draw!", th);
            }
        } else if (this.V) {
            d0(canvas, this.P);
        } else {
            x(canvas);
        }
        this.i0 = false;
        U80.b("Drawable#draw");
    }

    public List e0(S70 s70) {
        if (this.P == null) {
            AbstractC1876Pd0.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.P.h(s70, 0, arrayList, new S70(new String[0]));
        return arrayList;
    }

    public void f0() {
        if (this.P == null) {
            this.H.add(new b() { // from class: com.daaw.We0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.f0();
                }
            });
            return;
        }
        t();
        if (q() || S() == 0) {
            if (isVisible()) {
                this.C.v();
                this.G = c.NONE;
            } else {
                this.G = c.RESUME;
            }
        }
        if (q()) {
            return;
        }
        l0((int) (U() < 0.0f ? O() : N()));
        this.C.h();
        if (isVisible()) {
            return;
        }
        this.G = c.NONE;
    }

    public final void g0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            return -1;
        }
        return c0737Ee0.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            return -1;
        }
        return c0737Ee0.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0(boolean z) {
        this.T = z;
    }

    public void i0(boolean z) {
        if (z != this.O) {
            this.O = z;
            C1923Pp c1923Pp = this.P;
            if (c1923Pp != null) {
                c1923Pp.O(z);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return Y();
    }

    public boolean j0(C0737Ee0 c0737Ee0) {
        if (this.B == c0737Ee0) {
            return false;
        }
        this.i0 = true;
        s();
        this.B = c0737Ee0;
        r();
        this.C.x(c0737Ee0);
        A0(this.C.getAnimatedFraction());
        Iterator it = new ArrayList(this.H).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(c0737Ee0);
            }
            it.remove();
        }
        this.H.clear();
        c0737Ee0.w(this.R);
        t();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void k0(AbstractC6783nO abstractC6783nO) {
        C7062oO c7062oO = this.L;
        if (c7062oO != null) {
            c7062oO.c(abstractC6783nO);
        }
    }

    public void l0(final int i) {
        if (this.B == null) {
            this.H.add(new b() { // from class: com.daaw.cf0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.l0(i);
                }
            });
        } else {
            this.C.y(i);
        }
    }

    public void m0(boolean z) {
        this.E = z;
    }

    public void n0(InterfaceC4581fY interfaceC4581fY) {
        C4860gY c4860gY = this.J;
        if (c4860gY != null) {
            c4860gY.d(interfaceC4581fY);
        }
    }

    public void o0(String str) {
        this.K = str;
    }

    public void p(final S70 s70, final Object obj, final C8530tf0 c8530tf0) {
        C1923Pp c1923Pp = this.P;
        if (c1923Pp == null) {
            this.H.add(new b() { // from class: com.daaw.Te0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.p(s70, obj, c8530tf0);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (s70 == S70.c) {
            c1923Pp.c(obj, c8530tf0);
        } else if (s70.d() != null) {
            s70.d().c(obj, c8530tf0);
        } else {
            List listE0 = e0(s70);
            for (int i = 0; i < listE0.size(); i++) {
                ((S70) listE0.get(i)).d().c(obj, c8530tf0);
            }
            zIsEmpty = true ^ listE0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == InterfaceC7136of0.E) {
                A0(Q());
            }
        }
    }

    public void p0(boolean z) {
        this.N = z;
    }

    public final boolean q() {
        return this.D || this.E;
    }

    public void q0(final int i) {
        if (this.B == null) {
            this.H.add(new b() { // from class: com.daaw.df0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.q0(i);
                }
            });
        } else {
            this.C.z(i + 0.99f);
        }
    }

    public final void r() {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            return;
        }
        C1923Pp c1923Pp = new C1923Pp(this, AbstractC6165l90.b(c0737Ee0), c0737Ee0.k(), c0737Ee0);
        this.P = c1923Pp;
        if (this.S) {
            c1923Pp.J(true);
        }
        this.P.O(this.O);
    }

    public void r0(final String str) {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            this.H.add(new b() { // from class: com.daaw.Xe0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee02) {
                    this.a.r0(str);
                }
            });
            return;
        }
        C1888Pg0 c1888Pg0L = c0737Ee0.l(str);
        if (c1888Pg0L != null) {
            q0((int) (c1888Pg0L.b + c1888Pg0L.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void s() {
        if (this.C.isRunning()) {
            this.C.cancel();
            if (!isVisible()) {
                this.G = c.NONE;
            }
        }
        this.B = null;
        this.P = null;
        this.J = null;
        this.C.g();
        invalidateSelf();
    }

    public void s0(final float f) {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            this.H.add(new b() { // from class: com.daaw.Ue0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee02) {
                    this.a.s0(f);
                }
            });
        } else {
            this.C.z(AbstractC9678xk0.i(c0737Ee0.p(), this.B.f(), f));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.Q = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC1876Pd0.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            c cVar = this.G;
            if (cVar == c.PLAY) {
                c0();
                return visible;
            }
            if (cVar == c.RESUME) {
                f0();
                return visible;
            }
        } else {
            if (this.C.isRunning()) {
                b0();
                this.G = c.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.G = c.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        c0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        A();
    }

    public final void t() {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            return;
        }
        this.V = this.U.a(Build.VERSION.SDK_INT, c0737Ee0.q(), c0737Ee0.m());
    }

    public void t0(final int i, final int i2) {
        if (this.B == null) {
            this.H.add(new b() { // from class: com.daaw.Ve0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.t0(i, i2);
                }
            });
        } else {
            this.C.A(i, i2 + 0.99f);
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void u0(final String str) {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            this.H.add(new b() { // from class: com.daaw.Se0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee02) {
                    this.a.u0(str);
                }
            });
            return;
        }
        C1888Pg0 c1888Pg0L = c0737Ee0.l(str);
        if (c1888Pg0L != null) {
            int i = (int) c1888Pg0L.b;
            t0(i, ((int) c1888Pg0L.c) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void v0(final int i) {
        if (this.B == null) {
            this.H.add(new b() { // from class: com.daaw.ef0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee0) {
                    this.a.v0(i);
                }
            });
        } else {
            this.C.B(i);
        }
    }

    public void w(Canvas canvas, Matrix matrix) {
        C1923Pp c1923Pp = this.P;
        C0737Ee0 c0737Ee0 = this.B;
        if (c1923Pp == null || c0737Ee0 == null) {
            return;
        }
        if (this.V) {
            canvas.save();
            canvas.concat(matrix);
            d0(canvas, c1923Pp);
            canvas.restore();
        } else {
            c1923Pp.g(canvas, matrix, this.Q);
        }
        this.i0 = false;
    }

    public void w0(final String str) {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            this.H.add(new b() { // from class: com.daaw.Ye0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee02) {
                    this.a.w0(str);
                }
            });
            return;
        }
        C1888Pg0 c1888Pg0L = c0737Ee0.l(str);
        if (c1888Pg0L != null) {
            v0((int) c1888Pg0L.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final void x(Canvas canvas) {
        C1923Pp c1923Pp = this.P;
        C0737Ee0 c0737Ee0 = this.B;
        if (c1923Pp == null || c0737Ee0 == null) {
            return;
        }
        this.W.reset();
        if (!getBounds().isEmpty()) {
            this.W.preScale(r2.width() / c0737Ee0.b().width(), r2.height() / c0737Ee0.b().height());
        }
        c1923Pp.g(canvas, this.W, this.Q);
    }

    public void x0(final float f) {
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 == null) {
            this.H.add(new b() { // from class: com.daaw.af0
                @Override // com.daaw.C4615ff0.b
                public final void a(C0737Ee0 c0737Ee02) {
                    this.a.x0(f);
                }
            });
        } else {
            v0((int) AbstractC9678xk0.i(c0737Ee0.p(), this.B.f(), f));
        }
    }

    public void y(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        if (this.B != null) {
            r();
        }
    }

    public void y0(boolean z) {
        if (this.S == z) {
            return;
        }
        this.S = z;
        C1923Pp c1923Pp = this.P;
        if (c1923Pp != null) {
            c1923Pp.J(z);
        }
    }

    public boolean z() {
        return this.M;
    }

    public void z0(boolean z) {
        this.R = z;
        C0737Ee0 c0737Ee0 = this.B;
        if (c0737Ee0 != null) {
            c0737Ee0.w(z);
        }
    }

    public void H0(S11 s11) {
    }
}
