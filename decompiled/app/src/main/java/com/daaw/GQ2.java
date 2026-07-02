package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class GQ2 extends TP2 {
    public final transient RP2 D;
    public final transient Object[] E;
    public final transient int F;

    public GQ2(RP2 rp2, Object[] objArr, int i, int i2) {
        this.D = rp2;
        this.E = objArr;
        this.F = i2;
    }

    @Override // com.daaw.TP2
    public final OP2 G() {
        return new FQ2(this);
    }

    @Override // com.daaw.JP2, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // com.daaw.JP2
    public final int e(Object[] objArr, int i) {
        return w().e(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return w().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.F;
    }

    @Override // com.daaw.TP2, com.daaw.JP2
    public final UQ2 y() {
        return w().listIterator(0);
    }
}
