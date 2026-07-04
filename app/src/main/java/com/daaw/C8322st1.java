package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: renamed from: com.daaw.st1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8322st1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzaw e;

    public C8322st1(zzaw zzawVar, Context context, zzq zzqVar, String str) {
        this.e = zzawVar;
        this.b = context;
        this.c = zzqVar;
        this.d = str;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "search");
        return new zzew();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzf(BinderC7744qp0.Z2(this.b), this.c, this.d, 233702000);
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        return this.e.a.zza(this.b, this.c, this.d, null, 3);
    }
}
