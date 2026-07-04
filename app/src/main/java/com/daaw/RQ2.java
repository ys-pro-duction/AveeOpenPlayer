package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class RQ2 extends TP2 {
    public final transient Object D;

    public RQ2(Object obj) {
        obj.getClass();
        this.D = obj;
    }

    @Override // com.daaw.JP2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.D.equals(obj);
    }

    @Override // com.daaw.JP2
    public final int e(Object[] objArr, int i) {
        objArr[i] = this.D;
        return i + 1;
    }

    @Override // com.daaw.TP2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new ZP2(this.D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.D.toString() + "]";
    }

    @Override // com.daaw.TP2, com.daaw.JP2
    public final OP2 w() {
        return OP2.K(this.D);
    }

    @Override // com.daaw.TP2, com.daaw.JP2
    public final UQ2 y() {
        return new ZP2(this.D);
    }
}
