package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.google.android.gms.ads.MuteThisAdReason;

/* JADX INFO: loaded from: classes.dex */
public final class zzcx implements MuteThisAdReason {
    public final String a;
    public final zzcw b;

    public zzcx(zzcw zzcwVar) {
        String strZze;
        this.b = zzcwVar;
        try {
            strZze = zzcwVar.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("", e);
            strZze = null;
        }
        this.a = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    public final zzcw zza() {
        return this.b;
    }
}
