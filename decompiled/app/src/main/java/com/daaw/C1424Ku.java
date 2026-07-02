package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424Ku implements InterfaceC4216eF {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C1424Ku(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // com.daaw.InterfaceC4216eF
    public float a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float fB = b(this.a, this.c, f4);
                    if (Math.abs(f - fB) < 0.001f) {
                        return b(this.b, this.d, f4);
                    }
                    if (fB < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public final float b(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1424Ku)) {
            return false;
        }
        C1424Ku c1424Ku = (C1424Ku) obj;
        return this.a == c1424Ku.a && this.b == c1424Ku.b && this.c == c1424Ku.c && this.d == c1424Ku.d;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }
}
