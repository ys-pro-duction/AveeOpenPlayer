package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OO2 implements Iterator {
    public final Iterator B;
    public Object C = null;
    public Collection D = null;
    public Iterator E = EnumC3149aQ2.INSTANCE;
    public final /* synthetic */ AbstractC3981dP2 F;

    public OO2(AbstractC3981dP2 abstractC3981dP2) {
        this.F = abstractC3981dP2;
        this.B = abstractC3981dP2.E.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext() || this.E.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.E.hasNext()) {
            Map.Entry entry = (Map.Entry) this.B.next();
            this.C = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.D = collection;
            this.E = collection.iterator();
        }
        return this.E.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.E.remove();
        Collection collection = this.D;
        collection.getClass();
        if (collection.isEmpty()) {
            this.B.remove();
        }
        AbstractC3981dP2 abstractC3981dP2 = this.F;
        abstractC3981dP2.F--;
    }
}
