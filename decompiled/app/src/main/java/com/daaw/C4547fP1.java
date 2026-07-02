package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC8245se;
import com.google.android.gms.ads.internal.zzc;

/* JADX INFO: renamed from: com.daaw.fP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4547fP1 extends zzc {
    public C4547fP1(Context context, Looper looper, AbstractC8245se.a aVar, AbstractC8245se.b bVar) {
        super(TP1.a(context), looper, 8, aVar, bVar, null);
    }

    public final InterfaceC6789nP1 J() {
        return (InterfaceC6789nP1) super.getService();
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6789nP1 ? (InterfaceC6789nP1) iInterfaceQueryLocalInterface : new C6231lP1(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.ads.service.START";
    }
}
