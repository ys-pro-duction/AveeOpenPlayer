package com.daaw;

import android.view.View;

/* JADX INFO: renamed from: com.daaw.bf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3492bf1 extends AbstractC5733jf1 {
    public static boolean e = true;

    @Override // com.daaw.AbstractC5733jf1
    public float c(View view) {
        if (e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // com.daaw.AbstractC5733jf1
    public void f(View view, float f) {
        if (e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // com.daaw.AbstractC5733jf1
    public void a(View view) {
    }

    @Override // com.daaw.AbstractC5733jf1
    public void d(View view) {
    }
}
