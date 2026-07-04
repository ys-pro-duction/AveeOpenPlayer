package com.daaw;

import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.Gx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1022Gx1 extends AbstractC9714xr1 {
    public final transient Object[] D;
    public final transient int E;
    public final transient int F;

    public C1022Gx1(Object[] objArr, int i, int i2) {
        this.D = objArr;
        this.E = i;
        this.F = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1601Mm1.a(i, this.F, "index");
        Object obj = this.D[i + i + this.E];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.F;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final boolean y() {
        return true;
    }
}
