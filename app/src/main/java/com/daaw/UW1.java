package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class UW1 extends zzdp {
    public final FU1 B;
    public final boolean D;
    public final boolean E;
    public int F;
    public zzdt G;
    public boolean H;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public C4226eH1 O;
    public final Object C = new Object();
    public boolean I = true;

    public UW1(FU1 fu1, float f, boolean z, boolean z2) {
        this.B = fu1;
        this.J = f;
        this.D = z;
        this.E = z2;
    }

    public final void Z2(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.C) {
            try {
                z2 = true;
                if (f2 == this.J && f3 == this.L) {
                    z2 = false;
                }
                this.J = f2;
                this.K = f;
                z3 = this.I;
                this.I = z;
                i2 = this.F;
                this.F = i;
                float f4 = this.L;
                this.L = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.B.h().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                C4226eH1 c4226eH1 = this.O;
                if (c4226eH1 != null) {
                    c4226eH1.zze();
                }
            } catch (RemoteException e) {
                AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
            }
        }
        f3(i2, i, z3, z);
    }

    public final /* synthetic */ void a3(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        zzdt zzdtVar;
        zzdt zzdtVar2;
        zzdt zzdtVar3;
        synchronized (this.C) {
            try {
                boolean z5 = this.H;
                if (z5 || i2 != 1) {
                    i3 = i2;
                    z3 = false;
                } else {
                    i2 = 1;
                    i3 = 1;
                    z3 = true;
                }
                boolean z6 = i != i2;
                if (z6 && i3 == 1) {
                    z4 = true;
                    i3 = 1;
                } else {
                    z4 = false;
                }
                boolean z7 = z6 && i3 == 2;
                boolean z8 = z6 && i3 == 3;
                this.H = z5 || z3;
                if (z3) {
                    try {
                        zzdt zzdtVar4 = this.G;
                        if (zzdtVar4 != null) {
                            zzdtVar4.zzi();
                        }
                    } catch (RemoteException e) {
                        AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z4 && (zzdtVar3 = this.G) != null) {
                    zzdtVar3.zzh();
                }
                if (z7 && (zzdtVar2 = this.G) != null) {
                    zzdtVar2.zzg();
                }
                if (z8) {
                    zzdt zzdtVar5 = this.G;
                    if (zzdtVar5 != null) {
                        zzdtVar5.zze();
                    }
                    this.B.d();
                }
                if (z != z2 && (zzdtVar = this.G) != null) {
                    zzdtVar.zzf(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void b3(Map map) {
        this.B.U("pubVideoCmd", map);
    }

    public final void c3(zzfl zzflVar) {
        Object obj = this.C;
        boolean z = zzflVar.zza;
        boolean z2 = zzflVar.zzb;
        boolean z3 = zzflVar.zzc;
        synchronized (obj) {
            this.M = z2;
            this.N = z3;
        }
        g3("initialState", AbstractC1184Im.c("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void d3(float f) {
        synchronized (this.C) {
            this.K = f;
        }
    }

    public final void e3(C4226eH1 c4226eH1) {
        synchronized (this.C) {
            this.O = c4226eH1;
        }
    }

    public final void f3(final int i, final int i2, final boolean z, final boolean z2) {
        AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.TW1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.a3(i, i2, z, z2);
            }
        });
    }

    public final void g3(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        AbstractC9322wT1.e.execute(new Runnable() { // from class: com.daaw.SW1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b3(map2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f;
        synchronized (this.C) {
            f = this.L;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f;
        synchronized (this.C) {
            f = this.K;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f;
        synchronized (this.C) {
            f = this.J;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i;
        synchronized (this.C) {
            i = this.F;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final zzdt zzi() {
        zzdt zzdtVar;
        synchronized (this.C) {
            zzdtVar = this.G;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) {
        g3(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        g3("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        g3("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(zzdt zzdtVar) {
        synchronized (this.C) {
            this.G = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        g3("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z;
        Object obj = this.C;
        boolean zZzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zZzp) {
                try {
                    if (this.N && this.E) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z;
        synchronized (this.C) {
            try {
                z = false;
                if (this.D && this.M) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z;
        synchronized (this.C) {
            z = this.I;
        }
        return z;
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.C) {
            z = this.I;
            i = this.F;
            this.F = 3;
        }
        f3(i, 3, z, z);
    }
}
