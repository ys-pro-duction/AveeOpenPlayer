package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Jo3 extends AbstractC9435wr1 {
    public final boolean D;
    public final boolean E;
    public final /* synthetic */ C8862up3 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jo3(C8862up3 c8862up3, boolean z, boolean z2) {
        super("log");
        this.F = c8862up3;
        this.D = z;
        this.E = z2;
    }

    @Override // com.daaw.AbstractC9435wr1
    public final InterfaceC1637Mv1 a(ES2 es2, List list) {
        AbstractC7831r73.i("log", 1, list);
        if (list.size() == 1) {
            this.F.D.a(3, es2.b((InterfaceC1637Mv1) list.get(0)).zzi(), Collections.EMPTY_LIST, this.D, this.E);
            return InterfaceC1637Mv1.t;
        }
        int iB = AbstractC7831r73.b(es2.b((InterfaceC1637Mv1) list.get(0)).zzh().doubleValue());
        int i = iB != 2 ? iB != 3 ? iB != 5 ? iB != 6 ? 3 : 2 : 5 : 1 : 4;
        String strZzi = es2.b((InterfaceC1637Mv1) list.get(1)).zzi();
        if (list.size() == 2) {
            this.F.D.a(i, strZzi, Collections.EMPTY_LIST, this.D, this.E);
            return InterfaceC1637Mv1.t;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(es2.b((InterfaceC1637Mv1) list.get(i2)).zzi());
        }
        this.F.D.a(i, strZzi, arrayList, this.D, this.E);
        return InterfaceC1637Mv1.t;
    }
}
