package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC8245se;

/* JADX INFO: renamed from: com.daaw.Uw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2498Uw2 extends AbstractC8245se {
    public C2498Uw2(Context context, Looper looper, AbstractC8245se.a aVar, AbstractC8245se.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9167vt2 ? (InterfaceC9167vt2) iInterfaceQueryLocalInterface : new C6645ms2(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.measurement.START";
    }
}
