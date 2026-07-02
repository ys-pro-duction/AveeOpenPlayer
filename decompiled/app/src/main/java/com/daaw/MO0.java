package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MO0 {
    public C1769Oc1[] a;

    public MO0(List list) {
        this.a = new C1769Oc1[list.size()];
        int i = 0;
        while (true) {
            C1769Oc1[] c1769Oc1Arr = this.a;
            if (i >= c1769Oc1Arr.length) {
                return;
            }
            c1769Oc1Arr[i] = (C1769Oc1) list.get(i);
            i++;
        }
    }

    public float a() {
        float fL = 0.0f;
        int i = 0;
        while (true) {
            C1769Oc1[] c1769Oc1Arr = this.a;
            if (i >= c1769Oc1Arr.length) {
                return fL;
            }
            C1769Oc1 c1769Oc1 = c1769Oc1Arr[i];
            fL += C1458Lc1.l(c1769Oc1.a - c1769Oc1.c, c1769Oc1.b - c1769Oc1.d);
            i++;
        }
    }

    public boolean b(float f, float[] fArr, float[] fArr2) {
        if ((fArr != null && fArr.length < 2) || (fArr2 != null && fArr2.length < 2)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        float f2 = 0.0f;
        int i = 0;
        while (true) {
            C1769Oc1[] c1769Oc1Arr = this.a;
            if (i >= c1769Oc1Arr.length) {
                return true;
            }
            C1769Oc1 c1769Oc1 = c1769Oc1Arr[i];
            C1458Lc1 c1458Lc1 = new C1458Lc1(c1769Oc1.c - c1769Oc1.a, c1769Oc1.d - c1769Oc1.b);
            float fL = C1458Lc1.l(c1458Lc1.a, c1458Lc1.b) + f2;
            if (f < fL) {
                float f3 = f - f2;
                c1458Lc1.o();
                float f4 = c1458Lc1.a;
                fArr2[0] = f4;
                float f5 = c1458Lc1.b;
                fArr2[1] = f5;
                fArr[0] = c1769Oc1.a + (f4 * f3);
                fArr[1] = c1769Oc1.b + (f5 * f3);
                return true;
            }
            i++;
            f2 = fL;
        }
    }
}
