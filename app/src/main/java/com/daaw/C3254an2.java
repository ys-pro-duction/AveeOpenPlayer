package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.an2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3254an2 implements InterfaceC3811cn2 {
    public final Map a;
    public final PS2 b;
    public final Q82 c;

    public C3254an2(Map map, PS2 ps2, Q82 q82) {
        this.a = map;
        this.b = ps2;
        this.c = q82;
    }

    @Override // com.daaw.InterfaceC3811cn2
    public final InterfaceFutureC8236sc0 a(final zzbvg zzbvgVar) {
        this.c.v0(zzbvgVar);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0G = AbstractC7360pS2.g(new C2350Tl2(3));
        for (String str : ((String) zzba.zzc().b(AbstractC9820yE1.X7)).split(",")) {
            final InterfaceC8394t83 interfaceC8394t83 = (InterfaceC8394t83) this.a.get(str.trim());
            if (interfaceC8394t83 != null) {
                interfaceFutureC8236sc0G = AbstractC7360pS2.f(interfaceFutureC8236sc0G, C2350Tl2.class, new WR2() { // from class: com.daaw.Ym2
                    @Override // com.daaw.WR2
                    public final InterfaceFutureC8236sc0 zza(Object obj) {
                        return ((InterfaceC3811cn2) interfaceC8394t83.zzb()).a(zzbvgVar);
                    }
                }, this.b);
            }
        }
        AbstractC7360pS2.r(interfaceFutureC8236sc0G, new C2978Zm2(this), AbstractC9322wT1.f);
        return interfaceFutureC8236sc0G;
    }
}
