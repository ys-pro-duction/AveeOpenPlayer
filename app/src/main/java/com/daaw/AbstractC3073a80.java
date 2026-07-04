package com.daaw;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.daaw.AbstractC6977o40;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.a80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3073a80 {
    public static C3724cV0 b;
    public static final Interpolator a = new LinearInterpolator();
    public static AbstractC6977o40.a c = AbstractC6977o40.a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static AbstractC6977o40.a d = AbstractC6977o40.a.a("x", "y");

    public static WeakReference a(int i) {
        WeakReference weakReference;
        synchronized (AbstractC3073a80.class) {
            weakReference = (WeakReference) g().g(i);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = AbstractC9678xk0.b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC9678xk0.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC9678xk0.b(pointF2.x, -1.0f, 1.0f);
        float fB = AbstractC9678xk0.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i = AbstractC0301Ab1.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference weakReferenceA = a(i);
        Interpolator interpolator = weakReferenceA != null ? (Interpolator) weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = AbstractC7485pt0.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e.getMessage()) ? AbstractC7485pt0.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            h(i, new WeakReference(interpolatorA));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return interpolatorA;
    }

    public static Y70 c(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0, float f, InterfaceC0409Bc1 interfaceC0409Bc1, boolean z, boolean z2) {
        return (z && z2) ? e(c0737Ee0, abstractC6977o40, f, interfaceC0409Bc1) : z ? d(c0737Ee0, abstractC6977o40, f, interfaceC0409Bc1) : f(abstractC6977o40, f, interfaceC0409Bc1);
    }

    public static Y70 d(C0737Ee0 c0737Ee0, AbstractC6977o40 abstractC6977o40, float f, InterfaceC0409Bc1 interfaceC0409Bc1) {
        Interpolator interpolatorB;
        Object obj;
        abstractC6977o40.d();
        PointF pointFE = null;
        PointF pointFE2 = null;
        Object objA = null;
        Object objA2 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        boolean z = false;
        float F = 0.0f;
        while (abstractC6977o40.o()) {
            switch (abstractC6977o40.o0(c)) {
                case 0:
                    F = (float) abstractC6977o40.F();
                    break;
                case 1:
                    objA2 = interfaceC0409Bc1.a(abstractC6977o40, f);
                    break;
                case 2:
                    objA = interfaceC0409Bc1.a(abstractC6977o40, f);
                    break;
                case 3:
                    pointFE = AbstractC8936v40.e(abstractC6977o40, 1.0f);
                    break;
                case 4:
                    pointFE2 = AbstractC8936v40.e(abstractC6977o40, 1.0f);
                    break;
                case 5:
                    z = abstractC6977o40.I() == 1;
                    break;
                case 6:
                    pointFE3 = AbstractC8936v40.e(abstractC6977o40, f);
                    break;
                case 7:
                    pointFE4 = AbstractC8936v40.e(abstractC6977o40, f);
                    break;
                default:
                    abstractC6977o40.q0();
                    break;
            }
        }
        abstractC6977o40.l();
        if (z) {
            interpolatorB = a;
            obj = objA2;
        } else {
            interpolatorB = (pointFE == null || pointFE2 == null) ? a : b(pointFE, pointFE2);
            obj = objA;
        }
        Y70 y70 = new Y70(c0737Ee0, objA2, obj, interpolatorB, F, null);
        y70.o = pointFE3;
        y70.p = pointFE4;
        return y70;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.Y70 e(com.daaw.C0737Ee0 r21, com.daaw.AbstractC6977o40 r22, float r23, com.daaw.InterfaceC0409Bc1 r24) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC3073a80.e(com.daaw.Ee0, com.daaw.o40, float, com.daaw.Bc1):com.daaw.Y70");
    }

    public static Y70 f(AbstractC6977o40 abstractC6977o40, float f, InterfaceC0409Bc1 interfaceC0409Bc1) {
        return new Y70(interfaceC0409Bc1.a(abstractC6977o40, f));
    }

    public static C3724cV0 g() {
        if (b == null) {
            b = new C3724cV0();
        }
        return b;
    }

    public static void h(int i, WeakReference weakReference) {
        synchronized (AbstractC3073a80.class) {
            b.l(i, weakReference);
        }
    }
}
