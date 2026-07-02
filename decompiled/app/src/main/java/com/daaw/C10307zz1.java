package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfc;

/* JADX INFO: renamed from: com.daaw.zz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10307zz1 extends SA1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SL1 d;
    public final /* synthetic */ zzaw e;

    public C10307zz1(zzaw zzawVar, Context context, String str, SL1 sl1) {
        this.e = zzawVar;
        this.b = context;
        this.c = str;
        this.d = sl1;
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "rewarded");
        return new zzfc();
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzo(BinderC7744qp0.Z2(this.b), this.c, this.d, 233702000);
    }

    @Override // com.daaw.SA1
    public final /* bridge */ /* synthetic */ Object c() {
        return JQ1.a(this.b, this.c, this.d);
    }
}
