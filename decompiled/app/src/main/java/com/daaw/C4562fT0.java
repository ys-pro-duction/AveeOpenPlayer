package com.daaw;

/* JADX INFO: renamed from: com.daaw.fT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4562fT0 extends K {
    public final Object D;

    public C4562fT0(Object obj, int i) {
        super(i, 1);
        this.D = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        g(e() + 1);
        return this.D;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        g(e() - 1);
        return this.D;
    }
}
