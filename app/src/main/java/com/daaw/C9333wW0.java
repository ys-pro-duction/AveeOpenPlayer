package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9333wW0 extends AbstractC9054vW0 implements Iterator, InterfaceC9783y60 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9333wW0(C9883yU0 c9883yU0, Iterator it) {
        super(c9883yU0, it);
        G10.g(c9883yU0, "map");
        G10.g(it, "iterator");
    }

    @Override // java.util.Iterator
    public Object next() {
        Map.Entry entryH = h();
        if (entryH == null) {
            throw new IllegalStateException();
        }
        e();
        return entryH.getKey();
    }
}
