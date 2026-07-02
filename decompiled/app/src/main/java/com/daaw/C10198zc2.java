package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.zc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10198zc2 implements InterfaceC4758g83 {
    public final C8517tc2 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;

    public C10198zc2(C8517tc2 c8517tc2, InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = c8517tc2;
        this.b = interfaceC8394t83;
        this.c = interfaceC8394t832;
        this.d = interfaceC8394t833;
        this.e = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.b.zzb();
        final zzcaz zzcazVarA = ((XX1) this.c).a();
        final C4498fF2 c4498fF2A = ((A42) this.d).a();
        final FF2 ff2A = ((I62) this.e).a();
        return new C0623Db2(new J72() { // from class: com.daaw.lc2
            @Override // com.daaw.J72
            public final void zzr() {
                zzt.zzs().zzn(context, zzcazVarA.B, c4498fF2A.E.toString(), ff2A.f);
            }
        }, AbstractC9322wT1.f);
    }
}
