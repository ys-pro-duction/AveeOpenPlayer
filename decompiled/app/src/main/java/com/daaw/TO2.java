package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TO2 extends AbstractC5389iQ2 {
    public final /* synthetic */ AbstractC3981dP2 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TO2(AbstractC3981dP2 abstractC3981dP2, Map map) {
        super(map);
        this.C = abstractC3981dP2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC3428bQ2.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.B.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.B.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.B.keySet().hashCode();
    }

    @Override // com.daaw.AbstractC5389iQ2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new SO2(this, this.B.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.B.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.C.F -= size;
        return size > 0;
    }
}
