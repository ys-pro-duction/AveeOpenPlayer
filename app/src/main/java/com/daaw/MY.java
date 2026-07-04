package com.daaw;

import com.daaw.IY;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MY extends IY implements List, RandomAccess {
    public static final R91 C = new b(C8704uG0.F, 0);

    public static final class a extends IY.a {
        public a() {
            this(4);
        }

        public a d(Object obj) {
            super.b(obj);
            return this;
        }

        public MY e() {
            this.c = true;
            return MY.E(this.a, this.b);
        }

        public a(int i) {
            super(i);
        }
    }

    public static class b extends G {
        public final MY D;

        public b(MY my, int i) {
            super(my.size(), i);
            this.D = my;
        }

        @Override // com.daaw.G
        public Object a(int i) {
            return this.D.get(i);
        }
    }

    public class c extends MY {
        public final transient int D;
        public final transient int E;

        public c(int i, int i2) {
            this.D = i;
            this.E = i2;
        }

        @Override // com.daaw.MY, java.util.List
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public MY subList(int i, int i2) {
            AbstractC7785qy0.s(i, i2, this.E);
            MY my = MY.this;
            int i3 = this.D;
            return my.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List
        public Object get(int i) {
            AbstractC7785qy0.l(i, this.E);
            return MY.this.get(i + this.D);
        }

        @Override // com.daaw.MY, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.daaw.MY, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.daaw.IY
        public Object[] q() {
            return MY.this.q();
        }

        @Override // com.daaw.IY
        public int s() {
            return MY.this.w() + this.D + this.E;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.E;
        }

        @Override // com.daaw.IY
        public int w() {
            return MY.this.w() + this.D;
        }

        @Override // com.daaw.MY, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static MY D(Object[] objArr) {
        return E(objArr, objArr.length);
    }

    public static MY E(Object[] objArr, int i) {
        return i == 0 ? J() : new C8704uG0(objArr, i);
    }

    public static a F() {
        return new a();
    }

    public static MY J() {
        return C8704uG0.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public O91 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public R91 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public R91 listIterator(int i) {
        AbstractC7785qy0.q(i, size());
        return isEmpty() ? C : new b(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: K */
    public MY subList(int i, int i2) {
        AbstractC7785qy0.s(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? J() : L(i, i2);
    }

    public MY L(int i, int i2) {
        return new c(i, i2 - i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.IY, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.daaw.IY
    public int e(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC9638xc0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC9638xc0.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC9638xc0.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
