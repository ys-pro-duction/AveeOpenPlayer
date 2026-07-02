package com.daaw;

import com.daaw.C2719Xa;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class JU0 implements C2719Xa.a {
    public static float n = 0.001f;
    public final int a = -1;
    public int b = 16;
    public int c = 16;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public int[] f = new int[16];
    public float[] g = new float[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public int j = 0;
    public int k = -1;
    public final C2719Xa l;
    public final C6871ni m;

    public JU0(C2719Xa c2719Xa, C6871ni c6871ni) {
        this.l = c2719Xa;
        this.m = c6871ni;
        clear();
    }

    @Override // com.daaw.C2719Xa.a
    public float a(IU0 iu0, boolean z) {
        int iP = p(iu0);
        if (iP == -1) {
            return 0.0f;
        }
        r(iu0);
        float f = this.g[iP];
        if (this.k == iP) {
            this.k = this.i[iP];
        }
        this.f[iP] = -1;
        int[] iArr = this.h;
        int i = iArr[iP];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[iP];
        }
        int i2 = this.i[iP];
        if (i2 != -1) {
            iArr[i2] = iArr[iP];
        }
        this.j--;
        iu0.m--;
        if (z) {
            iu0.c(this.l);
        }
        return f;
    }

    @Override // com.daaw.C2719Xa.a
    public int b() {
        return this.j;
    }

    @Override // com.daaw.C2719Xa.a
    public void c(IU0 iu0, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int iP = p(iu0);
            if (iP == -1) {
                h(iu0, f);
                return;
            }
            float[] fArr = this.g;
            float f3 = fArr[iP] + f;
            fArr[iP] = f3;
            float f4 = n;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iP] = 0.0f;
            a(iu0, z);
        }
    }

    @Override // com.daaw.C2719Xa.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            IU0 iu0D = d(i2);
            if (iu0D != null) {
                iu0D.c(this.l);
            }
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // com.daaw.C2719Xa.a
    public IU0 d(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // com.daaw.C2719Xa.a
    public float e(IU0 iu0) {
        int iP = p(iu0);
        if (iP != -1) {
            return this.g[iP];
        }
        return 0.0f;
    }

    @Override // com.daaw.C2719Xa.a
    public void f() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.daaw.C2719Xa.a
    public float g(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.daaw.C2719Xa.a
    public void h(IU0 iu0, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            a(iu0, true);
            return;
        }
        if (this.j == 0) {
            m(0, iu0, f);
            l(iu0, 0);
            this.k = 0;
            return;
        }
        int iP = p(iu0);
        if (iP != -1) {
            this.g[iP] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            o();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = iu0.c;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, iu0, f);
    }

    @Override // com.daaw.C2719Xa.a
    public boolean i(IU0 iu0) {
        return p(iu0) != -1;
    }

    @Override // com.daaw.C2719Xa.a
    public void j(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.daaw.C2719Xa.a
    public float k(C2719Xa c2719Xa, boolean z) {
        float fE = e(c2719Xa.a);
        a(c2719Xa.a, z);
        JU0 ju0 = (JU0) c2719Xa.e;
        int iB = ju0.b();
        int i = 0;
        int i2 = 0;
        while (i < iB) {
            int i3 = ju0.f[i2];
            if (i3 != -1) {
                c(this.m.d[i3], ju0.g[i2] * fE, z);
                i++;
            }
            i2++;
        }
        return fE;
    }

    public final void l(IU0 iu0, int i) {
        int[] iArr;
        int i2 = iu0.c % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    public final void m(int i, IU0 iu0, float f) {
        this.f[i] = iu0.c;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        iu0.a(this.l);
        iu0.m++;
        this.j++;
    }

    public final int n() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    public int p(IU0 iu0) {
        if (this.j == 0) {
            return -1;
        }
        int i = iu0.c;
        int i2 = this.d[i % this.c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f[i2] == i) {
            return i2;
        }
        do {
            i2 = this.e[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f[i2] != i);
        if (i2 != -1 && this.f[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final void q(int i, IU0 iu0, float f) {
        int iN = n();
        m(iN, iu0, f);
        if (i != -1) {
            this.h[iN] = i;
            int[] iArr = this.i;
            iArr[iN] = iArr[i];
            iArr[i] = iN;
        } else {
            this.h[iN] = -1;
            if (this.j > 0) {
                this.i[iN] = this.k;
                this.k = iN;
            } else {
                this.i[iN] = -1;
            }
        }
        int i2 = this.i[iN];
        if (i2 != -1) {
            this.h[i2] = iN;
        }
        l(iu0, iN);
    }

    public final void r(IU0 iu0) {
        int[] iArr;
        int i;
        int i2 = iu0.c;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f[i4] == i2) {
            int[] iArr3 = this.e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            i = iArr[i4];
            if (i == -1 || this.f[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            IU0 iu0D = d(i2);
            if (iu0D != null) {
                String str2 = str + iu0D + " = " + g(i2) + " ";
                int iP = p(iu0D);
                String str3 = str2 + "[p: ";
                String str4 = (this.h[iP] != -1 ? str3 + this.m.d[this.f[this.h[iP]]] : str3 + "none") + ", n: ";
                str = (this.i[iP] != -1 ? str4 + this.m.d[this.f[this.i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
