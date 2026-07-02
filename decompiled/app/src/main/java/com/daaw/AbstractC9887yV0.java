package com.daaw;

/* JADX INFO: renamed from: com.daaw.yV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9887yV0 {

    /* JADX INFO: renamed from: com.daaw.yV0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ double B;
        public final /* synthetic */ double C;
        public final /* synthetic */ double D;
        public final /* synthetic */ double E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d, double d2, double d3, double d4) {
            super(1);
            this.B = d;
            this.C = d2;
            this.D = d3;
            this.E = d4;
        }

        public final Double a(double d) {
            return Double.valueOf(((this.B + (this.C * d)) * Math.exp(this.D * d)) + this.E);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.yV0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ double B;
        public final /* synthetic */ double C;
        public final /* synthetic */ double D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d, double d2, double d3) {
            super(1);
            this.B = d;
            this.C = d2;
            this.D = d3;
        }

        public final Double a(double d) {
            double d2 = this.B;
            double d3 = this.C;
            return Double.valueOf(((d2 * ((d3 * d) + ((double) 1))) + (this.D * d3)) * Math.exp(d3 * d));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.yV0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ double B;
        public final /* synthetic */ double C;
        public final /* synthetic */ double D;
        public final /* synthetic */ double E;
        public final /* synthetic */ double F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d, double d2, double d3, double d4, double d5) {
            super(1);
            this.B = d;
            this.C = d2;
            this.D = d3;
            this.E = d4;
            this.F = d5;
        }

        public final Double a(double d) {
            return Double.valueOf((this.B * Math.exp(this.C * d)) + (this.D * Math.exp(this.E * d)) + this.F);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.yV0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ double B;
        public final /* synthetic */ double C;
        public final /* synthetic */ double D;
        public final /* synthetic */ double E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(double d, double d2, double d3, double d4) {
            super(1);
            this.B = d;
            this.C = d2;
            this.D = d3;
            this.E = d4;
        }

        public final Double a(double d) {
            double d2 = this.B;
            double d3 = this.C;
            double dExp = d2 * d3 * Math.exp(d3 * d);
            double d4 = this.D;
            double d5 = this.E;
            return Double.valueOf(dExp + (d4 * d5 * Math.exp(d5 * d)));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    public static final long a(double d2, double d3, double d4, double d5, double d6) {
        return f(AbstractC2875Yn.a(1.0d, 2.0d * d3 * Math.sqrt(d2), d2), d3, d4, d5, d6);
    }

    public static final long b(float f, float f2, float f3, float f4, float f5) {
        return a(f, f2, f3, f4, f5);
    }

    public static final double c(C0576Cs0 c0576Cs0, double d2, double d3, double d4) {
        double d5 = d4;
        double dF = ((C2771Xn) c0576Cs0.c()).f();
        double d6 = dF * d2;
        double d7 = d3 - d6;
        double dLog = Math.log(Math.abs(d5 / d2)) / dF;
        double d8 = d(Math.log(Math.abs(d5 / d7)), dF) / dF;
        int i = 0;
        if ((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true) {
            if ((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true) {
                dLog = Math.max(dLog, d8);
            }
            d8 = dLog;
        }
        double d9 = (-(d6 + d7)) / (dF * d7);
        if (Double.isNaN(d9) || d9 <= 0.0d) {
            d5 = -d5;
        } else if (d9 <= 0.0d || (-e(d2, dF, d9, d7)) >= d5) {
            d8 = (-(2.0d / dF)) - (d2 / d7);
        } else {
            if (d7 < 0.0d && d2 > 0.0d) {
                d8 = 0.0d;
            }
            d5 = -d5;
        }
        double d10 = d8;
        a aVar = new a(d2, d7, dF, d5);
        b bVar = new b(d7, dF, d2);
        double d11 = Double.MAX_VALUE;
        while (d11 > 0.001d && i < 100) {
            i++;
            double dDoubleValue = d10 - (((Number) aVar.invoke(Double.valueOf(d10))).doubleValue() / ((Number) bVar.invoke(Double.valueOf(d10))).doubleValue());
            double dAbs = Math.abs(d10 - dDoubleValue);
            d10 = dDoubleValue;
            d11 = dAbs;
        }
        return d10;
    }

    public static final double d(double d2, double d3) {
        int i = 0;
        double dLog = d2;
        while (i < 6) {
            i++;
            dLog = d2 - Math.log(Math.abs(dLog / d3));
        }
        return dLog;
    }

    public static final double e(double d2, double d3, double d4, double d5) {
        double d6 = d3 * d4;
        return (d2 * Math.exp(d6)) + (d5 * d4 * Math.exp(d6));
    }

    public static final long f(C0576Cs0 c0576Cs0, double d2, double d3, double d4, double d5) {
        if (d4 == 0.0d && d3 == 0.0d) {
            return 0L;
        }
        if (d4 < 0.0d) {
            d3 = -d3;
        }
        double d6 = d3;
        double dAbs = Math.abs(d4);
        return (long) ((d2 > 1.0d ? g(c0576Cs0, dAbs, d6, d5) : d2 < 1.0d ? i(c0576Cs0, dAbs, d6, d5) : c(c0576Cs0, dAbs, d6, d5)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final double g(com.daaw.C0576Cs0 r24, double r25, double r27, double r29) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9887yV0.g(com.daaw.Cs0, double, double, double):double");
    }

    public static final double h(double d2, double d3, double d4, double d5, double d6) {
        return (d2 * Math.exp(d3 * d4)) + (d5 * Math.exp(d6 * d4));
    }

    public static final double i(C0576Cs0 c0576Cs0, double d2, double d3, double d4) {
        double dF = ((C2771Xn) c0576Cs0.c()).f();
        double dE = (d3 - (dF * d2)) / ((C2771Xn) c0576Cs0.c()).e();
        return Math.log(d4 / Math.sqrt((d2 * d2) + (dE * dE))) / dF;
    }
}
