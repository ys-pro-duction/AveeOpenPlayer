package com.daaw;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Wt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2692Wt0 extends X implements Set, K60 {
    public final C2276St0 B;

    public C2692Wt0(C2276St0 c2276St0) {
        G10.g(c2276St0, "builder");
        this.B = c2276St0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.B.containsKey(obj);
    }

    @Override // com.daaw.X
    public int e() {
        return this.B.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C2796Xt0(this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.B.containsKey(obj)) {
            return false;
        }
        this.B.remove(obj);
        return true;
    }
}
