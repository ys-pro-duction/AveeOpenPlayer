package com.daaw;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.gu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4971gu2 implements InterfaceC2682Wq2 {
    public final InterfaceC2890Yq2 a;
    public final InterfaceC4956gr2 b;
    public final YH2 c;
    public final PS2 d;

    public C4971gu2(YH2 yh2, PS2 ps2, InterfaceC2890Yq2 interfaceC2890Yq2, InterfaceC4956gr2 interfaceC4956gr2) {
        this.c = yh2;
        this.d = ps2;
        this.b = interfaceC4956gr2;
        this.a = interfaceC2890Yq2;
    }

    public static final String e(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(final C9267wF2 c9267wF2, final C4498fF2 c4498fF2) {
        final C2994Zq2 c2994Zq2A;
        Iterator it = c4498fF2.v.iterator();
        while (true) {
            if (!it.hasNext()) {
                c2994Zq2A = null;
                break;
            }
            try {
                c2994Zq2A = this.a.a((String) it.next(), c4498fF2.x);
                break;
            } catch (KF2 unused) {
            }
        }
        if (c2994Zq2A == null) {
            return AbstractC7360pS2.g(new C1419Ks2("Unable to instantiate mediation adapter class."));
        }
        BT1 bt1 = new BT1();
        c2994Zq2A.c.G(new C4692fu2(this, c2994Zq2A, bt1));
        if (c4498fF2.O) {
            Bundle bundle = c9267wF2.a.a.d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        YH2 yh2 = this.c;
        return IH2.d(new InterfaceC9833yH2() { // from class: com.daaw.du2
            @Override // com.daaw.InterfaceC9833yH2
            public final void zza() {
                this.a.d(c9267wF2, c4498fF2, c2994Zq2A);
            }
        }, this.d, SH2.ADAPTER_LOAD_AD_SYN, yh2).b(SH2.ADAPTER_LOAD_AD_ACK).d(bt1).b(SH2.ADAPTER_WRAP_ADAPTER).e(new InterfaceC9554xH2() { // from class: com.daaw.eu2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                return this.a.c(c9267wF2, c4498fF2, c2994Zq2A, (Void) obj);
            }
        }).a();
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        return !c4498fF2.v.isEmpty();
    }

    public final /* synthetic */ Object c(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2, Void r4) {
        return this.b.a(c9267wF2, c4498fF2, c2994Zq2);
    }

    public final /* synthetic */ void d(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        this.b.b(c9267wF2, c4498fF2, c2994Zq2);
    }
}
