package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class X01 implements KP0 {
    public final KP0 a;
    public final NQ b;

    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;
        public int C = -1;
        public Object D;

        public a() {
            this.B = X01.this.a.iterator();
        }

        private final void b() {
            if (this.B.hasNext()) {
                Object next = this.B.next();
                if (((Boolean) X01.this.b.invoke(next)).booleanValue()) {
                    this.C = 1;
                    this.D = next;
                    return;
                }
            }
            this.C = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.C == -1) {
                b();
            }
            return this.C == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.C == -1) {
                b();
            }
            if (this.C == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.D;
            this.D = null;
            this.C = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public X01(KP0 kp0, NQ nq) {
        G10.g(kp0, "sequence");
        G10.g(nq, "predicate");
        this.a = kp0;
        this.b = nq;
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a();
    }
}
