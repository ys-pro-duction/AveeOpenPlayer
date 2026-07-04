package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.he0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5168he0 implements Iterator, InterfaceC9783y60 {
    public abstract long b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
