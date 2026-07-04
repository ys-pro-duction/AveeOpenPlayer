package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MI2 implements Iterator {
    public final Iterator B;
    public final /* synthetic */ C8439tJ2 C;

    public MI2(C8439tJ2 c8439tJ2) {
        this.C = c8439tJ2;
        this.B = c8439tJ2.B.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.B.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
