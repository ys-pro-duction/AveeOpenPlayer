package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class UO2 extends XO2 implements NavigableMap {
    public final /* synthetic */ AbstractC3981dP2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UO2(AbstractC3981dP2 abstractC3981dP2, NavigableMap navigableMap) {
        super(abstractC3981dP2, navigableMap);
        this.H = abstractC3981dP2;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.D)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.D)).ceilingKey(obj);
    }

    @Override // com.daaw.XO2
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.D);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new UO2(this.H, ((NavigableMap) ((SortedMap) this.D)).descendingMap());
    }

    @Override // com.daaw.XO2
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.D)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.D)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.D)).floorKey(obj);
    }

    public final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionG = this.H.g();
        collectionG.addAll((Collection) entry.getValue());
        it.remove();
        return new KP2(entry.getKey(), this.H.h(collectionG));
    }

    @Override // com.daaw.XO2
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableSet e() {
        return new VO2(this.H, (NavigableMap) ((SortedMap) this.D));
    }

    @Override // com.daaw.XO2, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.D)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.D)).higherKey(obj);
    }

    @Override // com.daaw.XO2, com.daaw.NO2, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.D)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.D)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.D)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(descendingMap().entrySet().iterator());
    }

    @Override // com.daaw.XO2, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.daaw.XO2, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new UO2(this.H, ((NavigableMap) ((SortedMap) this.D)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new UO2(this.H, ((NavigableMap) ((SortedMap) this.D)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new UO2(this.H, ((NavigableMap) ((SortedMap) this.D)).tailMap(obj, z));
    }
}
