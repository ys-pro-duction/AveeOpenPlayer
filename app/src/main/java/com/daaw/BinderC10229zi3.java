package com.daaw;

import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.daaw.zi3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC10229zi3 extends AbstractBinderC3538bo2 {
    public final /* synthetic */ C7521q11 B;

    public BinderC10229zi3(Pk3 pk3, C7521q11 c7521q11) {
        this.B = c7521q11;
    }

    @Override // com.daaw.InterfaceC9538xD2
    public final void s1(Status status, zzc zzcVar) {
        AbstractC10038z11.a(status, zzcVar != null ? new C6552ma(zzcVar.zzb(), zzcVar.zza()) : null, this.B);
    }
}
