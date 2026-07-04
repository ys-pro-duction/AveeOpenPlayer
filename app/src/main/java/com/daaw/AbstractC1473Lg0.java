package com.daaw;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Lg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1473Lg0 extends AbstractC1369Kg0 {
    public static Map h() {
        C7309pG c7309pG = C7309pG.B;
        G10.e(c7309pG, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c7309pG;
    }

    public static Object i(Map map, Object obj) {
        G10.g(map, "<this>");
        return AbstractC1265Jg0.a(map, obj);
    }

    public static HashMap j(C0576Cs0... c0576Cs0Arr) {
        G10.g(c0576Cs0Arr, "pairs");
        HashMap map = new HashMap(AbstractC1369Kg0.d(c0576Cs0Arr.length));
        q(map, c0576Cs0Arr);
        return map;
    }

    public static Map k(C0576Cs0... c0576Cs0Arr) {
        G10.g(c0576Cs0Arr, "pairs");
        return c0576Cs0Arr.length > 0 ? w(c0576Cs0Arr, new LinkedHashMap(AbstractC1369Kg0.d(c0576Cs0Arr.length))) : h();
    }

    public static Map l(Map map, Iterable iterable) {
        G10.g(map, "<this>");
        G10.g(iterable, "keys");
        Map mapX = x(map);
        AbstractC2141Rm.F(mapX.keySet(), iterable);
        return m(mapX);
    }

    public static final Map m(Map map) {
        G10.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC1369Kg0.f(map) : h();
    }

    public static Map n(Map map, Map map2) {
        G10.g(map, "<this>");
        G10.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void o(Map map, KP0 kp0) {
        G10.g(map, "<this>");
        G10.g(kp0, "pairs");
        Iterator it = kp0.iterator();
        while (it.hasNext()) {
            C0576Cs0 c0576Cs0 = (C0576Cs0) it.next();
            map.put(c0576Cs0.a(), c0576Cs0.b());
        }
    }

    public static void p(Map map, Iterable iterable) {
        G10.g(map, "<this>");
        G10.g(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0576Cs0 c0576Cs0 = (C0576Cs0) it.next();
            map.put(c0576Cs0.a(), c0576Cs0.b());
        }
    }

    public static final void q(Map map, C0576Cs0[] c0576Cs0Arr) {
        G10.g(map, "<this>");
        G10.g(c0576Cs0Arr, "pairs");
        for (C0576Cs0 c0576Cs0 : c0576Cs0Arr) {
            map.put(c0576Cs0.a(), c0576Cs0.b());
        }
    }

    public static Map r(KP0 kp0) {
        G10.g(kp0, "<this>");
        return m(s(kp0, new LinkedHashMap()));
    }

    public static final Map s(KP0 kp0, Map map) {
        G10.g(kp0, "<this>");
        G10.g(map, "destination");
        o(map, kp0);
        return map;
    }

    public static Map t(Iterable iterable) {
        G10.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(u(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return h();
        }
        if (size != 1) {
            return u(iterable, new LinkedHashMap(AbstractC1369Kg0.d(collection.size())));
        }
        return AbstractC1369Kg0.e((C0576Cs0) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map u(Iterable iterable, Map map) {
        G10.g(iterable, "<this>");
        G10.g(map, "destination");
        p(map, iterable);
        return map;
    }

    public static Map v(Map map) {
        G10.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? x(map) : AbstractC1369Kg0.f(map) : h();
    }

    public static final Map w(C0576Cs0[] c0576Cs0Arr, Map map) {
        G10.g(c0576Cs0Arr, "<this>");
        G10.g(map, "destination");
        q(map, c0576Cs0Arr);
        return map;
    }

    public static Map x(Map map) {
        G10.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
