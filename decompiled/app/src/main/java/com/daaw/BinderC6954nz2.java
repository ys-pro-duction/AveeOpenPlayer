package com.daaw;

import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzes;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: renamed from: com.daaw.nz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6954nz2 extends zzbm {
    public final /* synthetic */ zzeu B;

    public /* synthetic */ BinderC6954nz2(zzeu zzeuVar, zzes zzesVar) {
        this.B = zzeuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i) {
        AbstractC4274eT1.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        XS1.b.post(new RunnableC4419ey2(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        return false;
    }
}
