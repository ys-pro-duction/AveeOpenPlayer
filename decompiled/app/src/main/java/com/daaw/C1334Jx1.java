package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Jx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1334Jx1 implements InterfaceC1541Lx1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;

    public C1334Jx1(C1645Mx1 c1645Mx1, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    @Override // com.daaw.InterfaceC1541Lx1
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
    }
}
