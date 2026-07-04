package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PV {
    public final List a;
    public final int b;

    public PV(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public static PV a(C2584Vs0 c2584Vs0) throws C3000Zs0 {
        try {
            c2584Vs0.K(21);
            int iX = c2584Vs0.x() & 3;
            int iX2 = c2584Vs0.x();
            int iC = c2584Vs0.c();
            int i = 0;
            for (int i2 = 0; i2 < iX2; i2++) {
                c2584Vs0.K(1);
                int iD = c2584Vs0.D();
                for (int i3 = 0; i3 < iD; i3++) {
                    int iD2 = c2584Vs0.D();
                    i += iD2 + 4;
                    c2584Vs0.K(iD2);
                }
            }
            c2584Vs0.J(iC);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < iX2; i5++) {
                c2584Vs0.K(1);
                int iD3 = c2584Vs0.D();
                for (int i6 = 0; i6 < iD3; i6++) {
                    int iD4 = c2584Vs0.D();
                    byte[] bArr2 = AbstractC2248Sm0.a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(c2584Vs0.a, c2584Vs0.c(), bArr, length, iD4);
                    i4 = length + iD4;
                    c2584Vs0.K(iD4);
                }
            }
            return new PV(i == 0 ? null : Collections.singletonList(bArr), iX + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C3000Zs0("Error parsing HEVC config", e);
        }
    }
}
