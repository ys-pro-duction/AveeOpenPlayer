package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.Bv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0486Bv2 extends zzbt {
    public final zzq B;
    public final Context C;
    public final C3380bE2 D;
    public final String E;
    public final zzcaz F;
    public final C8611tv2 G;
    public final FE2 H;
    public final C7782qx1 I;
    public final C1071Hj2 J;
    public C5719jc2 K;
    public boolean L = ((Boolean) zzba.zzc().b(AbstractC9820yE1.C0)).booleanValue();

    public BinderC0486Bv2(Context context, zzq zzqVar, String str, C3380bE2 c3380bE2, C8611tv2 c8611tv2, FE2 fe2, zzcaz zzcazVar, C7782qx1 c7782qx1, C1071Hj2 c1071Hj2) {
        this.B = zzqVar;
        this.E = str;
        this.C = context;
        this.D = c3380bE2;
        this.G = c8611tv2;
        this.H = fe2;
        this.F = zzcazVar;
        this.I = c7782qx1;
        this.J = c1071Hj2;
    }

    public final synchronized boolean b3() {
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 != null) {
            if (!c5719jc2.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        AbstractC7506py0.e("resume must be called on the main UI thread.");
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 != null) {
            c5719jc2.d().D0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        AbstractC7506py0.e("setAdListener must be called on the main UI thread.");
        this.G.m(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        AbstractC7506py0.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        AbstractC7506py0.e("setAppEventListener must be called on the main UI thread.");
        this.G.A(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
        this.G.G(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z) {
        AbstractC7506py0.e("setImmersiveMode must be called on the main UI thread.");
        this.L = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(InterfaceC3383bF1 interfaceC3383bF1) {
        AbstractC7506py0.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.D.h(interfaceC3383bF1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        AbstractC7506py0.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.J.e();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.G.r(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(InterfaceC5109hQ1 interfaceC5109hQ1) {
        this.H.A(interfaceC5109hQ1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(InterfaceC7934rX interfaceC7934rX) {
        if (this.K == null) {
            AbstractC4274eT1.zzj("Interstitial can not be shown before loaded.");
            this.G.d(AbstractC5908kG2.d(9, null, null));
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.w2)).booleanValue()) {
            this.I.c().zzn(new Throwable().getStackTrace());
        }
        this.K.i(this.L, (Activity) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        AbstractC7506py0.e("showInterstitial must be called on the main UI thread.");
        if (this.K == null) {
            AbstractC4274eT1.zzj("Interstitial can not be shown before loaded.");
            this.G.d(AbstractC5908kG2.d(9, null, null));
        } else {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.w2)).booleanValue()) {
                this.I.c().zzn(new Throwable().getStackTrace());
            }
            this.K.i(this.L, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.D.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        AbstractC7506py0.e("isLoaded must be called on the main UI thread.");
        return b3();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.daaw.iF1 r0 = com.daaw.AbstractC8701uF1.i     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L24
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.ma     // Catch: java.lang.Throwable -> L26
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 1
            goto L28
        L24:
            r0 = 0
            goto L28
        L26:
            r6 = move-exception
            goto L8f
        L28:
            com.google.android.gms.internal.ads.zzcaz r2 = r5.F     // Catch: java.lang.Throwable -> L26
            int r2 = r2.D     // Catch: java.lang.Throwable -> L26
            com.daaw.qE1 r3 = com.daaw.AbstractC9820yE1.na     // Catch: java.lang.Throwable -> L26
            com.daaw.wE1 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L26
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L26
            if (r2 < r3) goto L40
            if (r0 != 0) goto L45
        L40:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.daaw.AbstractC7506py0.e(r0)     // Catch: java.lang.Throwable -> L26
        L45:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r5.C     // Catch: java.lang.Throwable -> L26
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzG(r0)     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r0 == 0) goto L68
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L68
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.daaw.AbstractC4274eT1.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.daaw.tv2 r6 = r5.G     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L66
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.daaw.AbstractC5908kG2.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.P(r0)     // Catch: java.lang.Throwable -> L26
        L66:
            monitor-exit(r5)
            return r1
        L68:
            boolean r0 = r5.b3()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L70
            monitor-exit(r5)
            return r1
        L70:
            android.content.Context r0 = r5.C     // Catch: java.lang.Throwable -> L26
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L26
            com.daaw.AbstractC4223eG2.a(r0, r1)     // Catch: java.lang.Throwable -> L26
            r5.K = r2     // Catch: java.lang.Throwable -> L26
            com.daaw.bE2 r0 = r5.D     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r5.E     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.ads.internal.client.zzq r2 = r5.B     // Catch: java.lang.Throwable -> L26
            com.daaw.UD2 r3 = new com.daaw.UD2     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            com.daaw.Av2 r2 = new com.daaw.Av2     // Catch: java.lang.Throwable -> L26
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r0.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC0486Bv2.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        AbstractC7506py0.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.G.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.G.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.J6)).booleanValue()) {
            return null;
        }
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 == null) {
            return null;
        }
        return c5719jc2.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final InterfaceC7934rX zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.E;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 == null || c5719jc2.c() == null) {
            return null;
        }
        return c5719jc2.c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 == null || c5719jc2.c() == null) {
            return null;
        }
        return c5719jc2.c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 != null) {
            c5719jc2.d().B0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
        this.G.o(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        AbstractC7506py0.e("pause must be called on the main UI thread.");
        C5719jc2 c5719jc2 = this.K;
        if (c5719jc2 != null) {
            c5719jc2.d().C0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(EA1 ea1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(InterfaceC9860yO1 interfaceC9860yO1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(BO1 bo1, String str) {
    }
}
