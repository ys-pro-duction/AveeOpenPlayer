package com.daaw;

/* JADX INFO: renamed from: com.daaw.wG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9269wG0 extends PY {
    public static final Object[] I;
    public static final C9269wG0 J;
    public final transient Object[] D;
    public final transient int E;
    public final transient Object[] F;
    public final transient int G;
    public final transient int H;

    static {
        Object[] objArr = new Object[0];
        I = objArr;
        J = new C9269wG0(objArr, 0, objArr, 0, 0);
    }

    public C9269wG0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.D = objArr;
        this.E = i;
        this.F = objArr2;
        this.G = i2;
        this.H = i3;
    }

    @Override // com.daaw.PY
    public MY H() {
        return MY.E(this.D, this.H);
    }

    @Override // com.daaw.PY
    public boolean I() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public O91 iterator() {
        return D().iterator();
    }

    @Override // com.daaw.IY, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.F;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = EU.b(obj);
        while (true) {
            int i = iB & this.G;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i + 1;
        }
    }

    @Override // com.daaw.IY
    public int e(Object[] objArr, int i) {
        System.arraycopy(this.D, 0, objArr, i, this.H);
        return i + this.H;
    }

    @Override // com.daaw.PY, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.E;
    }

    @Override // com.daaw.IY
    public Object[] q() {
        return this.D;
    }

    @Override // com.daaw.IY
    public int s() {
        return this.H;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.H;
    }

    @Override // com.daaw.IY
    public int w() {
        return 0;
    }

    @Override // com.daaw.IY
    public boolean y() {
        return false;
    }
}
