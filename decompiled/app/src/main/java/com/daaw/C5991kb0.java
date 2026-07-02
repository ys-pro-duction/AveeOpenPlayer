package com.daaw;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.kb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5991kb0 extends AbstractList implements RandomAccess, InterfaceC6558mb0 {
    public static final InterfaceC6558mb0 C = new C5991kb0().j();
    public final List B;

    public C5991kb0() {
        this.B = new ArrayList();
    }

    public static AbstractC4629fi m(Object obj) {
        return obj instanceof AbstractC4629fi ? (AbstractC4629fi) obj : obj instanceof String ? AbstractC4629fi.v((String) obj) : AbstractC4629fi.q((byte[]) obj);
    }

    public static String p(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC4629fi ? ((AbstractC4629fi) obj).M() : AbstractC3595c10.b((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.B.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.B.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.InterfaceC6558mb0
    public List h() {
        return DesugarCollections.unmodifiableList(this.B);
    }

    @Override // com.daaw.InterfaceC6558mb0
    public InterfaceC6558mb0 j() {
        return new P91(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.B.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4629fi) {
            AbstractC4629fi abstractC4629fi = (AbstractC4629fi) obj;
            String strM = abstractC4629fi.M();
            if (abstractC4629fi.F()) {
                this.B.set(i, strM);
            }
            return strM;
        }
        byte[] bArr = (byte[]) obj;
        String strB = AbstractC3595c10.b(bArr);
        if (AbstractC3595c10.a(bArr)) {
            this.B.set(i, strB);
        }
        return strB;
    }

    @Override // com.daaw.InterfaceC6558mb0
    public void r(AbstractC4629fi abstractC4629fi) {
        this.B.add(abstractC4629fi);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.B.remove(i);
        ((AbstractList) this).modCount++;
        return p(objRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.B.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return p(this.B.set(i, str));
    }

    @Override // com.daaw.InterfaceC6558mb0
    public AbstractC4629fi x(int i) {
        Object obj = this.B.get(i);
        AbstractC4629fi abstractC4629fiM = m(obj);
        if (abstractC4629fiM != obj) {
            this.B.set(i, abstractC4629fiM);
        }
        return abstractC4629fiM;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC6558mb0) {
            collection = ((InterfaceC6558mb0) collection).h();
        }
        boolean zAddAll = this.B.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C5991kb0(InterfaceC6558mb0 interfaceC6558mb0) {
        this.B = new ArrayList(interfaceC6558mb0.size());
        addAll(interfaceC6558mb0);
    }
}
