package com.daaw;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.lb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6279lb0 extends AbstractC4146e0 implements InterfaceC6837nb0, RandomAccess {
    public static final C6279lb0 D;
    public static final InterfaceC6837nb0 E;
    public final List C;

    static {
        C6279lb0 c6279lb0 = new C6279lb0();
        D = c6279lb0;
        c6279lb0.l();
        E = c6279lb0;
    }

    public C6279lb0() {
        this(10);
    }

    public static String p(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC4340ei ? ((AbstractC4340ei) obj).a0() : AbstractC3317b10.i((byte[]) obj);
    }

    @Override // com.daaw.InterfaceC6837nb0
    public Object A(int i) {
        return this.C.get(i);
    }

    @Override // com.daaw.AbstractC4146e0, com.daaw.AbstractC3317b10.e
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.daaw.InterfaceC6837nb0
    public List h() {
        return DesugarCollections.unmodifiableList(this.C);
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.daaw.InterfaceC6837nb0
    public InterfaceC6837nb0 j() {
        return C() ? new Q91(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        e();
        this.C.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.InterfaceC6837nb0
    public void o(AbstractC4340ei abstractC4340ei) {
        e();
        this.C.add(abstractC4340ei);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.C.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4340ei) {
            AbstractC4340ei abstractC4340ei = (AbstractC4340ei) obj;
            String strA0 = abstractC4340ei.a0();
            if (abstractC4340ei.O()) {
                this.C.set(i, strA0);
            }
            return strA0;
        }
        byte[] bArr = (byte[]) obj;
        String strI = AbstractC3317b10.i(bArr);
        if (AbstractC3317b10.g(bArr)) {
            this.C.set(i, strI);
        }
        return strI;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.daaw.AbstractC3317b10.e
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C6279lb0 n(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.C);
        return new C6279lb0(arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.C.size();
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        e();
        Object objRemove = this.C.remove(i);
        ((AbstractList) this).modCount++;
        return p(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        e();
        return p(this.C.set(i, str));
    }

    public C6279lb0(int i) {
        this(new ArrayList(i));
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        e();
        if (collection instanceof InterfaceC6837nb0) {
            collection = ((InterfaceC6837nb0) collection).h();
        }
        boolean zAddAll = this.C.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.daaw.AbstractC4146e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C6279lb0(ArrayList arrayList) {
        this.C = arrayList;
    }
}
