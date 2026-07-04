package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends X {
    public abstract boolean D(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return s((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return y((Map.Entry) obj);
        }
        return false;
    }

    public final boolean s(Map.Entry entry) {
        G10.g(entry, "element");
        if (AbstractC2988Zp0.a(AbstractC2988Zp0.a(entry) ? entry : null)) {
            return w(entry);
        }
        return false;
    }

    public abstract boolean w(Map.Entry entry);

    public final boolean y(Map.Entry entry) {
        G10.g(entry, "element");
        if (AbstractC2988Zp0.a(AbstractC2988Zp0.a(entry) ? entry : null)) {
            return D(entry);
        }
        return false;
    }
}
