package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: com.daaw.gm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4930gm1 extends AbstractC7640qT {
    public final E11 H;

    public C4930gm1(Context context, Looper looper, C2763Xl c2763Xl, E11 e11, InterfaceC0359Aq interfaceC0359Aq, InterfaceC5787jq0 interfaceC5787jq0) {
        super(context, looper, 270, c2763Xl, interfaceC0359Aq, interfaceC5787jq0);
        this.H = e11;
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C2245Sl1 ? (C2245Sl1) iInterfaceQueryLocalInterface : new C2245Sl1(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final Feature[] getApiFeatures() {
        return AbstractC1182Il1.b;
    }

    @Override // com.daaw.AbstractC8245se
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.daaw.AbstractC8245se
    public final Bundle h() {
        return this.H.b();
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.daaw.AbstractC8245se
    public final boolean n() {
        return true;
    }
}
