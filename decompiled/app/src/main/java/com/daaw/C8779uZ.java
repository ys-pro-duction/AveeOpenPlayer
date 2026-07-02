package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.uZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8779uZ implements Iterable, InterfaceC9783y60 {
    public final LQ B;

    public C8779uZ(LQ lq) {
        G10.g(lq, "iteratorFactory");
        this.B = lq;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C9065vZ((Iterator) this.B.invoke());
    }
}
