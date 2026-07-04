package com.daaw;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.bP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3424bP2 extends ZO2 implements ListIterator {
    public final /* synthetic */ C3702cP2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3424bP2(C3702cP2 c3702cP2) {
        super(c3702cP2);
        this.E = c3702cP2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.E.isEmpty();
        a();
        ((ListIterator) this.B).add(obj);
        this.E.G.F++;
        if (zIsEmpty) {
            this.E.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.B).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.B).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.B).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.B).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.B).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3424bP2(C3702cP2 c3702cP2, int i) {
        super(c3702cP2, ((List) c3702cP2.C).listIterator(i));
        this.E = c3702cP2;
    }
}
