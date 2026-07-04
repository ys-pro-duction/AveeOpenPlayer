package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Lq3 extends AbstractC9435wr1 {
    public final Ct3 D;

    public Lq3(Ct3 ct3) {
        super("internal.registerCallback");
        this.D = ct3;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        AbstractC7831r73.h(this.B, 3, list);
        String strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
        InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(1));
        if (!(interfaceC1637Mv1B instanceof C5253hv1)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(2));
        if (!(interfaceC1637Mv1B2 instanceof C2693Wt1)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C2693Wt1 c2693Wt1 = (C2693Wt1) interfaceC1637Mv1B2;
        if (!c2693Wt1.zzt("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.D.a(strZzi, c2693Wt1.zzt("priority") ? AbstractC7831r73.b(c2693Wt1.e("priority").zzh().doubleValue()) : 1000, (C5253hv1) interfaceC1637Mv1B, c2693Wt1.e("type").zzi());
        return InterfaceC1637Mv1.t;
    }
}
