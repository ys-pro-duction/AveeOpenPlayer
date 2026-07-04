package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A00 implements Iterator, InterfaceC9783y60 {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
