package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public final class D82 extends AbstractC7640qT {
    public D82(Context context, Looper looper, C2763Xl c2763Xl, InterfaceC0359Aq interfaceC0359Aq, InterfaceC5787jq0 interfaceC5787jq0) {
        super(context, looper, RCHTTPStatusCodes.UNSUCCESSFUL, c2763Xl, interfaceC0359Aq, interfaceC5787jq0);
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof CS2 ? (CS2) iInterfaceQueryLocalInterface : new CS2(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final Feature[] getApiFeatures() {
        return AbstractC2670Wn2.b;
    }

    @Override // com.daaw.AbstractC8245se
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.daaw.AbstractC8245se
    public final boolean n() {
        return true;
    }

    @Override // com.daaw.AbstractC8245se
    public final boolean usesClientTelemetry() {
        return true;
    }
}
