package com.daaw;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class K00 {
    public int[] a = new int[10];
    public int b;

    public final void a() {
        this.b = 0;
    }

    public final int b() {
        return this.b;
    }

    public final int c(int i) {
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final int e() {
        return this.a[this.b - 1];
    }

    public final int f(int i) {
        return this.a[i];
    }

    public final int g(int i) {
        return this.b > 0 ? e() : i;
    }

    public final int h() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void i(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            G10.f(iArrCopyOf, "copyOf(this, newSize)");
            this.a = iArrCopyOf;
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr2[i3] = i;
    }
}
