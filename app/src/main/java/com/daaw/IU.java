package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IU extends AbstractC0521Ce1 {
    public Runnable d;
    public OverScroller e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public VelocityTracker j;

    public class a implements Runnable {
        public final CoordinatorLayout B;
        public final View C;

        public a(CoordinatorLayout coordinatorLayout, View view) {
            this.B = coordinatorLayout;
            this.C = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.C == null || (overScroller = IU.this.e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                IU.this.M(this.B, this.C);
                return;
            }
            IU iu = IU.this;
            iu.O(this.B, this.C, iu.e.getCurrY());
            AbstractC2317Td1.h0(this.C, this);
        }
    }

    public IU() {
        this.g = -1;
        this.i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.h = r1
            goto L4b
        L2d:
            int r1 = r9.g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r8
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.h
            int r3 = r3 - r1
            r9.h = r1
            int r4 = r9.J(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.N(r1, r2, r3, r4, r5)
        L4b:
            r1 = 0
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.j
            int r3 = r9.g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.K(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.I(r1, r2, r3, r4, r5)
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            r9.f = r8
            r9.g = r6
            android.view.VelocityTracker r2 = r9.j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.j = r2
        L80:
            android.view.VelocityTracker r2 = r9.j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r8
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.IU.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean G(View view);

    public final void H() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    public final boolean I(CoordinatorLayout coordinatorLayout, View view, int i, int i2, float f) {
        Runnable runnable = this.d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(view.getContext());
        }
        this.e.fling(0, E(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.e.computeScrollOffset()) {
            M(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.d = aVar;
        AbstractC2317Td1.h0(view, aVar);
        return true;
    }

    public abstract int J(View view);

    public abstract int K(View view);

    public abstract int L();

    public abstract void M(CoordinatorLayout coordinatorLayout, View view);

    public final int N(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return P(coordinatorLayout, view, L() - i, i2, i3);
    }

    public int O(CoordinatorLayout coordinatorLayout, View view, int i) {
        return P(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int P(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            int i = this.g;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.h) > this.i) {
                this.h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = G(view) && coordinatorLayout.z(view, x, y2);
            this.f = z;
            if (z) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public IU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.i = -1;
    }
}
