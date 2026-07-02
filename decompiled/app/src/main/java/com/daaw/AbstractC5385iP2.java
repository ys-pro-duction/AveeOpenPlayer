package com.daaw;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.iP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5385iP2 extends AbstractCollection {
    public final Collection B;
    public final InterfaceC5661jO2 C;

    public AbstractC5385iP2(Collection collection, InterfaceC5661jO2 interfaceC5661jO2) {
        this.B = collection;
        this.C = interfaceC5661jO2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        AbstractC5381iO2.e(this.C.zza(obj));
        return this.B.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC5381iO2.e(this.C.zza(it.next()));
        }
        return this.B.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        UP2.a(this.B, this.C);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (AbstractC5665jP2.a(this.B, obj)) {
            return this.C.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC5661jO2 interfaceC5661jO2 = this.C;
        Iterator it = this.B.iterator();
        AbstractC5381iO2.c(interfaceC5661jO2, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC5661jO2.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.B.iterator();
        it.getClass();
        InterfaceC5661jO2 interfaceC5661jO2 = this.C;
        interfaceC5661jO2.getClass();
        return new VP2(it, interfaceC5661jO2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.B.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.B.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.C.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.B.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.C.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.B.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.C.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC3428bQ2.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC3428bQ2.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
