package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.sW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8210sW0 implements ListIterator, InterfaceC9783y60 {
    public final C9325wU0 B;
    public int C;
    public int D;

    public C8210sW0(C9325wU0 c9325wU0, int i) {
        G10.g(c9325wU0, "list");
        this.B = c9325wU0;
        this.C = i - 1;
        this.D = c9325wU0.s();
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        b();
        this.B.add(this.C + 1, obj);
        this.C++;
        this.D = this.B.s();
    }

    public final void b() {
        if (this.B.s() != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.C < this.B.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.C >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        int i = this.C + 1;
        AbstractC9604xU0.e(i, this.B.size());
        Object obj = this.B.get(i);
        this.C = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.C + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        b();
        AbstractC9604xU0.e(this.C, this.B.size());
        this.C--;
        return this.B.get(this.C);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.C;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        this.B.remove(this.C);
        this.C--;
        this.D = this.B.s();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        b();
        this.B.set(this.C, obj);
        this.D = this.B.s();
    }
}
