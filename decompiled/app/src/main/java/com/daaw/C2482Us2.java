package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.Us2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2482Us2 extends AbstractC2690Ws2 {
    public final AbstractC10175zX1 a;
    public final C6291ld2 b;
    public final C8383t62 c;
    public final C0827Fa2 d;
    public final C5245ht2 e;
    public final C3553br2 f;

    public C2482Us2(AbstractC10175zX1 abstractC10175zX1, C6291ld2 c6291ld2, C8383t62 c8383t62, C0827Fa2 c0827Fa2, C5245ht2 c5245ht2, C3553br2 c3553br2) {
        this.a = abstractC10175zX1;
        this.b = c6291ld2;
        this.c = c8383t62;
        this.d = c0827Fa2;
        this.e = c5245ht2;
        this.f = c3553br2;
    }

    @Override // com.daaw.AbstractC2690Ws2
    public final InterfaceFutureC8236sc0 c(FF2 ff2, Bundle bundle, C4498fF2 c4498fF2, C9267wF2 c9267wF2) {
        C8383t62 c8383t62 = this.c;
        c8383t62.i(ff2);
        c8383t62.f(bundle);
        c8383t62.g(new C6710n62(c9267wF2, c4498fF2, this.e));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p3)).booleanValue()) {
            this.c.d(this.f);
        }
        AbstractC10175zX1 abstractC10175zX1 = this.a;
        C8383t62 c8383t622 = this.c;
        InterfaceC7407pd2 interfaceC7407pd2M = abstractC10175zX1.m();
        interfaceC7407pd2M.g(c8383t622.j());
        interfaceC7407pd2M.p(this.d);
        interfaceC7407pd2M.a(this.b);
        interfaceC7407pd2M.d(new S22(null));
        V42 v42A = interfaceC7407pd2M.zzg().a();
        return v42A.i(v42A.j());
    }
}
