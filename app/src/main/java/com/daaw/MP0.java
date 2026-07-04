package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class MP0 extends NP0 implements Iterator, InterfaceC1416Ks, InterfaceC9783y60 {
    public int B;
    public Object C;
    public Iterator D;
    public InterfaceC1416Ks E;

    @Override // com.daaw.NP0
    public Object b(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        this.C = obj;
        this.B = 3;
        this.E = interfaceC1416Ks;
        Object objC = I10.c();
        if (objC == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objC == I10.c() ? objC : G91.a;
    }

    @Override // com.daaw.NP0
    public Object e(Iterator it, InterfaceC1416Ks interfaceC1416Ks) {
        if (!it.hasNext()) {
            return G91.a;
        }
        this.D = it;
        this.B = 2;
        this.E = interfaceC1416Ks;
        Object objC = I10.c();
        if (objC == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objC == I10.c() ? objC : G91.a;
    }

    public final Throwable f() {
        int i = this.B;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.B);
    }

    public final Object g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        return C5905kG.B;
    }

    public final void h(InterfaceC1416Ks interfaceC1416Ks) {
        this.E = interfaceC1416Ks;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.B;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator it = this.D;
                G10.d(it);
                if (it.hasNext()) {
                    this.B = 2;
                    return true;
                }
                this.D = null;
            }
            this.B = 5;
            InterfaceC1416Ks interfaceC1416Ks = this.E;
            G10.d(interfaceC1416Ks);
            this.E = null;
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            interfaceC1416Ks.x(AbstractC4512fJ0.a(G91.a));
        }
    }

    @Override // java.util.Iterator
    public Object next() throws Throwable {
        int i = this.B;
        if (i == 0 || i == 1) {
            return g();
        }
        if (i == 2) {
            this.B = 1;
            Iterator it = this.D;
            G10.d(it);
            return it.next();
        }
        if (i != 3) {
            throw f();
        }
        this.B = 0;
        Object obj = this.C;
        this.C = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.daaw.InterfaceC1416Ks
    public void x(Object obj) throws Throwable {
        AbstractC4801gJ0.b(obj);
        this.B = 4;
    }
}
