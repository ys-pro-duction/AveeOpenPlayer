package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DB2 implements Iterator {
    public int B = -1;
    public boolean C;
    public Iterator D;
    public final /* synthetic */ AbstractC5341iE2 E;

    public final Iterator a() {
        if (this.D == null) {
            this.D = this.E.D.entrySet().iterator();
        }
        return this.D;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B + 1 >= this.E.C.size()) {
            return !this.E.D.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.C = true;
        int i = this.B + 1;
        this.B = i;
        return i < this.E.C.size() ? (Map.Entry) this.E.C.get(this.B) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.C) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.C = false;
        this.E.o();
        if (this.B >= this.E.C.size()) {
            a().remove();
            return;
        }
        AbstractC5341iE2 abstractC5341iE2 = this.E;
        int i = this.B;
        this.B = i - 1;
        abstractC5341iE2.m(i);
    }
}
