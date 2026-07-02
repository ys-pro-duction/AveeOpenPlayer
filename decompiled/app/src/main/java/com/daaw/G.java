package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G extends R91 {
    public final int B;
    public int C;

    public G(int i, int i2) {
        AbstractC7785qy0.q(i2, i);
        this.B = i;
        this.C = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.C < this.B;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.C > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.C;
        this.C = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.C;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.C - 1;
        this.C = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.C - 1;
    }
}
