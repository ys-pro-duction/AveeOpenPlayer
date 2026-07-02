package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbxd;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes3.dex */
public final class WE2 extends AbstractBinderC7908rQ1 {
    public final SE2 B;
    public final FE2 C;
    public final String D;
    public final C9546xF2 E;
    public final Context F;
    public final zzcaz G;
    public final C7782qx1 H;
    public final C1071Hj2 I;
    public C10223zh2 J;
    public boolean K = ((Boolean) zzba.zzc().b(AbstractC9820yE1.C0)).booleanValue();

    public WE2(String str, SE2 se2, Context context, FE2 fe2, C9546xF2 c9546xF2, zzcaz zzcazVar, C7782qx1 c7782qx1, C1071Hj2 c1071Hj2) {
        this.D = str;
        this.B = se2;
        this.C = fe2;
        this.E = c9546xF2;
        this.F = context;
        this.G = zzcazVar;
        this.H = c7782qx1;
        this.I = c1071Hj2;
    }

    public final synchronized void c3(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1, int i) {
        try {
            boolean z = false;
            if (((Boolean) AbstractC8701uF1.l.e()).booleanValue()) {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                    z = true;
                }
            }
            if (this.G.D < ((Integer) zzba.zzc().b(AbstractC9820yE1.na)).intValue() || !z) {
                AbstractC7506py0.e("#008 Must be called on the main UI thread.");
            }
            this.C.r(interfaceC10147zQ1);
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(this.F) && zzlVar.zzs == null) {
                AbstractC4274eT1.zzg("Failed to load the ad because app ID is missing.");
                this.C.P(AbstractC5908kG2.d(4, null, null));
                return;
            }
            if (this.J != null) {
                return;
            }
            HE2 he2 = new HE2(null);
            this.B.i(i);
            this.B.a(zzlVar, this.D, he2, new VE2(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final Bundle zzb() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        C10223zh2 c10223zh2 = this.J;
        return c10223zh2 != null ? c10223zh2.h() : new Bundle();
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final zzdn zzc() {
        C10223zh2 c10223zh2;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.J6)).booleanValue() && (c10223zh2 = this.J) != null) {
            return c10223zh2.c();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final InterfaceC7351pQ1 zzd() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        C10223zh2 c10223zh2 = this.J;
        if (c10223zh2 != null) {
            return c10223zh2.i();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized String zze() {
        C10223zh2 c10223zh2 = this.J;
        if (c10223zh2 == null || c10223zh2.c() == null) {
            return null;
        }
        return c10223zh2.c().zzg();
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized void zzf(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1) {
        c3(zzlVar, interfaceC10147zQ1, 2);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized void zzg(zzl zzlVar, InterfaceC10147zQ1 interfaceC10147zQ1) {
        c3(zzlVar, interfaceC10147zQ1, 3);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized void zzh(boolean z) {
        AbstractC7506py0.e("setImmersiveMode must be called on the main UI thread.");
        this.K = z;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzi(zzdd zzddVar) {
        if (zzddVar == null) {
            this.C.l(null);
        } else {
            this.C.l(new UE2(this, zzddVar));
        }
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzj(zzdg zzdgVar) {
        AbstractC7506py0.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.I.e();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.C.m(zzdgVar);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzk(InterfaceC9031vQ1 interfaceC9031vQ1) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        this.C.o(interfaceC9031vQ1);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized void zzl(zzbxd zzbxdVar) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        C9546xF2 c9546xF2 = this.E;
        c9546xF2.a = zzbxdVar.B;
        c9546xF2.b = zzbxdVar.C;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized void zzm(InterfaceC7934rX interfaceC7934rX) {
        zzn(interfaceC7934rX, this.K);
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final synchronized void zzn(InterfaceC7934rX interfaceC7934rX, boolean z) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        if (this.J == null) {
            AbstractC4274eT1.zzj("Rewarded can not be shown before loaded");
            this.C.d(AbstractC5908kG2.d(9, null, null));
            return;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.w2)).booleanValue()) {
            this.H.c().zzn(new Throwable().getStackTrace());
        }
        this.J.n(z, (Activity) BinderC7744qp0.I(interfaceC7934rX));
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final boolean zzo() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        C10223zh2 c10223zh2 = this.J;
        return (c10223zh2 == null || c10223zh2.l()) ? false : true;
    }

    @Override // com.daaw.InterfaceC8187sQ1
    public final void zzp(AQ1 aq1) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        this.C.R(aq1);
    }
}
