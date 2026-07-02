package com.daaw;

import com.daaw.C4515fK;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1551Ma extends C4515fK {
    public C1551Ma(C6488mK c6488mK, C6564mc1 c6564mc1) {
        super(c6488mK, C4515fK.b.ARRAY_CONTAINS_ANY, c6564mc1);
        AbstractC6557mb.d(AbstractC0513Cc1.t(c6564mc1), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // com.daaw.C4515fK, com.daaw.ZK
    public boolean e(LC lc) {
        C6564mc1 c6564mc1E = lc.e(g());
        if (!AbstractC0513Cc1.t(c6564mc1E)) {
            return false;
        }
        Iterator it = c6564mc1E.l0().g().iterator();
        while (it.hasNext()) {
            if (AbstractC0513Cc1.p(i().l0(), (C6564mc1) it.next())) {
                return true;
            }
        }
        return false;
    }
}
