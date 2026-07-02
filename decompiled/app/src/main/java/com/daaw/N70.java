package com.daaw;

import com.daaw.C4515fK;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class N70 extends C4515fK {
    public final List d;

    /* JADX WARN: Illegal instructions before constructor call */
    public N70(C6488mK c6488mK, C6564mc1 c6564mc1) {
        C4515fK.b bVar = C4515fK.b.IN;
        super(c6488mK, bVar, c6564mc1);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(l(bVar, c6564mc1));
    }

    public static List l(C4515fK.b bVar, C6564mc1 c6564mc1) {
        AbstractC6557mb.d(bVar == C4515fK.b.IN || bVar == C4515fK.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        AbstractC6557mb.d(AbstractC0513Cc1.t(c6564mc1), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (C6564mc1 c6564mc12 : c6564mc1.l0().g()) {
            AbstractC6557mb.d(AbstractC0513Cc1.B(c6564mc12), "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(TC.k(c6564mc12.t0()));
        }
        return arrayList;
    }

    @Override // com.daaw.C4515fK, com.daaw.ZK
    public boolean e(LC lc) {
        return this.d.contains(lc.getKey());
    }
}
