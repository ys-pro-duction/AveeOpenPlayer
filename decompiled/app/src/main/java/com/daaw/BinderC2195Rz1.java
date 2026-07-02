package com.daaw;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;

/* JADX INFO: renamed from: com.daaw.Rz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2195Rz1 extends zzca {
    public final AppEventListener B;

    public BinderC2195Rz1(AppEventListener appEventListener) {
        this.B = appEventListener;
    }

    public final AppEventListener Z2() {
        return this.B;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        this.B.onAppEvent(str, str2);
    }
}
