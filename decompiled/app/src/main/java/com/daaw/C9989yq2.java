package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.yq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9989yq2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C3831cr2 B;

    public C9989yq2(C3831cr2 c3831cr2) {
        this.B = c3831cr2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.B.l(new C5210hm2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.B.l(new C2262Sp2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.B.l(new C4941go2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.B.l(new C7736qn2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        MR1 mr1 = new MR1();
        this.B.l(new C7188op2(this, activity, mr1));
        Bundle bundleG = mr1.G(50L);
        if (bundleG != null) {
            bundle.putAll(bundleG);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.B.l(new C1499Lm2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.B.l(new C1403Ko2(this, activity));
    }
}
