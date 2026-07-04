package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: com.daaw.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3336b5 implements InterfaceC6318lj {
    public Canvas a = AbstractC3614c5.a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();

    @Override // com.daaw.InterfaceC6318lj
    public void a(InterfaceC6090kt0 interfaceC6090kt0, int i) {
        G10.g(interfaceC6090kt0, "path");
        Canvas canvas = this.a;
        if (!(interfaceC6090kt0 instanceof C5579j6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C5579j6) interfaceC6090kt0).p(), t(i));
    }

    @Override // com.daaw.InterfaceC6318lj
    public void b(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, t(i));
    }

    @Override // com.daaw.InterfaceC6318lj
    public void c(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // com.daaw.InterfaceC6318lj
    public void d(InterfaceC6090kt0 interfaceC6090kt0, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(interfaceC6090kt0, "path");
        G10.g(interfaceC8595ts0, "paint");
        Canvas canvas = this.a;
        if (!(interfaceC6090kt0 instanceof C5579j6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C5579j6) interfaceC6090kt0).p(), interfaceC8595ts0.h());
    }

    @Override // com.daaw.InterfaceC6318lj
    public void e(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // com.daaw.InterfaceC6318lj
    public /* synthetic */ void f(C3103aF0 c3103aF0, int i) {
        AbstractC6030kj.a(this, c3103aF0, i);
    }

    @Override // com.daaw.InterfaceC6318lj
    public void g(C3103aF0 c3103aF0, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(c3103aF0, "bounds");
        G10.g(interfaceC8595ts0, "paint");
        this.a.saveLayer(c3103aF0.f(), c3103aF0.i(), c3103aF0.g(), c3103aF0.c(), interfaceC8595ts0.h(), 31);
    }

    @Override // com.daaw.InterfaceC6318lj
    public void h(long j, float f, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(interfaceC8595ts0, "paint");
        this.a.drawCircle(C9982yp0.l(j), C9982yp0.m(j), f, interfaceC8595ts0.h());
    }

    @Override // com.daaw.InterfaceC6318lj
    public void i() {
        this.a.save();
    }

    @Override // com.daaw.InterfaceC6318lj
    public void j() {
        C8270sj.a.a(this.a, false);
    }

    @Override // com.daaw.InterfaceC6318lj
    public void k(float[] fArr) {
        G10.g(fArr, "matrix");
        if (AbstractC9942yh0.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC3062a6.a(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // com.daaw.InterfaceC6318lj
    public void l(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(interfaceC8595ts0, "paint");
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, interfaceC8595ts0.h());
    }

    @Override // com.daaw.InterfaceC6318lj
    public void m(float f, float f2, float f3, float f4, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(interfaceC8595ts0, "paint");
        this.a.drawRect(f, f2, f3, f4, interfaceC8595ts0.h());
    }

    @Override // com.daaw.InterfaceC6318lj
    public /* synthetic */ void n(C3103aF0 c3103aF0, InterfaceC8595ts0 interfaceC8595ts0) {
        AbstractC6030kj.b(this, c3103aF0, interfaceC8595ts0);
    }

    @Override // com.daaw.InterfaceC6318lj
    public void o() {
        this.a.restore();
    }

    @Override // com.daaw.InterfaceC6318lj
    public void p(InterfaceC5418iY interfaceC5418iY, long j, long j2, long j3, long j4, InterfaceC8595ts0 interfaceC8595ts0) {
        G10.g(interfaceC5418iY, "image");
        G10.g(interfaceC8595ts0, "paint");
        Canvas canvas = this.a;
        Bitmap bitmapB = S5.b(interfaceC5418iY);
        Rect rect = this.b;
        rect.left = D00.f(j);
        rect.top = D00.g(j);
        rect.right = D00.f(j) + I00.g(j2);
        rect.bottom = D00.g(j) + I00.f(j2);
        G91 g91 = G91.a;
        Rect rect2 = this.c;
        rect2.left = D00.f(j3);
        rect2.top = D00.g(j3);
        rect2.right = D00.f(j3) + I00.g(j4);
        rect2.bottom = D00.g(j3) + I00.f(j4);
        canvas.drawBitmap(bitmapB, rect, rect2, interfaceC8595ts0.h());
    }

    @Override // com.daaw.InterfaceC6318lj
    public void q() {
        C8270sj.a.a(this.a, true);
    }

    public final Canvas r() {
        return this.a;
    }

    public final void s(Canvas canvas) {
        G10.g(canvas, "<set-?>");
        this.a = canvas;
    }

    public final Region.Op t(int i) {
        return AbstractC4360em.d(i, AbstractC4360em.a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
