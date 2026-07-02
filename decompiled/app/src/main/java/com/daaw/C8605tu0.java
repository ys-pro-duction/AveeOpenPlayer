package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.tu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8605tu0 {
    public int a;
    public a[] b = new a[0];
    public int c;

    /* JADX INFO: renamed from: com.daaw.tu0$a */
    public class a {
        public double[] b;
        public int c;
        public int d;
        public double e;
        public double f;
        public double g;
        public double i;
        public double j;
        public double[] k;
        public double[] l;
        public final double a = 6.283185307179586d;
        public double h = 0.0d;

        public a(double d, int i) {
            this.d = i;
            this.e = i;
            int iRound = (int) Math.round(d * ((double) i));
            this.c = iRound;
            this.b = new double[iRound];
            this.k = new double[iRound];
            this.l = new double[iRound];
            int i2 = 0;
            while (true) {
                int i3 = this.c;
                if (i2 >= i3) {
                    b();
                    return;
                }
                double d2 = (((double) i2) / (((double) i3) / this.e)) * 6.283185307179586d;
                double dCos = Math.cos(d2);
                double dSin = Math.sin(d2);
                double dSqrt = Math.sqrt((dCos * dCos) + (dSin * dSin));
                this.k[i2] = dCos / dSqrt;
                this.l[i2] = dSin / dSqrt;
                i2++;
            }
        }

        public void a(int i, double d) {
            this.f += this.k[i] * d;
            this.g += this.l[i] * d;
        }

        public void b() {
            if (this.c == 0) {
                this.j = 1.0d;
                this.i = 1.0d;
                return;
            }
            d();
            int i = 0;
            while (true) {
                int i2 = this.c;
                if (i >= i2) {
                    this.i = 1.0d;
                    c(1.0d, i2);
                    double d = this.h;
                    this.j = d;
                    this.i = d;
                    return;
                }
                a(i, this.k[i] * 0.009999999776482582d);
                i++;
            }
        }

        public double c(double d, int i) {
            double d2 = i;
            double d3 = this.f / d2;
            this.f = d3;
            double d4 = this.g / d2;
            this.g = d4;
            double dSqrt = Math.sqrt((d3 * d3) + (d4 * d4)) * 800.0d;
            this.h = dSqrt;
            return dSqrt;
        }

        public void d() {
            this.f = 0.0d;
            this.g = 0.0d;
            Arrays.fill(this.b, 0.0d);
        }
    }

    public void a(float[] fArr, int i) {
        if (this.b.length != fArr.length) {
            this.b = new a[fArr.length];
        }
        this.c = this.b.length;
        int iRound = Math.round(this.a / 400.0f);
        this.a = i;
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i2 >= aVarArr.length) {
                return;
            }
            double d = fArr[i2] < 1.0f ? 0.0d : this.a / r2;
            aVarArr[i2] = new a(d, Math.max((int) Math.round(((double) iRound) / d), 1));
            i2++;
        }
    }

    public void b(double[] dArr, int i, int i2, double[] dArr2, double d, double d2) {
        int length = dArr.length;
        while (i < i2) {
            this.b[i].d();
            a aVar = this.b[i];
            if (aVar.c > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    double d3 = dArr[i3];
                    a aVar2 = this.b[i];
                    aVar2.a(i3 % aVar2.c, d3);
                }
                dArr2[i] = this.b[i].c(1.0d, length);
            } else {
                dArr2[i] = aVar.c(1.0d, 1);
            }
            i++;
        }
    }
}
