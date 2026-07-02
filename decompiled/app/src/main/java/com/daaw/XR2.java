package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class XR2 extends ZR2 {
    public XR2(JP2 jp2, boolean z) {
        super(jp2, z);
        R();
    }

    @Override // com.daaw.ZR2
    public final /* bridge */ /* synthetic */ Object V(List list) {
        ArrayList arrayListA = AbstractC4552fQ2.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            YR2 yr2 = (YR2) it.next();
            arrayListA.add(yr2 != null ? yr2.a : null);
        }
        return DesugarCollections.unmodifiableList(arrayListA);
    }
}
