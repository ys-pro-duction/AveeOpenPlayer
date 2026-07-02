package com.daaw;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.hm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5210hm2 extends AbstractRunnableC9680xk2 {
    public final /* synthetic */ Bundle F;
    public final /* synthetic */ Activity G;
    public final /* synthetic */ C9989yq2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5210hm2(C9989yq2 c9989yq2, Bundle bundle, Activity activity) {
        super(c9989yq2.B, true);
        this.H = c9989yq2;
        this.F = bundle;
        this.G = activity;
    }

    @Override // com.daaw.AbstractRunnableC9680xk2
    public final void a() {
        Bundle bundle;
        if (this.F != null) {
            bundle = new Bundle();
            if (this.F.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.F.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((ST1) AbstractC7506py0.l(this.H.B.i)).onActivityCreated(BinderC7744qp0.Z2(this.G), bundle, this.C);
    }
}
