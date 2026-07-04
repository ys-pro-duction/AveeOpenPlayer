package com.daaw;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class UY0 implements List, InterfaceC10062z60 {
    public final C9325wU0 B;
    public final int C;
    public int D;
    public int E;

    public static final class a implements ListIterator, InterfaceC9783y60 {
        public final /* synthetic */ C6190lF0 B;
        public final /* synthetic */ UY0 C;

        public a(C6190lF0 c6190lF0, UY0 uy0) {
            this.B = c6190lF0;
            this.C = uy0;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void add(Object obj) {
            AbstractC9604xU0.d();
            throw new D80();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            AbstractC9604xU0.d();
            throw new D80();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void set(Object obj) {
            AbstractC9604xU0.d();
            throw new D80();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.B.B < this.C.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.B.B >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i = this.B.B + 1;
            AbstractC9604xU0.e(i, this.C.size());
            this.B.B = i;
            return this.C.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.B.B + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.B.B;
            AbstractC9604xU0.e(i, this.C.size());
            this.B.B = i - 1;
            return this.C.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.B.B;
        }
    }

    public UY0(C9325wU0 c9325wU0, int i, int i2) {
        G10.g(c9325wU0, "parentList");
        this.B = c9325wU0;
        this.C = i;
        this.D = c9325wU0.s();
        this.E = i2 - i;
    }

    private final void p() {
        if (this.B.s() != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        p();
        this.B.add(this.C + size(), obj);
        this.E = size() + 1;
        this.D = this.B.s();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        G10.g(collection, "elements");
        p();
        boolean zAddAll = this.B.addAll(i + this.C, collection);
        if (zAddAll) {
            this.E = size() + collection.size();
            this.D = this.B.s();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            p();
            C9325wU0 c9325wU0 = this.B;
            int i = this.C;
            c9325wU0.E(i, size() + i);
            this.E = 0;
            this.D = this.B.s();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.E;
    }

    @Override // java.util.List
    public Object get(int i) {
        p();
        AbstractC9604xU0.e(i, size());
        return this.B.get(this.C + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        p();
        int i = this.C;
        Iterator it = AbstractC8417tE0.q(i, size() + i).iterator();
        while (it.hasNext()) {
            int iB = ((A00) it).b();
            if (G10.c(obj, this.B.get(iB))) {
                return iB - this.C;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        p();
        int size = this.C + size();
        do {
            size--;
            if (size < this.C) {
                return -1;
            }
        } while (!G10.c(obj, this.B.get(size)));
        return size - this.C;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object m(int i) {
        p();
        Object objRemove = this.B.remove(this.C + i);
        this.E = size() - 1;
        this.D = this.B.s();
        return objRemove;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return m(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z;
        G10.g(collection, "elements");
        Iterator it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z = remove(it.next()) || z;
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        G10.g(collection, "elements");
        p();
        C9325wU0 c9325wU0 = this.B;
        int i = this.C;
        int iF = c9325wU0.F(collection, i, size() + i);
        if (iF > 0) {
            this.D = this.B.s();
            this.E = size() - iF;
        }
        return iF > 0;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        AbstractC9604xU0.e(i, size());
        p();
        Object obj2 = this.B.set(i + this.C, obj);
        this.D = this.B.s();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p();
        C9325wU0 c9325wU0 = this.B;
        int i3 = this.C;
        return new UY0(c9325wU0, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        p();
        C6190lF0 c6190lF0 = new C6190lF0();
        c6190lF0.B = i - 1;
        return new a(c6190lF0, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        p();
        this.B.add(this.C + i, obj);
        this.E = size() + 1;
        this.D = this.B.s();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        return addAll(size(), collection);
    }
}
