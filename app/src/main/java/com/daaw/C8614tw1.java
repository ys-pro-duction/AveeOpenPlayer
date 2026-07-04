package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.tw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8614tw1 extends AbstractC2797Xt1 {
    public final transient AbstractC7765qt1 D;
    public final transient Object[] E;
    public final transient int F;

    public C8614tw1(AbstractC7765qt1 abstractC7765qt1, Object[] objArr, int i, int i2) {
        this.D = abstractC7765qt1;
        this.E = objArr;
        this.F = i2;
    }

    @Override // com.daaw.AbstractC2797Xt1
    public final AbstractC9714xr1 E() {
        return new C1741Nv1(this);
    }

    @Override // com.daaw.AbstractC1510Lp1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.D.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1510Lp1
    public final int e(Object[] objArr, int i) {
        return w().e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return w().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.F;
    }
}
