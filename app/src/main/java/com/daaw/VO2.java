package com.daaw;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class VO2 extends YO2 implements NavigableSet {
    public final /* synthetic */ AbstractC3981dP2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VO2(AbstractC3981dP2 abstractC3981dP2, NavigableMap navigableMap) {
        super(abstractC3981dP2, navigableMap);
        this.E = abstractC3981dP2;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.B)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new VO2(this.E, ((NavigableMap) ((SortedMap) this.B)).descendingMap());
    }

    @Override // com.daaw.YO2
    public final /* synthetic */ SortedMap e() {
        return (NavigableMap) ((SortedMap) this.B);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.B)).floorKey(obj);
    }

    @Override // com.daaw.YO2, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.B)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.B)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return AbstractC3428bQ2.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return AbstractC3428bQ2.a(descendingIterator());
    }

    @Override // com.daaw.YO2, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.daaw.YO2, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new VO2(this.E, ((NavigableMap) ((SortedMap) this.B)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new VO2(this.E, ((NavigableMap) ((SortedMap) this.B)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new VO2(this.E, ((NavigableMap) ((SortedMap) this.B)).tailMap(obj, z));
    }
}
