package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.daaw.AbstractBinderC5380iO1;
import com.daaw.AbstractC9820yE1;
import com.daaw.InterfaceC1974Qb2;
import com.daaw.InterfaceC7934rX;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class zzy extends AbstractBinderC5380iO1 {
    public final AdOverlayInfoParcel B;
    public final Activity C;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.B = adOverlayInfoParcel;
        this.C = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.E) {
                return;
            }
            zzo zzoVar = this.B.zzc;
            if (zzoVar != null) {
                zzoVar.zzby(4);
            }
            this.E = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final boolean zzH() {
        return false;
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzh(int i, int i2, Intent intent) {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzi() {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzl(Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.D8)).booleanValue() && !this.F) {
            this.C.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.B;
        if (adOverlayInfoParcel == null) {
            this.C.finish();
            return;
        }
        if (z) {
            this.C.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            InterfaceC1974Qb2 interfaceC1974Qb2 = this.B.zzu;
            if (interfaceC1974Qb2 != null) {
                interfaceC1974Qb2.i0();
            }
            if (this.C.getIntent() != null && this.C.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.B.zzc) != null) {
                zzoVar.zzbv();
            }
        }
        Activity activity = this.C;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.B;
        com.google.android.gms.ads.internal.zzt.zzh();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            return;
        }
        this.C.finish();
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzm() {
        if (this.C.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzo() {
        zzo zzoVar = this.B.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
        if (this.C.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzp(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzq() {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzr() {
        if (this.D) {
            this.C.finish();
            return;
        }
        this.D = true;
        zzo zzoVar = this.B.zzc;
        if (zzoVar != null) {
            zzoVar.zzbL();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.D);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzt() {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzu() {
        if (this.C.isFinishing()) {
            zzb();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzv() {
        zzo zzoVar = this.B.zzc;
        if (zzoVar != null) {
            zzoVar.zzbx();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzx() {
        this.F = true;
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzk(InterfaceC7934rX interfaceC7934rX) {
    }
}
