package com.daaw;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.cP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3702cP2 extends AbstractC3145aP2 implements List {
    public final /* synthetic */ AbstractC3981dP2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3702cP2(AbstractC3981dP2 abstractC3981dP2, Object obj, List list, AbstractC3145aP2 abstractC3145aP2) {
        super(abstractC3981dP2, obj, list, abstractC3145aP2);
        this.G = abstractC3981dP2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.C.isEmpty();
        ((List) this.C).add(i, obj);
        this.G.F++;
        if (zIsEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.C).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.C.size();
        this.G.F += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        e();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.C).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.C).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.C).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C3424bP2(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.C).remove(i);
        AbstractC3981dP2 abstractC3981dP2 = this.G;
        abstractC3981dP2.F--;
        m();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.C).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.C).subList(i, i2);
        AbstractC3145aP2 abstractC3145aP2 = this.D;
        if (abstractC3145aP2 == null) {
            abstractC3145aP2 = this;
        }
        return this.G.k(this.B, listSubList, abstractC3145aP2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C3424bP2(this, i);
    }
}
