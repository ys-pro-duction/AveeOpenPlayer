package com.daaw;

import android.app.AppOpsManager;

/* JADX INFO: renamed from: com.daaw.fy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4707fy1 implements AppOpsManager.OnOpActiveChangedListener {
    public final /* synthetic */ C5265hy1 a;

    public C4707fy1(C5265hy1 c5265hy1) {
        this.a = c5265hy1;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.a.a = System.currentTimeMillis();
            this.a.d = true;
            return;
        }
        C5265hy1 c5265hy1 = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c5265hy1.b > 0) {
            C5265hy1 c5265hy12 = this.a;
            if (jCurrentTimeMillis >= c5265hy12.b) {
                c5265hy12.c = jCurrentTimeMillis - c5265hy12.b;
            }
        }
        this.a.d = false;
    }
}
