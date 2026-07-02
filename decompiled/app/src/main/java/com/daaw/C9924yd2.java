package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.yd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9924yd2 extends AbstractC1247Jb2 {
    public static final Object[] I;
    public static final C9924yd2 J;
    public final transient Object[] D;
    public final transient int E;
    public final transient Object[] F;
    public final transient int G;
    public final transient int H;

    static {
        Object[] objArr = new Object[0];
        I = objArr;
        J = new C9924yd2(objArr, 0, objArr, 0, 0);
    }

    public C9924yd2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.D = objArr;
        this.E = i;
        this.F = objArr2;
        this.G = i2;
        this.H = i3;
    }

    @Override // com.daaw.AbstractC1247Jb2
    public final AbstractC4308eb2 E() {
        return AbstractC4308eb2.D(this.D, this.H);
    }

    @Override // com.daaw.AbstractC1247Jb2
    public final boolean H() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.F;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = H82.a(obj.hashCode());
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

    @Override // com.daaw.AbstractC6446m92
    public final int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, 0, this.H);
        return this.H;
    }

    @Override // com.daaw.AbstractC1247Jb2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return D().listIterator(0);
    }

    @Override // com.daaw.AbstractC6446m92
    public final int q() {
        return this.H;
    }

    @Override // com.daaw.AbstractC6446m92
    public final int s() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.H;
    }

    @Override // com.daaw.AbstractC6446m92
    public final Object[] w() {
        return this.D;
    }
}
