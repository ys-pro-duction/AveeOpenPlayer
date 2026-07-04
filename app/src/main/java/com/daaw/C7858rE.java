package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.rE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7858rE extends ListView {
    public final Rect B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public d H;
    public boolean I;
    public boolean J;
    public boolean K;
    public C1154Ie1 L;
    public C7121oc0 M;
    public f N;

    /* JADX INFO: renamed from: com.daaw.rE$a */
    public static class a {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.rE$b */
    public static class b {
        public static Method a;
        public static Method b;
        public static Method c;
        public static boolean d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean a() {
            return d;
        }

        public static void b(C7858rE c7858rE, int i, View view) {
            try {
                a.invoke(c7858rE, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                b.invoke(c7858rE, Integer.valueOf(i));
                c.invoke(c7858rE, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.rE$c */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: renamed from: com.daaw.rE$d */
    public static class d extends AbstractC5615jE {
        public boolean C;

        public d(Drawable drawable) {
            super(drawable);
            this.C = true;
        }

        public void b(boolean z) {
            this.C = z;
        }

        @Override // com.daaw.AbstractC5615jE, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.C) {
                super.draw(canvas);
            }
        }

        @Override // com.daaw.AbstractC5615jE, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.C) {
                super.setHotspot(f, f2);
            }
        }

        @Override // com.daaw.AbstractC5615jE, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.C) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // com.daaw.AbstractC5615jE, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.C) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // com.daaw.AbstractC5615jE, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.C) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rE$e */
    public static class e {
        public static final Field a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            a = declaredField;
        }

        public static boolean a(AbsListView absListView) {
            Field field = a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z) {
            Field field = a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.rE$f */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            C7858rE c7858rE = C7858rE.this;
            c7858rE.N = null;
            c7858rE.removeCallbacks(this);
        }

        public void b() {
            C7858rE.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C7858rE c7858rE = C7858rE.this;
            c7858rE.N = null;
            c7858rE.drawableStateChanged();
        }
    }

    public C7858rE(Context context, boolean z) {
        super(context, null, KC0.y);
        this.B = new Rect();
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.J = z;
        setCacheColorHint(0);
    }

    public final void a() {
        this.K = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.G - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1154Ie1 c1154Ie1 = this.L;
        if (c1154Ie1 != null) {
            c1154Ie1.c();
            this.L = null;
        }
    }

    public final void b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.B.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.B);
        selector.draw(canvas);
    }

    public int d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.N != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            com.daaw.oc0 r9 = r7.M
            if (r9 != 0) goto L5a
            com.daaw.oc0 r9 = new com.daaw.oc0
            r9.<init>(r7)
            r7.M = r9
        L5a:
            com.daaw.oc0 r9 = r7.M
            r9.m(r1)
            com.daaw.oc0 r9 = r7.M
            r9.onTouch(r7, r8)
            return r3
        L65:
            com.daaw.oc0 r8 = r7.M
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7858rE.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i, View view) {
        Rect rect = this.B;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.C;
        rect.top -= this.D;
        rect.right += this.E;
        rect.bottom += this.F;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        f(i, view);
        if (z) {
            Rect rect = this.B;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            SD.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    public final void h(int i, View view, float f2, float f3) {
        g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        SD.k(selector, f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.J || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.J || super.hasWindowFocus();
    }

    public final void i(View view, int i, float f2, float f3) {
        View childAt;
        this.K = true;
        a.a(this, f2, f3);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.G;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.G = i;
        a.a(view, f2 - view.getLeft(), f3 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i, view, f2, f3);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.J || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.J && this.I) || super.isInTouchMode();
    }

    public final void j(boolean z) {
        d dVar = this.H;
        if (dVar != null) {
            dVar.b(z);
        }
    }

    public final boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    public final void l(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z);
        } else {
            e.b(this, z);
        }
    }

    public final boolean m() {
        return this.K;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.N = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.N == null) {
            f fVar = new f();
            this.N = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.G = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.N;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.I = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.H = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.C = rect.left;
        this.D = rect.top;
        this.E = rect.right;
        this.F = rect.bottom;
    }
}
