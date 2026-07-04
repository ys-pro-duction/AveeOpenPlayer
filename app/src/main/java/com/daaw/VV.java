package com.daaw;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes.dex */
public final class VV implements List, InterfaceC9783y60, j$.util.List {
    public Object[] B = new Object[16];
    public long[] C = new long[16];
    public int D = -1;
    public int E;

    public final class b implements List, InterfaceC9783y60, j$.util.List {
        public final int B;
        public final int C;

        public b(int i, int i2) {
            this.B = i;
            this.C = i2;
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            G10.g(collection, "elements");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int e() {
            return this.C - this.B;
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.util.List
        public Object get(int i) {
            return VV.this.B[i + this.B];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.B;
            int i2 = this.C;
            if (i > i2) {
                return -1;
            }
            while (!G10.c(VV.this.B[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.B;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            VV vv = VV.this;
            int i = this.B;
            return vv.new a(i, i, this.C);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.C;
            int i2 = this.B;
            if (i2 > i) {
                return -1;
            }
            while (!G10.c(VV.this.B[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.B;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            VV vv = VV.this;
            int i = this.B;
            return vv.new a(i, i, this.C);
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.List
        public Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.List, j$.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List, j$.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            VV vv = VV.this;
            int i3 = this.B;
            return vv.new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1080Hm.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            VV vv = VV.this;
            int i2 = this.B;
            return vv.new a(i + i2, i2, this.C);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public /* synthetic */ j$.util.Spliterator spliterator() {
            return List.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            G10.g(objArr, "array");
            return AbstractC1080Hm.b(this, objArr);
        }
    }

    public final boolean D() {
        long jW = w();
        return CC.c(jW) < 0.0f && CC.d(jW);
    }

    public final void E(Object obj, boolean z, LQ lq) {
        G10.g(lq, "childHitTest");
        F(obj, -1.0f, z, lq);
    }

    public final void F(Object obj, float f, boolean z, LQ lq) {
        G10.g(lq, "childHitTest");
        int i = this.D;
        this.D = i + 1;
        v();
        Object[] objArr = this.B;
        int i2 = this.D;
        objArr[i2] = obj;
        this.C[i2] = WV.a(f, z);
        H();
        lq.invoke();
        this.D = i;
    }

    public final boolean G(float f, boolean z) {
        if (this.D == AbstractC1599Mm.m(this)) {
            return true;
        }
        return CC.a(w(), WV.a(f, z)) > 0;
    }

    public final void H() {
        int i = this.D + 1;
        int iM = AbstractC1599Mm.m(this);
        if (i <= iM) {
            while (true) {
                this.B[i] = null;
                if (i == iM) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.E = this.D + 1;
    }

    public final void I(Object obj, float f, boolean z, LQ lq) {
        G10.g(lq, "childHitTest");
        if (this.D == AbstractC1599Mm.m(this)) {
            F(obj, f, z, lq);
            if (this.D + 1 == AbstractC1599Mm.m(this)) {
                H();
                return;
            }
            return;
        }
        long jW = w();
        int i = this.D;
        this.D = AbstractC1599Mm.m(this);
        F(obj, f, z, lq);
        if (this.D + 1 < AbstractC1599Mm.m(this) && CC.a(jW, w()) > 0) {
            int i2 = this.D + 1;
            int i3 = i + 1;
            Object[] objArr = this.B;
            AbstractC5152hb.h(objArr, objArr, i3, i2, size());
            long[] jArr = this.C;
            AbstractC5152hb.g(jArr, jArr, i3, i2, size());
            this.D = ((size() + i) - this.D) - 1;
        }
        H();
        this.D = i;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.D = -1;
        H();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        G10.g(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        this.D = size() - 1;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.B[i];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int iM = AbstractC1599Mm.m(this);
        if (iM < 0) {
            return -1;
        }
        int i = 0;
        while (!G10.c(this.B[i], obj)) {
            if (i == iM) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        for (int iM = AbstractC1599Mm.m(this); -1 < iM; iM--) {
            if (G10.c(this.B[iM], obj)) {
                return iM;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return y();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return new b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    public final void v() {
        int i = this.D;
        Object[] objArr = this.B;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            G10.f(objArrCopyOf, "copyOf(this, newSize)");
            this.B = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.C, length);
            G10.f(jArrCopyOf, "copyOf(this, newSize)");
            this.C = jArrCopyOf;
        }
    }

    public final long w() {
        long jA = WV.a(Float.POSITIVE_INFINITY, false);
        int i = this.D + 1;
        int iM = AbstractC1599Mm.m(this);
        if (i <= iM) {
            while (true) {
                long jB = CC.b(this.C[i]);
                if (CC.a(jB, jA) < 0) {
                    jA = jB;
                }
                if ((CC.c(jA) < 0.0f && CC.d(jA)) || i == iM) {
                    break;
                }
                i++;
            }
        }
        return jA;
    }

    public int y() {
        return this.E;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new a(this, i, 0, 0, 6, null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }

    public final class a implements ListIterator, InterfaceC9783y60 {
        public int B;
        public final int C;
        public final int D;

        public a(int i, int i2, int i3) {
            this.B = i;
            this.C = i2;
            this.D = i3;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.B < this.D;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.B > this.C;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            Object[] objArr = VV.this.B;
            int i = this.B;
            this.B = i + 1;
            return objArr[i];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.B - this.C;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            Object[] objArr = VV.this.B;
            int i = this.B - 1;
            this.B = i;
            return objArr[i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.B - this.C) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(VV vv, int i, int i2, int i3, int i4, AbstractC2911Yw abstractC2911Yw) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? vv.size() : i3);
        }
    }
}
