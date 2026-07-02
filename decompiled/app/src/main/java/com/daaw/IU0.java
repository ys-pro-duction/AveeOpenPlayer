package com.daaw;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class IU0 {
    public static int o = 1;
    public boolean a;
    public String b;
    public float f;
    public a j;
    public int c = -1;
    public int d = -1;
    public int e = 0;
    public boolean g = false;
    public float[] h = new float[9];
    public float[] i = new float[9];
    public C2719Xa[] k = new C2719Xa[16];
    public int l = 0;
    public int m = 0;
    public HashSet n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public IU0(a aVar, String str) {
        this.j = aVar;
    }

    public static void b() {
        o++;
    }

    public final void a(C2719Xa c2719Xa) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                C2719Xa[] c2719XaArr = this.k;
                if (i2 >= c2719XaArr.length) {
                    this.k = (C2719Xa[]) Arrays.copyOf(c2719XaArr, c2719XaArr.length * 2);
                }
                C2719Xa[] c2719XaArr2 = this.k;
                int i3 = this.l;
                c2719XaArr2[i3] = c2719Xa;
                this.l = i3 + 1;
                return;
            }
            if (this.k[i] == c2719Xa) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(C2719Xa c2719Xa) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == c2719Xa) {
                while (i2 < i - 1) {
                    C2719Xa[] c2719XaArr = this.k;
                    int i3 = i2 + 1;
                    c2719XaArr[i2] = c2719XaArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public void d() {
        this.b = null;
        this.j = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void e(C4311ec0 c4311ec0, float f) {
        this.f = f;
        this.g = true;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].B(c4311ec0, this, false);
        }
        this.l = 0;
    }

    public void f(a aVar, String str) {
        this.j = aVar;
    }

    public final void g(C2719Xa c2719Xa) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].C(c2719Xa, false);
        }
        this.l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return "" + this.b;
        }
        return "" + this.c;
    }
}
