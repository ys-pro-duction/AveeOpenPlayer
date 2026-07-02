package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.up3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8862up3 extends AbstractC9435wr1 {
    public final Fn3 D;

    public C8862up3(Fn3 fn3) {
        super("internal.logger");
        this.D = fn3;
        this.C.put("log", new Jo3(this, false, true));
        this.C.put("silent", new Rk3(this, "silent"));
        ((AbstractC9435wr1) this.C.get("silent")).p("log", new Jo3(this, true, true));
        this.C.put("unmonitored", new C7732qm3(this, "unmonitored"));
        ((AbstractC9435wr1) this.C.get("unmonitored")).p("log", new Jo3(this, false, false));
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        return InterfaceC1637Mv1.t;
    }
}
