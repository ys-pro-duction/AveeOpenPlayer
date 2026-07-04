package com.daaw;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9678xk0 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static int e(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int f(float f, float f2) {
        return g((int) f, (int) f2);
    }

    public static int g(int i, int i2) {
        return i - (i2 * e(i, i2));
    }

    public static void h(C6796nR0 c6796nR0, Path path) {
        Path path2;
        path.reset();
        PointF pointFB = c6796nR0.b();
        path.moveTo(pointFB.x, pointFB.y);
        a.set(pointFB.x, pointFB.y);
        int i = 0;
        while (i < c6796nR0.a().size()) {
            C1527Lu c1527Lu = (C1527Lu) c6796nR0.a().get(i);
            PointF pointFA = c1527Lu.a();
            PointF pointFB2 = c1527Lu.b();
            PointF pointFC = c1527Lu.c();
            PointF pointF = a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (c6796nR0.d()) {
            path3.close();
        }
    }

    public static float i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int j(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static void k(S70 s70, int i, List list, S70 s702, U70 u70) {
        if (s70.c(u70.getName(), i)) {
            list.add(s702.a(u70.getName()).i(u70));
        }
    }
}
