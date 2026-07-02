package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1392Km {
    public static final void a(Collection collection, Object obj) {
        G10.g(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    public static final int b(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final List c(ArrayList arrayList) {
        G10.g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return AbstractC1599Mm.k();
        }
        if (size == 1) {
            return AbstractC1496Lm.e(AbstractC2455Um.e0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Map d(Iterable iterable) {
        G10.g(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final HashMap e(int i) {
        return new HashMap(b(i));
    }

    public static final HashSet f(int i) {
        return new HashSet(b(i));
    }

    public static final LinkedHashSet g(int i) {
        return new LinkedHashSet(b(i));
    }
}
