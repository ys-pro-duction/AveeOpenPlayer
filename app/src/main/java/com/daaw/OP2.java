package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OP2 extends JP2 implements List, RandomAccess {
    public static final VQ2 C = new MP2(EQ2.F, 0);

    public static OP2 G(Object[] objArr, int i) {
        return i == 0 ? EQ2.F : new EQ2(objArr, i);
    }

    public static OP2 H(Collection collection) {
        if (!(collection instanceof JP2)) {
            Object[] array = collection.toArray();
            int length = array.length;
            CQ2.b(array, length);
            return G(array, length);
        }
        OP2 op2W = ((JP2) collection).w();
        if (!op2W.D()) {
            return op2W;
        }
        Object[] array2 = op2W.toArray();
        return G(array2, array2.length);
    }

    public static OP2 I(Object[] objArr) {
        if (objArr.length == 0) {
            return EQ2.F;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        CQ2.b(objArr2, length);
        return G(objArr2, length);
    }

    public static OP2 J() {
        return EQ2.F;
    }

    public static OP2 K(Object obj) {
        Object[] objArr = {obj};
        CQ2.b(objArr, 1);
        return G(objArr, 1);
    }

    public static OP2 L(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        CQ2.b(objArr, 2);
        return G(objArr, 2);
    }

    public static OP2 M(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        CQ2.b(objArr, 3);
        return G(objArr, 3);
    }

    public static OP2 N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        CQ2.b(objArr, 5);
        return G(objArr, 5);
    }

    public static OP2 O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        CQ2.b(objArr, 6);
        return G(objArr, 6);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public OP2 subList(int i, int i2) {
        AbstractC5381iO2.h(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? EQ2.F : new NP2(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final VQ2 listIterator(int i) {
        AbstractC5381iO2.b(i, size(), "index");
        return isEmpty() ? C : new MP2(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.JP2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.daaw.JP2
    public int e(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!AbstractC3977dO2.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC3977dO2.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.JP2
    public final UQ2 y() {
        return listIterator(0);
    }

    @Override // com.daaw.JP2
    public final OP2 w() {
        return this;
    }
}
