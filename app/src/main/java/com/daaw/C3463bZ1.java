package com.daaw;

/* JADX INFO: renamed from: com.daaw.bZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3463bZ1 implements InterfaceC8933v32 {
    public final HY1 a;
    public TD2 b;
    public C4779gD2 c;
    public C0827Fa2 d;
    public C8948v62 e;
    public C8886uu2 f;
    public X32 g;
    public C7487pt2 h;
    public S22 i;
    public C6291ld2 j;

    public /* synthetic */ C3463bZ1(HY1 hy1, AbstractC3184aZ1 abstractC3184aZ1) {
        this.a = hy1;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 a(C6291ld2 c6291ld2) {
        this.j = c6291ld2;
        return this;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 d(S22 s22) {
        this.i = s22;
        return this;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 e(C7487pt2 c7487pt2) {
        this.h = c7487pt2;
        return this;
    }

    @Override // com.daaw.InterfaceC7825r62
    public final /* synthetic */ InterfaceC7825r62 h(C4779gD2 c4779gD2) {
        this.c = c4779gD2;
        return this;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 i(X32 x32) {
        this.g = x32;
        return this;
    }

    @Override // com.daaw.InterfaceC7825r62
    public final /* synthetic */ InterfaceC7825r62 k(TD2 td2) {
        this.b = td2;
        return this;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 l(C8886uu2 c8886uu2) {
        this.f = c8886uu2;
        return this;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 m(C8948v62 c8948v62) {
        this.e = c8948v62;
        return this;
    }

    @Override // com.daaw.InterfaceC8933v32
    public final /* synthetic */ InterfaceC8933v32 n(C0827Fa2 c0827Fa2) {
        this.d = c0827Fa2;
        return this;
    }

    @Override // com.daaw.InterfaceC7825r62
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final AbstractC9212w32 zzh() {
        AbstractC7000o83.c(this.d, C0827Fa2.class);
        AbstractC7000o83.c(this.e, C8948v62.class);
        AbstractC7000o83.c(this.f, C8886uu2.class);
        AbstractC7000o83.c(this.g, X32.class);
        if (this.h == null) {
            this.h = AbstractC8044rt2.a();
        }
        AbstractC7000o83.c(this.i, S22.class);
        AbstractC7000o83.c(this.j, C6291ld2.class);
        return new C4020dZ1(this.a, this.i, this.j, new X42(), new C7033oG2(), new C3344b62(), new C2966Zj2(), this.d, this.e, this.h, this.f, this.g, null, this.b, this.c, null);
    }
}
