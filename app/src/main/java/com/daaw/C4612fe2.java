package com.daaw;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.fe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4612fe2 extends AbstractC3653cD1 implements RandomAccess, InterfaceC1259Je2 {
    public static final C4612fe2 D;
    public static final InterfaceC1259Je2 E;
    public final List C;

    static {
        C4612fe2 c4612fe2 = new C4612fe2(false);
        D = c4612fe2;
        E = c4612fe2;
    }

    public C4612fe2(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.C = arrayList;
    }

    public static String p(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof BM1 ? ((BM1) obj).J(J82.b) : J82.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        e();
        this.C.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e();
        if (collection instanceof InterfaceC1259Je2) {
            collection = ((InterfaceC1259Je2) collection).zzh();
        }
        boolean zAddAll = this.C.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.InterfaceC1259Je2
    public final Object d(int i) {
        return this.C.get(i);
    }

    @Override // com.daaw.M72
    public final /* bridge */ /* synthetic */ M72 f(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.C);
        return new C4612fe2(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.C.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof BM1) {
            BM1 bm1 = (BM1) obj;
            String strJ = bm1.J(J82.b);
            if (bm1.F()) {
                this.C.set(i, strJ);
            }
            return strJ;
        }
        byte[] bArr = (byte[]) obj;
        String strD = J82.d(bArr);
        if (PO2.d(bArr)) {
            this.C.set(i, strD);
        }
        return strD;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractList, java.util.List
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

    @Override // com.daaw.InterfaceC1259Je2
    public final InterfaceC1259Je2 zze() {
        return zzc() ? new C8439tJ2(this) : this;
    }

    @Override // com.daaw.InterfaceC1259Je2
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.C);
    }

    public C4612fe2(ArrayList arrayList) {
        super(true);
        this.C = arrayList;
    }

    public C4612fe2(boolean z) {
        super(false);
        this.C = Collections.EMPTY_LIST;
    }

    @Override // com.daaw.AbstractC3653cD1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
