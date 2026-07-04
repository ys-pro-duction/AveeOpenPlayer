package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.qs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7761qs2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;

    public C7761qs2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        zzcaz zzcazVarA = ((XX1) this.b).a();
        AbstractC1978Qc2 abstractC1978Qc2 = (AbstractC1978Qc2) this.c.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C7482ps2(context, zzcazVarA, abstractC1978Qc2, ps2);
    }
}
