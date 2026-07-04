package com.daaw;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class NY implements List, RandomAccess {
    public final List B;

    public NY(List list) {
        this.B = DesugarCollections.unmodifiableList(list);
    }

    public static NY e(List list) {
        return new NY(list);
    }

    public static NY m(Object... objArr) {
        return new NY(Arrays.asList(objArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.B.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.B.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.B.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.B.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.B.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.B.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.B.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.B.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.B.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.B.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.B.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.B.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.B.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.B.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.B.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.B.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.B.size();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return this.B.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.B.toArray();
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.B.add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return this.B.addAll(i, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return this.B.listIterator(i);
    }

    @Override // java.util.List
    public Object remove(int i) {
        return this.B.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.B.toArray(objArr);
    }
}
