package com.daaw;

import com.google.android.gms.internal.ads.zzbwi;

/* JADX INFO: renamed from: com.daaw.wh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9386wh2 implements XI1 {
    public final C72 B;
    public final zzbwi C;
    public final String D;
    public final String E;

    public C9386wh2(C72 c72, C4498fF2 c4498fF2) {
        this.B = c72;
        this.C = c4498fF2.n;
        this.D = c4498fF2.l;
        this.E = c4498fF2.m;
    }

    @Override // com.daaw.XI1
    public final void k0(zzbwi zzbwiVar) {
        int i;
        String str;
        zzbwi zzbwiVar2 = this.C;
        if (zzbwiVar2 != null) {
            zzbwiVar = zzbwiVar2;
        }
        if (zzbwiVar != null) {
            str = zzbwiVar.B;
            i = zzbwiVar.C;
        } else {
            i = 1;
            str = "";
        }
        this.B.B0(new SP1(str, i), this.D, this.E);
    }

    @Override // com.daaw.XI1
    public final void zzb() {
        this.B.zze();
    }

    @Override // com.daaw.XI1
    public final void zzc() {
        this.B.zzf();
    }
}
