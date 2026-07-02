package com.daaw;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.eQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4263eQ2 extends AbstractSequentialList implements Serializable {
    public final List B;
    public final WN2 C;

    public C4263eQ2(List list, WN2 wn2) {
        this.B = list;
        this.C = wn2;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3985dQ2(this, this.B.listIterator(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.B.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }
}
