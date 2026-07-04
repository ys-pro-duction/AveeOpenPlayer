package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.rg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7980rg3 extends AbstractC9435wr1 {
    public final /* synthetic */ Bi3 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7980rg3(Ah3 ah3, String str, Bi3 bi3) {
        super("getValue");
        this.D = bi3;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        AbstractC7831r73.h("getValue", 2, list);
        InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(0));
        InterfaceC1637Mv1 interfaceC1637Mv1B2 = es2.b((InterfaceC1637Mv1) list.get(1));
        String strZza = this.D.zza(interfaceC1637Mv1B.zzi());
        return strZza != null ? new C6391ly1(strZza) : interfaceC1637Mv1B2;
    }
}
