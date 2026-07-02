package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.tJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8439tJ2 extends AbstractList implements RandomAccess, InterfaceC1259Je2 {
    public final InterfaceC1259Je2 B;

    public C8439tJ2(InterfaceC1259Je2 interfaceC1259Je2) {
        this.B = interfaceC1259Je2;
    }

    @Override // com.daaw.InterfaceC1259Je2
    public final Object d(int i) {
        return this.B.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C4612fe2) this.B).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new MI2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C5357iI2(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }

    @Override // com.daaw.InterfaceC1259Je2
    public final List zzh() {
        return this.B.zzh();
    }

    @Override // com.daaw.InterfaceC1259Je2
    public final InterfaceC1259Je2 zze() {
        return this;
    }
}
