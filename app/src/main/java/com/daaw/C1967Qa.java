package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1967Qa implements Iterator, InterfaceC9783y60 {
    public final Object[] B;
    public int C;

    public C1967Qa(Object[] objArr) {
        G10.g(objArr, "array");
        this.B = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.C < this.B.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.B;
            int i = this.C;
            this.C = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.C--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
