package com.daaw;

import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.uG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8704uG0 extends MY {
    public static final MY F = new C8704uG0(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public C8704uG0(Object[] objArr, int i) {
        this.D = objArr;
        this.E = i;
    }

    @Override // com.daaw.MY, com.daaw.IY
    public int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, i, this.E);
        return i + this.E;
    }

    @Override // java.util.List
    public Object get(int i) {
        AbstractC7785qy0.l(i, this.E);
        Object obj = this.D[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.daaw.IY
    public Object[] q() {
        return this.D;
    }

    @Override // com.daaw.IY
    public int s() {
        return this.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.E;
    }

    @Override // com.daaw.IY
    public int w() {
        return 0;
    }
}
