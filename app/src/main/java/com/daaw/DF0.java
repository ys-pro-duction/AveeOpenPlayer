package com.daaw;

import com.daaw.AbstractC10102zF0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DF0 extends AbstractC10102zF0 implements InterfaceC10042z20 {
    public final Object[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DF0(C2352Tm0 c2352Tm0, Object[] objArr) {
        super(c2352Tm0, null);
        G10.g(objArr, DiagnosticsEntry.Histogram.VALUES_KEY);
        this.c = objArr;
    }

    @Override // com.daaw.InterfaceC10042z20
    public List e() {
        Object[] objArr = this.c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC10102zF0.a aVar = AbstractC10102zF0.b;
            G10.d(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
