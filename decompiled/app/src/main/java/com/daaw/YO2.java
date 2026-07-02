package com.daaw;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class YO2 extends TO2 implements SortedSet {
    public final /* synthetic */ AbstractC3981dP2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YO2(AbstractC3981dP2 abstractC3981dP2, SortedMap sortedMap) {
        super(abstractC3981dP2, sortedMap);
        this.D = abstractC3981dP2;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedMap e() {
        return (SortedMap) this.B;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return e().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new YO2(this.D, e().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return e().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new YO2(this.D, e().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new YO2(this.D, e().tailMap(obj));
    }
}
