package com.daaw;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4739g5 {
    public static final C2871Ym a(long j, int i) {
        return new C2871Ym(Build.VERSION.SDK_INT >= 29 ? C2739Xf.a.a(j, i) : new PorterDuffColorFilter(AbstractC3530bn.i(j), Z4.b(i)));
    }

    public static final ColorFilter b(C2871Ym c2871Ym) {
        G10.g(c2871Ym, "<this>");
        return c2871Ym.a();
    }
}
