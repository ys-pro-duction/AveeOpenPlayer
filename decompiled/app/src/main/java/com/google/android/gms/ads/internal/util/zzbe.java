package com.google.android.gms.ads.internal.util;

import com.daaw.AbstractC8022rp0;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        return AbstractC8022rp0.a(this.zza, zzbeVar.zza) && this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc && this.zze == zzbeVar.zze && Double.compare(this.zzd, zzbeVar.zzd) == 0;
    }

    public final int hashCode() {
        return AbstractC8022rp0.b(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return AbstractC8022rp0.c(this).a("name", this.zza).a("minBound", Double.valueOf(this.zzc)).a("maxBound", Double.valueOf(this.zzb)).a("percent", Double.valueOf(this.zzd)).a("count", Integer.valueOf(this.zze)).toString();
    }
}
