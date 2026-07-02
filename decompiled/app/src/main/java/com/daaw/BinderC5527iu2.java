package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbwi;

/* JADX INFO: renamed from: com.daaw.iu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class BinderC5527iu2 extends AbstractBinderC3411bM1 {
    public final P62 B;
    public final C1766Ob2 C;
    public final C6715n72 D;
    public final C72 E;
    public final H72 F;
    public final C3746ca2 G;
    public final C4757g82 H;
    public final C4881gc2 I;
    public final Y92 J;
    public final C4184e72 K;

    public BinderC5527iu2(P62 p62, C1766Ob2 c1766Ob2, C6715n72 c6715n72, C72 c72, H72 h72, C3746ca2 c3746ca2, C4757g82 c4757g82, C4881gc2 c4881gc2, Y92 y92, C4184e72 c4184e72) {
        this.B = p62;
        this.C = c1766Ob2;
        this.D = c6715n72;
        this.E = c72;
        this.F = h72;
        this.G = c3746ca2;
        this.H = c4757g82;
        this.I = c4881gc2;
        this.J = y92;
        this.K = c4184e72;
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void P1(int i) {
        n1(new zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void X1(String str, String str2) {
        this.G.a(str, str2);
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void d() {
        this.I.zzb();
    }

    public void i() {
        this.I.B0();
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void n1(zze zzeVar) {
        this.K.d(AbstractC5908kG2.c(8, zzeVar));
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void p(String str) {
        n1(new zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zze() {
        this.B.onAdClicked();
        this.C.i0();
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzf() {
        this.H.zzby(4);
    }

    public void zzm() {
        this.D.zza();
        this.J.zzb();
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzn() {
        this.E.zzb();
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzo() {
        this.F.zzr();
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzp() {
        this.H.zzbv();
        this.J.zza();
    }

    public void zzv() {
        this.I.zza();
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void zzx() {
        this.I.zzc();
    }

    public void zzu() {
    }

    public void B0(InterfaceC7351pQ1 interfaceC7351pQ1) {
    }

    public void B1(zzbwi zzbwiVar) {
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void b(int i) {
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void l0(zze zzeVar) {
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void R0(QG1 qg1, String str) {
    }

    @Override // com.daaw.InterfaceC3689cM1
    public final void d0(int i, String str) {
    }
}
