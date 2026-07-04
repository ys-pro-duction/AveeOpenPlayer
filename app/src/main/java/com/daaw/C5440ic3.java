package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.ic3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5440ic3 extends Ub3 {
    public final transient Object D;

    public C5440ic3(Object obj) {
        obj.getClass();
        this.D = obj;
    }

    @Override // com.daaw.AbstractC9636xb3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.D.equals(obj);
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int e(Object[] objArr, int i) {
        objArr[0] = this.D;
        return 1;
    }

    @Override // com.daaw.Ub3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new Wb3(this.D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.D.toString() + "]";
    }
}
