package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.sE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8137sE implements KP0, InterfaceC9260wE {
    public final KP0 a;
    public final int b;

    /* JADX INFO: renamed from: com.daaw.sE$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;
        public int C;

        public a(C8137sE c8137sE) {
            this.B = c8137sE.a.iterator();
            this.C = c8137sE.b;
        }

        public final void b() {
            while (this.C > 0 && this.B.hasNext()) {
                this.B.next();
                this.C--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            return this.B.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8137sE(KP0 kp0, int i) {
        G10.g(kp0, "sequence");
        this.a = kp0;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // com.daaw.InterfaceC9260wE
    public KP0 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new C8137sE(this, i) : new C8137sE(this.a, i2);
    }

    @Override // com.daaw.KP0
    public Iterator iterator() {
        return new a(this);
    }
}
