package com.daaw;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: renamed from: com.daaw.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7245p2 {
    public Context a;

    public C7245p2(Context context) {
        this.a = context;
    }

    public static C7245p2 b(Context context) {
        return new C7245p2(context);
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.a.getResources().getBoolean(OC0.a);
    }

    public boolean f() {
        return true;
    }
}
