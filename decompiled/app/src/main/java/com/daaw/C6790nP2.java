package com.daaw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.nP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6790nP2 extends AbstractSet {
    public final /* synthetic */ C9586xP2 B;

    public C6790nP2(C9586xP2 c9586xP2) {
        this.B = c9586xP2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.B.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapK = this.B.k();
        if (mapK != null) {
            return mapK.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iU = this.B.u(entry.getKey());
            if (iU != -1) {
                Object[] objArr = this.B.E;
                objArr.getClass();
                if (AbstractC3977dO2.a(objArr[iU], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C9586xP2 c9586xP2 = this.B;
        Map mapK = c9586xP2.k();
        return mapK != null ? mapK.entrySet().iterator() : new C6232lP2(c9586xP2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapK = this.B.k();
        if (mapK != null) {
            return mapK.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C9586xP2 c9586xP2 = this.B;
        if (c9586xP2.s()) {
            return false;
        }
        int iT = c9586xP2.t();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C9586xP2 c9586xP22 = this.B;
        Object objI = C9586xP2.i(c9586xP22);
        int[] iArr = c9586xP22.C;
        iArr.getClass();
        C9586xP2 c9586xP23 = this.B;
        Object[] objArr = c9586xP23.D;
        objArr.getClass();
        Object[] objArr2 = c9586xP23.E;
        objArr2.getClass();
        int iB = AbstractC9865yP2.b(key, value, iT, objI, iArr, objArr, objArr2);
        if (iB == -1) {
            return false;
        }
        this.B.r(iB, iT);
        C9586xP2 c9586xP24 = this.B;
        c9586xP24.G--;
        this.B.n();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.B.size();
    }
}
