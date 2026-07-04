package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.nr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6919nr2 implements InterfaceC3761cd2 {
    public final zzcaz a;
    public final InterfaceFutureC8236sc0 b;
    public final C4498fF2 c;
    public final InterfaceC9334wW1 d;
    public final FF2 e;
    public final JI1 f;
    public final boolean g;
    public final BinderC9431wq2 h;

    public C6919nr2(zzcaz zzcazVar, InterfaceFutureC8236sc0 interfaceFutureC8236sc0, C4498fF2 c4498fF2, InterfaceC9334wW1 interfaceC9334wW1, FF2 ff2, boolean z, JI1 ji1, BinderC9431wq2 binderC9431wq2) {
        this.a = zzcazVar;
        this.b = interfaceFutureC8236sc0;
        this.c = c4498fF2;
        this.d = interfaceC9334wW1;
        this.e = ff2;
        this.g = z;
        this.f = ji1;
        this.h = binderC9431wq2;
    }

    @Override // com.daaw.InterfaceC3761cd2
    public final void a(boolean z, Context context, C4184e72 c4184e72) {
        int i;
        G22 g22 = (G22) AbstractC7360pS2.q(this.b);
        this.d.r0(true);
        boolean zE = this.g ? this.f.e(true) : true;
        boolean z2 = this.g;
        zzj zzjVar = new zzj(zE, true, z2 ? this.f.d() : false, z2 ? this.f.a() : 0.0f, -1, z, this.c.Q, false);
        if (c4184e72 != null) {
            c4184e72.zzf();
        }
        zzt.zzi();
        C1666Nc2 c1666Nc2I = g22.i();
        InterfaceC9334wW1 interfaceC9334wW1 = this.d;
        int i2 = this.c.S;
        if (i2 == -1) {
            zzw zzwVar = this.e.j;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
            }
            AbstractC4274eT1.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.c.S;
            i = i2;
        } else {
            i = i2;
        }
        zzcaz zzcazVar = this.a;
        C4498fF2 c4498fF2 = this.c;
        String str = c4498fF2.D;
        C6192lF2 c6192lF2 = c4498fF2.u;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, c1666Nc2I, (zzz) null, interfaceC9334wW1, i, zzcazVar, str, zzjVar, c6192lF2.b, c6192lF2.a, this.e.f, c4184e72, c4498fF2.k0 ? this.h : null), true);
    }
}
