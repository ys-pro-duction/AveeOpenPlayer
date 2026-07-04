package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.gL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4808gL implements KP0 {
    public final KP0 a;
    public final boolean b;
    public final NQ c;

    /* JADX INFO: renamed from: com.daaw.gL$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;
        public int C = -1;
        public Object D;

        public a() {
            this.B = C4808gL.this.a.iterator();
        }

        public final void b() {
            while (this.B.hasNext()) {
                Object next = this.B.next();
                if (((Boolean) C4808gL.this.c.invoke(next)).booleanValue() == C4808gL.this.b) {
                    this.D = next;
                    this.C = 1;
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

    public C4808gL(KP0 kp0, boolean z, NQ nq) {
        G10.g(kp0, "sequence");
        G10.g(nq, "predicate");
        this.a = kp0;
        this.b = z;
        this.c = nq;
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a();
    }
}
