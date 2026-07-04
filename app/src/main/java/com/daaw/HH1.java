package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class HH1 extends AbstractBinderC4794gH1 {
    public final OnAdManagerAdViewLoadedListener B;

    public HH1(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.B = onAdManagerAdViewLoadedListener;
    }

    @Override // com.daaw.InterfaceC5073hH1
    public final void L0(zzbu zzbuVar, InterfaceC7934rX interfaceC7934rX) {
        if (zzbuVar == null || interfaceC7934rX == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) BinderC7744qp0.I(interfaceC7934rX));
        try {
            if (zzbuVar.zzi() instanceof zzg) {
                zzg zzgVar = (zzg) zzbuVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
        try {
            if (zzbuVar.zzj() instanceof BinderC2195Rz1) {
                BinderC2195Rz1 binderC2195Rz1 = (BinderC2195Rz1) zzbuVar.zzj();
                adManagerAdView.setAppEventListener(binderC2195Rz1 != null ? binderC2195Rz1.Z2() : null);
            }
        } catch (RemoteException e2) {
            AbstractC4274eT1.zzh("", e2);
        }
        XS1.b.post(new GH1(this, adManagerAdView, zzbuVar));
    }
}
