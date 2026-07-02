package com.daaw;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648Di implements InterfaceC0327Ai {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    @Override // com.daaw.InterfaceC0327Ai
    public void a(View view, float[] fArr) {
        G10.g(view, "view");
        G10.g(fArr, "matrix");
        this.a.reset();
        view.transformMatrixToGlobal(this.a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.b);
        int[] iArr = this.b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.b;
        this.a.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        AbstractC3062a6.b(fArr, this.a);
    }
}
