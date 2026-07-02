package com.daaw;

import com.daaw.CV0;

/* JADX INFO: loaded from: classes.dex */
public class DV0 {
    public AbstractC5460ih a;

    public DV0(AbstractC5460ih abstractC5460ih) {
        this.a = abstractC5460ih;
    }

    public void a(TH0 th0, CV0 cv0, C1665Nc1 c1665Nc1, String str, int i, int i2, boolean z, int i3, int i4, int i5, int i6, RH0 rh0) {
        C1458Lc1 c1458Lc1;
        C1458Lc1 c1458Lc12;
        CV0 cv02 = cv0;
        int length = str.length();
        float f = c1665Nc1.a;
        float f2 = c1665Nc1.b;
        float f3 = i3 + i5;
        float f4 = i4 + i6;
        C1458Lc1 c1458Lc13 = new C1458Lc1(0.0f, 0.0f);
        C1458Lc1 c1458Lc14 = new C1458Lc1(0.0f, 0.0f);
        char c = '\n';
        if (!z) {
            float fB = f2;
            float f5 = f;
            int i7 = i2;
            while (i7 < length) {
                char cCharAt = str.charAt(i7);
                if (cCharAt == c) {
                    fB += cv02.b();
                    f5 = f;
                } else {
                    CV0.a aVarD = cv02.d(cCharAt);
                    c1458Lc13.a = aVarD.a / cv02.h().a;
                    c1458Lc13.b = aVarD.b / cv02.h().b;
                    c1458Lc14.a = (aVarD.a + aVarD.c) / cv02.h().a;
                    c1458Lc14.b = (aVarD.b + aVarD.d) / cv02.h().b;
                    C1458Lc1 c1458Lc15 = c1458Lc13;
                    AbstractC5460ih abstractC5460ih = this.a;
                    float f6 = aVarD.e + f5;
                    float f7 = aVarD.f + fB;
                    float f8 = aVarD.d;
                    C1458Lc1 c1458Lc16 = c1458Lc14;
                    abstractC5460ih.n(th0, f6, f7 - f8, 1.0f, aVarD.c, f8, i, c1458Lc15, c1458Lc16, rh0, false);
                    c1458Lc13 = c1458Lc15;
                    c1458Lc14 = c1458Lc16;
                    f5 += aVarD.g;
                }
                i7++;
                c = '\n';
            }
            return;
        }
        float f9 = f;
        float fB2 = f2;
        int i8 = i2;
        while (i8 < length) {
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 == c) {
                fB2 += cv02.b();
                c1458Lc1 = c1458Lc13;
                c1458Lc12 = c1458Lc14;
            } else {
                CV0.a aVarD2 = cv02.d(cCharAt2);
                float f10 = i3 - f9;
                float f11 = i4 - fB2;
                float f12 = aVarD2.c;
                float f13 = (f12 + f9) - f3;
                float f14 = aVarD2.d;
                float f15 = (f14 + fB2) - f4;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f15 < 0.0f) {
                    f15 = 0.0f;
                }
                if (f10 > f12 || f13 > f12 || f11 > f14 || f15 > f14) {
                    c1458Lc1 = c1458Lc13;
                    c1458Lc12 = c1458Lc14;
                    f9 += aVarD2.g;
                } else {
                    float f16 = f9 + f10;
                    float f17 = f10;
                    float f18 = fB2 + f11;
                    float f19 = aVarD2.a + f17;
                    float f20 = aVarD2.b + f11;
                    float f21 = f12 - f13;
                    float f22 = f14 - f15;
                    c1458Lc13.a = f19 / cv0.h().a;
                    c1458Lc13.b = f20 / cv0.h().b;
                    c1458Lc14.a = (f19 + f21) / cv0.h().a;
                    c1458Lc14.b = (f20 + f22) / cv0.h().b;
                    c1458Lc1 = c1458Lc13;
                    c1458Lc12 = c1458Lc14;
                    this.a.n(th0, f16, f18, 1.0f, f21, f22, i, c1458Lc1, c1458Lc12, rh0, false);
                    f9 = f16 + aVarD2.g;
                }
            }
            i8++;
            cv02 = cv0;
            c1458Lc13 = c1458Lc1;
            c1458Lc14 = c1458Lc12;
            c = '\n';
        }
    }

    public C1561Mc1 b(CV0 cv0, String str) {
        float f = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            f += cv0.d(str.charAt(i)).g;
        }
        return new C1561Mc1((int) f, (int) cv0.b());
    }
}
