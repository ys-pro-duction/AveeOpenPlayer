package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.pP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7348pP2 implements Iterator {
    public int B;
    public int C;
    public int D = -1;
    public final /* synthetic */ C9586xP2 E;

    public /* synthetic */ AbstractC7348pP2(C9586xP2 c9586xP2, AbstractC7069oP2 abstractC7069oP2) {
        this.E = c9586xP2;
        this.B = c9586xP2.F;
        this.C = c9586xP2.f();
    }

    public abstract Object a(int i);

    public final void b() {
        if (this.E.F != this.B) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.C >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.C;
        this.D = i;
        Object objA = a(i);
        this.C = this.E.g(this.C);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC5381iO2.j(this.D >= 0, "no calls to next() since the last call to remove()");
        this.B += 32;
        C9586xP2 c9586xP2 = this.E;
        int i = this.D;
        Object[] objArr = c9586xP2.D;
        objArr.getClass();
        c9586xP2.remove(objArr[i]);
        this.C--;
        this.D = -1;
    }
}
