package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class U73 {
    public static final U73 j = new U73(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final U73 k = new U73(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final U73 l = new U73(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final U73 m = new U73(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;

    public U73(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d5;
        this.b = d6;
        this.c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d8;
        this.i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U73.class != obj.getClass()) {
            return false;
        }
        U73 u73 = (U73) obj;
        return Double.compare(u73.d, this.d) == 0 && Double.compare(u73.e, this.e) == 0 && Double.compare(u73.f, this.f) == 0 && Double.compare(u73.g, this.g) == 0 && Double.compare(u73.h, this.h) == 0 && Double.compare(u73.i, this.i) == 0 && Double.compare(u73.a, this.a) == 0 && Double.compare(u73.b, this.b) == 0 && Double.compare(u73.c, this.c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        long j3 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        long j4 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.d);
        long j5 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.e);
        long j6 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f);
        long j7 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.h);
        long j8 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j2) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j8)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        double d5 = this.e;
        double d6 = this.f;
        double d7 = this.g;
        double d8 = this.h;
        double d9 = this.i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
