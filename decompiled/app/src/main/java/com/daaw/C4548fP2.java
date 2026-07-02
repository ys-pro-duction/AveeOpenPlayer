package com.daaw;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.fP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4548fP2 extends AbstractCollection {
    public final /* synthetic */ AbstractC4827gP2 B;

    public C4548fP2(AbstractC4827gP2 abstractC4827gP2) {
        this.B = abstractC4827gP2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.B.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.B.zzs().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.B.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.B.zze();
    }
}
