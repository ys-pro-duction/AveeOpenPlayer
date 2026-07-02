package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* JADX INFO: renamed from: com.daaw.vM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9015vM1 implements MediationAdLoadCallback {
    public final /* synthetic */ InterfaceC3689cM1 a;
    public final /* synthetic */ BinderC9573xM1 b;

    public C9015vM1(BinderC9573xM1 binderC9573xM1, InterfaceC3689cM1 interfaceC3689cM1) {
        this.b = binderC9573xM1;
        this.a = interfaceC3689cM1;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            AbstractC4274eT1.zze(this.b.B.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            this.a.l0(adError.zza());
            this.a.d0(adError.getCode(), adError.getMessage());
            this.a.b(adError.getCode());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.b.I = (MediationRewardedAd) obj;
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        return new MQ1(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            AbstractC4274eT1.zze(this.b.B.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            this.a.d0(0, str);
            this.a.b(0);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }
}
