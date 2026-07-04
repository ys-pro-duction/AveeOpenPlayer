package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ZP2 extends UQ2 {
    public boolean B;
    public final /* synthetic */ Object C;

    public ZP2(Object obj) {
        this.C = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.B;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.B) {
            throw new NoSuchElementException();
        }
        this.B = true;
        return this.C;
    }
}
