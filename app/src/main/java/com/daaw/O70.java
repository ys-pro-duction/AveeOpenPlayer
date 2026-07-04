package com.daaw;

import com.daaw.C4515fK;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class O70 extends C4515fK {
    public final List d;

    /* JADX WARN: Illegal instructions before constructor call */
    public O70(C6488mK c6488mK, C6564mc1 c6564mc1) {
        C4515fK.b bVar = C4515fK.b.NOT_IN;
        super(c6488mK, bVar, c6564mc1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(N70.l(bVar, c6564mc1));
    }

    @Override // com.daaw.C4515fK, com.daaw.ZK
    public boolean e(LC lc) {
        return !this.d.contains(lc.getKey());
    }
}
