package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1448La implements Collection, InterfaceC9783y60 {
    public final Object[] B;
    public final boolean C;

    public C1448La(Object[] objArr, boolean z) {
        G10.g(objArr, DiagnosticsEntry.Histogram.VALUES_KEY);
        this.B = objArr;
        this.C = z;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC5431ib.B(this.B, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        G10.g(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.B.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.B.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2093Ra.a(this.B);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1496Lm.b(this.B, this.C);
    }
}
