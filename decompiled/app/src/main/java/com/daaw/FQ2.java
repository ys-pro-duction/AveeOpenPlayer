package com.daaw;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class FQ2 extends OP2 {
    public final /* synthetic */ GQ2 D;

    public FQ2(GQ2 gq2) {
        this.D = gq2;
    }

    @Override // com.daaw.JP2
    public final boolean D() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AbstractC5381iO2.a(i, this.D.F, "index");
        GQ2 gq2 = this.D;
        int i2 = i + i;
        Object obj = gq2.E[i2];
        obj.getClass();
        Object obj2 = gq2.E[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D.F;
    }
}
