package com.daaw;

/* JADX INFO: renamed from: com.daaw.ft1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4686ft1 {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(C5900kE2 c5900kE2, int i, int i2) {
        c5900kE2.g(i);
        if (c5900kE2.j() < 5) {
            return -9223372036854775807L;
        }
        int iO = c5900kE2.o();
        if ((8388608 & iO) != 0 || ((iO >> 8) & 8191) != i2 || (iO & 32) == 0 || c5900kE2.u() < 7 || c5900kE2.j() < 7 || (c5900kE2.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c5900kE2.c(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((((long) bArr[4]) & 255) >> 7);
    }
}
