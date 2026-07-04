package com.daaw;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.df1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4049df1 extends AbstractC3492bf1 {
    public static boolean f = true;
    public static boolean g = true;

    @Override // com.daaw.AbstractC5733jf1
    public void h(View view, Matrix matrix) {
        if (f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // com.daaw.AbstractC5733jf1
    public void i(View view, Matrix matrix) {
        if (g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
