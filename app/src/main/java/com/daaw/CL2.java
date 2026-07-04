package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.google.android.gms.ads.internal.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class CL2 extends zzc {
    public final int E;

    public CL2(Context context, Looper looper, AbstractC8245se.a aVar, AbstractC8245se.b bVar, int i) {
        super(context, looper, 116, aVar, bVar, null);
        this.E = i;
    }

    public final IL2 J() {
        return (IL2) super.getService();
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof IL2 ? (IL2) iInterfaceQueryLocalInterface : new IL2(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final int getMinApkVersion() {
        return this.E;
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.gass.START";
    }
}
