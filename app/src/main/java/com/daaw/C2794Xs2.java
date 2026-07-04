package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.Xs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2794Xs2 extends AbstractC2690Ws2 {
    public final AbstractC10175zX1 a;
    public final C8383t62 b;
    public final C0827Fa2 c;
    public final C5245ht2 d;
    public final C3553br2 e;

    public C2794Xs2(AbstractC10175zX1 abstractC10175zX1, C8383t62 c8383t62, C0827Fa2 c0827Fa2, C5245ht2 c5245ht2, C3553br2 c3553br2) {
        this.a = abstractC10175zX1;
        this.b = c8383t62;
        this.c = c0827Fa2;
        this.d = c5245ht2;
        this.e = c3553br2;
    }

    @Override // com.daaw.AbstractC2690Ws2
    public final InterfaceFutureC8236sc0 c(FF2 ff2, Bundle bundle, C4498fF2 c4498fF2, C9267wF2 c9267wF2) {
        C8383t62 c8383t62 = this.b;
        c8383t62.i(ff2);
        c8383t62.f(bundle);
        c8383t62.g(new C6710n62(c9267wF2, c4498fF2, this.d));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p3)).booleanValue()) {
            this.b.d(this.e);
        }
        AbstractC10175zX1 abstractC10175zX1 = this.a;
        C8383t62 c8383t622 = this.b;
        I22 i22I = abstractC10175zX1.i();
        i22I.c(c8383t622.j());
        i22I.b(this.c);
        V42 v42Zzb = i22I.zze().zzb();
        return v42Zzb.i(v42Zzb.j());
    }
}
