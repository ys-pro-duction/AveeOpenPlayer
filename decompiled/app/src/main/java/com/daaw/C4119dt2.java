package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.dt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4119dt2 extends AbstractC2690Ws2 {
    public final AbstractC10175zX1 a;
    public final C8383t62 b;
    public final C0827Fa2 c;
    public final C5245ht2 d;
    public final C9546xF2 e;
    public final C3553br2 f;

    public C4119dt2(AbstractC10175zX1 abstractC10175zX1, C8383t62 c8383t62, C0827Fa2 c0827Fa2, C9546xF2 c9546xF2, C5245ht2 c5245ht2, C3553br2 c3553br2) {
        this.a = abstractC10175zX1;
        this.b = c8383t62;
        this.c = c0827Fa2;
        this.e = c9546xF2;
        this.d = c5245ht2;
        this.f = c3553br2;
    }

    @Override // com.daaw.AbstractC2690Ws2
    public final InterfaceFutureC8236sc0 c(FF2 ff2, Bundle bundle, C4498fF2 c4498fF2, C9267wF2 c9267wF2) {
        C9546xF2 c9546xF2;
        C8383t62 c8383t62 = this.b;
        c8383t62.i(ff2);
        c8383t62.f(bundle);
        c8383t62.g(new C6710n62(c9267wF2, c4498fF2, this.d));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.o3)).booleanValue() && (c9546xF2 = this.e) != null) {
            this.b.h(c9546xF2);
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p3)).booleanValue()) {
            this.b.d(this.f);
        }
        AbstractC10175zX1 abstractC10175zX1 = this.a;
        C8383t62 c8383t622 = this.b;
        InterfaceC1063Hh2 interfaceC1063Hh2N = abstractC10175zX1.n();
        interfaceC1063Hh2N.c(c8383t622.j());
        interfaceC1063Hh2N.b(this.c);
        V42 v42Zzb = interfaceC1063Hh2N.zze().zzb();
        return v42Zzb.i(v42Zzb.j());
    }
}
