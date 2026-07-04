package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1475Lg2 extends MG1 {
    public final String B;
    public final C6575me2 C;
    public final C7969re2 D;

    public BinderC1475Lg2(String str, C6575me2 c6575me2, C7969re2 c7969re2) {
        this.B = str;
        this.C = c6575me2;
        this.D = c7969re2;
    }

    @Override // com.daaw.NG1
    public final void q(Bundle bundle) {
        this.C.q(bundle);
    }

    @Override // com.daaw.NG1
    public final boolean u(Bundle bundle) {
        return this.C.D(bundle);
    }

    @Override // com.daaw.NG1
    public final void w0(Bundle bundle) {
        this.C.l(bundle);
    }

    @Override // com.daaw.NG1
    public final Bundle zzb() {
        return this.D.Q();
    }

    @Override // com.daaw.NG1
    public final zzdq zzc() {
        return this.D.W();
    }

    @Override // com.daaw.NG1
    public final InterfaceC5907kG1 zzd() {
        return this.D.Y();
    }

    @Override // com.daaw.NG1
    public final InterfaceC8147sG1 zze() {
        return this.D.b0();
    }

    @Override // com.daaw.NG1
    public final InterfaceC7934rX zzf() {
        return this.D.i0();
    }

    @Override // com.daaw.NG1
    public final InterfaceC7934rX zzg() {
        return BinderC7744qp0.Z2(this.C);
    }

    @Override // com.daaw.NG1
    public final String zzh() {
        return this.D.k0();
    }

    @Override // com.daaw.NG1
    public final String zzi() {
        return this.D.l0();
    }

    @Override // com.daaw.NG1
    public final String zzj() {
        return this.D.m0();
    }

    @Override // com.daaw.NG1
    public final String zzk() {
        return this.D.b();
    }

    @Override // com.daaw.NG1
    public final String zzl() {
        return this.B;
    }

    @Override // com.daaw.NG1
    public final List zzm() {
        return this.D.g();
    }

    @Override // com.daaw.NG1
    public final void zzn() {
        this.C.a();
    }
}
