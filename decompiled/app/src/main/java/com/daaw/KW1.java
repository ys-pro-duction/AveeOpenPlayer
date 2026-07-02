package com.daaw;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes3.dex */
public final class KW1 {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.wW1, java.lang.Object] */
    public static final InterfaceC9334wW1 a(final Context context, final C8494tX1 c8494tX1, final String str, final boolean z, final boolean z2, final C7782qx1 c7782qx1, final C4497fF1 c4497fF1, final zzcaz zzcazVar, VE1 ve1, final zzl zzlVar, final zza zzaVar, final C6454mB1 c6454mB1, final C4498fF2 c4498fF2, final C5622jF2 c5622jF2, final BinderC9431wq2 binderC9431wq2) throws JW1 {
        AbstractC9820yE1.a(context);
        try {
            final VE1 ve12 = null;
            CO2 co2 = new CO2(context, c8494tX1, str, z, z2, c7782qx1, c4497fF1, zzcazVar, ve12, zzlVar, zzaVar, c6454mB1, c4498fF2, c5622jF2, binderC9431wq2) { // from class: com.daaw.HW1
                public final /* synthetic */ Context B;
                public final /* synthetic */ C8494tX1 C;
                public final /* synthetic */ String D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ C7782qx1 G;
                public final /* synthetic */ C4497fF1 H;
                public final /* synthetic */ zzcaz I;
                public final /* synthetic */ zzl J;
                public final /* synthetic */ zza K;
                public final /* synthetic */ C6454mB1 L;
                public final /* synthetic */ C4498fF2 M;
                public final /* synthetic */ C5622jF2 N;
                public final /* synthetic */ BinderC9431wq2 O;

                {
                    this.J = zzlVar;
                    this.K = zzaVar;
                    this.L = c6454mB1;
                    this.M = c4498fF2;
                    this.N = c5622jF2;
                    this.O = binderC9431wq2;
                }

                @Override // com.daaw.CO2
                public final Object zza() {
                    C8494tX1 c8494tX12 = this.C;
                    String str2 = this.D;
                    boolean z3 = this.E;
                    C6454mB1 c6454mB12 = this.L;
                    boolean z4 = this.F;
                    C7782qx1 c7782qx12 = this.G;
                    C4497fF1 c4497fF12 = this.H;
                    zzl zzlVar2 = this.J;
                    C4498fF2 c4498fF22 = this.M;
                    Context context2 = this.B;
                    zzcaz zzcazVar2 = this.I;
                    zza zzaVar2 = this.K;
                    C5622jF2 c5622jF22 = this.N;
                    BinderC9431wq2 binderC9431wq22 = this.O;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = RW1.z0;
                        NW1 nw1 = new NW1(new RW1(new C8215sX1(context2), c8494tX12, str2, z3, z4, c7782qx12, c4497fF12, zzcazVar2, null, zzlVar2, zzaVar2, c6454mB12, c4498fF22, c5622jF22));
                        nw1.setWebViewClient(zzt.zzq().zzd(nw1, c6454mB12, z4, binderC9431wq22));
                        nw1.setWebChromeClient(new C9055vW1(nw1));
                        return nw1;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return co2.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new JW1("Webview initialization failed.", th);
        }
    }
}
