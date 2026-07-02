package com.daaw;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.Kg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1369Kg0 extends AbstractC1265Jg0 {
    public static Map b(Map map) {
        G10.g(map, "builder");
        return ((C8535tg0) map).n();
    }

    public static Map c() {
        return new C8535tg0();
    }

    public static int d(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map e(C0576Cs0 c0576Cs0) {
        G10.g(c0576Cs0, "pair");
        Map mapSingletonMap = Collections.singletonMap(c0576Cs0.c(), c0576Cs0.d());
        G10.f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map f(Map map) {
        G10.g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        G10.f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap g(Map map, Comparator comparator) {
        G10.g(map, "<this>");
        G10.g(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
