package com.daaw;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public abstract class A5 {
    public static NQ a = a.B;

    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7526q21 invoke(InterfaceC5252hv0 interfaceC5252hv0) {
            G10.g(interfaceC5252hv0, "it");
            return new C7526q21(interfaceC5252hv0);
        }
    }

    public static final float c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    public static final EnumC7560q90 d(Configuration configuration) {
        G10.g(configuration, "<this>");
        return f(configuration.getLayoutDirection());
    }

    public static final NQ e() {
        return a;
    }

    public static final EnumC7560q90 f(int i) {
        return i != 0 ? i != 1 ? EnumC7560q90.Ltr : EnumC7560q90.Rtl : EnumC7560q90.Ltr;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float fC = c(fArr2, 0, fArr, 0);
        float fC2 = c(fArr2, 0, fArr, 1);
        float fC3 = c(fArr2, 0, fArr, 2);
        float fC4 = c(fArr2, 0, fArr, 3);
        float fC5 = c(fArr2, 1, fArr, 0);
        float fC6 = c(fArr2, 1, fArr, 1);
        float fC7 = c(fArr2, 1, fArr, 2);
        float fC8 = c(fArr2, 1, fArr, 3);
        float fC9 = c(fArr2, 2, fArr, 0);
        float fC10 = c(fArr2, 2, fArr, 1);
        float fC11 = c(fArr2, 2, fArr, 2);
        float fC12 = c(fArr2, 2, fArr, 3);
        float fC13 = c(fArr2, 3, fArr, 0);
        float fC14 = c(fArr2, 3, fArr, 1);
        float fC15 = c(fArr2, 3, fArr, 2);
        float fC16 = c(fArr2, 3, fArr, 3);
        fArr[0] = fC;
        fArr[1] = fC2;
        fArr[2] = fC3;
        fArr[3] = fC4;
        fArr[4] = fC5;
        fArr[5] = fC6;
        fArr[6] = fC7;
        fArr[7] = fC8;
        fArr[8] = fC9;
        fArr[9] = fC10;
        fArr[10] = fC11;
        fArr[11] = fC12;
        fArr[12] = fC13;
        fArr[13] = fC14;
        fArr[14] = fC15;
        fArr[15] = fC16;
    }
}
