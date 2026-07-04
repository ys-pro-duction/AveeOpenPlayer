package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class HT {
    public final float[] a;
    public final int[] b;

    public HT(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(HT ht, HT ht2, float f) {
        if (ht.b.length == ht2.b.length) {
            for (int i = 0; i < ht.b.length; i++) {
                this.a[i] = AbstractC9678xk0.i(ht.a[i], ht2.a[i], f);
                this.b[i] = KR.c(f, ht.b[i], ht2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + ht.b.length + " vs " + ht2.b.length + ")");
    }
}
