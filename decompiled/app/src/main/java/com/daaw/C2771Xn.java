package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2771Xn {
    public double a;
    public double b;

    public C2771Xn(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2771Xn)) {
            return false;
        }
        C2771Xn c2771Xn = (C2771Xn) obj;
        return G10.c(Double.valueOf(this.a), Double.valueOf(c2771Xn.a)) && G10.c(Double.valueOf(this.b), Double.valueOf(c2771Xn.b));
    }

    public final double f() {
        return this.a;
    }

    public int hashCode() {
        return (AbstractC2667Wn.a(this.a) * 31) + AbstractC2667Wn.a(this.b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
