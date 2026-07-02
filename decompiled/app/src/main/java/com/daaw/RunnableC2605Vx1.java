package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: renamed from: com.daaw.Vx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2605Vx1 implements Runnable {
    public final /* synthetic */ int B;
    public final /* synthetic */ C2813Xx1 C;

    public RunnableC2605Vx1(C2813Xx1 c2813Xx1, int i, boolean z) {
        this.C = c2813Xx1;
        this.B = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3013Zv1 c3013Zv1A;
        int i = this.B;
        C2813Xx1 c2813Xx1 = this.C;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = c2813Xx1.a.getPackageManager().getPackageInfo(c2813Xx1.a.getPackageName(), 0);
            Context context = c2813Xx1.a;
            c3013Zv1A = AbstractC3129aL2.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            c3013Zv1A = null;
        }
        this.C.j = c3013Zv1A;
        if (this.B < 4) {
            if (c3013Zv1A != null && c3013Zv1A.w0() && !c3013Zv1A.L0().equals("0000000000000000000000000000000000000000000000000000000000000000") && c3013Zv1A.x0() && c3013Zv1A.J0().P() && c3013Zv1A.J0().M() != -2) {
                return;
            }
            this.C.o(this.B + 1, true);
        }
    }
}
