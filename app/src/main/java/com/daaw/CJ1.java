package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.google.android.gms.ads.internal.zzc;

/* JADX INFO: loaded from: classes3.dex */
public final class CJ1 extends zzc {
    public CJ1(Context context, Looper looper, AbstractC8245se.a aVar, AbstractC8245se.b bVar) {
        super(TP1.a(context), looper, 166, aVar, bVar, null);
    }

    public final HJ1 J() {
        return (HJ1) super.getService();
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof HJ1 ? (HJ1) iInterfaceQueryLocalInterface : new HJ1(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
