package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzafx;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzfo;
import com.google.android.gms.internal.ads.zzfr;
import com.google.android.gms.internal.ads.zzfu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Yq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2889Yq1 {
    public static final byte[] a;

    static {
        int i = AbstractC9004vJ2.a;
        a = "OpusHead".getBytes(UN2.c);
    }

    public static zzby a(C0994Gq1 c0994Gq1) {
        zzfo zzfoVar;
        C1098Hq1 c1098Hq1D = c0994Gq1.d(1751411826);
        C1098Hq1 c1098Hq1D2 = c0994Gq1.d(1801812339);
        C1098Hq1 c1098Hq1D3 = c0994Gq1.d(1768715124);
        if (c1098Hq1D == null || c1098Hq1D2 == null || c1098Hq1D3 == null || h(c1098Hq1D.b) != 1835299937) {
            return null;
        }
        C5900kE2 c5900kE2 = c1098Hq1D2.b;
        c5900kE2.g(12);
        int iO = c5900kE2.o();
        String[] strArr = new String[iO];
        for (int i = 0; i < iO; i++) {
            int iO2 = c5900kE2.o();
            c5900kE2.h(4);
            strArr[i] = c5900kE2.H(iO2 - 8, UN2.c);
        }
        C5900kE2 c5900kE22 = c1098Hq1D3.b;
        c5900kE22.g(8);
        ArrayList arrayList = new ArrayList();
        while (c5900kE22.j() > 8) {
            int iL = c5900kE22.l() + c5900kE22.o();
            int iO3 = c5900kE22.o() - 1;
            if (iO3 < 0 || iO3 >= iO) {
                AbstractC3305ay2.f("AtomParsers", "Skipped metadata with unknown key index: " + iO3);
            } else {
                String str = strArr[iO3];
                String[] strArr2 = AbstractC4676fr1.a;
                while (true) {
                    int iL2 = c5900kE22.l();
                    if (iL2 >= iL) {
                        zzfoVar = null;
                        break;
                    }
                    int iO4 = c5900kE22.o();
                    if (c5900kE22.o() == 1684108385) {
                        int iO5 = c5900kE22.o();
                        int iO6 = c5900kE22.o();
                        int i2 = iO4 - 16;
                        byte[] bArr = new byte[i2];
                        c5900kE22.c(bArr, 0, i2);
                        zzfoVar = new zzfo(str, bArr, iO6, iO5);
                        break;
                    }
                    c5900kE22.g(iL2 + iO4);
                }
                if (zzfoVar != null) {
                    arrayList.add(zzfoVar);
                }
            }
            c5900kE22.g(iL);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static zzby b(C1098Hq1 c1098Hq1) {
        C5900kE2 c5900kE2 = c1098Hq1.b;
        c5900kE2.g(8);
        zzby zzbyVar = new zzby(-9223372036854775807L, new zzbx[0]);
        while (c5900kE2.j() >= 8) {
            int iL = c5900kE2.l();
            int iO = c5900kE2.o() + iL;
            int iO2 = c5900kE2.o();
            zzby zzbyVar2 = null;
            if (iO2 == 1835365473) {
                c5900kE2.g(iL);
                c5900kE2.h(8);
                e(c5900kE2);
                while (true) {
                    if (c5900kE2.l() >= iO) {
                        break;
                    }
                    int iL2 = c5900kE2.l();
                    int iO3 = c5900kE2.o() + iL2;
                    if (c5900kE2.o() == 1768715124) {
                        c5900kE2.g(iL2);
                        c5900kE2.h(8);
                        ArrayList arrayList = new ArrayList();
                        while (c5900kE2.l() < iO3) {
                            zzbx zzbxVarA = AbstractC4676fr1.a(c5900kE2);
                            if (zzbxVarA != null) {
                                arrayList.add(zzbxVarA);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbyVar2 = new zzby(arrayList);
                        }
                    } else {
                        c5900kE2.g(iO3);
                    }
                }
                zzbyVar = zzbyVar.d(zzbyVar2);
            } else if (iO2 == 1936553057) {
                c5900kE2.g(iL);
                c5900kE2.h(12);
                while (true) {
                    if (c5900kE2.l() >= iO) {
                        break;
                    }
                    int iL3 = c5900kE2.l();
                    int iO4 = c5900kE2.o();
                    if (c5900kE2.o() != 1935766900) {
                        c5900kE2.g(iL3 + iO4);
                    } else if (iO4 >= 14) {
                        c5900kE2.h(5);
                        int iU = c5900kE2.u();
                        float f = 120.0f;
                        if (iU != 12) {
                            if (iU == 13) {
                            }
                        } else if (iU == 12) {
                            f = 240.0f;
                        }
                        c5900kE2.h(1);
                        zzbyVar2 = new zzby(-9223372036854775807L, new zzafx(f, c5900kE2.u()));
                    }
                }
                zzbyVar = zzbyVar.d(zzbyVar2);
            } else if (iO2 == -1451722374) {
                zzbyVar = zzbyVar.d(l(c5900kE2));
            }
            c5900kE2.g(iO);
        }
        return zzbyVar;
    }

    public static zzfu c(C5900kE2 c5900kE2) {
        long jB;
        long jB2;
        c5900kE2.g(8);
        if (AbstractC1202Iq1.a(c5900kE2.o()) == 0) {
            jB = c5900kE2.C();
            jB2 = c5900kE2.C();
        } else {
            jB = c5900kE2.B();
            jB2 = c5900kE2.B();
        }
        return new zzfu(jB, jB2, c5900kE2.C());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f1, code lost:
    
        r10 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:381:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0b0d A[PHI: r4
  0x0b0d: PHI (r4v52 int) = (r4v51 int), (r4v51 int), (r4v84 int), (r4v51 int) binds: [B:433:0x0a66, B:440:0x0a80, B:458:0x0b0c, B:439:0x0a7e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0c0a A[ADDED_TO_REGION, LOOP:13: B:503:0x0c0a->B:507:0x0c16, LOOP_START, PHI: r28
  0x0c0a: PHI (r28v6 int) = (r28v2 int), (r28v7 int) binds: [B:502:0x0c08, B:507:0x0c16] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0f5b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0bfa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List d(com.daaw.C0994Gq1 r78, com.daaw.C4093do1 r79, long r80, com.google.android.gms.internal.ads.zzad r82, boolean r83, boolean r84, com.daaw.WN2 r85) throws com.daaw.QT1 {
        /*
            Method dump skipped, instruction units count: 3941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2889Yq1.d(com.daaw.Gq1, com.daaw.do1, long, com.google.android.gms.internal.ads.zzad, boolean, boolean, com.daaw.WN2):java.util.List");
    }

    public static void e(C5900kE2 c5900kE2) {
        int iL = c5900kE2.l();
        c5900kE2.h(4);
        if (c5900kE2.o() != 1751411826) {
            iL += 4;
        }
        c5900kE2.g(iL);
    }

    public static int f(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static int g(C5900kE2 c5900kE2) {
        int iU = c5900kE2.u();
        int i = iU & 127;
        while ((iU & 128) == 128) {
            iU = c5900kE2.u();
            i = (i << 7) | (iU & 127);
        }
        return i;
    }

    public static int h(C5900kE2 c5900kE2) {
        c5900kE2.g(16);
        return c5900kE2.o();
    }

    public static Pair i(C0994Gq1 c0994Gq1) {
        C1098Hq1 c1098Hq1D = c0994Gq1.d(1701606260);
        if (c1098Hq1D == null) {
            return null;
        }
        C5900kE2 c5900kE2 = c1098Hq1D.b;
        c5900kE2.g(8);
        int iA = AbstractC1202Iq1.a(c5900kE2.o());
        int iX = c5900kE2.x();
        long[] jArr = new long[iX];
        long[] jArr2 = new long[iX];
        for (int i = 0; i < iX; i++) {
            jArr[i] = iA == 1 ? c5900kE2.D() : c5900kE2.C();
            jArr2[i] = iA == 1 ? c5900kE2.B() : c5900kE2.o();
            if (c5900kE2.I() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c5900kE2.h(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair j(C5900kE2 c5900kE2) {
        c5900kE2.g(8);
        int iA = AbstractC1202Iq1.a(c5900kE2.o());
        c5900kE2.h(iA == 0 ? 8 : 16);
        long jC = c5900kE2.C();
        c5900kE2.h(iA == 0 ? 4 : 8);
        int iY = c5900kE2.y();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((iY >> 10) & 31) + 96));
        sb.append((char) (((iY >> 5) & 31) + 96));
        sb.append((char) ((iY & 31) + 96));
        return Pair.create(Long.valueOf(jC), sb.toString());
    }

    public static Pair k(C5900kE2 c5900kE2, int i, int i2) throws QT1 {
        Integer num;
        C7197or1 c7197or1;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int iL = c5900kE2.l();
        while (iL - i < i2) {
            c5900kE2.g(iL);
            int iO = c5900kE2.o();
            AbstractC1502Ln1.b(iO > 0, "childAtomSize must be positive");
            if (c5900kE2.o() == 1936289382) {
                int i5 = iL + 8;
                int i6 = -1;
                Integer numValueOf = null;
                String strH = null;
                int i7 = 0;
                while (i5 - iL < iO) {
                    c5900kE2.g(i5);
                    int iO2 = c5900kE2.o();
                    int iO3 = c5900kE2.o();
                    if (iO3 == 1718775137) {
                        numValueOf = Integer.valueOf(c5900kE2.o());
                    } else if (iO3 == 1935894637) {
                        c5900kE2.h(4);
                        strH = c5900kE2.H(4, UN2.c);
                    } else if (iO3 == 1935894633) {
                        i6 = i5;
                        i7 = iO2;
                    }
                    i5 += iO2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strH) || "cbc1".equals(strH) || "cens".equals(strH) || "cbcs".equals(strH)) {
                    AbstractC1502Ln1.b(numValueOf != null, "frma atom is mandatory");
                    AbstractC1502Ln1.b(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = numValueOf;
                            c7197or1 = null;
                            break;
                        }
                        c5900kE2.g(i8);
                        int iO4 = c5900kE2.o();
                        if (c5900kE2.o() == 1952804451) {
                            int iA = AbstractC1202Iq1.a(c5900kE2.o());
                            c5900kE2.h(1);
                            if (iA == 0) {
                                c5900kE2.h(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iU = c5900kE2.u();
                                i3 = iU & 15;
                                i4 = (iU & 240) >> 4;
                            }
                            if (c5900kE2.u() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iU2 = c5900kE2.u();
                            byte[] bArr2 = new byte[16];
                            c5900kE2.c(bArr2, 0, 16);
                            if (z && iU2 == 0) {
                                int iU3 = c5900kE2.u();
                                byte[] bArr3 = new byte[iU3];
                                c5900kE2.c(bArr3, 0, iU3);
                                bArr = bArr3;
                            }
                            num = num2;
                            c7197or1 = new C7197or1(z, strH, iU2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += iO4;
                        }
                    }
                    AbstractC1502Ln1.b(c7197or1 != null, "tenc atom is mandatory");
                    int i9 = AbstractC9004vJ2.a;
                    pairCreate = Pair.create(num, c7197or1);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iL += iO;
        }
        return null;
    }

    public static zzby l(C5900kE2 c5900kE2) {
        short sI = c5900kE2.I();
        c5900kE2.h(2);
        String strH = c5900kE2.H(sI, UN2.c);
        int iMax = Math.max(strH.lastIndexOf(43), strH.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzfr(Float.parseFloat(strH.substring(0, iMax)), Float.parseFloat(strH.substring(iMax, strH.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static C2265Sq1 m(C5900kE2 c5900kE2, int i) {
        c5900kE2.g(i + 12);
        c5900kE2.h(1);
        g(c5900kE2);
        c5900kE2.h(2);
        int iU = c5900kE2.u();
        if ((iU & 128) != 0) {
            c5900kE2.h(2);
        }
        if ((iU & 64) != 0) {
            c5900kE2.h(c5900kE2.u());
        }
        if ((iU & 32) != 0) {
            c5900kE2.h(2);
        }
        c5900kE2.h(1);
        g(c5900kE2);
        String strD = AbstractC5959kT1.d(c5900kE2.u());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new C2265Sq1(strD, null, -1L, -1L);
        }
        c5900kE2.h(4);
        long jC = c5900kE2.C();
        long jC2 = c5900kE2.C();
        c5900kE2.h(1);
        int iG = g(c5900kE2);
        long j = jC2;
        byte[] bArr = new byte[iG];
        c5900kE2.c(bArr, 0, iG);
        if (j <= 0) {
            j = -1;
        }
        return new C2265Sq1(strD, bArr, j, jC > 0 ? jC : -1L);
    }

    public static ByteBuffer n() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(com.daaw.C5900kE2 r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, com.google.android.gms.internal.ads.zzad r35, com.daaw.C2473Uq1 r36, int r37) throws com.daaw.QT1 {
        /*
            Method dump skipped, instruction units count: 1197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2889Yq1.o(com.daaw.kE2, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzad, com.daaw.Uq1, int):void");
    }

    public static boolean p(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[Math.max(0, Math.min(4, i))] && jArr[Math.max(0, Math.min(length + (-4), i))] < j3 && j3 <= j;
    }
}
