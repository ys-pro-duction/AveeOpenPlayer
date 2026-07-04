package com.daaw;

/* JADX INFO: renamed from: com.daaw.oe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7131oe0 implements Cloneable {
    public static final Object F = new Object();
    public boolean B;
    public long[] C;
    public Object[] D;
    public int E;

    public C7131oe0() {
        this(10);
    }

    public void b(long j, Object obj) {
        int i = this.E;
        if (i != 0 && j <= this.C[i - 1]) {
            k(j, obj);
            return;
        }
        if (this.B && i >= this.C.length) {
            f();
        }
        int i2 = this.E;
        if (i2 >= this.C.length) {
            int iF = AbstractC0571Cr.f(i2 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.C;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.D;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.C = jArr;
            this.D = objArr;
        }
        this.C[i2] = j;
        this.D[i2] = obj;
        this.E = i2 + 1;
    }

    public void c() {
        int i = this.E;
        Object[] objArr = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.E = 0;
        this.B = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7131oe0 clone() {
        try {
            C7131oe0 c7131oe0 = (C7131oe0) super.clone();
            c7131oe0.C = (long[]) this.C.clone();
            c7131oe0.D = (Object[]) this.D.clone();
            return c7131oe0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(long j) {
        return i(j) >= 0;
    }

    public final void f() {
        int i = this.E;
        long[] jArr = this.C;
        Object[] objArr = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != F) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.B = false;
        this.E = i2;
    }

    public Object g(long j) {
        return h(j, null);
    }

    public Object h(long j, Object obj) {
        Object obj2;
        int iB = AbstractC0571Cr.b(this.C, this.E, j);
        return (iB < 0 || (obj2 = this.D[iB]) == F) ? obj : obj2;
    }

    public int i(long j) {
        if (this.B) {
            f();
        }
        return AbstractC0571Cr.b(this.C, this.E, j);
    }

    public long j(int i) {
        if (this.B) {
            f();
        }
        return this.C[i];
    }

    public void k(long j, Object obj) {
        int iB = AbstractC0571Cr.b(this.C, this.E, j);
        if (iB >= 0) {
            this.D[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.E;
        if (i < i2) {
            Object[] objArr = this.D;
            if (objArr[i] == F) {
                this.C[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.B && i2 >= this.C.length) {
            f();
            i = ~AbstractC0571Cr.b(this.C, this.E, j);
        }
        int i3 = this.E;
        if (i3 >= this.C.length) {
            int iF = AbstractC0571Cr.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.C;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.D;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.C = jArr;
            this.D = objArr2;
        }
        int i4 = this.E;
        if (i4 - i != 0) {
            long[] jArr3 = this.C;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.D;
            System.arraycopy(objArr4, i, objArr4, i5, this.E - i);
        }
        this.C[i] = j;
        this.D[i] = obj;
        this.E++;
    }

    public void l(long j) {
        int iB = AbstractC0571Cr.b(this.C, this.E, j);
        if (iB >= 0) {
            Object[] objArr = this.D;
            Object obj = objArr[iB];
            Object obj2 = F;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.B = true;
            }
        }
    }

    public void m(int i) {
        Object[] objArr = this.D;
        Object obj = objArr[i];
        Object obj2 = F;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.B = true;
        }
    }

    public int n() {
        if (this.B) {
            f();
        }
        return this.E;
    }

    public Object o(int i) {
        if (this.B) {
            f();
        }
        return this.D[i];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.E * 28);
        sb.append('{');
        for (int i = 0; i < this.E; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(j(i));
            sb.append('=');
            Object objO = o(i);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7131oe0(int i) {
        this.B = false;
        if (i == 0) {
            this.C = AbstractC0571Cr.b;
            this.D = AbstractC0571Cr.c;
        } else {
            int iF = AbstractC0571Cr.f(i);
            this.C = new long[iF];
            this.D = new Object[iF];
        }
    }
}
