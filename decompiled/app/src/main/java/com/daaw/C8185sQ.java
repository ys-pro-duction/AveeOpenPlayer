package com.daaw;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.daaw.sQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8185sQ {
    public int a = 0;
    public int b = 0;
    public a[] c = new a[0];
    public EX[][] d = (EX[][]) Array.newInstance((Class<?>) EX.class, 0, 0);

    /* JADX INFO: renamed from: com.daaw.sQ$a */
    public class a {
        public float[] a = new float[0];

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.sQ$b */
    public static class b implements EX {
        public final C8185sQ a;
        public final int b;
        public final int c;
        public final float d;
        public int e;
        public int[] f;
        public float[] g;
        public float h;
        public float i;
        public int j;
        public float k;
        public int l;
        public int m;
        public int n;

        public b(C8185sQ c8185sQ, int i, int i2, int i3) {
            int i4 = 0;
            this.e = 0;
            this.f = new int[0];
            this.g = new float[0];
            this.h = 1.0f;
            this.a = c8185sQ;
            this.b = Math.max(0, Math.min(i, c8185sQ.c.length - 1));
            this.c = i2;
            this.e = i3;
            this.d = i2 + 1.0f;
            if (i3 < 1) {
                this.f = new int[]{0};
                this.g = new float[]{1.0f};
                this.h = 1.0f;
                return;
            }
            int[] iArr = new int[i3 + 1 + i3];
            this.f = iArr;
            this.g = new float[iArr.length];
            this.h = Math.max(1.0f, iArr.length * 0.05f);
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return;
                }
                int i5 = i4 - i3;
                iArr2[i4] = i5;
                this.g[i4] = Math.max(GE.b(((iArr2.length + 2) / 2) + i5, iArr2.length + 2) - 0.05f, 0.0f);
                i4++;
            }
        }

        public boolean a(C8185sQ c8185sQ, int i, int i2, int i3) {
            return c8185sQ == this.a && i == this.b && i2 == this.c && i3 == this.e;
        }

        @Override // com.daaw.EX
        public float get(int i) {
            this.n = this.a.c[0].a.length;
            this.i = 0.0f;
            this.l = 0;
            while (true) {
                int i2 = this.l;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    return this.i / this.h;
                }
                int i3 = iArr[i2] + i;
                C8185sQ c8185sQ = this.a;
                this.j = (i3 + c8185sQ.b) % this.n;
                a[] aVarArr = c8185sQ.c;
                int i4 = this.b;
                this.k = aVarArr[i4].a[this.j];
                this.m = i4;
                while (this.m < this.b + this.c) {
                    float f = this.k;
                    a[] aVarArr2 = this.a.c;
                    int i5 = this.m;
                    this.k = f + aVarArr2[i5].a[this.j];
                    this.m = i5 + 1;
                }
                float f2 = this.k / this.d;
                this.k = f2;
                float f3 = this.i;
                float[] fArr = this.g;
                int i6 = this.l;
                this.i = f3 + (f2 * fArr[i6]);
                this.l = i6 + 1;
            }
        }

        @Override // com.daaw.EX
        public int size() {
            return this.a.a;
        }
    }

    public C8185sQ() {
        d(10);
    }

    public void b(float[] fArr) {
        e(fArr.length);
        a[] aVarArr = this.c;
        a aVar = aVarArr[aVarArr.length - 1];
        for (int length = aVarArr.length - 1; length > 0; length--) {
            a[] aVarArr2 = this.c;
            aVarArr2[length] = aVarArr2[length - 1];
        }
        this.c[0] = aVar;
        System.arraycopy(fArr, 0, aVar.a, 0, fArr.length);
    }

    public EX c(int i, int i2, int i3, EX ex) {
        int iMax = Math.max(0, Math.min(i, this.c.length - 1));
        int iMin = Math.min(i2, (this.c.length - 1) - iMax);
        return (ex != null && (ex instanceof b) && ((b) ex).a(this, iMax, iMin, i3)) ? ex : new b(this, iMax, iMin, i3);
    }

    public void d(int i) {
        if (this.c.length == i) {
            return;
        }
        this.c = new a[i];
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.c;
            if (i2 >= aVarArr.length) {
                int i3 = this.a;
                this.a = 0;
                this.b = 0;
                e(i3);
                this.d = (EX[][]) Array.newInstance((Class<?>) EX.class, this.c.length, this.a);
                return;
            }
            aVarArr[i2] = new a();
            i2++;
        }
    }

    public void e(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        this.b = i * 100;
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.c;
            if (i2 >= aVarArr.length) {
                this.d = (EX[][]) Array.newInstance((Class<?>) EX.class, aVarArr.length, i);
                return;
            } else {
                aVarArr[i2].a = new float[i];
                i2++;
            }
        }
    }
}
