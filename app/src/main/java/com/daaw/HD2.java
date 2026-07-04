package com.daaw;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class HD2 implements WN2 {
    public final /* synthetic */ LD2 a;

    public HD2(LD2 ld2) {
        this.a = ld2;
    }

    @Override // com.daaw.WN2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AbstractC4274eT1.zzh("", (C4090dn2) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        LD2 ld2 = this.a;
        ld2.d = new KD2(null, ld2.e(), null);
        return this.a.d;
    }
}
