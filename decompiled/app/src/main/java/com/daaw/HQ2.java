package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class HQ2 extends TP2 {
    public final transient RP2 D;
    public final transient OP2 E;

    public HQ2(RP2 rp2, OP2 op2) {
        this.D = rp2;
        this.E = op2;
    }

    @Override // com.daaw.JP2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.D.get(obj) != null;
    }

    @Override // com.daaw.JP2
    public final int e(Object[] objArr, int i) {
        return this.E.e(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.E.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D.size();
    }

    @Override // com.daaw.TP2, com.daaw.JP2
    public final OP2 w() {
        return this.E;
    }

    @Override // com.daaw.TP2, com.daaw.JP2
    public final UQ2 y() {
        return this.E.listIterator(0);
    }
}
