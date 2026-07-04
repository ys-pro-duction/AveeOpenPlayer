package com.daaw;

import com.google.android.gms.ads.internal.client.zza;

/* JADX INFO: renamed from: com.daaw.p52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7263p52 implements zza {
    public final C9501x52 B;
    public final FF2 C;

    public C7263p52(C9501x52 c9501x52, FF2 ff2) {
        this.B = c9501x52;
        this.C = ff2;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.B.c(this.C.f);
    }
}
