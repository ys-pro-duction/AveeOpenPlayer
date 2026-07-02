package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Js1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1314Js1 implements Iterator {
    public final /* synthetic */ Iterator B;

    public C1314Js1(Iterator it) {
        this.B = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C6391ly1((String) this.B.next());
    }
}
