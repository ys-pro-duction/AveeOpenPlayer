package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class XG0 implements IB {
    public static boolean i;
    public final C6423m5 a;
    public final RenderNode b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public static final a h = new a(null);
    public static boolean j = true;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public XG0(C6423m5 c6423m5) {
        G10.g(c6423m5, "ownerView");
        this.a = c6423m5;
        RenderNode renderNodeCreate = RenderNode.create("Compose", c6423m5);
        G10.f(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.b = renderNodeCreate;
        if (j) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            O(renderNodeCreate);
            b();
            j = false;
        }
        if (i) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // com.daaw.IB
    public void A(int i2) {
        N(F() + i2);
        e(s() + i2);
        this.b.offsetTopAndBottom(i2);
    }

    @Override // com.daaw.IB
    public boolean B() {
        return this.b.isValid();
    }

    @Override // com.daaw.IB
    public void C(Outline outline) {
        this.b.setOutline(outline);
    }

    @Override // com.daaw.IB
    public void D(C7434pj c7434pj, InterfaceC6090kt0 interfaceC6090kt0, NQ nq) {
        G10.g(c7434pj, "canvasHolder");
        G10.g(nq, "drawBlock");
        DisplayListCanvas displayListCanvasStart = this.b.start(getWidth(), getHeight());
        G10.f(displayListCanvasStart, "renderNode.start(width, height)");
        Canvas canvasR = c7434pj.a().r();
        c7434pj.a().s((Canvas) displayListCanvasStart);
        C3336b5 c3336b5A = c7434pj.a();
        if (interfaceC6090kt0 != null) {
            c3336b5A.i();
            AbstractC6030kj.c(c3336b5A, interfaceC6090kt0, 0, 2, null);
        }
        nq.invoke(c3336b5A);
        if (interfaceC6090kt0 != null) {
            c3336b5A.o();
        }
        c7434pj.a().s(canvasR);
        this.b.end(displayListCanvasStart);
    }

    @Override // com.daaw.IB
    public boolean E() {
        return this.g;
    }

    @Override // com.daaw.IB
    public int F() {
        return this.d;
    }

    @Override // com.daaw.IB
    public void G(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            QH0.a.c(this.b, i2);
        }
    }

    @Override // com.daaw.IB
    public boolean H() {
        return this.b.getClipToOutline();
    }

    @Override // com.daaw.IB
    public void I(boolean z) {
        this.b.setClipToOutline(z);
    }

    @Override // com.daaw.IB
    public boolean J(boolean z) {
        return this.b.setHasOverlappingRendering(z);
    }

    @Override // com.daaw.IB
    public void K(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            QH0.a.d(this.b, i2);
        }
    }

    @Override // com.daaw.IB
    public void L(Matrix matrix) {
        G10.g(matrix, "matrix");
        this.b.getMatrix(matrix);
    }

    @Override // com.daaw.IB
    public float M() {
        return this.b.getElevation();
    }

    public void N(int i2) {
        this.d = i2;
    }

    public final void O(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            QH0 qh0 = QH0.a;
            qh0.c(renderNode, qh0.a(renderNode));
            qh0.d(renderNode, qh0.b(renderNode));
        }
    }

    @Override // com.daaw.IB
    public int a() {
        return this.c;
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            PH0.a.a(this.b);
        } else {
            OH0.a.a(this.b);
        }
    }

    @Override // com.daaw.IB
    public void c(float f) {
        this.b.setAlpha(f);
    }

    @Override // com.daaw.IB
    public int d() {
        return this.e;
    }

    public void e(int i2) {
        this.f = i2;
    }

    public void f(int i2) {
        this.c = i2;
    }

    public void g(int i2) {
        this.e = i2;
    }

    @Override // com.daaw.IB
    public int getHeight() {
        return s() - F();
    }

    @Override // com.daaw.IB
    public int getWidth() {
        return d() - a();
    }

    @Override // com.daaw.IB
    public void h(float f) {
        this.b.setRotationY(f);
    }

    @Override // com.daaw.IB
    public void i(float f) {
        this.b.setRotation(f);
    }

    @Override // com.daaw.IB
    public void j(float f) {
        this.b.setTranslationY(f);
    }

    @Override // com.daaw.IB
    public void k(float f) {
        this.b.setScaleY(f);
    }

    @Override // com.daaw.IB
    public void m(float f) {
        this.b.setScaleX(f);
    }

    @Override // com.daaw.IB
    public void n(float f) {
        this.b.setTranslationX(f);
    }

    @Override // com.daaw.IB
    public float o() {
        return this.b.getAlpha();
    }

    @Override // com.daaw.IB
    public void p(float f) {
        this.b.setCameraDistance(-f);
    }

    @Override // com.daaw.IB
    public void q(float f) {
        this.b.setRotationX(f);
    }

    @Override // com.daaw.IB
    public void r(int i2) {
        f(a() + i2);
        g(d() + i2);
        this.b.offsetLeftAndRight(i2);
    }

    @Override // com.daaw.IB
    public int s() {
        return this.f;
    }

    @Override // com.daaw.IB
    public void t(Canvas canvas) {
        G10.g(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.b);
    }

    @Override // com.daaw.IB
    public void u(float f) {
        this.b.setPivotX(f);
    }

    @Override // com.daaw.IB
    public void v(boolean z) {
        this.g = z;
        this.b.setClipToBounds(z);
    }

    @Override // com.daaw.IB
    public boolean w(int i2, int i3, int i4, int i5) {
        f(i2);
        N(i3);
        g(i4);
        e(i5);
        return this.b.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // com.daaw.IB
    public void x() {
        b();
    }

    @Override // com.daaw.IB
    public void y(float f) {
        this.b.setPivotY(f);
    }

    @Override // com.daaw.IB
    public void z(float f) {
        this.b.setElevation(f);
    }

    @Override // com.daaw.IB
    public void l(UG0 ug0) {
    }
}
