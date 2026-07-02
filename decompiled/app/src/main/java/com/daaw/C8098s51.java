package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.s51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8098s51 implements KP0 {
    public final KP0 a;
    public final NQ b;

    /* JADX INFO: renamed from: com.daaw.s51$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;

        public a() {
            this.B = C8098s51.this.a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C8098s51.this.b.invoke(this.B.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8098s51(KP0 kp0, NQ nq) {
        G10.g(kp0, "sequence");
        G10.g(nq, "transformer");
        this.a = kp0;
        this.b = nq;
    }

    public final KP0 d(NQ nq) {
        G10.g(nq, "iterator");
        return new TM(this.a, this.b, nq);
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a();
    }
}
