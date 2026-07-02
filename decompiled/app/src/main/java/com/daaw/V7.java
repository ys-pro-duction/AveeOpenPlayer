package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class V7 extends AbstractC5548j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(E30 e30) {
        super(e30);
        G10.g(e30, "javaTypeEnhancementState");
    }

    public final List A(AbstractC2887Yq abstractC2887Yq) {
        if (!(abstractC2887Yq instanceof C4027db)) {
            return abstractC2887Yq instanceof C3946dH ? AbstractC1496Lm.e(((C3946dH) abstractC2887Yq).c().h()) : AbstractC1599Mm.k();
        }
        Iterable iterable = (Iterable) ((C4027db) abstractC2887Yq).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC2141Rm.A(arrayList, A((AbstractC2887Yq) it.next()));
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC5548j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Iterable c(O7 o7, boolean z) {
        G10.g(o7, "<this>");
        Map mapK = o7.k();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapK.entrySet()) {
            AbstractC2141Rm.A(arrayList, (!z || G10.c((C2352Tm0) entry.getKey(), B40.c)) ? A((AbstractC2887Yq) entry.getValue()) : AbstractC1599Mm.k());
        }
        return arrayList;
    }

    @Override // com.daaw.AbstractC5548j
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public AP k(O7 o7) {
        G10.g(o7, "<this>");
        return o7.d();
    }

    @Override // com.daaw.AbstractC5548j
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Object l(O7 o7) {
        G10.g(o7, "<this>");
        InterfaceC4923gl interfaceC4923glL = AbstractC8400tA.l(o7);
        G10.d(interfaceC4923glL);
        return interfaceC4923glL;
    }

    @Override // com.daaw.AbstractC5548j
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterable m(O7 o7) {
        InterfaceC3072a8 annotations;
        G10.g(o7, "<this>");
        InterfaceC4923gl interfaceC4923glL = AbstractC8400tA.l(o7);
        return (interfaceC4923glL == null || (annotations = interfaceC4923glL.getAnnotations()) == null) ? AbstractC1599Mm.k() : annotations;
    }
}
