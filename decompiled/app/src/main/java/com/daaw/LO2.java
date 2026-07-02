package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class LO2 extends AbstractC5110hQ2 {
    public final /* synthetic */ NO2 B;

    public LO2(NO2 no2) {
        this.B = no2;
    }

    @Override // com.daaw.AbstractC5110hQ2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return AbstractC5665jP2.a(this.B.D.entrySet(), obj);
    }

    @Override // com.daaw.AbstractC5110hQ2
    public final Map e() {
        return this.B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new MO2(this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        NO2 no2 = this.B;
        AbstractC3981dP2.r(no2.E, entry.getKey());
        return true;
    }
}
