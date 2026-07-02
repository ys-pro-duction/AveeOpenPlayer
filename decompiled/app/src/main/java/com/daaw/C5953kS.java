package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.kS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5953kS implements KP0 {
    public final LQ a;
    public final NQ b;

    /* JADX INFO: renamed from: com.daaw.kS$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public Object B;
        public int C = -2;

        public a() {
        }

        private final void b() {
            Object objInvoke;
            if (this.C == -2) {
                objInvoke = C5953kS.this.a.invoke();
            } else {
                NQ nq = C5953kS.this.b;
                Object obj = this.B;
                G10.d(obj);
                objInvoke = nq.invoke(obj);
            }
            this.B = objInvoke;
            this.C = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.C < 0) {
                b();
            }
            return this.C == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.C < 0) {
                b();
            }
            if (this.C == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.B;
            G10.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.C = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5953kS(LQ lq, NQ nq) {
        G10.g(lq, "getInitialValue");
        G10.g(nq, "getNextValue");
        this.a = lq;
        this.b = nq;
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a();
    }
}
