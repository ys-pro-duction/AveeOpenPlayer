package com.daaw;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.hf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5174hf1 extends C4616ff1 {
    public static boolean i = true;

    @Override // com.daaw.AbstractC5733jf1
    public void g(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
