package com.daaw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: com.daaw.dP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3981dP2 extends AbstractC4827gP2 implements Serializable {
    public final transient Map E;
    public transient int F;

    public AbstractC3981dP2(Map map) {
        AbstractC5381iO2.e(map.isEmpty());
        this.E = map;
    }

    public static /* bridge */ /* synthetic */ void r(AbstractC3981dP2 abstractC3981dP2, Object obj) {
        Object objRemove;
        try {
            objRemove = abstractC3981dP2.E.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC3981dP2.F -= size;
        }
    }

    @Override // com.daaw.InterfaceC6515mQ2
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.E.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.F++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.F++;
        this.E.put(obj, collectionG);
        return true;
    }

    @Override // com.daaw.AbstractC4827gP2
    public final Collection b() {
        return new C4548fP2(this);
    }

    @Override // com.daaw.AbstractC4827gP2
    public final Iterator c() {
        return new KO2(this);
    }

    public abstract Collection g();

    public abstract Collection h(Collection collection);

    public abstract Collection i(Object obj, Collection collection);

    public final List k(Object obj, List list, AbstractC3145aP2 abstractC3145aP2) {
        return list instanceof RandomAccess ? new WO2(this, obj, list, abstractC3145aP2) : new C3702cP2(this, obj, list, abstractC3145aP2);
    }

    public final Map n() {
        Map map = this.E;
        return map instanceof NavigableMap ? new UO2(this, (NavigableMap) map) : map instanceof SortedMap ? new XO2(this, (SortedMap) map) : new NO2(this, map);
    }

    public final Set o() {
        Map map = this.E;
        return map instanceof NavigableMap ? new VO2(this, (NavigableMap) map) : map instanceof SortedMap ? new YO2(this, (SortedMap) map) : new TO2(this, map);
    }

    @Override // com.daaw.InterfaceC6515mQ2
    public final int zze() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC6515mQ2
    public final void zzp() {
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.E.clear();
        this.F = 0;
    }
}
