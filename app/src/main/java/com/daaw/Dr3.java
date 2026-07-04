package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Dr3 extends Fr3 {
    public final Ks3 f;
    public final OP2 g;
    public final InterfaceC1810Om2 h;

    public Dr3(A62 a62, int[] iArr, int i, Ks3 ks3, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, InterfaceC1810Om2 interfaceC1810Om2) {
        super(a62, iArr, 0);
        this.f = ks3;
        this.g = OP2.H(list);
        this.h = interfaceC1810Om2;
    }

    public static /* bridge */ /* synthetic */ OP2 a(C9163vs3[] c9163vs3Arr) {
        int i;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= 2) {
                break;
            }
            C9163vs3 c9163vs3 = c9163vs3Arr[i2];
            if (c9163vs3 == null || c9163vs3.b.length <= 1) {
                arrayList.add(null);
            } else {
                LP2 lp2 = new LP2();
                lp2.g(new Br3(0L, 0L));
                arrayList.add(lp2);
            }
            i2++;
        }
        long[][] jArr2 = new long[2][];
        for (int i3 = 0; i3 < 2; i3++) {
            C9163vs3 c9163vs32 = c9163vs3Arr[i3];
            if (c9163vs32 == null) {
                jArr2[i3] = new long[0];
            } else {
                jArr2[i3] = new long[c9163vs32.b.length];
                int i4 = 0;
                while (true) {
                    int[] iArr = c9163vs32.b;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    long j = c9163vs32.a.b(iArr[i4]).h;
                    long[] jArr3 = jArr2[i3];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i4] = j;
                    i4++;
                }
                Arrays.sort(jArr2[i3]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i5 = 0; i5 < 2; i5++) {
            long[] jArr5 = jArr2[i5];
            jArr4[i5] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        b(arrayList, jArr4);
        InterfaceC3706cQ2 interfaceC3706cQ2C = AbstractC8746uQ2.b(DQ2.c()).b(2).c();
        int i6 = 0;
        while (i6 < 2) {
            int length = jArr2[i6].length;
            if (length <= i) {
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i7 = 0;
                while (true) {
                    long[] jArr6 = jArr2[i6];
                    double dLog = 0.0d;
                    if (i7 >= jArr6.length) {
                        break;
                    }
                    long[][] jArr7 = jArr2;
                    long j2 = jArr6[i7];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i7] = dLog;
                    i7++;
                    jArr2 = jArr7;
                }
                jArr = jArr2;
                int i8 = length - 1;
                double d = dArr[i8] - dArr[0];
                int i9 = 0;
                while (i9 < i8) {
                    double d2 = dArr[i9];
                    i9++;
                    interfaceC3706cQ2C.a(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i9]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i6));
                }
            }
            i6++;
            jArr2 = jArr;
            i = 1;
        }
        long[][] jArr8 = jArr2;
        OP2 op2H = OP2.H(interfaceC3706cQ2C.zzr());
        for (int i10 = 0; i10 < op2H.size(); i10++) {
            int iIntValue = ((Integer) op2H.get(i10)).intValue();
            int i11 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i11;
            jArr4[iIntValue] = jArr8[iIntValue][i11];
            b(arrayList, jArr4);
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (arrayList.get(i12) != null) {
                long j3 = jArr4[i12];
                jArr4[i12] = j3 + j3;
            }
        }
        b(arrayList, jArr4);
        LP2 lp22 = new LP2();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            LP2 lp23 = (LP2) arrayList.get(i13);
            lp22.g(lp23 == null ? OP2.J() : lp23.j());
        }
        return lp22.j();
    }

    public static void b(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            LP2 lp2 = (LP2) list.get(i2);
            if (lp2 != null) {
                lp2.g(new Br3(j, jArr[i2]));
            }
        }
    }
}
