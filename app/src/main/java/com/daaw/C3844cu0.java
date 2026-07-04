package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3844cu0 extends AbstractC6119l0 implements QY {
    public final C2066Qt0 C;

    public C3844cu0(C2066Qt0 c2066Qt0) {
        G10.g(c2066Qt0, "map");
        this.C = c2066Qt0;
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.C.containsKey(obj);
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.C.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C4122du0(this.C.o());
    }
}
