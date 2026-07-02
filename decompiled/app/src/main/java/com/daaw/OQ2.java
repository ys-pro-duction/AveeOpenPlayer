package com.daaw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class OQ2 extends NQ2 implements SortedSet {
    public OQ2(SortedSet sortedSet, InterfaceC5661jO2 interfaceC5661jO2) {
        super(sortedSet, interfaceC5661jO2);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.B).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.B.iterator();
        it.getClass();
        InterfaceC5661jO2 interfaceC5661jO2 = this.C;
        interfaceC5661jO2.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC5661jO2.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new OQ2(((SortedSet) this.B).headSet(obj), this.C);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.B;
        while (true) {
            InterfaceC5661jO2 interfaceC5661jO2 = this.C;
            Object objLast = sortedSetHeadSet.last();
            if (interfaceC5661jO2.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new OQ2(((SortedSet) this.B).subSet(obj, obj2), this.C);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new OQ2(((SortedSet) this.B).tailSet(obj), this.C);
    }
}
