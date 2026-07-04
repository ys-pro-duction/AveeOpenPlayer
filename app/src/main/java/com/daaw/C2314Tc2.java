package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2314Tc2 extends AbstractC4308eb2 {
    public static final AbstractC4308eb2 F = new C2314Tc2(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public C2314Tc2(Object[] objArr, int i) {
        this.D = objArr;
        this.E = i;
    }

    @Override // com.daaw.AbstractC4308eb2, com.daaw.AbstractC6446m92
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, 0, this.E);
        return this.E;
    }

    @Override // java.util.List
    public final Object get(int i) {
        B62.a(i, this.E, "index");
        Object obj = this.D[i];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.AbstractC6446m92
    public final int q() {
        return this.E;
    }

    @Override // com.daaw.AbstractC6446m92
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }

    @Override // com.daaw.AbstractC6446m92
    public final Object[] w() {
        return this.D;
    }
}
