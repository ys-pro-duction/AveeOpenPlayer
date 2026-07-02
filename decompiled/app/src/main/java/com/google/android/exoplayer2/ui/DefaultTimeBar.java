package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.daaw.AbstractC6280lb1;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC7115ob;
import com.daaw.VD0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTimeBar extends View {
    public final Rect B;
    public final Rect C;
    public final Rect D;
    public final Rect E;
    public final Paint F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Drawable L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final StringBuilder U;
    public final Formatter V;
    public final Runnable W;
    public final CopyOnWriteArraySet a0;
    public int b0;
    public long c0;
    public int d0;
    public int[] e0;
    public Point f0;
    public boolean g0;
    public long h0;
    public long i0;
    public long j0;
    public long k0;
    public int l0;
    public long[] m0;
    public boolean[] n0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultTimeBar.this.q(false);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        Paint paint = new Paint();
        this.F = paint;
        Paint paint2 = new Paint();
        this.G = paint2;
        Paint paint3 = new Paint();
        this.H = paint3;
        Paint paint4 = new Paint();
        this.I = paint4;
        Paint paint5 = new Paint();
        this.J = paint5;
        Paint paint6 = new Paint();
        this.K = paint6;
        paint6.setAntiAlias(true);
        this.a0 = new CopyOnWriteArraySet();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.T = b(displayMetrics, -50);
        int iB = b(displayMetrics, 4);
        int iB2 = b(displayMetrics, 26);
        int iB3 = b(displayMetrics, 4);
        int iB4 = b(displayMetrics, 12);
        int iB5 = b(displayMetrics, 0);
        int iB6 = b(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, VD0.c, 0, 0);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(VD0.m);
                this.L = drawable;
                if (drawable != null) {
                    n(drawable);
                    iB2 = Math.max(drawable.getMinimumHeight(), iB2);
                }
                this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(VD0.f, iB);
                this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(VD0.o, iB2);
                this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(VD0.e, iB3);
                this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(VD0.n, iB4);
                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(VD0.k, iB5);
                this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(VD0.l, iB6);
                int i = typedArrayObtainStyledAttributes.getInt(VD0.i, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(VD0.j, g(i));
                int i3 = typedArrayObtainStyledAttributes.getInt(VD0.g, e(i));
                int i4 = typedArrayObtainStyledAttributes.getInt(VD0.p, h(i));
                int i5 = typedArrayObtainStyledAttributes.getInt(VD0.d, -1291845888);
                int i6 = typedArrayObtainStyledAttributes.getInt(VD0.h, f(i5));
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.M = iB;
            this.N = iB2;
            this.O = iB3;
            this.P = iB4;
            this.Q = iB5;
            this.R = iB6;
            paint.setColor(-1);
            paint6.setColor(g(-1));
            paint2.setColor(e(-1));
            paint3.setColor(h(-1));
            paint4.setColor(-1291845888);
            this.L = null;
        }
        StringBuilder sb = new StringBuilder();
        this.U = sb;
        this.V = new Formatter(sb, Locale.getDefault());
        this.W = new a();
        Drawable drawable2 = this.L;
        if (drawable2 != null) {
            this.S = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.S = (Math.max(this.Q, Math.max(this.P, this.R)) + 1) / 2;
        }
        this.i0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
        this.b0 = 20;
        setFocusable(true);
        if (AbstractC6280lb1.a >= 16) {
            j();
        }
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5f);
    }

    public static int e(int i) {
        return (i & 16777215) | (-872415232);
    }

    public static int f(int i) {
        return (i & 16777215) | 855638016;
    }

    public static int g(int i) {
        return i | (-16777216);
    }

    private long getPositionIncrement() {
        long j = this.c0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.i0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.b0);
    }

    private String getProgressText() {
        return AbstractC6280lb1.B(this.U, this.V, this.j0);
    }

    private long getScrubberPosition() {
        if (this.C.width() <= 0 || this.i0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.E.width()) * this.i0) / ((long) this.C.width());
    }

    public static int h(int i) {
        return (i & 16777215) | 855638016;
    }

    public static boolean o(Drawable drawable, int i) {
        return AbstractC6280lb1.a >= 23 && drawable.setLayoutDirection(i);
    }

    public final void c(Canvas canvas) {
        if (this.i0 <= 0) {
            return;
        }
        Rect rect = this.E;
        int iL = AbstractC6280lb1.l(rect.right, rect.left, this.C.right);
        int iCenterY = this.E.centerY();
        Drawable drawable = this.L;
        if (drawable == null) {
            canvas.drawCircle(iL, iCenterY, ((this.g0 || isFocused()) ? this.R : isEnabled() ? this.P : this.Q) / 2, this.K);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.L.getIntrinsicHeight() / 2;
        this.L.setBounds(iL - intrinsicWidth, iCenterY - intrinsicHeight, iL + intrinsicWidth, iCenterY + intrinsicHeight);
        this.L.draw(canvas);
    }

    public final void d(Canvas canvas) {
        int iHeight = this.C.height();
        int iCenterY = this.C.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.i0 <= 0) {
            Rect rect = this.C;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.H);
            return;
        }
        Rect rect2 = this.D;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.C.left, i3), this.E.right);
        int i4 = this.C.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.H);
        }
        int iMax2 = Math.max(i2, this.E.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.G);
        }
        if (this.E.width() > 0) {
            Rect rect3 = this.E;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.F);
        }
        int i5 = this.O / 2;
        for (int i6 = 0; i6 < this.l0; i6++) {
            int iWidth = ((int) ((((long) this.C.width()) * AbstractC6280lb1.m(this.m0[i6], 0L, this.i0)) / this.i0)) - i5;
            Rect rect4 = this.C;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.O, Math.max(0, iWidth)), iCenterY, r8 + this.O, i, this.n0[i6] ? this.J : this.I);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        s();
    }

    public final boolean i(float f, float f2) {
        return this.B.contains((int) f, (int) f2);
    }

    public final void j() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(float f) {
        Rect rect = this.E;
        Rect rect2 = this.C;
        rect.right = AbstractC6280lb1.l((int) f, rect2.left, rect2.right);
    }

    public final Point l(MotionEvent motionEvent) {
        if (this.e0 == null) {
            this.e0 = new int[2];
            this.f0 = new Point();
        }
        getLocationOnScreen(this.e0);
        this.f0.set(((int) motionEvent.getRawX()) - this.e0[0], ((int) motionEvent.getRawY()) - this.e0[1]);
        return this.f0;
    }

    public final boolean m(long j) {
        if (this.i0 <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long jM = AbstractC6280lb1.m(scrubberPosition + j, 0L, this.i0);
        this.h0 = jM;
        if (jM == scrubberPosition) {
            return false;
        }
        if (!this.g0) {
            p();
        }
        Iterator it = this.a0.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
        r();
        return true;
    }

    public final boolean n(Drawable drawable) {
        return AbstractC6280lb1.a >= 23 && o(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        d(canvas);
        c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.i0 <= 0) {
            return;
        }
        int i = AbstractC6280lb1.a;
        if (i >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (i >= 16) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L36
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L36
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m(r0)
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.W
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.W
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.g0
            if (r0 == 0) goto L36
            java.lang.Runnable r5 = r4.W
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.W
            r5.run()
            return r3
        L36:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.N) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.N;
        int i7 = ((i6 - this.M) / 2) + i5;
        this.B.set(paddingLeft, i5, paddingRight, i6 + i5);
        Rect rect = this.C;
        Rect rect2 = this.B;
        int i8 = rect2.left;
        int i9 = this.S;
        rect.set(i8 + i9, i7, rect2.right - i9, this.M + i7);
        r();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.N;
        } else if (mode != 1073741824) {
            size = Math.min(this.N, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        s();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.L;
        if (drawable == null || !o(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L8d
            long r2 = r7.i0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L8d
        L11:
            android.graphics.Point r0 = r7.l(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L72
            r5 = 3
            if (r3 == r4) goto L63
            r6 = 2
            if (r3 == r6) goto L29
            if (r3 == r5) goto L63
            goto L8d
        L29:
            boolean r8 = r7.g0
            if (r8 == 0) goto L8d
            int r8 = r7.T
            if (r0 >= r8) goto L3b
            int r8 = r7.d0
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L41
        L3b:
            r7.d0 = r2
            float r8 = (float) r2
            r7.k(r8)
        L41:
            long r0 = r7.getScrubberPosition()
            r7.h0 = r0
            java.util.concurrent.CopyOnWriteArraySet r8 = r7.a0
            java.util.Iterator r8 = r8.iterator()
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L5a
            r7.r()
            r7.invalidate()
            return r4
        L5a:
            java.lang.Object r8 = r8.next()
            com.daaw.AbstractC6314li0.a(r8)
            r8 = 0
            throw r8
        L63:
            boolean r0 = r7.g0
            if (r0 == 0) goto L8d
            int r8 = r8.getAction()
            if (r8 != r5) goto L6e
            r1 = 1
        L6e:
            r7.q(r1)
            return r4
        L72:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.i(r8, r0)
            if (r0 == 0) goto L8d
            r7.k(r8)
            r7.p()
            long r0 = r7.getScrubberPosition()
            r7.h0 = r0
            r7.r()
            r7.invalidate()
            return r4
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        this.g0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.a0.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            getScrubberPosition();
            throw null;
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.i0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m(-getPositionIncrement())) {
                q(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m(getPositionIncrement())) {
                q(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final void q(boolean z) {
        this.g0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.a0.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            getScrubberPosition();
            throw null;
        }
    }

    public final void r() {
        this.D.set(this.C);
        this.E.set(this.C);
        long j = this.g0 ? this.h0 : this.j0;
        if (this.i0 > 0) {
            int iWidth = (int) ((((long) this.C.width()) * this.k0) / this.i0);
            Rect rect = this.D;
            Rect rect2 = this.C;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.C.width()) * j) / this.i0);
            Rect rect3 = this.E;
            Rect rect4 = this.C;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.D;
            int i = this.C.left;
            rect5.right = i;
            this.E.right = i;
        }
        invalidate(this.B);
    }

    public final void s() {
        Drawable drawable = this.L;
        if (drawable != null && drawable.isStateful() && this.L.setState(getDrawableState())) {
            invalidate();
        }
    }

    public void setAdMarkerColor(int i) {
        this.I.setColor(i);
        invalidate(this.B);
    }

    public void setBufferedColor(int i) {
        this.G.setColor(i);
        invalidate(this.B);
    }

    public void setBufferedPosition(long j) {
        this.k0 = j;
        r();
    }

    public void setDuration(long j) {
        this.i0 = j;
        if (this.g0 && j == -9223372036854775807L) {
            q(true);
        }
        r();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.g0 || z) {
            return;
        }
        q(true);
    }

    public void setKeyCountIncrement(int i) {
        AbstractC7115ob.a(i > 0);
        this.b0 = i;
        this.c0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        AbstractC7115ob.a(j > 0);
        this.b0 = -1;
        this.c0 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.J.setColor(i);
        invalidate(this.B);
    }

    public void setPlayedColor(int i) {
        this.F.setColor(i);
        invalidate(this.B);
    }

    public void setPosition(long j) {
        this.j0 = j;
        setContentDescription(getProgressText());
        r();
    }

    public void setScrubberColor(int i) {
        this.K.setColor(i);
        invalidate(this.B);
    }

    public void setUnplayedColor(int i) {
        this.H.setColor(i);
        invalidate(this.B);
    }
}
