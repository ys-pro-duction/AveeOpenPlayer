package com.daaw;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1863Pa extends V {
    public static final a E = new a(null);
    public static final Object[] F = new Object[0];
    public int B;
    public Object[] C;
    public int D;

    /* JADX INFO: renamed from: com.daaw.Pa$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C1863Pa() {
        this.C = F;
    }

    public final int D(int i) {
        return i == 0 ? AbstractC5431ib.H(this.C) : i - 1;
    }

    public final void E(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.C;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == F) {
            this.C = new Object[AbstractC8417tE0.d(i, 10)];
        } else {
            y(J.B.d(objArr.length, i));
        }
    }

    public final Object F() {
        if (isEmpty()) {
            return null;
        }
        return this.C[this.B];
    }

    public final int G(int i) {
        if (i == AbstractC5431ib.H(this.C)) {
            return 0;
        }
        return i + 1;
    }

    public final int H(int i) {
        return i < 0 ? i + this.C.length : i;
    }

    public final void I(int i, int i2) {
        if (i < i2) {
            AbstractC5152hb.p(this.C, null, i, i2);
            return;
        }
        Object[] objArr = this.C;
        AbstractC5152hb.p(objArr, null, i, objArr.length);
        AbstractC5152hb.p(this.C, null, 0, i2);
    }

    public final int J(int i) {
        Object[] objArr = this.C;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void K() {
        ((AbstractList) this).modCount++;
    }

    public final Object L() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final void M(int i, int i2) {
        int iJ = J(this.B + (i - 1));
        int iJ2 = J(this.B + (i2 - 1));
        while (i > 0) {
            int i3 = iJ + 1;
            int iMin = Math.min(i, Math.min(i3, iJ2 + 1));
            Object[] objArr = this.C;
            int i4 = iJ2 - iMin;
            int i5 = iJ - iMin;
            AbstractC5152hb.h(objArr, objArr, i4 + 1, i5 + 1, i3);
            iJ = H(i5);
            iJ2 = H(i4);
            i -= iMin;
        }
    }

    public final void N(int i, int i2) {
        int iJ = J(this.B + i2);
        int iJ2 = J(this.B + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.C;
            i2 = Math.min(size, Math.min(objArr.length - iJ, objArr.length - iJ2));
            Object[] objArr2 = this.C;
            int i3 = iJ + i2;
            AbstractC5152hb.h(objArr2, objArr2, iJ2, iJ, i3);
            iJ = J(i3);
            iJ2 = J(iJ2 + i2);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        K();
        E(size() + collection.size());
        w(J(this.B + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        K();
        E(size() + 1);
        int iD = D(this.B);
        this.B = iD;
        this.C[iD] = obj;
        this.D = size() + 1;
    }

    public final void addLast(Object obj) {
        K();
        E(size() + 1);
        this.C[J(this.B + size())] = obj;
        this.D = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            K();
            I(this.B, J(this.B + size()));
        }
        this.B = 0;
        this.D = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.daaw.V
    public int e() {
        return this.D;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        J.B.a(i, size());
        return this.C[J(this.B + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iJ = J(this.B + size());
        int length = this.B;
        if (length < iJ) {
            while (length < iJ) {
                if (G10.c(obj, this.C[length])) {
                    i = this.B;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iJ) {
            return -1;
        }
        int length2 = this.C.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iJ; i2++) {
                    if (G10.c(obj, this.C[i2])) {
                        length = i2 + this.C.length;
                        i = this.B;
                    }
                }
                return -1;
            }
            if (G10.c(obj, this.C[length])) {
                i = this.B;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iH;
        int i;
        int iJ = J(this.B + size());
        int i2 = this.B;
        if (i2 < iJ) {
            iH = iJ - 1;
            if (i2 <= iH) {
                while (!G10.c(obj, this.C[iH])) {
                    if (iH != i2) {
                        iH--;
                    }
                }
                i = this.B;
                return iH - i;
            }
            return -1;
        }
        if (i2 > iJ) {
            int i3 = iJ - 1;
            while (true) {
                if (-1 >= i3) {
                    iH = AbstractC5431ib.H(this.C);
                    int i4 = this.B;
                    if (i4 <= iH) {
                        while (!G10.c(obj, this.C[iH])) {
                            if (iH != i4) {
                                iH--;
                            }
                        }
                        i = this.B;
                    }
                } else {
                    if (G10.c(obj, this.C[i3])) {
                        iH = i3 + this.C.length;
                        i = this.B;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iJ;
        G10.g(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.C.length != 0) {
            int iJ2 = J(this.B + size());
            int i = this.B;
            if (i < iJ2) {
                iJ = i;
                while (i < iJ2) {
                    Object obj = this.C[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.C[iJ] = obj;
                        iJ++;
                    }
                    i++;
                }
                AbstractC5152hb.p(this.C, null, iJ, iJ2);
            } else {
                int length = this.C.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.C;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.C[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iJ = J(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr2 = this.C;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.C[iJ] = obj3;
                        iJ = G(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                K();
                this.D = H(iJ - this.B);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        K();
        Object[] objArr = this.C;
        int i = this.B;
        Object obj = objArr[i];
        objArr[i] = null;
        this.B = G(i);
        this.D = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        K();
        int iJ = J(this.B + AbstractC1599Mm.m(this));
        Object[] objArr = this.C;
        Object obj = objArr[iJ];
        objArr[iJ] = null;
        this.D = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        J.B.c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        K();
        if (i < size() - i2) {
            M(i, i2);
            int iJ = J(this.B + i3);
            I(this.B, iJ);
            this.B = iJ;
        } else {
            N(i, i2);
            int iJ2 = J(this.B + size());
            I(H(iJ2 - i3), iJ2);
        }
        this.D = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iJ;
        G10.g(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.C.length != 0) {
            int iJ2 = J(this.B + size());
            int i = this.B;
            if (i < iJ2) {
                iJ = i;
                while (i < iJ2) {
                    Object obj = this.C[i];
                    if (collection.contains(obj)) {
                        this.C[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC5152hb.p(this.C, null, iJ, iJ2);
            } else {
                int length = this.C.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.C;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.C[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iJ = J(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr2 = this.C;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.C[iJ] = obj3;
                        iJ = G(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                K();
                this.D = H(iJ - this.B);
            }
        }
        return z;
    }

    @Override // com.daaw.V
    public Object s(int i) {
        J.B.a(i, size());
        if (i == AbstractC1599Mm.m(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        K();
        int iJ = J(this.B + i);
        Object obj = this.C[iJ];
        if (i < (size() >> 1)) {
            int i2 = this.B;
            if (iJ >= i2) {
                Object[] objArr = this.C;
                AbstractC5152hb.h(objArr, objArr, i2 + 1, i2, iJ);
            } else {
                Object[] objArr2 = this.C;
                AbstractC5152hb.h(objArr2, objArr2, 1, 0, iJ);
                Object[] objArr3 = this.C;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.B;
                AbstractC5152hb.h(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.C;
            int i4 = this.B;
            objArr4[i4] = null;
            this.B = G(i4);
        } else {
            int iJ2 = J(this.B + AbstractC1599Mm.m(this));
            if (iJ <= iJ2) {
                Object[] objArr5 = this.C;
                AbstractC5152hb.h(objArr5, objArr5, iJ, iJ + 1, iJ2 + 1);
            } else {
                Object[] objArr6 = this.C;
                AbstractC5152hb.h(objArr6, objArr6, iJ, iJ + 1, objArr6.length);
                Object[] objArr7 = this.C;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC5152hb.h(objArr7, objArr7, 0, 1, iJ2 + 1);
            }
            this.C[iJ2] = null;
        }
        this.D = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        J.B.a(i, size());
        int iJ = J(this.B + i);
        Object[] objArr = this.C;
        Object obj2 = objArr[iJ];
        objArr[iJ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        if (objArr.length < size()) {
            objArr = AbstractC4594fb.a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int iJ = J(this.B + size());
        int i = this.B;
        if (i < iJ) {
            AbstractC5152hb.k(this.C, objArr2, 0, i, iJ, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.C;
            AbstractC5152hb.h(objArr3, objArr2, 0, this.B, objArr3.length);
            Object[] objArr4 = this.C;
            AbstractC5152hb.h(objArr4, objArr2, objArr4.length - this.B, 0, iJ);
        }
        return AbstractC1496Lm.f(size(), objArr2);
    }

    public final void w(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.C.length;
        while (i < length && it.hasNext()) {
            this.C[i] = it.next();
            i++;
        }
        int i2 = this.B;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.C[i3] = it.next();
        }
        this.D = size() + collection.size();
    }

    public final void y(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.C;
        AbstractC5152hb.h(objArr2, objArr, 0, this.B, objArr2.length);
        Object[] objArr3 = this.C;
        int length = objArr3.length;
        int i2 = this.B;
        AbstractC5152hb.h(objArr3, objArr, length - i2, 0, i2);
        this.B = 0;
        this.C = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        J.B.b(i, size());
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        K();
        E(size() + 1);
        int iJ = J(this.B + i);
        if (i < ((size() + 1) >> 1)) {
            int iD = D(iJ);
            int iD2 = D(this.B);
            int i2 = this.B;
            if (iD >= i2) {
                Object[] objArr = this.C;
                objArr[iD2] = objArr[i2];
                AbstractC5152hb.h(objArr, objArr, i2, i2 + 1, iD + 1);
            } else {
                Object[] objArr2 = this.C;
                AbstractC5152hb.h(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.C;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC5152hb.h(objArr3, objArr3, 0, 1, iD + 1);
            }
            this.C[iD] = obj;
            this.B = iD2;
        } else {
            int iJ2 = J(this.B + size());
            if (iJ < iJ2) {
                Object[] objArr4 = this.C;
                AbstractC5152hb.h(objArr4, objArr4, iJ + 1, iJ, iJ2);
            } else {
                Object[] objArr5 = this.C;
                AbstractC5152hb.h(objArr5, objArr5, 1, 0, iJ2);
                Object[] objArr6 = this.C;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC5152hb.h(objArr6, objArr6, iJ + 1, iJ, objArr6.length - 1);
            }
            this.C[iJ] = obj;
        }
        this.D = size() + 1;
    }

    public C1863Pa(Collection collection) {
        G10.g(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.C = array;
        this.D = array.length;
        if (array.length == 0) {
            this.C = F;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        G10.g(collection, "elements");
        J.B.b(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        K();
        E(size() + collection.size());
        int iJ = J(this.B + size());
        int iJ2 = J(this.B + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.B;
            int length = i2 - size;
            if (iJ2 < i2) {
                Object[] objArr = this.C;
                AbstractC5152hb.h(objArr, objArr, length, i2, objArr.length);
                if (size >= iJ2) {
                    Object[] objArr2 = this.C;
                    AbstractC5152hb.h(objArr2, objArr2, objArr2.length - size, 0, iJ2);
                } else {
                    Object[] objArr3 = this.C;
                    AbstractC5152hb.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.C;
                    AbstractC5152hb.h(objArr4, objArr4, 0, size, iJ2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.C;
                AbstractC5152hb.h(objArr5, objArr5, length, i2, iJ2);
            } else {
                Object[] objArr6 = this.C;
                length += objArr6.length;
                int i3 = iJ2 - i2;
                int length2 = objArr6.length - length;
                if (length2 >= i3) {
                    AbstractC5152hb.h(objArr6, objArr6, length, i2, iJ2);
                } else {
                    AbstractC5152hb.h(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.C;
                    AbstractC5152hb.h(objArr7, objArr7, 0, this.B + length2, iJ2);
                }
            }
            this.B = length;
            w(H(iJ2 - size), collection);
        } else {
            int i4 = iJ2 + size;
            if (iJ2 < iJ) {
                int i5 = size + iJ;
                Object[] objArr8 = this.C;
                if (i5 <= objArr8.length) {
                    AbstractC5152hb.h(objArr8, objArr8, i4, iJ2, iJ);
                } else if (i4 >= objArr8.length) {
                    AbstractC5152hb.h(objArr8, objArr8, i4 - objArr8.length, iJ2, iJ);
                } else {
                    int length3 = iJ - (i5 - objArr8.length);
                    AbstractC5152hb.h(objArr8, objArr8, 0, length3, iJ);
                    Object[] objArr9 = this.C;
                    AbstractC5152hb.h(objArr9, objArr9, i4, iJ2, length3);
                }
            } else {
                Object[] objArr10 = this.C;
                AbstractC5152hb.h(objArr10, objArr10, size, 0, iJ);
                Object[] objArr11 = this.C;
                if (i4 >= objArr11.length) {
                    AbstractC5152hb.h(objArr11, objArr11, i4 - objArr11.length, iJ2, objArr11.length);
                } else {
                    AbstractC5152hb.h(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.C;
                    AbstractC5152hb.h(objArr12, objArr12, i4, iJ2, objArr12.length - size);
                }
            }
            w(iJ2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
