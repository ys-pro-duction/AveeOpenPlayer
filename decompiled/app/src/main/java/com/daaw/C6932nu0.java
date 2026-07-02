package com.daaw;

/* JADX INFO: renamed from: com.daaw.nu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6932nu0 extends K {
    public final Object[] D;
    public final W51 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6932nu0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        G10.g(objArr, "root");
        G10.g(objArr2, "tail");
        this.D = objArr2;
        int iD = AbstractC1350Kb1.d(i2);
        this.E = new W51(objArr, AbstractC8417tE0.h(i, iD), iD, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        if (this.E.hasNext()) {
            g(e() + 1);
            return this.E.next();
        }
        Object[] objArr = this.D;
        int iE = e();
        g(iE + 1);
        return objArr[iE - this.E.f()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        if (e() <= this.E.f()) {
            g(e() - 1);
            return this.E.previous();
        }
        Object[] objArr = this.D;
        g(e() - 1);
        return objArr[e() - this.E.f()];
    }
}
