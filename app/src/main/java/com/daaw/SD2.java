package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class SD2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public SD2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PD2 zzb() {
        Context context = (Context) this.a.zzb();
        C8148sG2 c8148sG2 = (C8148sG2) this.b.zzb();
        NG2 ng2 = (NG2) this.c.zzb();
        C6243lS1 c6243lS1Zzh = ((Boolean) zzba.zzc().b(AbstractC9820yE1.n6)).booleanValue() ? zzt.zzo().h().zzh() : zzt.zzo().h().zzi();
        boolean z = false;
        if (c6243lS1Zzh != null && c6243lS1Zzh.h()) {
            z = true;
        }
        if (((Integer) zzba.zzc().b(AbstractC9820yE1.p6)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.m6)).booleanValue() || z) {
                MG2 mg2A = ng2.a(EG2.Rewarded, context, c8148sG2, new C3933dD2(new C3097aD2()));
                C7300pD2 c7300pD2 = new C7300pD2(new C7021oD2());
                AG2 ag2 = mg2A.a;
                PS2 ps2 = AbstractC9322wT1.a;
                return new C4490fD2(c7300pD2, new C6184lD2(ag2, ps2), mg2A.b, mg2A.a.zza().I, ps2);
            }
        }
        return new C7021oD2();
    }
}
