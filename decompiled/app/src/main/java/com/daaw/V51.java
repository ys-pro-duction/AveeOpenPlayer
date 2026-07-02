package com.daaw;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class V51 extends TreeSet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V51(Comparator comparator) {
        super(comparator);
        G10.g(comparator, "comparator");
    }

    public /* bridge */ int e() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
