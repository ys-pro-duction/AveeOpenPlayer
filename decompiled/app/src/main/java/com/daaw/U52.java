package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes3.dex */
public final class U52 implements S82 {
    public final Context B;
    public final FF2 C;
    public final zzcaz D;
    public final zzg E;
    public final C2242Sk2 F;
    public final WI2 G;

    public U52(Context context, FF2 ff2, zzcaz zzcazVar, zzg zzgVar, C2242Sk2 c2242Sk2, WI2 wi2) {
        this.B = context;
        this.C = ff2;
        this.D = zzcazVar;
        this.E = zzgVar;
        this.F = c2242Sk2;
        this.G = wi2;
    }

    @Override // com.daaw.S82
    public final void v0(zzbvg zzbvgVar) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.N3)).booleanValue()) {
            zzg zzgVar = this.E;
            Context context = this.B;
            zzcaz zzcazVar = this.D;
            FF2 ff2 = this.C;
            WI2 wi2 = this.G;
            zzt.zza().zzc(context, zzcazVar, ff2.f, zzgVar.zzh(), wi2);
        }
        this.F.r();
    }

    @Override // com.daaw.S82
    public final void t0(C9267wF2 c9267wF2) {
    }
}
