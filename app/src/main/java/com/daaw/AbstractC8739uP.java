package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.uP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8739uP extends AbstractC9304wP implements Map {
    public abstract Map c();

    @Override // java.util.Map
    public void clear() {
        c().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return c().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return c().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return c().values();
    }
}
