package com.daaw;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.nR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6796nR0 {
    public final List a;
    public PointF b;
    public boolean c;

    public C6796nR0(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public List a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(C6796nR0 c6796nR0, C6796nR0 c6796nR02, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = c6796nR0.d() || c6796nR02.d();
        if (c6796nR0.a().size() != c6796nR02.a().size()) {
            AbstractC1876Pd0.c("Curves must have the same number of control points. Shape 1: " + c6796nR0.a().size() + "\tShape 2: " + c6796nR02.a().size());
        }
        int iMin = Math.min(c6796nR0.a().size(), c6796nR02.a().size());
        if (this.a.size() < iMin) {
            for (int size = this.a.size(); size < iMin; size++) {
                this.a.add(new C1527Lu());
            }
        } else if (this.a.size() > iMin) {
            for (int size2 = this.a.size() - 1; size2 >= iMin; size2--) {
                List list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = c6796nR0.b();
        PointF pointFB2 = c6796nR02.b();
        f(AbstractC9678xk0.i(pointFB.x, pointFB2.x, f), AbstractC9678xk0.i(pointFB.y, pointFB2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            C1527Lu c1527Lu = (C1527Lu) c6796nR0.a().get(size3);
            C1527Lu c1527Lu2 = (C1527Lu) c6796nR02.a().get(size3);
            PointF pointFA = c1527Lu.a();
            PointF pointFB3 = c1527Lu.b();
            PointF pointFC = c1527Lu.c();
            PointF pointFA2 = c1527Lu2.a();
            PointF pointFB4 = c1527Lu2.b();
            PointF pointFC2 = c1527Lu2.c();
            ((C1527Lu) this.a.get(size3)).d(AbstractC9678xk0.i(pointFA.x, pointFA2.x, f), AbstractC9678xk0.i(pointFA.y, pointFA2.y, f));
            ((C1527Lu) this.a.get(size3)).e(AbstractC9678xk0.i(pointFB3.x, pointFB4.x, f), AbstractC9678xk0.i(pointFB3.y, pointFB4.y, f));
            ((C1527Lu) this.a.get(size3)).f(AbstractC9678xk0.i(pointFC.x, pointFC2.x, f), AbstractC9678xk0.i(pointFC.y, pointFC2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public C6796nR0() {
        this.a = new ArrayList();
    }
}
