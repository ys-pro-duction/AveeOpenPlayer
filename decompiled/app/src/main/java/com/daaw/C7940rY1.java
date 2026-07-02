package com.daaw;

/* JADX INFO: renamed from: com.daaw.rY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7940rY1 implements InterfaceC7407pd2 {
    public final HY1 a;
    public TD2 b;
    public C4779gD2 c;
    public C0827Fa2 d;
    public C8948v62 e;
    public C6291ld2 f;
    public S22 g;

    public /* synthetic */ C7940rY1(HY1 hy1, AbstractC7662qY1 abstractC7662qY1) {
        this.a = hy1;
    }

    @Override // com.daaw.InterfaceC7407pd2
    public final /* synthetic */ InterfaceC7407pd2 a(C6291ld2 c6291ld2) {
        this.f = c6291ld2;
        return this;
    }

    @Override // com.daaw.InterfaceC7407pd2
    public final /* synthetic */ InterfaceC7407pd2 d(S22 s22) {
        this.g = s22;
        return this;
    }

    @Override // com.daaw.InterfaceC7407pd2
    public final /* synthetic */ InterfaceC7407pd2 g(C8948v62 c8948v62) {
        this.e = c8948v62;
        return this;
    }

    @Override // com.daaw.InterfaceC7825r62
    public final /* synthetic */ InterfaceC7825r62 h(C4779gD2 c4779gD2) {
        this.c = c4779gD2;
        return this;
    }

    @Override // com.daaw.InterfaceC7825r62
    public final /* synthetic */ InterfaceC7825r62 k(TD2 td2) {
        this.b = td2;
        return this;
    }

    @Override // com.daaw.InterfaceC7407pd2
    public final /* synthetic */ InterfaceC7407pd2 p(C0827Fa2 c0827Fa2) {
        this.d = c0827Fa2;
        return this;
    }

    @Override // com.daaw.InterfaceC7825r62
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final AbstractC7686qd2 zzh() {
        AbstractC7000o83.c(this.d, C0827Fa2.class);
        AbstractC7000o83.c(this.e, C8948v62.class);
        AbstractC7000o83.c(this.f, C6291ld2.class);
        AbstractC7000o83.c(this.g, S22.class);
        return new C8498tY1(this.a, this.g, this.f, new X42(), new C7033oG2(), new C3344b62(), new C2966Zj2(), this.d, this.e, AbstractC8044rt2.a(), null, this.b, this.c, null);
    }
}
