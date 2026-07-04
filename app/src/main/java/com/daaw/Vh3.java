package com.daaw;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Vh3 implements ListIterator {
    public final ListIterator B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Zh3 D;

    public Vh3(Zh3 zh3, int i) {
        this.D = zh3;
        this.C = i;
        this.B = zh3.B.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.B.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.B.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.B.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.B.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.B.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
