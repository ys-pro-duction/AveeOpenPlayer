package com.daaw;

/* JADX INFO: renamed from: com.daaw.mr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6639mr1 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(InterfaceC1190In1 interfaceC1190In1) {
        return c(interfaceC1190In1, true, false);
    }

    public static boolean b(InterfaceC1190In1 interfaceC1190In1, boolean z) {
        return c(interfaceC1190In1, false, false);
    }

    public static boolean c(InterfaceC1190In1 interfaceC1190In1, boolean z, boolean z2) {
        boolean z3;
        long jB;
        int i;
        long jZzd = interfaceC1190In1.zzd();
        long j = 4096;
        long j2 = -1;
        if (jZzd != -1 && jZzd <= 4096) {
            j = jZzd;
        }
        C5900kE2 c5900kE2 = new C5900kE2(64);
        int i2 = (int) j;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            c5900kE2.d(8);
            if (!interfaceC1190In1.h(c5900kE2.i(), 0, 8, true)) {
                break;
            }
            long jC = c5900kE2.C();
            int iO = c5900kE2.o();
            if (jC == 1) {
                interfaceC1190In1.j(c5900kE2.i(), 8, 8);
                i = 16;
                c5900kE2.f(16);
                jB = c5900kE2.B();
            } else {
                if (jC == 0) {
                    long jZzd2 = interfaceC1190In1.zzd();
                    if (jZzd2 != j2) {
                        jC = (jZzd2 - interfaceC1190In1.zze()) + 8;
                    }
                }
                jB = jC;
                i = 8;
            }
            long j3 = i;
            if (jB < j3) {
                return false;
            }
            i3 += i;
            if (iO == 1836019574) {
                i2 += (int) jB;
                if (jZzd != -1 && i2 > jZzd) {
                    i2 = (int) jZzd;
                }
            } else {
                if (iO == 1836019558 || iO == 1836475768) {
                    z3 = true;
                    break;
                }
                long j4 = jZzd;
                if ((((long) i3) + jB) - j3 >= i2) {
                    break;
                }
                int i4 = (int) (jB - j3);
                i3 += i4;
                if (iO == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    c5900kE2.d(i4);
                    interfaceC1190In1.j(c5900kE2.i(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int iO2 = c5900kE2.o();
                            if ((iO2 >>> 8) != 3368816) {
                                if (iO2 == 1751476579) {
                                    iO2 = 1751476579;
                                }
                                int[] iArr = a;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != iO2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                        c5900kE2.h(4);
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i4 != 0) {
                    interfaceC1190In1.b(i4);
                }
                jZzd = j4;
            }
            j2 = -1;
        }
        z3 = false;
        return z4 && z == z3;
    }
}
