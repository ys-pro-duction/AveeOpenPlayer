package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class KH0 implements IB {
    public final C6423m5 a;
    public final RenderNode b;

    public KH0(C6423m5 c6423m5) {
        G10.g(c6423m5, "ownerView");
        this.a = c6423m5;
        this.b = CH0.a("Compose");
    }

    @Override // com.daaw.IB
    public void A(int i) {
        this.b.offsetTopAndBottom(i);
    }

    @Override // com.daaw.IB
    public boolean B() {
        return this.b.hasDisplayList();
    }

    @Override // com.daaw.IB
    public void C(Outline outline) {
        this.b.setOutline(outline);
    }

    @Override // com.daaw.IB
    public void D(C7434pj c7434pj, InterfaceC6090kt0 interfaceC6090kt0, NQ nq) {
        G10.g(c7434pj, "canvasHolder");
        G10.g(nq, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.b.beginRecording();
        G10.f(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        Canvas canvasR = c7434pj.a().r();
        c7434pj.a().s(recordingCanvasBeginRecording);
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
        this.b.endRecording();
    }

    @Override // com.daaw.IB
    public boolean E() {
        return this.b.getClipToBounds();
    }

    @Override // com.daaw.IB
    public int F() {
        return this.b.getTop();
    }

    @Override // com.daaw.IB
    public void G(int i) {
        this.b.setAmbientShadowColor(i);
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
    public void K(int i) {
        this.b.setSpotShadowColor(i);
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

    @Override // com.daaw.IB
    public int a() {
        return this.b.getLeft();
    }

    @Override // com.daaw.IB
    public void c(float f) {
        this.b.setAlpha(f);
    }

    @Override // com.daaw.IB
    public int d() {
        return this.b.getRight();
    }

    @Override // com.daaw.IB
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // com.daaw.IB
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // com.daaw.IB
    public void h(float f) {
        this.b.setRotationY(f);
    }

    @Override // com.daaw.IB
    public void i(float f) {
        this.b.setRotationZ(f);
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
    public void l(UG0 ug0) {
        if (Build.VERSION.SDK_INT >= 31) {
            MH0.a.a(this.b, ug0);
        }
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
        this.b.setCameraDistance(f);
    }

    @Override // com.daaw.IB
    public void q(float f) {
        this.b.setRotationX(f);
    }

    @Override // com.daaw.IB
    public void r(int i) {
        this.b.offsetLeftAndRight(i);
    }

    @Override // com.daaw.IB
    public int s() {
        return this.b.getBottom();
    }

    @Override // com.daaw.IB
    public void t(Canvas canvas) {
        G10.g(canvas, "canvas");
        canvas.drawRenderNode(this.b);
    }

    @Override // com.daaw.IB
    public void u(float f) {
        this.b.setPivotX(f);
    }

    @Override // com.daaw.IB
    public void v(boolean z) {
        this.b.setClipToBounds(z);
    }

    @Override // com.daaw.IB
    public boolean w(int i, int i2, int i3, int i4) {
        return this.b.setPosition(i, i2, i3, i4);
    }

    @Override // com.daaw.IB
    public void x() {
        this.b.discardDisplayList();
    }

    @Override // com.daaw.IB
    public void y(float f) {
        this.b.setPivotY(f);
    }

    @Override // com.daaw.IB
    public void z(float f) {
        this.b.setElevation(f);
    }
}
