package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes3.dex */
public final class YA1 extends zzc {
    public YA1(Context context, Looper looper, AbstractC8245se.a aVar, AbstractC8245se.b bVar) {
        super(TP1.a(context), looper, 123, aVar, bVar, null);
    }

    public final boolean J() {
        return ((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue() && AbstractC3470bb.b(getAvailableFeatures(), zzg.zza);
    }

    public final C3088aB1 K() {
        return (C3088aB1) super.getService();
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof C3088aB1 ? (C3088aB1) iInterfaceQueryLocalInterface : new C3088aB1(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final Feature[] getApiFeatures() {
        return zzg.zzb;
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
