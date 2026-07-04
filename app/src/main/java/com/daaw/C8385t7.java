package com.daaw;

/* JADX INFO: renamed from: com.daaw.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8385t7 extends AbstractC8664u7 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e;

    public C8385t7(float f, float f2, float f3, float f4) {
        super(null);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = 4;
    }

    @Override // com.daaw.AbstractC8664u7
    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // com.daaw.AbstractC8664u7
    public int b() {
        return this.e;
    }

    @Override // com.daaw.AbstractC8664u7
    public void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // com.daaw.AbstractC8664u7
    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8385t7)) {
            return false;
        }
        C8385t7 c8385t7 = (C8385t7) obj;
        return c8385t7.a == this.a && c8385t7.b == this.b && c8385t7.c == this.c && c8385t7.d == this.d;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    public final float h() {
        return this.c;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final float i() {
        return this.d;
    }

    @Override // com.daaw.AbstractC8664u7
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C8385t7 c() {
        return new C8385t7(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
