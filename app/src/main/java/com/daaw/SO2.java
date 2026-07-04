package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SO2 implements Iterator {
    public Map.Entry B;
    public final /* synthetic */ Iterator C;
    public final /* synthetic */ TO2 D;

    public SO2(TO2 to2, Iterator it) {
        this.D = to2;
        this.C = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.C.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.C.next();
        this.B = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC5381iO2.j(this.B != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.B.getValue();
        this.C.remove();
        this.D.C.F -= collection.size();
        collection.clear();
        this.B = null;
    }
}
