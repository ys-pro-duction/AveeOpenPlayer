package com.daaw;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.aP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3145aP2 extends AbstractCollection {
    public final Object B;
    public Collection C;
    public final AbstractC3145aP2 D;
    public final Collection E;
    public final /* synthetic */ AbstractC3981dP2 F;

    public AbstractC3145aP2(AbstractC3981dP2 abstractC3981dP2, Object obj, Collection collection, AbstractC3145aP2 abstractC3145aP2) {
        this.F = abstractC3981dP2;
        this.B = obj;
        this.C = collection;
        this.D = abstractC3145aP2;
        this.E = abstractC3145aP2 == null ? null : abstractC3145aP2.C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.C.isEmpty();
        boolean zAdd = this.C.add(obj);
        if (zAdd) {
            this.F.F++;
            if (zIsEmpty) {
                e();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.C.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.C.size();
        this.F.F += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.C.clear();
        this.F.F -= size;
        m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.C.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.C.containsAll(collection);
    }

    public final void e() {
        AbstractC3145aP2 abstractC3145aP2 = this.D;
        if (abstractC3145aP2 != null) {
            abstractC3145aP2.e();
            return;
        }
        AbstractC3981dP2 abstractC3981dP2 = this.F;
        abstractC3981dP2.E.put(this.B, this.C);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.C.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.C.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new ZO2(this);
    }

    public final void m() {
        AbstractC3145aP2 abstractC3145aP2 = this.D;
        if (abstractC3145aP2 != null) {
            abstractC3145aP2.m();
        } else if (this.C.isEmpty()) {
            AbstractC3981dP2 abstractC3981dP2 = this.F;
            abstractC3981dP2.E.remove(this.B);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.C.remove(obj);
        if (zRemove) {
            AbstractC3981dP2 abstractC3981dP2 = this.F;
            abstractC3981dP2.F--;
            m();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.C.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.C.size();
            this.F.F += size2 - size;
            m();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.C.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.C.size();
            this.F.F += size2 - size;
            m();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.C.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.C.toString();
    }

    public final void zzb() {
        AbstractC3145aP2 abstractC3145aP2 = this.D;
        if (abstractC3145aP2 != null) {
            abstractC3145aP2.zzb();
            AbstractC3145aP2 abstractC3145aP22 = this.D;
            if (abstractC3145aP22.C != this.E) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.C.isEmpty()) {
            AbstractC3981dP2 abstractC3981dP2 = this.F;
            Collection collection = (Collection) abstractC3981dP2.E.get(this.B);
            if (collection != null) {
                this.C = collection;
            }
        }
    }
}
