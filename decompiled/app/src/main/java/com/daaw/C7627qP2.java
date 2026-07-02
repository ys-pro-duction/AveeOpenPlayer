package com.daaw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.qP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7627qP2 extends AbstractSet {
    public final /* synthetic */ C9586xP2 B;

    public C7627qP2(C9586xP2 c9586xP2) {
        this.B = c9586xP2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.B.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C9586xP2 c9586xP2 = this.B;
        Map mapK = c9586xP2.k();
        return mapK != null ? mapK.keySet().iterator() : new C5944kP2(c9586xP2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapK = this.B.k();
        return mapK != null ? mapK.keySet().remove(obj) : this.B.x(obj) != C9586xP2.K;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B.size();
    }
}
