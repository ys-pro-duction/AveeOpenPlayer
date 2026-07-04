package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.daaw.AbstractC4274eT1;
import com.daaw.InterfaceC7934rX;
import com.daaw.SL1;
import com.daaw.XS1;
import com.daaw.YJ1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzey extends zzcn {
    public YJ1 B;

    public final /* synthetic */ void zzb() {
        YJ1 yj1 = this.B;
        if (yj1 != null) {
            try {
                yj1.W1(Collections.EMPTY_LIST);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        AbstractC4274eT1.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        XS1.b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(YJ1 yj1) {
        this.B = yj1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(SL1 sl1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, InterfaceC7934rX interfaceC7934rX) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(InterfaceC7934rX interfaceC7934rX, String str) {
    }
}
