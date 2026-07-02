package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;

/* JADX INFO: loaded from: classes3.dex */
public final class WE1 extends XE1 {
    public final zzf B;
    public final String C;
    public final String D;

    public WE1(zzf zzfVar, String str, String str2) {
        this.B = zzfVar;
        this.C = str;
        this.D = str2;
    }

    @Override // com.daaw.YE1
    public final String zzb() {
        return this.C;
    }

    @Override // com.daaw.YE1
    public final String zzc() {
        return this.D;
    }

    @Override // com.daaw.YE1
    public final void zzd(InterfaceC7934rX interfaceC7934rX) {
        if (interfaceC7934rX == null) {
            return;
        }
        this.B.zza((View) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.YE1
    public final void zze() {
        this.B.zzb();
    }

    @Override // com.daaw.YE1
    public final void zzf() {
        this.B.zzc();
    }
}
