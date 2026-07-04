package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;

/* JADX INFO: loaded from: classes3.dex */
public final class Q22 extends AA1 {
    public final P22 B;
    public final zzbu C;
    public final CC2 D;
    public boolean E = ((Boolean) zzba.zzc().b(AbstractC9820yE1.F0)).booleanValue();
    public final C1071Hj2 F;

    public Q22(P22 p22, zzbu zzbuVar, CC2 cc2, C1071Hj2 c1071Hj2) {
        this.B = p22;
        this.C = zzbuVar;
        this.D = cc2;
        this.F = c1071Hj2;
    }

    @Override // com.daaw.BA1
    public final void R2(boolean z) {
        this.E = z;
    }

    @Override // com.daaw.BA1
    public final void S0(zzdg zzdgVar) {
        AbstractC7506py0.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.D != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.F.e();
                }
            } catch (RemoteException e) {
                AbstractC4274eT1.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.D.t(zzdgVar);
        }
    }

    @Override // com.daaw.BA1
    public final void l2(InterfaceC7934rX interfaceC7934rX, IA1 ia1) {
        try {
            this.D.G(ia1);
            this.B.j((Activity) BinderC7744qp0.I(interfaceC7934rX), ia1, this.E);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.BA1
    public final zzbu zze() {
        return this.C;
    }

    @Override // com.daaw.BA1
    public final zzdn zzf() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J6)).booleanValue()) {
            return this.B.c();
        }
        return null;
    }
}
