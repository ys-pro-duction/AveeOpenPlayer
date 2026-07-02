package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.Zh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2958Zh2 {
    public final KW1 a;
    public final Context b;
    public final C7782qx1 c;
    public final C4497fF1 d;
    public final zzcaz e;
    public final zza f;
    public final C6454mB1 g;
    public final M82 h;
    public final BinderC9431wq2 i;

    public C2958Zh2(KW1 kw1, Context context, C7782qx1 c7782qx1, C4497fF1 c4497fF1, zzcaz zzcazVar, zza zzaVar, C6454mB1 c6454mB1, M82 m82, BinderC9431wq2 binderC9431wq2) {
        this.a = kw1;
        this.b = context;
        this.c = c7782qx1;
        this.d = c4497fF1;
        this.e = zzcazVar;
        this.f = zzaVar;
        this.g = c6454mB1;
        this.h = m82;
        this.i = binderC9431wq2;
    }

    public final InterfaceC9334wW1 a(zzq zzqVar, C4498fF2 c4498fF2, C5622jF2 c5622jF2) {
        C8494tX1 c8494tX1C = C8494tX1.c(zzqVar);
        String str = zzqVar.zza;
        C1790Oh2 c1790Oh2 = new C1790Oh2(this);
        BinderC9431wq2 binderC9431wq2 = this.i;
        zza zzaVar = this.f;
        C6454mB1 c6454mB1 = this.g;
        return KW1.a(this.b, c8494tX1C, str, false, false, this.c, this.d, this.e, null, c1790Oh2, zzaVar, c6454mB1, c4498fF2, c5622jF2, binderC9431wq2);
    }
}
