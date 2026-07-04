package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class LY1 implements I22 {
    public final HY1 a;
    public TD2 b;
    public C4779gD2 c;
    public C0827Fa2 d;
    public C8948v62 e;

    public /* synthetic */ LY1(HY1 hy1, KY1 ky1) {
        this.a = hy1;
    }

    @Override // com.daaw.I22
    public final /* synthetic */ I22 b(C0827Fa2 c0827Fa2) {
        this.d = c0827Fa2;
        return this;
    }

    @Override // com.daaw.I22
    public final /* synthetic */ I22 c(C8948v62 c8948v62) {
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

    @Override // com.daaw.InterfaceC7825r62
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final J22 zzh() {
        AbstractC7000o83.c(this.d, C0827Fa2.class);
        AbstractC7000o83.c(this.e, C8948v62.class);
        return new NY1(this.a, new X42(), new C7033oG2(), new C3344b62(), new C2966Zj2(), this.d, this.e, AbstractC8044rt2.a(), null, this.b, this.c, null);
    }
}
