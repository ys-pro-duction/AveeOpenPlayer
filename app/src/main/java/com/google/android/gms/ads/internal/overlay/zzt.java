package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends zzl {
    public zzt(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzl, com.daaw.InterfaceC5660jO1
    public final void zzl(Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.V = 4;
        this.B.finish();
    }
}
