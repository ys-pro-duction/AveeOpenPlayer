package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* JADX INFO: renamed from: com.daaw.qM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7614qM1 implements MediationAdLoadCallback {
    public final /* synthetic */ InterfaceC3689cM1 a;
    public final /* synthetic */ Adapter b;
    public final /* synthetic */ BinderC9573xM1 c;

    public C7614qM1(BinderC9573xM1 binderC9573xM1, InterfaceC3689cM1 interfaceC3689cM1, Adapter adapter) {
        this.c = binderC9573xM1;
        this.a = interfaceC3689cM1;
        this.b = adapter;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            AbstractC4274eT1.zze(this.b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
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
            this.c.J = (MediationInterscrollerAd) obj;
            this.a.zzo();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        return new C6777nM1(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
