package com.daaw;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.Zs2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3002Zs2 extends AbstractC2690Ws2 {
    public final AbstractC10175zX1 a;
    public final C8383t62 b;
    public final C8886uu2 c;
    public final C0827Fa2 d;
    public final C6291ld2 e;
    public final M82 f;
    public final ViewGroup g;
    public final C4303ea2 h;
    public final C5245ht2 i;
    public final C3553br2 j;

    public C3002Zs2(AbstractC10175zX1 abstractC10175zX1, C8383t62 c8383t62, C8886uu2 c8886uu2, C0827Fa2 c0827Fa2, C6291ld2 c6291ld2, M82 m82, ViewGroup viewGroup, C4303ea2 c4303ea2, C5245ht2 c5245ht2, C3553br2 c3553br2) {
        this.a = abstractC10175zX1;
        this.b = c8383t62;
        this.c = c8886uu2;
        this.d = c0827Fa2;
        this.e = c6291ld2;
        this.f = m82;
        this.g = viewGroup;
        this.h = c4303ea2;
        this.i = c5245ht2;
        this.j = c3553br2;
    }

    @Override // com.daaw.AbstractC2690Ws2
    public final InterfaceFutureC8236sc0 c(FF2 ff2, Bundle bundle, C4498fF2 c4498fF2, C9267wF2 c9267wF2) {
        C8383t62 c8383t62 = this.b;
        c8383t62.i(ff2);
        c8383t62.f(bundle);
        c8383t62.g(new C6710n62(c9267wF2, c4498fF2, this.i));
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.p3)).booleanValue()) {
            this.b.d(this.j);
        }
        AbstractC10175zX1 abstractC10175zX1 = this.a;
        C8383t62 c8383t622 = this.b;
        InterfaceC8933v32 interfaceC8933v32J = abstractC10175zX1.j();
        interfaceC8933v32J.m(c8383t622.j());
        interfaceC8933v32J.n(this.d);
        interfaceC8933v32J.l(this.c);
        interfaceC8933v32J.a(this.e);
        interfaceC8933v32J.i(new X32(this.f, this.h));
        interfaceC8933v32J.d(new S22(this.g));
        V42 v42D = interfaceC8933v32J.zzk().d();
        return v42D.i(v42D.j());
    }
}
