package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class KQ2 extends TP2 {
    public static final Object[] I;
    public static final KQ2 J;
    public final transient Object[] D;
    public final transient int E;
    public final transient Object[] F;
    public final transient int G;
    public final transient int H;

    static {
        Object[] objArr = new Object[0];
        I = objArr;
        J = new KQ2(objArr, 0, objArr, 0, 0);
    }

    public KQ2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.D = objArr;
        this.E = i;
        this.F = objArr2;
        this.G = i2;
        this.H = i3;
    }

    @Override // com.daaw.JP2
    public final Object[] E() {
        return this.D;
    }

    @Override // com.daaw.TP2
    public final OP2 G() {
        return OP2.G(this.D, this.H);
    }

    @Override // com.daaw.TP2
    public final boolean P() {
        return true;
    }

    @Override // com.daaw.JP2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.F;
            if (objArr.length != 0) {
                int iB = GP2.b(obj);
                while (true) {
                    int i = iB & this.G;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.JP2
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, i, this.H);
        return i + this.H;
    }

    @Override // com.daaw.TP2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return w().listIterator(0);
    }

    @Override // com.daaw.JP2
    public final int q() {
        return this.H;
    }

    @Override // com.daaw.JP2
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.H;
    }

    @Override // com.daaw.TP2, com.daaw.JP2
    public final UQ2 y() {
        return w().listIterator(0);
    }
}
