package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class NO2 extends AbstractC5948kQ2 {
    public final transient Map D;
    public final /* synthetic */ AbstractC3981dP2 E;

    public NO2(AbstractC3981dP2 abstractC3981dP2, Map map) {
        this.E = abstractC3981dP2;
        this.D = map;
    }

    @Override // com.daaw.AbstractC5948kQ2
    public final Set b() {
        return new LO2(this);
    }

    public final Map.Entry c(Map.Entry entry) {
        Object key = entry.getKey();
        return new KP2(key, this.E.i(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC3981dP2 abstractC3981dP2 = this.E;
        if (this.D == abstractC3981dP2.E) {
            abstractC3981dP2.zzp();
        } else {
            AbstractC3428bQ2.b(new MO2(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.D;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.D.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) AbstractC6236lQ2.a(this.D, obj);
        if (collection == null) {
            return null;
        }
        return this.E.i(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.E.f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.D.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.E.g();
        collectionG.addAll(collection);
        this.E.F -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.D.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.D.toString();
    }
}
