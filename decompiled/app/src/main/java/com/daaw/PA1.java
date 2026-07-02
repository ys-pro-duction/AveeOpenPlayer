package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PA1 {
    public final Map a = new HashMap();
    public final C8713uI1 b = new C8713uI1();

    public PA1() {
        b(new C0718Dz1());
        b(new C7848rB1());
        b(new XB1());
        b(new C6466mE1());
        b(new C5352iH1());
        b(new OH1());
        b(new C3120aJ1());
    }

    public final InterfaceC1637Mv1 a(ES2 es2, InterfaceC1637Mv1 interfaceC1637Mv1) {
        AbstractC7831r73.c(es2);
        if (!(interfaceC1637Mv1 instanceof C8335sw1)) {
            return interfaceC1637Mv1;
        }
        C8335sw1 c8335sw1 = (C8335sw1) interfaceC1637Mv1;
        ArrayList arrayListB = c8335sw1.b();
        String strA = c8335sw1.a();
        return (this.a.containsKey(strA) ? (AbstractC5601jA1) this.a.get(strA) : this.b).a(strA, es2, arrayListB);
    }

    public final void b(AbstractC5601jA1 abstractC5601jA1) {
        Iterator it = abstractC5601jA1.a.iterator();
        while (it.hasNext()) {
            this.a.put(((IJ1) it.next()).c().toString(), abstractC5601jA1);
        }
    }
}
