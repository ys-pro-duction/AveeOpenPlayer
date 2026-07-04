package com.daaw;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class CK2 {
    public final InterfaceC10124zK2 a;

    public CK2(InterfaceC10124zK2 interfaceC10124zK2) {
        AbstractC7506py0.l(interfaceC10124zK2);
        this.a = interfaceC10124zK2;
    }

    public final void a(Context context, Intent intent) {
        C9327wU2 c9327wU2H = C9327wU2.H(context, null, null);
        C6675mz2 c6675mz2W = c9327wU2H.w();
        if (intent == null) {
            c6675mz2W.t().a("Receiver called with null intent");
            return;
        }
        c9327wU2H.a();
        String action = intent.getAction();
        c6675mz2W.s().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c6675mz2W.t().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c6675mz2W.s().a("Starting wakeful intent.");
            this.a.a(context, className);
        }
    }
}
