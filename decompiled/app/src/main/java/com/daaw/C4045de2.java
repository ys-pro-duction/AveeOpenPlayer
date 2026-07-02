package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.de2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4045de2 extends AbstractC1247Jb2 {
    public final transient Object D;

    public C4045de2(Object obj) {
        obj.getClass();
        this.D = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.D.equals(obj);
    }

    @Override // com.daaw.AbstractC6446m92
    public final int e(Object[] objArr, int i) {
        objArr[0] = this.D;
        return 1;
    }

    @Override // com.daaw.AbstractC1247Jb2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C7123oc2(this.D);
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
