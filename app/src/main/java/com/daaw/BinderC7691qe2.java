package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

/* JADX INFO: renamed from: com.daaw.qe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC7691qe2 extends zzdp {
    public final Object B = new Object();
    public final zzdq C;
    public final InterfaceC6219lM1 D;

    public BinderC7691qe2(zzdq zzdqVar, InterfaceC6219lM1 interfaceC6219lM1) {
        this.C = zzdqVar;
        this.D = interfaceC6219lM1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        InterfaceC6219lM1 interfaceC6219lM1 = this.D;
        if (interfaceC6219lM1 != null) {
            return interfaceC6219lM1.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        InterfaceC6219lM1 interfaceC6219lM1 = this.D;
        if (interfaceC6219lM1 != null) {
            return interfaceC6219lM1.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        synchronized (this.B) {
            try {
                zzdq zzdqVar = this.C;
                if (zzdqVar == null) {
                    return null;
                }
                return zzdqVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        synchronized (this.B) {
            try {
                zzdq zzdqVar = this.C;
                if (zzdqVar != null) {
                    zzdqVar.zzm(zzdtVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
