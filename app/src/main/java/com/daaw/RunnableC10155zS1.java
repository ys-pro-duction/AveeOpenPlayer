package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: renamed from: com.daaw.zS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10155zS1 implements Runnable {
    public final /* synthetic */ LifecycleCallback B;
    public final /* synthetic */ String C;
    public final /* synthetic */ C9795y82 D;

    public RunnableC10155zS1(C9795y82 c9795y82, LifecycleCallback lifecycleCallback, String str) {
        this.D = c9795y82;
        this.B = lifecycleCallback;
        this.C = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C9795y82 c9795y82 = this.D;
        if (c9795y82.H0 > 0) {
            LifecycleCallback lifecycleCallback = this.B;
            if (c9795y82.I0 != null) {
                bundle = c9795y82.I0.getBundle(this.C);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.D.H0 >= 2) {
            this.B.j();
        }
        if (this.D.H0 >= 3) {
            this.B.h();
        }
        if (this.D.H0 >= 4) {
            this.B.k();
        }
        if (this.D.H0 >= 5) {
            this.B.g();
        }
    }
}
