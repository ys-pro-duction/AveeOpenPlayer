package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.internal.ads.zzbrn;

/* JADX INFO: renamed from: com.daaw.uN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8733uN1 implements zzo {
    public final /* synthetic */ zzbrn B;

    public C8733uN1(zzbrn zzbrnVar) {
        this.B = zzbrnVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        AbstractC4274eT1.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        AbstractC4274eT1.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        AbstractC4274eT1.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        AbstractC4274eT1.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrn zzbrnVar = this.B;
        zzbrnVar.b.onAdOpened(zzbrnVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        AbstractC4274eT1.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrn zzbrnVar = this.B;
        zzbrnVar.b.onAdClosed(zzbrnVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
