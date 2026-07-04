package com.daaw;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431Bi implements InterfaceC0327Ai {
    public final int[] a = new int[2];
    public final float[] b = C9384wh0.c(null, 1, null);

    @Override // com.daaw.InterfaceC0327Ai
    public void a(View view, float[] fArr) {
        G10.g(view, "view");
        G10.g(fArr, "matrix");
        C9384wh0.h(fArr);
        d(view, fArr);
    }

    public final void b(float[] fArr, Matrix matrix) {
        AbstractC3062a6.b(this.b, matrix);
        A5.g(fArr, this.b);
    }

    public final void c(float[] fArr, float f, float f2) {
        C9384wh0.h(this.b);
        C9384wh0.m(this.b, f, f2, 0.0f, 4, null);
        A5.g(fArr, this.b);
    }

    public final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.a);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        G10.f(matrix, "viewMatrix");
        b(fArr, matrix);
    }
}
