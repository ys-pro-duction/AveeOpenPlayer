package com.daaw;

import android.content.Context;
import android.os.Bundle;
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
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class KC2 extends zzbt implements zzo, InterfaceC8967vA1 {
    public final AbstractC10175zX1 B;
    public final Context C;
    public final String E;
    public final EC2 F;
    public final CC2 G;
    public final zzcaz H;
    public final C1071Hj2 I;
    public D22 K;
    public P22 L;
    public AtomicBoolean D = new AtomicBoolean();
    public long J = -1;

    public KC2(AbstractC10175zX1 abstractC10175zX1, Context context, String str, EC2 ec2, CC2 cc2, zzcaz zzcazVar, C1071Hj2 c1071Hj2) {
        this.B = abstractC10175zX1;
        this.C = context;
        this.E = str;
        this.F = ec2;
        this.G = cc2;
        this.H = zzcazVar;
        this.I = c1071Hj2;
        cc2.r(this);
    }

    public final synchronized void b3(int i) {
        try {
            if (this.D.compareAndSet(false, true)) {
                this.G.m();
                D22 d22 = this.K;
                if (d22 != null) {
                    zzt.zzb().e(d22);
                }
                if (this.L != null) {
                    long jB = -1;
                    if (this.J != -1) {
                        jB = zzt.zzB().b() - this.J;
                    }
                    this.L.k(jB, i);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        AbstractC7506py0.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(zzq zzqVar) {
        AbstractC7506py0.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(EA1 ea1) {
        this.G.A(ea1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        this.F.k(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(InterfaceC3383bF1 interfaceC3383bF1) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.F.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.InterfaceC8967vA1
    public final void zza() {
        b3(3);
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
            com.daaw.iF1 r0 = com.daaw.AbstractC8701uF1.d     // Catch: java.lang.Throwable -> L26
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
            goto L8a
        L28:
            com.google.android.gms.internal.ads.zzcaz r2 = r5.H     // Catch: java.lang.Throwable -> L26
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
            if (r0 == 0) goto L67
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L55
            goto L67
        L55:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.daaw.AbstractC4274eT1.zzg(r6)     // Catch: java.lang.Throwable -> L26
            com.daaw.CC2 r6 = r5.G     // Catch: java.lang.Throwable -> L26
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.daaw.AbstractC5908kG2.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.P(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r1
        L67:
            boolean r0 = r5.zzY()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L6f
            monitor-exit(r5)
            return r1
        L6f:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            r5.D = r0     // Catch: java.lang.Throwable -> L26
            com.daaw.IC2 r0 = new com.daaw.IC2     // Catch: java.lang.Throwable -> L26
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L26
            com.daaw.EC2 r1 = r5.F     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r5.E     // Catch: java.lang.Throwable -> L26
            com.daaw.JC2 r3 = new com.daaw.JC2     // Catch: java.lang.Throwable -> L26
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.KC2.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        if (this.L == null) {
            return;
        }
        this.J = zzt.zzB().b();
        int iH = this.L.h();
        if (iH <= 0) {
            return;
        }
        D22 d22 = new D22(this.B.d(), zzt.zzB());
        this.K = d22;
        d22.c(iH, new Runnable() { // from class: com.daaw.HC2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.zzp();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbx() {
        P22 p22 = this.L;
        if (p22 != null) {
            p22.k(zzt.zzB().b() - this.J, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            b3(2);
            return;
        }
        if (i2 == 1) {
            b3(4);
        } else if (i2 != 2) {
            b3(6);
        } else {
            b3(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final InterfaceC7934rX zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        b3(5);
    }

    public final void zzp() {
        this.B.c().execute(new Runnable() { // from class: com.daaw.GC2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.E;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        P22 p22 = this.L;
        if (p22 != null) {
            p22.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        AbstractC7506py0.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
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
    public final void zzP(zzdg zzdgVar) {
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
