package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.hh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5183hh0 {
    public static AbstractC3838ct a(int i) {
        return i != 0 ? i != 1 ? b() : new C9731xv() : new C5084hK0();
    }

    public static AbstractC3838ct b() {
        return new C5084hK0();
    }

    public static C6747nF c() {
        return new C6747nF();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C4904gh0) {
            ((C4904gh0) background).R(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C4904gh0) {
            f(view, (C4904gh0) background);
        }
    }

    public static void f(View view, C4904gh0 c4904gh0) {
        if (c4904gh0.K()) {
            c4904gh0.V(AbstractC2633We1.d(view));
        }
    }
}
