package com.daaw;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: renamed from: com.daaw.Nv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1741Nv1 extends AbstractC9714xr1 {
    public final /* synthetic */ C8614tw1 D;

    public C1741Nv1(C8614tw1 c8614tw1) {
        this.D = c8614tw1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AbstractC1601Mm1.a(i, this.D.F, "index");
        int i2 = i + i;
        Object obj = this.D.E[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.D.E[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D.F;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final boolean y() {
        return true;
    }
}
