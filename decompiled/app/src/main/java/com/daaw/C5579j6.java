package com.daaw;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.daaw.AbstractC9723xt0;

/* JADX INFO: renamed from: com.daaw.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5579j6 implements InterfaceC6090kt0 {
    public final Path b;
    public final RectF c;
    public final float[] d;
    public final Matrix e;

    public C5579j6(Path path) {
        G10.g(path, "internalPath");
        this.b = path;
        this.c = new RectF();
        this.d = new float[8];
        this.e = new Matrix();
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void a(float f, float f2) {
        this.b.moveTo(f, f2);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void c(float f, float f2) {
        this.b.lineTo(f, f2);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void close() {
        this.b.close();
    }

    @Override // com.daaw.InterfaceC6090kt0
    public boolean d() {
        return this.b.isConvex();
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void e(float f, float f2) {
        this.b.rMoveTo(f, f2);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void g(float f, float f2, float f3, float f4) {
        this.b.quadTo(f, f2, f3, f4);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void h(C3103aF0 c3103aF0) {
        G10.g(c3103aF0, "rect");
        if (!o(c3103aF0)) {
            throw new IllegalStateException("Check failed.");
        }
        this.c.set(AbstractC3660cF0.b(c3103aF0));
        this.b.addRect(this.c, Path.Direction.CCW);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void i(float f, float f2, float f3, float f4) {
        this.b.rQuadTo(f, f2, f3, f4);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void j(int i) {
        this.b.setFillType(C7206ot0.f(i, C7206ot0.b.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void k(InterfaceC6090kt0 interfaceC6090kt0, long j) {
        G10.g(interfaceC6090kt0, "path");
        Path path = this.b;
        if (!(interfaceC6090kt0 instanceof C5579j6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((C5579j6) interfaceC6090kt0).p(), C9982yp0.l(j), C9982yp0.m(j));
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void l(C3680cK0 c3680cK0) {
        G10.g(c3680cK0, "roundRect");
        this.c.set(c3680cK0.e(), c3680cK0.g(), c3680cK0.f(), c3680cK0.a());
        this.d[0] = AbstractC2791Xs.d(c3680cK0.h());
        this.d[1] = AbstractC2791Xs.e(c3680cK0.h());
        this.d[2] = AbstractC2791Xs.d(c3680cK0.i());
        this.d[3] = AbstractC2791Xs.e(c3680cK0.i());
        this.d[4] = AbstractC2791Xs.d(c3680cK0.c());
        this.d[5] = AbstractC2791Xs.e(c3680cK0.c());
        this.d[6] = AbstractC2791Xs.d(c3680cK0.b());
        this.d[7] = AbstractC2791Xs.e(c3680cK0.b());
        this.b.addRoundRect(this.c, this.d, Path.Direction.CCW);
    }

    @Override // com.daaw.InterfaceC6090kt0
    public boolean m(InterfaceC6090kt0 interfaceC6090kt0, InterfaceC6090kt0 interfaceC6090kt02, int i) {
        G10.g(interfaceC6090kt0, "path1");
        G10.g(interfaceC6090kt02, "path2");
        AbstractC9723xt0.a aVar = AbstractC9723xt0.a;
        Path.Op op = AbstractC9723xt0.f(i, aVar.a()) ? Path.Op.DIFFERENCE : AbstractC9723xt0.f(i, aVar.b()) ? Path.Op.INTERSECT : AbstractC9723xt0.f(i, aVar.c()) ? Path.Op.REVERSE_DIFFERENCE : AbstractC9723xt0.f(i, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.b;
        if (!(interfaceC6090kt0 instanceof C5579j6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathP = ((C5579j6) interfaceC6090kt0).p();
        if (interfaceC6090kt02 instanceof C5579j6) {
            return path.op(pathP, ((C5579j6) interfaceC6090kt02).p(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void n(float f, float f2) {
        this.b.rLineTo(f, f2);
    }

    public final boolean o(C3103aF0 c3103aF0) {
        if (Float.isNaN(c3103aF0.f())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(c3103aF0.i())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(c3103aF0.g())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(c3103aF0.c())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }

    public final Path p() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC6090kt0
    public void reset() {
        this.b.reset();
    }

    public /* synthetic */ C5579j6(Path path, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
