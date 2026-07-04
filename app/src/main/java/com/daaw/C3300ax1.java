package com.daaw;

import com.google.android.gms.measurement.internal.zzas;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.ax1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3300ax1 implements Iterator {
    public final Iterator B;
    public final /* synthetic */ zzas C;

    public C3300ax1(zzas zzasVar) {
        this.C = zzasVar;
        this.B = zzasVar.B.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.B.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
