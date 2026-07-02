package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.yg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9937yg0 implements Map.Entry, InterfaceC9783y60 {
    public final Object B;
    public final Object C;

    public C9937yg0(Object obj, Object obj2) {
        this.B = obj;
        this.C = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && G10.c(entry.getKey(), getKey()) && G10.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.C;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
