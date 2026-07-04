package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ax0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0388Ax0 {
    public final List a;
    public final float b;

    public C0388Ax0(List list, float f) {
        G10.g(list, "coefficients");
        this.a = list;
        this.b = f;
    }

    public final List a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0388Ax0)) {
            return false;
        }
        C0388Ax0 c0388Ax0 = (C0388Ax0) obj;
        return G10.c(this.a, c0388Ax0.a) && G10.c(Float.valueOf(this.b), Float.valueOf(c0388Ax0.b));
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.a + ", confidence=" + this.b + ')';
    }
}
