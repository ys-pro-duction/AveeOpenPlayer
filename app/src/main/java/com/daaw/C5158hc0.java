package com.daaw;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.hc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5158hc0 extends V implements List, RandomAccess, Serializable, InterfaceC10062z60 {
    public static final b E = new b(null);
    public static final C5158hc0 F;
    public Object[] B;
    public int C;
    public boolean D;

    /* JADX INFO: renamed from: com.daaw.hc0$a */
    public static final class a extends V implements List, RandomAccess, Serializable, InterfaceC10062z60 {
        public Object[] B;
        public final int C;
        public int D;
        public final a E;
        public final C5158hc0 F;

        /* JADX INFO: renamed from: com.daaw.hc0$a$a, reason: collision with other inner class name */
        public static final class C0185a implements ListIterator, InterfaceC9783y60 {
            public final a B;
            public int C;
            public int D;
            public int E;

            public C0185a(a aVar, int i) {
                G10.g(aVar, "list");
                this.B = aVar;
                this.C = i;
                this.D = -1;
                this.E = ((AbstractList) aVar).modCount;
            }

            private final void b() {
                if (((AbstractList) this.B.F).modCount != this.E) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                b();
                a aVar = this.B;
                int i = this.C;
                this.C = i + 1;
                aVar.add(i, obj);
                this.D = -1;
                this.E = ((AbstractList) this.B).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.C < this.B.D;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.C > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                b();
                if (this.C >= this.B.D) {
                    throw new NoSuchElementException();
                }
                int i = this.C;
                this.C = i + 1;
                this.D = i;
                return this.B.B[this.B.C + this.D];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.C;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                b();
                int i = this.C;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.C = i2;
                this.D = i2;
                return this.B.B[this.B.C + this.D];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.C - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i = this.D;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.B.remove(i);
                this.C = this.D;
                this.D = -1;
                this.E = ((AbstractList) this.B).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                b();
                int i = this.D;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.B.set(i, obj);
            }
        }

        public a(Object[] objArr, int i, int i2, a aVar, C5158hc0 c5158hc0) {
            G10.g(objArr, "backing");
            G10.g(c5158hc0, "root");
            this.B = objArr;
            this.C = i;
            this.D = i2;
            this.E = aVar;
            this.F = c5158hc0;
            ((AbstractList) this).modCount = ((AbstractList) c5158hc0).modCount;
        }

        private final void I() {
            if (((AbstractList) this.F).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void M() {
            ((AbstractList) this).modCount++;
        }

        public final void G(int i, Collection collection, int i2) {
            M();
            a aVar = this.E;
            if (aVar != null) {
                aVar.G(i, collection, i2);
            } else {
                this.F.K(i, collection, i2);
            }
            this.B = this.F.B;
            this.D += i2;
        }

        public final void H(int i, Object obj) {
            M();
            a aVar = this.E;
            if (aVar != null) {
                aVar.H(i, obj);
            } else {
                this.F.L(i, obj);
            }
            this.B = this.F.B;
            this.D++;
        }

        public final void J() {
            if (L()) {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean K(List list) {
            return AbstractC5437ic0.h(this.B, this.C, this.D, list);
        }

        public final boolean L() {
            return this.F.D;
        }

        public final Object N(int i) {
            M();
            a aVar = this.E;
            this.D--;
            return aVar != null ? aVar.N(i) : this.F.T(i);
        }

        public final void O(int i, int i2) {
            if (i2 > 0) {
                M();
            }
            a aVar = this.E;
            if (aVar != null) {
                aVar.O(i, i2);
            } else {
                this.F.U(i, i2);
            }
            this.D -= i2;
        }

        public final int P(int i, int i2, Collection collection, boolean z) {
            a aVar = this.E;
            int iP = aVar != null ? aVar.P(i, i2, collection, z) : this.F.V(i, i2, collection, z);
            if (iP > 0) {
                M();
            }
            this.D -= iP;
            return iP;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            J();
            I();
            H(this.C + this.D, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            G10.g(collection, "elements");
            J();
            I();
            int size = collection.size();
            G(this.C + this.D, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            J();
            I();
            O(this.C, this.D);
        }

        @Override // com.daaw.V
        public int e() {
            I();
            return this.D;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            I();
            if (obj != this) {
                return (obj instanceof List) && K((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            I();
            J.B.a(i, this.D);
            return this.B[this.C + i];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            I();
            return AbstractC5437ic0.i(this.B, this.C, this.D);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            I();
            for (int i = 0; i < this.D; i++) {
                if (G10.c(this.B[this.C + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            I();
            return this.D == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            I();
            for (int i = this.D - 1; i >= 0; i--) {
                if (G10.c(this.B[this.C + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            J();
            I();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection collection) {
            G10.g(collection, "elements");
            J();
            I();
            return P(this.C, this.D, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection collection) {
            G10.g(collection, "elements");
            J();
            I();
            return P(this.C, this.D, collection, true) > 0;
        }

        @Override // com.daaw.V
        public Object s(int i) {
            J();
            I();
            J.B.a(i, this.D);
            return N(this.C + i);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            J();
            I();
            J.B.a(i, this.D);
            Object[] objArr = this.B;
            int i2 = this.C;
            Object obj2 = objArr[i2 + i];
            objArr[i2 + i] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            J.B.c(i, i2, this.D);
            return new a(this.B, this.C + i, i2 - i, this, this.F);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] objArr) {
            G10.g(objArr, "array");
            I();
            int length = objArr.length;
            int i = this.D;
            if (length >= i) {
                Object[] objArr2 = this.B;
                int i2 = this.C;
                AbstractC5152hb.h(objArr2, objArr, 0, i2, i + i2);
                return AbstractC1496Lm.f(this.D, objArr);
            }
            Object[] objArr3 = this.B;
            int i3 = this.C;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr3, i3, i + i3, objArr.getClass());
            G10.f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            I();
            return AbstractC5437ic0.j(this.B, this.C, this.D, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            I();
            J.B.b(i, this.D);
            return new C0185a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            J();
            I();
            J.B.b(i, this.D);
            H(this.C + i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection collection) {
            G10.g(collection, "elements");
            J();
            I();
            J.B.b(i, this.D);
            int size = collection.size();
            G(this.C + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            I();
            Object[] objArr = this.B;
            int i = this.C;
            return AbstractC5152hb.n(objArr, i, this.D + i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.hc0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.hc0$c */
    public static final class c implements ListIterator, InterfaceC9783y60 {
        public final C5158hc0 B;
        public int C;
        public int D;
        public int E;

        public c(C5158hc0 c5158hc0, int i) {
            G10.g(c5158hc0, "list");
            this.B = c5158hc0;
            this.C = i;
            this.D = -1;
            this.E = ((AbstractList) c5158hc0).modCount;
        }

        private final void b() {
            if (((AbstractList) this.B).modCount != this.E) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            C5158hc0 c5158hc0 = this.B;
            int i = this.C;
            this.C = i + 1;
            c5158hc0.add(i, obj);
            this.D = -1;
            this.E = ((AbstractList) this.B).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.C < this.B.C;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.C > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (this.C >= this.B.C) {
                throw new NoSuchElementException();
            }
            int i = this.C;
            this.C = i + 1;
            this.D = i;
            return this.B.B[this.D];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.C;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            int i = this.C;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.C = i2;
            this.D = i2;
            return this.B.B[this.D];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.C - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i = this.D;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.B.remove(i);
            this.C = this.D;
            this.D = -1;
            this.E = ((AbstractList) this.B).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            int i = this.D;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.B.set(i, obj);
        }
    }

    static {
        C5158hc0 c5158hc0 = new C5158hc0(0);
        c5158hc0.D = true;
        F = c5158hc0;
    }

    public C5158hc0(int i) {
        this.B = AbstractC5437ic0.d(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i, Collection collection, int i2) {
        S();
        R(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.B[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(int i, Object obj) {
        S();
        R(i, 1);
        this.B[i] = obj;
    }

    private final void N() {
        if (this.D) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean O(List list) {
        return AbstractC5437ic0.h(this.B, 0, this.C, list);
    }

    private final void S() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T(int i) {
        S();
        Object[] objArr = this.B;
        Object obj = objArr[i];
        AbstractC5152hb.h(objArr, objArr, i, i + 1, this.C);
        AbstractC5437ic0.f(this.B, this.C - 1);
        this.C--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int i, int i2) {
        if (i2 > 0) {
            S();
        }
        Object[] objArr = this.B;
        AbstractC5152hb.h(objArr, objArr, i, i + i2, this.C);
        Object[] objArr2 = this.B;
        int i3 = this.C;
        AbstractC5437ic0.g(objArr2, i3 - i2, i3);
        this.C -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int V(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.B[i5]) == z) {
                Object[] objArr = this.B;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.B;
        AbstractC5152hb.h(objArr2, objArr2, i + i4, i2 + i, this.C);
        Object[] objArr3 = this.B;
        int i7 = this.C;
        AbstractC5437ic0.g(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            S();
        }
        this.C -= i6;
        return i6;
    }

    public final List M() {
        N();
        this.D = true;
        return this.C > 0 ? this : F;
    }

    public final void P(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.B;
        if (i > objArr.length) {
            this.B = AbstractC5437ic0.e(this.B, J.B.d(objArr.length, i));
        }
    }

    public final void Q(int i) {
        P(this.C + i);
    }

    public final void R(int i, int i2) {
        Q(i2);
        Object[] objArr = this.B;
        AbstractC5152hb.h(objArr, objArr, i + i2, i, this.C);
        this.C += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        N();
        L(this.C, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        N();
        int size = collection.size();
        K(this.C, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        N();
        U(0, this.C);
    }

    @Override // com.daaw.V
    public int e() {
        return this.C;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && O((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        J.B.a(i, this.C);
        return this.B[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC5437ic0.i(this.B, 0, this.C);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.C; i++) {
            if (G10.c(this.B[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.C == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.C - 1; i >= 0; i--) {
            if (G10.c(this.B[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        N();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        G10.g(collection, "elements");
        N();
        return V(0, this.C, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        G10.g(collection, "elements");
        N();
        return V(0, this.C, collection, true) > 0;
    }

    @Override // com.daaw.V
    public Object s(int i) {
        N();
        J.B.a(i, this.C);
        return T(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        N();
        J.B.a(i, this.C);
        Object[] objArr = this.B;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i, int i2) {
        J.B.c(i, i2, this.C);
        return new a(this.B, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        int length = objArr.length;
        int i = this.C;
        if (length >= i) {
            AbstractC5152hb.h(this.B, objArr, 0, 0, i);
            return AbstractC1496Lm.f(this.C, objArr);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.B, 0, i, objArr.getClass());
        G10.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC5437ic0.j(this.B, 0, this.C, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        J.B.b(i, this.C);
        return new c(this, i);
    }

    public /* synthetic */ C5158hc0(int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        N();
        J.B.b(i, this.C);
        L(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        G10.g(collection, "elements");
        N();
        J.B.b(i, this.C);
        int size = collection.size();
        K(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC5152hb.n(this.B, 0, this.C);
    }
}
