package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.Rt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2170Rt0 implements Iterator, InterfaceC9783y60 {
    public final Y51[] B;
    public int C;
    public boolean D;

    public AbstractC2170Rt0(X51 x51, Y51[] y51Arr) {
        G10.g(x51, "node");
        G10.g(y51Arr, "path");
        this.B = y51Arr;
        this.D = true;
        y51Arr[0].l(x51.p(), x51.m() * 2);
        this.C = 0;
        e();
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final Object d() {
        b();
        return this.B[this.C].b();
    }

    public final void e() {
        if (this.B[this.C].g()) {
            return;
        }
        for (int i = this.C; -1 < i; i--) {
            int iG = g(i);
            if (iG == -1 && this.B[i].h()) {
                this.B[i].k();
                iG = g(i);
            }
            if (iG != -1) {
                this.C = iG;
                return;
            }
            if (i > 0) {
                this.B[i - 1].k();
            }
            this.B[i].l(X51.e.a().p(), 0);
        }
        this.D = false;
    }

    public final Y51[] f() {
        return this.B;
    }

    public final int g(int i) {
        if (this.B[i].g()) {
            return i;
        }
        if (!this.B[i].h()) {
            return -1;
        }
        X51 x51D = this.B[i].d();
        if (i == 6) {
            this.B[i + 1].l(x51D.p(), x51D.p().length);
        } else {
            this.B[i + 1].l(x51D.p(), x51D.m() * 2);
        }
        return g(i + 1);
    }

    public final void h(int i) {
        this.C = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.D;
    }

    @Override // java.util.Iterator
    public Object next() {
        b();
        Object next = this.B[this.C].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
