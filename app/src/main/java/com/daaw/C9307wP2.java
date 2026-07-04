package com.daaw;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9307wP2 extends AbstractCollection {
    public final /* synthetic */ C9586xP2 B;

    public C9307wP2(C9586xP2 c9586xP2) {
        this.B = c9586xP2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C9586xP2 c9586xP2 = this.B;
        Map mapK = c9586xP2.k();
        return mapK != null ? mapK.values().iterator() : new C6511mP2(c9586xP2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.B.size();
    }
}
