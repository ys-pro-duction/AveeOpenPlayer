package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;

/* JADX INFO: renamed from: com.daaw.Tg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2330Tg2 implements zza, LH1, zzo, TH1, zzz {
    public zza B;
    public LH1 C;
    public zzo D;
    public TH1 E;
    public zzz F;

    @Override // com.daaw.TH1
    public final synchronized void a(String str, String str2) {
        TH1 th1 = this.E;
        if (th1 != null) {
            th1.a(str, str2);
        }
    }

    public final synchronized void d(zza zzaVar, LH1 lh1, zzo zzoVar, TH1 th1, zzz zzzVar) {
        this.B = zzaVar;
        this.C = lh1;
        this.D = zzoVar;
        this.E = th1;
        this.F = zzzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.B;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.daaw.LH1
    public final synchronized void t(String str, Bundle bundle) {
        LH1 lh1 = this.C;
        if (lh1 != null) {
            lh1.t(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbL() {
        zzo zzoVar = this.D;
        if (zzoVar != null) {
            zzoVar.zzbL();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        zzo zzoVar = this.D;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbu() {
        zzo zzoVar = this.D;
        if (zzoVar != null) {
            zzoVar.zzbu();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        zzo zzoVar = this.D;
        if (zzoVar != null) {
            zzoVar.zzbv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbx() {
        zzo zzoVar = this.D;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby(int i) {
        zzo zzoVar = this.D;
        if (zzoVar != null) {
            zzoVar.zzby(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.F;
        if (zzzVar != null) {
            zzzVar.zzg();
        }
    }
}
