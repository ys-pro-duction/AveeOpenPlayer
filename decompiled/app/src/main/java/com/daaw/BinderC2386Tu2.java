package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: renamed from: com.daaw.Tu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2386Tu2 extends zzbm {
    public final C0807Ev2 B;

    public BinderC2386Tu2(Context context, AbstractC10175zX1 abstractC10175zX1, DF2 df2, C0522Ce2 c0522Ce2, zzbh zzbhVar) {
        C1015Gv2 c1015Gv2 = new C1015Gv2(c0522Ce2, abstractC10175zX1.C());
        c1015Gv2.e(zzbhVar);
        this.B = new C0807Ev2(new C2494Uv2(abstractC10175zX1, context, c1015Gv2, df2), df2.i());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.B.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.B.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        this.B.d(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(zzl zzlVar, int i) {
        this.B.d(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() {
        return this.B.e();
    }
}
