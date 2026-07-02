package com.daaw;

import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.iv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5530iv1 extends AbstractC9714xr1 {
    public static final AbstractC9714xr1 F = new C5530iv1(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public C5530iv1(Object[] objArr, int i) {
        this.D = objArr;
        this.E = i;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final Object[] D() {
        return this.D;
    }

    @Override // com.daaw.AbstractC9714xr1, com.daaw.AbstractC1510Lp1
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, 0, this.E);
        return this.E;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1601Mm1.a(i, this.E, "index");
        Object obj = this.D[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final int q() {
        return this.E;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final boolean y() {
        return false;
    }
}
