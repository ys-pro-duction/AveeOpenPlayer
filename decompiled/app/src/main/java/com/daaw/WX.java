package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class WX implements Set, InterfaceC9783y60 {
    public int B;
    public Object[] C = new Object[16];

    public static final class a implements Iterator, InterfaceC9783y60 {
        public int B;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B < WX.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArrS = WX.this.s();
            int i = this.B;
            this.B = i + 1;
            Object obj = objArrS[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int iE;
        G10.g(obj, "value");
        if (size() > 0) {
            iE = e(obj);
            if (iE >= 0) {
                return false;
            }
        } else {
            iE = -1;
        }
        int i = -(iE + 1);
        int size = size();
        Object[] objArr = this.C;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            AbstractC5152hb.h(objArr, objArr2, i + 1, i, size());
            AbstractC5152hb.k(this.C, objArr2, 0, 0, i, 6, null);
            this.C = objArr2;
        } else {
            AbstractC5152hb.h(objArr, objArr, i + 1, i, size());
        }
        this.C[i] = obj;
        w(size() + 1);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int size = size();
        for (int i = 0; i < size; i++) {
            this.C[i] = null;
        }
        w(0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && e(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
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

    public final int e(Object obj) {
        int size = size() - 1;
        int iA = O2.a(obj);
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = get(i2);
            int iA2 = O2.a(obj2);
            if (iA2 < iA) {
                i = i2 + 1;
            } else {
                if (iA2 <= iA) {
                    return obj2 == obj ? i2 : m(i2, obj, iA);
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public final Object get(int i) {
        Object obj = this.C[i];
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        return -(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(int r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            int r0 = r3 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L16
            java.lang.Object[] r1 = r2.C
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return r0
        Lc:
            int r1 = com.daaw.O2.a(r1)
            if (r1 == r5) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L2
        L16:
            int r3 = r3 + 1
            int r0 = r2.size()
        L1c:
            if (r3 >= r0) goto L32
            java.lang.Object[] r1 = r2.C
            r1 = r1[r3]
            if (r1 != r4) goto L25
            return r3
        L25:
            int r1 = com.daaw.O2.a(r1)
            if (r1 == r5) goto L2f
        L2b:
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        L2f:
            int r3 = r3 + 1
            goto L1c
        L32:
            int r3 = r2.size()
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.WX.m(int, java.lang.Object, int):int");
    }

    public int p() {
        return this.B;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int iE;
        if (obj == null || (iE = e(obj)) < 0) {
            return false;
        }
        if (iE < size() - 1) {
            Object[] objArr = this.C;
            AbstractC5152hb.h(objArr, objArr, iE, iE + 1, size());
        }
        w(size() - 1);
        this.C[size()] = null;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] s() {
        return this.C;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return p();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    public final boolean v() {
        return size() > 0;
    }

    public void w(int i) {
        this.B = i;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }
}
