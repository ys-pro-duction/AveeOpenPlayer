package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1929Pq1 extends AbstractC9714xr1 {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ AbstractC9714xr1 F;

    public C1929Pq1(AbstractC9714xr1 abstractC9714xr1, int i, int i2) {
        this.F = abstractC9714xr1;
        this.D = i;
        this.E = i2;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final Object[] D() {
        return this.F.D();
    }

    @Override // com.daaw.AbstractC9714xr1
    /* JADX INFO: renamed from: E */
    public final AbstractC9714xr1 subList(int i, int i2) {
        AbstractC1601Mm1.d(i, i2, this.E);
        int i3 = this.D;
        return this.F.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1601Mm1.a(i, this.E, "index");
        return this.F.get(i + this.D);
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final int q() {
        return this.F.s() + this.D + this.E;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final int s() {
        return this.F.s() + this.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.AbstractC9714xr1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final boolean y() {
        return true;
    }
}
