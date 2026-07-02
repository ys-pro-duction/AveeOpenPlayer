package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.kU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5962kU0 implements Set, K60 {
    public final C9883yU0 B;

    public AbstractC5962kU0(C9883yU0 c9883yU0) {
        G10.g(c9883yU0, "map");
        this.B = c9883yU0;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.B.clear();
    }

    public final C9883yU0 e() {
        return this.B;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    public int m() {
        return this.B.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1080Hm.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        G10.g(objArr, "array");
        return AbstractC1080Hm.b(this, objArr);
    }
}
