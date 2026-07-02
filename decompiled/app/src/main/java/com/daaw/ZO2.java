package com.daaw;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ZO2 implements Iterator {
    public final Iterator B;
    public final Collection C;
    public final /* synthetic */ AbstractC3145aP2 D;

    public ZO2(AbstractC3145aP2 abstractC3145aP2, Iterator it) {
        this.D = abstractC3145aP2;
        this.C = abstractC3145aP2.C;
        this.B = it;
    }

    public final void a() {
        this.D.zzb();
        if (this.D.C != this.C) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.B.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.B.remove();
        AbstractC3981dP2 abstractC3981dP2 = this.D.F;
        abstractC3981dP2.F--;
        this.D.m();
    }

    public ZO2(AbstractC3145aP2 abstractC3145aP2) {
        this.D = abstractC3145aP2;
        Collection collection = abstractC3145aP2.C;
        this.C = collection;
        this.B = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
