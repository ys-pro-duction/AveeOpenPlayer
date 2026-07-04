package com.daaw;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Yt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2900Yt0 extends U implements Collection, InterfaceC10062z60 {
    public final C2276St0 B;

    public C2900Yt0(C2276St0 c2276St0) {
        G10.g(c2276St0, "builder");
        this.B = c2276St0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.B.containsValue(obj);
    }

    @Override // com.daaw.U
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C3004Zt0(this.B);
    }
}
