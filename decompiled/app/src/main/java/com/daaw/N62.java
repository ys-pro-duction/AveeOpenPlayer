package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes3.dex */
public final class N62 implements InterfaceC4758g83 {
    public final M62 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;

    public N62(M62 m62, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = m62;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
        this.d = interfaceC8394t833;
        this.e = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.b.zzb();
        zzcaz zzcazVarA = ((XX1) this.c).a();
        C4498fF2 c4498fF2A = ((A42) this.d).a();
        XQ1 xq1 = new XQ1();
        zzbxr zzbxrVar = c4498fF2A.C;
        if (zzbxrVar == null) {
            return null;
        }
        C6192lF2 c6192lF2 = c4498fF2A.u;
        return new WQ1(context, zzcazVarA, zzbxrVar, c6192lF2 != null ? c6192lF2.b : null, xq1);
    }
}
