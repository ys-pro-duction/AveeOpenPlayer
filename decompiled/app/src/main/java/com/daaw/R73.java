package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class R73 implements Iterator {
    public int B = 0;
    public final /* synthetic */ S73 C;

    public R73(S73 s73) {
        this.C = s73;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C.B.size() || this.C.C.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.B >= this.C.B.size()) {
            S73 s73 = this.C;
            s73.B.add(s73.C.next());
            return next();
        }
        S73 s732 = this.C;
        int i = this.B;
        this.B = i + 1;
        return s732.B.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
