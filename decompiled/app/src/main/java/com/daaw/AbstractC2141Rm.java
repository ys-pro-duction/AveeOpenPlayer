package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.Rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2141Rm extends AbstractC2037Qm {
    public static boolean A(Collection collection, Iterable iterable) {
        G10.g(collection, "<this>");
        G10.g(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static boolean B(Collection collection, Object[] objArr) {
        G10.g(collection, "<this>");
        G10.g(objArr, "elements");
        return collection.addAll(AbstractC5152hb.d(objArr));
    }

    public static final Collection C(Iterable iterable) {
        G10.g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : AbstractC2455Um.M0(iterable);
    }

    public static final boolean D(Iterable iterable, NQ nq, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) nq.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean E(List list, NQ nq, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            G10.e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return D(V71.b(list), nq, z);
        }
        int iM = AbstractC1599Mm.m(list);
        if (iM >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (((Boolean) nq.invoke(obj)).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iM) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iM2 = AbstractC1599Mm.m(list);
        if (i > iM2) {
            return true;
        }
        while (true) {
            list.remove(iM2);
            if (iM2 == i) {
                return true;
            }
            iM2--;
        }
    }

    public static final boolean F(Collection collection, Iterable iterable) {
        G10.g(collection, "<this>");
        G10.g(iterable, "elements");
        return collection.removeAll(C(iterable));
    }

    public static boolean G(List list, NQ nq) {
        G10.g(list, "<this>");
        G10.g(nq, "predicate");
        return E(list, nq, true);
    }

    public static Object H(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object I(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object J(List list) {
        G10.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC1599Mm.m(list));
    }

    public static boolean K(Iterable iterable, NQ nq) {
        G10.g(iterable, "<this>");
        G10.g(nq, "predicate");
        return D(iterable, nq, false);
    }

    public static final boolean L(Collection collection, Iterable iterable) {
        G10.g(collection, "<this>");
        G10.g(iterable, "elements");
        return collection.retainAll(C(iterable));
    }
}
