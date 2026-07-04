package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class Q91 extends AbstractList implements InterfaceC6837nb0, RandomAccess {
    public final InterfaceC6837nb0 B;

    public class a implements ListIterator {
        public ListIterator B;
        public final /* synthetic */ int C;

        public a(int i) {
            this.C = i;
            this.B = Q91.this.B.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.B.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.B.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
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
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {
        public Iterator B;

        public b() {
            this.B = Q91.this.B.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.B.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Q91(InterfaceC6837nb0 interfaceC6837nb0) {
        this.B = interfaceC6837nb0;
    }

    @Override // com.daaw.InterfaceC6837nb0
    public Object A(int i) {
        return this.B.A(i);
    }

    @Override // com.daaw.InterfaceC6837nb0
    public List h() {
        return this.B.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.B.get(i);
    }

    @Override // com.daaw.InterfaceC6837nb0
    public void o(AbstractC4340ei abstractC4340ei) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.B.size();
    }

    @Override // com.daaw.InterfaceC6837nb0
    public InterfaceC6837nb0 j() {
        return this;
    }
}
