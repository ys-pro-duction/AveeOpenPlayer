package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Co1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0561Co1 implements Iterator {
    public int B = 0;
    public final /* synthetic */ C6350lp1 C;

    public C0561Co1(C6350lp1 c6350lp1) {
        this.C = c6350lp1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B < this.C.s();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.B < this.C.s()) {
            C6350lp1 c6350lp1 = this.C;
            int i = this.B;
            this.B = i + 1;
            return c6350lp1.v(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.B);
    }
}
