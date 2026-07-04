package com.daaw;

/* JADX INFO: renamed from: com.daaw.cc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3757cc3 extends Rb3 {
    public static final Rb3 F = new C3757cc3(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public C3757cc3(Object[] objArr, int i) {
        this.D = objArr;
        this.E = i;
    }

    @Override // com.daaw.Rb3, com.daaw.AbstractC9636xb3
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, 0, this.E);
        return this.E;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Ka3.a(i, this.E, "index");
        Object obj = this.D[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int q() {
        return this.E;
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.AbstractC9636xb3
    public final Object[] w() {
        return this.D;
    }
}
