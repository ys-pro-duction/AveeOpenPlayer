package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Hq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1097Hq0 extends AbstractC2511Va {
    public final Object B;
    public final int C;

    /* JADX INFO: renamed from: com.daaw.Hq0$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public boolean B = true;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.B) {
                throw new NoSuchElementException();
            }
            this.B = false;
            return C1097Hq0.this.s();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097Hq0(Object obj, int i) {
        super(null);
        G10.g(obj, "value");
        this.B = obj;
        this.C = i;
    }

    @Override // com.daaw.AbstractC2511Va
    public int e() {
        return 1;
    }

    @Override // com.daaw.AbstractC2511Va
    public Object get(int i) {
        if (i == this.C) {
            return this.B;
        }
        return null;
    }

    @Override // com.daaw.AbstractC2511Va, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // com.daaw.AbstractC2511Va
    public void m(int i, Object obj) {
        G10.g(obj, "value");
        throw new IllegalStateException();
    }

    public final int p() {
        return this.C;
    }

    public final Object s() {
        return this.B;
    }
}
