package com.daaw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.rQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7907rQ0 extends X implements Set, Serializable, K60 {
    public static final a C = new a(null);
    public static final C7907rQ0 D = new C7907rQ0(C8535tg0.O.e());
    public final C8535tg0 B;

    /* JADX INFO: renamed from: com.daaw.rQ0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C7907rQ0(C8535tg0 c8535tg0) {
        G10.g(c8535tg0, "backing");
        this.B = c8535tg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.B.k(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.B.containsKey(obj);
    }

    @Override // com.daaw.X
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.B.L();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.B.U(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        G10.g(collection, "elements");
        this.B.o();
        return super.retainAll(collection);
    }

    public final Set s() {
        this.B.n();
        return size() > 0 ? this : D;
    }

    public C7907rQ0() {
        this(new C8535tg0());
    }
}
