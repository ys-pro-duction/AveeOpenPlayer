package com.daaw;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;

/* JADX INFO: renamed from: com.daaw.mF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6468mF {
    public static void a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int iB = AbstractC3779ch0.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(iB);
            }
            if (z3) {
                num2 = Integer.valueOf(iB);
            }
        }
        AbstractC3223ah1.b(window, !z);
        int iC = c(window.getContext(), z);
        int iB2 = b(window.getContext(), z);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, AbstractC3779ch0.h(num.intValue())));
        e(window, d(iB2, AbstractC3779ch0.h(num2.intValue())));
    }

    public static int b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return AbstractC6338ln.o(AbstractC3779ch0.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return AbstractC3779ch0.b(context, R.attr.navigationBarColor, -16777216);
    }

    public static int c(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 23) {
            return AbstractC6338ln.o(AbstractC3779ch0.b(context, R.attr.statusBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return AbstractC3779ch0.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i, boolean z) {
        if (AbstractC3779ch0.h(i)) {
            return true;
        }
        return i == 0 && z;
    }

    public static void e(Window window, boolean z) {
        AbstractC3223ah1.a(window, window.getDecorView()).a(z);
    }

    public static void f(Window window, boolean z) {
        AbstractC3223ah1.a(window, window.getDecorView()).b(z);
    }
}
