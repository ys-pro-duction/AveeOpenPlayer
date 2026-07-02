package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Fp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885Fp0 {
    public final C0989Gp0 a = new C0989Gp0();
    public final C2584Vs0 b = new C2584Vs0(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            C0989Gp0 c0989Gp0 = this.a;
            if (i5 >= c0989Gp0.g) {
                break;
            }
            int[] iArr = c0989Gp0.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public C0989Gp0 b() {
        return this.a;
    }

    public C2584Vs0 c() {
        return this.b;
    }

    public boolean d(InterfaceC9001vJ interfaceC9001vJ) {
        int i;
        AbstractC7115ob.f(interfaceC9001vJ != null);
        if (this.e) {
            this.e = false;
            this.b.F();
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.a(interfaceC9001vJ, true)) {
                    return false;
                }
                C0989Gp0 c0989Gp0 = this.a;
                int iA = c0989Gp0.h;
                if ((c0989Gp0.b & 1) == 1 && this.b.d() == 0) {
                    iA += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                interfaceC9001vJ.j(iA);
                this.c = i;
            }
            int iA2 = a(this.c);
            int i2 = this.c + this.d;
            if (iA2 > 0) {
                if (this.b.b() < this.b.d() + iA2) {
                    C2584Vs0 c2584Vs0 = this.b;
                    c2584Vs0.a = Arrays.copyOf(c2584Vs0.a, c2584Vs0.d() + iA2);
                }
                C2584Vs0 c2584Vs02 = this.b;
                interfaceC9001vJ.g(c2584Vs02.a, c2584Vs02.d(), iA2);
                C2584Vs0 c2584Vs03 = this.b;
                c2584Vs03.I(c2584Vs03.d() + iA2);
                this.e = this.a.j[i2 + (-1)] != 255;
            }
            if (i2 == this.a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.F();
        this.c = -1;
        this.e = false;
    }

    public void f() {
        C2584Vs0 c2584Vs0 = this.b;
        byte[] bArr = c2584Vs0.a;
        if (bArr.length == 65025) {
            return;
        }
        c2584Vs0.a = Arrays.copyOf(bArr, Math.max(65025, c2584Vs0.d()));
    }
}
