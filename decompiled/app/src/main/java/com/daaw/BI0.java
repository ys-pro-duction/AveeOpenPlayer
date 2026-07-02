package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class BI0 {
    public final float a;
    public final float b;
    public final float c;

    public BI0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a(float f) {
        float f2 = f < 0.0f ? this.b : this.c;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (this.a / f2) * ((float) Math.sin((AbstractC8417tE0.k(f / this.a, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BI0)) {
            return false;
        }
        BI0 bi0 = (BI0) obj;
        return this.a == bi0.a && this.b == bi0.b && this.c == bi0.c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.a + ", factorAtMin=" + this.b + ", factorAtMax=" + this.c + ')';
    }
}
