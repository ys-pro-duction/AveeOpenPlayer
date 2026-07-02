package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class IQ2 extends OP2 {
    public final transient Object[] D;
    public final transient int E;
    public final transient int F;

    public IQ2(Object[] objArr, int i, int i2) {
        this.D = objArr;
        this.E = i;
        this.F = i2;
    }

    @Override // com.daaw.JP2
    public final boolean D() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5381iO2.a(i, this.F, "index");
        Object obj = this.D[i + i + this.E];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.F;
    }
}
