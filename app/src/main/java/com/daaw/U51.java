package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U51 implements Iterator, InterfaceC9783y60 {
    public final NQ B;
    public final List C = new ArrayList();
    public Iterator D;

    public U51(Iterator it, NQ nq) {
        this.B = nq;
        this.D = it;
    }

    public final void b(Object obj) {
        Iterator it = (Iterator) this.B.invoke(obj);
        if (it != null && it.hasNext()) {
            this.C.add(this.D);
            this.D = it;
        } else {
            while (!this.D.hasNext() && !this.C.isEmpty()) {
                this.D = (Iterator) AbstractC2455Um.p0(this.C);
                AbstractC2141Rm.J(this.C);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.D.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.D.next();
        b(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
