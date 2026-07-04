package com.daaw;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: renamed from: com.daaw.So2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2258So2 implements InterfaceC6244lS2 {
    public final /* synthetic */ InterfaceC8741uP1 a;

    public C2258So2(BinderC2362To2 binderC2362To2, InterfaceC8741uP1 interfaceC8741uP1) {
        this.a = interfaceC8741uP1;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.A((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Ad service can't call client", e);
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        try {
            this.a.v(zzbb.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Ad service can't call client", e);
        }
    }
}
