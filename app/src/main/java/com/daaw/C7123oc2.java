package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.oc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7123oc2 extends AbstractC1155Ie2 {
    public boolean B;
    public final /* synthetic */ Object C;

    public C7123oc2(Object obj) {
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
