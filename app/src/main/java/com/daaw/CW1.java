package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;

/* JADX INFO: loaded from: classes3.dex */
public final class CW1 implements zzo {
    public final InterfaceC9334wW1 B;
    public final zzo C;

    public CW1(InterfaceC9334wW1 interfaceC9334wW1, zzo zzoVar) {
        this.B = interfaceC9334wW1;
        this.C = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzo zzoVar = this.C;
        if (zzoVar != null) {
            zzoVar.zzbu();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzo zzoVar = this.C;
        if (zzoVar != null) {
            zzoVar.zzbv();
        }
        this.B.zzX();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzo zzoVar = this.C;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        zzo zzoVar = this.C;
        if (zzoVar != null) {
            zzoVar.zzby(i);
        }
        this.B.S();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }
}
