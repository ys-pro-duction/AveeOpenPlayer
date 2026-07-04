package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class FE {
    public static double a(double d) {
        double d2 = d * d;
        double d3 = d2 * d * d;
        double dLog = (Math.log((1.562339d * d3) / ((11589.0930520225d + d2) * (544440.6704605728d + d2))) * 10.0d) / Math.log(10.0d);
        double d4 = 424.31867740600904d + d2;
        double d5 = d2 + 1.4869900140839997E8d;
        double dLog2 = dLog + ((Math.log((d3 * 2.242881E16d) / (((d4 * d4) * d5) * d5)) * 10.0d) / Math.log(10.0d));
        if (Double.isNaN(dLog2) || Double.isInfinite(dLog2)) {
            return 0.0d;
        }
        return dLog2;
    }

    public static double b(double d, double d2, double d3) {
        return (d + 1.0d) * (d3 / d2);
    }

    public static double c(double d) {
        double dMin = Math.min(d, 1000.0d);
        double d2 = dMin * dMin;
        return (((d2 * dMin) * dMin) * 1.4884E8d) / ((((424.36000000000007d + d2) * (1.4884E8d + d2)) * Math.sqrt(11599.29d + d2)) * Math.sqrt(d2 + 544496.4099999999d));
    }
}
