package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EP2 extends FP2 implements Map {
    @Override // java.util.Map
    public final void clear() {
        h().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    public abstract Map h();

    public final int k() {
        return QQ2.a(entrySet());
    }

    public final boolean l(Object obj) {
        C4831gQ2 c4831gQ2 = new C4831gQ2(entrySet().iterator());
        if (obj == null) {
            while (c4831gQ2.hasNext()) {
                if (c4831gQ2.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c4831gQ2.hasNext()) {
            if (obj.equals(c4831gQ2.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(Object obj) {
        return AbstractC6236lQ2.b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return h().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        h().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return h().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return h().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return h().values();
    }
}
