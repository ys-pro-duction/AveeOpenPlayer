package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H implements Iterator, InterfaceC9783y60 {
    public int B;
    public Object C;

    public abstract void b();

    public final void d() {
        this.B = 2;
    }

    public final void e(Object obj) {
        this.C = obj;
        this.B = 1;
    }

    public final boolean f() {
        this.B = 3;
        b();
        return this.B == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.B;
        if (i == 0) {
            return f();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.B;
        if (i == 1) {
            this.B = 0;
            return this.C;
        }
        if (i == 2 || !f()) {
            throw new NoSuchElementException();
        }
        this.B = 0;
        return this.C;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
