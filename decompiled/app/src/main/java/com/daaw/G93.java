package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;

/* JADX INFO: loaded from: classes3.dex */
public final class G93 implements Runnable {
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ Oa3 C;

    public G93(Oa3 oa3, Bundle bundle) {
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
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC7506py0.f(string);
        AbstractC7506py0.f(string2);
        AbstractC7506py0.l(bundle.get("value"));
        if (!oa3.a.k()) {
            oa3.a.w().s().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlk zzlkVar = new zzlk(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzau zzauVarY0 = oa3.a.N().y0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            oa3.a.L().o(new zzac(bundle.getString("app_id"), string2, zzlkVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), oa3.a.N().y0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzauVarY0, bundle.getLong("time_to_live"), oa3.a.N().y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
