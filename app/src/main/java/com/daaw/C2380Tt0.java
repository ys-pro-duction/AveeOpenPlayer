package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Tt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2380Tt0 extends AbstractC2170Rt0 implements Iterator, InterfaceC9783y60 {
    public final C2276St0 E;
    public Object F;
    public boolean G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380Tt0(C2276St0 c2276St0, Y51[] y51Arr) {
        super(c2276St0.h(), y51Arr);
        G10.g(c2276St0, "builder");
        G10.g(y51Arr, "path");
        this.E = c2276St0;
        this.H = c2276St0.g();
    }

    private final void j() {
        if (this.E.g() != this.H) {
            throw new ConcurrentModificationException();
        }
    }

    public final void k() {
        if (!this.G) {
            throw new IllegalStateException();
        }
    }

    public final void l(int i, X51 x51, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            f()[i2].m(x51.p(), x51.p().length, 0);
            while (!G10.c(f()[i2].b(), obj)) {
                f()[i2].j();
            }
            h(i2);
            return;
        }
        int iF = 1 << AbstractC3343b61.f(i, i3);
        if (x51.q(iF)) {
            f()[i2].m(x51.p(), x51.m() * 2, x51.n(iF));
            h(i2);
        } else {
            int iO = x51.O(iF);
            X51 x51N = x51.N(iO);
            f()[i2].m(x51.p(), x51.m() * 2, iO);
            l(i, x51N, obj, i2 + 1);
        }
    }

    public final void m(Object obj, Object obj2) {
        if (this.E.containsKey(obj)) {
            if (hasNext()) {
                Object objD = d();
                this.E.put(obj, obj2);
                l(objD != null ? objD.hashCode() : 0, this.E.h(), objD, 0);
            } else {
                this.E.put(obj, obj2);
            }
            this.H = this.E.g();
        }
    }

    @Override // com.daaw.AbstractC2170Rt0, java.util.Iterator
    public Object next() {
        j();
        this.F = d();
        this.G = true;
        return super.next();
    }

    @Override // com.daaw.AbstractC2170Rt0, java.util.Iterator
    public void remove() {
        k();
        if (hasNext()) {
            Object objD = d();
            V71.c(this.E).remove(this.F);
            l(objD != null ? objD.hashCode() : 0, this.E.h(), objD, 0);
        } else {
            V71.c(this.E).remove(this.F);
        }
        this.F = null;
        this.G = false;
        this.H = this.E.g();
    }
}
