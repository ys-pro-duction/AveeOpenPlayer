package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class W51 extends K {
    public int D;
    public Object[] E;
    public boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public W51(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        G10.g(objArr, "root");
        this.D = i3;
        Object[] objArr2 = new Object[i3];
        this.E = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.F = r5;
        objArr2[0] = objArr;
        k(i - r5, 1);
    }

    public final Object j() {
        int iE = e() & 31;
        Object obj = this.E[this.D - 1];
        if (obj != null) {
            return ((Object[]) obj)[iE];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    public final void k(int i, int i2) {
        int i3 = (this.D - i2) * 5;
        while (i2 < this.D) {
            Object[] objArr = this.E;
            Object obj = objArr[i2 - 1];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i2] = ((Object[]) obj)[AbstractC1350Kb1.a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void l(int i) {
        int i2 = 0;
        while (AbstractC1350Kb1.a(e(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            k(e(), ((this.D - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void m(Object[] objArr, int i, int i2, int i3) {
        G10.g(objArr, "root");
        g(i);
        h(i2);
        this.D = i3;
        if (this.E.length < i3) {
            this.E = new Object[i3];
        }
        this.E[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.F = r0;
        k(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objJ = j();
        g(e() + 1);
        if (e() == f()) {
            this.F = true;
            return objJ;
        }
        l(0);
        return objJ;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        g(e() - 1);
        if (this.F) {
            this.F = false;
            return j();
        }
        l(31);
        return j();
    }
}
