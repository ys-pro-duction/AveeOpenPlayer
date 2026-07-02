package com.daaw;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.uJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8716uJ0 extends J {
    public final List C;

    /* JADX INFO: renamed from: com.daaw.uJ0$a */
    public static final class a implements ListIterator, InterfaceC9783y60 {
        public final ListIterator B;

        public a(int i) {
            this.B = C8716uJ0.this.C.listIterator(AbstractC2247Sm.T(C8716uJ0.this, i));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            return AbstractC2247Sm.S(C8716uJ0.this, this.B.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.B.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC2247Sm.S(C8716uJ0.this, this.B.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8716uJ0(List list) {
        G10.g(list, "delegate");
        this.C = list;
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.C.size();
    }

    @Override // com.daaw.J, java.util.List
    public Object get(int i) {
        return this.C.get(AbstractC2247Sm.R(this, i));
    }

    @Override // com.daaw.J, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.daaw.J, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.daaw.J, java.util.List
    public ListIterator listIterator(int i) {
        return new a(i);
    }
}
