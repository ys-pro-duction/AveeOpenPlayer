package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.daaw.AbstractBinderC5380iO1;
import com.daaw.AbstractC0570Cq2;
import com.daaw.AbstractC0683Dq2;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.AbstractC9841yJ2;
import com.daaw.BinderC7744qp0;
import com.daaw.C4184e72;
import com.daaw.C9367wd3;
import com.daaw.CD2;
import com.daaw.GN1;
import com.daaw.HS2;
import com.daaw.HandlerC8451tM2;
import com.daaw.InterfaceC1974Qb2;
import com.daaw.InterfaceC3697cO1;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC9334wW1;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class zzl extends AbstractBinderC5380iO1 implements zzad {
    public static final int W = Color.argb(0, 0, 0, 0);
    public final Activity B;
    public AdOverlayInfoParcel C;
    public InterfaceC9334wW1 D;
    public zzh E;
    public zzr F;
    public FrameLayout H;
    public WebChromeClient.CustomViewCallback I;
    public HS2 L;
    public Runnable O;
    public boolean P;
    public boolean Q;
    public TextView U;
    public boolean G = false;
    public boolean J = false;
    public boolean K = false;
    public boolean M = false;
    public int V = 1;
    public final Object N = new Object();
    public boolean R = false;
    public boolean S = false;
    public boolean T = true;

    public zzl(Activity activity) {
        this.B = activity;
    }

    public static final void b3(AbstractC9841yJ2 abstractC9841yJ2, View view) {
        if (abstractC9841yJ2 == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().g(abstractC9841yJ2, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z2(boolean r32) throws com.daaw.CD2 {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.Z2(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a3(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.C
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzj r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            android.app.Activity r3 = r5.B
            com.google.android.gms.ads.internal.util.zzab r4 = com.google.android.gms.ads.internal.zzt.zzq()
            boolean r6 = r4.zze(r3, r6)
            boolean r3 = r5.K
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.E0
            com.daaw.wE1 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = 0
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.daaw.qE1 r6 = com.daaw.AbstractC9820yE1.D0
            com.daaw.wE1 r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r0.b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.C
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzj r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = 1
        L57:
            android.app.Activity r6 = r5.B
            android.view.Window r6 = r6.getWindow()
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.d1
            com.daaw.wE1 r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.a3(android.content.res.Configuration):void");
    }

    public final void h() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.B.isFinishing() || this.R) {
            return;
        }
        this.R = true;
        InterfaceC9334wW1 interfaceC9334wW1 = this.D;
        if (interfaceC9334wW1 != null) {
            interfaceC9334wW1.z0(this.V - 1);
            synchronized (this.N) {
                try {
                    if (!this.P && this.D.p()) {
                        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.G4)).booleanValue() && !this.S && (adOverlayInfoParcel = this.C) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                            zzoVar.zzbu();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc();
                            }
                        };
                        this.O = runnable;
                        com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(runnable, ((Long) zzba.zzc().b(AbstractC9820yE1.W0)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    public final void zzA(int i) {
        if (this.B.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().b(AbstractC9820yE1.U5)).intValue()) {
            if (this.B.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().b(AbstractC9820yE1.V5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzba.zzc().b(AbstractC9820yE1.W5)).intValue()) {
                    if (i2 <= ((Integer) zzba.zzc().b(AbstractC9820yE1.X5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.B.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().t(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.L.setBackgroundColor(0);
        } else {
            this.L.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.B);
        this.H = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.H.addView(view, -1, -1);
        this.B.setContentView(this.H);
        this.Q = true;
        this.I = customViewCallback;
        this.G = true;
    }

    public final void zzE() {
        synchronized (this.N) {
            try {
                this.P = true;
                Runnable runnable = this.O;
                if (runnable != null) {
                    HandlerC8451tM2 handlerC8451tM2 = com.google.android.gms.ads.internal.util.zzt.zza;
                    handlerC8451tM2.removeCallbacks(runnable);
                    handlerC8451tM2.post(this.O);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzG(String str) {
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final boolean zzH() {
        this.V = 1;
        if (this.D == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue() && this.D.canGoBack()) {
            this.D.goBack();
            return false;
        }
        boolean zM = this.D.M();
        if (!zM) {
            this.D.U("onbackblocked", Collections.EMPTY_MAP);
        }
        return zM;
    }

    public final void zzb() {
        this.V = 3;
        this.B.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.B.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        InterfaceC9334wW1 interfaceC9334wW1;
        zzo zzoVar;
        if (this.S) {
            return;
        }
        this.S = true;
        InterfaceC9334wW1 interfaceC9334wW12 = this.D;
        if (interfaceC9334wW12 != null) {
            this.L.removeView(interfaceC9334wW12.h());
            zzh zzhVar = this.E;
            if (zzhVar != null) {
                this.D.W(zzhVar.zzd);
                this.D.r0(false);
                ViewGroup viewGroup = this.E.zzc;
                View viewH = this.D.h();
                zzh zzhVar2 = this.E;
                viewGroup.addView(viewH, zzhVar2.zza, zzhVar2.zzb);
                this.E = null;
            } else if (this.B.getApplicationContext() != null) {
                this.D.W(this.B.getApplicationContext());
            }
            this.D = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzby(this.V);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.C;
        if (adOverlayInfoParcel2 == null || (interfaceC9334wW1 = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        b3(interfaceC9334wW1.zzQ(), this.C.zzd.h());
    }

    public final void zzd() {
        this.L.C = true;
    }

    public final void zze() {
        this.D.zzX();
    }

    public final void zzf(AbstractC0683Dq2 abstractC0683Dq2) throws CD2 {
        InterfaceC3697cO1 interfaceC3697cO1;
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel == null || (interfaceC3697cO1 = adOverlayInfoParcel.zzv) == null) {
            throw new CD2("noioou");
        }
        interfaceC3697cO1.H(BinderC7744qp0.Z2(abstractC0683Dq2));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel != null && this.G) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.H != null) {
            this.B.setContentView(this.L);
            this.Q = true;
            this.H.removeAllViews();
            this.H = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.I;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.I = null;
        }
        this.G = false;
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzh(int i, int i2, Intent intent) {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzi() {
        this.V = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzj() {
        this.V = 2;
        this.B.finish();
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzk(InterfaceC7934rX interfaceC7934rX) {
        a3((Configuration) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.InterfaceC5660jO1
    public void zzl(Bundle bundle) {
        if (!this.Q) {
            this.B.requestWindowFeature(1);
        }
        this.J = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.B.getIntent());
            this.C = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new CD2("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.B.setShowWhenLocked(true);
                } else {
                    this.B.getWindow().addFlags(524288);
                }
            }
            if (this.C.zzm.D > 7500000) {
                this.V = 4;
            }
            if (this.B.getIntent() != null) {
                this.T = this.B.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.C;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.K = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new C9367wd3(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.K = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new C9367wd3(this, null).zzb();
                }
            } else {
                this.K = false;
            }
            if (bundle == null) {
                if (this.T) {
                    C4184e72 c4184e72 = this.C.zzt;
                    if (c4184e72 != null) {
                        c4184e72.zze();
                    }
                    zzo zzoVar = this.C.zzc;
                    if (zzoVar != null) {
                        zzoVar.zzbv();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.C;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    InterfaceC1974Qb2 interfaceC1974Qb2 = this.C.zzu;
                    if (interfaceC1974Qb2 != null) {
                        interfaceC1974Qb2.i0();
                    }
                }
            }
            Activity activity = this.B;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.C;
            HS2 hs2 = new HS2(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.B, adOverlayInfoParcel3.zzs);
            this.L = hs2;
            hs2.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzq().zzl(this.B);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.C;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                Z2(false);
                return;
            }
            if (i == 2) {
                this.E = new zzh(adOverlayInfoParcel4.zzd);
                Z2(false);
            } else if (i == 3) {
                Z2(true);
            } else {
                if (i != 5) {
                    throw new CD2("Could not determine ad overlay type.");
                }
                Z2(false);
            }
        } catch (CD2 e) {
            AbstractC4274eT1.zzj(e.getMessage());
            this.V = 4;
            this.B.finish();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzm() {
        InterfaceC9334wW1 interfaceC9334wW1 = this.D;
        if (interfaceC9334wW1 != null) {
            try {
                this.L.removeView(interfaceC9334wW1.h());
            } catch (NullPointerException unused) {
            }
        }
        h();
    }

    public final void zzn() {
        if (this.M) {
            this.M = false;
            zze();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzo() {
        zzo zzoVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.I4)).booleanValue() && this.D != null && (!this.B.isFinishing() || this.E == null)) {
            this.D.onPause();
        }
        h();
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.B;
            AbstractC0570Cq2 abstractC0570Cq2E = AbstractC0683Dq2.e();
            abstractC0570Cq2E.a(activity);
            abstractC0570Cq2E.b(this.C.zzk == 5 ? this : null);
            try {
                this.C.zzv.T1(strArr, iArr, BinderC7744qp0.Z2(abstractC0570Cq2E.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzq() {
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzr() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbL();
        }
        a3(this.B.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I4)).booleanValue()) {
            return;
        }
        InterfaceC9334wW1 interfaceC9334wW1 = this.D;
        if (interfaceC9334wW1 == null || interfaceC9334wW1.q()) {
            AbstractC4274eT1.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.D.onResume();
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.J);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzt() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I4)).booleanValue()) {
            InterfaceC9334wW1 interfaceC9334wW1 = this.D;
            if (interfaceC9334wW1 == null || interfaceC9334wW1.q()) {
                AbstractC4274eT1.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.D.onResume();
            }
        }
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzu() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.I4)).booleanValue() && this.D != null && (!this.B.isFinishing() || this.E == null)) {
            this.D.onPause();
        }
        h();
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzv() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.C;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zzbx();
    }

    public final void zzw(boolean z) {
        int iIntValue = ((Integer) zzba.zzc().b(AbstractC9820yE1.L4)).intValue();
        boolean z2 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Z0)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : iIntValue;
        zzqVar.zzb = true != z2 ? iIntValue : 0;
        zzqVar.zzc = iIntValue;
        this.F = new zzr(this.B, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (!this.C.zzw || this.D == null) {
            layoutParams.addRule(true != z2 ? 9 : 11);
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.D.h().getId());
        }
        zzy(z, this.C.zzg);
        this.L.addView(this.F, layoutParams);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzx() {
        this.Q = true;
    }

    public final void zzy(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.X0)).booleanValue() && (adOverlayInfoParcel2 = this.C) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Y0)).booleanValue() && (adOverlayInfoParcel = this.C) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new GN1(this.D, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.F;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.L.removeView(this.F);
        zzw(true);
    }
}
