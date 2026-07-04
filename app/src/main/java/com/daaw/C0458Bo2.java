package com.daaw;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: renamed from: com.daaw.Bo2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0458Bo2 implements InterfaceC6244lS2 {
    public final /* synthetic */ DP1 a;

    public C0458Bo2(BinderC0883Fo2 binderC0883Fo2, DP1 dp1) {
        this.a = dp1;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.A((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
        try {
            this.a.v(zzbb.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
