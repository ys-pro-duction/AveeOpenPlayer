package com.daaw;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Ct3 {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int c(ES2 es2, C5253hv1 c5253hv1, InterfaceC1637Mv1 interfaceC1637Mv1) {
        InterfaceC1637Mv1 interfaceC1637Mv1A = c5253hv1.a(es2, Collections.singletonList(interfaceC1637Mv1));
        if (interfaceC1637Mv1A instanceof C1825Oq1) {
            return AbstractC7831r73.b(interfaceC1637Mv1A.zzh().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i, C5253hv1 c5253hv1, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), c5253hv1);
    }

    public final void b(ES2 es2, C7735qn1 c7735qn1) {
        We3 we3 = new We3(c7735qn1);
        for (Integer num : this.a.keySet()) {
            C1498Lm1 c1498Lm1Clone = c7735qn1.b().clone();
            int iC = c(es2, (C5253hv1) this.a.get(num), we3);
            if (iC == 2 || iC == -1) {
                c7735qn1.f(c1498Lm1Clone);
            }
        }
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            c(es2, (C5253hv1) this.b.get((Integer) it.next()), we3);
        }
    }
}
