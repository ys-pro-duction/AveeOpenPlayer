package com.daaw;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class Of3 extends AbstractC9641xc3 implements RandomAccess, Rf3 {
    public static final Of3 D;
    public static final Rf3 E;
    public final List C;

    static {
        Of3 of3 = new Of3(false);
        D = of3;
        E = of3;
    }

    public Of3(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.C = arrayList;
    }

    public static String p(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC9646xd3 ? ((AbstractC9646xd3) obj).J(AbstractC10214zf3.b) : AbstractC10214zf3.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        e();
        this.C.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e();
        if (collection instanceof Rf3) {
            collection = ((Rf3) collection).zzh();
        }
        boolean zAddAll = this.C.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.Rf3
    public final Object d(int i) {
        return this.C.get(i);
    }

    @Override // com.daaw.InterfaceC9377wf3
    public final /* bridge */ /* synthetic */ InterfaceC9377wf3 f(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.C);
        return new Of3(arrayList);
    }

    @Override // com.daaw.Rf3
    public final void k(AbstractC9646xd3 abstractC9646xd3) {
        e();
        this.C.add(abstractC9646xd3);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.C.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC9646xd3) {
            AbstractC9646xd3 abstractC9646xd3 = (AbstractC9646xd3) obj;
            String strJ = abstractC9646xd3.J(AbstractC10214zf3.b);
            if (abstractC9646xd3.F()) {
                this.C.set(i, strJ);
            }
            return strJ;
        }
        byte[] bArr = (byte[]) obj;
        String strD = AbstractC10214zf3.d(bArr);
        if (AbstractC8548ti3.d(bArr)) {
            this.C.set(i, strD);
        }
        return strD;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        Object objRemove = this.C.remove(i);
        ((AbstractList) this).modCount++;
        return p(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        e();
        return p(this.C.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.C.size();
    }

    @Override // com.daaw.Rf3
    public final Rf3 zze() {
        return zzc() ? new Zh3(this) : this;
    }

    @Override // com.daaw.Rf3
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.C);
    }

    public Of3(ArrayList arrayList) {
        super(true);
        this.C = arrayList;
    }

    public Of3(boolean z) {
        super(false);
        this.C = Collections.EMPTY_LIST;
    }

    @Override // com.daaw.AbstractC9641xc3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
