package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC4274eT1;
import com.daaw.BinderC2195Rz1;
import com.daaw.BinderC7744qp0;
import com.daaw.C8572tn2;
import com.daaw.InterfaceC7934rX;
import com.daaw.PL1;
import com.daaw.XS1;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzea {
    public final PL1 a;
    public final zzp b;
    public final AtomicBoolean c;
    public final VideoController d;
    public final zzaz e;
    public zza f;
    public AdListener g;
    public AdSize[] h;
    public AppEventListener i;
    public zzbu j;
    public VideoOptions k;
    public String l;
    public final ViewGroup m;
    public int n;
    public boolean o;
    public OnPaidEventListener p;

    public zzea(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, null, 0);
    }

    public static zzq a(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = b(i);
        return zzqVar;
    }

    public static boolean b(int i) {
        return i == 1;
    }

    public final /* synthetic */ void d(InterfaceC7934rX interfaceC7934rX) {
        this.m.addView((View) BinderC7744qp0.I(interfaceC7934rX));
    }

    public final boolean zzA() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                return zzbuVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.h;
    }

    public final AdListener zza() {
        return this.g;
    }

    public final AdSize zzb() {
        zzq zzqVarZzg;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null && (zzqVarZzg = zzbuVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzqVarZzg.zze, zzqVarZzg.zzb, zzqVarZzg.zza);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.p;
    }

    public final ResponseInfo zzd() {
        zzdn zzdnVarZzk = null;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzdnVarZzk = zzbuVar.zzk();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdnVarZzk);
    }

    public final VideoController zzf() {
        return this.d;
    }

    public final VideoOptions zzg() {
        return this.k;
    }

    public final AppEventListener zzh() {
        return this.i;
    }

    public final zzdq zzi() {
        zzbu zzbuVar = this.j;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzl();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbu zzbuVar;
        if (this.l == null && (zzbuVar = this.j) != null) {
            try {
                this.l = zzbuVar.zzr();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    public final void zzk() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzx();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[Catch: RemoteException -> 0x00d1, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d1, blocks: (B:27:0x00a0, B:29:0x00a6, B:31:0x00b4, B:33:0x00c6, B:36:0x00d3), top: B:50:0x00a0, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(com.google.android.gms.ads.internal.client.zzdx r10) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzea.zzm(com.google.android.gms.ads.internal.client.zzdx):void");
    }

    public final void zzn() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzz();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.c.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzA();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzB();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.f = zzaVar;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.g = adListener;
        this.e.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        this.h = adSizeArr;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzF(a(this.m.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        this.m.requestLayout();
    }

    public final void zzu(String str) {
        if (this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.i = appEventListener;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzG(appEventListener != null ? new BinderC2195Rz1(appEventListener) : null);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.o = z;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzN(z);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.k = videoOptions;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzU(videoOptions == null ? null : new zzfl(videoOptions));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzbu zzbuVar) {
        try {
            InterfaceC7934rX interfaceC7934rXZzn = zzbuVar.zzn();
            if (interfaceC7934rXZzn == null || ((View) BinderC7744qp0.I(interfaceC7934rXZzn)).getParent() != null) {
                return false;
            }
            this.m.addView((View) BinderC7744qp0.I(interfaceC7934rXZzn));
            this.j = zzbuVar;
            return true;
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzea(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzp.zza, null, i);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzp.zza, null, 0);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzp.zza, null, i);
    }

    public zzea(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzp zzpVar, zzbu zzbuVar, int i) {
        zzq zzqVarZze;
        this.a = new PL1();
        this.d = new VideoController();
        this.e = new C8572tn2(this);
        this.m = viewGroup;
        this.b = zzpVar;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.h = zzyVar.zzb(z);
                this.l = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    XS1 xs1Zzb = zzay.zzb();
                    AdSize adSize = this.h[0];
                    int i2 = this.n;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVarZze = zzq.zze();
                    } else {
                        zzq zzqVar = new zzq(context, adSize);
                        zzqVar.zzj = b(i2);
                        zzqVarZze = zzqVar;
                    }
                    xs1Zzb.q(viewGroup, zzqVarZze, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzay.zzb().p(viewGroup, new zzq(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
