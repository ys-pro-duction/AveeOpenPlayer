package com.daaw;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: com.daaw.ah1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3223ah1 {

    /* JADX INFO: renamed from: com.daaw.ah1$a */
    public static class a {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ah1$b */
    public static class b {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static C2645Wh1 a(Window window, View view) {
        return new C2645Wh1(window, view);
    }

    public static void b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
