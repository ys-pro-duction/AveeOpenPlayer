package com.daaw;

/* JADX INFO: renamed from: com.daaw.cV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3724cV0 implements Cloneable {
    public static final Object F = new Object();
    public boolean B;
    public int[] C;
    public Object[] D;
    public int E;

    public C3724cV0() {
        this(10);
    }

    public void b(int i, Object obj) {
        int i2 = this.E;
        if (i2 != 0 && i <= this.C[i2 - 1]) {
            l(i, obj);
            return;
        }
        if (this.B && i2 >= this.C.length) {
            f();
        }
        int i3 = this.E;
        if (i3 >= this.C.length) {
            int iE = AbstractC0571Cr.e(i3 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.C;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.D;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.C = iArr;
            this.D = objArr;
        }
        this.C[i3] = i;
        this.D[i3] = obj;
        this.E = i3 + 1;
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
    public C3724cV0 clone() {
        try {
            C3724cV0 c3724cV0 = (C3724cV0) super.clone();
            c3724cV0.C = (int[]) this.C.clone();
            c3724cV0.D = (Object[]) this.D.clone();
            return c3724cV0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(int i) {
        return i(i) >= 0;
    }

    public final void f() {
        int i = this.E;
        int[] iArr = this.C;
        Object[] objArr = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != F) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.B = false;
        this.E = i2;
    }

    public Object g(int i) {
        return h(i, null);
    }

    public Object h(int i, Object obj) {
        Object obj2;
        int iA = AbstractC0571Cr.a(this.C, this.E, i);
        return (iA < 0 || (obj2 = this.D[iA]) == F) ? obj : obj2;
    }

    public int i(int i) {
        if (this.B) {
            f();
        }
        return AbstractC0571Cr.a(this.C, this.E, i);
    }

    public int j(Object obj) {
        if (this.B) {
            f();
        }
        for (int i = 0; i < this.E; i++) {
            if (this.D[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public int k(int i) {
        if (this.B) {
            f();
        }
        return this.C[i];
    }

    public void l(int i, Object obj) {
        int iA = AbstractC0571Cr.a(this.C, this.E, i);
        if (iA >= 0) {
            this.D[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.E;
        if (i2 < i3) {
            Object[] objArr = this.D;
            if (objArr[i2] == F) {
                this.C[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.B && i3 >= this.C.length) {
            f();
            i2 = ~AbstractC0571Cr.a(this.C, this.E, i);
        }
        int i4 = this.E;
        if (i4 >= this.C.length) {
            int iE = AbstractC0571Cr.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.C;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.D;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.C = iArr;
            this.D = objArr2;
        }
        int i5 = this.E;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.C;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.D;
            System.arraycopy(objArr4, i2, objArr4, i6, this.E - i2);
        }
        this.C[i2] = i;
        this.D[i2] = obj;
        this.E++;
    }

    public int m() {
        if (this.B) {
            f();
        }
        return this.E;
    }

    public Object n(int i) {
        if (this.B) {
            f();
        }
        return this.D[i];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.E * 28);
        sb.append('{');
        for (int i = 0; i < this.E; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(k(i));
            sb.append('=');
            Object objN = n(i);
            if (objN != this) {
                sb.append(objN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3724cV0(int i) {
        this.B = false;
        if (i == 0) {
            this.C = AbstractC0571Cr.a;
            this.D = AbstractC0571Cr.c;
        } else {
            int iE = AbstractC0571Cr.e(i);
            this.C = new int[iE];
            this.D = new Object[iE];
        }
    }
}
