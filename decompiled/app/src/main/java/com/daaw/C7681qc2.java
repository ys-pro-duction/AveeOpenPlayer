package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.qc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7681qc2 implements Iterator {
    public final Iterator B;

    public C7681qc2(Iterator it) {
        this.B = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.B.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.B.remove();
    }
}
