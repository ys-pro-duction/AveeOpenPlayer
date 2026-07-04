package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ug1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2433Ug1 {
    public final float a;
    public final float b;

    public C2433Ug1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float[] c() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2433Ug1)) {
            return false;
        }
        C2433Ug1 c2433Ug1 = (C2433Ug1) obj;
        return G10.c(Float.valueOf(this.a), Float.valueOf(c2433Ug1.a)) && G10.c(Float.valueOf(this.b), Float.valueOf(c2433Ug1.b));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ')';
    }
}
