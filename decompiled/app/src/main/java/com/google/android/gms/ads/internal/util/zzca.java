package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.daaw.C5680jT1;

/* JADX INFO: loaded from: classes.dex */
public final class zzca extends zzb {
    public final C5680jT1 c;
    public final String d;

    public zzca(Context context, String str, String str2) {
        this.c = new C5680jT1(com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
        this.d = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.c.zza(this.d);
    }
}
