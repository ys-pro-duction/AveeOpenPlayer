package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: renamed from: com.daaw.Tt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2381Tt1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ SL1 e;
    public final /* synthetic */ zzaw f;

    public C2381Tt1(zzaw zzawVar, Context context, zzq zzqVar, String str, SL1 sl1) {
        this.f = zzawVar;
        this.b = context;
        this.c = zzqVar;
        this.d = str;
        this.e = sl1;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "interstitial");
        return new zzew();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zze(BinderC7744qp0.Z2(this.b), this.c, this.d, this.e, 233702000);
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f.a.zza(this.b, this.c, this.d, this.e, 2);
    }
}
