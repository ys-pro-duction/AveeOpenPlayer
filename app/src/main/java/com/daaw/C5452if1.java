package com.daaw;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.if1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5452if1 extends C5174hf1 {
    @Override // com.daaw.AbstractC3492bf1, com.daaw.AbstractC5733jf1
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.daaw.C4616ff1, com.daaw.AbstractC5733jf1
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.daaw.AbstractC3492bf1, com.daaw.AbstractC5733jf1
    public void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.daaw.C5174hf1, com.daaw.AbstractC5733jf1
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.daaw.C4049df1, com.daaw.AbstractC5733jf1
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.daaw.C4049df1, com.daaw.AbstractC5733jf1
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
