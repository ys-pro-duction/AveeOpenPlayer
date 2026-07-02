package com.daaw;

import com.daaw.C6607ml;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MJ {
    public static final MJ a;
    public static final Map b;
    public static final Map c;

    static {
        MJ mj = new MJ();
        a = mj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b = linkedHashMap;
        WV0 wv0 = WV0.a;
        mj.c(wv0.l(), mj.a("java.util.ArrayList", "java.util.LinkedList"));
        mj.c(wv0.n(), mj.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mj.c(wv0.m(), mj.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C6607ml.a aVar = C6607ml.d;
        mj.c(aVar.c(new AP("java.util.function.Function")), mj.a("java.util.function.UnaryOperator"));
        mj.c(aVar.c(new AP("java.util.function.BiFunction")), mj.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(D61.a(((C6607ml) entry.getKey()).a(), ((C6607ml) entry.getValue()).a()));
        }
        c = AbstractC1473Lg0.t(arrayList);
    }

    public final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C6607ml.d.c(new AP(str)));
        }
        return arrayList;
    }

    public final AP b(AP ap) {
        G10.g(ap, "classFqName");
        return (AP) c.get(ap);
    }

    public final void c(C6607ml c6607ml, List list) {
        Map map = b;
        for (Object obj : list) {
            map.put(obj, c6607ml);
        }
    }
}
