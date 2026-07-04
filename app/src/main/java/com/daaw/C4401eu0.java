package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.eu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4401eu0 extends AbstractC9193w implements JY {
    public final C2066Qt0 B;

    public C4401eu0(C2066Qt0 c2066Qt0) {
        G10.g(c2066Qt0, "map");
        this.B = c2066Qt0;
    }

    @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.B.containsValue(obj);
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.B.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C4690fu0(this.B.o());
    }
}
