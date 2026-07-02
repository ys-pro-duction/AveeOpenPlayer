package com.daaw;

/* JADX INFO: renamed from: com.daaw.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3530bn {
    public static final long a(float f, float f2, float f3, float f4, AbstractC4933gn abstractC4933gn) {
        G10.g(abstractC4933gn, "colorSpace");
        float fE = abstractC4933gn.e(0);
        if (f <= abstractC4933gn.d(0) && fE <= f) {
            float fE2 = abstractC4933gn.e(1);
            if (f2 <= abstractC4933gn.d(1) && fE2 <= f2) {
                float fE3 = abstractC4933gn.e(2);
                if (f3 <= abstractC4933gn.d(2) && fE3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (abstractC4933gn.h()) {
                        return C2559Vm.j(C6724n91.c(C6724n91.c(C6724n91.c((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (abstractC4933gn.b() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int iC = abstractC4933gn.c();
                    if (iC == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sA = AbstractC3134aN.a(f);
                    return C2559Vm.j(C6724n91.c(C6724n91.c(C6724n91.c(C6724n91.c(C6724n91.c(C6724n91.c(C6724n91.c(AbstractC3134aN.a(f2)) & 65535) << 32) | C6724n91.c(C6724n91.c(C6724n91.c(sA) & 65535) << 48)) | C6724n91.c(C6724n91.c(C6724n91.c(AbstractC3134aN.a(f3)) & 65535) << 16)) | C6724n91.c(C6724n91.c(C6724n91.c((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | C6724n91.c(C6724n91.c(iC) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + abstractC4933gn).toString());
    }

    public static final long b(int i) {
        return C2559Vm.j(C6724n91.c(C6724n91.c(i) << 32));
    }

    public static final long c(long j) {
        return C2559Vm.j(C6724n91.c(C6724n91.c(C6724n91.c(j) & 4294967295L) << 32));
    }

    public static final long e(long j, long j2) {
        long jK = C2559Vm.k(j, C2559Vm.r(j2));
        float fP = C2559Vm.p(j2);
        float fP2 = C2559Vm.p(jK);
        float f = 1.0f - fP2;
        float f2 = (fP * f) + fP2;
        return a(f2 == 0.0f ? 0.0f : ((C2559Vm.t(jK) * fP2) + ((C2559Vm.t(j2) * fP) * f)) / f2, f2 == 0.0f ? 0.0f : ((C2559Vm.s(jK) * fP2) + ((C2559Vm.s(j2) * fP) * f)) / f2, f2 != 0.0f ? ((C2559Vm.q(jK) * fP2) + ((C2559Vm.q(j2) * fP) * f)) / f2 : 0.0f, f2, C2559Vm.r(j2));
    }

    public static final float[] f(long j) {
        return new float[]{C2559Vm.t(j), C2559Vm.s(j), C2559Vm.q(j), C2559Vm.p(j)};
    }

    public static final float g(long j) {
        AbstractC4933gn abstractC4933gnR = C2559Vm.r(j);
        if (AbstractC3808cn.e(abstractC4933gnR.f(), AbstractC3808cn.a.b())) {
            NQ nqL = ((C9002vJ0) abstractC4933gnR).l();
            return h((float) ((((Number) nqL.invoke(Double.valueOf(C2559Vm.t(j)))).doubleValue() * 0.2126d) + (((Number) nqL.invoke(Double.valueOf(C2559Vm.s(j)))).doubleValue() * 0.7152d) + (((Number) nqL.invoke(Double.valueOf(C2559Vm.q(j)))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC3808cn.h(abstractC4933gnR.f()))).toString());
    }

    public static final float h(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static final int i(long j) {
        AbstractC4933gn abstractC4933gnR = C2559Vm.r(j);
        if (abstractC4933gnR.h()) {
            return (int) C6724n91.c(j >>> 32);
        }
        float[] fArrF = f(j);
        AbstractC5212hn.i(abstractC4933gnR, null, 0, 3, null).a(fArrF);
        return ((int) ((fArrF[2] * 255.0f) + 0.5f)) | (((int) ((fArrF[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArrF[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrF[1] * 255.0f) + 0.5f)) << 8);
    }
}
