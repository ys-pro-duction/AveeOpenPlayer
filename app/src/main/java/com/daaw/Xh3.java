package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Xh3 implements Iterator {
    public final Iterator B;
    public final /* synthetic */ Zh3 C;

    public Xh3(Zh3 zh3) {
        this.C = zh3;
        this.B = zh3.B.iterator();
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
