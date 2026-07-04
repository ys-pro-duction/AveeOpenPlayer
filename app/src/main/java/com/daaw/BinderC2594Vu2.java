package com.daaw;

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
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.Collections;

/* JADX INFO: renamed from: com.daaw.Vu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2594Vu2 extends zzbt implements N82 {
    public final Context B;
    public final UC2 C;
    public final String D;
    public final C8611tv2 E;
    public zzq F;
    public final DF2 G;
    public final zzcaz H;
    public final C1071Hj2 I;
    public V22 J;

    public BinderC2594Vu2(Context context, zzq zzqVar, String str, UC2 uc2, C8611tv2 c8611tv2, zzcaz zzcazVar, C1071Hj2 c1071Hj2) {
        this.B = context;
        this.C = uc2;
        this.F = zzqVar;
        this.D = str;
        this.E = c8611tv2;
        this.G = uc2.h();
        this.H = zzcazVar;
        this.I = c1071Hj2;
        uc2.o(this);
    }

    public final synchronized void b3(zzq zzqVar) {
        this.G.I(zzqVar);
        this.G.N(this.F.zzn);
    }

    public final synchronized boolean c3(zzl zzlVar) {
        try {
            if (d3()) {
                AbstractC7506py0.e("loadAd must be called on the main UI thread.");
            }
            zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzt.zzG(this.B) || zzlVar.zzs != null) {
                AbstractC4223eG2.a(this.B, zzlVar.zzf);
                return this.C.a(zzlVar, this.D, null, new C2490Uu2(this));
            }
            AbstractC4274eT1.zzg("Failed to load the ad because app ID is missing.");
            C8611tv2 c8611tv2 = this.E;
            if (c8611tv2 != null) {
                c8611tv2.P(AbstractC5908kG2.d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d3() {
        /*
            r6 = this;
            com.daaw.iF1 r0 = com.daaw.AbstractC8701uF1.f
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.ma
            com.daaw.wE1 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzcaz r3 = r6.H
            int r3 = r3.D
            com.daaw.qE1 r4 = com.daaw.AbstractC9820yE1.na
            com.daaw.wE1 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC2594Vu2.d3():boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        AbstractC7506py0.e("recordManualImpression must be called on the main UI thread.");
        V22 v22 = this.J;
        if (v22 != null) {
            v22.m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.daaw.iF1 r0 = com.daaw.AbstractC8701uF1.h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.ia     // Catch: java.lang.Throwable -> L38
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcaz r0 = r3.H     // Catch: java.lang.Throwable -> L38
            int r0 = r0.D     // Catch: java.lang.Throwable -> L38
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.oa     // Catch: java.lang.Throwable -> L38
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.daaw.AbstractC7506py0.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.daaw.V22 r0 = r3.J     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.daaw.u72 r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.D0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC2594Vu2.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        if (d3()) {
            AbstractC7506py0.e("setAdListener must be called on the main UI thread.");
        }
        this.C.n(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        if (d3()) {
            AbstractC7506py0.e("setAdListener must be called on the main UI thread.");
        }
        this.E.m(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        AbstractC7506py0.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(zzq zzqVar) {
        AbstractC7506py0.e("setAdSize must be called on the main UI thread.");
        this.G.I(zzqVar);
        this.F = zzqVar;
        V22 v22 = this.J;
        if (v22 != null) {
            v22.n(this.C.c(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        if (d3()) {
            AbstractC7506py0.e("setAppEventListener must be called on the main UI thread.");
        }
        this.E.A(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z) {
        try {
            if (d3()) {
                AbstractC7506py0.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.G.P(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(InterfaceC3383bF1 interfaceC3383bF1) {
        AbstractC7506py0.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.C.p(interfaceC3383bF1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        if (d3()) {
            AbstractC7506py0.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdgVar.zzf()) {
                this.I.e();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.E.r(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(zzfl zzflVar) {
        try {
            if (d3()) {
                AbstractC7506py0.e("setVideoOptions must be called on the main UI thread.");
            }
            this.G.f(zzflVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.C.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.N82
    public final synchronized void zza() {
        try {
            if (!this.C.q()) {
                this.C.m();
                return;
            }
            zzq zzqVarX = this.G.x();
            V22 v22 = this.J;
            if (v22 != null && v22.l() != null && this.G.o()) {
                zzqVarX = JF2.a(this.B, Collections.singletonList(this.J.l()));
            }
            b3(zzqVarX);
            try {
                c3(this.G.v());
            } catch (RemoteException unused) {
                AbstractC4274eT1.zzj("Failed to refresh the banner ad.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa(zzl zzlVar) {
        b3(this.F);
        return c3(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
        AbstractC7506py0.e("setCorrelationIdProvider must be called on the main UI thread");
        this.G.q(zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        AbstractC7506py0.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        AbstractC7506py0.e("getAdSize must be called on the main UI thread.");
        V22 v22 = this.J;
        if (v22 != null) {
            return JF2.a(this.B, Collections.singletonList(v22.k()));
        }
        return this.G.x();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.E.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.E.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.J6)).booleanValue()) {
            return null;
        }
        V22 v22 = this.J;
        if (v22 == null) {
            return null;
        }
        return v22.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdq zzl() {
        AbstractC7506py0.e("getVideoController must be called from the main thread.");
        V22 v22 = this.J;
        if (v22 == null) {
            return null;
        }
        return v22.j();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final InterfaceC7934rX zzn() {
        if (d3()) {
            AbstractC7506py0.e("getAdFrame must be called on the main UI thread.");
        }
        return BinderC7744qp0.Z2(this.C.c());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.D;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        V22 v22 = this.J;
        if (v22 == null || v22.c() == null) {
            return null;
        }
        return v22.c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        V22 v22 = this.J;
        if (v22 == null || v22.c() == null) {
            return null;
        }
        return v22.c().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.daaw.iF1 r0 = com.daaw.AbstractC8701uF1.e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.ja     // Catch: java.lang.Throwable -> L38
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcaz r0 = r3.H     // Catch: java.lang.Throwable -> L38
            int r0 = r0.D     // Catch: java.lang.Throwable -> L38
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.oa     // Catch: java.lang.Throwable -> L38
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.daaw.AbstractC7506py0.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.daaw.V22 r0 = r3.J     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC2594Vu2.zzx():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.daaw.iF1 r0 = com.daaw.AbstractC8701uF1.g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.ka     // Catch: java.lang.Throwable -> L38
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.zzcaz r0 = r3.H     // Catch: java.lang.Throwable -> L38
            int r0 = r0.D     // Catch: java.lang.Throwable -> L38
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.oa     // Catch: java.lang.Throwable -> L38
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.daaw.AbstractC7506py0.e(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.daaw.V22 r0 = r3.J     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.daaw.u72 r0 = r0.d()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.C0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC2594Vu2.zzz():void");
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
