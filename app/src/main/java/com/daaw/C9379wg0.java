package com.daaw;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.wg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9379wg0 extends U implements Collection, InterfaceC10062z60 {
    public final C8535tg0 B;

    public C9379wg0(C8535tg0 c8535tg0) {
        G10.g(c8535tg0, "backing");
        this.B = c8535tg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.B.containsValue(obj);
    }

    @Override // com.daaw.U
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.B.X();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.B.V(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.retainAll(collection);
    }
}
