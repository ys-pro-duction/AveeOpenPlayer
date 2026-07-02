package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.Qu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2072Qu2 extends zzbt {
    public final Context B;
    public final zzbh C;
    public final FF2 D;
    public final V22 E;
    public final ViewGroup F;
    public final C1071Hj2 G;

    public BinderC2072Qu2(Context context, zzbh zzbhVar, FF2 ff2, V22 v22, C1071Hj2 c1071Hj2) {
        this.B = context;
        this.C = zzbhVar;
        this.D = ff2;
        this.E = v22;
        this.G = c1071Hj2;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewI = v22.i();
        zzt.zzp();
        frameLayout.addView(viewI, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.F = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        this.E.m();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        this.E.d().D0(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        AbstractC4274eT1.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        AbstractC4274eT1.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        AbstractC4274eT1.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
        AbstractC7506py0.e("setAdSize must be called on the main UI thread.");
        V22 v22 = this.E;
        if (v22 != null) {
            v22.n(this.F, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        C8611tv2 c8611tv2 = this.D.c;
        if (c8611tv2 != null) {
            c8611tv2.A(zzcbVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
        AbstractC4274eT1.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(InterfaceC3383bF1 interfaceC3383bF1) {
        AbstractC4274eT1.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.Ca)).booleanValue()) {
            AbstractC4274eT1.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        C8611tv2 c8611tv2 = this.D.c;
        if (c8611tv2 != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.G.e();
                }
            } catch (RemoteException e) {
                AbstractC4274eT1.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            c8611tv2.r(zzdgVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
        AbstractC4274eT1.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzlVar) {
        AbstractC4274eT1.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) {
        AbstractC4274eT1.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        AbstractC4274eT1.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        AbstractC7506py0.e("getAdSize must be called on the main UI thread.");
        return JF2.a(this.B, Collections.singletonList(this.E.k()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.C;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.D.n;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return this.E.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return this.E.j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final InterfaceC7934rX zzn() {
        return BinderC7744qp0.Z2(this.F);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        return this.D.f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        if (this.E.c() != null) {
            return this.E.c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        if (this.E.c() != null) {
            return this.E.c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        this.E.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        this.E.d().C0(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(EA1 ea1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(InterfaceC9860yO1 interfaceC9860yO1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(InterfaceC5109hQ1 interfaceC5109hQ1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(InterfaceC7934rX interfaceC7934rX) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(BO1 bo1, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
    }
}
