package com.daaw;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.k53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5860k53 implements Iterator {
    public final ArrayDeque B;
    public AbstractC7811r33 C;

    public /* synthetic */ C5860k53(AbstractC9213w33 abstractC9213w33, AbstractC5578j53 abstractC5578j53) {
        if (!(abstractC9213w33 instanceof C7543q53)) {
            this.B = null;
            this.C = (AbstractC7811r33) abstractC9213w33;
            return;
        }
        C7543q53 c7543q53 = (C7543q53) abstractC9213w33;
        ArrayDeque arrayDeque = new ArrayDeque(c7543q53.E());
        this.B = arrayDeque;
        arrayDeque.push(c7543q53);
        this.C = b(c7543q53.G);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC7811r33 next() {
        AbstractC7811r33 abstractC7811r33B;
        AbstractC7811r33 abstractC7811r33 = this.C;
        if (abstractC7811r33 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.B;
            abstractC7811r33B = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abstractC7811r33B = b(((C7543q53) this.B.pop()).H);
        } while (abstractC7811r33B.y() == 0);
        this.C = abstractC7811r33B;
        return abstractC7811r33;
    }

    public final AbstractC7811r33 b(AbstractC9213w33 abstractC9213w33) {
        while (abstractC9213w33 instanceof C7543q53) {
            C7543q53 c7543q53 = (C7543q53) abstractC9213w33;
            this.B.push(c7543q53);
            abstractC9213w33 = c7543q53.G;
        }
        return (AbstractC7811r33) abstractC9213w33;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.C != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
