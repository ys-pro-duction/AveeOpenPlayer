package com.daaw;

/* JADX INFO: renamed from: com.daaw.sS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8193sS implements Comparable {
    public final double B;
    public final double C;

    public C8193sS(double d, double d2) {
        if (Double.isNaN(d) || d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d2) || d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.B = d;
        this.C = d2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C8193sS c8193sS) {
        int iK = AbstractC6838nb1.k(this.B, c8193sS.B);
        return iK == 0 ? AbstractC6838nb1.k(this.C, c8193sS.C) : iK;
    }

    public double c() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8193sS)) {
            return false;
        }
        C8193sS c8193sS = (C8193sS) obj;
        return this.B == c8193sS.B && this.C == c8193sS.C;
    }

    public double g() {
        return this.C;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.B);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.C);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.B + ", longitude=" + this.C + " }";
    }
}
