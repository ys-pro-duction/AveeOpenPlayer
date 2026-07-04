package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfe;

/* JADX INFO: renamed from: com.daaw.xA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9525xA1 extends AppOpenAd {
    public final BA1 a;
    public final String b;
    public final BinderC9804yA1 c = new BinderC9804yA1();
    public FullScreenContentCallback d;
    public OnPaidEventListener e;

    public C9525xA1(BA1 ba1, String str) {
        this.a = ba1;
        this.b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzf;
        try {
            zzdnVarZzf = this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            zzdnVarZzf = null;
        }
        return ResponseInfo.zzb(zzdnVarZzf);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.d = fullScreenContentCallback;
        this.c.Z2(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.a.R2(z);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.e = onPaidEventListener;
        try {
            this.a.S0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.a.l2(BinderC7744qp0.Z2(activity), this.c);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }
}
