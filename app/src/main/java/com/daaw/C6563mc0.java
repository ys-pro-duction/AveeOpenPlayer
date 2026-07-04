package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.mc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6563mc0 implements InterfaceC4269eS0 {
    public static Method h0;
    public static Method i0;
    public static Method j0;
    public Context B;
    public ListAdapter C;
    public C7858rE D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public View Q;
    public int R;
    public DataSetObserver S;
    public View T;
    public Drawable U;
    public AdapterView.OnItemClickListener V;
    public AdapterView.OnItemSelectedListener W;
    public final i X;
    public final h Y;
    public final g Z;
    public final e a0;
    public Runnable b0;
    public final Handler c0;
    public final Rect d0;
    public Rect e0;
    public boolean f0;
    public PopupWindow g0;

    /* JADX INFO: renamed from: com.daaw.mc0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = C6563mc0.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            C6563mc0.this.h();
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$c */
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$d */
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6563mc0.this.r();
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$f */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C6563mc0.this.a()) {
                C6563mc0.this.h();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C6563mc0.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$h */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C6563mc0.this.g0) != null && popupWindow.isShowing() && x >= 0 && x < C6563mc0.this.g0.getWidth() && y >= 0 && y < C6563mc0.this.g0.getHeight()) {
                C6563mc0 c6563mc0 = C6563mc0.this;
                c6563mc0.c0.postDelayed(c6563mc0.X, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C6563mc0 c6563mc02 = C6563mc0.this;
            c6563mc02.c0.removeCallbacks(c6563mc02.X);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$i */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7858rE c7858rE = C6563mc0.this.D;
            if (c7858rE == null || !c7858rE.isAttachedToWindow() || C6563mc0.this.D.getCount() <= C6563mc0.this.D.getChildCount()) {
                return;
            }
            int childCount = C6563mc0.this.D.getChildCount();
            C6563mc0 c6563mc0 = C6563mc0.this;
            if (childCount <= c6563mc0.P) {
                c6563mc0.g0.setInputMethodMode(2);
                C6563mc0.this.h();
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i2 <= 28) {
            try {
                h0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                j0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                i0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C6563mc0(Context context) {
        this(context, null, KC0.C);
    }

    public boolean A() {
        return this.g0.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f0;
    }

    public final void C() {
        View view = this.Q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.Q);
            }
        }
    }

    public void D(View view) {
        this.T = view;
    }

    public void E(int i2) {
        this.g0.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.g0.getBackground();
        if (background == null) {
            R(i2);
            return;
        }
        background.getPadding(this.d0);
        Rect rect = this.d0;
        this.F = rect.left + rect.right + i2;
    }

    public void G(int i2) {
        this.M = i2;
    }

    public void H(Rect rect) {
        this.e0 = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.g0.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.f0 = z;
        this.g0.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.g0.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.V = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.W = onItemSelectedListener;
    }

    public void N(boolean z) {
        this.L = true;
        this.K = z;
    }

    public final void O(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.g0, z);
            return;
        }
        Method method = h0;
        if (method != null) {
            try {
                method.invoke(this.g0, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public void P(int i2) {
        this.R = i2;
    }

    public void Q(int i2) {
        C7858rE c7858rE = this.D;
        if (!a() || c7858rE == null) {
            return;
        }
        c7858rE.setListSelectionHidden(false);
        c7858rE.setSelection(i2);
        if (c7858rE.getChoiceMode() != 0) {
            c7858rE.setItemChecked(i2, true);
        }
    }

    public void R(int i2) {
        this.F = i2;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public boolean a() {
        return this.g0.isShowing();
    }

    public int b() {
        return this.G;
    }

    public void d(int i2) {
        this.G = i2;
    }

    @Override // com.daaw.InterfaceC4269eS0
    public void dismiss() {
        this.g0.dismiss();
        C();
        this.g0.setContentView(null);
        this.D = null;
        this.c0.removeCallbacks(this.X);
    }

    public Drawable g() {
        return this.g0.getBackground();
    }

    @Override // com.daaw.InterfaceC4269eS0
    public void h() {
        int iQ = q();
        boolean zA = A();
        AbstractC1852Ox0.b(this.g0, this.I);
        if (this.g0.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.F;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i2 = this.E;
                if (i2 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.g0.setWidth(this.F == -1 ? -1 : 0);
                        this.g0.setHeight(0);
                    } else {
                        this.g0.setWidth(this.F == -1 ? -1 : 0);
                        this.g0.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iQ = i2;
                }
                this.g0.setOutsideTouchable((this.O || this.N) ? false : true);
                this.g0.update(t(), this.G, this.H, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.F;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i3 = this.E;
        if (i3 == -1) {
            iQ = -1;
        } else if (i3 != -2) {
            iQ = i3;
        }
        this.g0.setWidth(width2);
        this.g0.setHeight(iQ);
        O(true);
        this.g0.setOutsideTouchable((this.O || this.N) ? false : true);
        this.g0.setTouchInterceptor(this.Y);
        if (this.L) {
            AbstractC1852Ox0.a(this.g0, this.K);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = j0;
            if (method != null) {
                try {
                    method.invoke(this.g0, this.e0);
                } catch (Exception unused) {
                }
            }
        } else {
            d.a(this.g0, this.e0);
        }
        AbstractC1852Ox0.c(this.g0, t(), this.G, this.H, this.M);
        this.D.setSelection(-1);
        if (!this.f0 || this.D.isInTouchMode()) {
            r();
        }
        if (this.f0) {
            return;
        }
        this.c0.post(this.a0);
    }

    public void j(Drawable drawable) {
        this.g0.setBackgroundDrawable(drawable);
    }

    @Override // com.daaw.InterfaceC4269eS0
    public ListView k() {
        return this.D;
    }

    public void l(int i2) {
        this.H = i2;
        this.J = true;
    }

    public int o() {
        if (this.J) {
            return this.H;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.S;
        if (dataSetObserver == null) {
            this.S = new f();
        } else {
            ListAdapter listAdapter2 = this.C;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.C = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.S);
        }
        C7858rE c7858rE = this.D;
        if (c7858rE != null) {
            c7858rE.setAdapter(this.C);
        }
    }

    public final int q() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.D == null) {
            Context context = this.B;
            this.b0 = new a();
            C7858rE c7858rES = s(context, !this.f0);
            this.D = c7858rES;
            Drawable drawable = this.U;
            if (drawable != null) {
                c7858rES.setSelector(drawable);
            }
            this.D.setAdapter(this.C);
            this.D.setOnItemClickListener(this.V);
            this.D.setFocusable(true);
            this.D.setFocusableInTouchMode(true);
            this.D.setOnItemSelectedListener(new b());
            this.D.setOnScrollListener(this.Z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.W;
            if (onItemSelectedListener != null) {
                this.D.setOnItemSelectedListener(onItemSelectedListener);
            }
            C7858rE c7858rE = this.D;
            View view2 = this.Q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.R;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(c7858rE, layoutParams);
                } else if (i4 == 1) {
                    linearLayout.addView(c7858rE, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.F;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c7858rE;
            }
            this.g0.setContentView(view);
        } else {
            View view3 = this.Q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.g0.getBackground();
        if (background != null) {
            background.getPadding(this.d0);
            Rect rect = this.d0;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.J) {
                this.H = -i6;
            }
        } else {
            this.d0.setEmpty();
            i2 = 0;
        }
        int iU = u(t(), this.H, this.g0.getInputMethodMode() == 2);
        if (this.N || this.E == -1) {
            return iU + i2;
        }
        int i7 = this.F;
        if (i7 == -2) {
            int i8 = this.B.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.d0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.B.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.d0;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.D.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.D.getPaddingTop() + this.D.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void r() {
        C7858rE c7858rE = this.D;
        if (c7858rE != null) {
            c7858rE.setListSelectionHidden(true);
            c7858rE.requestLayout();
        }
    }

    public C7858rE s(Context context, boolean z) {
        return new C7858rE(context, z);
    }

    public View t() {
        return this.T;
    }

    public final int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.g0, view, i2, z);
        }
        Method method = i0;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.g0, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.g0.getMaxAvailableHeight(view, i2);
    }

    public Object v() {
        if (a()) {
            return this.D.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.D.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.D.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.D.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.F;
    }

    public C6563mc0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public C6563mc0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.E = -2;
        this.F = -2;
        this.I = 1002;
        this.M = 0;
        this.N = false;
        this.O = false;
        this.P = Integer.MAX_VALUE;
        this.R = 0;
        this.X = new i();
        this.Y = new h();
        this.Z = new g();
        this.a0 = new e();
        this.d0 = new Rect();
        this.B = context;
        this.c0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5060hE0.l1, i2, i3);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5060hE0.m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5060hE0.n1, 0);
        this.H = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.J = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        A9 a9 = new A9(context, attributeSet, i2, i3);
        this.g0 = a9;
        a9.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: com.daaw.mc0$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            C7858rE c7858rE;
            if (i == -1 || (c7858rE = C6563mc0.this.D) == null) {
                return;
            }
            c7858rE.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.mc0$g */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C6563mc0.this.A() || C6563mc0.this.g0.getContentView() == null) {
                return;
            }
            C6563mc0 c6563mc0 = C6563mc0.this;
            c6563mc0.c0.removeCallbacks(c6563mc0.X);
            C6563mc0.this.X.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
