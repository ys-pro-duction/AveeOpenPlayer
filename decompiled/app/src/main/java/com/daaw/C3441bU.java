package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3441bU implements Iterator, InterfaceC9783y60 {
    public final OT0 B;
    public final int C;
    public int D;
    public final int E;

    /* JADX INFO: renamed from: com.daaw.bU$a */
    public static final class a implements InterfaceC1611Mp, Iterable, InterfaceC9783y60 {
        public final /* synthetic */ int C;

        public a(int i) {
            this.C = i;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            C3441bU.this.f();
            OT0 ot0D = C3441bU.this.d();
            int i = this.C;
            return new C3441bU(ot0D, i + 1, i + PT0.G(C3441bU.this.d().v(), this.C));
        }
    }

    public C3441bU(OT0 ot0, int i, int i2) {
        G10.g(ot0, "table");
        this.B = ot0;
        this.C = i2;
        this.D = i;
        this.E = ot0.E();
        if (ot0.F()) {
            throw new ConcurrentModificationException();
        }
    }

    public final OT0 d() {
        return this.B;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC1611Mp next() {
        f();
        int i = this.D;
        this.D = PT0.G(this.B.v(), i) + i;
        return new a(i);
    }

    public final void f() {
        if (this.B.E() != this.E) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.D < this.C;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
