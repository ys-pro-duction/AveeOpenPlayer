package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Rb3 extends AbstractC9636xb3 implements List, RandomAccess {
    public static final AbstractC7124oc3 C = new Db3(C3757cc3.F, 0);

    public static Rb3 D(Object[] objArr, int i) {
        return i == 0 ? C3757cc3.F : new C3757cc3(objArr, i);
    }

    public static Rb3 E(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        Zb3.b(objArr, 2);
        return D(objArr, 2);
    }

    public static Rb3 F(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"auto", "app", "am"};
        Zb3.b(objArr, 3);
        return D(objArr, 3);
    }

    public static Rb3 G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        Zb3.b(objArr, 7);
        return D(objArr, 7);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final AbstractC7124oc3 listIterator(int i) {
        Ka3.b(i, size(), "index");
        return isEmpty() ? C : new Db3(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.AbstractC9636xb3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.daaw.AbstractC9636xb3
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
                if (!Ea3.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Ea3.a(it.next(), it2.next())) {
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

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Rb3 subList(int i, int i2) {
        Ka3.c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? C3757cc3.F : new Gb3(this, i, i3);
    }
}
