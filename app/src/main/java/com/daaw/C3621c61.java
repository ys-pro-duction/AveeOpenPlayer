package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.c61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3621c61 extends Y51 {
    public final C2588Vt0 E;

    public C3621c61(C2588Vt0 c2588Vt0) {
        G10.g(c2588Vt0, "parentIterator");
        this.E = c2588Vt0;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC9971yn.a(g());
        n(f() + 2);
        return new C5486im0(this.E, e()[f() - 2], e()[f() - 1]);
    }
}
