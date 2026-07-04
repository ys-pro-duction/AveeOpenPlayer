package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2786Xq2 implements InterfaceC2682Wq2 {
    public final InterfaceC2682Wq2 a;
    public final WN2 b;

    public C2786Xq2(InterfaceC2682Wq2 interfaceC2682Wq2, WN2 wn2) {
        this.a = interfaceC2682Wq2;
        this.b = wn2;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        return AbstractC7360pS2.m(this.a.a(c9267wF2, c4498fF2), this.b, AbstractC9322wT1.a);
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        return this.a.b(c9267wF2, c4498fF2);
    }
}
