package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.daaw.kR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5950kR0 {
    public final C9313wR0[] a = new C9313wR0[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final C9313wR0 g = new C9313wR0();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* JADX INFO: renamed from: com.daaw.kR0$a */
    public static class a {
        public static final C5950kR0 a = new C5950kR0();
    }

    /* JADX INFO: renamed from: com.daaw.kR0$b */
    public interface b {
        void a(C9313wR0 c9313wR0, Matrix matrix, int i);

        void b(C9313wR0 c9313wR0, Matrix matrix, int i);
    }

    /* JADX INFO: renamed from: com.daaw.kR0$c */
    public static final class c {
        public final C5671jR0 a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        public c(C5671jR0 c5671jR0, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = c5671jR0;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public C5950kR0() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new C9313wR0();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static C5950kR0 k() {
        return a.a;
    }

    public final float a(int i) {
        return ((i + 1) % 4) * 90;
    }

    public final void b(c cVar, int i) {
        this.h[0] = this.a[i].k();
        this.h[1] = this.a[i].l();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.a[i], this.b[i], i);
        }
    }

    public final void c(c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].k();
        this.i[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.i);
        float f = this.h[0];
        float[] fArr = this.i;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        C6747nF c6747nFJ = j(i, cVar.a);
        c6747nFJ.b(fMax, fI, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (c6747nFJ.a() || l(this.j, i) || l(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr2 = this.h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.g, this.c[i], i);
        }
    }

    public void d(C5671jR0 c5671jR0, float f, RectF rectF, Path path) {
        e(c5671jR0, f, rectF, null, path);
    }

    public void e(C5671jR0 c5671jR0, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c5671jR0, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public final void f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final InterfaceC2999Zs g(int i, C5671jR0 c5671jR0) {
        return i != 1 ? i != 2 ? i != 3 ? c5671jR0.t() : c5671jR0.r() : c5671jR0.j() : c5671jR0.l();
    }

    public final AbstractC3838ct h(int i, C5671jR0 c5671jR0) {
        return i != 1 ? i != 2 ? i != 3 ? c5671jR0.s() : c5671jR0.q() : c5671jR0.i() : c5671jR0.k();
    }

    public final float i(RectF rectF, int i) {
        float[] fArr = this.h;
        C9313wR0 c9313wR0 = this.a[i];
        fArr[0] = c9313wR0.c;
        fArr[1] = c9313wR0.d;
        this.b[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.h[0]) : Math.abs(rectF.centerY() - this.h[1]);
    }

    public final C6747nF j(int i, C5671jR0 c5671jR0) {
        return i != 1 ? i != 2 ? i != 3 ? c5671jR0.o() : c5671jR0.p() : c5671jR0.n() : c5671jR0.h();
    }

    public final boolean l(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void m(c cVar, int i) {
        h(i, cVar.a).b(this.a[i], 90.0f, cVar.e, cVar.c, g(i, cVar.a));
        float fA = a(i);
        this.b[i].reset();
        f(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(fA);
    }

    public final void n(int i) {
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        float fA = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(fA);
    }
}
