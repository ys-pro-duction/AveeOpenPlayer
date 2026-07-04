package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class P91 extends AbstractList implements RandomAccess, InterfaceC6558mb0 {
    public final InterfaceC6558mb0 B;

    public class a implements ListIterator {
        public ListIterator B;
        public final /* synthetic */ int C;

        public a(int i) {
            this.C = i;
            this.B = P91.this.B.listIterator(i);
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
            this.B = P91.this.B.iterator();
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

    public P91(InterfaceC6558mb0 interfaceC6558mb0) {
        this.B = interfaceC6558mb0;
    }

    @Override // com.daaw.InterfaceC6558mb0
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

    @Override // com.daaw.InterfaceC6558mb0
    public void r(AbstractC4629fi abstractC4629fi) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.B.size();
    }

    @Override // com.daaw.InterfaceC6558mb0
    public AbstractC4629fi x(int i) {
        return this.B.x(i);
    }

    @Override // com.daaw.InterfaceC6558mb0
    public InterfaceC6558mb0 j() {
        return this;
    }
}
