package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class VN0 {
    public static final VN0 a = new VN0();

    public final int a(int i) {
        return Math.round(i * (Resources.getSystem().getDisplayMetrics().densityDpi / 160));
    }

    public final int b(View view) {
        G10.g(view, "targetView");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public final int c(View view) {
        G10.g(view, "targetView");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public final int d(Context context) {
        G10.g(context, "context");
        Object systemService = context.getSystemService("window");
        G10.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.y;
    }

    public final int e(Context context) {
        G10.g(context, "context");
        Object systemService = context.getSystemService("window");
        G10.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public final int f(Context context) {
        G10.g(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final boolean g(Activity activity, View view) {
        G10.g(activity, "activity");
        G10.g(view, "targetView");
        return e(activity) / 2 > b(view);
    }

    public final boolean h(Activity activity, View view) {
        G10.g(activity, "activity");
        G10.g(view, "targetView");
        return d(activity) / 2 > c(view);
    }
}
