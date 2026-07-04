package com.daaw;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.aD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3097aD2 implements PD2 {
    public InterfaceC8104s62 a;
    public final Executor b = VS2.b();

    @Override // com.daaw.PD2
    public final /* bridge */ /* synthetic */ InterfaceFutureC8236sc0 a(QD2 qd2, OD2 od2, Object obj) {
        return c(qd2, od2, null);
    }

    public final InterfaceC8104s62 b() {
        return this.a;
    }

    public final InterfaceFutureC8236sc0 c(QD2 qd2, OD2 od2, InterfaceC8104s62 interfaceC8104s62) {
        InterfaceC7825r62 interfaceC7825r62A = od2.a(qd2.b);
        interfaceC7825r62A.k(new TD2(true));
        InterfaceC8104s62 interfaceC8104s622 = (InterfaceC8104s62) interfaceC7825r62A.zzh();
        this.a = interfaceC8104s622;
        final V42 v42Zzb = interfaceC8104s622.zzb();
        final IG2 ig2 = new IG2();
        return AbstractC7360pS2.m(AbstractC7360pS2.n(AbstractC4839gS2.C(v42Zzb.j()), new WR2() { // from class: com.daaw.YC2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                C9267wF2 c9267wF2 = (C9267wF2) obj;
                ig2.b = c9267wF2;
                Iterator it = c9267wF2.b.a.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((C4498fF2) it.next()).a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return v42Zzb.i(AbstractC7360pS2.h(c9267wF2));
                    }
                }
                return AbstractC7360pS2.h(null);
            }
        }, this.b), new WN2() { // from class: com.daaw.ZC2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                IG2 ig22 = ig2;
                ig22.c = (AbstractC4448f42) obj;
                return ig22;
            }
        }, this.b);
    }

    @Override // com.daaw.PD2
    public final /* synthetic */ Object zzd() {
        return this.a;
    }
}
