package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class A53 implements Iterator {
    public final Iterator B;
    public final /* synthetic */ B53 C;

    public A53(B53 b53) {
        this.C = b53;
        this.B = b53.B.iterator();
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
