package com.daaw;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.daaw.Xe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC2738Xe2 implements GestureDetector.OnGestureListener {
    public final C6575me2 a;
    public final ViewTreeObserverOnGlobalLayoutListenerC2112Re2 b;

    public GestureDetectorOnGestureListenerC2738Xe2(C6575me2 c6575me2, ViewTreeObserverOnGlobalLayoutListenerC2112Re2 viewTreeObserverOnGlobalLayoutListenerC2112Re2) {
        this.a = c6575me2;
        this.b = viewTreeObserverOnGlobalLayoutListenerC2112Re2;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.daaw.me2 r0 = r6.a     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r6)
            return r1
        L8:
            float r0 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2b
            float r2 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L2b
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L42
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L2d
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            goto L68
        L2b:
            r7 = move-exception
            goto L7f
        L2d:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L40
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 2
            goto L68
        L40:
            r7 = 0
            goto L68
        L42:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L56
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 8
            goto L68
        L56:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L40
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L2b
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2b
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L2b
            r3 = 4
        L68:
            com.daaw.me2 r8 = r6.a     // Catch: java.lang.Throwable -> L2b
            int r8 = r8.H()     // Catch: java.lang.Throwable -> L2b
            if (r3 == r8) goto L72
            monitor-exit(r6)
            return r1
        L72:
            com.daaw.me2 r8 = r6.a     // Catch: java.lang.Throwable -> L2b
            com.daaw.Re2 r9 = r6.b     // Catch: java.lang.Throwable -> L2b
            android.widget.FrameLayout r9 = r9.Z2()     // Catch: java.lang.Throwable -> L2b
            r8.j(r9, r7)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r6)
            return r1
        L7f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.GestureDetectorOnGestureListenerC2738Xe2.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
