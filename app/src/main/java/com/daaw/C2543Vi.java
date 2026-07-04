package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2543Vi {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public C2543Vi(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static C2543Vi b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        C2543Vi c2543Vi = null;
        float f6 = 1000.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f4) > 0.01f) {
            float f8 = ((f4 - f7) / 2.0f) + f7;
            int iP = e(f8, f2, f).p();
            float fB = AbstractC2647Wi.b(iP);
            float fAbs = Math.abs(f3 - fB);
            if (fAbs < 0.2f) {
                C2543Vi c2543ViC = c(iP);
                float fA = c2543ViC.a(e(c2543ViC.k(), c2543ViC.i(), f));
                if (fA <= 1.0f) {
                    c2543Vi = c2543ViC;
                    f5 = fAbs;
                    f6 = fA;
                }
            }
            if (f5 == 0.0f && f6 == 0.0f) {
                return c2543Vi;
            }
            if (fB < f3) {
                f7 = f8;
            } else {
                f4 = f8;
            }
        }
        return c2543Vi;
    }

    public static C2543Vi c(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i, C6012kf1.k, fArr, fArr2);
        return new C2543Vi(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i, C6012kf1 c6012kf1, float[] fArr, float[] fArr2) {
        AbstractC2647Wi.f(i, fArr2);
        float[][] fArr3 = AbstractC2647Wi.a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = c6012kf1.i()[0] * f6;
        float f10 = c6012kf1.i()[1] * f7;
        float f11 = c6012kf1.i()[2] * f8;
        float fPow = (float) Math.pow(((double) (c6012kf1.c() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c6012kf1.c() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c6012kf1.c() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * c6012kf1.f()) / c6012kf1.a(), c6012kf1.b() * c6012kf1.j())) * 100.0f;
        float fB = (4.0f / c6012kf1.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c6012kf1.a() + 4.0f) * c6012kf1.d();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c6012kf1.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c6012kf1.g()) * c6012kf1.h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fD = c6012kf1.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * c6012kf1.b()) / (c6012kf1.a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    public static C2543Vi e(float f, float f2, float f3) {
        return f(f, f2, f3, C6012kf1.k);
    }

    public static C2543Vi f(float f, float f2, float f3, C6012kf1 c6012kf1) {
        float fB = (4.0f / c6012kf1.b()) * ((float) Math.sqrt(((double) f) / 100.0d)) * (c6012kf1.a() + 4.0f) * c6012kf1.d();
        float fD = c6012kf1.d() * f2;
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * c6012kf1.b()) / (c6012kf1.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C2543Vi(f3, f2, f, fB, fD, fSqrt, f4, ((float) Math.cos(d)) * fLog, fLog * ((float) Math.sin(d)));
    }

    public static int m(float f, float f2, float f3) {
        return n(f, f2, f3, C6012kf1.k);
    }

    public static int n(float f, float f2, float f3, C6012kf1 c6012kf1) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return AbstractC2647Wi.a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        C2543Vi c2543Vi = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C2543Vi c2543ViB = b(fMin, f4, f3);
            if (!z) {
                if (c2543ViB == null) {
                    f2 = f4;
                } else {
                    f5 = f4;
                    c2543Vi = c2543ViB;
                }
                f4 = ((f2 - f5) / 2.0f) + f5;
            } else {
                if (c2543ViB != null) {
                    return c2543ViB.o(c6012kf1);
                }
                f4 = ((f2 - f5) / 2.0f) + f5;
                z = false;
            }
        }
        return c2543Vi == null ? AbstractC2647Wi.a(f3) : c2543Vi.o(c6012kf1);
    }

    public float a(C2543Vi c2543Vi) {
        float fL = l() - c2543Vi.l();
        float fG = g() - c2543Vi.g();
        float fH = h() - c2543Vi.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public int o(C6012kf1 c6012kf1) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c6012kf1.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = c6012kf1.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) c6012kf1.b())) / ((double) c6012kf1.j())));
        float fG = fCos * 3846.1538f * c6012kf1.g() * c6012kf1.h();
        float f = fA / c6012kf1.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f2 = (((0.305f + f) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f3 = fCos2 * f2;
        float f4 = f2 * fSin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float fSignum = Math.signum(f6) * (100.0f / c6012kf1.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f7) * (100.0f / c6012kf1.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / c6012kf1.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f8 = fSignum / c6012kf1.i()[0];
        float f9 = fSignum2 / c6012kf1.i()[1];
        float f10 = fSignum3 / c6012kf1.i()[2];
        float[][] fArr = AbstractC2647Wi.b;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return AbstractC6338ln.d(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    public int p() {
        return o(C6012kf1.k);
    }
}
