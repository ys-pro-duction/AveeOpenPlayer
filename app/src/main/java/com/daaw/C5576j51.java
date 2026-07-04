package com.daaw;

/* JADX INFO: renamed from: com.daaw.j51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5576j51 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public C5576j51(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.b;
    }

    public final double b() {
        return this.c;
    }

    public final double c() {
        return this.d;
    }

    public final double d() {
        return this.e;
    }

    public final double e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5576j51)) {
            return false;
        }
        C5576j51 c5576j51 = (C5576j51) obj;
        return G10.c(Double.valueOf(this.a), Double.valueOf(c5576j51.a)) && G10.c(Double.valueOf(this.b), Double.valueOf(c5576j51.b)) && G10.c(Double.valueOf(this.c), Double.valueOf(c5576j51.c)) && G10.c(Double.valueOf(this.d), Double.valueOf(c5576j51.d)) && G10.c(Double.valueOf(this.e), Double.valueOf(c5576j51.e)) && G10.c(Double.valueOf(this.f), Double.valueOf(c5576j51.f)) && G10.c(Double.valueOf(this.g), Double.valueOf(c5576j51.g));
    }

    public final double f() {
        return this.g;
    }

    public final double g() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((AbstractC2667Wn.a(this.a) * 31) + AbstractC2667Wn.a(this.b)) * 31) + AbstractC2667Wn.a(this.c)) * 31) + AbstractC2667Wn.a(this.d)) * 31) + AbstractC2667Wn.a(this.e)) * 31) + AbstractC2667Wn.a(this.f)) * 31) + AbstractC2667Wn.a(this.g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    public /* synthetic */ C5576j51(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, AbstractC2911Yw abstractC2911Yw) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
