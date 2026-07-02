package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MO2 implements Iterator {
    public final Iterator B;
    public Collection C;
    public final /* synthetic */ NO2 D;

    public MO2(NO2 no2) {
        this.D = no2;
        this.B = no2.D.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.B.next();
        this.C = (Collection) entry.getValue();
        return this.D.c(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC5381iO2.j(this.C != null, "no calls to next() since the last call to remove()");
        this.B.remove();
        this.D.E.F -= this.C.size();
        this.C.clear();
        this.C = null;
    }
}
