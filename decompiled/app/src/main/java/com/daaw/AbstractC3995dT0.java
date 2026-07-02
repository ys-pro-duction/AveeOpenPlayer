package com.daaw;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.dT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3995dT0 {
    public static void a(View view, View view2, float f, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = (int) ((f2 / f) * layoutParams.width);
        view2.setLayoutParams(layoutParams2);
    }
}
