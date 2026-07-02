package com.daaw;

/* JADX INFO: renamed from: com.daaw.on1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7177on1 {
    public static void a(long j, C5900kE2 c5900kE2, InterfaceC8576to1[] interfaceC8576to1Arr) {
        int iO;
        while (true) {
            if (c5900kE2.j() <= 1) {
                return;
            }
            int iC = c(c5900kE2);
            int iC2 = c(c5900kE2);
            int iL = c5900kE2.l() + iC2;
            if (iC2 == -1 || iC2 > c5900kE2.j()) {
                AbstractC3305ay2.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iL = c5900kE2.m();
            } else if (iC == 4 && iC2 >= 8) {
                int iU = c5900kE2.u();
                int iY = c5900kE2.y();
                if (iY == 49) {
                    iO = c5900kE2.o();
                    iY = 49;
                } else {
                    iO = 0;
                }
                int iU2 = c5900kE2.u();
                if (iY == 47) {
                    c5900kE2.h(1);
                    iY = 47;
                }
                boolean z = iU == 181 && (iY == 49 || iY == 47) && iU2 == 3;
                if (iY == 49) {
                    z &= iO == 1195456820;
                }
                if (z) {
                    b(j, c5900kE2, interfaceC8576to1Arr);
                }
            }
            c5900kE2.g(iL);
        }
    }

    public static void b(long j, C5900kE2 c5900kE2, InterfaceC8576to1[] interfaceC8576to1Arr) {
        long j2;
        int iU = c5900kE2.u();
        if ((iU & 64) != 0) {
            int i = iU & 31;
            c5900kE2.h(1);
            int iL = c5900kE2.l();
            int length = interfaceC8576to1Arr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i * 3;
                InterfaceC8576to1 interfaceC8576to1 = interfaceC8576to1Arr[i2];
                c5900kE2.g(iL);
                interfaceC8576to1.b(c5900kE2, i3);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    interfaceC8576to1.c(j2, 1, i3, 0, null);
                } else {
                    j2 = j;
                }
                i2++;
                j = j2;
            }
        }
    }

    public static int c(C5900kE2 c5900kE2) {
        int i = 0;
        while (c5900kE2.j() != 0) {
            int iU = c5900kE2.u();
            i += iU;
            if (iU != 255) {
                return i;
            }
        }
        return -1;
    }
}
