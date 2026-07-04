package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Ah3 extends AbstractC9435wr1 {
    public final Bi3 D;

    public Ah3(String str, Bi3 bi3) {
        super("internal.remoteConfig");
        this.D = bi3;
        this.C.put("getValue", new C7980rg3(this, "getValue", bi3));
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        return InterfaceC1637Mv1.t;
    }
}
