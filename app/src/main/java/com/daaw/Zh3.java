package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class Zh3 extends AbstractList implements RandomAccess, Rf3 {
    public final Rf3 B;

    public Zh3(Rf3 rf3) {
        this.B = rf3;
    }

    @Override // com.daaw.Rf3
    public final Object d(int i) {
        return this.B.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((Of3) this.B).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Xh3(this);
    }

    @Override // com.daaw.Rf3
    public final void k(AbstractC9646xd3 abstractC9646xd3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new Vh3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }

    @Override // com.daaw.Rf3
    public final List zzh() {
        return this.B.zzh();
    }

    @Override // com.daaw.Rf3
    public final Rf3 zze() {
        return this;
    }
}
