package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2875Yn {
    public static final C0576Cs0 a(double d, double d2, double d3) {
        double d4 = -d2;
        double d5 = (d2 * d2) - ((4.0d * d) * d3);
        C2771Xn c2771XnB = b(d5);
        c2771XnB.a += d4;
        double d6 = d * 2.0d;
        c2771XnB.a /= d6;
        c2771XnB.b /= d6;
        C2771Xn c2771XnB2 = b(d5);
        double d7 = -1;
        c2771XnB2.a *= d7;
        c2771XnB2.b *= d7;
        c2771XnB2.a += d4;
        c2771XnB2.a /= d6;
        c2771XnB2.b /= d6;
        return D61.a(c2771XnB, c2771XnB2);
    }

    public static final C2771Xn b(double d) {
        return d < 0.0d ? new C2771Xn(0.0d, Math.sqrt(Math.abs(d))) : new C2771Xn(Math.sqrt(d), 0.0d);
    }
}
