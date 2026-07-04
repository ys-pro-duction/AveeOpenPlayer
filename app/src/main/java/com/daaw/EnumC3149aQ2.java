package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.aQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3149aQ2 implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC5381iO2.j(false, "no calls to next() since the last call to remove()");
    }
}
