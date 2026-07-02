package com.daaw;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: com.daaw.Bx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0493Bx1 implements InterfaceC1541Lx1 {
    public final /* synthetic */ Activity a;

    public C0493Bx1(C1645Mx1 c1645Mx1, Activity activity) {
        this.a = activity;
    }

    @Override // com.daaw.InterfaceC1541Lx1
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
