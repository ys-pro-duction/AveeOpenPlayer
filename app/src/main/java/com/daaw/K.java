package com.daaw;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class K implements ListIterator, InterfaceC9783y60 {
    public int B;
    public int C;

    public K(int i, int i2) {
        this.B = i;
        this.C = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int e() {
        return this.B;
    }

    public final int f() {
        return this.C;
    }

    public final void g(int i) {
        this.B = i;
    }

    public final void h(int i) {
        this.C = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.B < this.C;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.B > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.B;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.B - 1;
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
