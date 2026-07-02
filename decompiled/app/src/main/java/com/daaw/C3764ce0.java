package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ce0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3764ce0 extends AJ {
    public List a;
    public List b;
    public List c;
    public List d;

    @Override // com.daaw.AJ
    public void a(int i) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            double d = 0.0d;
            if (i <= i3) {
                break;
            }
            int i4 = i3 * 2;
            double d2 = 3.141592653589793d / ((double) i3);
            double dCos = Math.cos(d2);
            double dSin = Math.sin(d2);
            int i5 = 0;
            double d3 = 1.0d;
            while (i5 < i4) {
                this.a.add(Double.valueOf(d3));
                this.b.add(Double.valueOf(d));
                double d4 = (d3 * dCos) - (d * dSin);
                d = (d * dCos) + (d3 * dSin);
                i5 += 2;
                d3 = d4;
            }
            i3 = i4;
        }
        while (i > i2) {
            int i6 = i2 * 2;
            double d5 = (3.141592653589793d / ((double) i2)) * (-1.0d);
            double dCos2 = Math.cos(d5);
            double dSin2 = Math.sin(d5);
            double d6 = 0.0d;
            int i7 = 0;
            double d7 = 1.0d;
            while (i7 < i6) {
                this.c.add(Double.valueOf(d7));
                this.d.add(Double.valueOf(d6));
                double d8 = (d7 * dCos2) - (d6 * dSin2);
                d6 = (d6 * dCos2) + (d7 * dSin2);
                i7 += 2;
                d7 = d8;
            }
            i2 = i6;
        }
    }

    @Override // com.daaw.AJ
    public void b(double[] dArr, boolean z) {
        double d;
        if (z) {
            c(dArr, z);
            d = 1.0d;
        } else {
            d = -1.0d;
        }
        int length = dArr.length;
        double d2 = (3.141592653589793d / ((double) length)) * 2.0d * d;
        double dCos = Math.cos(d2);
        double dSin = Math.sin(d2);
        double d3 = dSin;
        double d4 = dCos;
        int i = 1;
        while (i <= length / 4) {
            int i2 = ((length / 2) - i) * 2;
            double d5 = dArr[i2];
            int i3 = i2 + 1;
            double d6 = dArr[i3];
            int i4 = i * 2;
            double d7 = dArr[i4];
            int i5 = i4 + 1;
            double d8 = dArr[i5];
            double d9 = d7 + d5;
            double d10 = d8 - d6;
            double d11 = d7 - d5;
            double d12 = d8 + d6;
            double d13 = d12 * d3;
            double d14 = d11 * d4;
            double d15 = ((d11 * d3) + (d12 * d4)) * d;
            dArr[i4] = (d9 + d15) * 0.5d;
            dArr[i5] = (d10 - ((d14 - d13) * d)) * 0.5d;
            dArr[i2] = (d9 - d15) * 0.5d;
            dArr[i3] = ((((d14 * (-1.0d)) + d13) * d) - d10) * 0.5d;
            double d16 = (d4 * dCos) - (d3 * dSin);
            d3 = (d3 * dCos) + (d4 * dSin);
            i++;
            d4 = d16;
        }
        if (z) {
            double d17 = dArr[0];
            double d18 = dArr[1];
            dArr[0] = d17 + d18;
            dArr[1] = d17 - d18;
            return;
        }
        double d19 = dArr[0];
        double d20 = dArr[1];
        dArr[0] = (d19 + d20) * 0.5d;
        dArr[1] = (d19 - d20) * 0.5d;
        c(dArr, false);
    }

    public void c(double[] dArr, boolean z) {
        C3764ce0 c3764ce0 = this;
        int length = dArr.length / 2;
        int i = length / 2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 2;
            double d = dArr[i4];
            int i5 = i3 + length;
            dArr[i4] = dArr[i5];
            dArr[i5] = d;
            int i6 = i2 + 3;
            double d2 = dArr[i6];
            int i7 = length + 1 + i3;
            dArr[i6] = dArr[i7];
            dArr[i7] = d2;
            if (i2 > i3) {
                double d3 = dArr[i2];
                dArr[i2] = dArr[i3];
                dArr[i3] = d3;
                int i8 = i2 + 1;
                double d4 = dArr[i8];
                int i9 = i3 + 1;
                dArr[i8] = dArr[i9];
                dArr[i9] = d4;
                int i10 = length + 2;
                int i11 = i2 + i10;
                double d5 = dArr[i11];
                int i12 = i10 + i3;
                dArr[i11] = dArr[i12];
                dArr[i12] = d5;
                int i13 = length + 3;
                int i14 = i2 + i13;
                double d6 = dArr[i14];
                int i15 = i13 + i3;
                dArr[i14] = dArr[i15];
                dArr[i15] = d6;
            }
            i3 += 4;
            if (i3 >= length) {
                break;
            }
            int i16 = i;
            while (i2 >= i16) {
                i2 -= i16;
                i16 /= 2;
            }
            i2 += i16;
            c3764ce0 = this;
        }
        List list = z ? c3764ce0.a : c3764ce0.c;
        List list2 = z ? c3764ce0.b : c3764ce0.d;
        int i17 = 1;
        int i18 = 0;
        while (length > i17) {
            int i19 = i17 * 2;
            int i20 = 0;
            while (i20 < i19) {
                double dDoubleValue = ((Double) list.get(i18)).doubleValue();
                int i21 = i18 + 1;
                double dDoubleValue2 = ((Double) list2.get(i18)).doubleValue();
                for (int i22 = i20; i22 < length * 2; i22 += i17 * 4) {
                    int i23 = i22 + i19;
                    int i24 = i23 + 1;
                    if (i24 < dArr.length) {
                        double d7 = dArr[i23];
                        double d8 = dArr[i24];
                        double d9 = (dDoubleValue * d7) - (dDoubleValue2 * d8);
                        double d10 = (d7 * dDoubleValue2) + (d8 * dDoubleValue);
                        dArr[i23] = dArr[i22] - d9;
                        int i25 = i22 + 1;
                        dArr[i24] = dArr[i25] - d10;
                        dArr[i22] = dArr[i22] + d9;
                        dArr[i25] = dArr[i25] + d10;
                    }
                }
                i20 += 2;
                i18 = i21;
            }
            i17 = i19;
        }
        if (z) {
            return;
        }
        double d11 = 1 / length;
        for (int i26 = 0; i26 < length * 2; i26++) {
            dArr[i26] = dArr[i26] * d11;
        }
    }
}
