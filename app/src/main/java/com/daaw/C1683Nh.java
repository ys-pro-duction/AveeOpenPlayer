package com.daaw;

import com.daaw.YV0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1683Nh {
    public static final C1683Nh a = new C1683Nh();
    public static final Map b;
    public static final Map c;
    public static final Set d;
    public static final Set e;
    public static final Set f;

    static {
        BP bp = YV0.a.s;
        C0576Cs0 c0576Cs0A = D61.a(AbstractC1787Oh.d(bp, "name"), YV0.m);
        C0576Cs0 c0576Cs0A2 = D61.a(AbstractC1787Oh.d(bp, "ordinal"), C2352Tm0.l("ordinal"));
        C0576Cs0 c0576Cs0A3 = D61.a(AbstractC1787Oh.c(YV0.a.X, "size"), C2352Tm0.l("size"));
        AP ap = YV0.a.b0;
        Map mapK = AbstractC1473Lg0.k(c0576Cs0A, c0576Cs0A2, c0576Cs0A3, D61.a(AbstractC1787Oh.c(ap, "size"), C2352Tm0.l("size")), D61.a(AbstractC1787Oh.d(YV0.a.g, "length"), C2352Tm0.l("length")), D61.a(AbstractC1787Oh.c(ap, "keys"), C2352Tm0.l("keySet")), D61.a(AbstractC1787Oh.c(ap, DiagnosticsEntry.Histogram.VALUES_KEY), C2352Tm0.l(DiagnosticsEntry.Histogram.VALUES_KEY)), D61.a(AbstractC1787Oh.c(ap, "entries"), C2352Tm0.l("entrySet")));
        b = mapK;
        Set<Map.Entry> setEntrySet = mapK.entrySet();
        ArrayList<C0576Cs0> arrayList = new ArrayList(AbstractC1703Nm.v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C0576Cs0(((AP) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0576Cs0 c0576Cs0 : arrayList) {
            C2352Tm0 c2352Tm0 = (C2352Tm0) c0576Cs0.d();
            Object arrayList2 = linkedHashMap.get(c2352Tm0);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c2352Tm0, arrayList2);
            }
            ((List) arrayList2).add((C2352Tm0) c0576Cs0.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1369Kg0.d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC2455Um.X((Iterable) entry2.getValue()));
        }
        c = linkedHashMap2;
        Map map = b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            C9489x30 c9489x30 = C9489x30.a;
            BP bpJ = ((AP) entry3.getKey()).e().j();
            G10.f(bpJ, "toUnsafe(...)");
            C6607ml c6607mlN = c9489x30.n(bpJ);
            G10.d(c6607mlN);
            linkedHashSet.add(c6607mlN.a().c((C2352Tm0) entry3.getValue()));
        }
        d = linkedHashSet;
        Set setKeySet = b.keySet();
        e = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((AP) it.next()).g());
        }
        f = AbstractC2455Um.Q0(arrayList3);
    }

    public final Map a() {
        return b;
    }

    public final List b(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name1");
        List list = (List) c.get(c2352Tm0);
        return list == null ? AbstractC1599Mm.k() : list;
    }

    public final Set c() {
        return e;
    }

    public final Set d() {
        return f;
    }
}
