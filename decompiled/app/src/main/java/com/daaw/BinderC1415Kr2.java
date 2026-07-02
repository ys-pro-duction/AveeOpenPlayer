package com.daaw;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzej;

/* JADX INFO: renamed from: com.daaw.Kr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1415Kr2 extends zzcz {
    public /* synthetic */ BinderC1415Kr2(zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener = zzej.zzf().g;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}
