package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y51 implements Iterator, InterfaceC9783y60 {
    public Object[] B = X51.e.a().p();
    public int C;
    public int D;

    public final Object b() {
        AbstractC9971yn.a(g());
        return this.B[this.D];
    }

    public final X51 d() {
        AbstractC9971yn.a(h());
        Object obj = this.B[this.D];
        if (obj != null) {
            return (X51) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
    }

    public final Object[] e() {
        return this.B;
    }

    public final int f() {
        return this.D;
    }

    public final boolean g() {
        return this.D < this.C;
    }

    public final boolean h() {
        AbstractC9971yn.a(this.D >= this.C);
        return this.D < this.B.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return g();
    }

    public final void j() {
        AbstractC9971yn.a(g());
        this.D += 2;
    }

    public final void k() {
        AbstractC9971yn.a(h());
        this.D++;
    }

    public final void l(Object[] objArr, int i) {
        G10.g(objArr, "buffer");
        m(objArr, i, 0);
    }

    public final void m(Object[] objArr, int i, int i2) {
        G10.g(objArr, "buffer");
        this.B = objArr;
        this.C = i;
        this.D = i2;
    }

    public final void n(int i) {
        this.D = i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
