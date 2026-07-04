package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;

/* JADX INFO: renamed from: com.daaw.xv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9734xv2 implements zza, InterfaceC1974Qb2 {
    public zzbe B;

    public final synchronized void a(zzbe zzbeVar) {
        this.B = zzbeVar;
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final synchronized void i0() {
        zzbe zzbeVar = this.B;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbe zzbeVar = this.B;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.daaw.InterfaceC1974Qb2
    public final synchronized void zzs() {
    }
}
