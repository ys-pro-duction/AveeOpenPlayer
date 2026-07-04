package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzfd extends zzdc {
    public final OnAdMetadataChangedListener B;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.B = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.B;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
