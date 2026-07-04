package com.daaw;

/* JADX INFO: renamed from: com.daaw.xh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9663xh0 {
    public final C1873Pc1[] a;

    public C9663xh0(int i, int i2) {
        C1873Pc1[] c1873Pc1Arr = new C1873Pc1[i];
        for (int i3 = 0; i3 < i; i3++) {
            c1873Pc1Arr[i3] = new C1873Pc1(i2);
        }
        this.a = c1873Pc1Arr;
    }

    public final float a(int i, int i2) {
        return this.a[i].a(i2);
    }

    public final C1873Pc1 b(int i) {
        return this.a[i];
    }

    public final void c(int i, int i2, float f) {
        this.a[i].c(i2, f);
    }
}
