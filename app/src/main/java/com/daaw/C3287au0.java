package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.au0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3287au0 extends AbstractC6119l0 implements QY {
    public final C2066Qt0 C;

    public C3287au0(C2066Qt0 c2066Qt0) {
        G10.g(c2066Qt0, "map");
        this.C = c2066Qt0;
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return s((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.C.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C3566bu0(this.C.o());
    }

    public boolean s(Map.Entry entry) {
        G10.g(entry, "element");
        Object obj = this.C.get(entry.getKey());
        return obj != null ? G10.c(obj, entry.getValue()) : entry.getValue() == null && this.C.containsKey(entry.getKey());
    }
}
