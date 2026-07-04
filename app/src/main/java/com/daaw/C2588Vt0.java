package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2588Vt0 implements Iterator, InterfaceC9783y60 {
    public final C2380Tt0 B;

    public C2588Vt0(C2276St0 c2276St0) {
        G10.g(c2276St0, "builder");
        Y51[] y51Arr = new Y51[8];
        for (int i = 0; i < 8; i++) {
            y51Arr[i] = new C3621c61(this);
        }
        this.B = new C2380Tt0(c2276St0, y51Arr);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        return (Map.Entry) this.B.next();
    }

    public final void d(Object obj, Object obj2) {
        this.B.m(obj, obj2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.B.remove();
    }
}
