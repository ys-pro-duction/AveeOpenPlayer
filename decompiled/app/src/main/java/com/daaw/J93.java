package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzlk;

/* JADX INFO: loaded from: classes3.dex */
public final class J93 implements Runnable {
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ Oa3 C;

    public J93(Oa3 oa3, Bundle bundle) {
        this.C = oa3;
        this.B = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Oa3 oa3 = this.C;
        Bundle bundle = this.B;
        oa3.d();
        oa3.e();
        AbstractC7506py0.l(bundle);
        String strF = AbstractC7506py0.f(bundle.getString("name"));
        if (!oa3.a.k()) {
            oa3.a.w().s().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            oa3.a.L().o(new zzac(bundle.getString("app_id"), "", new zzlk(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), oa3.a.N().y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
