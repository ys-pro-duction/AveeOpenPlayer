package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NN2 implements Iterator {
    public Object B;
    public int C = 2;

    public abstract Object a();

    public final Object b() {
        this.C = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC5381iO2.i(this.C != 4);
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.C = 4;
            this.B = a();
            if (this.C != 3) {
                this.C = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.C = 2;
        Object obj = this.B;
        this.B = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
