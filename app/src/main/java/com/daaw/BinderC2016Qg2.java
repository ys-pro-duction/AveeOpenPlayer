package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2016Qg2 extends AbstractBinderC9274wH1 {
    public final String B;
    public final C6575me2 C;
    public final C7969re2 D;
    public final C1071Hj2 E;

    public BinderC2016Qg2(String str, C6575me2 c6575me2, C7969re2 c7969re2, C1071Hj2 c1071Hj2) {
        this.B = str;
        this.C = c6575me2;
        this.D = c7969re2;
        this.E = c1071Hj2;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void A1(zzcs zzcsVar) {
        this.C.t(zzcsVar);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void D() {
        this.C.s();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void E0(zzdg zzdgVar) {
        try {
            if (!zzdgVar.zzf()) {
                this.E.e();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.C.u(zzdgVar);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final boolean R1(Bundle bundle) {
        return this.C.D(bundle);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void S2(Bundle bundle) {
        this.C.l(bundle);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void T0(Bundle bundle) {
        this.C.q(bundle);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void d() {
        this.C.X();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final boolean j() {
        return this.C.A();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void q0(zzcw zzcwVar) {
        this.C.h(zzcwVar);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void x2(InterfaceC8709uH1 interfaceC8709uH1) {
        this.C.v(interfaceC8709uH1);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void zzA() {
        this.C.m();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final boolean zzH() {
        return (this.D.h().isEmpty() || this.D.X() == null) ? false : true;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final double zze() {
        return this.D.A();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final Bundle zzf() {
        return this.D.Q();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final zzdn zzg() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J6)).booleanValue()) {
            return this.C.c();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final zzdq zzh() {
        return this.D.W();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC5907kG1 zzi() {
        return this.D.Y();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC7311pG1 zzj() {
        return this.C.M().a();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC8147sG1 zzk() {
        return this.D.a0();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC7934rX zzl() {
        return this.D.i0();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final InterfaceC7934rX zzm() {
        return BinderC7744qp0.Z2(this.C);
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzn() {
        return this.D.k0();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzo() {
        return this.D.l0();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzp() {
        return this.D.m0();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzq() {
        return this.D.b();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzr() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzs() {
        return this.D.d();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final String zzt() {
        return this.D.e();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final List zzu() {
        return this.D.g();
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final List zzv() {
        return zzH() ? this.D.h() : Collections.EMPTY_LIST;
    }

    @Override // com.daaw.InterfaceC9553xH1
    public final void zzx() {
        this.C.a();
    }
}
