package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.tm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8565tm0 implements RandomAccess {
    public static final int E = 8;
    public Object[] B;
    public List C;
    public int D;

    /* JADX INFO: renamed from: com.daaw.tm0$a */
    public static final class a implements List, InterfaceC10062z60 {
        public final C8565tm0 B;

        public a(C8565tm0 c8565tm0) {
            G10.g(c8565tm0, "vector");
            this.B = c8565tm0;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.B.d(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            G10.g(collection, "elements");
            return this.B.h(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.B.k();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.B.m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            G10.g(collection, "elements");
            return this.B.o(collection);
        }

        public int e() {
            return this.B.r();
        }

        @Override // java.util.List
        public Object get(int i) {
            AbstractC8844um0.c(this, i);
            return this.B.q()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.B.s(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.B.t();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.B.v(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        public Object m(int i) {
            AbstractC8844um0.c(this, i);
            return this.B.z(i);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return m(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            G10.g(collection, "elements");
            return this.B.y(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            G10.g(collection, "elements");
            return this.B.B(collection);
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            AbstractC8844um0.c(this, i);
            return this.B.D(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            AbstractC8844um0.d(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1080Hm.a(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.B.a(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            G10.g(collection, "elements");
            return this.B.i(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.B.w(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            G10.g(objArr, "array");
            return AbstractC1080Hm.b(this, objArr);
        }
    }

    /* JADX INFO: renamed from: com.daaw.tm0$b */
    public static final class b implements List, InterfaceC10062z60 {
        public final List B;
        public final int C;
        public int D;

        public b(List list, int i, int i2) {
            G10.g(list, "list");
            this.B = list;
            this.C = i;
            this.D = i2;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.B;
            int i = this.D;
            this.D = i + 1;
            list.add(i, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            G10.g(collection, "elements");
            this.B.addAll(i + this.C, collection);
            this.D += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.D - 1;
            int i2 = this.C;
            if (i2 <= i) {
                while (true) {
                    this.B.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.D = this.C;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.D;
            for (int i2 = this.C; i2 < i; i2++) {
                if (G10.c(this.B.get(i2), obj)) {
                    return true;
                }
            }
            return false;
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
            return this.D - this.C;
        }

        @Override // java.util.List
        public Object get(int i) {
            AbstractC8844um0.c(this, i);
            return this.B.get(i + this.C);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.D;
            for (int i2 = this.C; i2 < i; i2++) {
                if (G10.c(this.B.get(i2), obj)) {
                    return i2 - this.C;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.D == this.C;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.D - 1;
            int i2 = this.C;
            if (i2 > i) {
                return -1;
            }
            while (!G10.c(this.B.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.C;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        public Object m(int i) {
            AbstractC8844um0.c(this, i);
            this.D--;
            return this.B.remove(i + this.C);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return m(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            G10.g(collection, "elements");
            int i = this.D;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.D;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            G10.g(collection, "elements");
            int i = this.D;
            int i2 = i - 1;
            int i3 = this.C;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.B.get(i2))) {
                        this.B.remove(i2);
                        this.D--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.D;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            AbstractC8844um0.c(this, i);
            return this.B.set(i + this.C, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            AbstractC8844um0.d(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1080Hm.a(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.B.add(i + this.C, obj);
            this.D++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.D;
            for (int i2 = this.C; i2 < i; i2++) {
                if (G10.c(this.B.get(i2), obj)) {
                    this.B.remove(i2);
                    this.D--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            G10.g(objArr, "array");
            return AbstractC1080Hm.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            G10.g(collection, "elements");
            this.B.addAll(this.D, collection);
            this.D += collection.size();
            return collection.size() > 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tm0$c */
    public static final class c implements ListIterator, InterfaceC9783y60 {
        public final List B;
        public int C;

        public c(List list, int i) {
            G10.g(list, "list");
            this.B = list;
            this.C = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.B.add(this.C, obj);
            this.C++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.C < this.B.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.C > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.B;
            int i = this.C;
            this.C = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.C;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.C - 1;
            this.C = i;
            return this.B.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.C - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.C - 1;
            this.C = i;
            this.B.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.B.set(this.C, obj);
        }
    }

    public C8565tm0(Object[] objArr, int i) {
        G10.g(objArr, "content");
        this.B = objArr;
        this.D = i;
    }

    public final void A(int i, int i2) {
        if (i2 > i) {
            int i3 = this.D;
            if (i2 < i3) {
                Object[] objArr = this.B;
                AbstractC5152hb.h(objArr, objArr, i, i2, i3);
            }
            int i4 = this.D - (i2 - i);
            int iR = r() - 1;
            if (i4 <= iR) {
                int i5 = i4;
                while (true) {
                    this.B[i5] = null;
                    if (i5 == iR) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.D = i4;
        }
    }

    public final boolean B(Collection collection) {
        G10.g(collection, "elements");
        int i = this.D;
        for (int iR = r() - 1; -1 < iR; iR--) {
            if (!collection.contains(q()[iR])) {
                z(iR);
            }
        }
        return i != this.D;
    }

    public final Object D(int i, Object obj) {
        Object[] objArr = this.B;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void E(Comparator comparator) {
        G10.g(comparator, "comparator");
        AbstractC5152hb.x(this.B, comparator, 0, this.D);
    }

    public final void a(int i, Object obj) {
        p(this.D + 1);
        Object[] objArr = this.B;
        int i2 = this.D;
        if (i != i2) {
            AbstractC5152hb.h(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.D++;
    }

    public final boolean d(Object obj) {
        p(this.D + 1);
        Object[] objArr = this.B;
        int i = this.D;
        objArr[i] = obj;
        this.D = i + 1;
        return true;
    }

    public final boolean e(int i, C8565tm0 c8565tm0) {
        G10.g(c8565tm0, "elements");
        if (c8565tm0.t()) {
            return false;
        }
        p(this.D + c8565tm0.D);
        Object[] objArr = this.B;
        int i2 = this.D;
        if (i != i2) {
            AbstractC5152hb.h(objArr, objArr, c8565tm0.D + i, i, i2);
        }
        AbstractC5152hb.h(c8565tm0.B, objArr, i, 0, c8565tm0.D);
        this.D += c8565tm0.D;
        return true;
    }

    public final boolean h(int i, Collection collection) {
        G10.g(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        p(this.D + collection.size());
        Object[] objArr = this.B;
        if (i != this.D) {
            AbstractC5152hb.h(objArr, objArr, collection.size() + i, i, this.D);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC1599Mm.u();
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        this.D += collection.size();
        return true;
    }

    public final boolean i(Collection collection) {
        G10.g(collection, "elements");
        return h(this.D, collection);
    }

    public final List j() {
        List list = this.C;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.C = aVar;
        return aVar;
    }

    public final void k() {
        Object[] objArr = this.B;
        int iR = r();
        while (true) {
            iR--;
            if (-1 >= iR) {
                this.D = 0;
                return;
            }
            objArr[iR] = null;
        }
    }

    public final boolean m(Object obj) {
        int iR = r() - 1;
        if (iR >= 0) {
            for (int i = 0; !G10.c(q()[i], obj); i++) {
                if (i != iR) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean o(Collection collection) {
        G10.g(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void p(int i) {
        Object[] objArr = this.B;
        if (objArr.length < i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            G10.f(objArrCopyOf, "copyOf(this, newSize)");
            this.B = objArrCopyOf;
        }
    }

    public final Object[] q() {
        return this.B;
    }

    public final int r() {
        return this.D;
    }

    public final int s(Object obj) {
        int i = this.D;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = this.B;
        int i2 = 0;
        while (!G10.c(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean t() {
        return this.D == 0;
    }

    public final boolean u() {
        return this.D != 0;
    }

    public final int v(Object obj) {
        int i = this.D;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = this.B;
        while (!G10.c(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean w(Object obj) {
        int iS = s(obj);
        if (iS < 0) {
            return false;
        }
        z(iS);
        return true;
    }

    public final boolean x(C8565tm0 c8565tm0) {
        G10.g(c8565tm0, "elements");
        int i = this.D;
        int iR = c8565tm0.r() - 1;
        if (iR >= 0) {
            int i2 = 0;
            while (true) {
                w(c8565tm0.q()[i2]);
                if (i2 == iR) {
                    break;
                }
                i2++;
            }
        }
        return i != this.D;
    }

    public final boolean y(Collection collection) {
        G10.g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.D;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        return i != this.D;
    }

    public final Object z(int i) {
        Object[] objArr = this.B;
        Object obj = objArr[i];
        if (i != r() - 1) {
            AbstractC5152hb.h(objArr, objArr, i, i + 1, this.D);
        }
        int i2 = this.D - 1;
        this.D = i2;
        objArr[i2] = null;
        return obj;
    }
}
