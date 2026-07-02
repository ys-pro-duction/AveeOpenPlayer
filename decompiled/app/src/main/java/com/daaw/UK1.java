package com.daaw;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class UK1 implements FT1 {
    public final /* synthetic */ WK1 a;

    public UK1(WK1 wk1) {
        this.a = wk1;
    }

    @Override // com.daaw.FT1
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zze.zza("Releasing engine reference.");
        this.a.d.i();
    }
}
