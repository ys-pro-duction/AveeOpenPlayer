package com.daaw;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.hy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5265hy1 {
    public static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public long a = 0;
    public long b = 0;
    public long c = -1;
    public boolean d = false;

    public C5265hy1(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C4707fy1(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static C5265hy1 d(Context context, Executor executor) {
        return new C5265hy1(context, executor, e);
    }

    public final long b() {
        long j = this.c;
        this.c = -1L;
        return j;
    }

    public final long c() {
        if (this.d) {
            return this.b - this.a;
        }
        return -1L;
    }

    public final void h() {
        if (this.d) {
            this.b = System.currentTimeMillis();
        }
    }
}
