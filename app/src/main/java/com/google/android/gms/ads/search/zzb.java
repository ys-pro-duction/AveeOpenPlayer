package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.mediation.NetworkExtras;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    public final zzdw a = new zzdw();
    public String b;

    public final zzb zzb(Class cls, Bundle bundle) {
        this.a.zzq(cls, bundle);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras) {
        this.a.zzu(networkExtras);
        return this;
    }

    public final zzb zzd(Class cls, Bundle bundle) {
        this.a.zzt(cls, bundle);
        return this;
    }

    public final zzb zze(String str) {
        this.b = str;
        return this;
    }
}
