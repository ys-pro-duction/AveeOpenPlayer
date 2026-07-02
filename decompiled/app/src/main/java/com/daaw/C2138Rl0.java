package com.daaw;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.Rl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2138Rl0 implements List {
    public List B;
    public List C;

    /* JADX INFO: renamed from: com.daaw.Rl0$a */
    public static class a implements KQ {
        @Override // com.daaw.KQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a() {
            return new C2138Rl0();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Rl0$b */
    public static class b implements Iterator {
        public Iterator B;
        public Iterator C;

        public b(Iterator it, Iterator it2) {
            this.B = it;
            this.C = it2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public B61 next() {
            return new B61(this.B.next(), this.C.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.B.remove();
            this.C.remove();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Rl0$c */
    public static class c implements ListIterator {
        public ListIterator B;
        public ListIterator C;

        public c(ListIterator listIterator, ListIterator listIterator2) {
            this.B = listIterator;
            this.C = listIterator2;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(B61 b61) {
            this.B.add(b61.a);
            this.C.add(b61.b);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B61 next() {
            return new B61(this.B.next(), this.C.next());
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public B61 previous() {
            return new B61(this.B.previous(), this.C.previous());
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(B61 b61) {
            this.B.set(b61.a);
            this.C.set(b61.b);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.B.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.B.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.B.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.B.remove();
            this.C.remove();
        }
    }

    public C2138Rl0() {
        this.B = new ArrayList();
        this.C = new ArrayList();
    }

    public static C2138Rl0 w(List list, Object obj) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(obj);
        }
        return new C2138Rl0(list, arrayList);
    }

    public Object D(int i) {
        return this.B.get(i);
    }

    public Object E(int i) {
        return this.C.get(i);
    }

    public Iterator F() {
        return this.B.iterator();
    }

    public c G() {
        return new c(this.B.listIterator(), this.C.listIterator());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public B61 remove(int i) {
        return new B61(this.B.remove(i), this.C.remove(i));
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public B61 set(int i, B61 b61) {
        return null;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C2138Rl0 subList(int i, int i2) {
        return new C2138Rl0(this.B.subList(i, i2), this.C.subList(i, i2));
    }

    public C2138Rl0 K() {
        return new C2138Rl0(DesugarCollections.unmodifiableList(this.B), DesugarCollections.unmodifiableList(this.C));
    }

    public List L() {
        return DesugarCollections.unmodifiableList(this.B);
    }

    public List M() {
        return DesugarCollections.unmodifiableList(this.C);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (!(collection instanceof C2138Rl0)) {
            return false;
        }
        C2138Rl0 c2138Rl0 = (C2138Rl0) collection;
        return this.C.addAll(i, c2138Rl0.C) | this.B.addAll(i, c2138Rl0.B);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.B.clear();
        this.C.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i, B61 b61) {
        this.B.add(i, b61.a);
        this.C.add(i, b61.b);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new b(this.B.iterator(), this.C.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new c(this.B.listIterator(i), this.C.listIterator(i));
    }

    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean add(B61 b61) {
        this.B.add(b61.a);
        this.C.add(b61.b);
        return true;
    }

    public boolean p(Object obj, Object obj2) {
        this.B.add(obj);
        this.C.add(obj2);
        return true;
    }

    public boolean q(int i, Collection collection, Collection collection2) {
        boolean zAddAll = this.B.addAll(i, collection);
        boolean zAddAll2 = this.C.addAll(i, collection2);
        AbstractC6278lb.a(this.B.size(), this.C.size());
        return zAddAll2 | zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return false;
    }

    public boolean s(Object obj) {
        return this.B.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        AbstractC6278lb.a(this.B.size(), this.C.size());
        return this.B.size();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.B.size()];
        for (int i = 0; i < this.B.size(); i++) {
            objArr[i] = new B61(this.B.get(i), this.C.get(i));
        }
        return objArr;
    }

    public boolean v(Object obj) {
        return this.C.contains(obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public B61 get(int i) {
        return new B61(this.B.get(i), this.C.get(i));
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(this.B.listIterator(), this.C.listIterator());
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return false;
    }

    public C2138Rl0(int i) {
        this.B = new ArrayList(i);
        this.C = new ArrayList(i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int i = 0;
        if (objArr.length < size()) {
            Object[] objArr2 = new Object[this.B.size()];
            while (i < this.B.size()) {
                objArr2[i] = new B61(this.B.get(i), this.C.get(i));
                i++;
            }
            return objArr2;
        }
        while (i < this.B.size()) {
            objArr[i] = new B61(this.B.get(i), this.C.get(i));
            i++;
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        if (!(collection instanceof C2138Rl0)) {
            return false;
        }
        C2138Rl0 c2138Rl0 = (C2138Rl0) collection;
        return this.C.addAll(c2138Rl0.C) | this.B.addAll(c2138Rl0.B);
    }

    public C2138Rl0(List list, List list2) {
        this.B = list;
        this.C = list2;
    }
}
