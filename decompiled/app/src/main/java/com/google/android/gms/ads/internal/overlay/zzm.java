package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.daaw.AbstractC7494pv0;
import com.daaw.InterfaceC1974Qb2;
import com.google.android.gms.ads.AdActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zzm {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzk != 4 || adOverlayInfoParcel.zzc != null) {
            Intent intent = new Intent();
            intent.setClassName(context, AdActivity.CLASS_NAME);
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.E);
            intent.putExtra("shouldCallOnOverlayOpened", z);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!AbstractC7494pv0.f()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzS(context, intent);
            return;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
        InterfaceC1974Qb2 interfaceC1974Qb2 = adOverlayInfoParcel.zzu;
        if (interfaceC1974Qb2 != null) {
            interfaceC1974Qb2.i0();
        }
        Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj && activityZzi != null) {
            context = activityZzi;
        }
        com.google.android.gms.ads.internal.zzt.zzh();
        zzc zzcVar2 = adOverlayInfoParcel.zza;
        zza.zzb(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
    }
}
