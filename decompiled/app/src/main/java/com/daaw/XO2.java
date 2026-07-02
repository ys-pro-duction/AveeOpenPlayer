package com.daaw;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class XO2 extends NO2 implements SortedMap {
    public SortedSet F;
    public final /* synthetic */ AbstractC3981dP2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XO2(AbstractC3981dP2 abstractC3981dP2, SortedMap sortedMap) {
        super(abstractC3981dP2, sortedMap);
        this.G = abstractC3981dP2;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.D;
    }

    public SortedSet e() {
        return new YO2(this.G, d());
    }

    @Override // com.daaw.NO2, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.F;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetE = e();
        this.F = sortedSetE;
        return sortedSetE;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new XO2(this.G, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new XO2(this.G, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new XO2(this.G, d().tailMap(obj));
    }
}
