package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4903gh extends K {
    public final Object[] D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4903gh(Object[] objArr, int i, int i2) {
        super(i, i2);
        G10.g(objArr, "buffer");
        this.D = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.D;
        int iE = e();
        g(iE + 1);
        return objArr[iE];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.D;
        g(e() - 1);
        return objArr[e()];
    }
}
