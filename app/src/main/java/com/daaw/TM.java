package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class TM implements KP0 {
    public final KP0 a;
    public final NQ b;
    public final NQ c;

    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;
        public Iterator C;
        public int D;

        public a() {
            this.B = TM.this.a.iterator();
        }

        public final boolean b() {
            Iterator it = this.C;
            if (it != null && it.hasNext()) {
                this.D = 1;
                return true;
            }
            while (this.B.hasNext()) {
                Iterator it2 = (Iterator) TM.this.c.invoke(TM.this.b.invoke(this.B.next()));
                if (it2.hasNext()) {
                    this.C = it2;
                    this.D = 1;
                    return true;
                }
            }
            this.D = 2;
            this.C = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.D;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i = this.D;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.D = 0;
            Iterator it = this.C;
            G10.d(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TM(KP0 kp0, NQ nq, NQ nq2) {
        G10.g(kp0, "sequence");
        G10.g(nq, "transformer");
        G10.g(nq2, "iterator");
        this.a = kp0;
        this.b = nq;
        this.c = nq2;
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a();
    }
}
