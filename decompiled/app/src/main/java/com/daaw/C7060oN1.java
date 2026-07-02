package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* JADX INFO: renamed from: com.daaw.oN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7060oN1 implements MediationAdLoadCallback {
    public final /* synthetic */ KM1 a;
    public final /* synthetic */ InterfaceC3689cM1 b;
    public final /* synthetic */ BinderC7896rN1 c;

    public C7060oN1(BinderC7896rN1 binderC7896rN1, KM1 km1, InterfaceC3689cM1 interfaceC3689cM1) {
        this.c = binderC7896rN1;
        this.a = km1;
        this.b = interfaceC3689cM1;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.a.zzf(adError.zza());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationAppOpenAd mediationAppOpenAd = (MediationAppOpenAd) obj;
        if (mediationAppOpenAd != null) {
            try {
                this.c.E = mediationAppOpenAd;
                this.a.zzg();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("", e);
            }
            return new C8175sN1(this.b);
        }
        AbstractC4274eT1.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.a.a("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
