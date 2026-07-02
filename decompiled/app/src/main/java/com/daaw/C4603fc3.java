package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.fc3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4603fc3 extends Ub3 {
    public static final Object[] I;
    public static final C4603fc3 J;
    public final transient Object[] D;
    public final transient int E;
    public final transient Object[] F;
    public final transient int G;
    public final transient int H;

    static {
        Object[] objArr = new Object[0];
        I = objArr;
        J = new C4603fc3(objArr, 0, objArr, 0, 0);
    }

    public C4603fc3(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.D = objArr;
        this.E = i;
        this.F = objArr2;
        this.G = i2;
        this.H = i3;
    }

    @Override // com.daaw.Ub3
    public final Rb3 E() {
        return Rb3.D(this.D, this.H);
    }

    @Override // com.daaw.Ub3
    public final boolean G() {
        return true;
    }

    @Override // com.daaw.AbstractC9636xb3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.F;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = AbstractC7119ob3.a(obj.hashCode());
        while (true) {
            int i = iA & this.G;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i + 1;
        }
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, 0, this.H);
        return this.H;
    }

    @Override // com.daaw.Ub3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return D().listIterator(0);
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int q() {
        return this.H;
    }

    @Override // com.daaw.AbstractC9636xb3
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.H;
    }

    @Override // com.daaw.AbstractC9636xb3
    public final Object[] w() {
        return this.D;
    }
}
