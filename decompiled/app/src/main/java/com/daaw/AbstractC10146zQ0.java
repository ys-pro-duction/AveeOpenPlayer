package com.daaw;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.zQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10146zQ0 extends AbstractC9867yQ0 {
    public static Set h(Set set, Iterable iterable) {
        G10.g(set, "<this>");
        G10.g(iterable, "elements");
        Collection<?> collectionC = AbstractC2141Rm.C(iterable);
        if (collectionC.isEmpty()) {
            return AbstractC2455Um.Q0(set);
        }
        if (!(collectionC instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionC);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!collectionC.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set i(Set set, Object obj) {
        G10.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1369Kg0.d(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && G10.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set j(Set set, Iterable iterable) {
        int size;
        G10.g(set, "<this>");
        G10.g(iterable, "elements");
        Integer numW = AbstractC1703Nm.w(iterable);
        if (numW != null) {
            size = set.size() + numW.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1369Kg0.d(size));
        linkedHashSet.addAll(set);
        AbstractC2141Rm.A(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set k(Set set, Object obj) {
        G10.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1369Kg0.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
