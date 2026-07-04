package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class EQ2 extends OP2 {
    public static final OP2 F = new EQ2(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public EQ2(Object[] objArr, int i) {
        this.D = objArr;
        this.E = i;
    }

    @Override // com.daaw.JP2
    public final boolean D() {
        return false;
    }

    @Override // com.daaw.JP2
    public final Object[] E() {
        return this.D;
    }

    @Override // com.daaw.OP2, com.daaw.JP2
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, i, this.E);
        return i + this.E;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5381iO2.a(i, this.E, "index");
        Object obj = this.D[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.JP2
    public final int q() {
        return this.E;
    }

    @Override // com.daaw.JP2
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
