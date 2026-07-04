package com.daaw;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.y43, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9776y43 extends AbstractC4733g33 implements RandomAccess, InterfaceC10055z43 {
    public static final C9776y43 D;
    public static final InterfaceC10055z43 E;
    public final List C;

    static {
        C9776y43 c9776y43 = new C9776y43(false);
        D = c9776y43;
        E = c9776y43;
    }

    public C9776y43(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.C = arrayList;
    }

    public static String p(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC9213w33 ? ((AbstractC9213w33) obj).V(AbstractC8374t43.b) : AbstractC8374t43.d((byte[]) obj);
    }

    @Override // com.daaw.InterfaceC10055z43
    public final void B(AbstractC9213w33 abstractC9213w33) {
        e();
        this.C.add(abstractC9213w33);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        e();
        this.C.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.AbstractC4733g33, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e();
        if (collection instanceof InterfaceC10055z43) {
            collection = ((InterfaceC10055z43) collection).zzh();
        }
        boolean zAddAll = this.C.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.daaw.AbstractC4733g33, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.InterfaceC10055z43
    public final Object d(int i) {
        return this.C.get(i);
    }

    @Override // com.daaw.InterfaceC8095s43
    public final /* bridge */ /* synthetic */ InterfaceC8095s43 f(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.C);
        return new C9776y43(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.C.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC9213w33) {
            AbstractC9213w33 abstractC9213w33 = (AbstractC9213w33) obj;
            String strV = abstractC9213w33.V(AbstractC8374t43.b);
            if (abstractC9213w33.N()) {
                this.C.set(i, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        String strD = AbstractC8374t43.d(bArr);
        if (P53.i(bArr)) {
            this.C.set(i, strD);
        }
        return strD;
    }

    @Override // com.daaw.AbstractC4733g33, java.util.AbstractList, java.util.List
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

    @Override // com.daaw.InterfaceC10055z43
    public final InterfaceC10055z43 zze() {
        return zzc() ? new B53(this) : this;
    }

    @Override // com.daaw.InterfaceC10055z43
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.C);
    }

    public C9776y43(ArrayList arrayList) {
        super(true);
        this.C = arrayList;
    }

    public C9776y43(boolean z) {
        super(false);
        this.C = Collections.EMPTY_LIST;
    }

    @Override // com.daaw.AbstractC4733g33, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
