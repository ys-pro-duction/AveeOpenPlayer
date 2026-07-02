package com.daaw;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: renamed from: com.daaw.Jz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1342Jz1 implements InterfaceC1965Pz1 {
    public final /* synthetic */ Activity a;

    public C1342Jz1(C2091Qz1 c2091Qz1, Activity activity) {
        this.a = activity;
    }

    @Override // com.daaw.InterfaceC1965Pz1
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.a);
    }
}
