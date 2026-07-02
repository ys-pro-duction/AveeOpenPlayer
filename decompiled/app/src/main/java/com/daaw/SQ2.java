package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SQ2 implements Iterator {
    public final Iterator B;

    public SQ2(Iterator it) {
        it.getClass();
        this.B = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.B.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.B.remove();
    }
}
