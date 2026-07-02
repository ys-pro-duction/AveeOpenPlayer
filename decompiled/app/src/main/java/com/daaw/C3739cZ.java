package com.daaw;

import com.daaw.C4515fK;

/* JADX INFO: renamed from: com.daaw.cZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3739cZ extends C4515fK {
    public C3739cZ(C6488mK c6488mK, C6564mc1 c6564mc1) {
        super(c6488mK, C4515fK.b.IN, c6564mc1);
        AbstractC6557mb.d(AbstractC0513Cc1.t(c6564mc1), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // com.daaw.C4515fK, com.daaw.ZK
    public boolean e(LC lc) {
        C6564mc1 c6564mc1E = lc.e(g());
        return c6564mc1E != null && AbstractC0513Cc1.p(i().l0(), c6564mc1E);
    }
}
