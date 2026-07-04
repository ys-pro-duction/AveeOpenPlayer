package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.hs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5240hs2 implements InterfaceC3761cd2 {
    public final Context a;
    public final zzcaz b;
    public final InterfaceFutureC8236sc0 c;
    public final C4498fF2 d;
    public final InterfaceC9334wW1 e;
    public final FF2 f;
    public final JI1 g;
    public final boolean h;
    public final BinderC9431wq2 i;

    public C5240hs2(Context context, zzcaz zzcazVar, InterfaceFutureC8236sc0 interfaceFutureC8236sc0, C4498fF2 c4498fF2, InterfaceC9334wW1 interfaceC9334wW1, FF2 ff2, boolean z, JI1 ji1, BinderC9431wq2 binderC9431wq2) {
        this.a = context;
        this.b = zzcazVar;
        this.c = interfaceFutureC8236sc0;
        this.d = c4498fF2;
        this.e = interfaceC9334wW1;
        this.f = ff2;
        this.g = ji1;
        this.h = z;
        this.i = binderC9431wq2;
    }

    @Override // com.daaw.InterfaceC3761cd2
    public final void a(boolean z, Context context, C4184e72 c4184e72) {
        AbstractC5998kc2 abstractC5998kc2 = (AbstractC5998kc2) AbstractC7360pS2.q(this.c);
        this.e.r0(true);
        boolean zE = this.h ? this.g.e(false) : false;
        zzt.zzp();
        zzj zzjVar = new zzj(zE, com.google.android.gms.ads.internal.util.zzt.zzH(this.a), this.h ? this.g.d() : false, this.h ? this.g.a() : 0.0f, -1, z, this.d.Q, false);
        if (c4184e72 != null) {
            c4184e72.zzf();
        }
        zzt.zzi();
        C1666Nc2 c1666Nc2J = abstractC5998kc2.j();
        InterfaceC9334wW1 interfaceC9334wW1 = this.e;
        C4498fF2 c4498fF2 = this.d;
        zzcaz zzcazVar = this.b;
        int i = c4498fF2.S;
        String str = c4498fF2.D;
        C6192lF2 c6192lF2 = c4498fF2.u;
        zzm.zza(context, new AdOverlayInfoParcel((zza) null, c1666Nc2J, (zzz) null, interfaceC9334wW1, i, zzcazVar, str, zzjVar, c6192lF2.b, c6192lF2.a, this.f.f, c4184e72, c4498fF2.k0 ? this.i : null), true);
    }
}
