package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.f62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4458f62 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C4458f62(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.a.zzb();
        final zzcaz zzcazVarA = ((XX1) this.b).a();
        final FF2 ff2A = ((I62) this.c).a();
        return new WN2() { // from class: com.daaw.e62
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                C4498fF2 c4498fF2 = (C4498fF2) obj;
                zzau zzauVar = new zzau(context);
                zzauVar.zzp(c4498fF2.D);
                zzauVar.zzq(c4498fF2.E.toString());
                zzauVar.zzo(zzcazVarA.B);
                zzauVar.zzn(ff2A.f);
                return zzauVar;
            }
        };
    }
}
