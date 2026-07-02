package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ud1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8800ud1 {
    public static final void b(C7963rd1 c7963rd1, C7223ox0 c7223ox0) {
        G10.g(c7963rd1, "<this>");
        G10.g(c7223ox0, "event");
        List listD = c7223ox0.d();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
            TV tv = (TV) listD.get(i);
            c7963rd1.a(tv.b(), tv.a());
        }
        c7963rd1.a(c7223ox0.k(), c7223ox0.f());
    }

    public static final float c(float f) {
        return Math.signum(f) * ((float) Math.sqrt(2 * Math.abs(f)));
    }

    public static final C0388Ax0 d(List list, List list2, int i) {
        G10.g(list, "x");
        G10.g(list2, "y");
        if (i < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i >= list.size() ? list.size() - 1 : i;
        int i2 = i + 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        int size2 = list.size();
        int i4 = size + 1;
        C9663xh0 c9663xh0 = new C9663xh0(i4, size2);
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                break;
            }
            c9663xh0.c(0, i5, 1.0f);
            for (int i6 = 1; i6 < i4; i6++) {
                c9663xh0.c(i6, i5, c9663xh0.a(i6 - 1, i5) * ((Number) list.get(i5)).floatValue());
            }
            i5++;
        }
        C9663xh0 c9663xh02 = new C9663xh0(i4, size2);
        C9663xh0 c9663xh03 = new C9663xh0(i4, i4);
        int i7 = 0;
        while (i7 < i4) {
            for (int i8 = 0; i8 < size2; i8++) {
                c9663xh02.c(i7, i8, c9663xh0.a(i7, i8));
            }
            for (int i9 = 0; i9 < i7; i9++) {
                float fD = c9663xh02.b(i7).d(c9663xh02.b(i9));
                for (int i10 = 0; i10 < size2; i10++) {
                    c9663xh02.c(i7, i10, c9663xh02.a(i7, i10) - (c9663xh02.a(i9, i10) * fD));
                }
            }
            float fB = c9663xh02.b(i7).b();
            if (fB < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f = 1.0f / fB;
            for (int i11 = 0; i11 < size2; i11++) {
                c9663xh02.c(i7, i11, c9663xh02.a(i7, i11) * f);
            }
            int i12 = 0;
            while (i12 < i4) {
                c9663xh03.c(i7, i12, i12 < i7 ? 0.0f : c9663xh02.b(i7).d(c9663xh0.b(i12)));
                i12++;
            }
            i7++;
        }
        C1873Pc1 c1873Pc1 = new C1873Pc1(size2);
        for (int i13 = 0; i13 < size2; i13++) {
            c1873Pc1.c(i13, ((Number) list2.get(i13)).floatValue() * 1.0f);
        }
        for (int i14 = size; -1 < i14; i14--) {
            arrayList.set(i14, Float.valueOf(c9663xh02.b(i14).d(c1873Pc1)));
            int i15 = i14 + 1;
            if (i15 <= size) {
                int i16 = size;
                while (true) {
                    arrayList.set(i14, Float.valueOf(((Number) arrayList.get(i14)).floatValue() - (c9663xh03.a(i14, i16) * ((Number) arrayList.get(i16)).floatValue())));
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            arrayList.set(i14, Float.valueOf(((Number) arrayList.get(i14)).floatValue() / c9663xh03.a(i14, i14)));
        }
        float fFloatValue = 0.0f;
        for (int i17 = 0; i17 < size2; i17++) {
            fFloatValue += ((Number) list2.get(i17)).floatValue();
        }
        float f2 = fFloatValue / size2;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i18 = 0; i18 < size2; i18++) {
            float fFloatValue2 = ((Number) list2.get(i18)).floatValue() - ((Number) arrayList.get(0)).floatValue();
            float fFloatValue3 = 1.0f;
            for (int i19 = 1; i19 < i4; i19++) {
                fFloatValue3 *= ((Number) list.get(i18)).floatValue();
                fFloatValue2 -= ((Number) arrayList.get(i19)).floatValue() * fFloatValue3;
            }
            f3 += fFloatValue2 * 1.0f * fFloatValue2;
            float fFloatValue4 = ((Number) list2.get(i18)).floatValue() - f2;
            f4 += fFloatValue4 * 1.0f * fFloatValue4;
        }
        return new C0388Ax0(arrayList, f4 > 1.0E-6f ? 1.0f - (f3 / f4) : 1.0f);
    }
}
