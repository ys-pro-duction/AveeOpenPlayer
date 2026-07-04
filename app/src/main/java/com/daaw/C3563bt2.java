package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.bt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3563bt2 extends AbstractC2690Ws2 {
    public final AbstractC10175zX1 a;
    public final C8383t62 b;
    public final C8886uu2 c;
    public final C0827Fa2 d;
    public final C5245ht2 e;
    public final C3553br2 f;

    public C3563bt2(AbstractC10175zX1 abstractC10175zX1, C8383t62 c8383t62, C8886uu2 c8886uu2, C0827Fa2 c0827Fa2, C5245ht2 c5245ht2, C3553br2 c3553br2) {
        this.a = abstractC10175zX1;
        this.b = c8383t62;
        this.c = c8886uu2;
        this.d = c0827Fa2;
        this.e = c5245ht2;
        this.f = c3553br2;
    }

    @Override // com.daaw.AbstractC2690Ws2
    public final InterfaceFutureC8236sc0 c(FF2 ff2, Bundle bundle, C4498fF2 c4498fF2, C9267wF2 c9267wF2) {
        C8383t62 c8383t62 = this.b;
        c8383t62.i(ff2);
        c8383t62.f(bundle);
        c8383t62.g(new C6710n62(c9267wF2, c4498fF2, this.e));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p3)).booleanValue()) {
            this.b.d(this.f);
        }
        AbstractC10175zX1 abstractC10175zX1 = this.a;
        C8383t62 c8383t622 = this.b;
        InterfaceC1874Pc2 interfaceC1874Pc2L = abstractC10175zX1.l();
        interfaceC1874Pc2L.j(c8383t622.j());
        interfaceC1874Pc2L.f(this.d);
        interfaceC1874Pc2L.o(this.c);
        V42 v42A = interfaceC1874Pc2L.zzf().a();
        return v42A.i(v42A.j());
    }
}
