package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* JADX INFO: renamed from: com.daaw.pN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7339pN1 implements SignalCallbacks {
    public final /* synthetic */ InterfaceC3693cN1 a;

    public C7339pN1(BinderC7896rN1 binderC7896rN1, InterfaceC3693cN1 interfaceC3693cN1) {
        this.a = interfaceC3693cN1;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.a.T(adError.zza());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.a.e(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
