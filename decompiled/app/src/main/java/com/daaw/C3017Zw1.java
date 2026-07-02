package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Zw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3017Zw1 extends AbstractC2797Xt1 {
    public final transient AbstractC7765qt1 D;
    public final transient AbstractC9714xr1 E;

    public C3017Zw1(AbstractC7765qt1 abstractC7765qt1, AbstractC9714xr1 abstractC9714xr1) {
        this.D = abstractC7765qt1;
        this.E = abstractC9714xr1;
    }

    @Override // com.daaw.AbstractC1510Lp1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.D.get(obj) != null;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final int e(Object[] objArr, int i) {
        return this.E.e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.E.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D.size();
    }

    @Override // com.daaw.AbstractC2797Xt1, com.daaw.AbstractC1510Lp1
    public final AbstractC9714xr1 w() {
        return this.E;
    }
}
