package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class VT0 extends X {
    public static final b D = new b(null);
    public Object B;
    public int C;

    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;

        public a(Object[] objArr) {
            G10.g(objArr, "array");
            this.B = AbstractC2093Ra.a(objArr);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.B.next();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final VT0 a() {
            return new VT0(null);
        }

        public final VT0 b(Collection collection) {
            G10.g(collection, "set");
            VT0 vt0 = new VT0(null);
            vt0.addAll(collection);
            return vt0;
        }

        public b() {
        }
    }

    public static final class c implements Iterator, InterfaceC9783y60 {
        public final Object B;
        public boolean C = true;

        public c(Object obj) {
            this.B = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.C;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.C) {
                throw new NoSuchElementException();
            }
            this.C = false;
            return this.B;
        }
    }

    public /* synthetic */ VT0(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public static final VT0 s() {
        return D.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.B = obj;
        } else if (size() == 1) {
            if (G10.c(this.B, obj)) {
                return false;
            }
            this.B = new Object[]{this.B, obj};
        } else if (size() < 5) {
            Object obj3 = this.B;
            G10.e(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (AbstractC5431ib.B(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetE = AbstractC9867yQ0.e(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetE.add(obj);
                obj2 = linkedHashSetE;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                G10.f(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.B = obj2;
        } else {
            Object obj4 = this.B;
            G10.e(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!V71.d(obj4).add(obj)) {
                return false;
            }
        }
        w(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.B = null;
        w(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return G10.c(this.B, obj);
        }
        if (size() < 5) {
            Object obj2 = this.B;
            G10.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC5431ib.B((Object[]) obj2, obj);
        }
        Object obj3 = this.B;
        G10.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // com.daaw.X
    public int e() {
        return this.C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.B);
        }
        if (size() < 5) {
            Object obj = this.B;
            G10.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.B;
        G10.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return V71.d(obj2).iterator();
    }

    public void w(int i) {
        this.C = i;
    }

    public VT0() {
    }
}
