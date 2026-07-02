package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC3656cE0;
import com.daaw.AbstractC9438ws;
import com.daaw.C3487be1;
import com.daaw.C3590c00;
import com.daaw.C5554j1;
import com.daaw.C8820uh1;
import com.daaw.FC0;
import com.daaw.InterfaceC4724g2;
import com.daaw.SD;
import com.daaw.UC0;
import com.daaw.WT;
import com.daaw.Z1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] p0 = {R.attr.colorPrimaryDark};
    public static final int[] q0 = {R.attr.layout_gravity};
    public static final boolean r0;
    public static final boolean s0;
    public static boolean t0;
    public final d B;
    public float C;
    public int D;
    public int E;
    public float F;
    public Paint G;
    public final C3487be1 H;
    public final C3487be1 I;
    public final g J;
    public final g K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public e T;
    public List U;
    public float V;
    public float W;
    public Drawable a0;
    public Drawable b0;
    public Drawable c0;
    public CharSequence d0;
    public CharSequence e0;
    public Object f0;
    public boolean g0;
    public Drawable h0;
    public Drawable i0;
    public Drawable j0;
    public Drawable k0;
    public final ArrayList l0;
    public Rect m0;
    public Matrix n0;
    public final InterfaceC4724g2 o0;

    public class a implements InterfaceC4724g2 {
        public a() {
        }

        @Override // com.daaw.InterfaceC4724g2
        public boolean a(View view, InterfaceC4724g2.a aVar) {
            if (!DrawerLayout.this.B(view) || DrawerLayout.this.p(view) == 2) {
                return false;
            }
            DrawerLayout.this.d(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).P(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends C5554j1 {
        public final Rect d = new Rect();

        public c() {
        }

        @Override // com.daaw.C5554j1
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewN = DrawerLayout.this.n();
            if (viewN == null) {
                return true;
            }
            CharSequence charSequenceQ = DrawerLayout.this.q(DrawerLayout.this.r(viewN));
            if (charSequenceQ == null) {
                return true;
            }
            text.add(charSequenceQ);
            return true;
        }

        @Override // com.daaw.C5554j1
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            if (DrawerLayout.r0) {
                super.g(view, z1);
            } else {
                Z1 z1C0 = Z1.c0(z1);
                super.g(view, z1C0);
                z1.Q0(view);
                Object objJ = AbstractC2317Td1.J(view);
                if (objJ instanceof View) {
                    z1.H0((View) objJ);
                }
                o(z1, z1C0);
                z1C0.e0();
                n(z1, (ViewGroup) view);
            }
            z1.n0("androidx.drawerlayout.widget.DrawerLayout");
            z1.w0(false);
            z1.x0(false);
            z1.f0(Z1.a.e);
            z1.f0(Z1.a.f);
        }

        @Override // com.daaw.C5554j1
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.r0 || DrawerLayout.y(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        public final void n(Z1 z1, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.y(childAt)) {
                    z1.c(childAt);
                }
            }
        }

        public final void o(Z1 z1, Z1 z12) {
            Rect rect = this.d;
            z12.n(rect);
            z1.k0(rect);
            z1.X0(z12.Z());
            z1.F0(z12.z());
            z1.n0(z12.q());
            z1.r0(z12.t());
            z1.u0(z12.O());
            z1.x0(z12.Q());
            z1.h0(z12.J());
            z1.O0(z12.W());
            z1.a(z12.k());
        }
    }

    public static final class d extends C5554j1 {
        @Override // com.daaw.C5554j1
        public void g(View view, Z1 z1) {
            super.g(view, z1);
            if (DrawerLayout.y(view)) {
                return;
            }
            z1.H0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    public class g extends C3487be1.c {
        public final int a;
        public C3487be1 b;
        public final Runnable c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.o();
            }
        }

        public g(int i) {
            this.a = i;
        }

        @Override // com.daaw.C3487be1.c
        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // com.daaw.C3487be1.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.C3487be1.c
        public int d(View view) {
            if (DrawerLayout.this.C(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // com.daaw.C3487be1.c
        public void f(int i, int i2) {
            View viewL = (i & 1) == 1 ? DrawerLayout.this.l(3) : DrawerLayout.this.l(5);
            if (viewL == null || DrawerLayout.this.p(viewL) != 0) {
                return;
            }
            this.b.b(viewL, i2);
        }

        @Override // com.daaw.C3487be1.c
        public boolean g(int i) {
            return false;
        }

        @Override // com.daaw.C3487be1.c
        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // com.daaw.C3487be1.c
        public void i(View view, int i) {
            ((f) view.getLayoutParams()).c = false;
            n();
        }

        @Override // com.daaw.C3487be1.c
        public void j(int i) {
            DrawerLayout.this.U(i, this.b.v());
        }

        @Override // com.daaw.C3487be1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.c(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.R(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // com.daaw.C3487be1.c
        public void l(View view, float f, float f2) {
            int i;
            float fS = DrawerLayout.this.s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fS > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fS > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.O(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // com.daaw.C3487be1.c
        public boolean m(View view, int i) {
            return DrawerLayout.this.C(view) && DrawerLayout.this.c(view, this.a) && DrawerLayout.this.p(view) == 0;
        }

        public final void n() {
            View viewL = DrawerLayout.this.l(this.a == 3 ? 5 : 3);
            if (viewL != null) {
                DrawerLayout.this.d(viewL);
            }
        }

        public void o() {
            View viewL;
            int width;
            int iX = this.b.x();
            boolean z = this.a == 3;
            if (z) {
                viewL = DrawerLayout.this.l(3);
                width = (viewL != null ? -viewL.getWidth() : 0) + iX;
            } else {
                viewL = DrawerLayout.this.l(5);
                width = DrawerLayout.this.getWidth() - iX;
            }
            if (viewL != null) {
                if (((!z || viewL.getLeft() >= width) && (z || viewL.getLeft() <= width)) || DrawerLayout.this.p(viewL) != 0) {
                    return;
                }
                f fVar = (f) viewL.getLayoutParams();
                this.b.Q(viewL, width, viewL.getTop());
                fVar.c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(C3487be1 c3487be1) {
            this.b = c3487be1;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        r0 = true;
        s0 = true;
        t0 = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, FC0.a);
    }

    public static String u(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public static boolean y(View view) {
        return (AbstractC2317Td1.B(view) == 4 || AbstractC2317Td1.B(view) == 2) ? false : true;
    }

    public boolean A(int i) {
        View viewL = l(i);
        if (viewL != null) {
            return B(viewL);
        }
        return false;
    }

    public boolean B(View view) {
        if (C(view)) {
            return (((f) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean C(View view) {
        int iB = WT.b(((f) view.getLayoutParams()).a, AbstractC2317Td1.D(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean D(View view) {
        if (C(view)) {
            return ((f) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean E(float f2, float f3, View view) {
        if (this.m0 == null) {
            this.m0 = new Rect();
        }
        view.getHitRect(this.m0);
        return this.m0.contains((int) f2, (int) f3);
    }

    public final void F(Drawable drawable, int i) {
        if (drawable == null || !SD.h(drawable)) {
            return;
        }
        SD.m(drawable, i);
    }

    public void G(View view, float f2) {
        float fS = s(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (fS * width));
        if (!c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        R(view, f2);
    }

    public void H(int i) {
        I(i, true);
    }

    public void I(int i, boolean z) {
        View viewL = l(i);
        if (viewL != null) {
            K(viewL, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + u(i));
    }

    public void J(View view) {
        K(view, true);
    }

    public void K(View view, boolean z) {
        if (!C(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.N) {
            fVar.b = 1.0f;
            fVar.d = 1;
            T(view, true);
            S(view);
        } else if (z) {
            fVar.d |= 2;
            if (c(view, 3)) {
                this.H.Q(view, 0, view.getTop());
            } else {
                this.I.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            G(view, 1.0f);
            U(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void L(e eVar) {
        List list;
        if (eVar == null || (list = this.U) == null) {
            return;
        }
        list.remove(eVar);
    }

    public final Drawable M() {
        int iD = AbstractC2317Td1.D(this);
        if (iD == 0) {
            Drawable drawable = this.h0;
            if (drawable != null) {
                F(drawable, iD);
                return this.h0;
            }
        } else {
            Drawable drawable2 = this.i0;
            if (drawable2 != null) {
                F(drawable2, iD);
                return this.i0;
            }
        }
        return this.j0;
    }

    public final Drawable N() {
        int iD = AbstractC2317Td1.D(this);
        if (iD == 0) {
            Drawable drawable = this.i0;
            if (drawable != null) {
                F(drawable, iD);
                return this.i0;
            }
        } else {
            Drawable drawable2 = this.h0;
            if (drawable2 != null) {
                F(drawable2, iD);
                return this.h0;
            }
        }
        return this.k0;
    }

    public final void O() {
        if (s0) {
            return;
        }
        this.b0 = M();
        this.c0 = N();
    }

    public void P(Object obj, boolean z) {
        this.f0 = obj;
        this.g0 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void Q(int i, int i2) {
        View viewL;
        int iB = WT.b(i2, AbstractC2317Td1.D(this));
        if (i2 == 3) {
            this.O = i;
        } else if (i2 == 5) {
            this.P = i;
        } else if (i2 == 8388611) {
            this.Q = i;
        } else if (i2 == 8388613) {
            this.R = i;
        }
        if (i != 0) {
            (iB == 3 ? this.H : this.I).a();
        }
        if (i != 1) {
            if (i == 2 && (viewL = l(iB)) != null) {
                J(viewL);
                return;
            }
            return;
        }
        View viewL2 = l(iB);
        if (viewL2 != null) {
            d(viewL2);
        }
    }

    public void R(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 == fVar.b) {
            return;
        }
        fVar.b = f2;
        j(view, f2);
    }

    public final void S(View view) {
        Z1.a aVar = Z1.a.y;
        AbstractC2317Td1.j0(view, aVar.b());
        if (!B(view) || p(view) == 2) {
            return;
        }
        AbstractC2317Td1.l0(view, aVar, null, this.o0);
    }

    public final void T(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || C(childAt)) && !(z && childAt == view)) {
                AbstractC2317Td1.z0(childAt, 4);
            } else {
                AbstractC2317Td1.z0(childAt, 1);
            }
        }
    }

    public void U(int i, View view) {
        int i2;
        int iA = this.H.A();
        int iA2 = this.I.A();
        if (iA == 1 || iA2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iA != 2 && iA2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((f) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                h(view);
            } else if (f2 == 1.0f) {
                i(view);
            }
        }
        if (i2 != this.L) {
            this.L = i2;
            List list = this.U;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.U.get(size)).c(i2);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!C(childAt)) {
                this.l0.add(childAt);
            } else if (B(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.l0.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.l0.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.l0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m() != null || C(view)) {
            AbstractC2317Td1.z0(view, 4);
        } else {
            AbstractC2317Td1.z0(view, 1);
        }
        if (r0) {
            return;
        }
        AbstractC2317Td1.p0(view, this.B);
    }

    public void b() {
        if (this.S) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.S = true;
    }

    public boolean c(View view, int i) {
        return (r(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((f) getChildAt(i).getLayoutParams()).b);
        }
        this.F = fMax;
        boolean zM = this.H.m(true);
        boolean zM2 = this.I.m(true);
        if (zM || zM2) {
            AbstractC2317Td1.g0(this);
        }
    }

    public void d(View view) {
        e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.F <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (E(x, y, childAt) && !z(childAt) && k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean z = z(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && v(childAt) && C(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.F;
        if (f2 > 0.0f && z) {
            this.G.setColor((this.E & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f2)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.G);
            return zDrawChild;
        }
        if (this.b0 != null && c(view, 3)) {
            int intrinsicWidth = this.b0.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.H.x(), 1.0f));
            this.b0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.b0.setAlpha((int) (fMax * 255.0f));
            this.b0.draw(canvas);
            return zDrawChild;
        }
        if (this.c0 != null && c(view, 5)) {
            int intrinsicWidth2 = this.c0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.I.x(), 1.0f));
            this.c0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.c0.setAlpha((int) (fMax2 * 255.0f));
            this.c0.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(View view, boolean z) {
        if (!C(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.N) {
            fVar.b = 0.0f;
            fVar.d = 0;
        } else if (z) {
            fVar.d |= 4;
            if (c(view, 3)) {
                this.H.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.I.Q(view, getWidth(), view.getTop());
            }
        } else {
            G(view, 0.0f);
            U(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void f() {
        g(false);
    }

    public void g(boolean z) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            f fVar = (f) childAt.getLayoutParams();
            if (C(childAt) && (!z || fVar.c)) {
                zQ |= c(childAt, 3) ? this.H.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.I.Q(childAt, getWidth(), childAt.getTop());
                fVar.c = false;
            }
        }
        this.J.p();
        this.K.p();
        if (zQ) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (s0) {
            return this.C;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.a0;
    }

    public void h(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 1) {
            fVar.d = 0;
            List list = this.U;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.U.get(size)).b(view);
                }
            }
            T(view, false);
            S(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void i(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 0) {
            fVar.d = 1;
            List list = this.U;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.U.get(size)).a(view);
                }
            }
            T(view, true);
            S(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void j(View view, float f2) {
        List list = this.U;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.U.get(size)).d(view, f2);
            }
        }
    }

    public final boolean k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventT = t(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventT);
            motionEventT.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    public View l(int i) {
        int iB = WT.b(i, AbstractC2317Td1.D(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((r(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    public View m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((f) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C(childAt) && D(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int o(int i) {
        int iD = AbstractC2317Td1.D(this);
        if (i == 3) {
            int i2 = this.O;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iD == 0 ? this.Q : this.R;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.P;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iD == 0 ? this.R : this.Q;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.Q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iD == 0 ? this.O : this.P;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.R;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iD == 0 ? this.P : this.O;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g0 || this.a0 == null) {
            return;
        }
        Object obj = this.f0;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.a0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.a0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            com.daaw.be1 r1 = r6.H
            boolean r1 = r1.P(r7)
            com.daaw.be1 r2 = r6.I
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            com.daaw.be1 r7 = r6.H
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.J
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.K
            r7.p()
            goto L36
        L31:
            r6.g(r2)
            r6.S = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.V = r0
            r6.W = r7
            float r4 = r6.F
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            com.daaw.be1 r4 = r6.H
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.z(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.S = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.w()
            if (r7 != 0) goto L70
            boolean r7 = r6.S
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !x()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewN = n();
        if (viewN != null && p(viewN) == 0) {
            f();
        }
        return viewN != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f2;
        int i5;
        this.M = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f3 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (fVar.b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i6 - r11) / f4;
                        i5 = i6 - ((int) (fVar.b * f4));
                    }
                    boolean z2 = f2 != fVar.b;
                    int i9 = fVar.a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i13 > i10 - i14) {
                                i11 = (i10 - i14) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z2) {
                        R(childAt, f2);
                    }
                    int i17 = fVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
        }
        if (t0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C3590c00 c3590c00I = C8820uh1.y(rootWindowInsets).i();
            C3487be1 c3487be1 = this.H;
            c3487be1.L(Math.max(c3487be1.w(), c3590c00I.a));
            C3487be1 c3487be12 = this.I;
            c3487be12.L(Math.max(c3487be12.w(), c3590c00I.c));
        }
        this.M = false;
        this.N = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = RCHTTPStatusCodes.UNSUCCESSFUL;
            }
            if (mode2 == 0) {
                size2 = RCHTTPStatusCodes.UNSUCCESSFUL;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.f0 != null && AbstractC2317Td1.A(this);
        int iD = AbstractC2317Td1.D(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z) {
                    int iB = WT.b(fVar.a, iD);
                    if (AbstractC2317Td1.A(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f0;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f0;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!C(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (s0) {
                        float fX = AbstractC2317Td1.x(childAt);
                        float f2 = this.C;
                        if (fX != f2) {
                            AbstractC2317Td1.x0(childAt, f2);
                        }
                    }
                    int iR = r(childAt) & 7;
                    boolean z4 = iR == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + u(iR) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.D + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewL;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i = savedState.D;
        if (i != 0 && (viewL = l(i)) != null) {
            J(viewL);
        }
        int i2 = savedState.E;
        if (i2 != 3) {
            Q(i2, 3);
        }
        int i3 = savedState.F;
        if (i3 != 3) {
            Q(i3, 5);
        }
        int i4 = savedState.G;
        if (i4 != 3) {
            Q(i4, 8388611);
        }
        int i5 = savedState.H;
        if (i5 != 3) {
            Q(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        O();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            f fVar = (f) getChildAt(i).getLayoutParams();
            int i2 = fVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.D = fVar.a;
                break;
            }
        }
        savedState.E = this.O;
        savedState.F = this.P;
        savedState.G = this.Q;
        savedState.H = this.R;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.daaw.be1 r0 = r6.H
            r0.F(r7)
            com.daaw.be1 r0 = r6.I
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.g(r2)
            r6.S = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            com.daaw.be1 r3 = r6.H
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.z(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.V
            float r0 = r0 - r3
            float r3 = r6.W
            float r7 = r7 - r3
            com.daaw.be1 r3 = r6.H
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.m()
            if (r7 == 0) goto L5d
            int r7 = r6.p(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.g(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.V = r0
            r6.W = r7
            r6.S = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public int p(View view) {
        if (C(view)) {
            return o(((f) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence q(int i) {
        int iB = WT.b(i, AbstractC2317Td1.D(this));
        if (iB == 3) {
            return this.d0;
        }
        if (iB == 5) {
            return this.e0;
        }
        return null;
    }

    public int r(View view) {
        return WT.b(((f) view.getLayoutParams()).a, AbstractC2317Td1.D(this));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.M) {
            return;
        }
        super.requestLayout();
    }

    public float s(View view) {
        return ((f) view.getLayoutParams()).b;
    }

    public void setDrawerElevation(float f2) {
        this.C = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (C(childAt)) {
                AbstractC2317Td1.x0(childAt, this.C);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.T;
        if (eVar2 != null) {
            L(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.T = eVar;
    }

    public void setDrawerLockMode(int i) {
        Q(i, 3);
        Q(i, 5);
    }

    public void setScrimColor(int i) {
        this.E = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.a0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.a0 = new ColorDrawable(i);
        invalidate();
    }

    public final MotionEvent t(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.n0 == null) {
                this.n0 = new Matrix();
            }
            matrix.invert(this.n0);
            motionEventObtain.transform(this.n0);
        }
        return motionEventObtain;
    }

    public final boolean w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((f) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        return n() != null;
    }

    public boolean z(View view) {
        return ((f) view.getLayoutParams()).a == 0;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new d();
        this.E = -1728053248;
        this.G = new Paint();
        this.N = true;
        this.O = 3;
        this.P = 3;
        this.Q = 3;
        this.R = 3;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.o0 = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.D = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        g gVar = new g(3);
        this.J = gVar;
        g gVar2 = new g(5);
        this.K = gVar2;
        C3487be1 c3487be1N = C3487be1.n(this, 1.0f, gVar);
        this.H = c3487be1N;
        c3487be1N.M(1);
        c3487be1N.N(f3);
        gVar.q(c3487be1N);
        C3487be1 c3487be1N2 = C3487be1.n(this, 1.0f, gVar2);
        this.I = c3487be1N2;
        c3487be1N2.M(2);
        c3487be1N2.N(f3);
        gVar2.q(c3487be1N2);
        setFocusableInTouchMode(true);
        AbstractC2317Td1.z0(this, 1);
        AbstractC2317Td1.p0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (AbstractC2317Td1.A(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p0);
            try {
                this.a0 = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC3656cE0.b, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(AbstractC3656cE0.c)) {
                this.C = typedArrayObtainStyledAttributes2.getDimension(AbstractC3656cE0.c, 0.0f);
            } else {
                this.C = getResources().getDimension(UC0.a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.l0 = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i) {
        this.a0 = i != 0 ? AbstractC9438ws.e(getContext(), i) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.q0);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.a = 0;
            this.a = fVar.a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.D = 0;
            this.D = parcel.readInt();
            this.E = parcel.readInt();
            this.F = parcel.readInt();
            this.G = parcel.readInt();
            this.H = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.D = 0;
        }
    }
}
