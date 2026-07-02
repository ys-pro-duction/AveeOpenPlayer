package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.tJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8437tJ0 extends V {
    public final List B;

    /* JADX INFO: renamed from: com.daaw.tJ0$a */
    public static final class a implements ListIterator, InterfaceC9783y60 {
        public final ListIterator B;

        public a(int i) {
            this.B = C8437tJ0.this.B.listIterator(AbstractC2247Sm.T(C8437tJ0.this, i));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.B.add(obj);
            this.B.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.B.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.B.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.B.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return AbstractC2247Sm.S(C8437tJ0.this, this.B.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.B.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC2247Sm.S(C8437tJ0.this, this.B.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.B.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.B.set(obj);
        }
    }

    public C8437tJ0(List list) {
        G10.g(list, "delegate");
        this.B = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        this.B.add(AbstractC2247Sm.T(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.B.clear();
    }

    @Override // com.daaw.V
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.B.get(AbstractC2247Sm.R(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.daaw.V
    public Object s(int i) {
        return this.B.remove(AbstractC2247Sm.R(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        return this.B.set(AbstractC2247Sm.R(this, i), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new a(i);
    }
}
