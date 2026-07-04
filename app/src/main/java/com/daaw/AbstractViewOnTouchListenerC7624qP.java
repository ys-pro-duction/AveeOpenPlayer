package com.daaw;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.qP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC7624qP implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float B;
    public final int C;
    public final int D;
    public final View E;
    public Runnable F;
    public Runnable G;
    public boolean H;
    public int I;
    public final int[] J = new int[2];

    /* JADX INFO: renamed from: com.daaw.qP$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC7624qP.this.E.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.qP$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC7624qP.this.e();
        }
    }

    public AbstractViewOnTouchListenerC7624qP(View view) {
        this.E = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.B = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.C = tapTimeout;
        this.D = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public final void a() {
        Runnable runnable = this.G;
        if (runnable != null) {
            this.E.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.F;
        if (runnable2 != null) {
            this.E.removeCallbacks(runnable2);
        }
    }

    public abstract InterfaceC4269eS0 b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC4269eS0 interfaceC4269eS0B = b();
        if (interfaceC4269eS0B == null || !interfaceC4269eS0B.a()) {
            return true;
        }
        interfaceC4269eS0B.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.E;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.H = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        C7858rE c7858rE;
        View view = this.E;
        InterfaceC4269eS0 interfaceC4269eS0B = b();
        if (interfaceC4269eS0B != null && interfaceC4269eS0B.a() && (c7858rE = (C7858rE) interfaceC4269eS0B.k()) != null && c7858rE.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(c7858rE, motionEventObtainNoHistory);
            boolean zE = c7858rE.e(motionEventObtainNoHistory, this.I);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.E
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.I
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.B
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.I = r6
            java.lang.Runnable r6 = r5.F
            if (r6 != 0) goto L52
            com.daaw.qP$a r6 = new com.daaw.qP$a
            r6.<init>()
            r5.F = r6
        L52:
            java.lang.Runnable r6 = r5.F
            int r1 = r5.C
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.G
            if (r6 != 0) goto L65
            com.daaw.qP$b r6 = new com.daaw.qP$b
            r6.<init>()
            r5.G = r6
        L65:
            java.lang.Runnable r6 = r5.G
            int r1 = r5.D
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractViewOnTouchListenerC7624qP.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.J);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.J);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.H;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.E.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.H = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.H = false;
        this.I = -1;
        Runnable runnable = this.F;
        if (runnable != null) {
            this.E.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
