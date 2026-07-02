package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.daaw.AbstractC8245se;

/* JADX INFO: renamed from: com.daaw.hP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5105hP1 extends AbstractC8245se {
    /* JADX WARN: Illegal instructions before constructor call */
    public C5105hP1(Context context, Looper looper, AbstractC8245se.a aVar, AbstractC8245se.b bVar) {
        Context applicationContext = context.getApplicationContext();
        super(applicationContext != null ? applicationContext : context, looper, 8, aVar, bVar, null);
    }

    public final InterfaceC7904rP1 J() {
        return (InterfaceC7904rP1) super.getService();
    }

    @Override // com.daaw.AbstractC8245se
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7904rP1 ? (InterfaceC7904rP1) iInterfaceQueryLocalInterface : new C7347pP1(iBinder);
    }

    @Override // com.daaw.AbstractC8245se
    public final String k() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // com.daaw.AbstractC8245se
    public final String l() {
        return "com.google.android.gms.ads.service.ADS";
    }
}
