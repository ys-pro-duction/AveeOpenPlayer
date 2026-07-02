package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P extends X {
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
        return w(entry);
    }

    public abstract boolean w(Map.Entry entry);

    public abstract /* bridge */ boolean y(Map.Entry entry);
}
