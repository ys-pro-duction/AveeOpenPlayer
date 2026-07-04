package com.daaw;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.internal.client.zzej;

/* JADX INFO: renamed from: com.daaw.Bq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466Bq2 implements AdapterStatus {
    public C0466Bq2(zzej zzejVar) {
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return AdapterStatus.State.READY;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return 0;
    }
}
