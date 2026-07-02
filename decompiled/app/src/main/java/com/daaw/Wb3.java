package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class Wb3 extends AbstractC6287lc3 {
    public boolean B;
    public final /* synthetic */ Object C;

    public Wb3(Object obj) {
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
