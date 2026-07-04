package com.daaw;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.td3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8523td3 extends AbstractC9435wr1 {
    public final C7735qn1 D;

    public C8523td3(C7735qn1 c7735qn1) {
        super("internal.eventLogger");
        this.D = c7735qn1;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        AbstractC7831r73.h(this.B, 3, list);
        String strZzi = es2.b((InterfaceC1637Mv1) list.get(0)).zzi();
        long jA = (long) AbstractC7831r73.a(es2.b((InterfaceC1637Mv1) list.get(1)).zzh().doubleValue());
        InterfaceC1637Mv1 interfaceC1637Mv1B = es2.b((InterfaceC1637Mv1) list.get(2));
        this.D.e(strZzi, jA, interfaceC1637Mv1B instanceof C2693Wt1 ? AbstractC7831r73.g((C2693Wt1) interfaceC1637Mv1B) : new HashMap());
        return InterfaceC1637Mv1.t;
    }
}
