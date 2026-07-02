package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes3.dex */
public final class PN1 implements NativeCustomFormatAd.DisplayOpenMeasurement {
    public final QG1 a;

    public PN1(QG1 qg1) {
        this.a = qg1;
        try {
            qg1.zzm();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.a0(BinderC7744qp0.Z2(view));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzt();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }
}
