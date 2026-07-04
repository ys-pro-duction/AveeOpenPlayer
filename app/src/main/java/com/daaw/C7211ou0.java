package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.ou0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7211ou0 extends K implements ListIterator, InterfaceC9783y60 {
    public final C6653mu0 D;
    public int E;
    public W51 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7211ou0(C6653mu0 c6653mu0, int i) {
        super(i, c6653mu0.size());
        G10.g(c6653mu0, "builder");
        this.D = c6653mu0;
        this.E = c6653mu0.D();
        this.G = -1;
        m();
    }

    private final void l() {
        h(this.D.size());
        this.E = this.D.D();
        this.G = -1;
        m();
    }

    @Override // com.daaw.K, java.util.ListIterator
    public void add(Object obj) {
        j();
        this.D.add(e(), obj);
        g(e() + 1);
        l();
    }

    public final void j() {
        if (this.E != this.D.D()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void k() {
        if (this.G == -1) {
            throw new IllegalStateException();
        }
    }

    public final void m() {
        Object[] objArrE = this.D.E();
        if (objArrE == null) {
            this.F = null;
            return;
        }
        int iD = AbstractC1350Kb1.d(this.D.size());
        int iH = AbstractC8417tE0.h(e(), iD);
        int iF = (this.D.F() / 5) + 1;
        W51 w51 = this.F;
        if (w51 == null) {
            this.F = new W51(objArrE, iH, iD, iF);
        } else {
            G10.d(w51);
            w51.m(objArrE, iH, iD, iF);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        j();
        b();
        this.G = e();
        W51 w51 = this.F;
        if (w51 == null) {
            Object[] objArrG = this.D.G();
            int iE = e();
            g(iE + 1);
            return objArrG[iE];
        }
        if (w51.hasNext()) {
            g(e() + 1);
            return w51.next();
        }
        Object[] objArrG2 = this.D.G();
        int iE2 = e();
        g(iE2 + 1);
        return objArrG2[iE2 - w51.f()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        j();
        d();
        this.G = e() - 1;
        W51 w51 = this.F;
        if (w51 == null) {
            Object[] objArrG = this.D.G();
            g(e() - 1);
            return objArrG[e()];
        }
        if (e() <= w51.f()) {
            g(e() - 1);
            return w51.previous();
        }
        Object[] objArrG2 = this.D.G();
        g(e() - 1);
        return objArrG2[e() - w51.f()];
    }

    @Override // com.daaw.K, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        k();
        this.D.remove(this.G);
        if (this.G < e()) {
            g(this.G);
        }
        l();
    }

    @Override // com.daaw.K, java.util.ListIterator
    public void set(Object obj) {
        j();
        k();
        this.D.set(this.G, obj);
        this.E = this.D.D();
        m();
    }
}
