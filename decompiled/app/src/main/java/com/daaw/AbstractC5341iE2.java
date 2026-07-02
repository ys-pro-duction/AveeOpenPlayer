package com.daaw;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.iE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5341iE2 extends AbstractMap {
    public final int B;
    public List C = Collections.EMPTY_LIST;
    public Map D;
    public boolean E;
    public volatile OC2 F;
    public Map G;

    public /* synthetic */ AbstractC5341iE2(int i, ED2 ed2) {
        this.B = i;
        Map map = Collections.EMPTY_MAP;
        this.D = map;
        this.G = map;
    }

    public void b() {
        if (this.E) {
            return;
        }
        this.D = this.D.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.D);
        this.G = this.G.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.G);
        this.E = true;
    }

    public final int c() {
        return this.C.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.C.isEmpty()) {
            this.C.clear();
        }
        if (this.D.isEmpty()) {
            return;
        }
        this.D.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.D.containsKey(comparable);
    }

    public final Iterable d() {
        return this.D.isEmpty() ? AbstractC1966Pz2.a() : this.D.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.F == null) {
            this.F = new OC2(this, null);
        }
        return this.F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5341iE2)) {
            return super.equals(obj);
        }
        AbstractC5341iE2 abstractC5341iE2 = (AbstractC5341iE2) obj;
        int size = size();
        if (size != abstractC5341iE2.size()) {
            return false;
        }
        int iC = c();
        if (iC != abstractC5341iE2.c()) {
            return entrySet().equals(abstractC5341iE2.entrySet());
        }
        for (int i = 0; i < iC; i++) {
            if (!h(i).equals(abstractC5341iE2.h(i))) {
                return false;
            }
        }
        if (iC != size) {
            return this.D.equals(abstractC5341iE2.D);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((C8682uA2) this.C.get(iL)).setValue(obj);
        }
        o();
        if (this.C.isEmpty() && !(this.C instanceof ArrayList)) {
            this.C = new ArrayList(this.B);
        }
        int i = -(iL + 1);
        if (i >= this.B) {
            return n().put(comparable, obj);
        }
        int size = this.C.size();
        int i2 = this.B;
        if (size == i2) {
            C8682uA2 c8682uA2 = (C8682uA2) this.C.remove(i2 - 1);
            n().put(c8682uA2.a(), c8682uA2.getValue());
        }
        this.C.add(i, new C8682uA2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((C8682uA2) this.C.get(iL)).getValue() : this.D.get(comparable);
    }

    public final Map.Entry h(int i) {
        return (Map.Entry) this.C.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iC = c();
        int iHashCode = 0;
        for (int i = 0; i < iC; i++) {
            iHashCode += ((C8682uA2) this.C.get(i)).hashCode();
        }
        return this.D.size() > 0 ? iHashCode + this.D.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.E;
    }

    public final int l(Comparable comparable) {
        int size = this.C.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((C8682uA2) this.C.get(i)).a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((C8682uA2) this.C.get(i3)).a());
            if (iCompareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public final Object m(int i) {
        o();
        Object value = ((C8682uA2) this.C.remove(i)).getValue();
        if (!this.D.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.C;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C8682uA2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    public final SortedMap n() {
        o();
        if (this.D.isEmpty() && !(this.D instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.D = treeMap;
            this.G = treeMap.descendingMap();
        }
        return (SortedMap) this.D;
    }

    public final void o() {
        if (this.E) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.D.isEmpty()) {
            return null;
        }
        return this.D.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.C.size() + this.D.size();
    }
}
