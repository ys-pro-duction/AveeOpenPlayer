package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.vZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9065vZ implements Iterator, InterfaceC9783y60 {
    public final Iterator B;
    public int C;

    public C9065vZ(Iterator it) {
        G10.g(it, "iterator");
        this.B = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8500tZ next() {
        int i = this.C;
        this.C = i + 1;
        if (i < 0) {
            AbstractC1599Mm.u();
        }
        return new C8500tZ(i, this.B.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
