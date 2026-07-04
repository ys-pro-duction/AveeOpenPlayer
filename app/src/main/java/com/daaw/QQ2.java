package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QQ2 {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set b(Set set, InterfaceC5661jO2 interfaceC5661jO2) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof NQ2)) {
                set.getClass();
                return new NQ2(set, interfaceC5661jO2);
            }
            NQ2 nq2 = (NQ2) set;
            return new NQ2(nq2.B, AbstractC7623qO2.a(nq2.C, interfaceC5661jO2));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof NQ2)) {
            sortedSet.getClass();
            return new OQ2(sortedSet, interfaceC5661jO2);
        }
        NQ2 nq22 = (NQ2) sortedSet;
        return new OQ2((SortedSet) nq22.B, AbstractC7623qO2.a(nq22.C, interfaceC5661jO2));
    }

    public static boolean c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean d(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC9311wQ2) {
            collection = ((InterfaceC9311wQ2) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean e(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
