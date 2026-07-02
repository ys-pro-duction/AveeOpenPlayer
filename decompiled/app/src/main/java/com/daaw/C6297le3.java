package com.daaw;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.le3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6297le3 {
    public final /* synthetic */ C7134oe3 a;

    public C6297le3(C7134oe3 c7134oe3) {
        this.a = c7134oe3;
    }

    public final void a() {
        this.a.d();
        if (this.a.a.F().s(this.a.a.p().a())) {
            this.a.a.F().l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.a.w().s().a("Detected application was in foreground");
                c(this.a.a.p().a(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        this.a.d();
        this.a.r();
        if (this.a.a.F().s(j)) {
            this.a.a.F().l.a(true);
            C6054kn3.b();
            if (this.a.a.z().B(null, AbstractC1311Jr2.p0)) {
                this.a.a.B().s();
            }
        }
        this.a.a.F().o.b(j);
        if (this.a.a.F().l.b()) {
            c(j, z);
        }
    }

    public final void c(long j, boolean z) {
        this.a.d();
        if (this.a.a.k()) {
            this.a.a.F().o.b(j);
            this.a.a.w().s().b("Session started, time", Long.valueOf(this.a.a.p().b()));
            long j2 = j / 1000;
            this.a.a.I().M("auto", "_sid", Long.valueOf(j2), j);
            this.a.a.F().p.b(j2);
            this.a.a.F().l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            if (this.a.a.z().B(null, AbstractC1311Jr2.d0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.a.I().s("auto", "_s", j, bundle);
            C7443pk3.b();
            if (this.a.a.z().B(null, AbstractC1311Jr2.g0)) {
                String strA = this.a.a.F().u.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.a.a.I().s("auto", "_ssr", j, bundle2);
            }
        }
    }
}
