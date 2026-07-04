package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;

/* JADX INFO: renamed from: com.daaw.cF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3662cF2 extends XP1 {
    public final SE2 B;
    public final FE2 C;
    public final C9546xF2 D;
    public C10223zh2 E;
    public boolean F = false;

    public BinderC3662cF2(SE2 se2, FE2 fe2, C9546xF2 c9546xF2) {
        this.B = se2;
        this.C = fe2;
        this.D = c9546xF2;
    }

    private final synchronized boolean c3() {
        C10223zh2 c10223zh2 = this.E;
        if (c10223zh2 != null) {
            if (!c10223zh2.k()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:14:0x0024, B:15:0x002d, B:17:0x0033, B:21:0x0047), top: B:26:0x0001, inners: #1 }] */
    @Override // com.daaw.YP1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void C1(com.google.android.gms.internal.ads.zzbwd r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.daaw.AbstractC7506py0.e(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r5.C     // Catch: java.lang.Throwable -> L21
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.m5     // Catch: java.lang.Throwable -> L21
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L2d
            if (r0 != 0) goto L19
            goto L2d
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L21 java.lang.RuntimeException -> L23
            if (r0 == 0) goto L2d
            monitor-exit(r4)
            return
        L21:
            r5 = move-exception
            goto L65
        L23:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.daaw.OS1 r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Throwable -> L21
            r2.u(r0, r1)     // Catch: java.lang.Throwable -> L21
        L2d:
            boolean r0 = r4.c3()     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L47
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.o5     // Catch: java.lang.Throwable -> L21
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L21
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L47
            monitor-exit(r4)
            return
        L47:
            com.daaw.HE2 r0 = new com.daaw.HE2     // Catch: java.lang.Throwable -> L21
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L21
            r4.E = r1     // Catch: java.lang.Throwable -> L21
            com.daaw.SE2 r1 = r4.B     // Catch: java.lang.Throwable -> L21
            r2 = 1
            r1.i(r2)     // Catch: java.lang.Throwable -> L21
            com.daaw.SE2 r1 = r4.B     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.ads.internal.client.zzl r2 = r5.B     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r5.C     // Catch: java.lang.Throwable -> L21
            com.daaw.aF2 r3 = new com.daaw.aF2     // Catch: java.lang.Throwable -> L21
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L21
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r4)
            return
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BinderC3662cF2.C1(com.google.android.gms.internal.ads.zzbwd):void");
    }

    @Override // com.daaw.YP1
    public final synchronized void E(InterfaceC7934rX interfaceC7934rX) {
        AbstractC7506py0.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.C.l(null);
        if (this.E != null) {
            if (interfaceC7934rX != null) {
                context = (Context) BinderC7744qp0.I(interfaceC7934rX);
            }
            this.E.d().B0(context);
        }
    }

    @Override // com.daaw.YP1
    public final synchronized void i1(String str) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.: setCustomData");
        this.D.b = str;
    }

    @Override // com.daaw.YP1
    public final synchronized void m(String str) {
        AbstractC7506py0.e("setUserId must be called on the main UI thread.");
        this.D.a = str;
    }

    @Override // com.daaw.YP1
    public final void m1(WP1 wp1) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.C.G(wp1);
    }

    @Override // com.daaw.YP1
    public final void q2(zzby zzbyVar) {
        AbstractC7506py0.e("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.C.l(null);
        } else {
            this.C.l(new C3384bF2(this, zzbyVar));
        }
    }

    @Override // com.daaw.YP1
    public final synchronized void r(boolean z) {
        AbstractC7506py0.e("setImmersiveMode must be called on the main UI thread.");
        this.F = z;
    }

    @Override // com.daaw.YP1
    public final synchronized void s(InterfaceC7934rX interfaceC7934rX) {
        try {
            AbstractC7506py0.e("showAd must be called on the main UI thread.");
            if (this.E != null) {
                Activity activity = null;
                if (interfaceC7934rX != null) {
                    Object objI = BinderC7744qp0.I(interfaceC7934rX);
                    if (objI instanceof Activity) {
                        activity = (Activity) objI;
                    }
                }
                this.E.n(this.F, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.YP1
    public final void z0(InterfaceC5109hQ1 interfaceC5109hQ1) {
        AbstractC7506py0.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.C.A(interfaceC5109hQ1);
    }

    @Override // com.daaw.YP1
    public final Bundle zzb() {
        AbstractC7506py0.e("getAdMetadata can only be called from the UI thread.");
        C10223zh2 c10223zh2 = this.E;
        return c10223zh2 != null ? c10223zh2.h() : new Bundle();
    }

    @Override // com.daaw.YP1
    public final synchronized zzdn zzc() {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.J6)).booleanValue()) {
            return null;
        }
        C10223zh2 c10223zh2 = this.E;
        if (c10223zh2 == null) {
            return null;
        }
        return c10223zh2.c();
    }

    @Override // com.daaw.YP1
    public final synchronized String zzd() {
        C10223zh2 c10223zh2 = this.E;
        if (c10223zh2 == null || c10223zh2.c() == null) {
            return null;
        }
        return c10223zh2.c().zzg();
    }

    @Override // com.daaw.YP1
    public final void zze() {
        E(null);
    }

    @Override // com.daaw.YP1
    public final void zzh() {
        zzi(null);
    }

    @Override // com.daaw.YP1
    public final synchronized void zzi(InterfaceC7934rX interfaceC7934rX) {
        AbstractC7506py0.e("pause must be called on the main UI thread.");
        if (this.E != null) {
            this.E.d().C0(interfaceC7934rX == null ? null : (Context) BinderC7744qp0.I(interfaceC7934rX));
        }
    }

    @Override // com.daaw.YP1
    public final void zzj() {
        zzk(null);
    }

    @Override // com.daaw.YP1
    public final synchronized void zzk(InterfaceC7934rX interfaceC7934rX) {
        AbstractC7506py0.e("resume must be called on the main UI thread.");
        if (this.E != null) {
            this.E.d().D0(interfaceC7934rX == null ? null : (Context) BinderC7744qp0.I(interfaceC7934rX));
        }
    }

    @Override // com.daaw.YP1
    public final synchronized void zzq() {
        s(null);
    }

    @Override // com.daaw.YP1
    public final boolean zzs() {
        AbstractC7506py0.e("isLoaded must be called on the main UI thread.");
        return c3();
    }

    @Override // com.daaw.YP1
    public final boolean zzt() {
        C10223zh2 c10223zh2 = this.E;
        return c10223zh2 != null && c10223zh2.m();
    }
}
