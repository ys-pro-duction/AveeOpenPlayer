package com.daaw;

import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

/* JADX INFO: loaded from: classes3.dex */
public final class WZ1 implements zzg {
    public final HY1 a;
    public C8948v62 b;
    public zzae c;

    public /* synthetic */ WZ1(HY1 hy1, VZ1 vz1) {
        this.a = hy1;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zza(C8948v62 c8948v62) {
        this.b = c8948v62;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zzb(zzae zzaeVar) {
        this.c = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzh zzc() {
        AbstractC7000o83.c(this.b, C8948v62.class);
        AbstractC7000o83.c(this.c, zzae.class);
        return new YZ1(this.a, this.c, new X42(), new C2966Zj2(), this.b, null, null, null);
    }
}
