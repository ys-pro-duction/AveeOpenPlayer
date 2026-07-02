package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class EU0 {
    public final C2584Vs0 a = new C2584Vs0(8);
    public int b;

    public final long a(InterfaceC9001vJ interfaceC9001vJ) {
        int i = 0;
        interfaceC9001vJ.k(this.a.a, 0, 1);
        int i2 = this.a.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        interfaceC9001vJ.k(this.a.a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.a.a[i] & 255) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }

    public boolean b(InterfaceC9001vJ interfaceC9001vJ) {
        long jB = interfaceC9001vJ.b();
        long j = 1024;
        if (jB != -1 && jB <= 1024) {
            j = jB;
        }
        int i = (int) j;
        interfaceC9001vJ.k(this.a.a, 0, 4);
        long jZ = this.a.z();
        this.b = 4;
        while (jZ != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            interfaceC9001vJ.k(this.a.a, 0, 1);
            jZ = ((jZ << 8) & (-256)) | ((long) (this.a.a[0] & 255));
        }
        long jA = a(interfaceC9001vJ);
        long j2 = this.b;
        if (jA != Long.MIN_VALUE && (jB == -1 || j2 + jA < jB)) {
            while (true) {
                int i3 = this.b;
                long j3 = j2 + jA;
                if (i3 < j3) {
                    if (a(interfaceC9001vJ) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(interfaceC9001vJ);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i4 = (int) jA2;
                        interfaceC9001vJ.h(i4);
                        this.b += i4;
                    }
                } else if (i3 == j3) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
