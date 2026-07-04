package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.vq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9151vq1 {
    public final C5900kE2 a = new C5900kE2(8);
    public int b;

    public final boolean a(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        long jZzd = interfaceC1190In1.zzd();
        long j = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j = jZzd;
        }
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        c9694xn1.h(this.a.i(), 0, 4, false);
        long jC = this.a.C();
        this.b = 4;
        while (jC != 440786851) {
            int i = (int) j;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            c9694xn1.h(this.a.i(), 0, 1, false);
            jC = ((jC << 8) & (-256)) | ((long) (this.a.i()[0] & 255));
        }
        long jB = b(interfaceC1190In1);
        long j2 = this.b;
        if (jB != Long.MIN_VALUE) {
            long j3 = j2 + jB;
            if (jZzd == -1 || j3 < jZzd) {
                while (true) {
                    long j4 = this.b;
                    if (j4 < j3) {
                        if (b(interfaceC1190In1) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jB2 = b(interfaceC1190In1);
                        if (jB2 < 0) {
                            return false;
                        }
                        if (jB2 != 0) {
                            int i3 = (int) jB2;
                            c9694xn1.l(i3, false);
                            this.b += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final long b(InterfaceC1190In1 interfaceC1190In1) {
        int i;
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        int i2 = 0;
        c9694xn1.h(this.a.i(), 0, 1, false);
        int i3 = this.a.i()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        c9694xn1.h(this.a.i(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.a.i()[i2] & 255) + (i6 << 8);
        }
        this.b += i;
        return i6;
    }
}
