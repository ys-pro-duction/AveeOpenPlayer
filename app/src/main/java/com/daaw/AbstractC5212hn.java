package com.daaw;

import com.daaw.AbstractC3808cn;
import com.daaw.C1615Mq;

/* JADX INFO: renamed from: com.daaw.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5212hn {
    public static final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(n(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(p(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final AbstractC4933gn c(AbstractC4933gn abstractC4933gn, C2433Ug1 c2433Ug1, V2 v2) {
        G10.g(abstractC4933gn, "<this>");
        G10.g(c2433Ug1, "whitePoint");
        G10.g(v2, "adaptation");
        if (AbstractC3808cn.e(abstractC4933gn.f(), AbstractC3808cn.a.b())) {
            C9002vJ0 c9002vJ0 = (C9002vJ0) abstractC4933gn;
            if (!f(c9002vJ0.r(), c2433Ug1)) {
                return new C9002vJ0(c9002vJ0, k(e(v2.b(), c9002vJ0.r().c(), c2433Ug1.c()), c9002vJ0.q()), c2433Ug1);
            }
        }
        return abstractC4933gn;
    }

    public static /* synthetic */ AbstractC4933gn d(AbstractC4933gn abstractC4933gn, C2433Ug1 c2433Ug1, V2 v2, int i, Object obj) {
        if ((i & 2) != 0) {
            v2 = V2.b.a();
        }
        return c(abstractC4933gn, c2433Ug1, v2);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        G10.g(fArr, "matrix");
        G10.g(fArr2, "srcWhitePoint");
        G10.g(fArr3, "dstWhitePoint");
        float[] fArrM = m(fArr, fArr2);
        float[] fArrM2 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{fArrM2[0] / fArrM[0], fArrM2[1] / fArrM[1], fArrM2[2] / fArrM[2]}, fArr));
    }

    public static final boolean f(C2433Ug1 c2433Ug1, C2433Ug1 c2433Ug12) {
        G10.g(c2433Ug1, "a");
        G10.g(c2433Ug12, "b");
        if (c2433Ug1 == c2433Ug12) {
            return true;
        }
        return Math.abs(c2433Ug1.a() - c2433Ug12.a()) < 0.001f && Math.abs(c2433Ug1.b() - c2433Ug12.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        G10.g(fArr, "a");
        G10.g(fArr2, "b");
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final C1615Mq h(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, int i) {
        G10.g(abstractC4933gn, "$this$connect");
        G10.g(abstractC4933gn2, "destination");
        if (abstractC4933gn == abstractC4933gn2) {
            return C1615Mq.g.c(abstractC4933gn);
        }
        long jF = abstractC4933gn.f();
        AbstractC3808cn.a aVar = AbstractC3808cn.a;
        AbstractC2911Yw abstractC2911Yw = null;
        return (AbstractC3808cn.e(jF, aVar.b()) && AbstractC3808cn.e(abstractC4933gn2.f(), aVar.b())) ? new C1615Mq.b((C9002vJ0) abstractC4933gn, (C9002vJ0) abstractC4933gn2, i, abstractC2911Yw) : new C1615Mq(abstractC4933gn, abstractC4933gn2, i, abstractC2911Yw);
    }

    public static /* synthetic */ C1615Mq i(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC4933gn2 = C5490in.a.r();
        }
        if ((i2 & 2) != 0) {
            i = VG0.a.b();
        }
        return h(abstractC4933gn, abstractC4933gn2, i);
    }

    public static final float[] j(float[] fArr) {
        G10.g(fArr, "m");
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        G10.g(fArr, "lhs");
        G10.g(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        G10.g(fArr, "lhs");
        G10.g(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        G10.g(fArr, "lhs");
        G10.g(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final double n(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double o(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double p(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static final double q(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }
}
