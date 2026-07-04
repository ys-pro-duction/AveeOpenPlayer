package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OT0 implements InterfaceC1508Lp, Iterable, InterfaceC9783y60 {
    public int C;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int[] B = new int[0];
    public Object[] D = new Object[0];
    public ArrayList I = new ArrayList();

    public final int D() {
        return this.E;
    }

    public final int E() {
        return this.H;
    }

    public final boolean F() {
        return this.G;
    }

    public final boolean G(int i, C4445f4 c4445f4) {
        G10.g(c4445f4, "anchor");
        if (this.G) {
            AbstractC6348lp.x("Writer is active");
            throw new D80();
        }
        if (!(i >= 0 && i < this.C)) {
            AbstractC6348lp.x("Invalid group index");
            throw new D80();
        }
        if (J(c4445f4)) {
            int iG = PT0.G(this.B, i) + i;
            int iA = c4445f4.a();
            if (i <= iA && iA < iG) {
                return true;
            }
        }
        return false;
    }

    public final NT0 H() {
        if (this.G) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.F++;
        return new NT0(this);
    }

    public final QT0 I() {
        if (this.G) {
            AbstractC6348lp.x("Cannot start a writer when another writer is pending");
            throw new D80();
        }
        if (!(this.F <= 0)) {
            AbstractC6348lp.x("Cannot start a writer when a reader is pending");
            throw new D80();
        }
        this.G = true;
        this.H++;
        return new QT0(this);
    }

    public final boolean J(C4445f4 c4445f4) {
        int iS;
        G10.g(c4445f4, "anchor");
        return c4445f4.b() && (iS = PT0.S(this.I, c4445f4.a(), this.C)) >= 0 && G10.c(this.I.get(iS), c4445f4);
    }

    public final void K(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList) {
        G10.g(iArr, "groups");
        G10.g(objArr, "slots");
        G10.g(arrayList, "anchors");
        this.B = iArr;
        this.C = i;
        this.D = objArr;
        this.E = i2;
        this.I = arrayList;
    }

    public final int e(C4445f4 c4445f4) {
        G10.g(c4445f4, "anchor");
        if (this.G) {
            AbstractC6348lp.x("Use active SlotWriter to determine anchor location instead");
            throw new D80();
        }
        if (c4445f4.b()) {
            return c4445f4.a();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed");
    }

    public boolean isEmpty() {
        return this.C == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C3441bU(this, 0, this.C);
    }

    public final void m(NT0 nt0) {
        int i;
        G10.g(nt0, "reader");
        if (nt0.v() != this || (i = this.F) <= 0) {
            throw new IllegalArgumentException("Unexpected reader close()");
        }
        this.F = i - 1;
    }

    public final void p(QT0 qt0, int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList) {
        G10.g(qt0, "writer");
        G10.g(iArr, "groups");
        G10.g(objArr, "slots");
        G10.g(arrayList, "anchors");
        if (qt0.X() != this || !this.G) {
            throw new IllegalArgumentException("Unexpected writer close()");
        }
        this.G = false;
        K(iArr, i, objArr, i2, arrayList);
    }

    public final ArrayList s() {
        return this.I;
    }

    public final int[] v() {
        return this.B;
    }

    public final int w() {
        return this.C;
    }

    public final Object[] y() {
        return this.D;
    }
}
