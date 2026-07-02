package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.gG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4788gG extends AbstractC2511Va {
    public static final C4788gG B = new C4788gG();

    /* JADX INFO: renamed from: com.daaw.gG$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4788gG() {
        super(null);
    }

    @Override // com.daaw.AbstractC2511Va
    public int e() {
        return 0;
    }

    @Override // com.daaw.AbstractC2511Va, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // com.daaw.AbstractC2511Va
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Void get(int i) {
        return null;
    }

    @Override // com.daaw.AbstractC2511Va
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m(int i, Void r2) {
        G10.g(r2, "value");
        throw new IllegalStateException();
    }
}
