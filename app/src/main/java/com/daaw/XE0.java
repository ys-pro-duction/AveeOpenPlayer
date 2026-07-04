package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class XE0 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static final boolean a(Map map, Object obj, Object obj2) {
        G10.g(map, "<this>");
        Object arrayList = map.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(obj, arrayList);
        }
        return ((List) arrayList).add(obj2);
    }

    public static final Object b(Map map, Object obj) {
        G10.g(map, "<this>");
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object objH = AbstractC2141Rm.H(list);
        if (list.isEmpty()) {
            map.remove(obj);
        }
        return objH;
    }
}
