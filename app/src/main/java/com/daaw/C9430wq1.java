package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.wq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9430wq1 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static int b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i2 + 1;
            if ((d[i2] & ((long) i)) != 0) {
                return i3;
            }
            i2 = i3;
        }
        return -1;
    }

    public static long c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final int a() {
        return this.c;
    }

    public final long d(InterfaceC1190In1 interfaceC1190In1, boolean z, boolean z2, int i) throws EOFException, InterruptedIOException {
        if (this.b == 0) {
            if (!interfaceC1190In1.f(this.a, 0, 1, z)) {
                return -1L;
            }
            int iB = b(this.a[0] & 255);
            this.c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i2 = this.c;
        if (i2 > i) {
            this.b = 0;
            return -2L;
        }
        if (i2 != 1) {
            ((C9694xn1) interfaceC1190In1).f(this.a, 1, i2 - 1, false);
        }
        this.b = 0;
        return c(this.a, this.c, z2);
    }

    public final void e() {
        this.b = 0;
        this.c = 0;
    }
}
