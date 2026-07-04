package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: renamed from: com.daaw.Bk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0442Bk2 implements InterfaceC6326lk2 {
    public final long a;
    public final BinderC0486Bv2 b;

    public C0442Bk2(long j, Context context, C7721qk2 c7721qk2, AbstractC10175zX1 abstractC10175zX1, String str) {
        this.a = j;
        InterfaceC3937dE2 interfaceC3937dE2Y = abstractC10175zX1.y();
        interfaceC3937dE2Y.b(context);
        interfaceC3937dE2Y.a(new zzq());
        interfaceC3937dE2Y.zzb(str);
        BinderC0486Bv2 binderC0486Bv2Zza = interfaceC3937dE2Y.zzd().zza();
        this.b = binderC0486Bv2Zza;
        binderC0486Bv2Zza.zzD(new BinderC9401wk2(this, c7721qk2));
    }

    @Override // com.daaw.InterfaceC6326lk2
    public final void a(zzl zzlVar) {
        this.b.zzaa(zzlVar);
    }

    @Override // com.daaw.InterfaceC6326lk2
    public final void zza() {
        this.b.zzx();
    }

    @Override // com.daaw.InterfaceC6326lk2
    public final void zzc() {
        this.b.zzW(BinderC7744qp0.Z2(null));
    }
}
