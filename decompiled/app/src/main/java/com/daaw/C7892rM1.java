package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: renamed from: com.daaw.rM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7892rM1 implements InitializationCompleteCallback {
    public final /* synthetic */ VJ1 a;

    public C7892rM1(BinderC9573xM1 binderC9573xM1, VJ1 vj1) {
        this.a = vj1;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
