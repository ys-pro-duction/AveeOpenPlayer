package com.daaw;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IY extends AbstractCollection implements Serializable {
    public static final Object[] B = new Object[0];

    public static abstract class a extends b {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i) {
            AbstractC0768Em.b(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        public a b(Object obj) {
            AbstractC7785qy0.n(obj);
            c(this.b + 1);
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
            return this;
        }

        public final void c(int i) {
            Object[] objArr = this.a;
            if (objArr.length < i) {
                this.a = Arrays.copyOf(objArr, b.a(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
            }
        }
    }

    public static abstract class b {
        public static int a(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public abstract int e(Object[] objArr, int i);

    public Object[] q() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int s() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(B);
    }

    public int w() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean y();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC7785qy0.n(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrQ = q();
            if (objArrQ != null) {
                return AbstractC2174Ru0.a(objArrQ, w(), s(), objArr);
            }
            objArr = AbstractC6070kp0.b(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        e(objArr, 0);
        return objArr;
    }
}
