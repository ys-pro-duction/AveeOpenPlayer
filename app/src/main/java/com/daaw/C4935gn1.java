package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.gn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4935gn1 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final String i;

    public C4935gn1(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = f;
        this.i = str;
    }

    public static C4935gn1 a(C5900kE2 c5900kE2) throws QT1 {
        String strA;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        try {
            c5900kE2.h(4);
            int iU = c5900kE2.u() & 3;
            int i6 = iU + 1;
            if (i6 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = c5900kE2.u() & 31;
            for (int i7 = 0; i7 < iU2; i7++) {
                arrayList.add(b(c5900kE2));
            }
            int iU3 = c5900kE2.u();
            for (int i8 = 0; i8 < iU3; i8++) {
                arrayList.add(b(c5900kE2));
            }
            if (iU2 > 0) {
                int i9 = iU + 2;
                BQ2 bq2E = AbstractC4556fR2.e((byte[]) arrayList.get(0), i9, ((byte[]) arrayList.get(0)).length);
                int i10 = bq2E.e;
                int i11 = bq2E.f;
                int i12 = bq2E.h;
                int i13 = bq2E.i;
                int i14 = bq2E.j;
                float f2 = bq2E.g;
                strA = AbstractC7457pn2.a(bq2E.a, bq2E.b, bq2E.c);
                i4 = i13;
                i5 = i14;
                f = f2;
                i = i10;
                i2 = i11;
                i3 = i12;
            } else {
                strA = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                f = 1.0f;
            }
            return new C4935gn1(arrayList, i6, i, i2, i3, i4, i5, f, strA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw QT1.a("Error parsing AVC config", e);
        }
    }

    public static byte[] b(C5900kE2 c5900kE2) {
        int iY = c5900kE2.y();
        int iL = c5900kE2.l();
        c5900kE2.h(iY);
        return AbstractC7457pn2.c(c5900kE2.i(), iL, iY);
    }
}
