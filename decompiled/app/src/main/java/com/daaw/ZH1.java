package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ZH1 implements HI1 {
    public final /* synthetic */ InterfaceC1974Qb2 a;
    public final /* synthetic */ L12 b;

    public /* synthetic */ ZH1(InterfaceC1974Qb2 interfaceC1974Qb2, L12 l12) {
        this.a = interfaceC1974Qb2;
        this.b = l12;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
        GI1.c(map, this.a);
        String str = (String) map.get("u");
        if (str == null) {
            AbstractC4274eT1.zzj("URL missing from click GMSG.");
            return;
        }
        final L12 l12 = this.b;
        AbstractC4839gS2 abstractC4839gS2C = AbstractC4839gS2.C(GI1.a(interfaceC9334wW1, str));
        WR2 wr2 = new WR2() { // from class: com.daaw.bI1
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj2) {
                L12 l122;
                String str2 = (String) obj2;
                HI1 hi1 = GI1.a;
                return (!((Boolean) zzba.zzc().b(AbstractC9820yE1.u9)).booleanValue() || (l122 = l12) == null) ? AbstractC7360pS2.h(str2) : l122.c(str2, zzay.zze());
            }
        };
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7360pS2.r(AbstractC7360pS2.n(abstractC4839gS2C, wr2, ps2), new C7319pI1(interfaceC9334wW1), ps2);
    }
}
