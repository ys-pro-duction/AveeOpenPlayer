package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;

/* JADX INFO: renamed from: com.daaw.Az1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0397Az1 extends zzcz {
    public final /* synthetic */ Context B;
    public final /* synthetic */ zzay C;

    public BinderC0397Az1(zzay zzayVar, Context context) {
        this.C = zzayVar;
        this.B = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.C.a(this.B, zzeVar.zzb, true, true);
    }
}
