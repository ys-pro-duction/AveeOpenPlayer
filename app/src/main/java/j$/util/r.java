package j$.util;

import j$.util.Collection;
import j$.util.stream.AbstractC10497t1;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends C10531u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C10394l, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.a, new C10397o(0, consumer));
    }

    @Override // j$.util.C10394l, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new C10399q(Collection.EL.b(this.a));
    }

    @Override // j$.util.C10394l, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC10497t1.a0(spliterator(), false);
    }

    @Override // j$.util.C10394l, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC10497t1.a0(spliterator(), true);
    }

    @Override // j$.util.C10394l, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C10393k(this);
    }

    @Override // j$.util.C10394l, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C10398p((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // j$.util.C10394l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C10398p((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C10394l, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains(new C10398p((Map.Entry) obj));
    }

    @Override // j$.util.C10394l, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C10531u, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
