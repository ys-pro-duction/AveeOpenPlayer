package com.daaw;

import com.daaw.C4515fK;

/* JADX INFO: loaded from: classes3.dex */
public class M70 extends C4515fK {
    public final TC d;

    public M70(C6488mK c6488mK, C4515fK.b bVar, C6564mc1 c6564mc1) {
        super(c6488mK, bVar, c6564mc1);
        AbstractC6557mb.d(AbstractC0513Cc1.B(c6564mc1), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.d = TC.k(i().t0());
    }

    @Override // com.daaw.C4515fK, com.daaw.ZK
    public boolean e(LC lc) {
        return k(lc.getKey().compareTo(this.d));
    }
}
