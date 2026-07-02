package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ug0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8814ug0 extends P {
    public final C8535tg0 B;

    public C8814ug0(C8535tg0 c8535tg0) {
        G10.g(c8535tg0, "backing");
        this.B = c8535tg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        G10.g(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        return this.B.s(collection);
    }

    @Override // com.daaw.X
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.B.B();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.retainAll(collection);
    }

    @Override // com.daaw.P
    public boolean w(Map.Entry entry) {
        G10.g(entry, "element");
        return this.B.w(entry);
    }

    @Override // com.daaw.P
    public boolean y(Map.Entry entry) {
        G10.g(entry, "element");
        return this.B.R(entry);
    }
}
