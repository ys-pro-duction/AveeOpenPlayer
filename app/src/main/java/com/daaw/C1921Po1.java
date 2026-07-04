package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Po1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1921Po1 {
    public final InterfaceC8576to1 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public C1921Po1(int i, int i2, long j, int i3, InterfaceC8576to1 interfaceC8576to1) {
        i2 = i2 != 1 ? 2 : i2;
        this.d = j;
        this.e = i3;
        this.a = interfaceC8576to1;
        this.b = i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.c = i2 == 2 ? i(i, 1650720768) : -1;
        this.k = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.l = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    public static int i(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final C6345lo1 a(long j) {
        int iJ = (int) (j / j(1));
        int iN = AbstractC9004vJ2.n(this.l, iJ, true, true);
        if (this.l[iN] == iJ) {
            C7182oo1 c7182oo1K = k(iN);
            return new C6345lo1(c7182oo1K, c7182oo1K);
        }
        C7182oo1 c7182oo1K2 = k(iN);
        int i = iN + 1;
        return i < this.k.length ? new C6345lo1(c7182oo1K2, k(i)) : new C6345lo1(c7182oo1K2, c7182oo1K2);
    }

    public final void b(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public final void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public final void d() {
        this.i++;
    }

    public final void e(int i) {
        this.f = i;
        this.g = i;
    }

    public final void f(long j) {
        if (this.j == 0) {
            this.h = 0;
        } else {
            this.h = this.l[AbstractC9004vJ2.o(this.k, j, true, true)];
        }
    }

    public final boolean g(int i) {
        return this.b == i || this.c == i;
    }

    public final boolean h(InterfaceC1190In1 interfaceC1190In1) {
        int i = this.g;
        int iF = i - this.a.f(interfaceC1190In1, i, false);
        this.g = iF;
        boolean z = iF == 0;
        if (z) {
            if (this.f > 0) {
                this.a.c(j(this.h), Arrays.binarySearch(this.l, this.h) >= 0 ? 1 : 0, this.f, 0, null);
            }
            this.h++;
        }
        return z;
    }

    public final long j(int i) {
        return (this.d * ((long) i)) / ((long) this.e);
    }

    public final C7182oo1 k(int i) {
        return new C7182oo1(((long) this.l[i]) * j(1), this.k[i]);
    }
}
