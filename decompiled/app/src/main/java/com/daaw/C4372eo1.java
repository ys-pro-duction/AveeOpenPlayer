package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.eo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4372eo1 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final String g;

    public C4372eo1(List list, int i, int i2, int i3, int i4, int i5, int i6, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = f;
        this.g = str;
    }

    public static C4372eo1 a(C5900kE2 c5900kE2) throws QT1 {
        int i;
        try {
            c5900kE2.h(21);
            int iU = c5900kE2.u() & 3;
            int iU2 = c5900kE2.u();
            int iL = c5900kE2.l();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < iU2; i4++) {
                c5900kE2.h(1);
                int iY = c5900kE2.y();
                for (int i5 = 0; i5 < iY; i5++) {
                    int iY2 = c5900kE2.y();
                    i3 += iY2 + 4;
                    c5900kE2.h(iY2);
                }
            }
            c5900kE2.g(iL);
            byte[] bArr = new byte[i3];
            String strB = null;
            int i6 = 0;
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            float f = 1.0f;
            while (i6 < iU2) {
                int iU3 = c5900kE2.u() & 63;
                int iY3 = c5900kE2.y();
                int i13 = 0;
                while (i13 < iY3) {
                    int iY4 = c5900kE2.y();
                    int i14 = iU;
                    System.arraycopy(AbstractC4556fR2.a, i2, bArr, i7, 4);
                    int i15 = i7 + 4;
                    System.arraycopy(c5900kE2.i(), c5900kE2.l(), bArr, i15, iY4);
                    int i16 = i15 + iY4;
                    if (iU3 == 33 && i13 == 0) {
                        C9028vP2 c9028vP2C = AbstractC4556fR2.c(bArr, i7 + 6, i16);
                        i8 = c9028vP2C.g;
                        i9 = c9028vP2C.h;
                        i10 = c9028vP2C.j;
                        int i17 = c9028vP2C.k;
                        int i18 = c9028vP2C.l;
                        float f2 = c9028vP2C.i;
                        i = i16;
                        strB = AbstractC7457pn2.b(c9028vP2C.a, c9028vP2C.b, c9028vP2C.c, c9028vP2C.d, c9028vP2C.e, c9028vP2C.f);
                        i11 = i17;
                        i12 = i18;
                        f = f2;
                        i13 = 0;
                    } else {
                        i = i16;
                    }
                    c5900kE2.h(iY4);
                    i13++;
                    iU = i14;
                    i7 = i;
                    i2 = 0;
                }
                i6++;
                i2 = 0;
            }
            return new C4372eo1(i3 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i8, i9, i10, i11, i12, f, strB);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw QT1.a("Error parsing HEVC config", e);
        }
    }
}
