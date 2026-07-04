package com.daaw;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: renamed from: com.daaw.Dm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0666Dm1 implements Runnable {
    public final /* synthetic */ LifecycleCallback B;
    public final /* synthetic */ String C;
    public final /* synthetic */ WC1 D;

    public RunnableC0666Dm1(WC1 wc1, LifecycleCallback lifecycleCallback, String str) {
        this.D = wc1;
        this.B = lifecycleCallback;
        this.C = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        WC1 wc1 = this.D;
        if (wc1.C > 0) {
            LifecycleCallback lifecycleCallback = this.B;
            if (wc1.D != null) {
                bundle = wc1.D.getBundle(this.C);
            } else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
        if (this.D.C >= 2) {
            this.B.j();
        }
        if (this.D.C >= 3) {
            this.B.h();
        }
        if (this.D.C >= 4) {
            this.B.k();
        }
        if (this.D.C >= 5) {
            this.B.g();
        }
    }
}
