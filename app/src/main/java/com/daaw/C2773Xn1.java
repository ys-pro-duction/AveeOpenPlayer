package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Xn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2773Xn1 implements Iterator {
    public final /* synthetic */ Iterator B;
    public final /* synthetic */ Iterator C;

    public C2773Xn1(C6350lp1 c6350lp1, Iterator it, Iterator it2) {
        this.B = it;
        this.C = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B.hasNext()) {
            return true;
        }
        return this.C.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.B.hasNext()) {
            return new C6391ly1(((Integer) this.B.next()).toString());
        }
        if (this.C.hasNext()) {
            return new C6391ly1((String) this.C.next());
        }
        throw new NoSuchElementException();
    }
}
