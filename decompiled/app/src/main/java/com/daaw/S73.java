package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class S73 extends AbstractList {
    public static final T73 D = T73.b(S73.class);
    public final List B;
    public final Iterator C;

    public S73(List list, Iterator it) {
        this.B = list;
        this.C = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.B.size() > i) {
            return this.B.get(i);
        }
        if (!this.C.hasNext()) {
            throw new NoSuchElementException();
        }
        this.B.add(this.C.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new R73(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        T73 t73 = D;
        t73.a("potentially expensive size() call");
        t73.a("blowup running");
        while (this.C.hasNext()) {
            this.B.add(this.C.next());
        }
        return this.B.size();
    }
}
