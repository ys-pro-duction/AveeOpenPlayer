package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Iz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1238Iz1 implements InterfaceC1965Pz1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;

    public C1238Iz1(C2091Qz1 c2091Qz1, Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    @Override // com.daaw.InterfaceC1965Pz1
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
    }
}
