package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class B53 extends AbstractList implements RandomAccess, InterfaceC10055z43 {
    public final InterfaceC10055z43 B;

    public B53(InterfaceC10055z43 interfaceC10055z43) {
        this.B = interfaceC10055z43;
    }

    @Override // com.daaw.InterfaceC10055z43
    public final void B(AbstractC9213w33 abstractC9213w33) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.InterfaceC10055z43
    public final Object d(int i) {
        return this.B.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C9776y43) this.B).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new A53(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C10060z53(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.B.size();
    }

    @Override // com.daaw.InterfaceC10055z43
    public final List zzh() {
        return this.B.zzh();
    }

    @Override // com.daaw.InterfaceC10055z43
    public final InterfaceC10055z43 zze() {
        return this;
    }
}
