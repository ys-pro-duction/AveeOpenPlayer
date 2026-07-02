package com.daaw;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: renamed from: com.daaw.mG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6474mG1 implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    public final QG1 a;

    public C6474mG1(QG1 qg1) {
        this.a = qg1;
        try {
            qg1.zzm();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.a.a0(BinderC7744qp0.Z2(view));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.a.zzt();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            return false;
        }
    }
}
