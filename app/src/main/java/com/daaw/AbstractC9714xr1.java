package com.daaw;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: com.daaw.xr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9714xr1 extends AbstractC1510Lp1 implements List, RandomAccess, j$.util.List {
    public static final AbstractC5883kA1 C = new C5507iq1(C5530iv1.F, 0);

    public static AbstractC9714xr1 F(Object[] objArr, int i) {
        return i == 0 ? C5530iv1.F : new C5530iv1(objArr, i);
    }

    public static AbstractC9714xr1 G(Collection collection) {
        if (collection instanceof AbstractC1510Lp1) {
            AbstractC9714xr1 abstractC9714xr1W = ((AbstractC1510Lp1) collection).w();
            if (!abstractC9714xr1W.y()) {
                return abstractC9714xr1W;
            }
            Object[] array = abstractC9714xr1W.toArray();
            return F(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                throw new NullPointerException("at index " + i);
            }
        }
        return F(array2, array2.length);
    }

    public static AbstractC9714xr1 H() {
        return C5530iv1.F;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC9714xr1 subList(int i, int i2) {
        AbstractC1601Mm1.d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C5530iv1.F : new C1929Pq1(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final AbstractC5883kA1 listIterator(int i) {
        AbstractC1601Mm1.b(i, size(), "index");
        return isEmpty() ? C : new C5507iq1(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.AbstractC1510Lp1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public int e(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
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
                if (!Dt3.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Dt3.a(it.next(), it2.next())) {
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

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final AbstractC9714xr1 w() {
        return this;
    }
}
