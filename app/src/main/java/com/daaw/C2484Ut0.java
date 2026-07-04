package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ut0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2484Ut0 extends O {
    public final C2276St0 B;

    public C2484Ut0(C2276St0 c2276St0) {
        G10.g(c2276St0, "builder");
        this.B = c2276St0;
    }

    @Override // com.daaw.O
    public boolean D(Map.Entry entry) {
        G10.g(entry, "element");
        return this.B.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        G10.g(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.B.clear();
    }

    @Override // com.daaw.X
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C2588Vt0(this.B);
    }

    @Override // com.daaw.O
    public boolean w(Map.Entry entry) {
        G10.g(entry, "element");
        Object obj = this.B.get(entry.getKey());
        return obj != null ? G10.c(obj, entry.getValue()) : entry.getValue() == null && this.B.containsKey(entry.getKey());
    }
}
