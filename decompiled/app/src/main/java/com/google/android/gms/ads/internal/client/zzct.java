package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzct extends zzcr {
    public final MuteThisAdListener B;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.B = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        this.B.onAdMuted();
    }
}
