package com.daaw;

/* JADX INFO: renamed from: com.daaw.su2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8328su2 implements InterfaceC2682Wq2 {
    public final InterfaceC3383bF1 a;
    public final PS2 b;
    public final YH2 c;
    public final C0907Fu2 d;

    public C8328su2(YH2 yh2, PS2 ps2, InterfaceC3383bF1 interfaceC3383bF1, C0907Fu2 c0907Fu2) {
        this.c = yh2;
        this.b = ps2;
        this.a = interfaceC3383bF1;
        this.d = c0907Fu2;
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final InterfaceFutureC8236sc0 a(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        BT1 bt1 = new BT1();
        C9730xu2 c9730xu2 = new C9730xu2();
        c9730xu2.a(new C8049ru2(this, bt1, c9267wF2, c4498fF2, c9730xu2));
        C6192lF2 c6192lF2 = c4498fF2.u;
        final WE1 we1 = new WE1(c9730xu2, c6192lF2.b, c6192lF2.a);
        SH2 sh2 = SH2.CUSTOM_RENDER_SYN;
        return IH2.d(new InterfaceC9833yH2() { // from class: com.daaw.qu2
            @Override // com.daaw.InterfaceC9833yH2
            public final void zza() {
                this.a.c(we1);
            }
        }, this.b, sh2, this.c).b(SH2.CUSTOM_RENDER_ACK).d(bt1).a();
    }

    @Override // com.daaw.InterfaceC2682Wq2
    public final boolean b(C9267wF2 c9267wF2, C4498fF2 c4498fF2) {
        C6192lF2 c6192lF2;
        return (this.a == null || (c6192lF2 = c4498fF2.u) == null || c6192lF2.a == null) ? false : true;
    }

    public final /* synthetic */ void c(WE1 we1) {
        this.a.O0(we1);
    }
}
